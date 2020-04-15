package NonScalarFuncitons {
	import BaseFunctions::*;
	import ScalarValues::*;
	import NonScalarValues::*;
	
	function size(col: Collection[1]): Natural :> BaseFunctions::size {
		BaseFunctions::size(col::values)
	}
	
	function isEmpty(col: Collection[1]): Boolean :> BaseFunctions::isEmpty {
		BaseFunctions::isEmpty(col::values)
	}
	
	function notEmpty(col: Collection[1]): Boolean :> BaseFunctions::notEmpty {
		BaseFunctions::notEmpty(col::values)
	}
	
	function contains(col: Collection[1], value: Anything): Boolean {
		col::values->exists x (x == value)
	}	
	
	function head(col: OrderedCollection[1]): Anything[0..1] :> BaseFunctions::head {
		BaseFunctions::head(col::values)
	}
	
	function tail(col: OrderedCollection[1]): Anything[0..1] :> BaseFunctions::tail {
		BaseFunctions::tail(col::values)		
	}
	
	function last(col: OrderedCollection[1]): Anything[0..1] :> BaseFunctions::last {
		BaseFunctions::last(col::values)
	}
	
	function '['(col: OrderedCollection[1], index: Integer[1]): Anything[0..1] :> BaseFunctions::'[' {
		col::values[index]
	}
	
}