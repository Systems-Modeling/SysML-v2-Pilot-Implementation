// Constraint: validatePortDefinitionOwnedUsagesNotComposite (context: PortDefinition)
// The ownedUsages of a PortDefinition that are not PortUsages must not be composite.
// ownedUsage->
// reject(oclIsKindOf(PortUsage))->
// forAll(not isComposite)
package validatePortDefinitionOwnedUsagesNotComposite_valid2 {
	doc /* An attribute usage is always referential, so it is allowed in a port definition. */
	port def PortDef {
		attribute a;
	}
}
