// Constraint: validateTypeOwnedDifferencingNotOne (context: Type)
// A Type must not have exactly one ownedDifferencing.
// ownedDifferencing->size() <> 1
package validateTypeOwnedDifferencingNotOne_invalid1 {
	classifier A;
	classifier T differences A;
}
