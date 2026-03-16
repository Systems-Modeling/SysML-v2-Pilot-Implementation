package 'FAQ-Libraries-Collections_vs_features_with_multiple_values' {
	doc /*
	 * How are collections different than features with multiple values?
	 * (Based on:
	 *     - "Calculation of Sum with SysML V2" by Raja, 6 Oct 2023
	 *     - "Collection functions" by Nelly Abany, 24 Oct 2023)
	 */
	
	private import NumericalFunctions::sum;
	
	attribute mass1 = 10;
	attribute mass2 = 20;
	attribute mass3 = 30;
	attribute masses = (mass1, mass2);
	attribute moreMasses = (masses, mass3);	
	
	attribute totalMass1 = sum(masses);
	attribute totalMass2 = sum( (mass1, mass2) );
	attribute totalMass3 = sum(moreMasses);
	
	attribute size1 = SequenceFunctions::size(moreMasses); // => 3
	attribute check1 = SequenceFunctions::includes(moreMasses, mass1); // => true
	
	attribute size1a = moreMasses->SequenceFunctions::size(); // => 3
	attribute check1a = moreMasses->SequenceFunctions::includes(mass1); // => true
	
	private import Collections::*;
	
	attribute massList : List {
		attribute :>> elements = (mass1, mass2);
	}
	
	attribute moreMassList : List {
		attribute :>> elements = (massList, mass3);
	}
	
	attribute size2 = moreMassList->CollectionFunctions::size(); // => 2
	attribute check2 = moreMassList->CollectionFunctions::contains(mass1); // => false

    attribute map1 : Map {
        attribute :>> elements = (
            new KeyValuePair("one", 1),
            new KeyValuePair("two", 2),
            new KeyValuePair("three", 3)
        );
    }
   
    attribute tuple = new KeyValuePair("two", 2);
    attribute has_tuple = CollectionFunctions::contains(map1, tuple); // => true
}