# SysMLInteractiveModelBenchmark results

## Scope

`SysMLInteractiveModelBenchmark`
(`org.omg.sysml.interactive/src/org/omg/sysml/interactive/profiler/SysMLInteractiveModelBenchmark.java`)
is a fresh-JVM measurement of loading, resolving and transforming the standard
library plus a recursively discovered SysML corpus, with the implicit-specialization
service configured to cache every type — the same policy
`org.omg.kerml.xtext.PilotImplicitSpecializationService` installs in production. It
exists to make the performance impact of changes to the implicit-specialization
service/cache layer (see the
[mechanism reference](../../org.omg.sysml.logic/doc/implicit-specialization.md))
visible over time, not to certify absolute numbers: a single machine's wall-clock
timings vary with load, so read trends across runs rather than isolated values.

## Protocol

```sh
mvn clean verify
java -Xms2g -Xmx4g \
  -cp org.omg.sysml.interactive/target/org.omg.sysml.interactive-<version>-all.jar \
  org.omg.sysml.interactive.profiler.SysMLInteractiveModelBenchmark \
  <standard-library-folder> <models-folder>
```

For this repository, the fixed parameters are:

- Standard library folder: `sysml.library`
- Models folder: `sysml/src`


For this repository root folder: 

```sh
rtk proxy mvn clean verify
java -Xms2g -Xmx4g \
  -cp org.omg.sysml.interactive/target/org.omg.sysml.interactive-<version>-all.jar \
  org.omg.sysml.interactive.profiler.SysMLInteractiveModelBenchmark \
  sysml.library sysml/src
```


Each run is a single fresh JVM (no warm-up run, no repetition). It measures four
phases in order — `load_libraries`, `load_models`, `resolution`, `transformation` —
each reported as `BENCHMARK,<phase>,<wall_seconds>,<gc_count>,<gc_milliseconds>`.
After the `loaded`, `resolved` and `transformed` checkpoints it also reports
`CACHES,<phase>,types=<N>,cached=<N>,complete=<N>,uncached=<N>`: how many `Type`s
exist, how many have a specialization cache attached, how many of those caches are
both raw- and reduced-complete, and how many types have no cache yet.

Note: Obviously, the measurements are computer-dependent.

## Measured results

Both versions were measured alternately in the same session (2026-10-02), on the same
machine (Linux WSL2, Temurin 21+35, `-Xms2g -Xmx4g`), with the fixed parameters above
(255 `.sysml` files, 349 resources once library dependencies are counted). Each run is a
fresh JVM; the three pairs were run in the order baseline, current, baseline, current,
baseline, current. Timings decreased during the session for both versions, which reflects
the load of the machine rather than the code.

### Baseline (code before the implicit-specialization extraction)

Implicit specializations computed by the `ElementAdapter` hierarchy, as before the
refactoring. This version of the benchmark has no `CACHES` checkpoints. Built with
`mvn clean package -DskipTests`; its tests were not run for this measurement.

| Run  | load_libraries | load_models |                resolution |       transformation |
| ---- | -------------: | ----------: | ------------------------: | -------------------: |
| 1    |         1.58 s |      0.97 s | 323.95 s (320 GC, 836 ms) | 6.95 s (6 GC, 59 ms) |
| 2    |         1.59 s |      0.89 s | 311.81 s (315 GC, 817 ms) | 6.30 s (6 GC, 60 ms) |
| 3    |         1.46 s |      0.90 s | 277.66 s (321 GC, 861 ms) | 5.57 s (6 GC, 62 ms) |
| Mean |         1.54 s |      0.92 s |              **304.47 s** |           **6.27 s** |

Resource diagnostics in every run: 0 errors after `load_models`, 5 after `resolution`, 4
after `transformation`.

### Current implementation

Implicit specializations computed by the rule-based `ImplicitSpecializationService`, with
the Pilot cache policy (every Type reaching the model is cached).
Measured after a full `mvn clean verify` (`BUILD SUCCESS`, 1,635 tests, 0
failures, 0 errors, 22 skipped).

| Run  | load_libraries | load_models |                resolution |       transformation |
| ---- | -------------: | ----------: | ------------------------: | -------------------: |
| 1    |         1.49 s |      1.02 s | 158.91 s (150 GC, 420 ms) | 6.48 s (6 GC, 59 ms) |
| 2    |         1.52 s |      0.92 s | 148.90 s (148 GC, 445 ms) | 6.32 s (6 GC, 63 ms) |
| 3    |         1.32 s |      0.77 s | 140.72 s (149 GC, 446 ms) | 5.77 s (6 GC, 61 ms) |
| Mean |         1.44 s |      0.90 s |              **149.51 s** |           **6.19 s** |

| Checkpoint  |  Types |          Cached |        Complete | Uncached |
| ----------- | -----: | --------------: | --------------: | -------: |
| loaded      | 55,279 |               0 |               0 |   55,279 |
| resolved    | 60,442 |  28,394 (47.0%) |    2,786 (4.6%) |   32,048 |
| transformed | 70,349 | 70,322 (99.96%) | 70,077 (99.61%) |       27 |

Identical in the three runs. Resource diagnostics in every run: 0 errors after
`load_models`, 0 after `resolution`, 0 after `transformation`.

**Delta against the baseline:** resolution −154.96 s (−50.9%) on average, each current run
being faster than every baseline run; transformation −0.08 s (−1.3%); loading phases
unchanged. The 5 / 4 linking errors of the baseline disappear (see "Linking and provisional
name-resolution failures" in the
[mechanism reference](../../org.omg.sysml.logic/doc/implicit-specialization.md)).
