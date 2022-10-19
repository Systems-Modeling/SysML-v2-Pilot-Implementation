standard library package OccurrenceFunctions {
	doc
	/*
	 * This package defines functions that operate on occurrences that exist over time.
	 */
	
	private import Occurrences::Occurrence;
	private import Occurrences::HappensDuring;
	private import ScalarValues::Boolean;
	private import ScalarValues::Positive;
	private import SequenceFunctions::notEmpty;
	private import SequenceFunctions::size;
	private import SequenceFunctions::add;
	private import SequenceFunctions::addAt;
	private import SequenceFunctions::remove;
	private import SequenceFunctions::removeAt;
	private import ControlFunctions::forAll;
	 
	function '==='{ 
		doc
		/*
		 * Test whether two occurrences are portions of the same life. That is, whether they 
		 * represent different portions of the same entity (colloquially, whether they have
		 * the same "identity").
		 * 
		 * This is the function invoked by the "===" operator in the KerML expression syntax.
		 */
		 
		in x: Occurrence[0..1]; 
		in y: Occurrence[0..1];
		
		return : Boolean[1] = x.portionOfLife == y.portionOfLife;
	}
	
	function '!==' {
		doc
		/*
		 * Test whether two occurrences are not portions of the same life. That is, the 
		 * opposite of testing with '==='.
		 * 
		 * This is the function invoked by the "!==" operator in the KerML expression syntax.
		 */
	}
	
	function same{ in x: Occurrence[0..*] ordered nonunique; in y: Occurrence[0..*] ordered nonunique; 
		doc
		/*
		 * Test whether two sequences have consist of the same occurrences (as determined by '==='),
		 * in the same order.
		 */
		return : Boolean[1] =
			size(x) == size(y) and
			(1..size(x))->forAll {in i; '==='(x[i], y[i])};
	}

	function isDuring {
		doc
		/*
		 * Test whether a performance of this function happens during the input occurrence
		 * (which means it will also be during any time-enclosed invoker of the function).
		 */
		
		in occ: Occurrence[1];
		
		private connector all during: HappensDuring[0..1] from self to occ;
		
		return : Boolean[1] = notEmpty(during);
	}
	
	function create {
		doc
		/*
		 * Ensure that the start of a given occurrence happens during a performance of this
		 * function. The occurrence is also returned from the function.
		 */
		
		inout occ: Occurrence[1];
			
		private connector : HappensDuring from occ.startShot to self;	
		
		return : Occurrence[1] = occ;
	}
	
	function destroy {
		doc
		/*
		 * Ensure that the end of a given occurrence happens during a performance of this
		 * function. The occurrence is also returned from the function.
		 */

		inout occ: Occurrence[0..1];
		
		private connector : HappensDuring from occ.endShot[0..1] to self;
		
		return : Occurrence[0..1] = occ;
	}
	
	function addNew {
		doc
		/*
		 * Add a newly created occurrence to the given group of occurrences and return the
		 * new occurrence.
		 */

		inout group: Occurrence[0..*] nonunique;
		inout occ: Occurrence[1];
		
		private composite step : add {
			inout seq1 = group;
			in seq2 = create(occ);
		}
		
		return : Occurrence[1] = occ;
	}
	
	function addNewAt {
		doc
		/*
		 * Add a newly created occurrence to the given ordered group of occurrences at the given
		 * index and return the new occurrence.
		 */

		inout group: Occurrence[0..*] ordered nonunique;
		inout occ: Occurrence[1];
		in index: Positive[1];
		
		private composite step : addAt {
			inout seq1 = group;
			in seq2 = create(occ);
			in startIndex = index;
		}
		
		return : Occurrence[1] = occ;
	}
	
	behavior removeOld {
		doc
		/*
		 * Remove a given occurrence from a group of occurrences and destroy it.
		 */

		inout group: Occurrence[0..*] nonunique;
		inout occ: Occurrence[0..1];
		
		private composite step removeStep : remove {
			inout seq1 = group;
			in seq2 = occ;
		}
		private succession removeStep then destroyStep;
		private composite step destroyStep : destroy {
			inout occ = removeOld::occ;
		}
		
	}
	
	behavior removeOldAt {
		inout group: Occurrence[0..*] ordered nonunique;
		in index: Positive[1];
		
		private feature oldOcc = group[index];
		
		private composite step removeStep : remove {
			inout seq1 = group;
			in index;
		}
		private succession removeStep then destroyStep;
		private composite step destroyStep : destroy {
			inout occ = oldOcc;
		}
		
	}
}