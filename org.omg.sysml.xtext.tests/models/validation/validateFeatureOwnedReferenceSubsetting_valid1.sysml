// Constraint: validateFeatureOwnedReferenceSubsetting (context: Feature)
// A Feature must have at most one ownedSubsetting that is an ReferenceSubsetting.
// ownedSubsetting->selectByKind(ReferenceSubsetting)->size() <= 1
package validateFeatureOwnedReferenceSubsetting_valid1 {
	part a;
	ref part r ::> a;
}
