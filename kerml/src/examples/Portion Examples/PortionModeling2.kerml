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
    
        /* Intended semantics for above.
         * Trying to introduce x on top class without typing slices by top class.
         */

    class CC2 {   //CB: Presumably a life bc timeslices aren't CC2s
        feature x [*]; // = startShot.x;  ES: Multiple to collect values over life.  CB: This x not the same as startShot::x.
                       //VM/CB: Could try defining on CC2::x as featured by snapshots
        portion :>> startShot {
            that : CC2 :>> that;
            feature x :> that.x = 0; //ES: chain feature domain is startShot.  Only thru this navigation.
                                     //CB: Not the same feature as CC2::x, tho the parse lets it be named "x",
                                     //      and even redefine "x" without startShot specializing CC2.
            //:>> that.x = 0; //ES: Intending to add to that.x collection. Only thru this navigation.
                              //CB: binds x on CC2 life.
        }                     //ES: "Adds" value to life. Binding only applies during snapshot
                              //CB: Can't change the life in 4D, only on on slices of it.
        portion t :> timeSlices {
            that : CC2 :>> that;
            feature y;
            portion :>> startShot {
                that :> t :>> that;
                :>> that.that.x = 1; //CB: binds x on CC2 life. See discussion above.
                :>> that.y = 2; //CB: binds y on t timeslice. See discussion above.
            }    
            portion t1 :> timeSlices {
                that :> t :>> that;
                portion :>> startShot {
                    that :> t1 :>> that;
                    :>> that.that.that.x = 2; //CB: binds x on CC2 life
                    :>> that.that.y = 3; //CB: binds y on t timeslice
                }
            }
        }
    }
    


    /* Edit of CC2, with feature timeslices/snaps typed by their domain. */

    class CC22 {
        feature x [*];

        portion : CC22 :>> timeSlices; // Includes snapshots, per library

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

            thatCC22 : CC22 :>> that;

            portion : t :>> timeSlices; // Includes snapshots, per library

            feature all portionOft : t, Occurrence [1] subsets portionOf {
            	selfPortionOft :>> self : CC22::t, Occurrence;
                feature [1] intersects thatCC22.t, selfPortionOft.portionOf;
                portion :>> startShot {
                    :>> x = 1;
                    :>> y = 2;
                }
            }

              // Assume t1 are not timeslices of each other
              //  (no t1 is a timeslice of any other)
            portion t1 : t :> timeSlices {
            	thatt : t :>> that;
            	portion : t1 :>> timeSlices; // Includes snapshots, per library
                feature all portionOft1 : t1, Occurrence [1] subsets portionOf {
                	selfPortionOft1 :>> self : CC22::t::t1, Occurrence;
                    feature [1] intersects thatt.t1, selfPortionOft1.portionOf;
                    portion :>> startShot {
                      :>> x = 2;
                      :>> y = 3;
                    }
                }
            }
        }
    }
    
    
        /* Edit of CC2, with featured by snapshots. */
        
    class CC2FB {   //CB: Presumably a life bc timeslices aren't CC2FBs
        feature x [1] featured by snapshots;
		:>> snapshots; //Otherwise x would be featured by Occurrence::snapshots.
		feature allx [*] = snapshots.x;  //Can't resolve x

        portion :>> startShot {
            x = 0; //Parses same as w/o featured by.
        }

        portion t :> timeSlices {  // includes snapshots, per library
            feature y featured by snapshots;
			:>> snapshots; //Otherwise y would be featured by Occurrence::snapshots.

            portion :>> startShot {
                x = 1; //Parses same as w/o featured by.
                y = 2; //Parses same as w/o featured by.
            }    
            portion t1 :> timeSlices { // includes snapshots, per library
                //that :> t :>> that;
                portion :>> startShot {
                    x = 2; //Parses same as w/o featured by.
                    y = 3; //Parses same as w/o featured by.
                }
            }
        }
    }
    
    class CC2FBRef {
    	feature c : CC2FB {
    		:>> snapshots {
    			x = 2; //Redefines CC2::x , which I guess is like CC2::snapshots::x
    		}
    	}
    }
    
    class CC2FBRefF {
    	feature c : CC2FB::snapshots {
    		  :>> x = 2; //Can't resolve x.
        }
    }
 
     class CC2FBRefC {
    	feature c : CC2FB;
    	feature cs chains c.snapshots {
    		  :>> x = 2; //Can't resolve x.
        }
    }
}
