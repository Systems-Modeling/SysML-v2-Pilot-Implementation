// Constraint: validateViewRenderingMembershipOwningType (context: ViewRenderingMembership)
// The owningType of a ViewRenderingMembership must be a ViewDefinition or a ViewUsage.
// owningType.oclIsKindOf(ViewDefinition) or
// owningType.oclIsKindOf(ViewUsage)
package validateViewRenderingMembershipOwningType_valid1 {
	rendering r;
	view def V {
		render r;
	}
}
