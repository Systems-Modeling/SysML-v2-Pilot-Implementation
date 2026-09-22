# SysMLInteractiveModelBenchmark results

## Protocol

`SysMLInteractiveModelBenchmark` measures loading, resolving, transforming and
validating the standard libraries and a recursively discovered SysML corpus.
Run it once in a fresh JVM, after a full root build with tests enabled:

```sh
mvn clean verify
java -Xms2g -Xmx4g \
  -cp org.omg.sysml.interactive/target/org.omg.sysml.interactive-<version>-all.jar \
  org.omg.sysml.interactive.profiler.SysMLInteractiveModelBenchmark \
  sysml.library sysml/src
```

The fixed inputs are `sysml.library` and `sysml/src` (255 `.sysml` model files,
94 library files, 349 loaded resources). Use the same Java version, heap settings,
input contents and library reading order when comparing runs. Each measurement
is one fresh JVM, without warm-up or repetition; timings depend on machine load.

The five phases run in order: `load_libraries`, `load_models`, `resolution`,
`transformation`, `validation`. Each produces
`BENCHMARK,<phase>,<wall_seconds>,<gc_count>,<gc_milliseconds>`.

Validation calls each loaded textual resource's Xtext resource validator with
`CheckMode.ALL`, including libraries and dependencies loaded during validation.
Diagnostics are collected during the measurement and printed afterward as
`VALIDATION,<severity>,<problem-uri>,<line>,<code>,<message>`. Diagnostic text is
unescaped and intended for reading, not CSV parsing. The command also reports the
number of validated resources and issue totals by severity. It exits in failure
after reporting all issues if validation errors exist; a validator exception also
fails the run. Warnings do not change the exit status.

`Resource diagnostics` at earlier checkpoints count `Resource.getErrors()` only;
semantic validation issues are counted separately. Only runs whose final
validation succeeds belong in the accepted results below. Failed runs and their
investigation belong in a separate document and must not be used as accepted
performance comparisons.

The extracted service is installed with caching enabled for every type, matching
`XTextImplicitSpecializationService`. Outside the timed phases, the command reports
`CACHES,<checkpoint>,types=...,cached=...,complete=...,uncached=...` after loading,
resolution and transformation. `complete` counts caches whose raw and reduced
results are both complete; reading these counters does not calculate candidates.

## Accepted results

### Before the implicit-specialization extraction

Measured on 2026-10-19, Linux WSL2, Temurin 21+35, `-Xms2g -Xmx4g`, with the fixed
inputs above and the `ElementAdapter` specialization mechanism. The full root
`mvn clean verify` succeeded: 1,607 tests, zero failures/errors, 22 skipped.

| Run | load_libraries | load_models | resolution | transformation | validation |
| --- | ---: | ---: | ---: | ---: | ---: |
| 1 | 1.512 s (7 GC, 38 ms) | 1.085 s (2 GC, 12 ms) | 342.240 s (326 GC, 776 ms) | 6.812 s (6 GC, 56 ms) | 20.438 s (22 GC, 253 ms) |

Final validation: **349 resources, zero errors, zero warnings, zero infos; exit
status 0**. Resource-error counts at the loaded / resolved / transformed
checkpoints were 0 / 5 / 4.

This is the initial validated baseline for subsequent specialization changes.

## Refactoring evaluation

No validated result is available for the extracted service yet. Its latest run
failed semantic validation and is excluded from accepted performance comparisons.
Diagnostics and investigation notes are recorded in the
[validation investigation](../../org.omg.sysml.logic/doc/implicit-specialization-validation-investigation.md).
