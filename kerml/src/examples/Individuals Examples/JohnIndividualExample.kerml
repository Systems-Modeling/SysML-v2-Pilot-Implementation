package JohnIndividualExample {
	import Base::*;
	
	classifier Occurrence_ specializes Occurrence {
		
		/** 
			This asserts that every occurrence is a sub-portion, directly or
	     	indirectly, of EXACTLY ONE maximal portion ("lifetime"), which 
	    	serves as the "identity" of all those sub-portions. 
	  	*/
	  	feature maxPortionOf : Lifetime_ [1] subsets portionOf =
	    	portionOf == self? self: Occurrence_::portionOf::maxPortionOf;
	    
	  	// The following are new features not currently in the library model
	 	// of Occurrence. They are the inverses of the above features.
	  	// (This is enforced by bidirectional associations not shown here.)
	  	feature portionOf : Occurrence_[1];
	  	feature timeSliceOf : Occurrence_[0..1] subsets portionOf;
	  	feature snapshotOf : Occurrence_[0..1] subsets timeSliceOf;
	}
	
	/**
	  This is a classification of all "lifetime" occurrences, defined to
	  be those occurrences that are "maximal portions".
	*/
	classifier all Lifetime_ specializes Occurrence_ {
	  feature redefines portionOf = self;
	}
	
	class Object_ specializes Object, Occurrence_;
	
	/**
	  This is the class of persons, each of whom has an age.
	  It is NOT restricted to maximal portions.
	  (The specialization of Object would normally be left implicit.)
	*/
	class Person specializes Object_ {
		class Lifetime specializes Person, Lifetime_;
		
		feature age : ScalarValues::Natural;
	  
	  /** 
	    These redefinitions enforce the "rigidity" constraint for Person.
	    They ensure that all portions of a person are also persons and 
	    that a person can only be a portion of another person. This implies
	    that the class Person must also include all the portions of any one 
	    of its instances. The redefinitions for the portion features
	    also implicitly constraint the typing of the time slice and snapshot
	    features, since they are subsets of portioning.
	    (It is currently awkward to have to declare these redefinitions
	    explicitly.)
	  */
	  feature redefines portions : Person;
	  feature redefines portionOf : Person;
	
	}
	
	/**
	  This is the class of presidents, each of which must be a time slice
	  of the lifetime of some individual person.
	  (Note that this class is NOT "rigid".)
	*/
	class President specializes Person {
	  feature redefines timeSliceOf : Person::Lifetime [1];
	}
	
	/**
	  This is the class of the specific (individual) person who is John.
	  There is at most one such person.
	*/
	class John specializes Person {
		class all Lifetime specializes John, Lifetime_ [0..1];
	} 
	
	/**
	  This is the class of time slices of John's life in which he is
	  a president.
	*/
	class JohnAsPresident specializes John, President;
	
	/**
	  This is the class of countries, each of which may have at most one
	  president.
	*/
	class Country specializes Object_ {
		class all Lifetime specializes Country, Lifetime_;

		feature presidentOfCountry : President[0..1];
	  
	  	// Rigidity constraint.
	  	feature redefines portions : Country;
	  	feature redefines portionOf : Country;
	}
	
	/**
	  This is the class of the specific country that is the
	  United States. It contains a single instance. The United States
	  always has a president who must be at least 35 years old.
	*/
	class UnitedStates specializes Country {
		class all Lifetime specializes UnitedStates, Lifetime_ [1];
	  	feature presidentOfUS[1] redefines presidentOfCountry {
	   		inv { age >= 35 } 
	  	}
	}
	
	/**
	  This is the class of time slices of the United States during
	  which John is president of the United States.
	*/
	class UnitedStatesWithJohnAsPresident specializes UnitedStates {
	  feature redefines timeSliceOf : UnitedStates::Lifetime;
	  feature redefines presidentOfUS : JohnAsPresident;
	}
}