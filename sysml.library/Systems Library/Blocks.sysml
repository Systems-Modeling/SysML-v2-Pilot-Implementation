/**
 * This package defines the base types for blocks and related structural elements in the
 * SysML language.
 */
package Blocks {
	private import Base::*;
	
	/**
	 * Part is the most general class of objects that represent all or a part of a system.
	 * Part is the base type of all blocks.
	 */
	block Part :> Object {
		ref self: Part :>> Base::self;
		
		part start: Part :>> startShot;
		part done: Part :>> endShot;
		
		/**
		 * Ports that are on this part.
		 */
		abstract port ports: Port[0..*] :> objects;
		
		/**
		 * Actions that are performed by this part.
		 */
		abstract ref action performedActions: Activities::Action[0..*] :> enactedPerformances;
		
		/**
		 * States that are exhibited by this part.
		 */
		abstract ref state exhibitedStates: States::State[0..*] :> performedActions;
		
		/**
		 * Constraints that are asserted by this part.
		 */
		abstract ref constraint assertedConstraints: Constraints::ConstraintCheck[0..*] :> enactedPerformances;
	}
	
	/**
	 * Port is the most general class of objects that represent connection points
	 * for interacting with a part. Port is the base type of all port definitions.
	 */
	port def Port :> Part;
	
	/**
	 * Connection is the most general class of links between two parts within
	 * some containing structure. Connction is the base type of all association
	 * blocks.
	 * 
	 * (Note that this does not include binding connectors, which are typed by
	 * the kernel association SelfLink.)
	 */
	assoc block Connection :> BinaryLink, Part { // Need to handle n-ary interfaces.
		end source: Part[0..*] :>> BinaryLink::source;
		end target: Part[0..*] :>> BinaryLink::target;
	}
	
	/**
	 * Interface is the most general class of links between two ports on parts 
	 * within some containing structure. Interface is the base type of all
	 * interface definitions.
	 */
	interface def Interface :> Connection { 
		end source: Port[0..*] :>> Connection::source;
		end target: Port[0..*] :>> Connection::target;
	}
	
	/**
	 * Value is the most general type of data values that represent value properties of a 
	 * system or part of a system. Value is the base type of all value types.
	 */
	value type Value :> DataValue;
	
	/** 
	 * parts is the base feature of all part properties.
	 */
	abstract part parts: Part[0..*] :> objects;
	
	/**
	 * connections is the base feature of all connection usages (connectors).
	 */
	abstract part connections: Connection[0..*] :> links;
	
	/**
	 * interfaces is the base feature of all interface usages (connectors).
	 */
	abstract part interfaces: Interface[0..*] :> connections;
	
	/**
	 * values is the base feature for all value properties.
	 */
	abstract value values: Value[0..*] :> dataValues;		

}