package Performances {
	doc
	/*
	 * This package defines classifiers and features that related to the typing of performances and evaluations.
	 */

	private import Base::Anything;
	private import Base::things;
	private import Occurrences::Occurrence;
	private import Occurrences::occurrences;
	private import Occurrences::HappensDuring;
	private import Objects::Object;
	private import Objects::BinaryLinkObject;
	private import Transfers::Transfer;
	private import Transfers::transfers;
	private import Transfers::transfersBefore;
	private import ScalarValues::*;
	private import SequenceFunctions::includes;
	
	abstract behavior Performance specializes Occurrence {
		doc
		/*
		 * Performance is the most general class of behavioral Occurrences that may be performed over time.
		 */

		feature self: Performance redefines Occurrence::self;
		
		feature involvedObjects: Object[0..*] {
			doc
			/*
			 * Objects that are involved in this Performance.
			 */
		}
		
		feature performers: Object[0..*] subsets involvedObjects {
			doc
			/*
			 * Objects that enact this Performance.
			 */
		}
		
		feature redefines isDispatch default true;
  		feature redefines dispatchScope default thisPerformance;
  		
		step enclosedPerformances: Performance[0..*] subsets performances, timeEnclosedOccurrences {
			doc
			/*
			 * timeEnclosedOccurrences of this Performance that are also Performances.
			 */
		}
		
         /* Review: Top of performance composition tree.  Same as “this” for comp tree rooted in
          * performance, otherwise the performance “just below this”. */
		feature thisPerformance: Performance [1] default self;  /* Review: Are steps timeEnclosed (ST4MD-376)? */
		connector :HappensDuring from self[1] to thisPerformance[1];  /* Review: Prolly want similar inv for "this". */
		
		composite step subperformances: Performance[0..*] subsets enclosedPerformances, suboccurrences {
			doc
			/*
			 * enclosedPerformances that are composite. 
			 */
		
			feature redefines this default (that as Performance).this {
				doc
				/*
				 * The default "this" context of a subperformance is the same as that of its owning Performance.
				 * This means that the context for any Performance that is in a composition tree rooted
				 * in a Performance that is not itself owned by an Object is the root Performance. If the
				 * root Performance is an ownedPerformance of an Object, then that Object is the context.
				 */
			}
		
			step redefines thisPerformance default (that as Performance).thisPerformance;
		}
		
		expr enclosedEvaluations: Evaluation[0..*] subsets evaluations, enclosedPerformances {
			doc
			/*
			 * enclosedPerformances of this Performance that are Evaluations.
			 */
		}
		
		step enclosedTransfers: Transfers::Transfer[0..*] subsets transfers, enclosedPerformances {
			doc
			/*
			 * enclosedPerformances of this performance that are transfers.
			 */
		}
		
		step enclosedTransfersBefore: Transfers::TransferBefore[0..*] subsets transfersBefore, enclosedTransfers {
			doc
			/*
			 * enclosedTransfers of this performance that are transfers-before.
			 */
		}
	}
	
	abstract function Evaluation specializes Performance {
		doc
		/*
		 * Evaluation is the most general class of functions that may be evaluated to compute
		 * a result.
		 */
	 
		return result: Anything[0..*] nonunique;
	}
	
	abstract predicate BooleanEvaluation specializes Evaluation {
		doc
		/*
		 * BooleanEvaluation is a specialization of Evaluation that is the most general class of
		 * Predicates that may be evaluated to produce a Boolean truth value.
		 */
	 
		return : Boolean[1];
	}
	
	abstract function LiteralEvaluation specializes Evaluation {
		doc
		/*
		 * LiteralEvaluation is a specialization of Evaluation for the case of LiteralExpressions.
		 */
	 
		return : ScalarValue[1];
	}
	
	abstract predicate LiteralBooleanEvaluation specializes LiteralEvaluation, BooleanEvaluation {
		doc
		/*
		 * LiteralBooleanEvaluation is a specialization of LiteralEvaluation for the case of LiteralBooleans.
		 * It is also a predicate and thus a specialization of BooleanEvaluation. 
		 */
	 
		return : Boolean[1];
	}
	abstract function LiteralIntegerEvaluation specializes LiteralEvaluation {
		doc
		/*
		 * LiteralIntegerEvaluation is a specialization of LiteralEvaluation for the case of LiteralIntegers.
		 */
	 
		return : Integer[1];
	}

	abstract function LiteralRationalEvaluation specializes LiteralEvaluation {
		doc
		/*
		 * LiteralRationalEvaluation is a specialization of LiteralEvaluation for the case of LiteralRationals.
		 * (Note: Return type is Real to allow easy type conformance of LiteralRationals when a Real result is expected.)
		 */
	 
		return : Real[1];
	}
	
	abstract function LiteralStringEvaluation specializes LiteralEvaluation {
		doc
		/*
		 * LiteralStringEvaluation is a specialization of LiteralEvaluation for the case of LiteralStrings.
		 */
	 
		return : String[1];
	}
	
	function NullEvaluation specializes Evaluation {
		doc
		/*
		 * NullEvaluation is a specialization of Evaluation for the case of NullExpressions.
		 */
	 
		return : Anything[0..0];
	}
	
	behavior SendPerformance specializes Performance  {
		doc
		/*
		 * A SendPerformance is a Peformance used to type a SendActionUsage. It initiates an outgoingTransferFromSelf 
		 * to a designated receiver Occurrence with a given payload.
		 */
	
		in feature sentItem [0..*] = sentTransfer.item;
		/* Review: Usage can bind sender to self to have send be transfer source,
		 * combined with a receiver to give transfer target.  The "to" keyword
		 * could parse to this.	 Would be symmetrical to support the "via" keyword
		 * with sends also,  where it would parse to binding the sender, without a
		 * receiver. Then ports wouldn't need "forwarding" semantics. */
		in feature sender: Occurrence[1];
		in feature receiver: Occurrence[0..1];
		/* Review: How to ensure the inverse multiplicity upper is 1? */
		feature sentTransfer: Transfer [1] subsets sender.outgoingTransfersFromSelf;
		binding receiver.incomingTransfersToSelf[0..1] = sentTransfer[1];
		/* Review: Allows for bufferring sends.  Require transfer to start before send ends? */
		succession self then sentTransfer;
	}
	
	behavior AcceptPerformance specializes Performance {
		doc
		/*
		 * An AcceptPerformance is an Action used to type an AcceptActionUsage. It completes an 
		 * incomingTransferFromSelf that is one of the incomingTransfers of a given receiver Occurrence, 
		 * outputting the payload from the Transfer.
		 */
		/*  Review: Not used as-is, abstract? */
		inout feature acceptedItem[0..*] = acceptedTransfer.item;
		in feature receiver: Occurrence[1] default this;
		/* Review: out/inout?  */
		inout feature acceptedTransfer: Transfer[1]
			subsets receiver.incomingTransfersToSelf;
		succession acceptedTransfer then self.endShot;
	}

	assoc Involves specializes BinaryLinkObject {
		doc
		/*
		 * Involves asserts that the Behavior carried out by the involvingPerformance involves the
		 * involvedObject.
		 */
		 
		end feature involvingPerformance: Performance[0..*] redefines source subsets involvedObject.involvingPerformances;
		end feature involvedObject: Object[0..*] redefines target subsets involvingPerformance.involvedObjects;
	}
	
	assoc Performs specializes Involves {
		doc
		/*
		 * Performance asserts that the performer enacts the Behavior carried out by the performance.
		 */
	
	 	end feature performerObject: Object[0..*] redefines involvedObject subsets performance.performers;
	 	end feature performance: Performance[0..*] redefines involvingPerformance subsets performerObject.enactedPerformances;
	 }

	abstract step performances: Performance[0..*] nonunique subsets occurrences {
		doc
		/*
		 * performances is the most general feature for performances of Behaviors.
		 */
	}
	
	abstract expr evaluations: Evaluation[0..*] nonunique subsets performances {
		doc
		/*
		 * evaluations is a specialization of performances for evaluations of Functions.
		 */
	}
	
	abstract expr booleanEvaluations: BooleanEvaluation[0..*] nonunique subsets evaluations {
		doc
		/*
		 * booleanEvaluations is a specialization of evaluations restricted to type BooleanEvaluation.
		 */
	}
	
	abstract expr trueEvaluations subsets booleanEvaluations {
		doc
		/*
		 * trueEvaluations is a subset of booleanEvaluations that result in true. It is the most general
		 * feature of invariants that are not negated. 
		 */
	
		true
	}
	
	abstract expr falseEvaluations subsets booleanEvaluations {
		doc
		/*
		 * falseEvaluations is a subset of booleanEvaluations that result in true. It is the most general
		 * feature of invariants that are negated.
		 */
	
		false
	}
	
	abstract expr literalEvaluations: LiteralEvaluation[0..*] nonunique subsets evaluations {
		doc
		/*
		 * literalEvaluations is a specialization of evaluations restricted to type LiteralEvaluation.
		 */
	}
	
	abstract expr literalBooleanEvaluations: LiteralBooleanEvaluation[0..*] nonunique subsets literalEvaluations, booleanEvaluations {
		doc
		/*
		 * literaBooleanlEvaluations is a specialization of literalEvaluations and booleanEvaluations restricted 
		 * to type LiteralBooleanEvaluation.
		 */
	}
	
	abstract expr literalIntegerEvaluations: LiteralIntegerEvaluation[0..*] nonunique subsets literalEvaluations {
		doc
		/*
		 * literalEvaluations is a specialization of evaluations restricted to type LiteralEvaluation.
		 */
	}
	
	abstract expr literalRationalEvaluations: LiteralRationalEvaluation[0..*] nonunique subsets literalEvaluations {
		doc
		/*
		 * literalRationalEvaluations is a specialization of literalEvaluations restricted to type LiteralRationalEvaluation.
		 */
	}
	
	abstract expr literalStringEvaluations: LiteralStringEvaluation[0..*] nonunique subsets literalEvaluations {
		doc
		/*
		 * literalStringEvaluations is a specialization of literalEvaluations restricted to type LiteralStringEvaluation.
		 */
	}
	
	abstract expr nullEvaluations: NullEvaluation[0..*] nonunique subsets evaluations {
		doc
		/*
		 * nullEvaluations is a specialization of evaluations restricted to type NullEvaluation.
		 */
	}
	
	abstract step sendPerformances: SendPerformance[0..*] nonunique subsets performances {
		doc
		/*
		 * sendPerformances is the base feature for all SendActionUsages.
		 */
	}
		
	abstract step acceptPerformances: AcceptPerformance[0..*] nonunique subsets performances {
		doc
		/*
		 * acceptPerformances is the base feature for all AcceptActionUsages.
		 */
	}
}