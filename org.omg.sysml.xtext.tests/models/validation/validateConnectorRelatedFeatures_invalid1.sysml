// Constraint: validateConnectorRelatedFeatures (context: Connector)
// If a Connector is concrete (not abstract), then it must have at least two relatedFeatures.
// not isAbstract implies relatedFeature->size() >= 2
package validateConnectorRelatedFeatures_invalid1 {
	part a;
	connection c {
		end ::> a;
	}
}
