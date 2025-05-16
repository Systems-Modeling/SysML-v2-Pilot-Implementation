import re
from typing import Optional, Union

from unicode_characters import unicode_superscript_dict, unicode_dot_operator

import logging
LOGGER = logging.getLogger()

SPACES_PER_INDENT_LEVEL = 4
INDENT_STRING = SPACES_PER_INDENT_LEVEL * " "
SYSML_KEYWORDS = {
    "about", "abstract", "accept", "action", "actor", "after", "alias", "all", "allocate", "allocation", "analysis", "and", "as", "assert", "assign", "assoc", "assume", "at", "attribute", "bind",
    "binding", "block", "by", "calc", "case", "comment", "concern", "connect", "connection", "constraint", "crosses", "decide", "def", "default", "defined", "dependency", "derived", "do", "doc",
    "else", "end", "entry", "enum", "event", "exhibit", "exit", "expose", "filter", "first", "flow", "for", "fork", "frame", "from", "hastype", "if", "implies", "import", "in", "include",
    "individual", "inout", "interface", "istype", "item", "join", "language", "loop", "merge", "message", "metadata", "nonunique", "not", "objective", "occurrence", "of", "or", "ordered", "out",
    "package", "parallel", "part", "perform", "port", "private", "protected", "public", "readonly", "redefines", "ref", "references", "render", "rendering", "rep", "require", "requirement", "return",
    "satisfy", "send", "snapshot", "specializes", "stakeholder", "state", "subject", "subsets", "succession", "terminate", "then", "timeslice", "to", "transition", "until", "use", "variant",
    "variation", "verification", "verify", "via", "view", "viewpoint", "when", "while", "xor"
}


def c(level: int, statement: str, newline: bool = True) -> str:
    """"Return indented source code string"""
    newline_string = "\n" if newline else ""
    return f"{level * INDENT_STRING}{statement}{newline_string}"


def removeprefix(s: str, prefix: str) -> str:
    len_prefix = len(prefix)
    return s[len_prefix:] if len_prefix > 0 and s.startswith(prefix) else s


def removesuffix(s: str, suffix: str) -> str:
    len_suffix = len(suffix)
    return s[:-len_suffix] if len_suffix > 0 and s.endswith(suffix) else s


def quote_non_ascii(name: str) -> str:
    return name if name.isascii() or name.startswith("'") else f"'{name}'"


def convert_excel_boolean(val: Union[str, bool]) -> Optional[bool]:
    if isinstance(val, bool):
        return val
    elif val == "TRUE":
        return True
    elif val == "FALSE":
        return False
    else:
        return None


def is_length_unit_name(unit_name: str) -> bool:
    return unit_name.endswith("metre") or unit_name in ["inch", "foot", "yard", "mile"]


def convert_phrase_to_pascal_case(name: str) -> str:
    return name.replace("-", " ").replace("(", " ").replace(")", " ").title().replace(" ", "")


def convert_to_lowercase_first_letter(name: str) -> str:
    if name == "" or name is None:
        raise ValueError("Received empty string or None")
    return f"{name[0].lower()}{name[1:]}"


def convert_unit_to_unicode(unit_symbol: str) -> str:
    ch_buffer = []
    is_in_exponent = False
    for ch in unit_symbol:
        new_ch = unicode_superscript_dict.get(ch, None)
        if new_ch is None:
            if ch == "^":
                is_in_exponent = True
            elif ch == "*":
                ch_buffer.append(unicode_dot_operator)
                is_in_exponent = False
            else:
                ch_buffer.append(ch)
                is_in_exponent = False
        else:
            ch_buffer.append(new_ch if is_in_exponent else ch)

    return "".join(ch_buffer)


def quote_non_basic_identifier(name: str) -> str:
    basic_identifier_pat = re.compile(f"^([A-Za-z_][A-Za-z0-9_]*)|('[A-Za-z_][A-Za-z0-9_]*')$")
    if len(name) == 0:
        return name
    # remove embedded single quote
    name = name.replace("'", "")
    is_basic_identifier = basic_identifier_pat.fullmatch(name) and name not in SYSML_KEYWORDS
    if name in SYSML_KEYWORDS:
        LOGGER.warning(f"Name '{name}' was single quoted because it is a SysML keyword")
    result = name if is_basic_identifier else f"'{name}'"
    return result


def quote_embedded_unit_names(unit_symbol: str) -> str:
    name_pat = re.compile(r"[^*/^()]+")
    prev_start = 0
    new_strings = []
    for match in name_pat.finditer(unit_symbol):
        start = match.start()
        end = match.end()
        symbol = unit_symbol[start:end]
        if symbol.isascii() and symbol not in SYSML_KEYWORDS:
            new_strings.append(unit_symbol[prev_start:end])
            prev_start = end
        else:
            if symbol in SYSML_KEYWORDS:
                LOGGER.warning(f"Unit symbol '{symbol}' was single quoted because it is a SysML keyword")
            symbol = f"'{symbol}'"
            if prev_start < start:
                new_strings.append(unit_symbol[prev_start:start])
            new_strings.append(symbol)
            prev_start = end
    new_strings.append(unit_symbol[prev_start:])
    new_unit_symbol = "".join(new_strings)
    return new_unit_symbol


if __name__ == "__main__":
    print(f"SYSML_KEYWORDS contains {len(SYSML_KEYWORDS)} keywords")
