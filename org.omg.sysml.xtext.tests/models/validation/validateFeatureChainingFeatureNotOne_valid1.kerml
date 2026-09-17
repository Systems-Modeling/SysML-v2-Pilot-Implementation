// Constraint: validateFeatureChainingFeatureNotOne (context: Feature)
// A Feature must have either no chainingFeatures or more than one.
// chainingFeature->size() <> 1
package validateFeatureChainingFeatureNotOne_valid1 {
	feature f1 {
		feature f2;
	}
	feature chain chains f1.f2;
}