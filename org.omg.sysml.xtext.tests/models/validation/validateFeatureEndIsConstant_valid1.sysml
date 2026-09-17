// Constraint: validateFeatureEndIsConstant (context: Feature)
// A Feature with isEnd = true and isVariable = true must have isConstant = true.
// isEnd and isVariable implies isConstant
package validateFeatureEndIsConstant_valid1 {
	connection def C {
		end a;
		end b;
	}
}
