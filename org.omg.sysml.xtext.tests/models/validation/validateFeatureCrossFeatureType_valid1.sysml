// Constraint: validateFeatureCrossFeatureType (context: Feature)
// The crossFeature of a Feature must have the same types as the Feature.
// crossFeature <> null implies
// crossFeature.type->asSet() = type->asSet()
package validateFeatureCrossFeatureType_valid1 {
	part def A {
		ref part a : B;
	}
	
	part def B;
	
	connection def {
		end part x : B crosses y.a;
		end part y : A;
	}
}