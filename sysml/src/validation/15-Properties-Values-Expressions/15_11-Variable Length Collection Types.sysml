package '15_11-Variable Length Collection Types' {
	import ScalarValues::*;
	import NonScalarValues::*;
	
	part def SparePart;
	part def Person;
	
	/* TODO: Define syntactic sugar for instantiating collection types. */
	
	attribute def 'Bag<SparePart>' :> Bag {
		ref :>> values: SparePart;
	}
	
	attribute def 'Sequence<Integer>' :> Sequence {
		value :>> values: Integer;
	}
	
	attribute def 'List<Integer>' :> List {
		value :>> values: Integer;
	}
	
	attribute def 'Set<String>' :> Set {
		value :>> values: String;
	}
	
	attribute def 'OrderedSet<Person>' :> OrderedSet {
		ref :>> values: Person;
	}
	
	attribute def 'Sequence<Set<Person>>' :> Sequence {
		value :>> values: Set {
			ref :>> values: Person;
		}
	}
	
	attribute def 'Array<Real>[4]' :> Sequence {
		value :>> values: Real[4];
	}
}