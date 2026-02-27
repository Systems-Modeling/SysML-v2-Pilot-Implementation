# org.omg.sysml.model.tests

This module contains automated tests dedicated to `org.omg.sysml.model`.

Current scope:
- metamodel integrity checks on the generated SysML Ecore package
- structural invariants for classifiers, features, and operations
- critical metamodel contract checks used by downstream logic delegates
- XMI serialization round-trip checks with semantic link validation after reload
- serialization robustness checks for partial/incomplete graphs and dangling proxies
- compatibility snapshot checks on metamodel signatures (package/classifier/feature/operation/enum literals)

Execution:
- this module is part of the unified reactor build
- run all tests from `unified` with `mvn clean verify`
