package PortionModeling {
    
    class C1 {
        feature x;
        
        portion :>> startShot : C1 {
            :>> x = 0;
        }
        
        portion t : C1 :> timeSlices {
            portion :>> startShot :> t {
                :>> x = 1;
            }
        }
    }

    class C2 {
        feature x;
        
        feature :>> portionOfLife : C2 {
            portion :>> startShot : C2 {
                :>> x = 0;
            }
        }
        
        portion t : C2 :> timeSlices {
            portion : C2 :>> startShot {
                :>> x = 1;
            }
            portion t1 : C2 :> timeSlices {
                portion : C2 :>> startShot {
                    :>> x = 2;
                }
            }
       }
    }
   
    class C3 {
        portion :>> snapshots {
            feature x;
        }
        
        feature : C3 :>> portionOfLife {
            portion :>> startShot :> snapshots {
                :>> x = 0;
            }
        }
        
        portion t : C3 :> timeSlices {
            portion :>> snapshots {
                feature y;
            }
            portion :>> startShot :> snapshots {
                :>> x = 1;
                :>> y = 2;
            }
            // Subsetting t means that t1 could be in place of t.
            // But then t1 has to satisfy constraints of t, including 
            // the values in startShot. Actually, t1 is not expected
            // to be substituted for t, but it should inherit the
            // specification of snapshots.
            portion t1 :> t :> timeSlices {
                portion :>> startShot {
                    :>> x = 2; // Error: cannot redefine binding
                    :>> y = 3; // Error: cannot redefine binding
                }
            }
        }
    }
    

    class C33 {
        feature x;  //Moved from under snapshots, see C3

        feature : C33 :>> portionOfLife {
            portion :>> startShot {
                :>> x = 0;
            }
        }
        
        portion : C33 :>> timeSlices; // Includes snapshots

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



    class C4 { //CB: Presumably a life bc timeslices aren't C4s
        portion :>> snapshots {
            feature x;
        }

        portion :>> startShot :> snapshots {  //CB: the :> is in the library.  Parser can't tell?
            :>> x = 0;
        }
        
        // Note that t is not typed by C4
        portion t :> timeSlices {
            
            feature portionOf : C4 :>> portionOf; // CB: Some portionOfs will not be lives, ie, not C4s.
            
            portion :>> snapshots :> portionOf.snapshots { //CB: portionOf transitivity should be in library.
                feature y;
            }
            portion :>> startShot :> snapshots {
                :>> x = 1;
                :>> y = 2;
            }
            
            portion :>> timeSlices :> portionOf.timeSlices;
            
            // Here, t1 does not inherit from t at all, because they are
            // not meant to be alike. Their snapshots, however, are meant
            // to be alike, so t1's snapshots explicitly subset t's snapshots,
            // which is consistent with the expectation that a timeslice of
            // another timeslice will contain snapshots that are also snapshots
            // of the other.
            portion t1 :> timeSlices {
                feature portionOf : t :>> portionOf; // CB: Some portionOfs will not be ts.
                
            	// This line could be implicitly added.
            	portion :>> snapshots :> portionOf.snapshots;  //CB: See above about transitivity.
            	// Note that startShot has to subset snapshots again, because
            	// the inherited subsetting refers to the snapshots of Occurrence,
            	// and not the redefined snapshots. Scoping currently does not
            	// consider the redefinitions in the current context, which is
            	// probably reasonable.
                portion :>> startShot :> snapshots {  //CB: See above :>
                    :>> x = 2;
                    :>> y = 3;
                }
                
                portion t2 :> timeSlices {
                	// Yes, this works
                	feature portionOf : t1 :>> portionOf; // CB: Some portionOfs will not be t1s.
                	portion :>> snapshots :> portionOf.snapshots;
                	portion :>> startShot :> snapshots {
	                    :>> x = 3;
	                    :>> y = 4;
	                }
                }
            }
        }
    }


    class C44 {
        feature x [*];   //Moved from under snapshots, see C4

        feature : C44 :>> portionOfLife {
            portion :>> startShot :> snapshots {
                :>> x = 0;
            }
        }

        portion : C44 :>> timeSlices; // Includes snapshots

        portion t :> timeSlices {
            
            feature : C44 :>> timeSliceOf; // Some timeSliceOfs will not be C44s
            
            feature y;

            portion :>> startShot {
                :>> x = 1;
                :>> y = 2;
            }
            
            portion :>> timeSlices :> timeSliceOf.timeSlices; //portionOf transitivity should be in library.
            
            // Original comment
	    // Here, t1 does not inherit from t at all, because they are
            // not meant to be alike. Their snapshots, however, are meant
            // to be alike, so t1's snapshots explicitly subset t's snapshots,
            // which is consistent with the expectation that a timeslice of
            // another timeslice will contain snapshots that are also snapshots
            // of the other.
            portion t1 :> timeSlices {
                feature timeSliceOf : t :>> timeSliceOf; // Some timeSliceOfs will not be ts
                
            	// This line could be implicitly added.
            	portion :>> snapshots :> portionOf.snapshots;
                // Original comment:
            	// Note that startShot has to subset snapshots again, because
            	// the inherited subsetting refers to the snapshots of Occurrence,
            	// and not the redefined snapshots. Scoping currently does not
            	// consider the redefinitions in the current context, which is
            	// probably reasonable.
                portion :>> startShot {
                    :>> x = 2;
                    :>> y = 3;
                }
                
                portion t2 :> timeSlices {
                	// Yes, this works
                	feature timeSliceOf : t1 :>> timeSliceOf; // Some timeSliceOfs will not be t1s
                	portion :>> snapshots :> timeSliceOf.snapshots;
                	portion :>> startShot {
	                    :>> x = 3;
	                    :>> y = 4;
	                }
                }
            }
        }
    }
}
