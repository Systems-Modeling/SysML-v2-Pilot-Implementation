library package Time {
  private import ScalarValues::Real;
  private import ScalarValues::Boolean;
  private import Base::DataValue;
  private import Assertion::Assert;
  private import Occurrences::Occurrence;
 	private import Performances::BooleanEvaluation;
 
  type Instant specializes Real {
    doc /* an instant of time */
  }
  
  type Interval specializes DataValue {
    doc /* an interval between instants
     * is empty if lowerBound = upperBound
     * and openLeft or openRight
     */
    @Assert{f="lowerBound <= upperBound";}
    feature lowerBound : Instant;
    feature upperBound : Instant;
    feature openLeft : Boolean;
    feature openRight : Boolean;    
  }

	// SFS:  Allen's Intervals
	abstract predicate precedes specializes BooleanEvaluation {
		doc /* SFS: precedes(X,Y) := death(X) < birth(Y) */
		in x : Occurrence;
		in y : Occurrence;
		x.endShot < y.startShot
	}
	
	abstract predicate meets specializes BooleanEvaluation {
		doc /* SFS: meets(X,Y) := (death(X) = birth(Y)) */
		in x : Occurrence;
		in y : Occurrence;
		x.endShot == y.startShot
	}

	abstract predicate overlaps specializes BooleanEvaluation {
		doc /* SFS: overlaps(X,Y) :=  birth(Y) < death(X) */
		in x : Occurrence;
		in y : Occurrence;
		y.startShot < x.endShot 
	}

	abstract predicate starts specializes BooleanEvaluation {
		doc /* SFS: starts(X,Y) :=  (birth(X) = birth(Y)) and (death(Y) < death(X)) */
		in x : Occurrence;
		in y : Occurrence;
		(x.startShot == y.startShot) and (y.endShot < x.endShot)
	}

	abstract predicate during specializes BooleanEvaluation {
		doc /* SFS: during(X,Y) :=  (birth(Y) <= birth(X)) and (death(X) <= death(Y)) */
		in x : Occurrence;
		in y : Occurrence;
		(y.startShot <= x.startShot) and (x.endShot <= y.endShot)
	}

	abstract predicate finishes specializes BooleanEvaluation {
		doc /* SFS: finishes(X,Y) :=  (birth(Y) < birth(X)) and (death(X) = death(Y)) */
		in x : Occurrence;
		in y : Occurrence;
		(y.startShot < x.startShot) and (x.endShot == y.endShot)
	}

	abstract predicate coincident specializes BooleanEvaluation {
		doc /* SFS: coincident(X,Y) :=  (birth(Y) = birth(X)) and (death(X) = death(Y)) */
		in x : Occurrence;
		in y : Occurrence;
		(y.startShot == x.startShot) and (x.endShot == y.endShot)
	}

	abstract predicate nonoverlaps specializes BooleanEvaluation {
		doc /* SFS: nonoverlaps(X,Y) :=  (birth(Y) > death(X)) or (birth(X) > death(Y)) */
		in x : Occurrence;
		in y : Occurrence;
		(y.startShot > x.endShot) and (x.startShot > y.endShot)
	}

}