// Constraint: validateFeatureOwnedCrossSubsetting (context: Feature)
// A Feature must have at most one ownedSubsetting that is a CrossSubsetting.
// ownedSubsetting->selectByKind(CrossSubsetting)->size() <= 1
package validateFeatureOwnedCrossSubsetting_valid1 {
	part def A {
		ref part a : B;
	}
	part def B;
	connection def C {
		end part x : B crosses y.a;
		end part y : A;
	}
}
