// Constraint: validateSpecializationSpecificNotConjugated (context: Specialization)
// The specific Type of a Specialization cannot be a conjugated Type.
// not specific.isConjugated
package validateSpecializationSpecificNotConjugated_valid1 {
	classifier T;
	classifier C;
	specialization S subtype C specializes T;
}