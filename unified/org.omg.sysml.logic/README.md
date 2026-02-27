# org.omg.sysml.logic

## Purpose
- Provides the delegate runtime for derived features and operations defined in the SysML metamodel.
- Contains generated delegate classes and delegate factories/registration utilities.

## What This Module Provides
- Invocation delegates in `org.omg.sysml.logic.delegate.invocation`.
- Setting delegates in `org.omg.sysml.logic.delegate.setting`.
- Delegate factories and registrar in `org.omg.sysml.logic.delegate`.
- Tests validating delegate coverage and Spring integration.

## Design Intent
- Depends on `org.omg.sysml.model` (not the reverse).
- Owns behavior wiring for EMF delegate execution.

## Generation Source of Truth
- Delegate classes are generated from
  `org.omg.sysml.model/src/main/resources/model/SysML.ecore` via `org.omg.sysml.model.tools`.
