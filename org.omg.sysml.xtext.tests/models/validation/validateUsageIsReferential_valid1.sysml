// Constraint: validateUsageIsReferential (context: Usage)
// A Usage that is directed, an end feature or has no featuringTypes must be referential.
// direction <> null or isEnd or featuringType->isEmpty() implies
// isReference
package validateUsageIsReferential_valid1 {
	// A composite usage that is neither directed, an end, nor unfeatured.
	part def A {
		part p;
	}
}
