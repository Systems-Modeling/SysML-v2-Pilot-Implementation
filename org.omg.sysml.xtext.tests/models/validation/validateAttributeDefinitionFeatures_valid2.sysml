// Constraint: validateAttributeDefinitionFeatures (context: AttributeDefinition)
// All features of an AttributeDefinition must be non-composite.
// feature->forAll(not isComposite)
package validateAttributeDefinitionFeatures_valid2 {
	attribute def A {
		ref part p;
	}
}
