// Constraint: validateFeatureValueIsInitial (context: FeatureValue)
// If a FeatureValue has isInitial = true, then its featureWithValue must have isVariable = true.
// isInitial implies featureWithValue.isVariable
package validateFeatureValueIsInitial_valid2 {
	// A bound value is not an initial value, so the feature need not be time-varying.
	attribute def A {
		attribute x = 1;
	}
}
