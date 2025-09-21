// ItemPortInterface.sysml

package IPI {
  doc /*
   * This package implments AADL-style port comunication differently than AADL.sysml
   * 
   * The differences are:
   *   Items are exchanged between components through ports instead of Parts.
   *   The value of an Item (if any) must be information, specialization of Base::DataValue.
   *   Interfaces are used to connect ports.  (Interfaces have been adopted by AADL.sysml, but differently.)
   *   The biggest difference is the methodology of specializing Item/Port/Interface definitions rather than usages.
   */

//  private import AADL::Feature;
  private import Interfaces::BinaryInterface;
  private import Flows::Flow;
  private import Assertion::Assert;

// Items

  item def AadlEvent;
  item def AadlFeature;
  part def Thread;
  part def System;
  part def Process;
  part def Device;
  port def BusAccess;
  
  abstract item def AadlData {
    doc 
    /* specialize AadlData and specialize 'value'
     * to be data type sent/received by the AADL data port
     */
    attribute value : Base::DataValue;
  }
  
  abstract item def AadlEventData {
    doc 
    /* specialize AadlEventData and specialize 'value'
     * to be data type sent/received by the AADL event data port
     */
    attribute value : Base::DataValue;
  }

// Ports

  port def EventPort :> AadlFeature {
    out item itm : AadlEvent; 
  }

  abstract port def DataPort :> AadlFeature {
    doc
    /*
     * Specialize DataPort for the specialized item
     * AadlData which specifies the data type of the
     * payload of the items sent.
     * Conjugate the DataPort specialization for 'in' ports
     */
    out item itm : AadlData;
    attribute Base_Address : Memory_Properties::Base_Address;
  }
  
  abstract port def EventDataPort :> AadlFeature {
    doc
    /*
     * Specialize EventDataPort for the specialized item
     * AadlEventData which specifies the data type of the
     * payload of the items sent.
     * Conjugate the DataPort specialization for 'in' ports
     */
    out item itm : AadlEventData;
    attribute Base_Address : Memory_Properties::Base_Address;
    attribute Queue_Size : Communication_Properties::Queue_Size default 1;
  }

// Interfaces

  interface def EventConnection :> BinaryInterface {
    doc
    /*
     * use EventConnection to connect an 'out' event port to an 'in' event port
     * 'move' performs message transfer from source to target, immediately
     * 'move' is invoked by the sender (source)
     */
    end source : EventPort :> source;
    end target : ~EventPort :> target; 
    
    flow move : Flow {
        end occurrence source : EventPort :>> source = BinaryInterface::source;
        end occurrence target : ~EventPort :>> target = BinaryInterface::target;
      }
  }

  interface def DataConnection :> BinaryInterface {
    doc
    /*
     * use DataConnection to connect an 'out' data port to an 'in' data port
     * DataConnection is used to read a value at will
     * 'move' performs message transfer from source to target, immediately
     * 'move' is invoked by the receiver (target)
     */
    end source : DataPort :> source;
    end target : ~DataPort :> target; 
    
    flow move : Flow {
        end occurrence source : DataPort :>> source = BinaryInterface::source;
        end occurrence target : ~DataPort :>> target = BinaryInterface::target;
      }
  }

  interface def EventDataConnection :> BinaryInterface {
    doc
    /*
     * use DataConnection to connect an 'out' event-data port to an 'in' event-data port
     * 'move' performs message transfer from source to target, immediately
     */
    end source : EventDataPort :> source;
    end target : ~EventDataPort :> target; 
    
    flow move : Flow {
        end occurrence source : EventDataPort :>> source = BinaryInterface::source;
        end occurrence target : ~EventDataPort :>> target = BinaryInterface::target;
      }
  }

  state def <IS> InitialState {
    doc /* Every AADL state machine must have exactly one initial state */
  }
  
  state def <CS> CompleteState {
    doc /* Entering a complete state suspends execution until the next dispatch.
     * Transitions leaving complete states must have dispatch condition guards.
     */
  }
  
  state def <ES> ExecutionState {
    doc /* Execution states are transitory and are occupied for negligible
     * or zero time durations.  Transitions leaving execution states may have
     * guards with (almost) any boolean expression.  Some transition from
     * an execution state must have true guard for it to be transitory.
     */
  }
  
  state def <FS> FinalState {
    doc /* Final states have no outgoing transitions.  Thread halts. */
  }
  
  state def <ASM> AADLStateMachine {
    doc /* AADL state machines have exactly one initial state. 
     * Specialize the initial state to initialize attributes.
     * Insert "var" attributes to hold persistent values.
     */
     
    entry; then init;
    
    state init : InitialState {
      doc /* "init" is the unique initial state. 
       * Sphecialize "init" to initialize variable attributes. */
      @Assert{f="true";}
    }
    
  }
}