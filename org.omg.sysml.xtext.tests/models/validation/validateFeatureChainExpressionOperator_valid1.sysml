// Constraint: validateFeatureChainExpressionOperator (context: FeatureChainExpression)
// The operator of a FeatureChainExpression must be ".".
// operator = .
package validateFeatureChainExpressionOperator_valid1 {
	part f {
		part a;
	}
	part g = f.a;
}
