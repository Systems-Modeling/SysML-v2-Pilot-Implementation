library package Regions {
    doc
    /*
    *  SFS:  Metaphysical
    * A region is a contiguous, three-dimensional volume at a particular place in a particular frame-of-reference.
    * The location of a thing is the region it occupies (within a frame-of-reference, at a particular moment of time).
    * The surface of a region is its boundary.
    */
    private import SpatialFrames::SpatialFrame;
    private import Occurrences::Occurrence;
	private import Assertion::Assert;
    private import Performances::BooleanEvaluation;

    abstract type Region specializes Base::Anything {
        doc
        /*
        *  SFS:  Region is a metaphysical three-dimensional volume.
        */
    }

    abstract type Point specializes Base::Anything {
        doc
        /*
        *  SFS:  Point is a metaphysical 0-dimensional entity.
        */
    }

    abstract type Surface specializes Base::Anything {
        doc
        /*
        *  SFS:  Surface is the set of points at the boundary of a Region.
        */
    }
 
    abstract function Location {
        doc
        /*
        * SFS:  The Location function relates spatial occurrences to their region.
        * This is the "L" exact location primitive.
        * Uses o.frameOfReference as the frame-of-reference for the region.
        */
        @Assert{n="df-lfu";f="forall x~Occurrence forall r1,r2~Region are "+
          "( (Location(x)=r1 and Location(x)=r2) implies r1=r2 )";}
        in o : Occurrence;
        inv { o.isClosed and (o.innerSpaceDimension == 3) and (o.outerSpaceDimension == 3) }
        return result : Region;
    }


    abstract predicate In specializes BooleanEvaluation {
        doc /* SFS: Point is contained in Region */
        in point : Point;
        in region : Region;
        @Assert{f="result iff point in region";}
    }

    abstract predicate On specializes BooleanEvaluation {
        doc /* SFS: Point is on a Surface */
        in point : Point;
        in surface : Surface;
        @Assert{f="result iff point in surface";}
    }

    abstract predicate RegionOverlap specializes BooleanEvaluation {
        doc /* SFS:  Two regions containing the same point overlap. 
            * This is the "O" relation (df-rov).
            * Regions are disjoint if they don't overlap */
        in r1 : Region;
        in r2 : Region;
        @Assert{n="df-rov";f="result iff exists p~Point that (In(p,r1) and In(p,r2))";}
        @Assert{
          doc /* SFS: Regions overlap only if one contains the other. This property is called no interpenetration. */
          n="df-rni";f="forall r1,r1~Region are "+
          "( RegionOverlap(r1,r2) implies (RegionContainment(r1,r2) or RegionContainment(r2,r1)) )";
        }
    }

    abstract predicate RegionContainment specializes BooleanEvaluation {
        doc /* SFS:  A region contains another, when it contains all of its points. 
            * This is the "C" relation (df-rco). */
        in r1 : Region;
        in r2 : Region;
        @Assert{n="df-rco";f="result iff forall p~Point are (In(p,r2) implies In(p,r1))";}
        @Assert{
          doc /* SFS: Parthood implies regional containment. This property is called expansivity. */
          n="df-pex";f="forall x,y~Classifier forall r1,r1~Region are "+
          "( (Location(x)=r1 and Location(y)=r2 and PartOf(x,y)) implies RegionContainment(r1,r2))";
        }
    }

    abstract predicate AtomicRegion specializes BooleanEvaluation {
        doc /* SFS:  A region is atomic, Ar , when it contains no other regions (in the location relation).
         * This is the "A" operator (df-rat). */
        @Assert{
          doc /* Atomic regions are disjoint. */
          n="df-rdi";f="forall r1~Region r2~Region are "+
            "( (AtomicRegion(r1) and AtomicRegion(r2)) implies"+
            " (not RegionOverlap(r1,r2) or r1=r2) )";
    }
        in r : Region;
        @Assert{n="df-rat";f="result iff forall r1~Region are "+
            "( RegionContainment(r,r1) implies r = r1 )";}
    }    
    



    abstract function RegionInterior {
        doc /* SFS:  The interior of a region includes all the points in a region 
          * not on its surface */
        in region : Region;
        return result : Region;
        @Assert{n="df-ri";f="exists s~Surface that forall p~Point are ( In(p,result) implies "+
          "(In(p,region) and not On(p,RegionSurface(region))) )";}
    }

    abstract function RegionSurface {
        doc /* SFS: The surface of a region is all the points on its boundary */
        in region : Region;
        return result : Surface;
        @Assert{n="df-rs";f="exists r1~Region tha forall p~Point are ( On(p,result) implies "+
          "(In(p,region) and not In(p,RegionInterior(region))) )";}
    }

    abstract function RegionFilm {
        doc /* SFS: The film of a region is a surface of which it's the interior */
        in region : Region;
        return result : Surface;
        @Assert{n="df-rf";f="exists r1~Region that "+
          "(RegionInterior(r1)=region and RegionSurface(r1)=result)";}
    }

    abstract predicate ExternallyConnected specializes BooleanEvaluation {
        doc /* SFS:  This is the externally connected (EC) relation  of Region Connection Calculus */
        in r1 : Region;
        in r2 : Region;
        @Assert{n="df-ec";f="exists p~Point that ( On(p,RegionSurface(r1)) and On(p,RegionSurface(r2)) )";}
    }

     abstract predicate FilmConnected specializes BooleanEvaluation {
        doc /* SFS:  This is neeeded for Occurences::JustOutsideOf. */
        in r1 : Region;
        in r2 : Region;
        @Assert{n="df-fc";f="exists p~Point that "+
          "( On(p,RegionFilm(r1)) and On(p,RegionFilm(r2)) )";}
    }
   
}