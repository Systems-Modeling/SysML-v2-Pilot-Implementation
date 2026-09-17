// Constraint: validateFeatureOwnedReferenceSubsetting (context: Feature)
// A Feature must have at most one ownedSubsetting that is an ReferenceSubsetting.
// ownedSubsetting->selectByKind(ReferenceSubsetting)->size() <= 1
package validateFeatureOwnedReferenceSubsetting_invalid1 {
	part a;
	part b;
	ref part r ::> a ::> b;
}
