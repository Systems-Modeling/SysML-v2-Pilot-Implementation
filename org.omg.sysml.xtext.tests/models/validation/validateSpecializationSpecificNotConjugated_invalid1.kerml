// Constraint: validateSpecializationSpecificNotConjugated (context: Specialization)
// The specific Type of a Specialization cannot be a conjugated Type.
// not specific.isConjugated
package validateSpecializationSpecificNotConjugated_invalid1 {
	classifier T;
	classifier C conjugates T;
	specialization S subtype C specializes T;
}