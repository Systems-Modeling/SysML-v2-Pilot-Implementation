/**
 * This package defines the base types for constraints and related elements in the
 * SysML language.
 */
package Constraints {
	private import Base::*;
	private import Blocks::*;
	
	/**
	 * ConstraintCheck is the most general class for constraint checking. ConstraintCheck is the base
	 * type of all constraint definitions.
	 */
	constraint def ConstraintCheck :> BooleanEvaluation, Part;
	
	/**
	 * constraintChecks is the base feature of all constraint usages.
	 */
	abstract constraint constraintChecks: ConstraintCheck[0..*] :> booleanEvaluations, parts;
		
}