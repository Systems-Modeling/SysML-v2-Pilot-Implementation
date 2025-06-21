"""
EBNF and GBNF Grammar Extractor for KerML and SysML specifications in HTML format

@author: Hans Peter de Koning (DEKonsult)

Note: Needs package beautifulsoup4 (See https://pypi.org/project/beautifulsoup4/)

"""
import sys
import re
from datetime import datetime, timezone
from dataclasses import dataclass

from bs4 import BeautifulSoup, Tag, NavigableString
from typing import Optional

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
    return len(text) > 1 and re.fullmatch(r"^[A-Z][a-z][A-Za-z]*$", text)


def is_upper_snake_case(text: str) -> bool:
    return len(text) > 1 and re.fullmatch(r"^[A-Z_]+$", text)


@dataclass
class GrammarElement:
    clause: str
    lines: list[str]

    def get_txt(self) -> str:
        rendered_lines = "\n".join(self.lines)
        return f"{rendered_lines}\n\n"

    def get_html(self) -> str:
        rendered_lines = "\n".join(self.lines)
        return f"<pre>\n{rendered_lines}\n\n</pre>\n"


@dataclass
class Heading(GrammarElement):
    def get_txt(self) -> str:
        assert len(self.lines) == 1
        return f"{line_comment(self.lines[0])}\n"

    def get_html(self) -> str:
        assert len(self.lines) == 1
        level = self.lines[0].count(".") + 1
        return f"<h{level}>{LINE_COMMENT_MARKER} {self.lines[0]}</h{level}>\n"


@dataclass
class Production(GrammarElement):
    name: str
    abstract_syntax_type: str

    def get_txt(self) -> str:
        rendered_lines = "\n".join(self.lines)
        return f"{rendered_lines}\n\n"

    def get_html(self) -> str:
        TERM_PATTERN = re.compile(r"([A-Za-z][A-Za-z_-]+)")
        anchor = f'<a id="{self.name}" />'
        html_lines: list[str] = [self.lines[0]]
        for line in self.lines[1:]:
            pieces = []
            # Split line into grammar terms and other symbols
            for piece in TERM_PATTERN.split(line):
                if is_pascal_case(piece) or is_upper_snake_case(piece):
                    # Add hyperlink to declaration anchor
                    pieces.append(f'<a href="#{piece}">{piece}</a>')
                else:
                    pieces.append(piece)
            html_lines.append("".join(pieces))
        rendered_lines = "\n".join(html_lines)
        return f"{anchor}<pre>\n{rendered_lines}\n</pre>\n"


@dataclass
class Image(GrammarElement):
    def get_txt(self) -> str:
        rendered_lines = "\n".join(self.lines)
        return f"{rendered_lines}\n"

    def get_html(self) -> str:
        rendered_lines = "\n".join(self.lines)
        return f"{rendered_lines}\n"


@dataclass
class NoteRef(GrammarElement):
    def get_txt(self) -> str:
        rendered_lines = "".join(self.lines)
        return f"{line_comment(rendered_lines)}\n"

    def get_html(self) -> str:
        rendered_lines = "".join(self.lines)
        return f"<p>{line_comment(rendered_lines, False)}</p>\n"


@dataclass
class NoteList(GrammarElement):
    def get_txt(self) -> str:
        rendered_lines = ["Notes:"] + self.lines
        return block_comment(rendered_lines)

    def get_html(self) -> str:
        html_lines = [f"<p>{LINE_COMMENT_MARKER} <strong>Notes:</strong><br/>"]
        separator = f"<br/>\n{LINE_COMMENT_MARKER} "
        html_lines.append(f"{LINE_COMMENT_MARKER} {separator.join(self.lines)}")
        html_lines.append("</p>")
        rendered_lines = "\n".join(html_lines)
        return f"{rendered_lines}\n"


class GrammarExtractor:
    def __init__(self):
        self.start_timestamp = datetime.now(timezone.utc).isoformat(timespec="seconds").replace("+00:00", "Z")
        LOGGER.info(f"Run started at {self.start_timestamp}")
        self.elements: list[GrammarElement] = []
        self.spec_path: str = ""
        self.bnf_path: str = ""
        self.reserved_keyword_set: set[str] = set()
        self.extracted_keyword_set: set[str] = set()
        self.img_tokens: set[str] = set()

    def extract_bnf(self, spec_path: str, textual_notation_clause: str, graphical_notation_clause: str):
        self.spec_path = spec_path
        self.bnf_path = spec_path.replace(".html", "-bnf.txt")

        KEYWORD_PATTERN = re.compile(r"('[a-z]{2,}'|'@'|'$')")
        SEE_NOTE_PATTERN = re.compile(r"^\s*\(?See Note.*$", flags=re.IGNORECASE)

        with open(self.spec_path, mode="r", encoding="utf-8") as html_spec:
            soup = BeautifulSoup(html_spec, "html.parser")

        self.reserved_keyword_set: set[str] = set()
        self.extracted_keyword_set: set[str] = set()
        self.img_tokens: set[str] = set()

        inside_bnf_clause = False
        contains_note_reference = False
        contains_notes_section = False
        inside_reserved_symbols = False
        count = 0
        clause_number = ""
        clause_title = ""
        previous_bnf_tag = ""

        # Walk through all HTML elements (tags) and extract grammar productions (and notes)
        # from the textual or graphical notation clause
        for tag in soup.find_all():
            count += 1

            if tag.name == "h1":
                # Process clause heading
                contains_note_reference = False
                contains_notes_section = False
                inside_reserved_symbols = False
                # LOGGER.debug(f"tag{count}={tag}")

                class_attribute = tag.attrs.get("class")
                if class_attribute and "view-title" in class_attribute:
                    # LOGGER.debug(f"view-title tag={tag}")
                    clause_number = tag.find("span", {"class": "ve-view-number"}).string
                    clause_number = clause_number.strip() if clause_number else ""
                    clause_title = tag.find("transclude-name").find("span").string
                    clause_title = clause_title.strip() if clause_title else ""

                    if clause_number == textual_notation_clause:
                        inside_bnf_clause = True
                        LOGGER.debug(f"inside_bnf_clause={inside_bnf_clause}")
                    elif clause_number == graphical_notation_clause:
                        inside_bnf_clause = True
                        LOGGER.debug(f"inside_bnf_clause={inside_bnf_clause}")
                    elif inside_bnf_clause:
                        if clause_number.startswith(textual_notation_clause):
                            pass
                        elif graphical_notation_clause and clause_number.startswith(graphical_notation_clause):
                            pass
                        else:
                            inside_bnf_clause = False
                        LOGGER.debug(f"inside_bnf_clause={inside_bnf_clause}")

                    if inside_bnf_clause or clause_number == "":
                        clause_string = clause_title if clause_number == "" else f"Clause {clause_number} {clause_title}"
                        LOGGER.info(f"PROCESSING {clause_string}")
                        self.elements.append(Heading(clause_number, [clause_string]))

            elif tag.name == "pre" and inside_bnf_clause:
                # Process a <pre> element that contains BNF grammar lines
                LOGGER.debug(f"tag#{count}:\n{tag}")

                if tag.contents:
                    string_contents = "".join([x.string for x in tag.contents if x.string is not None])

                    if clause_title == "Lexical Structure" or clause_title == "Reserved Words":
                        # This <pre> element contains the list of reserved keywords
                        reserved_keyword_set = set(string_contents.strip().split())
                        current_production = Production(clause_number, ["RESERVED_KEYWORD ="], "RESERVED_KEYWORD", "")
                        self.elements.append(current_production)
                        is_first = True
                        for symbol in sorted(reserved_keyword_set):
                            if is_first:
                                current_production.lines.append(f"      '{symbol}'")
                                is_first = False
                            else:
                                current_production.lines.append(f"    | '{symbol}'")
                    elif clause_title == "Symbols" and not string_contents.startswith("TYPED_BY"):
                        reserved_symbol_set = set(string_contents.strip().split())
                        current_production = Production(clause_number, ["RESERVED_SYMBOL ="], "RESERVED_SYMBOL", "")
                        self.elements.append(current_production)
                        is_first = True
                        for symbol in sorted(reserved_symbol_set):
                            if is_first:
                                current_production.lines.append(f"      '{symbol}'")
                                is_first = False
                            else:
                                current_production.lines.append(f"    | '{symbol}'")
                    else:
                        # Parse lines for BNF Productions
                        # A Production always starts with a letter in column 1 and contains a "="
                        child_strings: list[str] = []
                        for child in tag.children:
                            if isinstance(child, Tag) and child.name == "img":
                                alt_attr = child.attrs.get("alt")
                                height_attr = child.attrs.get("height")
                                width_attr = child.attrs.get("width")
                                src_attr = child.attrs.get("src")
                                child_strings.append(f'<img alt="{alt_attr}" height="{height_attr}" width="{width_attr}" src="SRC_VALUE"/> {LINE_COMMENT_MARKER} orig_src="{src_attr}"')
                            elif child.string is not None:
                                child_strings.append(child.string)
                            else:
                                LOGGER.error(f"Unexpected tag child: {child}")
                        # Normalize child contents with clean_line
                        child_contents = "".join(child_strings)
                        child_contents = "\n".join([clean_line(x) for x in child_contents.split("\n")])
                        # Productions should be separated by double newlines
                        candidate_productions = child_contents.split("\n\n")
                        # Strip possible trailing newline of last production
                        candidate_productions[-1] = candidate_productions[-1].rstrip()
                        current_production: Optional[Production] = None
                        for candidate in candidate_productions:
                            img_count = candidate.count("<img ")
                            img_index = 0
                            if clause_number.startswith(textual_notation_clause):
                                # Store keywords appearing in textual notation productions
                                matched_keywords = KEYWORD_PATTERN.findall(candidate)
                                for matched_keyword in matched_keywords:
                                    self.extracted_keyword_set.add(matched_keyword[1:-1])
                            lines = candidate.split("\n")
                            line_number = 0
                            for line in lines:
                                if line == "":
                                    LOGGER.error(f"Unexpected empty line in candidate production: {candidate}")
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
                                    current_production = Production(clause_number, [line], name, abstract_type)
                                    self.elements.append(current_production)
                                    if line[0] == " ":
                                        LOGGER.error(f"Production line should start with non-space: {line}")
                                    if line.count("=") != 1:
                                        LOGGER.error(f"Production line should contain a single '=': {line}")
                                elif "<img " in line:
                                    img_postfix = ""
                                    if img_count > 1:
                                        img_index += 1
                                        img_postfix = f"-{img_index}"
                                    line.replace("SRC_VALUE", f"_svg/{current_production.name}{img_postfix}.svg")
                                elif SEE_NOTE_PATTERN.match(line):
                                    self.elements.append(NoteRef(clause_number, lines=[line]))
                                    contains_note_reference = True
                                else:
                                    current_production.lines.append(line)


                for subtag in tag:
                    if not subtag.name in (None, "em", "strong", "img"):
                        LOGGER.error(f"Unexpected tag inside <pre> element: tag={subtag}")

            elif tag.name == "p" and inside_bnf_clause and contains_note_reference:
                # LOGGER.debug(f"note <p> tag={tag}")
                if tag.string == "Notes":
                    contains_notes_section = True

            elif tag.name == "ol" and inside_bnf_clause and contains_notes_section:
                # LOGGER.debug(f"note <ol> tag={tag}")
                list_item_count = 0
                note_list = NoteList(clause_number, [])
                for subtag in tag:
                    if subtag.name == "li":
                        list_item_count += 1
                        text_content = clean_text_content(" ".join(subtag.stripped_strings), True)
                        note_content = f"Note {list_item_count}: {text_content}"
                        note_list.lines.append(note_content)
                self.elements.append(note_list)
                contains_note_reference = False
                contains_notes_section = False

    def report_checks(self) -> list[str]:
        buffer: list[str] = []

        buffer.append("Start of Textual Notation Grammar Checks")
        buffer.append("")

        # Check declared and scanned keywords
        buffer.append("Keywords extracted from textual BNF grammar scan:")
        buffer.extend([f"  '{kw}'" for kw in sorted(self.extracted_keyword_set)])

        reserved_set_diff_extracted = self.reserved_keyword_set - self.extracted_keyword_set
        reserved_set_diff_extracted_list = ", ".join(sorted(reserved_set_diff_extracted))

        extracted_set_diff_reserved = self.extracted_keyword_set - self.reserved_keyword_set
        extracted_set_diff_reserved_list = ", ".join(sorted(extracted_set_diff_reserved))

        buffer.append("Comparison of declared reserved keywords versus extracted keywords")
        buffer.append("")
        buffer.append("Declared reserved keywords not in extracted keywords:")
        buffer.append(f"  {reserved_set_diff_extracted_list}")
        buffer.append("")
        buffer.append("Extracted keywords not in declared reserved keywords:")
        buffer.append(f"  {extracted_set_diff_reserved_list}")

        buffer.append("")
        buffer.append("End of Textual Notation Grammar Checks")

        buffer.append("")
        buffer.append("Start of Graphical Notation Grammar Checks")
        buffer.append("img_tokens:")
        for img_token in sorted(self.img_tokens):
            buffer.append(img_token)
        buffer.append("End of Graphical Notation Grammar Checks")

        return buffer

    def dump_bnf_grammar_elements(self):
        bnf_elements_path = self.spec_path.replace(".html", "-bnf-elements.txt")
        with open(bnf_elements_path, mode="w", encoding="utf-8") as bnf_elements_file:
            for elem in self.elements:
                # bnf_elements_file.write(f"<{elem.__class__.__name__}> name={elem.name} type={elem.abstract_type} {'\n'.join(elem.lines)}\n")
                bnf_elements_file.write(f"{repr(elem)}\n")

    def write_txt(self):
        with open(self.bnf_path, mode="w", encoding="utf-8") as bnf_txt_file:
            bnf_txt_file.write(line_comment(f"Source document: {self.spec_path}\n"))
            bnf_txt_file.write(line_comment(f"Generated by bnf_grammar_extractor at: {self.start_timestamp}\n"))
            for elem in self.elements:
                bnf_txt_file.write(elem.get_txt())
            bnf_txt_file.write(line_comment("End of BNF"))

            report_lines = self.report_checks()
            bnf_txt_file.write(block_comment(report_lines))

    def write_html(self):
        HTML_HEAD = """\
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<style>
img {margin-left:35pt;}
h1 {font-size:20pt;}
h2 {font-size:18pt;}
h3 {font-size:16pt;}
h4 {font-size:14pt;}
h5 {font-size:14pt;}
h6 {font-size:14pt;}
</style>
</head>
<body>
"""
        bnf_html_path = self.bnf_path.replace(".txt", ".html")
        with open(bnf_html_path, mode="w", encoding="utf-8") as bnf_html_file:
            bnf_html_file.write(HTML_HEAD)
            for elem in self.elements:
                bnf_html_file.write(elem.get_html())
            bnf_html_file.write("</body>\n</html>\n")


def main(argv: list[str]) -> None:
    if len(argv) < 3 or len(argv) > 4 or argv[1] == "-h" or argv[1] == "--help":
        usage()
        return

    spec_path = argv[1]
    textual_notation_clause = argv[2]
    graphical_notation_clause = ""
    if len(argv) >= 4:
        graphical_notation_clause = argv[3]

    format = "text"
    # format = "html"

    grammar_extractor = GrammarExtractor()
    grammar_extractor.extract_bnf(spec_path, textual_notation_clause, graphical_notation_clause)
    grammar_extractor.write_txt()
    grammar_extractor.write_html()
    grammar_extractor.dump_bnf_grammar_elements()


def usage():
    print("""\
Usage: python bnf_grammar_extractor.py [options] <path/to/spec.html> <textual_notation_clause> [<graphical_notation_clause>]

options: 
-h or --help: Display this message and exit.
""")


if __name__ == "__main__":
    main(sys.argv)
