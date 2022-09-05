package Connections {
	doc
	/*
	 * This package defines the base types for connections and related structural elements 
	 * in the SysML language.
	 */

	private import Base::Anything;
	private import Occurrences::Occurrence;
	private import Occurrences::HappensDuring;
	private import Objects::LinkObject;
	private import Objects::linkObjects;
	private import Objects::BinaryLinkObject;
	private import Objects::binaryLinkObjects;
	private import Transfers::Transfer;
	private import Transfers::transfers;
	private import Transfers::TransferBefore;
	private import Transfers::transfersBefore;
	private import ScalarValues::Natural;
	private import Parts::Part;
	private import Parts::parts;
	private import Actions::Action;
	private import Actions::actions;

	abstract connection def Connection :> LinkObject, Part {
		doc
		/*
		 * Connection is the most general class of links between things within some 
		 * containing structure. Connection is the base type of all ConnectionDefinitions.
		 */
	}
	 
	abstract connection def BinaryConnection :> Connection, BinaryLinkObject {
		doc
		/*
		 * BinaryConnection is the most general class of binary links between two things 
		 * within some containing structure. BinaryConnection is the base type of all 
		 * ConnectionDefinitions with exactly two ends.
		 */
	
		end source: Anything[0..*] :>> BinaryLinkObject::source;
		end target: Anything[0..*] :>> BinaryLinkObject::target;
	}
	
	abstract connection def FlowConnection :> BinaryConnection, Transfer {
		doc
		/*
		 * FlowConnection is the class of binary connections that represent a transfer 
		 * of objects or values between two occurrences. It is the base type of all
		 * FlowConnectionUsages.
		 */
	
		end source: Occurrence[0..*] :>> BinaryConnection::source, Transfer::source;
		end target: Occurrence[0..*] :>> BinaryConnection::target, Transfer::target;
		
		/* Review: Was defaulting to source/target, but these events are supposed to be "internal"
		 * to source/target that happen before/after the transfer. See successions below.
		 * Changed to start/done of the transfer, which still don't commit to implementation and
		 * are sort of internal to source/target since they're supposed to happen at least at
		 * the spatial boundary of the source/target. Alternatively could make start/endEvent
		 * optional with no default, not sure. */
		part fcp = self;
		event occurrence sourceEvent [1] default fcp.start;
		event occurrence targetEvent [1] default fcp.done;
		
		/* Review: Unless this is stated more generally somewhere. */
		connection :HappensDuring connect sourceEvent to source[1];
		connection :HappensDuring connect targetEvent to target[1];
		
		attribute seBeforeNum: Natural[1] = if sourceEvent==fcp.start ? 0 else 1;
		attribute teAfterNum: Natural[1] = if targetEvent==fcp.done ? 0 else 1;
		succession [seBeforeNum] first sourceEvent[0..1] then self[0..1];
		succession [teAfterNum] first self[0..1] then targetEvent[0..1];

		ref payload :>> Transfer::'item';
	}
	
	abstract connection def SuccessionFlowConnection :> FlowConnection, TransferBefore {
		doc
		/*
		 * SuccessionFlowConnection is the subclass of flow connections that represent 
		 * temporally ordered transfers. It is the base type of all SuccessionFlowConnectionUsages.
		 */
	
		end source: Occurrence[0..*] :>> FlowConnection::source, TransferBefore::source;
		end target: Occurrence[0..*] :>> FlowConnection::target, TransferBefore::target;
	}
	
	abstract connection connections: Connection[0..*] nonunique :> linkObjects, parts {
		doc
		/*
		 * connections is the base feature of all ConnectionUsages.
		 */
	}
	
	abstract connection binaryConnections: Connection[0..*] nonunique :> connections, binaryLinkObjects {
		doc
		/*
		 * binaryConnections is the base feature of all binary ConnectionUsages.
		 */
	}
	
	abstract connection flowConnections: FlowConnection[0..*] nonunique :> binaryConnections, transfers {
		doc
		/*
		 * flowConnections is the base feature of all FlowConnectionUsages.
		 */
	
		end source: Occurrence[0..*] :>> FlowConnection::source, binaryConnections::source, transfers::source;
		end target: Occurrence[0..*] :>> FlowConnection::target, binaryConnections::target, transfers::target;
	}
	
	abstract connection successionFlowConnections: SuccessionFlowConnection[0..*] nonunique :> flowConnections, transfersBefore {
		doc
		/*
		 * successionFlowConnections is the base feature of all SuccessionFlowConnectionUsages.
		 */
	
		end source: Occurrence[0..*] :>> SuccessionFlowConnection::source, flowConnections::source, transfersBefore::source;
		end target: Occurrence[0..*] :>> SuccessionFlowConnection::target, flowConnections::target, transfersBefore::target;
	}
}