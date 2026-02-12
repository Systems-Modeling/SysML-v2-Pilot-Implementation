#!python

"""
bnf_file_parser is a command line tool that parses a KerML or SysML plain text grammar file.

The supported file formats are:
- .kebnf for a KerML or SysML textual notation grammar
- .kgbnf for a SysML graphical notation grammar

Its usage is described below in the main() function.

@author: Hans Peter de Koning (DEKonsult)

Requirements:

This tool requires installation of the following packages:
- lark (See https://pypi.org/project/lark)

"""

import sys
import os
import shutil
import argparse
from datetime import datetime, timezone
from typing import Optional
from lark import Lark, UnexpectedInput

# Create logger for debug, info, warning, error, critical messages
import logging
LOGGER = logging.getLogger()


class BnfParser:
    def __init__(self) -> None:
        self.start_timestamp: Optional[datetime] = None
        self.bnf_filepath: Optional[str] = None
        self.parser: Optional[Lark] = None

    def parse(self, bnf_filepath: str) -> None:
        self.start_timestamp = datetime.now(timezone.utc).isoformat(timespec="seconds").replace("+00:00", "Z")
        self.bnf_filepath = bnf_filepath

        LOGGER.info(f"Started parsing {self.bnf_filepath} at {self.start_timestamp}")

        basename, ext = os.path.splitext(bnf_filepath)
        grammar_file = None
        if ext == ".kebnf":
            grammar_file = "kebnf_textual_grammar.lark"
        elif ext == ".kgbnf":
            grammar_file = "kgbnf_graphical_grammar.lark"
        else:
            LOGGER.critical(f"Unrecognized file extension for BNF_PATH {bnf_filepath}, terminating ...")
            sys.exit(1)

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
            LOGGER.info(f"The resulting (AST) parse tree is:\n\n{parse_tree.pretty()}")


def main() -> None:
    # Initialize logging
    LOGGER.setLevel(logging.DEBUG)
    formatter = logging.Formatter("%(levelname)-8s: %(message)s")

    console_handler = logging.StreamHandler()
    console_handler.set_name("console")
    console_handler.setLevel(logging.INFO)
    console_handler.setFormatter(formatter)
    LOGGER.addHandler(console_handler)

    log_file_name = "bnf_file_parser.log"
    if os.path.exists(log_file_name):
        # Create backup copy of the log-file to inspect differences between runs
        shutil.copy2(log_file_name, log_file_name + ".backup")

    file_handler = logging.FileHandler(log_file_name, mode="w", encoding="utf-8")
    file_handler.set_name("logfile")
    file_handler.setLevel(logging.INFO)
    file_handler.setFormatter(formatter)
    LOGGER.addHandler(file_handler)

    LOGGER.debug(f"bnf_grammar_parser started in {os.getcwd()}")

    # Parse command line
    parser = argparse.ArgumentParser(
        prog="bnf_file_parser",
        allow_abbrev=False,
        description="Parse KerML or SysML grammar files in textual or graphical BNF format.")
    parser.add_argument("bnf_path", metavar="BNF_PATH", type=str, help="Path to plain text BNF file with extension .kebnf or .kgbnf")
    args = parser.parse_args()
    LOGGER.debug(f"args={args}")

    # Run the parser
    bnf_parser = BnfParser()
    bnf_parser.parse(args.bnf_path)


if __name__ == "__main__":
    main()
