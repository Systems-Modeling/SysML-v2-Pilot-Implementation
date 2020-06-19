/**
 * This package defines the base types for items and related structural elements in the
 * SysML language.
 */
package Items {
	private import Objects::Object;
	private import Objects::objects;
	private import Constraints::ConstraintCheck;
	
	/**
	 * Item is the most general class of objects that are part of, exist in or flow through a system. 
	 * Item is the base type of all ItemDefinitions.
	 */
	abstract block Item :> Object {
		ref :>> self: Item;
		
		part start: Item :>> startShot;
		part done: Item :>> endShot;
		
		/**
		 * Constraints that are asserted by this item.
		 */
		abstract ref constraint assertedConstraints: ConstraintCheck[0..*] :> enactedPerformances;
	}
	
	/**
	 * items is the base feature of all ItemUsages.
	 */
	abstract part items : Item[0..*] :> objects;
	
}