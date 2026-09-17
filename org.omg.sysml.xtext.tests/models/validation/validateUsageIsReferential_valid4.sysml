// Constraint: validateUsageIsReferential (context: Usage)
// A Usage that is directed, an end feature or has no featuringTypes must be referential.
// direction <> null or isEnd or featuringType->isEmpty() implies
// isReference
package validateUsageIsReferential_valid4 {
	// A usage without featuring types is referential by construction.
	part p;
}
