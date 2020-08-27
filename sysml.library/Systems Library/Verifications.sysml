/**
 * This package defines the base types for verification cases and related behavioral elements 
 * in the SysML language.
 */
package Verifications {
	private import Cases::Case;
	private import Cases::cases;
	
	/**
	 * VerificationCase is the most general class of performances of VerificationCaseDefinitions. 
	 * VericationCase is the base class of all VerificationCaseDefinitions.
	 */
	case def VerificationCase :> Case (subject[1]) {
		ref case :>> self : VerificationCase;
		
		/**
		 * The subcases of this VerificationCase that are VerificationCaseUsages.
		 */
		abstract ref case subVerificationCases : Case[0..*] :> verificationCases, subcases;
		
	}
	
	/**
	 * verificationCases is the base feature of all VerificationCaseUsages.
	 */
	abstract case verificationCases : VerificationCase[0..*] :> cases;
	
}