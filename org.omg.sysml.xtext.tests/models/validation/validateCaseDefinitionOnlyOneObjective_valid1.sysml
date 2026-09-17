// Constraint: validateCaseDefinitionOnlyOneObjective (context: CaseDefinition)
// A CaseDefinition must have at most one featureMembership that is a ObjectiveMembership.
// featureMembership->
// selectByKind(ObjectiveMembership)->
// size() <= 1
package validateCaseDefinitionOnlyOneObjective_valid1 {
	case def CaseDef {
		objective {
			doc /* Objective. */
		}
	}
}
