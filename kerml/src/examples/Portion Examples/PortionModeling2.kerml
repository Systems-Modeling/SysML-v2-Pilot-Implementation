package PortionModeling2 {
	
	import Occurrences::Occurrence;

    /* Similar to some T2 examples. */

    class CC1 {
        feature x;
        
        portion :>> startShot {
            :>> x = 0;
        }
        
        portion t :> timeSlices {
            feature y;
            portion :>> startShot {
                :>> x = 1;
                :>> y = 2;
            }
            portion t1 :> timeSlices {
                portion :>> startShot {
                    :>> x = 2;
                    :>> y = 3;
                }
            }
        }
    }
    
        /* Intended semantics for above. */

    class CC2 {   //CB: Presumably a life bc timeslices aren't CC2s
        feature x [*];
        
        portion :>> startShot {
            that : CC2 :>> that;
            :>> that.x = 0; //ES: Only thru this navigation.
        }
        
        portion t :> timeSlices {
            that : CC2 :>> that;
            feature y;
            portion :>> startShot {
                that :> t :>> that;
                :>> that.that.x = 1; //CB: CB: binds x on CC2 life
                :>> that.y = 2;
            }
            portion t1 :> timeSlices {
                that :> t :>> that;
                portion :>> startShot {
                    that :> t1 :>> that;
                    :>> that.that.that.x = 2; //CB: binds x on CC2 life
                    :>> that.that.y = 3;
                }
            }
        }
    }


    /* Edit of CC2, with feature timeslices/snaps typed by their domain. */

    class CC22 {
        feature x [*];

        portion : CC22 :>> timeSlices; // Includes snapshots

        portion :>> snapshots {  // : CC22
            :>> x [1];
        }

        feature : CC22 :>> portionOfLife {
            portion :>> startShot {
                :>> x = 0;
            }
        }

          // Assume t are not timeslices of each other
          //  (no t is a timeslice of any other)
        portion t : CC22 :> timeSlices [*] {
            feature y;

            that : CC22 :>> that;

            portion : t :>> timeSlices; // Includes snapshots

            feature all portionOft : t, Occurrence [1] subsets portionOf {
            	selfPortionOft :>> self : CC22::t, Occurrence;
                that : t :>> that;
                feature thatCC22 : CC22 = that.that;
                feature [1] intersects thatCC22.t, selfPortionOft.portionOf;
                    portion :>> startShot {
                        :>> x = 1;
                        :>> y = 2;
                    }
            }

              // Assume t1 are not timeslices of each other
              //  (no t1 is a timeslice of any other)
            portion t1 : t :> timeSlices {
                feature all portionOft1 : t1, Occurrence [1] subsets portionOf {
                	selfPortionOft1 :>> self : CC22::t::t1, Occurrence;
                    that : t1 :>> that;
                    feature thatCC22t : t = that.that;
                    feature [1] intersects thatCC22t.t1, selfPortionOft1.portionOf;
                        portion :>> startShot {
                            :>> x = 2;
                            :>> y = 3;
                        }
                }
            }
        }
    }
}
