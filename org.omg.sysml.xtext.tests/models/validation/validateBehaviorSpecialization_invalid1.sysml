// Constraint: validateBehaviorSpecialization (context: Behavior)
// A Behavior must not specialize a Structure.
// ownedSpecialization.general->forAll(not oclIsKindOf(Structure))
package validateBehaviorSpecialization_invalid1 {
	doc /* 
	 * Errors:
	 	- Cannot specialize structure
		- Duplicate of inherited member name 'self' from Action, Part
		- Duplicate of inherited member name 'start' from Action, Part
		- Duplicate of inherited member name 'done' from Action, Part
	 */
	
	part def a1; 	
 	action def a2 :> a1;
}