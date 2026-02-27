# org.omg.sysml.model.eclipse

## Purpose
- Isolates Eclipse-specific registrations for SysML delegate URIs.
- Enables IDE/runtime extension-point registration without adding Eclipse dependencies to core modules.

## What This Module Provides
- `plugin.xml` and related descriptors for setting/invocation delegate registrations.
- Minimal Java support classes required by Eclipse plugin packaging.

## Design Intent
- Optional integration module for Eclipse-based tooling.
- Keeps `org.omg.sysml.model` and `org.omg.sysml.logic` usable in standalone Maven/Java environments.
