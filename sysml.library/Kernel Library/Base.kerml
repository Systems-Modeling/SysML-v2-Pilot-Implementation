/**
 * This package defines the classes and features that provide the bases for the typing
 * of all elements in the language.
 */
package Base {
	
	/*
	 *** CLASSES ***
	 */
		
    /**
     * Anything is the top level generalized type in the language. 
     */
	abstract classifier Anything;
	
	// Values
	
	/**
	 * Value is the most general classifier of entities that are values that do not change
	 * over time.
	 */
	abstract datatype DataValue specializes Anything;
	
	/**
	 * EnumeratedValue is a specialization that is the most general class for enumerated values.
	 */
	abstract datatype EnumeratedValue specializes DataValue;
	
	// Occurrences
	
	/**
	 * Occurrence is the most general classifier of entities that have identity and 
	 * may occur over time.
	 * 
	 * The features of Occurrence specify the semantics of portions, slices and
	 * snapshots of an occurrence over time.
	 */
	abstract classifier Occurrence specializes Anything {
		
		/**
		 * Occurrences that end no earlier than this occurrence starts.
		 */
		feature predecessors: Occurrence[0..*];
		
		/**
		 * Occurrences that start no earlier than this occcurrence ends.
		 */
		feature successors: Occurrence[0..*];
		
		/**
		 * Occurrences that start no earlier than and end no later than
		 * this occurrence.
		 */
		feature suboccurrences: Occurrence[0..*];
		
		/**
		 * Occurrences that are portions of this occurrence.
		 */
		portion portions: Occurrence[0..*] subsets suboccurrences;
		
		/**
		 * Portions of an occurrence over some finite slice of time. 
		 */
		portion timeSlices: Occurrence[0..*] subsets portions;
		
		/**
		 * Time slices of an occurrence that happen at a single instant of time
		 * (i.e., have no duration).
		 */
		portion snapshots: Occurrence[0..*] subsets timeSlices;
		
		/**
		 * The snapshot representing the start of the occurrence in time.
		 */
		portion startShot: Occurrence[1] subsets snapshots;
		
		/** 
		 * The snapshot representing the end of the occurrence in time.
		 */
		portion endShot: Occurrence[1] subsets snapshots;
		
		/**
		 * HappensBeforeSelf asserts that an occurrence happens before itself, 
		 * which is only possible if the occurrence has no duration.
		 */
		private assoc HappensBeforeSelf specializes Occurrences::HappensBefore, SelfLink {
			end self: Occurrence[1];
			end myself: Occurrence[1];
		}
		
		/**
		 * Snapshots have no duration.
		 */
		// Note: Connectors are only allowed to have a single type.
		succession :HappensBeforeSelf first snapshots[1] then snapshots[1];
		
		/**
		 * The startShot happens before all snapshots.
		 */
		succession startShot[1] then snapshots[0..*];
		
		/**
		 * The endShot happens after all snapshots.
		 */
		succession snapshots[0..*] then endShot[1];
		
		/**
		 * The incoming transfers targeting this occurrence. 
		 */
		feature incomingTransfers: Transfers::Transfer[0..*] subsets Transfers::transfers
			= Transfers::Transfer.allInstances()->
				select t:Transfers::Transfer (t::transferTarget == self);
	}

	/**
	 * Object is the most general classifier of non-behavioral entities that have identity
	 * and are mutable over time.
	 */
	abstract class Object specializes Occurrence {
		/**
		 * Performances in which this object is involved.
		 */
		feature involvingPerformances: Performance[0..*];
		
		/**
		 * Performances which are enacted by this object.
		 */
		abstract feature enactedPerformances: Performance[0..*] subsets involvingPerformances, suboccurrences;
	}
	
	/**
	 * Link is the most general association between two or more things.
	 * (It is actually class, not an association, because an association
	 * must have a specific number of ends.)
	 */
	class Link specializes Object {
		feature participant: Anything[2..*] nonunique ordered;
	}
	
	/**
	 * BinaryLink is the most general binary association between exactly two things, 
	 * nominally directed from source to target.
	 */
	assoc BinaryLink specializes Link {
	    feature participant: Anything[2] nonunique ordered redefines Link::participant;
		
		end source: Anything[0..*] nonunique subsets participant;
	    end target: Anything[0..*] nonunique subsets participant;
	    
// Means:
//	    feature sourceParticipant: Anything[1] subsets participant {
//	    	feature targetEnd: Anything[0..*] = BinaryLink::targetParticipant(sourceParticipant);
//	    }
//	    feature targetParticipant: Anything[1] subsets participant {
//	    	feature sourceEnd: Anything[0..*] = BinaryLink::sourceParticipant(targetParticipant);
//	    }  

// Was:
//	    feature sourceParticipant: Anything[1..1] subsets participant = participant[1];
//	    feature targetParticipant: Anything[1..1] subsets participant = participant[2];
//	
//	    private connector linkage: BinaryLink is sourceParticipant to targetParticipant;	
	}
	
	/**
	 * SelfLink is a binary association in which the individuals at the two ends are asserted
	 * to be the same.
	 */
	assoc SelfLink specializes BinaryLink {
		end self: Anything[0..*] nonunique redefines source subsets myself redefines Base::self;
		end myself: Anything[0..*] nonunique redefines target subsets self;
		
//		feature sourceParticipant: Anything[1..1] redefines BinaryLink::sourceParticipant subsets targetParticipant; 
//		feature targetParticipant: Anything[1..1] redefines BinaryLink::targetParticipant subsets sourceParticipant;
	}
	
	/**
	 * Performance is the most general class of behaviors that may be performed over time.
	 */
	abstract behavior Performance() specializes Occurrence {
		/**
		 * Objects that are involved in this performance.
		 */
		feature involvedObjects: Object[0..*];
		
		/**
		 * Objects that enact this performance.
		 */
		feature performers: Object[0..*] subsets involvedObjects;
		
		/**
		 * Suboccurrences of this performance that are also performances.
		 */
		step subperformances: Performance[0..*] nonunique subsets performances, suboccurrences;
		
		/**
		 * Subperformances of this performance that are evaluations.
		 */
		expr subevaluations: Evaluation[0..*] nonunique subsets evaluations, subperformances;
		
		/**
		 * Subperformances of this performance that are transfers.
		 */
		step subtransfers: Transfers::Transfer[0..*] nonunique subsets Transfers::transfers, subperformances;
		
		/**
		 * Subtransfers of this performance that are transfers-before (succession flows).
		 */
		step subflows: Transfers::TransferBefore[0..*] nonunique subsets Transfers::flows, subtransfers;
	}
	
	/**
	 * Evaluation is the most general class of functions that may be evaluated to compute
	 * a result.
	 */
	abstract function Evaluation(): Anything[0..*] specializes Performance;
	
	/**
	 * LiteralEvaluation is a specialization of Evaluation for the case of literal expressions.
	 */				
	abstract function LiteralEvaluation(): Anything specializes Evaluation;
	
	/**
	 * NullEvaluation is a specialization of Evaluation for the case of null expressions.
	 */
	function NullEvaluation(): Anything[0..0] specializes Evaluation;

	/* 
	 *** FEATURES ***
	 */
	
	/**
	 * self is a feature that relates everything to itself.
	 * (This is enforced by tying this feature to SelfLink::self.)
	 */
	feature self: Anything[1] subsets things;
	 
	/**
	 * things is the top-level feature in the language.
	 */
	abstract feature things: Anything[0..*] nonunique;
	
	/**
	 * dataValues is a specialization of things restricted to type DataValue.
	 */
	abstract feature dataValues: DataValue[0..*] nonunique subsets things;
		 
	/**
	 * objects is a specialization of things restricted to type Object.
	 */
	abstract feature objects: Object[0..*] nonunique subsets things;
	
	/**
	 * links is the most general feature of links between individuals.
	 */
	abstract feature links: Link[0..*] nonunique subsets objects;
	
	/**
	 * binaryLinks is a specialization of links restricted to type BinaryLink.
	 */
	abstract feature binaryLinks: BinaryLink[0..*] nonunique subsets links {
		end source: Anything[0..*] nonunique redefines BinaryLink::source;
		end target: Anything[0..*] nonunique redefines BinaryLink::target;
	}
	
	/**
	 * selfLinks is a specialization of binaryLinks restricted to type SelfLink.
	 */
	abstract feature selfLinks: SelfLink[0..*] nonunique subsets binaryLinks {
		end source: Anything[0..*] nonunique redefines SelfLink::source, binaryLinks::source;
		end target: Anything[0..*] nonunique redefines SelfLink::target, binaryLinks::target;
	}
	
	/**
	 * performances is the most general feature for performances of behaviors.
	 */
	abstract step performances: Performance[0..*] nonunique subsets things;
	
	/**
	 * evaluations is a specialization of performances for evaluations of functions.
	 */
	abstract expr evaluations: Evaluation[0..*] nonunique subsets performances;
	
	/**
	 * literalEvaluations is a specialization of evaluations restricted to type LiteralEvaluation.
	 */
	abstract expr literalEvaluations: LiteralEvaluation[0..*] nonunique subsets evaluations;
	
	/**
	 * nullEvaluations is a specialization of evaluations restricted to type NullEvaluation.
	 */
	abstract expr nullEvaluations: NullEvaluation[0..*] nonunique subsets evaluations;
}