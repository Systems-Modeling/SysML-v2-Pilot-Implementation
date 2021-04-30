package CollectionFunctions {
	private import Base::Anything;
	import ScalarValues::*;
	import Collections::*;
	private import ControlFunctions::exists;
	
	
	function size (col: Collection[1]): Natural {
		SequenceFunctions::size(col::elements)
	}
	
	function isEmpty (col: Collection[1]): Boolean {
		SequenceFunctions::isEmpty(col::elements)
	}
	
	function notEmpty (col: Collection[1]): Boolean {
		SequenceFunctions::notEmpty(col::elements)
	}
	
	function contains(col: Collection[1], value: Anything): Boolean {
		col::elements->exists {in x; x == value}
	}	
	
	function head (col: OrderedCollection[1]): Anything[0..1] {
		SequenceFunctions::head(col::elements)
	}
	
	function tail (col: OrderedCollection[1]): Anything[0..1] {
		SequenceFunctions::tail(col::elements)		
	}
	
	function last (col: OrderedCollection[1]): Anything[0..1] {
		SequenceFunctions::last(col::elements)
	}
	
	function '[' specializes BaseFunctions::'[' (col: OrderedCollection[1], index: Integer[*]): Anything[0..1] {
		col::elements[index]
	}	
}
