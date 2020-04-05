/**
 * This package defines the base types for requirements and related elements in the SysML language.
 */
package Requirements {
	private import Base::Anything;
	private import ScalarValues::String;
	private import ControlFunctions::allTrue;
	private import Constraints::*;
	
	/**
	 * RequirementCheck is the most general class for requirements checking. RequirementsCheck is the base
	 * type of all requirement definitions.
	 */
	constraint def RequirementCheck :> ConstraintCheck {
		/**
		 * The subject entity that is being check for satisfaction of the required constraints.
		 */
		ref subject: Anything;
		
		/**
		 * Assumptions that must hold for the required constraints to apply.
		 */
		constraint assumptions[0..*] :> constraintChecks;
		
		/**
		 * The required constraints that are to be checked.
		 */
		constraint constraints[0..*] :> constraintChecks;
		
		/**
		 * If all the assumptions are true, then all the required constraints must hold.
		 */
		assert constraint { 
			!allTrue(assumptions) | allTrue(constraints)
		}
	}
	
	/**
	 * A functional requirement specifies an action that a system, or part of a system, must perform.
	 */
	constraint def FunctionalRequirementCheck :> RequirementCheck {
		ref subject: Activities::Action redefines RequirementCheck::subject;
	}
	
	/** 
	 * An interface requirement specifies an interface for connecting systems and system parts, which
	 * optionally may include item flows across the interface and/or interface constraints.
	 */
	constraint def InterfaceRequirementCheck :> RequirementCheck {
		ref subject: Blocks::Interface redefines RequirementCheck::subject;
	}
	
	/**
	 * A performance requirement quantitavely measures the extent to which a system, or a system part, 
	 * satisfies a required capability or condition.
	 */
	constraint def PerformanceRequirementCheck :> RequirementCheck {
		value subject: Blocks::Value redefines RequirementCheck::subject;
	}
	
	/**
	 * A physical requirement specifies physical characteristics and/or physical constraints of the 
	 * system, or a system part.
	 */
	constraint def PhysicalRequirementCheck :> RequirementCheck {
		ref subject: Blocks::Part redefines RequirementCheck::subject;
	}
	
	/**
	 * A design constraint specifies a constraint on the implementation of the system or system part, 
	 * such as the system must use a commercial off the shelf component.
	 */
	constraint def DesignConstraintCheck :> RequirementCheck {
		ref subject: Blocks::Part redefines RequirementCheck::subject;
	}
	
	/**
	 * requirementChecks is the base feature os all requirement usages.
	 */
	constraint requirementChecks: RequirementCheck[0..*] :> constraintChecks;
	
}