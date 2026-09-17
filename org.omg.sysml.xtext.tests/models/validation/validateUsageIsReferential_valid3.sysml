// Constraint: validateUsageIsReferential (context: Usage)
// A Usage that is directed, an end feature or has no featuringTypes must be referential.
// direction <> null or isEnd or featuringType->isEmpty() implies
// isReference
package validateUsageIsReferential_valid3 {
	// End usages are referential by construction.
	connection def C {
		end part a;
		end part b;
	}
}
