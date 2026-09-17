// Constraint: validateBindingConnectorIsBinary (context: BindingConnector)
// A BindingConnector must be binary.
// relatedFeature->size() = 2
package validateBindingConnectorIsBinary_valid1 {
	item a;
	item b;
	bind a=b;
}