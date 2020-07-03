/**
 * This package defines the base types for cases and related behavioral elements 
 * in the SysML language.
 */
package Cases {
	private import Calculations::Calculation;
	private import Calculations::calculations;
	
	/**
	 * Case is the most general class of performances of CaseDefinitions. 
	 * Case is the base class of all CaseDefinitions.
	 * 
	 * It's parameter is the subject that was investigated by this Case.
	 */
	abstract case def Case :> Calculation (subject[1]) result[0..*] {
		ref case :>> self : Case;
		
		/**
		 * A check of whether the objective RequirementUsage was satisfied for this Case.
		 */
		obj objective[1] (subject = Case::result);
		
		/**
		 * Other Cases carried out as part of the performance of this Case.
		 */
		abstract ref case subcases : Case[0..*] :> cases, subcalculations;
	
	}
	
	/**
	 * cases is the base Feature of all CaseUsages.
	 */
	abstract case cases : Case[0..*] :> calculations;
}