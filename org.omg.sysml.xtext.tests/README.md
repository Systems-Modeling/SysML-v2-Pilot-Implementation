# org.omg.sysml.xtext.tests

Model-driven JUnit tests for the KerML and SysML Xtext languages. The test *logic* is a
small, fixed set of Java classes; the test *cases* are plain `.kerml` / `.sysml` model files
that live outside the Java source tree and are discovered at run time. Adding a test case
means adding a model file, not writing Java.

This bundle is intended to replace the Xpect-based test bundles
(`org.omg.kerml.xpect.tests`, `org.omg.sysml.xpect.tests`) over time.

## Running

The bundle is an ordinary module of the Tycho build and its tests run in the `test` phase
(reports land in `target/surefire-reports`, which the CI workflow already publishes):

```sh
./mvnw verify                                    # whole build, including these tests
./mvnw verify -pl org.omg.sysml.xtext.tests      # this module only (upstream bundles must be built/installed)
./mvnw verify -DskipTests                        # skip all tests
```

In Eclipse the bundle is a normal plug-in project; run `ParserTest` as a JUnit 4 test with the
project directory as the working directory (the default), so the relative default model root
resolves.

### System properties

| Property                     | Meaning                                                                                                   | Default (set by `pom.xml`)              |
|------------------------------|-----------------------------------------------------------------------------------------------------------|-----------------------------------------|
| `sysml.tests.parser.roots`   | Directories (or single files) scanned recursively for parser test models. Several entries are separated by the platform path separator (`;` on Windows, `:` elsewhere). | `<bundle>/models/parser`                |
| `sysml.tests.validation.manifests` | JSON manifest file(s) listing the validation test cases, separated like the parser roots.        | `<bundle>/models/validation/tests.json` |
| `sysml.tests.library.path`   | Directory of the standard library, for the validation tests.                                              | `<repo>/sysml.library`                  |

Both are Maven properties as well, so they can be overridden on the command line:

```sh
./mvnw test -pl org.omg.sysml.xtext.tests "-Dsysml.tests.parser.roots=C:\models\kerml;C:\models\sysml"
```

## Parser tests

Class: `org.omg.sysml.xtext.tests.parser.ParserTest` (JUnit 4, parameterized).

Every `.kerml` / `.sysml` file found under the parser roots is one test case, named by the
file's path relative to its root. A case passes if and only if the file is parsed without
syntax errors. Nothing else is done with the model: proxies are not resolved and no validation
runs, so the models do not need the standard library and may reference names that do not
exist. On failure the message lists each syntax error with its line number.

Layout of the default root:

```
models/parser/
  kerml/**/*.kerml
  sysml/**/*.sysml
```

Sub-directories are free-form; they only affect the reported test name.

The current corpus (`<Rule>_<n>.kerml` / `.sysml`, including the `_nontrivial_`
variants) is generated from the KerML and SysML textual-notation grammars (the `kebnf`
grammar files), one or more snippets per grammar rule, named after the rule they exercise.
Two files, `RootNamespace_2.kerml` and `RootNamespace_2.sysml`, are intentionally empty: an
empty file is a valid root namespace. Regenerate the corpus from the grammars rather than
editing these files by hand.

## Validation tests

Class: `org.omg.sysml.xtext.tests.validation.ValidationTest` (JUnit 4, parameterized).

The test cases are listed in a JSON **manifest** (default `models/validation/tests.json`,
overridable with `sysml.tests.validation.manifests`; several manifests may be given, separated
like the parser roots). Each entry names a model file, the validation rule it targets and the
expected outcome:

```json
[
  { "file": "validateFlowEndIsEnd_invalid1.sysml", "rule": "validateFlowEndIsEnd", "expected": "invalid" },
  { "file": "validateFlowEndIsEnd_valid1.sysml",   "rule": "validateFlowEndIsEnd", "expected": "valid" }
]
```

| Key        | Content                                                                                                   |
|------------|-----------------------------------------------------------------------------------------------------------|
| `file`     | Model file (`.sysml` or `.kerml`), relative to the directory of the manifest.                             |
| `rule`     | Name of the validation constraint from the specification, e.g. `validateFlowEndIsEnd`.                    |
| `expected` | `"valid"` or `"invalid"`.                                                                                 |
| `code`     | Optional. The issue code the pilot implementation reports for the rule, when it differs from the rule name. |
| `comment`  | Optional free text, ignored.                                                                              |

The same file may appear in several entries (one per rule it exercises). The model files
themselves carry no annotations; the current ones come from the Conformance Working Group's
test repository and follow its `<rule>_(valid|invalid)<n>` file naming, but only the manifest
is authoritative.

### What is checked

The model is parsed, linked against the standard library (loaded once per JVM from
`sysml.tests.library.path`) and validated with all checks enabled. The pilot's validators tag
every issue with an *issue code* equal to the name of the spec constraint, which is what the
test looks at:

* **invalid**: passes if at least one reported issue, of any severity, carries the rule's code,
  anywhere in the model. Other issues are ignored.
* **valid**: passes if no issue carries the rule's code and no issue of severity ERROR is
  reported at all (syntax and linking errors included). Warnings from other rules are tolerated.

On failure the message lists every reported issue as `SEVERITY line:column code  message`, so
the manifest or the model can be corrected from the output. Location-precise expectations
(line, element, message) are deliberately out of scope for now; the manifest format leaves
room to add them per entry later.
