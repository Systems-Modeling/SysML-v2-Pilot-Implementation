# org.omg.sysml.model

## Purpose
- Hosts the generated EMF standalone Java metamodel for SysML v2.
- Contains `src/main/resources/model/SysML.ecore` and
  `src/main/resources/model/SysML.genmodel` as the source artifacts for model code generation.

## What This Module Provides
- EMF model interfaces and implementations under `org.omg.sysml.model`.
- EMF package/factory initialization for the SysML metamodel.

## Design Intent
- Pure model module: no dependency on `org.omg.sysml.logic` or other `org.omg.sysml.*` modules.
- No Spring runtime wiring in this module.

## Generation Source of Truth
- Model code is generated from `src/main/resources/model/SysML.genmodel`.
- The metamodel definition is `src/main/resources/model/SysML.ecore`.

## Generation Workflow
- Do not generate metamodel Java code directly from `SysML.genmodel` in Eclipse/STS.
- Generate metamodel code only through the Maven build profiles in `org.omg.sysml.model.tools`.
- This guarantees the complete generation pipeline is applied consistently.
