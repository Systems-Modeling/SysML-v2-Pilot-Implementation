package Blocks {
	private import Base::*;
	
	block Part :> Object {
		abstract port ports: Port[0..*] :> objects;
		abstract action performedActions: Activities::Action[0..*] := enactedPerformances;	
	}
	
	value type Value :> Base::Value;
	
	port def Port :> Part;
	
	assoc block Connection :> BinaryLink, Part { // Need to handle n-ary interfaces.
		end source: Part[0..*] := BinaryLink::source;
		end target: Part[0..*] := BinaryLink::target;
	}
	
	interface def Interface :> Connection { 
		end source: Port[0..*] := Connection::source;
		end target: Port[0..*] := Connection::target;
	}
	
	abstract part parts: Part[0..*] :> objects;
	abstract part connections: Connection[0..*] :> links, parts;
	abstract part interfaces: Interface[0..*] :> connections;
	abstract value values: Value[0..*] :> Base::values;	
		
}