# org.omg.kerml.xtext.tests

Model-driven JUnit tests for the KerML Xtext language: every `.kerml` file under
`models/parser` is one parser test case (`org.omg.kerml.xtext.tests.parser.ParserTest`),
which passes if and only if the file parses without syntax errors.

This bundle is the KerML counterpart of `org.omg.sysml.xtext.tests` and carries its own copy
of the small test harness, so the two bundles are independent. See the README of
`org.omg.sysml.xtext.tests` for the full description of the harness, how to run the tests
from Maven or Eclipse, and the validation tests (which live there for both languages).

The parser test roots can be overridden with `-Dkerml.tests.parser.roots=<dir>[;<dir>...]`
(default: `models/parser` in this bundle). The corpus is generated from the KerML textual
notation grammar, one or more snippets per grammar rule; `RootNamespace_2.kerml` is
intentionally empty, since an empty file is a valid root namespace.
