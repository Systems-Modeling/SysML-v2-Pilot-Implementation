package '15_11-Variable Length Collection Types' {
	import ScalarValues::*;
	import NonScalarValues::*;
	
	block SparePart;
	block Person;
	
	/* TODO: Define syntactic sugar for instantiating collection types. */
	
	value type 'Bag<SparePart>' :> Bag {
		ref :>> values: SparePart;
	}
	
	value type 'Sequence<Integer>' :> Sequence {
		value :>> values: Integer;
	}
	
	value type 'List<Integer>' :> List {
		value :>> values: Integer;
	}
	
	value type 'Set<String>' :> Set {
		value :>> values: String;
	}
	
	value type 'OrderedSet<Person>' :> OrderedSet {
		ref :>> values: Person;
	}
	
	value type 'Sequence<Set<Person>>' :> Sequence {
		value :>> values: Set {
			ref :>> values: Person;
		}
	}
}