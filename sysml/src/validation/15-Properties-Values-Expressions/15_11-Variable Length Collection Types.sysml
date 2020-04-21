package '15_11-Variable Length Collection Types' {
	import ScalarValues::*;
	import NonScalarValues::*;
	
	block SparePart;
	block Person;
	
	/* TODO: Define syntactic sugar for instantiating collection types. */
	/* TODO: In Base.kerml and here suggest to rename feature 'values' to 'items', as the item type of the collection types can be Anything: Occurrence or DataValue. */
	
	value type 'Bag<SparePart>_MOCK' :> Bag {
		ref :>> values: SparePart;
	}
	
	value type 'Sequence<Integer>_MOCK' :> Sequence {
		value :>> values: Integer;
	}
	
	value type 'List<Integer>_MOCK' :> List {
		value :>> values: Integer;
	}
	
	value type 'Set<String>_MOCK' :> Set {
		value :>> values: String;
	}
	
	value type 'OrderedSet<Person>_MOCK' :> OrderedSet {
		ref :>> values: Person;
	}
	
	value type 'Sequence<Set<Person>>_MOCK' :> Sequence {
		value :>> values: Set {
			ref :>> values: Person;
		}
	}
	
	value type 'Array<Real>[4]_MOCK' :> Sequence {
		value :>> values: Real[4];
	}
}