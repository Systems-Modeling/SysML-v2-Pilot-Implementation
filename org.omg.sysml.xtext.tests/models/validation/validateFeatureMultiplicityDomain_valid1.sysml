// Constraint: validateFeatureMultiplicityDomain (context: Feature)
// If a Feature has a multiplicity, then the featuringTypes of the multiplicity must be the same as those of the Feature itself.
// multiplicity <> null implies multiplicity.featuringType = featuringType
package validateFeatureMultiplicityDomain_valid1 {
	part def A {
		part f[4];
	}
}
