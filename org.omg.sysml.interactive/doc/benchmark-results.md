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

### Baseline (code before the implicit-specialization extraction)

Measured on 2026-10-01 on Linux WSL2, Temurin 21+35, `-Xms2g -Xmx4g`, with the fixed
parameters above (255 `.sysml` files, 349 resources once library dependencies are
counted). Each run is a fresh JVM. Implicit specializations are computed by the
`ElementAdapter` hierarchy. Built with `mvn clean package -DskipTests`; its tests were not
run for this measurement.

| Run  | load_libraries | load_models |                resolution |       transformation |
| ---- | -------------: | ----------: | ------------------------: | -------------------: |
| 1    |         1.41 s |      0.82 s | 297.33 s (320 GC, 809 ms) | 6.63 s (7 GC, 68 ms) |
| 2    |         1.33 s |      0.86 s | 299.82 s (321 GC, 876 ms) | 6.39 s (6 GC, 60 ms) |
| 3    |         1.36 s |      0.86 s | 292.16 s (320 GC, 855 ms) | 6.07 s (7 GC, 64 ms) |
| Mean |         1.37 s |      0.85 s |              **296.44 s** |           **6.36 s** |

Resource diagnostics in every run: 0 errors after `load_models`, 5 after `resolution`, 4
after `transformation`.
