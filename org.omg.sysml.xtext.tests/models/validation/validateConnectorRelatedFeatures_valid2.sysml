// Constraint: validateConnectorRelatedFeatures (context: Connector)
// If a Connector is concrete (not abstract), then it must have at least two relatedFeatures.
// not isAbstract implies relatedFeature->size() >= 2
package validateConnectorRelatedFeatures_valid2 {
	// An abstract connector may have fewer than two related features.
	part a;
	abstract connection c {
		end ::> a;
	}
}
