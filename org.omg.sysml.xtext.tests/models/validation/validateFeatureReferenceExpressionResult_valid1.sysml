// Constraint: validateFeatureReferenceExpressionResult (context: FeatureReferenceExpression)
// A FeatureReferenceExpression must own its result parameter.
// result.owningType = self
package validateFeatureReferenceExpressionResult_valid1 {
	attribute a;
	attribute b = a;
}
