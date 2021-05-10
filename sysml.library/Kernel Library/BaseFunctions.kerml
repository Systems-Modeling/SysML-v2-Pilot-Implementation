package BaseFunctions {
	private import Base::Anything;
	private import Objects::Object;
	private import ScalarValues::*;
	private import ControlFunctions::exists;
	private import ControlFunctions::select;
	private import ControlFunctions::reject;
	
	function '=='(x: Anything[0..*] ordered nonunique, y: Anything[0..*] ordered nonunique): Boolean;
	function '!='(x: Anything[0..*] ordered nonunique, y: Anything[0..*] ordered nonunique): Boolean;
	
	function ToString(x: Anything[0..1]): String;
	
	function '['(seq: Anything[0..*] ordered nonunique, index: Anything[0..*] ordered nonunique): Anything[0..1];
	function ','(seq1: Anything[0..*] ordered nonunique, seq2: Anything[0..*] ordered nonunique): Anything[0..*] ordered nonunique;
	
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
	
	abstract function 'as'(seq: Anything[0..*] ordered nonunique): Anything[0..*] ordered nonunique {
		abstract feature 'type': Anything;
	}
	
}