# SysMLInteractiveModelBenchmark results

## Scope

`SysMLInteractiveModelBenchmark`
(`org.omg.sysml.interactive/src/org/omg/sysml/interactive/profiler/SysMLInteractiveModelBenchmark.java`)
is a fresh-JVM measurement of loading, resolving and transforming the standard
library plus a recursively discovered SysML corpus. It exists to establish a
performance baseline before any change to the implicit-specialization
mechanism, so that future changes to that mechanism can be measured against a
real, reproducible number rather than an assumption — not to certify absolute
numbers: a single machine's wall-clock timings vary with load, so read trends
across runs rather than isolated values.

## Protocol

```sh
rtk proxy mvn clean verify
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


Each run is a single fresh JVM (no warm-up run, no repetition). It measures
four phases in order — `load_libraries`, `load_models`, `resolution`,
`transformation` — each reported as
`BENCHMARK,<phase>,<wall_seconds>,<gc_count>,<gc_milliseconds>`.

Note: Obviously, the measurements are computer-dependent.

## Measured results

Measured on 2026-10-02 on Linux WSL2, Temurin 21+35, `-Xms2g -Xmx4g`, with the fixed
parameters above (255 `.sysml` files, 349 resources once library dependencies are
counted), three runs, every run in a fresh JVM.

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
