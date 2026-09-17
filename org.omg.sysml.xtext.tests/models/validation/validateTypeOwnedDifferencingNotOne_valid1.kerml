// Constraint: validateTypeOwnedDifferencingNotOne (context: Type)
// A Type must not have exactly one ownedDifferencing.
// ownedDifferencing->size() <> 1
package validateTypeOwnedDifferencingNotOne_valid1 {
	classifier A;
	classifier B;
	classifier T differences A, B;
}
