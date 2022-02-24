/*
 * This package models Clocks that provide an advancing numerical reference 
 * usable for quantifying the time of an Occurrence.
 */
package Clocks {
	private import ScalarValues::ScalarValue;
	private import ScalarValues::Real;
	private import Occurrences::Occurrence;
	private import ControlFunctions::forAll;
	private import ISQ::DurationValue;
	
	/**
	 * defaultClock is a single Clock that can be used as a default.
	 */
	readonly feature defaultClock : Clock[1];
	
	/**
	 * A Clock provides a scalar currentTime that advances montonically
	 * over its lifetime. Clock is an abstract base Structure that can be
	 * specialized for different kinds of time quantification (e.g., discrete
	 * time, continuous time, time with units, etc.).
	 */
	abstract struct Clock {
		private thisClock : Clock :>> self;
		/**
		 * A numerical time reference that advances over the lifetime of the Clock. 
		 */
		readonly feature currentTime : ScalarValue[1];
						
		/**
		 * The currentTime of a snapshot of a Clock is equal to
		 * the TimeOf the snapshot relative to that Clock.
		 */
		inv timeFlowConstraint {
			snapshots->forAll{in s : Clock; 
				TimeOf(s, thisClock) == s.currentTime
			}
		}		
	}
	
	/**
	 * TimeOf returns a scalar timeValue for a given Occurrence relative to
	 * a given Clock. The timeValue is the time of the start of the Occurrence,
	 * which is considered to be synchronized with the snapshot of the Clock 
	 * with a currentTime equal to the returned timeValue.
	 */
	abstract function TimeOf(o : Occurrence[1], clock : Clock[1]) timeValue : ScalarValue[1] {
		/**
		 * The TimeOf an Occurrence is equal to the time of its start snapshot.
		 */
		 inv startTimeConstraint { 
		 	timeValue == TimeOf(o.startShot, clock)
		 }	 

		/**
		 * If one Occurrence happens before another, then the TimeOf the end
		 * snapshot of the first Occurrence is no greater than the TimeOf the 
		 * second Occurrence.
		 */
		inv timeOrderingConstraint {
			o.predecessors->forAll{in p : Occurrence; 
				TimeOf(p.endShot, clock) <= timeValue
			}
		}
				
		/**
		 * If one Occurrence happens immediately before another, then the TimeOf 
		 * the end snapshot of the first Occurrence equals the TimeOf the second
		 * Occurrence.
		 */
		inv timeContinuityConstraint {
			o.immediatePredecessors->forAll{in p : Occurrence; 
				TimeOf(p.endShot, clock) == timeValue
			}
		}				
	}
	
	/**
	 * DurationOf returns the duration of a given Occurrence relative to a
	 * given Clock, which is equal to the TimeOf the end snapshot of the
	 * Occurrence minus the TimeOf its start snapshot.
	 */
	function DurationOf(o : Occurrence[1], clock : Clock[1]) duration : ScalarValue {
		TimeOf(o.endShot, clock) - TimeOf(o.startShot, clock)
	}
	
	/**
	 * A BasicClock is a Clock whose currentTime is a Real number.
	 */
	struct BasicClock :> Clock {
		readonly feature :>> currentTime : Real;
	}
	
	/**
	 * BasicTimeOf returns the TimeOf an Occurrence as a Real number relative
	 * to a BasicClock.
	 */
	function BasicTimeOf :> TimeOf(o : Occurrence[1], clock : BasicClock[1]) : Real[1];	
	
	/**
	 * BasicDurationOf returns the DurationOf an Occurrence as a Real number relative
	 * to a BasicClock.
	 */
	function BasicDurationOf :> DurationOf(o : Occurrence[1], clock : BasicClock[1]) : Real[1];

}