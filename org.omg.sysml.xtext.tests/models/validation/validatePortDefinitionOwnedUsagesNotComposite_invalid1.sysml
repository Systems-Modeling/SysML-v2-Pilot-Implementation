// Constraint: validatePortDefinitionOwnedUsagesNotComposite (context: PortDefinition)
// The ownedUsages of a PortDefinition that are not PortUsages must not be composite.
// ownedUsage->
// reject(oclIsKindOf(PortUsage))->
// forAll(not isComposite)
package validatePortDefinitionOwnedUsagesNotComposite_invalid1 {
	port def PortDef {
		constraint a;
	}
}
