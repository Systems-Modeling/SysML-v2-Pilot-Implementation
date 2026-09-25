// Constraint: validateBehaviorSpecialization (context: Behavior)
// A Behavior must not specialize a Structure.
// ownedSpecialization.general->forAll(not oclIsKindOf(Structure))
package validateBehaviorSpecialization_invalid1 {
	part def a1; 	
 	action def a2 :> a1;
}