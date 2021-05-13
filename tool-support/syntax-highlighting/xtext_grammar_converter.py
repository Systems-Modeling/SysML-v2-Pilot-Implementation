"""
Basic TextMate grammar for kerml and sysml language as part of SysML 2 Pilot Implementation

Copyright (c) 2020 DEKonsult

Purpose: Syntax highlighting in VS Code  editor similar to Jupyter Notebook

Contributor(s):
- Hans Peter de Koning (DEKonsult)
"""

import sys
import os
import re
import textwrap
from typing import List, Set, Dict
import logging

NEW_LINE = "\n"


class DATA:
    LANGUAGE_NAME_DICT = {
        "KerML": "OMG Kernel Modeling Language",
        "SysML": "OMG Systems Modeling Language",
    }

    """
    Data template for TextMate language configuration file
    """
    TM_LANGUAGE_JSON_TEMPLATE = """\
{{
  "$schema": "https://raw.githubusercontent.com/martinring/tmlanguage/master/tmlanguage.json",
  "name": "{LANGUAGE_NAME}",
  "patterns": [
    {{
      "include": "#comments"
    }},
    {{
      "include": "#keywords"
    }},
    {{
      "include": "#quoted-variables"
    }},
    {{
      "include": "#strings"
    }}
  ],
  "repository": {{
    "keywords": {{
      "patterns": [
        {{ "match": "\\\\b({KEYWORDS})\\\\b", "name": "keyword.other.{LANGUAGE_NAME_LOWERCASE}" }},
        {{ "match": "({OPERATORS_LOGICAL})", "name": "keyword.operator.logical.{LANGUAGE_NAME_LOWERCASE}" }},
        {{ "match": "({OPERATORS_COMPARISON})", "name": "keyword.operator.comparison.{LANGUAGE_NAME_LOWERCASE}" }},
        {{ "match": "({OPERATORS_ARITHMETIC})", "name": "keyword.operator.arithmetic.{LANGUAGE_NAME_LOWERCASE}" }},
        {{ "match": "({OPERATORS_OTHER})", "name": "keyword.operator.other.{LANGUAGE_NAME_LOWERCASE}" }}
      ]
    }},
    "strings": {{
      "name": "string.quoted.double.{LANGUAGE_NAME_LOWERCASE}",
      "begin": "\\"",
      "end": "\\"",
      "patterns": [
        {{
          "name": "constant.character.escape.{LANGUAGE_NAME_LOWERCASE}",
          "match": "\\\\\\\\."
        }}
      ]
    }},
    "quoted-variables": {{
      "patterns": [{{ "match": "('[^\\\\f\\\\n\\\\r\\\\t\\\\v\\\\\\"\\\\\\\\]+?')", "name": "variable.name.quoted.{LANGUAGE_NAME_LOWERCASE}" }}]
    }},
    "comments": {{
      "patterns": [
        {{
          "captures": {{
            "0": {{
              "name": "punctuation.definition.comment.{LANGUAGE_NAME_LOWERCASE}"
            }}
          }},
          "match": "/\\\\*\\\\*/",
          "name": "comment.block.empty.{LANGUAGE_NAME_LOWERCASE}"
        }},
        {{
          "include": "#comments-inline"
        }}
      ]
    }},
    "comments-inline": {{
      "patterns": [
        {{
          "begin": "/\\\\*",
          "captures": {{
            "0": {{
              "name": "punctuation.definition.comment.{LANGUAGE_NAME_LOWERCASE}"
            }}
          }},
          "end": "\\\\*/",
          "name": "comment.block.{LANGUAGE_NAME_LOWERCASE}"
        }},
        {{
          "begin": "(^[ \\\\t]+)?(?=//)",
          "beginCaptures": {{
            "1": {{
              "name": "punctuation.whitespace.comment.leading.{LANGUAGE_NAME_LOWERCASE}"
            }}
          }},
          "end": "(?!\\\\G)",
          "patterns": [
            {{
              "begin": "//",
              "beginCaptures": {{
                "0": {{
                  "name": "punctuation.definition.comment.{LANGUAGE_NAME_LOWERCASE}"
                }}
              }},
              "end": "\\\\n",
              "name": "comment.line.double-slash.{LANGUAGE_NAME_LOWERCASE}"
            }}
          ]
        }}
      ]
    }}
  }},
  "scopeName": "source.{LANGUAGE_NAME_LOWERCASE}"
}}
"""

    """
    Data template for JetBrains language configuration file
    """
    JETBRAINS_LANGUAGE_TEMPLATE = """\
<filetype binary="false" description="{LANGUAGE_NAME_FULL}" name="{LANGUAGE_NAME}">
  <highlighting>
    <options>
      <option name="LINE_COMMENT" value="//" />
      <option name="COMMENT_START" value="/*" />
      <option name="COMMENT_END" value="*/" />
      <option name="HEX_PREFIX" value="" />
      <option name="NUM_POSTFIXES" value="" />
      <option name="HAS_BRACES" value="true" />
      <option name="HAS_BRACKETS" value="true" />
      <option name="HAS_PARENS" value="true" />
      <option name="HAS_STRING_ESCAPES" value="true" />
    </options>
    <keywords keywords="{KEYWORDS}" ignore_case="false" />
    <keywords2 keywords="{OPERATORS}" />
  </highlighting>
  <extensionMap>
    <mapping ext="{LANGUAGE_NAME_LOWERCASE}" />
  </extensionMap>
</filetype>
"""


class Converter(object):
    """
    Converter from xtext grammar definition file to TextMate grammar
    """

    def __init__(self):
        self.language_name: str = ""

        self.keywords: [str] = []
        self.def_keywords: [str] = []
        self.brackets: [str] = []
        self.operators: [str] = []
        self.operators_logical: [str] = []
        self.operators_comparison: [str] = []
        self.operators_arithmetic: [str] = []
        self.operators_other: [str] = []

    def parse_xtext_grammar(self, xtext_source_paths: List[str]):

        xtext_grammar = ""

        for xtext_source_path in xtext_source_paths:
            try:
                input_file = open(xtext_source_path, mode="r")
            except IOError as e:
                logging.fatal(e)
                sys.exit(1)
            logging.info(f"Parsing {xtext_source_path}")

            if xtext_grammar == "":
                self.language_name, extension = os.path.splitext(os.path.basename(xtext_source_path))

            xtext_grammar += input_file.read()
            input_file.close()

        xtext_grammar = xtext_grammar.replace("';'", "@SEMICOLON_LIT@").replace("'*/'", "@END_COMMENT_LIT@")

        # Remove all multiline comments - Flag DOTALL makes "." also match newlines
        multiline_comment_pattern = re.compile(r"(/[*]).*?([*]/)", flags=re.DOTALL)
        xtext_grammar = re.sub(multiline_comment_pattern, "", xtext_grammar)

        # Remove all single line comments
        line_comment_pattern = re.compile(r"//.*\n")
        xtext_grammar = re.sub(line_comment_pattern, "", xtext_grammar)

        # logging.debug(f"xtext_grammar with comments removed=\n{xtext_grammar}")

        # Split xtext_grammar into xtext statements list and restore the ';' tokens
        xtext_statements = [s.replace("@SEMICOLON_LIT@", "';'").strip() for s in xtext_grammar.split(";")]

        logging.debug(f"xtext_statements=\n{xtext_statements}")

        single_quote_string_pattern = re.compile(r"['][^']+[']")
        term_before_def_pattern = re.compile(r"([A-Za-z][A-Za-z0-9]*)\s+('def')")
        keyword_declaration_pattern = re.compile(r"([A-Z][A-Za-z0-9]*Keyword)\s*:\s+(.+)")
        keyword_def_declaration_pattern = re.compile(r"([A-Z][A-Za-z0-9]*DefKeyword)\s*:\s+(.+)")
        bracket_like_char_pattern = re.compile(r"^([(){}\[\]])")

        keywords_dict: Dict[str, List[str]] = dict()
        keywords_set: Set[str] = set()
        def_keywords_set: Set[str] = set()
        brackets_set: Set[str] = set()
        operators_set: Set[str] = set()

        # Collect token literals but skip the terminal statements
        for statement in xtext_statements:
            if statement.startswith("terminal"):
                continue

            keyword_match = keyword_declaration_pattern.match(statement)
            if keyword_match:
                keyword_variable = keyword_match.group(1)
                keyword_values = [x.strip().replace("'", "") for x in keyword_match.group(2).split("|")]
                logging.debug(f"Keyword VAR={keyword_variable} VAL={keyword_values}")
                keywords_dict[keyword_variable] = keyword_values

            raw_tokens = single_quote_string_pattern.findall(statement)
            for raw_token in raw_tokens:
                token = raw_token[1:-1].strip()
                if token.isidentifier():
                    keywords_set.add(token)
                    if token == "def":
                        match = term_before_def_pattern.search(statement)
                        if match:
                            def_keyword = match.group(1)
                            logging.debug(f"def_keyword={def_keyword}")
                elif bracket_like_char_pattern.match(token):
                    brackets_set.add(token)
                else:
                    operators_set.add(token)

        if len(keywords_dict) > 1:
            logging.info(f"The following {len(keywords_dict)} named keywords were found:")
            max_name_len = max(map(len, keywords_dict.keys()))
            logging.info(f"{'name':{max_name_len}s}   value")
            for var in sorted(keywords_dict.keys()):
                logging.info(f"{var:{max_name_len}s} = {keywords_dict[var]}")
                if var.endswith("DefKeyword"):
                    def_keyword_var = keywords_dict[var][0].split()[0]
                    def_keyword_value = [x for x in keywords_dict[def_keyword_var] if x.isalpha()][0]
                    def_keywords_set.add(def_keyword_value)

        # Remove interpunction terminals that should not be highlighted
        operators_set.remove(".")
        operators_set.remove(",")
        operators_set.remove(";")

        self.keywords = sorted(keywords_set)
        self.def_keywords = sorted(def_keywords_set)
        self.brackets = sorted(brackets_set)
        self.operators = sorted(operators_set)

        logging.info(f"Detected {len(self.keywords)} identifier keywords: {self.keywords}")
        logging.info(f"Detected {len(self.def_keywords)} def keywords: {self.def_keywords}")
        logging.info(f"Detected {len(self.operators)} operator-like tokens: {self.operators}")
        logging.info(f"Detected {len(self.brackets)} bracket-like tokens: {self.brackets}")

        self.operators_logical = []
        self.operators_comparison = []
        self.operators_arithmetic = []
        self.operators_other = []

        for operator in self.operators:
            if operator in ("@", "~", "->", "=>") or operator[0] in (":", "."):
                self.operators_other.append(operator)
            elif operator[0] in ("=", "<", ">", "!"):
                self.operators_comparison.append(operator)
            elif operator[0] in ("+", "-", "*", "/"):
                self.operators_arithmetic.append(operator)
            else:
                self.operators_logical.append(operator)

    def export_text_mate_language_file(self, target_path: str):

        text_mate_language_definition = DATA.TM_LANGUAGE_JSON_TEMPLATE.format(
            LANGUAGE_NAME=self.language_name,
            LANGUAGE_NAME_LOWERCASE=self.language_name.lower(),
            KEYWORDS="|".join(self.keywords),
            OPERATORS_LOGICAL="|".join([Converter.escape_regex(op) for op in self.operators_logical]),
            OPERATORS_COMPARISON="|".join([Converter.escape_regex(op) for op in self.operators_comparison]),
            OPERATORS_ARITHMETIC="|".join([Converter.escape_regex(op) for op in self.operators_arithmetic]),
            OPERATORS_OTHER="|".join([Converter.escape_regex(op) for op in self.operators_other])
        )

        output_file = open(target_path, "w")
        output_file.write(text_mate_language_definition)
        output_file.close()

        logging.info(f"Saved generated TextMate grammar in {target_path}")

    def export_jetbrains_language_file(self, target_path: str):

        jetbrains_language_definition = DATA.JETBRAINS_LANGUAGE_TEMPLATE.format(
            LANGUAGE_NAME=self.language_name,
            LANGUAGE_NAME_LOWERCASE=self.language_name.lower(),
            LANGUAGE_NAME_FULL=DATA.LANGUAGE_NAME_DICT[self.language_name],
            KEYWORDS=";".join(self.keywords),
            OPERATORS=";".join([Converter.convert_xml_special(op) for op in self.operators])
        )

        output_file = open(target_path, "w")
        output_file.write(jetbrains_language_definition)
        output_file.close()

        logging.info(f"Saved generated JetBrains language definition in {target_path}")

    def export_jupyter_code_mirror_mode_file(self, target_path: str):

        with open("./jupyter/mode.ts.template", mode="r") as template_file:
            code_mirror_mode_template = template_file.read()

        with open("./jupyter/additional_def_keywords.txt", mode="r") as additional_def_keywords_file:
            additional_def_keywords: Set[str] = set(["def"])
            for line in additional_def_keywords_file:
                # Skip comment lines
                if line.startswith("#") or line.startswith("//"):
                    continue
                keyword = line.strip()
                if keyword != "":
                    additional_def_keywords.add(keyword)
            logging.info(f"additional_def_keywords={sorted(additional_def_keywords)}")

        keywords_minus_atoms = list(self.keywords)
        keywords_minus_atoms.remove("false")
        keywords_minus_atoms.remove("true")
        keywords_minus_atoms.remove("null")

        def_keywords_set = set(self.def_keywords)
        def_keywords_set.update(additional_def_keywords)
        self.def_keywords = sorted(def_keywords_set)

        indent = 4*"\t"
        keywords_block = f"\n{indent}".join(textwrap.wrap('"'+'", "'.join(keywords_minus_atoms)+'"', 104))
        def_keywords_block = f"\n{indent}".join(textwrap.wrap('"'+'", "'.join(self.def_keywords)+'"', 104))

        code_mirror_mode_content = code_mirror_mode_template.format(
            KEYWORDS=keywords_block,
            DEF_KEYWORDS=def_keywords_block
        )

        output_file = open(target_path, "w")
        output_file.write(code_mirror_mode_content)
        output_file.close()

        logging.info(f"Saved generated CodeMirror language definition for Jupyter in {target_path}")

    @staticmethod
    def escape_regex(s: str) -> str:
        """
        Process string s by escaping special regex characters with backslash

        :param s: string to be processed
        :return: escaped string
        """
        chars_to_be_escaped = ("<", ">", "(", ")", "[", "]", "+", "-", "*", ".", "|", "?", "^")

        escaped_s = []
        for ch in s:
            if ch in chars_to_be_escaped:
                escaped_s.append(r"\\")
            escaped_s.append(ch)
        return "".join(escaped_s)

    @staticmethod
    def convert_xml_special(s: str) -> str:
        """
        Process string s by converting special XML entities

        :param s: string to be processed
        :return: converted string
        """
        xml_special_entities = {"<": "&lt;", ">": "&gt;", "&": "&amp;", "\"": "&quot;", "'": "&apos;"}

        converted_s = []
        for ch in s:
            converted_ch = xml_special_entities.get(ch, ch)
            converted_s.append(converted_ch)
        return "".join(converted_s)


if __name__ == "__main__":
    logging.basicConfig(level=logging.INFO)
    assert len(sys.argv) == 1
    converter = Converter()

    kerml_xtext_def = "../../org.omg.kerml.xtext/src/org/omg/kerml/xtext/KerML.xtext"
    kerml_expressions_xtext_def = "../../org.omg.kerml.expressions.xtext/src/org/omg/kerml/expressions/xtext/KerMLExpressions.xtext"
    converter.parse_xtext_grammar(xtext_source_paths=[kerml_xtext_def, kerml_expressions_xtext_def])
    converter.export_text_mate_language_file(target_path="./vscode/kerml/syntaxes/kerml.tmLanguage.json")
    converter.export_jetbrains_language_file(target_path="./jetbrains/KerML.xml")

    sysml_xtext_def = "../../org.omg.sysml.xtext/src/org/omg/sysml/xtext/SysML.xtext"
    converter.parse_xtext_grammar(xtext_source_paths=[sysml_xtext_def, kerml_expressions_xtext_def])
    converter.export_text_mate_language_file(target_path="./vscode/sysml/syntaxes/sysml.tmLanguage.json")
    converter.export_jetbrains_language_file(target_path="./jetbrains/SysML.xml")
    converter.export_jupyter_code_mirror_mode_file(target_path="./jupyter/mode.ts")
