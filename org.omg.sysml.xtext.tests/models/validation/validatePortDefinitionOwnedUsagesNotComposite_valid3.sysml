// Constraint: validatePortDefinitionOwnedUsagesNotComposite (context: PortDefinition)
// The ownedUsages of a PortDefinition that are not PortUsages must not be composite.
// ownedUsage->
// reject(oclIsKindOf(PortUsage))->
// forAll(not isComposite)
package validatePortDefinitionOwnedUsagesNotComposite_valid3 {
	doc /* Nested port usages are excluded from the rule and may be composite. */
	port def PortDef {
		port p;
	}
}
