// Constraint: validateBehaviorSpecialization (context: Behavior)
// A Behavior must not specialize a Structure.
// ownedSpecialization.general->forAll(not oclIsKindOf(Structure))
package validateBehaviorSpecialization_valid1 {
	action def a1; 	
 	action def a2 :> a1;
}