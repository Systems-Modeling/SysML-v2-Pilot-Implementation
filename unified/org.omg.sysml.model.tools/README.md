# org.omg.sysml.model.tools

This module contains standalone Java generators used by the `unified` modules.

## Purpose
- Contains standalone Java generation tools used by the unified build workflow.

## What This Module Provides
- `GenerateModelFromGenModel`: reloads `SysML.genmodel` and generates EMF model code.
- `GenerateModelRedefinesFromEcore`: second-phase metamodel generator that applies `redefines` overrides in generated `*Impl` classes.
- `GenerateDelegatesFromEcore`: generates delegate classes for derived features and operations from `SysML.ecore`.
- `GenerateAdaptersFromEcore`: generates one adapter class per EClass from `SysML.ecore`.

## Metamodel Two-Phase Generation
Metamodel generation is intentionally split in two phases:

1. `GenerateModelFromGenModel`  
   Generates the baseline EMF metamodel Java code from `SysML.genmodel`.
2. `GenerateModelRedefinesFromEcore`  
   Applies redefines-based getter overrides in generated metamodel implementation classes.

This two-phase flow must be run from Maven profiles, not manually from Eclipse/STS generation actions.

## Delegate Generator Naming
`GenerateDelegatesFromEcore` generates delegate classes in `org.omg.sysml.logic` with ordinal-free names:

- Setting delegates: `Class_Feature_SettingDelegate`
- Invocation delegates: `Class_Operation_InvocationDelegate`

Output packages:
- Setting delegates: `org.omg.sysml.logic.delegate.setting`
- Invocation delegates: `org.omg.sysml.logic.delegate.invocation`

Notes:
- No parameter type token suffixes are used in invocation delegate class names.
- No `_F<index>` or `_O<index>` suffixes are used.
- For derived settings without an OCL derive rule, generated `get(...)` methods include a
  subsets-based fallback built from `EAnnotation(source="subsets")` references.
- For derived settings without an OCL derive rule, generated `get(...)` methods also include a
  redefines-based fallback built from `EAnnotation(source="redefines")` references.
- When a subsets annotation exists but cannot be safely auto-generated (for example derived
  subset source or cardinality mismatch), a placeholder `get(...)` is still generated with an
  in-method comment explaining why it is not handled and what requires manual implementation.
- When a redefines annotation exists but cannot be safely auto-generated (for example self
  reference, derived source recursion risk, type mismatch), unsupported sources are documented in
  generated comments and fallback remains manual when no safe source is available.

## Adapter Generator
`GenerateAdaptersFromEcore` generates adapters in `org.omg.sysml.logic`:

- Package: `org.omg.sysml.logic.adapter`
- Base class: `AbstractSysMLAdapter`
- Per-EClass class naming: `<EClassName>Adapter`

Determinism guarantees:
- input EClasses are sorted by name before generation;
- existing `*Adapter.java` files are cleaned before regeneration;
- generated content is template-based and stable for identical Ecore input.

## Test Strategy
Quality for adapter generation is validated in `org.omg.sysml.logic.tests` with:

- coverage tests ensuring there is exactly one generated adapter class per EClass in `SysML.ecore`;
- runtime shape tests ensuring each generated adapter class is loadable, instantiable, and extends `AbstractSysMLAdapter`.

## Design Intent
- Build-time utilities only; not part of application runtime.
- Centralizes reproducible generation steps for model and delegate code.

## Typical Usage
- Run `GenerateModelFromGenModel` before generating model code updates.
- Run `GenerateDelegatesFromEcore` after metamodel changes affecting derived features/operations.

## Maven Profiles
Generator executions are opt-in. A standard build does not run generators.

- Default build (no generation):  
  `mvn clean verify`

- Metamodel generator only:  
  `mvn clean verify -Pgenerate-metamodel`

- Delegate generator only:  
  `mvn clean verify -Pgenerate-delegates`

- Adapter generator only:  
  `mvn clean verify -Pgenerate-adapters`

- All generators (metamodel + delegates + adapters):  
  `mvn clean verify -Pgenerate-all`

Profile behavior:
- `generate-metamodel` runs the two metamodel phases in order:
  1. `GenerateModelFromGenModel`
  2. `GenerateModelRedefinesFromEcore`
- `generate-delegates` runs `GenerateDelegatesFromEcore`.
- `generate-adapters` runs `GenerateAdaptersFromEcore`.
- `generate-all` runs the three generators in this order:
  1. metamodel phase 1 (`GenerateModelFromGenModel`)
  2. metamodel phase 2 (`GenerateModelRedefinesFromEcore`)
  3. delegates
  4. adapters
