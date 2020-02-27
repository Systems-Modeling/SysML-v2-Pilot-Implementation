package BaseFunctions {
	import Base::*;
	import ScalarValues::*;
	
	function '=='(x: Anything, y: Anything): Boolean;
	function '!='(x: Anything, y: Anything): Boolean;
	
	function ToString(x: Anything): String;
	
	function size(seq: Anything[*]): Natural;
	function isEmpty(seq: Anything[*]): Boolean;
	function notEmpty(seq: Anything[0..*]): Boolean;
	
	function head(seq: Anything[0..*]): Boolean;
	function tail(seq: Anything[0..*]): Boolean;
	function last(seq: Anything[0..*]): Boolean;
	
	function '['(seq: Anything[0..*], index: Integer): Anything[0..1];
	function ','(x: Anything, seq: Anything[0..*]): Anything[0..*];

	abstract function 'allInstances'(): Object[0..*] {
		abstract feature all type: Object;
	}
	
	abstract function 'instanceof'(x: Anything): Boolean {
		abstract feature type: Anything;
	}
	
	abstract function 'hastype'(x: Anything): Boolean {
		abstract feature type: Anything;
	}
	
}