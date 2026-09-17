// Constraint: validateBindingConnectorIsBinary (context: BindingConnector)
// A BindingConnector must be binary.
// relatedFeature->size() = 2
package validateBindingConnectorIsBinary_invalid1 {
	doc /* 
	 Not able to get expected error essage without a parsing error;
	 This will generate:  
		- Must have at least two related elements
		- Binding connector must be binary
	  */
	bind 
}