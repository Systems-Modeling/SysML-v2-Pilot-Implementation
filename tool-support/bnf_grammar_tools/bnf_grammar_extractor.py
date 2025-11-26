#!python

"""
bnf_grammar_extractor is a command line tool to extract the
textual and graphical BNF grammars from the KerML and SysML specifications

Its usage is described below in the main() function.

Its usage can also be obtained by running:

    python bnf_grammar_extractor.py --help

@author: Hans Peter de Koning (DEKonsult)

Note: Needs package beautifulsoup4 (See https://pypi.org/project/beautifulsoup4/)

"""

import os
import sys
import json
import re
import argparse
from datetime import datetime, timezone
from dataclasses import dataclass, asdict
from enum import Enum, auto
from textwrap import wrap
from typing import Optional, Iterable, Union, Any

from bs4 import BeautifulSoup, Tag, NavigableString, PageElement

from lark import Lark, Transformer, Tree, UnexpectedInput

# Create logger for debug, info, warning, error, critical messages
import logging

LOGGER = logging.getLogger()

# Marker denoting start of a line comment in generated output
LINE_COMMENT_MARKER = "//"

# Images directory to hold SVG images as part of graphical BNF productions
IMAGES_DIR = "images"

# Scale multiplication factor for SVG images in graphical BNF productions
SVG_SCALE_FACTOR = 1.5

class DATA:
    """Collection of HTML5 data templates"""
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
    HTML_TAIL = """\
</body>
</html>
"""


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
    LEADING_SPACES_NEWLINES_PATTERN = re.compile(r"^ +\n+")
    text = LEADING_SPACES_NEWLINES_PATTERN.sub("\n", text)

    return text


def clean_line(line: str) -> str:
    """Replace special whitespace with regular space and strip tail end"""
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
    production_names: set[str]


@dataclass
class GrammarElement:
    clause_id: str
    lines: list[str]

    def get_txt(self) -> str:
        assert len(self.lines) == 0
        return f"{line_comment(self.lines[0])}\n"

    def get_html(self, extractor: "GrammarExtractor") -> str:
        rendered_lines = "\n".join(self.lines)
        return f"<pre>\n{rendered_lines}\n\n</pre>\n"

    def get_as_dict(self) -> dict[str, Any]:
        self_as_dict = asdict(self)
        self_as_dict["@type"] = self.__class__.__name__
        return self_as_dict

    @staticmethod
    def get_safe_anchor_id(candidate_anchor_id: str) -> str:
        """
        Return safe anchor id for given candidate string.

        To avoid name collisions between PascalCase and UPPER_SNAKE_CASE identifiers,
        append "_" to all uppercase tokens because the anchor id attribute is not case-sensitive
        """
        return f"{candidate_anchor_id}_" if candidate_anchor_id.isupper() else candidate_anchor_id


@dataclass
class Info(GrammarElement):
    source: str
    timestamp: str

    def get_txt(self) -> str:
        rendered_lines = [
            line_comment(f"Source document: {self.source}"),
            line_comment(f"Generated by bnf_grammar_extractor at: {self.timestamp}")
            ] + [line_comment(x) for x in self.lines]
        rendered_string = "\n".join(rendered_lines)
        return f"{rendered_string}\n\n"

    def get_html(self, extractor: "GrammarExtractor") -> str:
        rendered_lines = [
            f"{LINE_COMMENT_MARKER} Source document: {self.source}",
            f"{LINE_COMMENT_MARKER} Generated by bnf_grammar_extractor at: {self.timestamp}"
            ] + [f"{LINE_COMMENT_MARKER} {x}" for x in self.lines]
        rendered_string = "<br>\n".join(rendered_lines)
        return f"<p>{rendered_string}\n</p>\n"


@dataclass
class Heading(GrammarElement):
    def get_txt(self) -> str:
        assert len(self.lines) == 1
        return f"{line_comment(self.lines[0])}\n"

    def get_html(self, extractor: "GrammarExtractor") -> str:
        assert len(self.lines) == 1
        if self.clause_id:
            anchor = f'<a id="c{self.clause_id}"></a>'
            level = self.clause_id.count(".") + 1
        else:
            anchor = ""
            level = 1
        html_string = f'<h{level}>{anchor}{LINE_COMMENT_MARKER} {self.lines[0]}</h{level}>\n'
        return html_string


@dataclass
class Production(GrammarElement):
    name: str
    abstract_syntax_type: str
    is_partial: bool = False

    def get_txt(self) -> str:
        rendered_lines = "\n".join(self.lines)
        return f"{rendered_lines}\n\n"

    def get_html(self, extractor: "GrammarExtractor") -> str:
        html_lines: list[str] = []
        for html_line in self.lines:
            pieces = []
            tokens = extractor.tokenize(html_line)
            for token in tokens:
                is_hyperlink_resolved = False
                if token.kind == TokenKind.NONTERMINAL:
                    if token.text == self.name:
                        # Do not link to own production
                        pass
                    elif token.text == self.abstract_syntax_type:
                        # Do not link to abstract syntax term
                        # TODO: Link abstract syntax term to declaration in KERML.kerml or SYSML.sysml standard library
                        pass
                    else:
                        # Try to resolve hyperlink to identifier in reverse order of known grammars
                        for grammar in reversed(extractor.grammars):
                            if token.text in grammar.production_names:
                                # Production declaration found, so add hyperlink to declaration anchor
                                # The hyperlink works if other HTML grammar files are in the same directory as the current one
                                html_path = "" if grammar.name == extractor.bnf_path else f"{grammar.name}.html"
                                anchor_id = self.get_safe_anchor_id(token.text)
                                pieces.append(f'<a href="{html_path}#{anchor_id}">{token.text}</a>')
                                is_hyperlink_resolved = True
                                break
                if not is_hyperlink_resolved:
                    pieces.append(token.text)
            html_lines.append("".join(pieces))
        # Ensure 6-space indentation of lines with an <img...> element
        formatted_html_lines: list[str] = []
        for html_line in html_lines:
            if "<img" in html_line:
                html_line = f"      {html_line.lstrip()}"
            formatted_html_lines.append(html_line)
        rendered_lines = "\n".join(formatted_html_lines)
        if self.is_partial:
            production_anchor = ""
        else:
            anchor_id = self.get_safe_anchor_id(self.name)
            production_anchor = f'<a id="{anchor_id}"></a>\n'
        return f"{production_anchor}<pre>{rendered_lines}\n</pre>\n"


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
    html_snippets: list[str]
    # html_snippets: list[PageElement]

    def get_txt(self) -> str:
        rendered_lines = ["Notes:"] + self.lines
        return block_comment(rendered_lines)

    def get_html(self, extractor: "GrammarExtractor") -> str:
        html_lines = [f"<p>{LINE_COMMENT_MARKER} <strong>Notes</strong></p>"]
        html_lines.extend([str(x) for x in self.html_snippets])
        rendered_lines = "\n".join(html_lines)
        rendered_lines = rendered_lines.replace(" ", " ").replace("​", " ")
        return f"{rendered_lines}\n"


class GrammarExtractor:
    """
    Grammar extractor that scans a given HTML source file for KerML or SysML BNF snippets, extracts them
    and validates all BNF productions.
    Mistakes or ambiguous productions are reported in the form of WARNING or ERROR messages.

    The extractor processes two kinds of grammars:
    - concrete textual notation;
    - concrete graphical notation.

    The extractor produces the following outputs:
    - a plain text file containing a machine-readable version of each BNF grammar,
      with extension .kebnf for a textual EBNF source and extension .kgbnf for a graphical EBNF source;
    - an HTML file containing a human-readable version of each BNF grammar, in which all references to terms are hyperlinked to their declaration;
    - a log file containing diagnostic information (DEBUG, INFO, WARNING, ERROR messages) about the processed grammars.
    """
    def __init__(self):
        self.start_timestamp = datetime.now(timezone.utc).isoformat(timespec="seconds").replace("+00:00", "Z")
        self.input_dir = ""
        self.output_dir = ""
        self.spec_path: str = ""
        self.spec_path_previous: Optional[str] = None
        self.soup: Optional[BeautifulSoup] = None
        self.spec_title = ""
        self.bnf_clause_id: str = ""
        self.bnf_path: str = ""
        self.syntax_kind: str = ""
        self.elements: list[GrammarElement] = []
        self.grammars: list[Grammar] = []
        self.reserved_keyword_set: set[str] = set()
        self.extracted_keyword_set: set[str] = set()
        self.reserved_symbol_set: set[str] = set()
        self.extracted_symbol_set: set[str] = set()
        self.parser: Optional[Lark] = None
        self.partial_productions: dict[str, list[str]] = dict()
        self.missing_svgs: list[str] = []
        self.image_map: dict[str, str] = dict()

    def extract_bnf(self, input_dir: str, output_dir: str, input_file: str, syntax_kind: str, bnf_clause_id: str):
        """
        extract BNF productions and notes from raw HTML dump of a KerML or SysML specification

        This method uses heuristics to process the raw HTML input, which may contain format and content errors.
        """
        self.input_dir = input_dir
        self.output_dir = output_dir
        if syntax_kind == "textual-bnf":
            self.syntax_kind = syntax_kind
            spec_file_name = os.path.basename(input_file)
            self.bnf_path = input_file.replace("-spec.html", "-textual-bnf")
            self.parser = Lark.open("kebnf_textual_grammar.lark", rel_to=__file__, parser="lalr")
        elif syntax_kind == "graphical-bnf":
            self.syntax_kind = syntax_kind
            self.bnf_path = input_file.replace("-spec.html", "-graphical-bnf")
            self.parser = Lark.open("kgbnf_graphical_grammar.lark", rel_to=__file__, parser="lalr")
        elif syntax_kind == "kerml-library":
            raise NotImplementedError
        elif syntax_kind == "sysml-library":
            raise NotImplementedError
        else:
            LOGGER.critical(f"Unsupported BNF mode: {syntax_kind}, terminating ...\n")
            sys.exit(1)

        self.spec_path = os.path.join(self.input_dir, input_file)
        self.bnf_clause_id = bnf_clause_id
        self.spec_title = ""
        self.elements = []
        self.grammars.append(Grammar(self.bnf_path, set()))
        self.reserved_keyword_set = set()
        self.extracted_keyword_set = set()
        self.reserved_symbol_set = set()
        self.extracted_symbol_set = set()
        self.partial_productions = dict()
        self.image_map = dict()

        LOGGER.info(20 * "=")
        LOGGER.info(f"Extract BNF from {self.spec_path} syntax-kind={syntax_kind} clause={self.bnf_clause_id} at {self.start_timestamp}")
        LOGGER.info(20 * "=")

        self.elements.append(Info("", [], source=self.spec_path.replace("\\", "/"), timestamp=self.start_timestamp ))

        # Regular expression patterns
        KEYWORD_PATTERN = re.compile(r"('[a-z]{2,}')")
        SYMBOL_PATTERN = re.compile(r"('[^A-Za-z\s]+')")
        SEE_NOTE_PATTERN = re.compile(r"^[ \t]*[(]?[ \t]*See Note.*$", flags=re.IGNORECASE)

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
        # - grammar productions and their notes from the given textual or graphical notation clause
        for tag in self.soup.find_all(name=["h1", "pre", "p", "ol"], recursive=True):
            count += 1
            LOGGER.debug(f"Visit tag #{count} {tag.name}")

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

            # TODO: Properly check for <pre> elements in notes lists, i.e. contained in <li> element
            # elif tag.name == "pre" and inside_bnf_clause and tag.parent.name != "li":
            elif tag.name == "pre" and inside_bnf_clause:
                # Process a <pre> element that contains BNF grammar lines
                if tag.parent.name == "li":
                    LOGGER.warning(f"<pre> appearing inside <li> element:\n{tag}")

                LOGGER.debug(f"tag#{count}:\n{tag}")
                contains_pre_tag = True

                child_strings: list[str] = []
                for child in tag.children:
                    if isinstance(child, Tag) and child.name == "img":
                        # Simplify <img .../> element by only retaining src attribute from which the query parameter (?token=...) is stripped
                        src_attr = child.attrs.get("src").split("?", 1)[0]
                        child_strings.append(f'<img src="{src_attr}">')
                    elif child.string is not None:
                        child_strings.append(child.string)
                    else:
                        LOGGER.error(f"Unexpected child={child} in tag={tag}")
                child_contents = "".join(child_strings)

                # Clean each line
                child_contents = "\n".join([clean_line(x) for x in child_contents.split("\n")])

                # Replace any two or more newlines with a single newline
                # MULTIPLE_NL_PATTERN = re.compile(r"\n{2,}")
                # child_contents = MULTIPLE_NL_PATTERN.sub(r"\n", child_contents)

                # Pre-process lexical clauses in KerML and SysML specifications
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

                # Productions should start in column 1 and (if needed) continue with whitespace indented lines,
                # i.e., an incorrect production separation is a single newline followed by a non-whitespace character
                # INCORRECT_PRODUCTION_SEPARATOR_PATTERN = re.compile(r"(?<!\n)(\n[^ \n\t])")
                # Separate candidate productions by double newlines if needed
                # child_contents = INCORRECT_PRODUCTION_SEPARATOR_PATTERN.sub(r"\n\1", child_contents)

                # Replace double newline followed by "See Note" or similar with single newline and 4-space indent
                MULTI_NL_SEE_NOTE_PATTERN = re.compile(r"[ \t\n]+(\(?)[ \t]*See Note", re.IGNORECASE)
                child_contents = MULTI_NL_SEE_NOTE_PATTERN.sub(r"\n    \1See Note", child_contents)

                # Replace one or more newline followed by <img...> element with single newline and 6-space indent
                if self.syntax_kind == "graphical-bnf":
                    if child_contents.find("\n<img") >= 0:
                        LOGGER.error(f"<img...> element appears at start of line:\n{tag}")
                    MULTI_NL_WS_IMG_PATTERN = re.compile(r"[ \t\n]+<img")
                    child_contents = MULTI_NL_WS_IMG_PATTERN.sub("\n      <img", child_contents)

                # Get candidate productions
                ### A NON_CONTINUATION_LINE is a line that does not start with a space or tab
                ### Use a negative lookahead assertion re pattern (?!...) to not consume the possible match
                NON_CONTINUATION_LINE_PATTERN = re.compile(r"\n+(?![ \t])")
                candidate_productions = NON_CONTINUATION_LINE_PATTERN.split(child_contents)
                # candidate_productions = child_contents.split("\n\n")
                # Strip possible trailing newline(s) from last candidate production
                candidate_productions[-1] = candidate_productions[-1].rstrip()

                for candidate_prod in candidate_productions:
                    if candidate_prod == "":
                        continue

                    # Collect keywords and symbols
                    if clause_id.startswith(self.bnf_clause_id):
                        # Store keywords and symbols appearing in textual notation productions
                        matched_keywords = KEYWORD_PATTERN.findall(candidate_prod)
                        for matched_keyword in matched_keywords:
                            self.extracted_keyword_set.add(matched_keyword[1:-1])
                        matched_symbols = SYMBOL_PATTERN.findall(candidate_prod)
                        for matched_symbol in matched_symbols:
                            self.extracted_symbol_set.add(matched_symbol[1:-1])

                    # Initialize count and index for productions with multiple <img...> terms
                    img_count = candidate_prod.count("<img ")
                    img_index = 0

                    # Process lines in each candidate production
                    lines = candidate_prod.split("\n")
                    line_number = 0
                    current_note_ref: Optional[NoteRef] = None
                    current_production: Optional[Production] = None
                    production_name = None
                    for line in lines:
                        if line == "":
                            LOGGER.error(f"Unexpected empty line in candidate production: {candidate_prod}")
                            continue
                        line_number += 1
                        if line_number == 1:
                            # Should be the start of a new production
                            GRAPHICAL_GRAMMAR_NOTE_PATTERN = re.compile(r"^[ \t]*Note[.:].+", flags=re.IGNORECASE)
                            if GRAPHICAL_GRAMMAR_NOTE_PATTERN.match(line):
                                LOGGER.warning(f"Graphical note found in <pre>, but should be <p> element: {candidate_prod}")
                                current_note_ref = NoteRef(clause_id, lines=[line])
                                self.elements.append(current_note_ref)
                            else:
                                if line.find("=|") >= 0:
                                    # Process partial graphical BNF productions
                                    is_partial = True
                                    lhs, rhs = line.split("=|", 1)
                                    production_name = lhs.strip()
                                    abstract_type = ""
                                    if not production_name in self.partial_productions:
                                        self.partial_productions[production_name] = []
                                    for term in [x.strip() for x in rhs.split("|")]:
                                        if term:
                                            self.partial_productions[production_name].append(term)
                                else:
                                    # Process other BNF productions
                                    is_partial = False
                                    lhs1 = line.split("=")[0].strip()
                                    lhs2 = lhs1.split(":", 1)
                                    production_name = lhs2[0].strip()
                                    if len(lhs2) == 2:
                                        abstract_type = lhs2[1].strip()
                                    elif is_pascal_case(production_name):
                                        abstract_type = production_name
                                    else:
                                        abstract_type = ""
                                    if production_name in self.grammars[-1].production_names:
                                        LOGGER.error(f"Non-unique production name: {production_name} in {self.grammars[-1].production_names}")
                                    else:
                                        self.grammars[-1].production_names.add(production_name)

                                current_production = Production(clause_id, [line], production_name, abstract_type, is_partial)
                                self.elements.append(current_production)

                                if line[0] in (" ", "\t"):
                                    LOGGER.error(f"Production start line starts with a space or tab: {line}")
                                    line = line.strip()
                                ONE_EQUALS_PATTERN = re.compile(r"( = | =$)")
                                if not ONE_EQUALS_PATTERN.search(line):
                                    LOGGER.warning(f"Production start line does not contain exactly one '=': {line}")
                        elif current_note_ref:
                            current_note_ref.lines.append(line)
                        elif "<img" in line:
                            updated_line, img_index = self.rewrite_img_element(current_production, img_count, img_index, line)
                            current_production.lines.append(updated_line)
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
                            if production_name in self.partial_productions:
                                for term in [x.strip() for x in line.split("|")]:
                                    if term:
                                        self.partial_productions[production_name].append(term)

                            current_production.lines.append(line)

                    if current_production:
                        # Check production for correct syntax with Lark parser
                        current_production_text = "\n".join(current_production.lines) + "\n"
                        try:
                            parse_tree = self.parser.parse(current_production_text)
                        except UnexpectedInput as e:
                            LOGGER.error(f"Parse error in {self.spec_path} {clause_id} in production:\n{current_production_text}\n{e}")
                        else:
                            log_level = logging.INFO if clause_id in ("8.2.3.6",) else logging.DEBUG
                            LOGGER.log(log_level, f"Parsed successfully {clause_id}:\n{current_production_text}\n{parse_tree.pretty()}")

                for subtag in tag:
                    if not subtag.name in (None, "em", "strong", "img"):
                        LOGGER.error(f"Unexpected tag inside <pre> element: tag={subtag}")

            elif tag.name == "p" and inside_bnf_clause and contains_pre_tag:
                # LOGGER.debug(f"note <p> tag={tag}")
                if tag.string == "Notes":
                    contains_notes_section = True
                elif (tag.contents and tag.contents[0].name == "strong"
                      and tag.contents[0].string and tag.contents[0].string.strip() in ("Note.", "Note:")):
                    # Note in graphical BNF
                    text_content = clean_text_content(" ".join(tag.stripped_strings), True)
                    self.elements.append(NoteRef(clause_id, lines=[text_content]))


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

                note_list.html_snippets.append(str(tag))
                self.elements.append(note_list)
                contains_note_reference = False
                contains_notes_section = False

        # End main visit tag loop

        if self.syntax_kind == "textual-bnf":
            self.report_checks()

        self.spec_path_previous = self.spec_path

        # End def extract_bnf()

    def rewrite_img_element(self, current_production: Production, img_count: int, img_index: int, line: str) -> (str, int):
        # Rewrite the <img .../> element
        # Set the src attribute to an .svg file with the same name as the production
        # Add a width attribute to scale the image properly in HTML
        img_postfix = ""
        if img_count > 1:
            img_index += 1
            img_postfix = f"-{img_index}"
        svg_file_path = f"{IMAGES_DIR}/{current_production.name}{img_postfix}.svg"
        # Check whether the target SVG file exists, if so compute update width scale
        width_value: float = -1.0
        if os.path.exists(f"{self.output_dir}/{svg_file_path}"):
            with open(f"{self.output_dir}/{svg_file_path}", "r") as svg_file:
                svg_soup = BeautifulSoup(svg_file, "lxml-xml")
                LOGGER.debug(f"Read {svg_file_path} into soup")
                svg_tag = svg_soup.find("svg:svg")
                if svg_tag:
                    LOGGER.debug(f"SVG tag: {svg_tag}")
                    width_attr = svg_tag.attrs.get("width")
                    if width_attr:
                        width_value = float(width_attr) * SVG_SCALE_FACTOR
        else:
            self.missing_svgs.append(svg_file_path)
        SRC_ATTRIBUTE_PATTERN = re.compile(r'src="([^"]+)"')
        original_img_url = SRC_ATTRIBUTE_PATTERN.search(line).group(1)
        self.image_map[original_img_url] = svg_file_path
        updated_line = SRC_ATTRIBUTE_PATTERN.sub(f'src="{svg_file_path}"', line)
        if width_value > -1.0:
            updated_line = updated_line.replace("\">", f"\" width=\"{width_value}\">", 1)
        LOGGER.debug(f"new IMG line={updated_line}")
        return updated_line, img_index

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
                    new_tag["href"] = f"#c{xref_clause_id}"
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
        Basic hand-written (forgiving) KerML and SysML grammar tokenizer

        Tokenizes one line at a time.
        """
        tokens: list[Token] = []
        state: Optional[TokenKind] = None
        token_text: str = ""
        pos: int = 0
        while pos < len(line):
            ch = line[pos]
            if state == TokenKind.IMAGE:
                if line[pos:pos + 1] == ">":
                    token_text += line[pos:pos + 1]
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
                    # end of terminal token
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
            LOGGER.warning(f"Tokenize: Missing single quote -> incomplete TERMINAL in line: {line}")
        elif state == TokenKind.IMAGE:
            tokens.append(Token(TokenKind.IMAGE, token_text))
            LOGGER.warning(f"Tokenize: Missing '/>' -> incomplete IMAGE element in line: {line}")
        elif state is not None:
            LOGGER.error(f"Tokenize: Final state is not None but {state}")

        return tokens

    def wrap_sorted(self, words: Iterable[str], sep: str = " ", reverse: bool = False, width: int = 120) -> str:
        """
        Return a text block, of a given maximum character width, for words sorted in ascending (or descending) alphabetical order.

        If the separator string contains the pipe symbol (|) it will be moved consistently to line ends.
        """
        lead_char = ""
        trail_char = ""
        if len(sep) > 1:
            if sep.endswith("'"):
                lead_char = "'"
            if sep.startswith("'"):
                trail_char = "'"
        sorted_words_string = f"{lead_char}{sep.join(sorted(words, reverse=reverse))}{trail_char}"
        wrapped_block = "\n".join(wrap(sorted_words_string, width=width, initial_indent="    ", subsequent_indent="    ", break_on_hyphens=False))
        if "|" in sep:
            wrapped_block = wrapped_block.replace(" |\n    ", "\n    | ")
        return wrapped_block

    def report_checks(self) -> None:
        """
        Perform and report (in the log) the following checks:
        - Mismatches from the comparison of declared reserved keywords w.r.t. extracted keywords
        - Mismatches from the comparison of extracted keywords w.r.t. declared reserved keywords
        """
        LOGGER.info("===== Start of Textual Notation Grammar Checks")

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

        LOGGER.info("===== End of Textual Notation Grammar Checks")

        if self.syntax_kind == "graphical-bnf":
            LOGGER.info("===== Start of Graphical Notation Grammar Checks")
            if self.missing_svgs:
                missing_svgs_string = "\n".join(sorted(self.missing_svgs))
                LOGGER.warning(f"The following {len(self.missing_svgs)} SVG images are missing:\n{missing_svgs_string}")

            if self.image_map:
                map_string = "\n".join([f"{k} {v}" for k, v in sorted(self.image_map.items())])
                LOGGER.info(f"Map from {len(self.image_map)} original to new SVG  images:\n{map_string}")

            LOGGER.info("===== End of Graphical Notation Grammar Checks")

    def dump_bnf_grammar_elements(self):
        """
        Dump all recognized BNF grammar elements into a json file.
        """
        bnf_elements_json_path = os.path.join(self.output_dir, self.bnf_path + "-elements.json")
        LOGGER.info(f"Dumping BNF grammar elements into {bnf_elements_json_path}")
        with open(bnf_elements_json_path, mode="w", encoding="utf-8") as bnf_elements_json_file:
            json.dump([x.get_as_dict() for x in self.elements], bnf_elements_json_file, default=lambda obj: obj.__dict__, indent=2, sort_keys=True, ensure_ascii=False)


    def export_plain_bnf(self):
        """
        Export BNF grammar elements into a plain BNF text file.
        """
        bnf_extension = ".kebnf" if self.syntax_kind == "textual-bnf" else ".kgbnf"
        plain_bnf_path = os.path.join(self.output_dir, self.bnf_path + bnf_extension)
        LOGGER.info(f"Writing BNF grammar file {plain_bnf_path}")
        with open(plain_bnf_path, mode="w", encoding="utf-8") as plain_bnf_file:
            for elem in self.elements:
                plain_bnf_file.write(elem.get_txt())
            plain_bnf_file.write(line_comment("End of BNF"))

            if self.partial_productions:
                plain_bnf_file.write(f"\n{line_comment('Consolidated partial productions:')}\n")
                for name, term_list in sorted(self.partial_productions.items()):
                    term_list_lines = f"{name} =\n{self.wrap_sorted(term_list, sep=' | ')}".split("\n")
                    plain_bnf_file.write(block_comment(term_list_lines, add_newline=True))

    def export_html(self):
        """
        Export BNF grammar elements into an HTML file.
        """
        bnf_html_path = os.path.join(self.output_dir, self.bnf_path + ".html")
        LOGGER.info(f"Writing BNF HTML file {bnf_html_path}")
        with open(bnf_html_path, mode="w", encoding="utf-8") as bnf_html_file:
            bnf_html_file.write(DATA.HTML_HEAD.format(doc_title=self.bnf_path))

            for elem in self.elements:
                bnf_html_file.write(elem.get_html(self))

            if self.partial_productions:
                bnf_html_file.write(f"<h2>{line_comment('Consolidated partial productions:')}</h2>")
                for name, term_list in sorted(self.partial_productions.items()):
                    html_term_list = [f'<a_href="#{term}">{term}</a>' for term in sorted(term_list)]
                    term_list_lines = f'{name} =\n{self.wrap_sorted(html_term_list, sep=' | ', width=300)}'.replace("<a_href=", "<a href=").split("\n")
                    bnf_html_file.write(f'<pre><a id="{name}"></a>\n{block_comment(term_list_lines, add_newline=False)}\n</pre>\n')

            bnf_html_file.write(DATA.HTML_TAIL)


def main() -> None:
    """
    Main CLI program entry point
    """
    # Initialize logging
    LOGGER.setLevel(logging.DEBUG)
    formatter = logging.Formatter("%(levelname)-8s: %(message)s")

    console_handler = logging.StreamHandler()
    console_handler.set_name("console")
    console_handler.setLevel(logging.INFO)
    console_handler.setFormatter(formatter)
    LOGGER.addHandler(console_handler)

    file_handler = logging.FileHandler("bnf_grammar_extractor.log", mode="w", encoding="utf-8")
    file_handler.set_name("logfile")
    file_handler.setLevel(logging.INFO)
    file_handler.setFormatter(formatter)
    LOGGER.addHandler(file_handler)

    # Initialize command line arguments parser
    parser = argparse.ArgumentParser(
        prog="bnf_grammar_extractor",
        allow_abbrev=False,
        description="Extract textual and/or graphical grammars from given KerML or SysML specifications and generate txt and html BNF grammar files.",
        epilog="For an example see TBD")
    parser.add_argument("source_data", metavar="SOURCE_DATA", type=str, help="JSON file defining source data")
    parser.add_argument("-i", "--input-dir", metavar="INPUT_DIR", type=str, nargs="?", default="sources", help="input directory path")
    parser.add_argument("-o", "--output-dir", metavar="OUTPUT_DIR", type=str, nargs="?", default=".", help="output directory path")

    args = parser.parse_args()
    LOGGER.debug(f"args={args}")

    input_dir = args.input_dir
    output_dir = args.output_dir

    # Construct the GrammarExtractor and execute
    grammar_extractor = GrammarExtractor()

    # Extract the requested BNF grammars from each of the given input file / clause combinations and run the backend processors
    source_json = os.path.join(args.input_dir, args.source_data)
    with open(source_json, mode="r", encoding="utf-8") as source_json_file:
        source_list = json.load(source_json_file)

        for source in source_list:
            file_name = source["file"]
            syntax_kind = source["syntax_kind"]
            clause_id = source.get("clause_id")

            if syntax_kind in ("kerml-library", "sysml-library"):
                LOGGER.warning(f"Processing syntax_kind={syntax_kind} for {file_name} clause={clause_id} is not yet implemented")
            else:
                grammar_extractor.extract_bnf(input_dir, output_dir, file_name, syntax_kind, clause_id)
                grammar_extractor.report_checks()
                grammar_extractor.dump_bnf_grammar_elements()
                grammar_extractor.export_plain_bnf()
                grammar_extractor.export_html()


if __name__ == "__main__":
    main()
