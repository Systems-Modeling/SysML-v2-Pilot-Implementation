// Constraint: validateFeatureValueIsInitial (context: FeatureValue)
// If a FeatureValue has isInitial = true, then its featureWithValue must have isVariable = true.
// isInitial implies featureWithValue.isVariable
package validateFeatureValueIsInitial_valid3 {
	class A {
		var feature x := 1;
	}
}
