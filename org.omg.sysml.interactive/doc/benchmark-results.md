# SysMLInteractiveModelBenchmark results

## Scope

`SysMLInteractiveModelBenchmark`
(`org.omg.sysml.interactive/src/org/omg/sysml/interactive/profiler/SysMLInteractiveModelBenchmark.java`)
is a fresh-JVM measurement of loading, resolving and transforming the standard
library plus a recursively discovered SysML corpus, with the implicit-specialization
service configured to cache every type — the same policy
`org.omg.kerml.xtext.XTextImplicitSpecializationService` installs in production. It
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

Both versions were measured on the same machine (Linux WSL2, Temurin 21+35,
`-Xms2g -Xmx4g`), with the fixed parameters above (255 `.sysml` files, 349 resources once
library dependencies are counted), three runs each, every run in a fresh JVM. The baseline
was measured on 2026-10-01 and the current implementation on 2026-10-02, in separate
sessions: the delta below compares measurements taken on different days.

### Baseline (code before the implicit-specialization extraction)

Implicit specializations computed by the `ElementAdapter` hierarchy, as before the
refactoring. This version of the benchmark has no `CACHES` checkpoints. Built with
`mvn clean package -DskipTests`; its tests were not run for this measurement.

| Run  | load_libraries | load_models |                resolution |        transformation |
| ---- | -------------: | ----------: | ------------------------: | --------------------: |
| 1    |         1.41 s |      0.82 s | 297.33 s (320 GC, 809 ms) | 6.63 s (7 GC, 68 ms) |
| 2    |         1.33 s |      0.86 s | 299.82 s (321 GC, 876 ms) | 6.39 s (6 GC, 60 ms) |
| 3    |         1.36 s |      0.86 s | 292.16 s (320 GC, 855 ms) | 6.07 s (7 GC, 64 ms) |
| Mean |         1.37 s |      0.85 s |              **296.44 s** |              **6.36 s** |

Resource diagnostics in every run: 0 errors after `load_models`, 5 after `resolution`, 4
after `transformation`.

### Current implementation

Implicit specializations computed by the rule-based `ImplicitSpecializationService`, with
the Pilot cache policy (every Type reaching the model is cached).
Measured after a full `mvn clean verify` (`BUILD SUCCESS`, 1,649 tests, 0
failures, 0 errors, 22 skipped).

| Run  | load_libraries | load_models |                resolution |        transformation |
| ---- | -------------: | ----------: | ------------------------: | --------------------: |
| 1    |         1.34 s |      0.78 s | 148.85 s (149 GC, 434 ms) | 6.41 s (6 GC, 55 ms) |
| 2    |         1.32 s |      0.78 s | 144.11 s (150 GC, 411 ms) | 6.43 s (7 GC, 65 ms) |
| 3    |         1.33 s |      0.82 s | 144.21 s (150 GC, 460 ms) | 6.29 s (6 GC, 57 ms) |
| Mean |         1.33 s |      0.79 s |              **145.73 s** |              **6.38 s** |

| Checkpoint  |  Types |          Cached |        Complete | Uncached |
| ----------- | -----: | --------------: | --------------: | -------: |
| loaded      | 55,279 |               0 |               0 |   55,279 |
| resolved    | 60,442 |  28,394 (47.0%) |    2,786 (4.6%) |   32,048 |
| transformed | 70,349 | 70,322 (99.96%) | 70,077 (99.61%) |       27 |

Identical in the three runs. Resource diagnostics in every run: 0 errors after
`load_models`, 0 after `resolution`, 0 after `transformation`.

**Delta against the baseline:** resolution −150.71 s (−50.8%) on average, each current run
being faster than every baseline run; transformation +0.02 s (+0.2%); loading phases
unchanged. The 5 / 4 linking errors of the baseline disappear (see "Linking and provisional
name-resolution failures" in the
[mechanism reference](../../org.omg.sysml.logic/doc/implicit-specialization.md)).
