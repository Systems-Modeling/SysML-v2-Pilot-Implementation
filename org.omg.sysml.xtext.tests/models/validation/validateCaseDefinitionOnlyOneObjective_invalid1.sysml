// Constraint: validateCaseDefinitionOnlyOneObjective (context: CaseDefinition)
// A CaseDefinition must have at most one featureMembership that is a ObjectiveMembership.
// featureMembership->
// selectByKind(ObjectiveMembership)->
// size() <= 1
package validateCaseDefinitionOnlyOneObjective_invalid1 {
	case def CaseDef {
		objective {
			doc /* Objective 1. */
		}
		objective {
			doc /* Objective 2. */
		}
	}
}
