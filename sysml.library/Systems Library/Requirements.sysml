/**
 * This package defines the base types for requirements and related elements in the SysML language.
 */
package Requirements {
	private import Base::Anything;
	private import ScalarValues::String;
	private import ControlFunctions::allTrue;
	private import Constraints::*;
	
	/**
	 * RequirementConstraintCheck is the base ConstraintCheck for RequirementCheck, defining the
	 * separate assumeptions and required constraints such that, if all the assumptions are true,
	 * then all the required constraints must be true.
	 */
	private abstract constraint def RequirementConstraintCheck {
		/**
		 * Assumptions that must hold for the required constraints to apply.
		 */
		ref constraint assumptions[0..*] :> constraintChecks;
		
		/**
		 * The required constraints that are to be checked.
		 */
		ref constraint constraints[0..*] :> constraintChecks;
		
		/**
		 * If all the assumptions are true, then all the required constraints must hold.
		 */
		!allTrue(assumptions) | allTrue(constraints)	
	}
	
	/**
	 * RequirementCheck is the most general class for requirements checking. RequirementsCheck is the base
	 * type of all requirement definitions.
	 * 
	 * The subject is the entity that is being check for satisfaction of the required constraints.
	 */
	requirement def RequirementCheck(subject: Anything) :> RequirementConstraintCheck {
		
		/**
		 * Nested requirements, which are also required constraints.
		 */
		ref requirement subrequirements[0..*] :> requirementChecks, constraints;
		
	}
	
	/**
	 * A functional requirement specifies an action that a system, or part of a system, must perform.
	 */
	requirement def FunctionalRequirementCheck(subject: Activities::Action) :> RequirementCheck;
	
	/** 
	 * An interface requirement specifies an interface for connecting systems and system parts, which
	 * optionally may include item flows across the interface and/or interface constraints.
	 */
	requirement def InterfaceRequirementCheck(subject: Blocks::Interface) :> RequirementCheck;
	
	/**
	 * A performance requirement quantitavely measures the extent to which a system, or a system part, 
	 * satisfies a required capability or condition.
	 */
	requirement def PerformanceRequirementCheck(subject: Blocks::Value) :> RequirementCheck;
	
	/**
	 * A physical requirement specifies physical characteristics and/or physical constraints of the 
	 * system, or a system part.
	 */
	requirement def PhysicalRequirementCheck(subject: Blocks::Part) :> RequirementCheck;
	
	/**
	 * A design constraint specifies a constraint on the implementation of the system or system part, 
	 * such as the system must use a commercial off the shelf component.
	 */
	requirement def DesignConstraintCheck(subject: Blocks::Part) :> RequirementCheck;
	
	/**
	 * requirementChecks is the base feature of all requirement usages.
	 */
	requirement requirementChecks: RequirementCheck[0..*] (subject: Anything) :> constraintChecks;
	
}