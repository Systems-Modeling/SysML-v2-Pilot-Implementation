// Constraint: validateFeatureChainingFeatureNotOne (context: Feature)
// A Feature must have either no chainingFeatures or more than one.
// chainingFeature->size() <> 1
package validateFeatureChainingFeatureNotOne_invalid1 {
	feature f1;
	feature chain chains f1;
}