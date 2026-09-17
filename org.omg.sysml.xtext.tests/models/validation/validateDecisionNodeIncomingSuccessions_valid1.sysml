// Constraint: validateDecisionNodeIncomingSuccessions (context: DecisionNode)
// A DecisionNode may have at most one incoming Succession.
// targetConnector->selectByKind(Succession)->size() <= 1
package validateDecisionNodeIncomingSuccessions_valid1 {
	action def A {
		action a1;
		then decide d;
	}
}
