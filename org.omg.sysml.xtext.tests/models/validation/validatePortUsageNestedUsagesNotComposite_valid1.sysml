// Constraint: validatePortUsageNestedUsagesNotComposite (context: PortUsage)
// The nestedUsages of a PortUsage that are not themselves PortUsages must not be composite.
// nestedUsage->
// reject(oclIsKindOf(PortUsage))->
// forAll(not isComposite)
package validatePortUsageNestedUsagesNotComposite_valid1 {
	port p1{
		port p2;
	}
}