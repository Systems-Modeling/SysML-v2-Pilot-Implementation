/**
 * This package defines the base types for items and related structural elements in the
 * SysML language.
 */
package Items {
	private import Objects::Object;
	private import Objects::objects;
	private import Parts::Part;
	private import Parts::parts;
	private import Constraints::ConstraintCheck;
	private import Constraints::constraintChecks;
	private import SequenceFunctions::notEmpty;
	private import ScalarValues::Boolean;
	
	/**
	 * Item is the most general class of objects that are part of, exist in or flow through a system. 
	 * Item is the base type of all ItemDefinitions.
	 */
	abstract item def Item :> Object {
		ref self: Item :>> Object::self;
		
		item start: Item :>> startShot;
		item done: Item :>> endShot;
		
		item shape : Item :>> spaceBoundary;
		attribute isSolid : Boolean [1] = ( notEmpty(shape) & innerSpaceDimension == 3 );
		
		/**
		 * The Items that are composite subitems of this Item.
		 */
		abstract item subitems: Item[0..*];
		
		/**
		 * The subitems of this Item that are Parts.
		 */
		abstract part subparts: Part[0..*] :> subitems, parts;
		
		/**
		 * Constraints that have been checked by this item.
		 */
		abstract ref constraint checkedConstraints: ConstraintCheck[0..*] :> constraintChecks, enactedPerformances;

	}
	
	/**
	 * items is the base feature of all ItemUsages.
	 */
	abstract item items : Item[0..*] nonunique :> objects;
	
}