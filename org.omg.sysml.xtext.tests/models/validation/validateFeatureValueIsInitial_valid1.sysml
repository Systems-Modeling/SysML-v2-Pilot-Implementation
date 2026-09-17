// Constraint: validateFeatureValueIsInitial (context: FeatureValue)
// If a FeatureValue has isInitial = true, then its featureWithValue must have isVariable = true.
// isInitial implies featureWithValue.isVariable
package validateFeatureValueIsInitial_valid1 {
	// A feature owned by an occurrence definition may vary over time, so an initial value is allowed.
	part def A {
		attribute x := 1;
	}
}
