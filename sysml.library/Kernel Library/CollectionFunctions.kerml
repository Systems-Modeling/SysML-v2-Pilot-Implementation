package CollectionFunctions {
	private import Base::Anything;
	private import ScalarValues::*;
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
	
	function tail (col: OrderedCollection[1]): Anything[0..*] ordered nonunique {
		SequenceFunctions::tail(col::elements)		
	}
	
	function last (col: OrderedCollection[1]): Anything[0..1] {
		SequenceFunctions::last(col::elements)
	}
	
	function '[' specializes BaseFunctions::'[' (col: OrderedCollection[1], index: Positive[1]): Anything[0..1] {
		// Cast ensures this function is not called recursively if the elements of col are OrderedCollections.
		(col::elements as Anything)[index]
	}
	
	function 'array[' specializes '[' (arr: Array[1], indexes: Positive[n] ordered nonunique): Anything[0..1] {
		private feature n : Natural = arr::rank;
		
		// Assumes row-major ordering for elements.
		private function index(arr: Array[1], i : Natural, indexes : Positive[1..n]) {
			i <= 1? indexes[1]: arr::dimensions[i] * (index(arr, i-1, indexes) - 1) + indexes[i]
		}
		
		n == 0 || (1..n)->exists {in i; indexes[i] > arr::dimensions[i]}? null: 
			arr::elements[index(arr, n, indexes)]
	}	
}
