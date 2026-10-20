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

### Extracted service with per-collection retention predicates

Measured on 2026-10-19 in the same environment, with Temurin 21+35,
`-Xms2g -Xmx4g` and the fixed inputs above. This is the working tree based on
`283a8ca6f`, with the TypeAdapter collection-retention correction; it does not
include the dedicated redefinition-path experiment. The full root
`mvn clean verify` succeeded: **1,652 tests, zero failures/errors, 22 skipped**.
No build or diagnostic JVM ran concurrently with this fresh-JVM benchmark.

| Run | load_libraries | load_models | resolution | transformation | validation |
| --- | ---: | ---: | ---: | ---: | ---: |
| 2 | 1.443 s (7 GC, 33 ms) | 0.891 s (3 GC, 20 ms) | 170.764 s (158 GC, 429 ms) | 16.369 s (17 GC, 142 ms) | 25.235 s (22 GC, 261 ms) |

Final validation: **349 resources, zero errors, zero warnings, zero infos; exit
status 0**. Resource-error counts at the loaded / resolved / transformed
checkpoints were 0 / 0 / 0.

| Checkpoint | Types | Cached | Complete raw and reduced | Uncached |
| --- | ---: | ---: | ---: | ---: |
| loaded | 55283 | 0 | 0 | 55283 |
| resolved | 60450 | 28402 | 2786 | 32048 |
| transformed | 70357 | 70330 | 70083 | 27 |

Compared with the preceding validated baseline, resolution decreased by 171.476 s (50.1%), transformation increased by 9.556 s (140.3%), and validation increased by 4.797 s (23.5%). The sum of the five timed phases decreased from 372.087 s to 214.701 s (42.3%). These are individual fresh-JVM observations, not a statistical estimate.

### Extracted service with one conservative retention predicate

Measured on 2026-10-20, Temurin 21+35, `-Xms2g -Xmx4g`, on
`experiment/ST6RI-969-conservative-cache-20261020`, based on `283a8ca6f`.
All three derived TypeAdapter collections use `canCacheDerivedViews()`; the
service recursion guard is unchanged. The full root `mvn clean verify` succeeded:
**1,648 tests, zero failures/errors, 22 skipped**, in 11:01 minutes. This includes
six integration regressions for this variant.

The benchmark uses the shaded jar built in the isolated worktree and reads
`sysml.library` and `sysml/src` from the original checkout. All 349 textual files
were checked byte-for-byte against the worktree inputs. This preserves the
original library reading order, which depends on filesystem enumeration. No build
ran concurrently with the fresh-JVM benchmark.

| Run | load_libraries | load_models | resolution | transformation | validation |
| --- | ---: | ---: | ---: | ---: | ---: |
| 3 | 1.576 s (7 GC, 37 ms) | 0.978 s (2 GC, 10 ms) | 180.507 s (158 GC, 448 ms) | 14.354 s (16 GC, 131 ms) | 19.811 s (20 GC, 252 ms) |

Final validation: **349 resources, zero errors, zero warnings, zero infos; exit
status 0**. Resource-error counts at the loaded / resolved / transformed
checkpoints were 0 / 0 / 0.

| Checkpoint | Types | Cached | Complete raw and reduced | Uncached |
| --- | ---: | ---: | ---: | ---: |
| loaded | 55283 | 0 | 0 | 55283 |
| resolved | 60450 | 28402 | 2786 | 32048 |
| transformed | 70357 | 70330 | 70083 | 27 |

Compared with the preceding validated run (2), resolution increased by 9.743 s
(5.7%), transformation decreased by 2.015 s (12.3%), and validation decreased by
5.425 s (21.5%). The sum of the five timed phases increased from 214.701 s to
217.225 s (1.2%). Compared with the pre-extraction baseline (1), resolution is
47.3% lower, transformation is 110.7% higher, and the five-phase total is 41.6%
lower. These are individual fresh-JVM observations, not a statistical estimate.

Intermediate failed evaluations and diagnostic optimization experiments remain
excluded from accepted performance comparisons; see the
[validation investigation](../../org.omg.sysml.logic/doc/implicit-specialization-validation-investigation.md).
