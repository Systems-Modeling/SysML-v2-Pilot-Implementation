/**
 * This package defines the base types for constraints and related elements in the
 * SysML language.
 */
package Constraints {
	private import Base::*;
	private import Blocks::*;
	
	/**
	 * Constraint is the most general class of constraints. Constraint is the base
	 * type of all constraint definitions.
	 */
	constraint def Constraint :> BooleanEvaluation, Part;
	
	/**
	 * constraints is the base feature of all constraint usages.
	 */
	abstract constraint constraints: Constraint[0..*] :> objects;
		
}