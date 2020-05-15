/**
 * This package defines the base types for function definitions and related behavioral elements in the
 * SysML language.
 */
package Functions {
	private import Activities::*;
	private import Performances::*;
	
	/**
	 * FunctionInvocation is the most general class of invocations of FunctionDefinitions in a
	 * system or part of a system. FunctionInvocation is the base class of all FunctionDefinitions.
	 */
	activity FunctionInvocation :> Action, Evaluation {
		ref action :>> self: FunctionInvocation;
		
		/**
		 * The subactions of this FunctionInvocation that are FunctionInvocations.
		 */
		action subinvocations: FunctionInvocation :> functionInvocations, subactions;
		
	}
	
	/**
	 * functionInvocations is the base Feature for all FunctionUsages.
	 */
	action functionInvocations: FunctionInvocation[*] :> actions, evaluations;
}