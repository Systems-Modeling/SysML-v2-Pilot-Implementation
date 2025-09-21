library package Time {
  private import ScalarValues::Real;
  private import ScalarValues::Boolean;
  private import Base::DataValue;
  private import Assertion::Assert;
//need to switch from performance to instantaneous predicate  
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
  predicate precedes specializes BooleanEvaluation {
    doc /* SFS: precedes(X,Y) := death(X) < birth(Y) */
    in x : Interval;
    in y : Interval;
    x.upperBound < y.lowerBound
  }
	
	predicate meets specializes BooleanEvaluation {
		doc /* SFS: meets(X,Y) := (death(X) = birth(Y))
		 * x must not be open-right, and y must not be open-left
		 */
		in x : Interval;
		in y : Interval;
		x.upperBound == y.lowerBound and not x.openRight and not y.openLeft
	}

	predicate overlaps specializes BooleanEvaluation {
		doc /* SFS: overlaps(X,Y) :=  birth(Y) < death(X) */
		in x : Interval;
		in y : Interval;
		y.lowerBound < x.upperBound 
	}

	predicate starts specializes BooleanEvaluation {
		doc /* SFS: starts(X,Y) :=  (birth(X) = birth(Y)) and (death(Y) < death(X))
		 * both should be the same for open-left, or not
		 */
		in x : Interval;
		in y : Interval;
		(x.lowerBound == y.lowerBound) and (y.upperBound < x.upperBound)
		  and x.openLeft == y.openLeft
	}

	predicate during specializes BooleanEvaluation {
		doc /* SFS: during(X,Y) :=  (birth(Y) <= birth(X)) and (death(X) <= death(Y)) */
		in x : Interval;
		in y : Interval;
		(y.lowerBound <= x.lowerBound) and (x.upperBound <= y.upperBound)
	}

	predicate finishes specializes BooleanEvaluation {
		doc /* SFS: finishes(X,Y) :=  (birth(Y) < birth(X)) and (death(X) = death(Y)) */
		in x : Interval;
		in y : Interval;
		y.lowerBound < x.lowerBound and x.upperBound == y.upperBound
		  and x.openRight==y.openRight
	}

	predicate coincident specializes BooleanEvaluation {
		doc /* SFS: coincident(X,Y) :=  (birth(Y) = birth(X)) and (death(X) = death(Y)) */
		in x : Interval;
		in y : Interval;
		y.lowerBound == x.lowerBound and x.upperBound == y.upperBound
      and x.openLeft == y.openLeft and x.openRight==y.openRight
	}

	predicate nonoverlaps specializes BooleanEvaluation {
		doc /* SFS: nonoverlaps(X,Y) :=  (birth(Y) > death(X)) or (birth(X) > death(Y)) */
		in x : Interval;
		in y : Interval;
		(y.lowerBound > x.upperBound) and (x.lowerBound > y.upperBound)
	}
	
	abstract predicate nearlyMeets specializes BooleanEvaluation {
    doc /* SFS: don't meet, but no instants between 
     * the end-shot of x and the start-shot of y
     * "abstract" because this can't be executed
     * x is open-right; y is open-left, or both
     */
    in x : Interval;
    in y : Interval;
    x.upperBound==y.lowerBound and ( x.openRight or y.openLeft)
  }
	

}