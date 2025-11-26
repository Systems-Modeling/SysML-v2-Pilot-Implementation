import os
import sys
import json
import re
import argparse
from datetime import datetime, timezone
from dataclasses import dataclass
from enum import Enum, auto
from textwrap import wrap
from typing import Optional, Iterable, Any

from lark import Lark, Transformer, Tree, UnexpectedInput

# Create logger for debug, info, warning, error, critical messages
import logging
LOGGER = logging.getLogger()


class BnfParser:
    def __init__(self) -> None:
        self.bnf_filepath: Optional[str] = None
        self.parser: Optional[Lark] = None

    def parse(self, bnf_filepath: str) -> None:
        self.bnf_filepath = bnf_filepath
        basename, ext = os.path.splitext(bnf_filepath)
        grammar_file = None
        if ext == ".kebnf":
            grammar_file = "kebnf_textual_grammar.lark"
        elif ext == ".kgbnf":
            grammar_file = "kgbnf_graphical_grammar.lark"
        else:
            LOGGER.critical(f"Unrecognized file extension for BNF_PATH {bnf_filepath}")

        self.parser = Lark.open(grammar_file, rel_to=__file__, parser="lalr")

        bnf_file = open(bnf_filepath, "r", encoding="utf-8")
        bnf_input = bnf_file.read()
        bnf_file.close()

        try:
            parse_tree = self.parser.parse(bnf_input)
        except UnexpectedInput as e:
            LOGGER.error(f"Parse error in {self.bnf_filepath}:\n{e}")
        else:
            LOGGER.info(f"Parse completed successfully")
            LOGGER.info(f"Resulting parse tree:\n\n{parse_tree.pretty()}")


def main() -> None:
    # Initialize logging
    LOGGER.setLevel(logging.DEBUG)
    formatter = logging.Formatter("%(levelname)-8s: %(message)s")

    console_handler = logging.StreamHandler()
    console_handler.set_name("console")
    console_handler.setLevel(logging.INFO)
    console_handler.setFormatter(formatter)
    LOGGER.addHandler(console_handler)

    file_handler = logging.FileHandler("kerml_sysml_bnf_parser.log", mode="w", encoding="utf-8")
    file_handler.set_name("logfile")
    file_handler.setLevel(logging.INFO)
    file_handler.setFormatter(formatter)
    LOGGER.addHandler(file_handler)

    # Parse command line
    parser = argparse.ArgumentParser(
        prog="kerml_sysml_bnf_parser",
        allow_abbrev=False,
        description="Parse textual and/or graphical KerML or SysML BNF grammars.")
    parser.add_argument("bnf_path", metavar="BNF_PATH", type=str, help="Path to plain text BNF file with extension .kebnf or .kgbnf")
    args = parser.parse_args()
    LOGGER.debug(f"args={args}")
    LOGGER.debug(f"cwd={os.getcwd()}")

    bnf_parser = BnfParser()
    bnf_parser.parse(args.bnf_path)


if __name__ == "__main__":
    main()
