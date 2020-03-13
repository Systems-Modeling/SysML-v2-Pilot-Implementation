package ControlFunctions {
	import Base::*;
	import ScalarValues::*;
	
	abstract function '?'(test: Boolean): Anything[0..*] {
		abstract composite expr thenValue[0..1] (): Anything[0..*];
		abstract composite expr elseValue[0..1] (): Anything[0..*];
	}
	
	abstract function '??'(firstValue: Anything[0..*]) {
		abstract composite expr secondValue[0..1] (): Anything[0..*];
	}
	
	abstract function '&&'(firstValue: Boolean): Boolean {
		abstract composite expr secondValue[0..1] ():Boolean;
	}
	
	abstract function '||'(firstValue: Boolean): Boolean {
		abstract composite expr secondValue[0..1] ():Boolean;
	}
	
	abstract function while('initial': Anything[0..*]): Anything[0..*] {
		abstract composite expr condition[1..*] (argument: Anything[0..*]): Boolean;
		abstract composite expr body[0..*] (argument: Anything[0..*]): Anything[0..*];
	}
	
	abstract function collect(collection: Anything[0..*]): Anything[0..*] {
		abstract composite expr mapper[0..*] (argument: Anything[1]): Anything[0..*];
	}
	
	abstract function select(collection: Anything[0..*]): Anything[0..*] {
		abstract composite expr selector[0..*] (argument: Anything[1]): Boolean;
	}
	
	abstract function reject(collection: Anything[0..*]): Anything[0..*] {
		abstract composite expr rejector[0..*] (argument: Anything[1]): Boolean;
	}
	
	abstract function reduce(collection: Anything[0..*]): Anything[0..*] {
		abstract composite expr reducer[0..*] (firstArg: Anything[1], secondArg: Anything[1]): Anything[1];
	}
	
	abstract function forAll(collection: Anything[0..*]): Boolean {
		abstract composite expr test[0..*] (argument: Anything[1]): Boolean;
	}
	
	abstract function exists(collection: Anything[0..*]): Boolean {
		abstract composite expr test[0..*] (argument: Anything[1]): Boolean;
	}
	
	function allTrue(collection: Boolean[0..*]): Boolean {
		collection->forAll x (x)
	}
	
	function anyTrue(collection: Boolean[0..*]): Boolean {
		collection->exists x (x)
	}
	
}