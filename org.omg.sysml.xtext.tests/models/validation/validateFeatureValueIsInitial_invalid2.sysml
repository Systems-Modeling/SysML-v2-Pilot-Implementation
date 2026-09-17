// Constraint: validateFeatureValueIsInitial (context: FeatureValue)
// If a FeatureValue has isInitial = true, then its featureWithValue must have isVariable = true.
// isInitial implies featureWithValue.isVariable
package validateFeatureValueIsInitial_invalid2 {
	// A portion is not time-varying, so it cannot have an initial value.
	part def A {
		snapshot s := 1;
	}
}
