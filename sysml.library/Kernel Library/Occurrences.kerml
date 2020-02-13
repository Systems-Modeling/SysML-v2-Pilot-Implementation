/**
 * This package defines associations between occurrences that assert relationships
 * modeling four-dimensional semantics. [Currently this is primarily time semantics.]
 */
package Occurrences {
	private import Base::*;
	
	/**
	 * HappensDuring asserts that the shorterOccurrence happens during the longerOccurrence.
	 * That is, the start time of the shorterOccurrence is no earlier than the start time
	 * of the longerOccurrence, and the end time of the shorterOccurrence is no later than
	 * the end time of the longerOccurrence. Note that this implies that every occurrence
	 * "happens during" itself.
	 */
	assoc HappensDuring {
		end feature shorterOccurrence: Occurrence[0..*] redefines Occurrence::suboccurrences, BinaryLink::source;
		end feature longerOccurrence: Occurrence[0..*];
	}
	
	/**
	 * HappensWhile asserts that two occurrences happen during each other, that is, they
	 * each start at the same time and end at the same time.
	 */
	assoc HappensWhile specializes HappensDuring {
		end feature thisOccurrence: Occurrence[0..*] redefines shorterOccurrence;
		end feature thatOccurrence: Occurrence[0..*] redefines longerOccurrence;
		
		connector :HappensDuring 
			from shorterOccurrence => thatOccurrence 
			to longerOccurrence => thisOccurrence;
	}
	
	/**
	 * HappensBefore asserts that the earlierOccurrence happens before the laterOccurrence.
	 * That is, the end time of the earlierOccurrence happens no later than the start time
	 * of the laterOccurrence.
	 */
	assoc HappensBefore {
		end feature earlierOccurrence: Occurrence[0..*] redefines Occurrence::predecessors, BinaryLink::source;
		end feature laterOccurrence: Occurrence[0..*] redefines Occurrence::successors, BinaryLink::target;
	}
	
	/**
	 * PortionOf asserts one occurrence is a portion of another.
	 */
	assoc PortionOf { 
		end feature portionOf: Occurrence[0..1] redefines Occurrence::portionOf, BinaryLink::source;
		end portion feature 'portion': Occurrence[0..*] redefines Occurrence::portions, BinaryLink::target; 
	}
	
	/**
	 * TimeSliceOf asserts once occurrence is a time slice of another.
	 */
	assoc TimeSliceOf {
		end feature timeSliceOf: Occurrence[1..*] redefines Occurrence::timeSliceOf, BinaryLink::source;
		end portion feature timeSlice: Occurrence[0..*] redefines Occurrence::timeSlices, BinaryLink::target;
	}
	
	/**
	 * SnapshotsOf asserts once occurrence is a snapshot of another.
	 */
	assoc SnapshotOf {
		end feature snapshotOf: Occurrence[1..*] redefines Occurrence::snapshotOf, BinaryLink::source;
		end portion feature snapshot: Occurrence[0..*] redefines Occurrence::snapshots, BinaryLink::target;
	}
	
	/** 
	 * Involves asserts that the behavior carried out by the involvingPerformance involves the
	 * involvedObject.
	 */
	assoc Involves {
		end feature involvingPerformance: Performance[0..*] redefines Object::involvingPerformances, BinaryLink::source;
		end feature involvedObject: Object[0..*] redefines Performance::involvedObjects, BinaryLink::target;
	}
	
	/**
	 * Performance asserts that the performer enacts the behavior carried out by the performance.
	 */
	 assoc Performs specializes Involves {
	 	end feature performer: Object[0..*] redefines Involves::involvedObject, Performance::performers;
	 	end feature performance: Performance[0..*] redefines Involves::involvingPerformance subsets Object::enactedPerformances;
	 }
	
	/**
	 * successions is a specialization of binaryLinks restricted to type HappensBefore.
	 * It is the default subsetting for succession connectors.
	 */
	 feature successions: HappensBefore[0..*] nonunique subsets binaryLinks {
	 	end feature earlierOccurrence: Occurrence[0..*] redefines HappensBefore::earlierOccurrence, binaryLinks::source;
	 	end feature laterOccurrence: Occurrence[0..*] redefines HappensBefore::laterOccurrence, binaryLinks::target;
	 }
}