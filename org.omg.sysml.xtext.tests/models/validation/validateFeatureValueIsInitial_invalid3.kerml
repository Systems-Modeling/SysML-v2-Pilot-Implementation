// Constraint: validateFeatureValueIsInitial (context: FeatureValue)
// If a FeatureValue has isInitial = true, then its featureWithValue must have isVariable = true.
// isInitial implies featureWithValue.isVariable
package validateFeatureValueIsInitial_invalid3 {
	// In KerML a feature is variable only when declared var, even if its owner is an occurrence.
	class A {
		feature x := 1;
	}
}
