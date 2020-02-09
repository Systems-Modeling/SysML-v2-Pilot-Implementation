package ScalarFunctions {
	import ScalarValues::*;
	
	abstract function '+'(x: ScalarValue, y: ScalarValue[0..1]): ScalarValue;
	abstract function '-'(x: ScalarValue, y: ScalarValue[0..1]): ScalarValue;
	abstract function '*'(x: ScalarValue, y: ScalarValue): ScalarValue;
	abstract function '/'(x: ScalarValue, y: ScalarValue): ScalarValue;
	abstract function '**'(x: ScalarValue, y: ScalarValue): ScalarValue;
	abstract function '%'(x: ScalarValue, y: ScalarValue): ScalarValue;
	
	abstract function '!'(x: ScalarValue): ScalarValue;
	abstract function '~'(x: ScalarValue): ScalarValue;
	
	abstract function '|'(x: ScalarValue, y: ScalarValue): ScalarValue;
	abstract function '^'(x: ScalarValue, y: ScalarValue): ScalarValue;
	abstract function '&'(x: ScalarValue, y: ScalarValue): ScalarValue;
	
	abstract function '<'(x: ScalarValue, y: ScalarValue): Boolean;
	abstract function '>'(x: ScalarValue, y: ScalarValue): Boolean;
	abstract function '<='(x: ScalarValue, y: ScalarValue): Boolean;
	abstract function '>='(x: ScalarValue, y: ScalarValue): Boolean;
	
	abstract function Max(x: ScalarValue, y: ScalarValue): ScalarValue;
	abstract function Min(x: ScalarValue, y: ScalarValue): ScalarValue;
	
	abstract function '@'(x: ScalarValue, y: Base::Anything): ScalarValue;
	
	abstract function '..'(lower: ScalarValue, upper: ScalarValue): ScalarValue[0..*];
	
	function sum(collection: ScalarValue[0..*], zero: ScalarValue): ScalarValue {
		collection->reduce '+' ?? zero
	}
	
	function product(collection: ScalarValue[0..*], one: ScalarValue): ScalarValue {
		collection->reduce '*' ?? one
	}
}