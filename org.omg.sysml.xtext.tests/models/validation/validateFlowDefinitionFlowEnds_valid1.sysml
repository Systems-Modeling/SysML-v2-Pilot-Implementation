// Constraint: validateFlowDefinitionFlowEnds (context: FlowDefinition)
// A FlowDefinition may not have more than two flowEnds.
// flowEnd->size() <= 2
package validateFlowDefinitionFlowEnds_valid1 {
	flow def F {
		end a;
		end b;
	}
}