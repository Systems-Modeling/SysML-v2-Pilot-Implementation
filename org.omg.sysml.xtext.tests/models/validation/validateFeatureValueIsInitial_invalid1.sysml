// Constraint: validateFeatureValueIsInitial (context: FeatureValue)
// If a FeatureValue has isInitial = true, then its featureWithValue must have isVariable = true.
// isInitial implies featureWithValue.isVariable
package validateFeatureValueIsInitial_invalid1 {
	// A feature owned by a data type is not time-varying, so it cannot have an initial value.
	attribute def A {
		attribute x := 1;
	}
}
