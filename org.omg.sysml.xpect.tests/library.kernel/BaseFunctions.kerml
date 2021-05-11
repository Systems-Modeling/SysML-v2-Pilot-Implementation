package BaseFunctions {
	private import Base::Anything;
	private import Objects::Object;
	private import ScalarValues::*;
	private import ControlFunctions::exists;
	private import ControlFunctions::select;
	private import ControlFunctions::reject;
	
	function '=='(x: Anything[0..*], y: Anything[0..*]): Boolean;
	function '!='(x: Anything[0..*], y: Anything[0..*]): Boolean;
	
	function ToString(x: Anything[0..1]): String;
	
	function '['(seq: Anything[0..*] ordered, index: Anything[0..*]): Anything[0..1];
	function ','(seq1: Anything[0..*] ordered, seq2: Anything[0..*] ordered): Anything[0..*] ordered;
	
    abstract function 'all'(): Object[0..*] {
    	abstract feature all 'type': Object;
    }
    
    /** Deprecated */
	abstract function 'allInstances'(): Object[0..*] {
		abstract feature all 'type': Object;
	}
	
	abstract function 'istype'(x: Anything[1]): Boolean {
		abstract feature 'type': Anything;
	}
	
	abstract function '@'(x: Anything[1]): Boolean {
		abstract feature 'type': Anything;
	}
	
	/** Deprecated */
	abstract function 'instanceof'(x: Anything[1]): Boolean {
		abstract feature 'type': Anything;
	}
	
	abstract function 'hastype'(x: Anything[1]): Boolean {
		abstract feature 'type': Anything;
	}
	
	abstract function 'as'(seq: Anything[0..*]): Anything[0..*] {
		abstract feature 'type': Anything;
	}
	
}