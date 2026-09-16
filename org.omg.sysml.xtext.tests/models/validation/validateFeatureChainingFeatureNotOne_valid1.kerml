package validateFeatureChainingFeatureNotOne_valid1 {
	feature f1 {
		feature f2;
	}
	feature chain chains f1.f2;
}