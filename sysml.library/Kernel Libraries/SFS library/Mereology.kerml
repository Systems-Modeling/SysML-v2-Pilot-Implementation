library package Mereology {
    doc
    /*
     * SFS:  Merology is the metaphysics of parthood.
     * Predicates are Performances::BooleanEvaluation in KerML, 
     * but metaphysical predicates aren't meant to be executed.
     * Need something to define values rather than operations.
     */

    private import Performances::BooleanEvaluation;
    private import KerML::Core::Classifier;
	private import Assertion::Assert;

    abstract predicate PartOf specializes BooleanEvaluation {
        doc /* SFS: PartOf is the proper part relation xPy */
    // SFS:  Define part antireflexivity.
    @Assert{n="df-par";f="forall x~Classifier are not PartOf(x,x)";}
    // SFS:  Define part transitivity.
    @Assert{n="df-ptr";f="forall x,y,z~Classifier are ( (PartOf(x,y) and PartOf(y,z)) implies PartOf(x,z))";}
        in x : Classifier;
        in y : Classifier;
    }

    
    abstract predicate PartOverlap specializes BooleanEvaluation {
        doc /* SFS: PartOverlap is the overlap relation xOy */
        in x : Classifier;
        in y : Classifier;
        @Assert{n="df-pov";f="result iff exists z~Classifier that ( PartOf(z,x) and PartOf(z,y) )";}
    }
    
    abstract predicate PartUnderlap specializes BooleanEvaluation {
        doc /* SFS: PartUnderlap is the underlap relation xUy */
        in x : Classifier;
        in y : Classifier;
        @Assert{n="df-pun";f="result iff exists z~Classifier that ( PartOf(x,z) and PartOf(y,z) )";}
    }

    abstract predicate ImproperPart specializes BooleanEvaluation {
        doc /* SFS: ImproperPart is the improper part relation xIPy */
        in x : Classifier;
        in y : Classifier;
        @Assert{n="df-pim";f="result iff ( PartOf(x,y) or x=y )";}
    }

    abstract predicate PartDisjoint specializes BooleanEvaluation {
        doc /* SFS: PartDisjoint is the part disjointness relation xDy */
        in x : Classifier;
        in y : Classifier;
        @Assert{n="df-pdj";f="result iff not PartOverlap(x,y)";}
        // SFS:  Define containment hierarchy.
        @Assert{n="df-pch";f="forall x,y~Classifier are "+
        "( (x=y or PartOf(x,y) or PartOf(y,x) or PartDisjoint(x,y))"+
        "and not (PartOf(x,y) and PartOf(y,x)) )";}
    }


    abstract predicate AtomicPart specializes BooleanEvaluation {
        doc /* SFS: AtomicPart is the part atomicity Ax */
        in x : Classifier;
        @Assert{n="df-pat";f="result iff not exists z~Classifier that PartOf(z,x)";}
    }

}