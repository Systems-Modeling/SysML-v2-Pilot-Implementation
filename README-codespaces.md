# Codespaces + Maven: minimal SysML parse run

This branch adds a minimal Java entrypoint using the existing Xtext/EMF parser implementation in this repo.

## File added

- `org.omg.sysml.xtext/src/demo/ParseSysML.java`

## Open in Codespaces

Open this branch in Codespaces:

- https://github.com/mork2020/SysML-v2-Pilot-Implementation/tree/codespaces%2Fsysml-parse-snippet

## Build parser module

```bash
mvn -q -pl org.omg.sysml.xtext -am -DskipTests package
```

## Run snippet

```bash
mvn -q -pl org.omg.sysml.xtext \
  -Dexec.mainClass=demo.ParseSysML \
  -Dexec.classpathScope=compile \
  -Dexec.args="path/to/file.sysml" \
  exec:java
```

## Notes

- This uses `org.omg.sysml.xtext.SysMLStandaloneSetup` from the existing repo module.
- The snippet is placed under `org.omg.sysml.xtext/src/demo` so it is compiled as part of that Eclipse plugin module's Java sources.
