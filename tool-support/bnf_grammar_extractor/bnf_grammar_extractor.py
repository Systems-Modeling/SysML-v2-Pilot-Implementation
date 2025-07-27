"""
EBNF and GBNF Grammar Extractor for KerML and SysML specifications in HTML format

@author: Hans Peter de Koning (DEKonsult)

Note: Needs package beautifulsoup4 (See https://pypi.org/project/beautifulsoup4/)

"""
import sys
import re
from datetime import datetime, timezone
from dataclasses import dataclass
from enum import Enum, auto
from textwrap import wrap
from typing import Optional, Iterable, Any

from bs4 import BeautifulSoup, Tag, NavigableString, PageElement

from lark import Lark, Transformer, Tree, UnexpectedInput

# Create logger for debug, info, warning, error, critical messages
import logging
logging.basicConfig(level=logging.INFO, format="%(levelname)-8s: %(message)s")
LOGGER = logging.getLogger()

LINE_COMMENT_MARKER = "//"  # Can be changed to e.g. "#"


def line_comment(text: str, add_newline: bool = True):
    newline = "\n" if add_newline else ""
    return f"{LINE_COMMENT_MARKER} {text}{newline}"


def block_comment(texts: list[str], add_newline: bool = True):
    formatted_text = f'\n{LINE_COMMENT_MARKER} '.join(texts)
    text = f"{LINE_COMMENT_MARKER} {formatted_text}\n"
    if add_newline:
        text += "\n"
    return text


def report_non_ascii(text: str):
    is_ascii = text is None or text.isascii()
    if not is_ascii:
        non_ascii_chars: set[str] = set()
        for ch in text:
            if not ch.isascii():
                non_ascii_chars.add(ch)
        LOGGER.warning(f"Found non-ASCII characters: {sorted(non_ascii_chars)}")


def clean_text_content(text: Optional[str], correct_comma_dot: bool = False) -> str:
    """Replace non-braking space and zero-width space with regular space and strip tail end"""
    if text is None:
        text = ""
    text = text.replace(" ", " ").replace("​", " ")
    if correct_comma_dot:
        text = text.replace(" ,", ",")
        text = text.replace(" .", ".")
    # text = text.rstrip()

    # Replace leading space(s) followed by newline(s) with a single newline
    LEADING_WHITESPACE_NEWLINE_PATTERN = re.compile(r"^ +\n+")
    text = LEADING_WHITESPACE_NEWLINE_PATTERN.sub("\n", text)

    return text


def clean_line(line: str) -> str:
    """ Replace non-braking space with regular space and strip tail end """
    line = line.replace(" ", " ").replace("​", " ")
    return line.rstrip()


def is_pascal_case(text: str) -> bool:
    pascal_PATTERN = re.compile(r"^[A-Z][a-z][A-Za-z]*$")
    return len(text) > 1 and pascal_PATTERN.fullmatch(text)


def is_upper_snake_case(text: str) -> bool:
    upper_snake_PATTERN = re.compile(r"^[A-Z][A-Z_]+$")
    return len(text) > 1 and upper_snake_PATTERN.fullmatch(text)


def is_lower_kebab_case(text: str) -> bool:
    lower_kebab_PATTERN = re.compile(r"^[a-z][a-z0-9-]+$")
    return len(text) > 1 and lower_kebab_PATTERN.fullmatch(text)


class TokenKind(Enum):
    TERMINAL = auto()
    NONTERMINAL = auto()
    NOTE = auto()
    EQUALS = auto()
    COLON = auto()
    IMAGE = auto()
    INTERPUNCTION = auto()
    WHITESPACE = auto()
    LINE_COMMENT = auto()


@dataclass
class Token:
    kind: TokenKind = None
    text: str = ""


@dataclass
class Grammar:
    name: str
    prod_names: set[str]


@dataclass
class GrammarElement:
    clause_id: str
    lines: list[str]

    def get_txt(self) -> str:
        rendered_lines = "\n".join(self.lines)
        return f"{rendered_lines}\n\n"

    def get_html(self, extractor: "GrammarExtractor") -> str:
        rendered_lines = "\n".join(self.lines)
        return f"<pre>\n{rendered_lines}\n\n</pre>\n"


@dataclass
class Heading(GrammarElement):
    def get_txt(self) -> str:
        assert len(self.lines) == 1
        return f"{line_comment(self.lines[0])}\n"

    def get_html(self, extractor: "GrammarExtractor") -> str:
        assert len(self.lines) == 1
        if self.clause_id:
            anchor = f'<a id="{self.clause_id}"/>\n'
            level = self.clause_id.count(".") + 1
        else:
            anchor = ""
            level = 1
        html_string = f'{anchor}<h{level}>{LINE_COMMENT_MARKER} {self.lines[0]}</h{level}>\n'
        return html_string


@dataclass
class Production(GrammarElement):
    name: str
    abstract_syntax_type: str

    def get_txt(self) -> str:
        rendered_lines = "\n".join(self.lines)
        return f"{rendered_lines}\n\n"

    def get_html(self, extractor: "GrammarExtractor") -> str:
        html_lines: list[str] = []
        for line in self.lines:
            pieces = []
            tokens = extractor.tokenize(line)
            for token in tokens:
                is_hyperlink_resolved = False
                if token.kind == TokenKind.NONTERMINAL:
                    if token.text == self.name:
                        # Do not link to own production
                        pass
                    elif token.text == self.abstract_syntax_type:
                        # Do not link to abstract syntax term
                        pass
                    else:
                        # Try to resolve hyperlink to identifier in reverse order of known grammars
                        for grammar in reversed(extractor.grammars):
                            if token.text in grammar.prod_names:
                                # Production declaration found, so add hyperlink to declaration anchor
                                # The hyperlink works if other HTML grammar files are in the same directory
                                html_path = "" if grammar.name == extractor.bnf_path else f"{grammar.name}.html"
                                # Append "_" to all uppercase tokens because anchor id is not case-sensitive
                                anchor_id = f"{token.text}_" if token.text.isupper() else token.text
                                pieces.append(f'<a href="{html_path}#{anchor_id}">{token.text}</a>')
                                is_hyperlink_resolved = True
                                break
                if not is_hyperlink_resolved:
                    pieces.append(token.text)
            html_lines.append("".join(pieces))
        rendered_lines = "\n".join(html_lines)
        # Append "_" to all uppercase tokens because anchor id is not case-sensitive
        # so to avoid name collisions between PascalCase and UPPER_SNAKE_CASE identifiers
        anchor_id = f"{self.name}_" if self.name.isupper() else self.name
        production_anchor = f'<a id="{anchor_id}" />'
        return f"{production_anchor}<pre>\n{rendered_lines}\n</pre>\n"



@dataclass
class Image(GrammarElement):
    def get_txt(self) -> str:
        rendered_lines = "\n".join(self.lines)
        return f"{rendered_lines}\n"

    def get_html(self, extractor: "GrammarExtractor") -> str:
        rendered_lines = "\n".join(self.lines)
        return f"{rendered_lines}\n"


@dataclass
class NoteRef(GrammarElement):
    def get_txt(self) -> str:
        rendered_lines = "".join(self.lines)
        return f"{line_comment(rendered_lines)}\n"

    def get_html(self, extractor: "GrammarExtractor") -> str:
        rendered_lines = "".join(self.lines)
        return f"<p>{line_comment(rendered_lines, False)}</p>\n"


@dataclass
class NoteList(GrammarElement):
    html_snippets: list[PageElement]

    def get_txt(self) -> str:
        rendered_lines = ["Notes:"] + self.lines
        return block_comment(rendered_lines)

    def get_html(self, extractor: "GrammarExtractor") -> str:
        html_lines = [f"<p>{LINE_COMMENT_MARKER} <strong>Notes:</strong></p>"]
        html_lines.extend([str(x) for x in self.html_snippets])
        rendered_lines = "\n".join(html_lines)
        rendered_lines = rendered_lines.replace(" ", " ").replace("​", " ")
        return f"{rendered_lines}\n"


class GrammarExtractor:
    def __init__(self):
        self.start_timestamp = datetime.now(timezone.utc).isoformat(timespec="seconds").replace("+00:00", "Z")
        self.spec_path: str = ""
        self.spec_path_previous: Optional[str] = None
        self.soup: Optional[BeautifulSoup] = None
        self.spec_title = ""
        self.bnf_clause_id: str = ""
        self.bnf_path: str = ""
        self.bnf_mode: str = ""
        self.elements: list[GrammarElement] = []
        self.grammars: list[Grammar] = []
        self.reserved_keyword_set: set[str] = set()
        self.extracted_keyword_set: set[str] = set()
        self.reserved_symbol_set: set[str] = set()
        self.extracted_symbol_set: set[str] = set()
        self.parser: Optional[Lark] = None

    def extract_bnf(self, spec_path: str, bnf_clause_id: str, bnf_mode: str):
        if bnf_mode == "textual":
            self.bnf_mode = bnf_mode
            self.bnf_path = spec_path.replace(".html", "-ebnf")
            self.parser = Lark.open("kerml_sysml_textual_grammar.lark", rel_to=__file__, parser="lalr")
        elif bnf_mode == "graphical":
            self.bnf_mode = bnf_mode
            self.bnf_path = spec_path.replace(".html", "-gbnf")
            self.parser = Lark.open("sysml_graphical_grammar.lark", rel_to=__file__, parser="lalr")
        else:
            LOGGER.critical(f"Unsupported BNF mode: {bnf_mode}, terminating ...\n")
            usage()
            sys.exit(1)

        self.spec_path = spec_path
        self.bnf_clause_id = bnf_clause_id
        self.spec_title = ""
        self.elements = []
        self.grammars.append(Grammar(self.bnf_path, set()))
        self.reserved_keyword_set = set()
        self.extracted_keyword_set = set()
        self.reserved_symbol_set = set()
        self.extracted_symbol_set = set()

        LOGGER.info(20 * "=")
        LOGGER.info(f"Extract BNF from {self.spec_path} clause={self.bnf_clause_id} mode={bnf_mode} at {self.start_timestamp}")
        LOGGER.info(20 * "=")

        KEYWORD_PATTERN = re.compile(r"('[a-z]{2,}')")
        SYMBOL_PATTERN = re.compile(r"('[^A-Za-z\s]+')")

        if self.spec_path == self.spec_path_previous:
            # Skip reparsing the HTML spec and reuse self.soup
            pass
        else:
            with open(self.spec_path, mode="r", encoding="utf-8") as html_spec:
                self.soup = BeautifulSoup(html_spec, "html.parser")

        inside_bnf_clause = False
        contains_note_reference = False
        contains_notes_section = False
        contains_pre_tag = False
        count = 0
        clause_id = ""
        clause_title = ""

        # Walk through all HTML elements (tags) and extract
        # - clause headings
        # - grammar productions and notes from the given textual or graphical notation clause
        for tag in self.soup.find_all(name=["h1", "pre", "p", "ol"], recursive=True):
            count += 1
            LOGGER.debug(f"Visit tag #{count} {tag.name}")
            sys.stdout.flush()

            if tag.name == "h1":
                # Process clause heading
                contains_note_reference = False
                contains_notes_section = False
                contains_pre_tag = False
                # LOGGER.debug(f"tag{count}={tag}")

                class_attribute = tag.attrs.get("class")
                if class_attribute and "view-title" in class_attribute:
                    # LOGGER.debug(f"view-title tag={tag}")
                    clause_id = tag.find("span", {"class": "ve-view-number"}).string
                    clause_id = clause_id.strip() if clause_id else ""
                    clause_title = tag.find("transclude-name").find("span").string
                    clause_title = clause_title.strip() if clause_title else ""

                    if clause_id == self.bnf_clause_id:
                        inside_bnf_clause = True
                    elif inside_bnf_clause and not clause_id.startswith(self.bnf_clause_id):
                        inside_bnf_clause = False

                    if inside_bnf_clause or clause_id == "":
                        if clause_id == "":
                            clause_string = clause_title
                            self.spec_title = clause_title
                        else:
                            clause_string = f"Clause {clause_id} {clause_title}"

                        LOGGER.info(f"PROCESSING {clause_string}")
                        self.elements.append(Heading(clause_id, [clause_string]))

            elif tag.name == "pre" and inside_bnf_clause and tag.parent.name != "li":
                # Process a <pre> element that contains BNF grammar lines
                LOGGER.debug(f"tag#{count}:\n{tag}")
                contains_pre_tag = True

                child_strings: list[str] = []
                for child in tag.children:
                    if isinstance(child, Tag) and child.name == "img":
                        # Rewrite <img .../> elements
                        alt_attr = child.attrs.get("alt")
                        height_attr = child.attrs.get("height")
                        width_attr = child.attrs.get("width")
                        src_attr = child.attrs.get("src")
                        # Strip the query parameter ?token=...
                        src_attr = src_attr.split("?", 1)[0]
                        child_strings.append(f'<img alt="{alt_attr}" height="{height_attr}" width="{width_attr}" src="SRC_VALUE"/> {LINE_COMMENT_MARKER} orig_src="{src_attr}"')
                    elif child.string is not None:
                        child_strings.append(child.string)
                    else:
                        LOGGER.error(f"Unexpected tag child: {child}")
                child_contents = "".join(child_strings)
                child_contents = "\n".join([clean_line(x) for x in child_contents.split("\n")])

                # Replace double newline with single newline before <img> elements
                NL_NL_IMG_PATTERN = re.compile(r"(\n)(\n *\<img)", re.MULTILINE)
                child_contents = NL_NL_IMG_PATTERN.sub(r"\2", child_contents)

                if "KerML" in self.spec_title and clause_title == "Reserved Words":
                    # Rewrite KerML "Reserved Words" production
                    self.reserved_keyword_set = set(child_contents.strip().split())
                    keyword_block = self.wrap_sorted(self.reserved_keyword_set, sep="' | '")
                    child_contents = f"RESERVED_KEYWORD =\n{keyword_block}"
                elif "KerML" in self.spec_title and clause_title == "Symbols":
                    # Rewrite KerML "Symbols" production
                    if "(" in child_contents:
                        # Block containing symbols
                        reserved_symbol_set = set(child_contents.strip().split())
                        symbol_block = self.wrap_sorted(reserved_symbol_set, sep="' | '", reverse=True)
                        child_contents = f"RESERVED_SYMBOL = \n{symbol_block}"
                    else:
                        # Block containing special lexical terminals - rewrite separated by double newlines
                        if len(child_contents.split("\n\n")) <= 1:
                            child_contents = child_contents.replace("\n", "\n\n")
                elif "SysML" in self.spec_title and clause_title == "Lexical Structure":
                    # Rewrite SysML clause with reserved keywords and special lexical terminals
                    if "=" in child_contents:
                        # Block containing special lexical terminals - separate productions with double newlines if needed
                        if len(child_contents.split("\n\n")) <= 1:
                            child_contents = child_contents.replace("\n", "\n\n")
                    else:
                        # Block containing reserved keywords
                        self.reserved_keyword_set = set(child_contents.strip().split())
                        keyword_block = self.wrap_sorted(self.reserved_keyword_set, sep="' | '")
                        child_contents = f"RESERVED_KEYWORD = \n{keyword_block}"

                # Productions should start in column 1, be separated by double newlines and continue with indented lines
                # An incorrect production separator is a single newline followed by a non-whitespace character
                INCORRECT_PRODUCTION_SEPARATOR_PATTERN = re.compile(r"(?<!\n)(\n[^ \n\t])", re.MULTILINE)
                # Separate candidate productions by double newlines if needed
                child_contents = INCORRECT_PRODUCTION_SEPARATOR_PATTERN.sub(r"\n\1", child_contents)
                # Replace double newline followed by SEE_NOTE with single newline
                NL_NL_SEE_NOTE_PATTERN = re.compile(r"(\n)(\n[(]?\s*See Note)", re.MULTILINE + re.IGNORECASE)
                child_contents = NL_NL_SEE_NOTE_PATTERN.sub(r"\2", child_contents)

                SEE_NOTE_PATTERN = re.compile(r"^\s*[(]?\s*See Note.*$", flags=re.IGNORECASE)

                # Get candidate productions and strip possible trailing newline(s)
                candidate_productions = child_contents.split("\n\n")
                candidate_productions[-1] = candidate_productions[-1].rstrip()

                current_production: Optional[Production] = None
                for candidate_prod in candidate_productions:
                    img_count = candidate_prod.count("<img ")
                    img_index = 0
                    if clause_id.startswith(self.bnf_clause_id):
                        # Store keywords and symbols appearing in textual notation productions
                        matched_keywords = KEYWORD_PATTERN.findall(candidate_prod)
                        for matched_keyword in matched_keywords:
                            self.extracted_keyword_set.add(matched_keyword[1:-1])
                        matched_symbols = SYMBOL_PATTERN.findall(candidate_prod)
                        for matched_symbol in matched_symbols:
                            self.extracted_symbol_set.add(matched_symbol[1:-1])
                    lines = candidate_prod.split("\n")
                    line_number = 0
                    for line in lines:
                        if line == "":
                            LOGGER.error(f"Unexpected empty line in candidate production: {candidate_prod}")
                            continue
                        line_number += 1
                        if line_number == 1:
                            # Should be the start of a new production
                            lhs1 = line.split("=")[0].strip()
                            lhs2 = lhs1.split(":", 1)
                            name = lhs2[0].strip()
                            if len(lhs2) == 2:
                                abstract_type = lhs2[1].strip()
                            elif is_pascal_case(name):
                                abstract_type = name
                            else:
                                abstract_type = ""
                            current_production = Production(clause_id, [line], name, abstract_type)
                            self.elements.append(current_production)
                            if name in self.grammars[-1].prod_names:
                                LOGGER.error(f"Non-unique production name: {name} in {self.grammars[-1].name}")
                            else:
                                self.grammars[-1].prod_names.add(name)
                            if line.startswith(" "):
                                LOGGER.error(f"Production start line starts with a space: {line}")
                                line = line.strip()
                            if line.count("=") != 1:
                                LOGGER.error(f"Production start line does not contain exactly one '=': {line}")
                        elif "<img" in line:
                            # Rewrite the <img .../> src attribute value to .svg file with same name as production
                            img_postfix = ""
                            if img_count > 1:
                                img_index += 1
                                img_postfix = f"-{img_index}"
                            line = line.replace("SRC_VALUE", f"_svg/{current_production.name}{img_postfix}.svg")
                            current_production.lines.append(line)
                        elif SEE_NOTE_PATTERN.match(line):
                            see_note = line.strip().replace("see", "See")
                            # Add possibly missing parenthesis
                            if not see_note.startswith("("):
                                see_note = f"({see_note}"
                            if not see_note.endswith(")"):
                                see_note = f"{see_note})"
                            self.elements.append(NoteRef(clause_id, lines=[see_note]))
                            contains_note_reference = True
                        else:
                            current_production.lines.append(line)

                    # Check with Lark parser
                    current_production_text = "\n".join(current_production.lines)
                    try:
                        parse_tree = self.parser.parse(current_production_text)
                    except UnexpectedInput as e:
                        LOGGER.error(f"Parser found error in {clause_id}:\n{current_production_text}\n{e}")
                    else:
                        # LOGGER.info(f"Parsed successfully {clause_id}:\n{current_production_text}\n{parse_tree.pretty(indent_str='  ')}")
                        pass

                for subtag in tag:
                    if not subtag.name in (None, "em", "strong", "img"):
                        LOGGER.error(f"Unexpected tag inside <pre> element: tag={subtag}")

            elif tag.name == "p" and inside_bnf_clause and contains_pre_tag:
                # LOGGER.debug(f"note <p> tag={tag}")
                if tag.string == "Notes":
                    contains_notes_section = True

            # elif tag.name == "ol" and inside_bnf_clause and contains_notes_section:
            elif tag.name == "ol" and inside_bnf_clause and contains_pre_tag and tag.parent.name != "li":
                # LOGGER.debug(f"note <ol> tag={tag}")
                list_item_count = 0
                note_list = NoteList(clause_id, [], [])
                for subtag in tag:
                    if subtag.name == "li":
                        list_item_count += 1
                        text_content = clean_text_content(" ".join(subtag.stripped_strings), True)
                        note_content = f"  {list_item_count}. {text_content}"
                        note_list.lines.append(note_content)

                        # Update the contents of <li> within the HTML tree
                        self.cleanup_note_html(subtag)

                note_list.html_snippets.append(tag)
                self.elements.append(note_list)
                contains_note_reference = False
                contains_notes_section = False

        # End main visit tag loop

        if self.bnf_mode == "textual":
            self.report_checks()

        self.spec_path_previous = self.spec_path

        # End def extract_bnf()

    def cleanup_note_html(self, pe: PageElement) -> None:
        """Recursively clean up the given HTML element tree"""
        if isinstance(pe, Tag):
            for child in pe.children:
                # Recurse depth-first
                self.cleanup_note_html(child)
            if pe.name in ("ol", "ul", "li", "em", "strong", "code"):
                pass
            elif pe.name == "mms-view-link":
                # MMS VE cross-reference: remove any tags and extract cross-ref clause id only
                xref_clause_id = "".join(pe.stripped_strings)
                if xref_clause_id.startswith(self.bnf_clause_id):
                    # Subclause ref can be resolved within current BNF clause
                    new_tag = self.soup.new_tag("a")
                    new_tag["href"] = f"#{xref_clause_id}"
                    new_tag.string = xref_clause_id
                    pe.replace_with(new_tag)
                else:
                    new_string = self.soup.new_string(xref_clause_id)
                    pe.replace_with(new_string)
            elif pe.name == "pre":
                # Convert embedded pre to code
                pe.name = "code"
            else:
                # Replace a tag with its contents
                pe.unwrap()

    def tokenize(self, line: str) -> list[Token]:
        """
        Basic hand-written KerML and SysML grammar tokenizer

        Tokenize one line at a time.
        """
        tokens: list[Token] = []
        state: Optional[TokenKind] = None
        token_text: str = ""
        pos: int = 0
        while pos < len(line):
            ch = line[pos]
            if state == TokenKind.IMAGE:
                if line[pos:pos + 2] == "/>":
                    token_text += line[pos:pos + 2]
                    tokens.append(Token(TokenKind.IMAGE, token_text))
                    token_text = ""
                    state = None
                    pos += 1
                else:
                    token_text += ch
            elif line[pos:pos + 2] == "//":
                if state is None:
                    tokens.append(Token(TokenKind.LINE_COMMENT, line[pos:]))
                    pos = len(line) - 1
                else:
                    token_text += line[pos:pos + 2]
                    pos = pos + 1
            elif line[pos:pos + 4] == "<img":
                state = TokenKind.IMAGE
                token_text = line[pos:pos + 4]
                pos += 3
            elif ch.isalpha():
                if state == TokenKind.NONTERMINAL:
                    token_text += ch
                elif state == TokenKind.TERMINAL:
                    token_text += ch
                elif state == TokenKind.IMAGE:
                    token_text += ch
                else:
                    state = TokenKind.NONTERMINAL
                    token_text = ch
            elif ch.isdigit() or ch == "_" or ch == "-":
                if state == TokenKind.NONTERMINAL:
                    token_text += ch
                elif state == TokenKind.TERMINAL:
                    token_text += ch
                elif state == TokenKind.IMAGE:
                    token_text += ch
                else:
                    LOGGER.warning(f"Tokenize: Unexpected character '{ch}' in state {state} at position {pos} in line: {line} ")
            elif ch == "'":
                if state == TokenKind.TERMINAL:
                    token_text += ch
                    tokens.append(Token(TokenKind.TERMINAL, token_text))
                    if " " in token_text:
                        LOGGER.warning(f"Tokenize: Space inside TERMINAL {token_text} in line {line}")
                    token_text = ""
                    state = None
                elif state is None:
                    state = TokenKind.TERMINAL
                    token_text = ch
                else:
                    LOGGER.warning(f"Tokenize: Unexpected character '{ch}' in state {state} at position {pos} in line: {line}")
            else:
                if state == TokenKind.NONTERMINAL:
                    tokens.append(Token(TokenKind.NONTERMINAL, token_text))
                    token_text = ""
                    state = None

                if ch in " \n\t":
                    if state == TokenKind.TERMINAL:
                        if ch == " ":
                            token_text += ch
                        else:
                            tokens.append(Token(TokenKind.TERMINAL, token_text))
                            token_text = ""
                            state = None
                            LOGGER.warning(f"Tokenize: Missing end single quote -> incomplete TERMINAL at position {pos} in line: {line}")
                    tokens.append(Token(TokenKind.WHITESPACE, ch))
                elif state == TokenKind.TERMINAL:
                    token_text += ch
                else:
                    tokens.append(Token(TokenKind.INTERPUNCTION, ch))
            pos += 1

        if state == TokenKind.NONTERMINAL:
            tokens.append(Token(TokenKind.NONTERMINAL, token_text))
        elif state == TokenKind.TERMINAL:
            tokens.append(Token(TokenKind.TERMINAL, token_text))
            LOGGER.warning(f"Tokenize: Missing single quote -> incomplete LEXICAL in line: {line}")
        elif state == TokenKind.IMAGE:
            tokens.append(Token(TokenKind.IMAGE, token_text))
            LOGGER.warning(f"Tokenize: Missing '/>' -> incomplete IMAGE element in line: {line}")

        return tokens

    def report_checks(self) -> None:
        LOGGER.info("Start of Textual Notation Grammar Checks")

        # Check declared and extracted keywords
        extracted_keywords_block = self.wrap_sorted(self.extracted_keyword_set)
        LOGGER.info(f"Keywords extracted from textual BNF grammar scan:\n{extracted_keywords_block}")

        reserved_set_diff_extracted = self.reserved_keyword_set - self.extracted_keyword_set

        extracted_set_diff_reserved = self.extracted_keyword_set - self.reserved_keyword_set

        LOGGER.info("Comparison of declared reserved keywords versus extracted keywords")

        log_level = logging.WARNING if len(reserved_set_diff_extracted) > 0 else logging.INFO
        reserved_set_diff_block = self.wrap_sorted(reserved_set_diff_extracted)
        LOGGER.log(log_level, f"Declared reserved keywords not in extracted keywords:\n{reserved_set_diff_block}")

        log_level = logging.WARNING if len(extracted_set_diff_reserved) > 0 else logging.INFO
        extracted_set_diff_block = self.wrap_sorted(extracted_set_diff_reserved)
        LOGGER.log(log_level, f"Extracted keywords not in declared reserved keywords:\n{extracted_set_diff_block}")

        # TODO: add check for symbols

        LOGGER.info("End of Textual Notation Grammar Checks")

    def wrap_sorted(self, words: Iterable[str], sep: str = " ", reverse: bool = False) -> str:
        lead_char = ""
        trail_char = ""
        if len(sep) > 1:
            if sep.endswith("'"):
                lead_char = "'"
            if sep.startswith("'"):
                trail_char = "'"
        sorted_words_string = f"{lead_char}{sep.join(sorted(words, reverse=reverse))}{trail_char}"
        wrapped_block = "\n".join(wrap(sorted_words_string, width=120, initial_indent="    ", subsequent_indent="    "))
        if "|" in sep:
            wrapped_block = wrapped_block.replace(" |\n    ", "\n    | ")
        return wrapped_block

    def dump_bnf_grammar_elements(self):
        bnf_elements_path = self.bnf_path + "-elements.txt"
        LOGGER.info(f"Dumping BNF grammar elements into {bnf_elements_path}")
        with open(bnf_elements_path, mode="w", encoding="utf-8") as bnf_elements_file:
            for elem in self.elements:
                # bnf_elements_file.write(f"<{elem.__class__.__name__}> name={elem.name} type={elem.abstract_type} {'\n'.join(elem.lines)}\n")
                bnf_elements_file.write(f"{repr(elem)}\n")

    def export_txt(self):
        bnf_txt_path = self.bnf_path + ".txt"
        LOGGER.info(f"Writing BNF text file {bnf_txt_path}")
        with open(bnf_txt_path, mode="w", encoding="utf-8") as bnf_txt_file:
            bnf_txt_file.write(line_comment(f"Source document: {self.spec_path}\n"))
            bnf_txt_file.write(line_comment(f"Generated by bnf_grammar_extractor at: {self.start_timestamp}\n"))
            for elem in self.elements:
                bnf_txt_file.write(elem.get_txt())
            bnf_txt_file.write(line_comment("End of BNF"))

    def export_html(self):
        HTML_HEAD = """\
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>{doc_title}</title>  
<link rel="stylesheet" type="text/css" href="bnf_styles.css">
</head>
<body>
"""
        bnf_html_path = self.bnf_path + ".html"
        LOGGER.info(f"Writing BNF HTML file {bnf_html_path}")
        with open(bnf_html_path, mode="w", encoding="utf-8") as bnf_html_file:
            bnf_html_file.write(HTML_HEAD.format(doc_title=self.bnf_path))
            bnf_html_file.write(f"<p>\n{LINE_COMMENT_MARKER} Source document: {self.spec_path}<br>\n"
                                f"{LINE_COMMENT_MARKER} Generated by bnf_grammar_extractor at: {self.start_timestamp}\n</p>\n")
            for elem in self.elements:
                bnf_html_file.write(elem.get_html(self))
            bnf_html_file.write("</body>\n</html>\n")


def main(argv: list[str]) -> None:
    if len(argv) < 4 or ((len(argv) - 1) % 3 != 0) or argv[1] == "-h" or argv[1] == "--help":
        # The number of arguments must be a multiple of 3
        usage()
        return

    # Create a GrammarExtractor, then extract BNF and run backend exporters for each of the given triples
    grammar_extractor = GrammarExtractor()

    for index in range(1, len(argv), 3):
        spec_path = argv[index]
        bnf_clause_id = argv[index + 1]
        bnf_mode = argv[index + 2]

        grammar_extractor.extract_bnf(spec_path, bnf_clause_id, bnf_mode)
        grammar_extractor.dump_bnf_grammar_elements()
        grammar_extractor.export_txt()
        grammar_extractor.export_html()


def usage():
    print("""\
Usage: python bnf_grammar_extractor.py [options] {<spec_path> <bnf_clause_id> <mode>}+

    Extract textual and/or graphical grammars from given KerML or SysML specifications
    and generate txt and html files.

    Arguments:
    There must be one or more triples of arguments, consisting of:
    spec_path     : .html file specification exported from View Editor
    bnf_clause_id : clause identifier that specifies a BNF grammar
    mode          : "textual" or "graphical"

    The argument triples should be ordered from least to most dependent grammars,
    as in the second example below.

    Options:
    -h or --help: Display this message and exit.

    Examples:
    1. python bnf_grammar_extractor.py SysML-spec-r2025-xx.html 8.2.2 textual
    2. python bnf_grammar_extractor.py KerML-spec-r2025-xx.html 8.2 textual SysML-spec-r2025-xx.html 8.2.2 textual SysML-spec-r2025-xx.html 8.2.3 graphical
""")


if __name__ == "__main__":
    main(sys.argv)
