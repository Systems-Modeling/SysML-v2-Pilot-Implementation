// Constraint: validateStructureSpecialization (context: Structure)
// A Structure must not specialize a Behavior.
// ownedSpecialization.general->forAll(not oclIsKindOf(Behavior))
package validateStructureSpecialization_valid1 {
	part def pd1;
	part def :> pd1;
}