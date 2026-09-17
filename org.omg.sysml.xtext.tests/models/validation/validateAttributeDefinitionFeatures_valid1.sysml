// Constraint: validateAttributeDefinitionFeatures (context: AttributeDefinition)
// All features of an AttributeDefinition must be non-composite.
// feature->forAll(not isComposite)
package validateAttributeDefinitionFeatures_valid1 {
	attribute def A {
		attribute x;
	}
}
