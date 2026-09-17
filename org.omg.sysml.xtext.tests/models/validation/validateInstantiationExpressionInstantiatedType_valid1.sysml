// Constraint: validateInstantiationExpressionInstantiatedType (context: InstantiationExpression)
// An InstantiationExpression must have an InstantiatedType.
// instantiatedType() <> null
package validateInstantiationExpressionInstantiatedType_valid1 {
	attribute def A;
	attribute a = new A();
}
