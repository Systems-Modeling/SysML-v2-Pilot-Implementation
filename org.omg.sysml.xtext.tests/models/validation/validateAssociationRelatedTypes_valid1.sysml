// Constraint: validateAssociationRelatedTypes (context: Association)
// If an Association is concrete (not abstract), then it must have at least two relatedTypes.
// not isAbstract implies relatedType->size() >= 2
package validateAssociationRelatedTypes_valid1 {
	connection def C {
		end e1;
		end e2;
	}
}