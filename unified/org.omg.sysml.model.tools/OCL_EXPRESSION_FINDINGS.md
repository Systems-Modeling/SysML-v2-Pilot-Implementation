# OCL Expression Findings (from `SysML_xmi.uml`)

This document lists inconsistencies, errors, and unusual patterns observed while extracting OCL expressions for delegate generation.

## Confirmed textual errors in OCL bodies

1. Typo in property name `featureMemberhsip` (likely `featureMembership`)
- `deriveViewpointDefinitionViewpointStakeholder` at lines 14533-14535
- `deriveViewpointUsageViewpointStakeholder` at lines 14804-14806

2. Typo in variable name `refrencedFeature` (likely `referencedFeature`)
- `deriveVewRenderingMembershipReferencedRendering` body at line 15110
- Note:
  - inconsistent with variable declaration at lines 15106-15107.

## Rule naming / spelling issues

1. Rule name typo: `deriveVewRenderingMembershipReferencedRendering`
- Rule declaration at line 15099
- Expected spelling likely: `deriveViewRenderingMembershipReferencedRendering`.
- Impact:
  - reduces traceability between rule names and target members;
  - makes generated artifacts look inconsistent.

## Semantic inconsistency between prose and OCL

1. `deriveFeatureOwnedTyping` comment/body mismatch
- Rule at lines 3134-3141
- Prose says owned typings come from `ownedSpecializations` (line 3136),
  but OCL uses `ownedGeneralization` (line 3140):
  - `ownedTyping = ownedGeneralization->selectByKind(FeatureTyping)`

## OCL patterns that are valid but easy to misread

1. `OrderedSet{self}` in `deriveFeatureType`
- Lines 3149-3153
- Includes `self` intentionally in the seed set before closure.
- Note:
  - easy to misread as accidental self-inclusion.

## Traceability / maintainability issues in operation rules

1. Many operation-level rules use generic names like `unnamed1`
- Example: `AcceptActionUsage::isTriggerAction` body condition uses `ownedRule name="unnamed1"` at lines 8346-8352.
- Impact:
  - weak traceability from OCL source to generated delegate methods;
  - harder review/debug when comparing generated comments with UML rules.

## Out-of-scope but notable quality issue near OCL rules

1. Mixed language labeling in constraints
- Example at lines 7372-7373: language is `English`, but body is OCL.
