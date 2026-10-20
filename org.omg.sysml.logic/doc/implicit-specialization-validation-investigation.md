# Implicit-specialization validation investigation

Timing figures for failed runs are diagnostic data only, not accepted performance
comparisons. Detailed cache investigation is a separate follow-up step.

## Initial comparison (2026-10-19, before history rewrite)


One fresh JVM per revision, sequential runs on the same machine with Temurin
21+35 and `-Xms2g -Xmx4g`. Both used the same 255 model files under `sysml/src`
and the same 94 library files, read in the same order from isolated source
snapshots. Both revisions received the same validation algorithm; each retained
its original specialization initialization and loading/resolution/transformation
sequence. The refactored jar was built in the current repository and run against
its isolated corpus copy. No specialization fix was applied.

Both full root `mvn clean verify` builds succeeded with tests enabled:
1,607 tests for `997d7670c` and 1,642 for `c5ccb15ca`, zero failures/errors and
22 skipped in each. The current tests also exercise the complete benchmark command
in fresh JVMs: a valid model succeeds, an unresolved import fails after printing
its timing/diagnostics, and semantic distinguishability warnings do not fail the run.

| Revision | load_libraries | load_models | resolution | transformation | validation |
| --- | ---: | ---: | ---: | ---: | ---: |
| `997d7670c` (before extraction) | 1.659 s | 1.025 s | 320.447 s (326 GC, 761 ms) | 6.274 s (6 GC, 55 ms) | 19.811 s (22 GC, 251 ms) |
| `c5ccb15ca` (after extraction) | 1.509 s | 0.902 s | 166.989 s (153 GC, 497 ms) | 6.735 s (6 GC, 59 ms) | 19.834 s (19 GC, 246 ms) |

**Delta within this pair:** resolution −153.458 s (−47.9%); transformation
+0.462 s (+7.4%); validation +0.023 s (+0.11%). Validation time is essentially
unchanged in this single pair; this is not a statistical performance comparison.

**Delta against the previously documented current mean:** resolution +21.259 s
(+14.6%) and transformation +0.355 s (+5.6%). These are observed slower times,
measured on a different date and using isolated corpus copies rather than the
original checkout. Validation has no previous measurement. The new phase runs
after the existing phases; these observations do not establish that it caused
the differences in their timings.

| Revision | Validated resources | Errors | Warnings | Infos | Exit status |
| --- | ---: | ---: | ---: | ---: | ---: |
| `997d7670c` | 349 | 0 | 0 | 0 | 0 |
| `c5ccb15ca` | 349 | 11 | 16 | 0 | 1 |

Resource-error counts before validation were 0 / 5 / 4 for the baseline and
0 / 0 / 0 for the refactored version at the loaded / resolved / transformed
checkpoints. The validation results above are the issues returned by Xtext,
not those earlier resource-error counts.

All eleven errors have code `validateConnectorBinarySpecialization` and message
`Cannot have more than two ends`, reproducing the reported Eclipse diagnostics:

| Model under `sysml/src` | Lines |
| --- | --- |
| `examples/Cause and Effect Examples/CauseAndEffectExample.sysml` | 48, 49 |
| `examples/Cause and Effect Examples/MedicalDeviceFailure.sysml` | 22 |
| `training/41. Language Extension/User Keyword Example.sysml` | 20, 26 |
| `validation/14-Language Extensions/14c-Language Extensions.sysml` | 163, 169, 175, 179, 187, 188 |

All sixteen warnings have code `validateNamespaceDistinguishablity`. Eleven are
inherited-name duplicates at the same connection sites as the errors. Five more
concern `incomingTransferSort` in
`examples/Interaction Sequencing Examples/ServerSequenceOutsideRealization-2.sysml`,
lines 70, 71, 72, 83 and 84; their cause has not been established by this comparison.

The current cache checkpoints were:

| Checkpoint | Types | Cached | Complete | Uncached |
| --- | ---: | ---: | ---: | ---: |
| loaded | 55,283 | 0 | 0 | 55,283 |
| resolved | 60,450 | 28,402 | 2,786 | 32,048 |
| transformed | 70,357 | 70,330 | 70,085 | 27 |

These contain four more types at loading and eight more at resolution/transformation
than the earlier documented current runs, despite the same input corpus. The
comparison with historical timings therefore does not assume identical internal
model state.


#### Reduced reproducer and diagnostic observations

The following model, with the standard libraries loaded, validates without issues
on `997d7670c`. On `c5ccb15ca` it produces one
`validateConnectorBinarySpecialization` error and one inherited-name warning:

```sysml
package Regression {
    private import CauseAndEffect::*;
    occurrence a;
    occurrence b;
    #causation connect a to b;
}
```

The connection owns two ends, but `TypeUtil.getEndFeatureOf` returns three: its
two owned ends and the inherited `Causation::theEffect`. After validation, the
connection adapter's cached `redefinedFeatures` snapshot contains only
`Links::BinaryLink::source`, whereas the owned ends' implicit candidates already
contain redefinitions of `Causation::theCause` / `Links::BinaryLink::source` and
`Causation::theEffect` / `Links::BinaryLink::target`, respectively. The two ends'
raw and reduced specialization caches are still marked incomplete.

In a separate diagnostic JVM, clearing only the connection's ElementAdapter
caches with `ElementUtil.clearCachesOf(connection)`, then validating again,
removes both diagnostics and leaves two effective ends. The experiment performs
no model edit or explicit specialization-cache invalidation. It identifies a
consistency problem between adapter-derived redefinition/member views and the
service's evolving results. It is diagnostic evidence, not an implemented cache
invalidation policy or a production workaround. The exact lifecycle correction
remains a separate change.

The original benchmark missed the errors because it never invoked the resource
validator or inspected its returned semantic issues. Loading, resolving and
transforming these same files can leave `Resource.getErrors()` empty while the
validator reports the eleven connector errors. The added phase now detects this
regression and gives the command a failing exit status. The reduced reproducer
also demonstrates that Eclipse project rebuilds are not required to expose it.

## Verification after history rewrite (2026-10-19)

The preparatory commit `e70a73181` includes the validation phase and its three
command-line tests. The following refactoring commit preserves that validation
code and those tests unchanged, adding only the extracted service's cache setup
and cache checkpoints to the benchmark. Both were built separately with the full
root `mvn clean verify`: 1,607 and 1,642 tests respectively, zero failures/errors
and 22 skipped in each build. Each commit includes its own rebuilt bundled jars.

One fresh JVM per commit used the protocol and inputs documented in
[benchmark results](../../org.omg.sysml.interactive/doc/benchmark-results.md).
The preparatory commit validated 349 resources without errors, warnings or infos
and exited with status 0. Its validation phase took 20.438 s (22 GC, 253 ms).

The refactoring commit validated the same 349 resources, reported the same eleven
connector errors at the file/line locations listed above and sixteen
distinguishability warnings, then exited with status 1. Its phase measurements
below are diagnostic data from a failed run, excluded from accepted performance
comparisons:

| Phase | Wall time | GC count | GC time |
| --- | ---: | ---: | ---: |
| `load_libraries` | 1.454 s | 7 | 35 ms |
| `load_models` | 0.908 s | 3 | 19 ms |
| `resolution` | 160.918 s | 152 | 444 ms |
| `transformation` | 6.693 s | 6 | 57 ms |
| `validation` | 19.229 s | 20 | 264 ms |

The results confirm that the benchmark now detects the reported regression.
No cache lifecycle correction was applied during this history rewrite; detailed
cache analysis remains the next review step.


## Common conservative predicate experiment (2026-10-20)

This experiment starts from `283a8ca6f`, on branch
`experiment/ST6RI-969-conservative-cache-20261020`. The main checkout is on a
separate ST6RI-971 revision with independent user changes, so the experiment is
isolated in a worktree. Its inputs under `sysml.library` and `sysml/src` are
unchanged from the validated refined-predicate experiment `633d3820f`.

All three TypeAdapter collections use the same `canCacheDerivedViews()` predicate:
no active service evaluation in the model, a complete raw owner result, a complete
reduced owner result after transformation, and a persistent cache with stable redefinitions for every
owned Feature. Computation and return remain unconditional;
only retention is conditional. The service recursion guard and rule ordering are
unchanged. No per-collection dependency traversal or validation-specific clear is
included. This is the first conservative prototype promoted to a reviewable change,
not a relaxation of the refined implementation.

Six integration tests cover metadata connectors, an uncached model, cyclic
inheritance, private library redefinition filtering and membership reuse after
an outermost evaluation. The full root `mvn clean verify` succeeded in 11:01
minutes: 1,648 tests, zero failures/errors, 22 skipped. All six new tests passed.

The full benchmark succeeded: 349 resources, zero errors, warnings or infos.
The validated measurements and deltas are recorded in
[benchmark results](../../org.omg.sysml.interactive/doc/benchmark-results.md).
The benchmark jar comes from this worktree, while the textual inputs come from
the original checkout to retain its filesystem library reading order. SHA-256
checks confirmed that all 349 textual inputs match the worktree before and after
the run. No user Java changes from the separate ST6RI-971 checkout enter this jar.

On this single run, the simple predicate preserves the successful validation of
the refined predicates. The raw/reduced service cache counters are identical at
all checkpoints; those counters do not measure TypeAdapter collection reuse.
The total measured time is 1.2% higher than the refined variant: resolution is
5.7% slower, transformation 12.3% faster and validation 21.5% faster. Those timing
differences do not establish a repeatable performance advantage. Transformation
remains 110.7% slower than before extraction.

This supports keeping the common predicate as the simpler candidate for review.
It does not prove correctness for every inheritance graph or replace an Eclipse
clean/build reproduction. No Eclipse runtime clean/build was performed during
this experiment, and retained collections still rely on normal invalidation
after semantic edits.
