/**
 * This package defines the base types for analysis cases and related behavioral elements 
 * in the SysML language.
 */
package Analyses {
	private import Performances::Evaluation;
	private import Performances::evaluations;
	private import Cases::Case;
	private import Cases::cases;
	
	/**
	 * AnalysisCase is the most general class of performances of AnalysisCaseDefinitions. 
	 * AnalysisCase is the base class of all AnalysisCaseDefinitions.
	 * 
	 * The result of this AnalysisCase is bound to the result of the resultEvaluation.
	 */
	calc def AnalysisCase :> Case (subject[1]) result[0..*] {
		
		/**
		 * The subactions of this AnalysisCase that are AnalysisActions.
		 */
		action analysisSteps : AnalysisAction[0..*] :> subactions;
		
		/**
		 * The Evaluation of the resultExpression from the definition of this AnalysisCase.
		 */
		calc resultEvaluation : Evaluation[0..1] :> evaluations () result[0..*];
		
		bind resultEvaluation::result = AnalysisCase::result;
	}
	
	/**
	 * An AnalysisAction is a specialized kind of Action intended to be used as a step in an AnalysisCase.
	 */
	action def AnalysisAction;
	
	/**
	 * analysisCases is the base feature of all AnalysisCaseUsages.
	 */
	calc analysisCases : AnalysisCase[0..*] :> cases;
}