package validateFeatureCrossFeatureType_invalid1 {
	part def A {
		ref part a;
	}
	
	part def B;
	
	connection def {
		end part x : B crosses y.a;
		end part y : A;
	}
}