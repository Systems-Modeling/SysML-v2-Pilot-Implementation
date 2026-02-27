# org.omg.sysml.logic.tests

## Purpose
- Hosts integration and coverage tests for `org.omg.sysml.logic`.
- Keeps `org.omg.sysml.logic` free from test-only dependencies and test resources.

## What This Module Provides
- `SpringIntegrationTest`: validates Spring wiring for delegate registration.
- `SysMLDelegateCoverageTest`: validates delegate generation/runtime coverage against the SysML UML source model.
- `InvocationSemantics*Test` and `SettingSemantics*Test`: validate generated delegate semantics,
  including subsets-based setting fallback behavior.

## Test Resources
- Local UML source of truth for coverage checks:
  - `src/main/resources/SysML_xmi.uml`

## Design Intent
- Test-only module in the unified Maven reactor.
- Depends on `org.omg.sysml.logic` in test scope.
- Does not contribute runtime code.

## Typical Usage
- Run with the full reactor: `mvn -f unified/pom.xml clean verify`
- Or run only this module: `mvn -f unified/org.omg.sysml.logic.tests/pom.xml test`
