package Blocks {
	private import Base::*;
	
	block Part :> Object {
		abstract port ports: Port[0..*] subsets objects;
		abstract action performedExecutions: Activities::Execution[0..*] redefines enactedPerformances;	
	}
	
	value type Value :> Base::Value;
	
	port def Port :> Part;
	
	interface def Interface :> BinaryLink { // Need to handle n-ary interfaces.
		end source: Port[0..*] redefines BinaryLink::source;
		end target: Port[0..*] redefines BinaryLink::target;
	}
	
	abstract part parts: Part[0..*] subsets objects;
	abstract part interfaces: Interface[0..*] subsets links;
	abstract value values: Value[0..*] subsets Base::values;	
		
}