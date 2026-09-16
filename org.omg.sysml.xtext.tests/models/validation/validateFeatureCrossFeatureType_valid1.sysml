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