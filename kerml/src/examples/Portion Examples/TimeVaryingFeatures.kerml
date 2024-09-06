package TimeVaryingFeatures {
    class CC0 {
        var feature x;
        
        portion :>> startShot {
            var feature :>> x = 0;
        }
        
        portion t :> timeSlices {
            var feature y;
            
            portion :>> startShot {
                var feature :>> x = 0; 
                var feature :>> y = 1;
            }
            
            portion t1 :> timeSlices {
                portion :>> startShot {
                    var feature :>> x = 2;
                    var feature :>> y = 3;
                }
            }
        }
    }
    
    class CC1 {
        // var feature x;
        member feature x featured by CC1_snapshots {
            member feature CC1_snapshots :>> Occurrences::Occurrence::snapshots featured by CC1;
        }
        
        // portions are not variable
        portion :>> startShot {
            // var feature :>> x = 0;
            member feature :>> CC1::x featured by CC1_startShot_snapshots = 0 {
                member feature CC1_startShot_snapshots :>> CC1_snapshots featured by CC1::startShot {
//                    member feature that_CC1 : CC1 :>> that featured by CC1::startShot {
//                        public import x::CC1_snapshots;
//                    }
                }
            }
        }
        
        portion t :> timeSlices {
            // var feature y;
            member feature y featured by CC1_t_snapshots {
                member feature CC1_t_snapshots :>> Occurrences::Occurrence::snapshots featured by CC1::t;
            }
            portion :>> startShot {
                // var feature :>> x = 0;
                member feature :>> CC1::x featured by CC1_t_startShot_snapshots = 0 {
                    member feature CC1_t_startShot_snapshots :>> CC1_snapshots featured by CC1::t::startShot;
                }
                // var feature :>> y = 1;
                member feature :>> CC1::t::y featured by CC1_t_startShot_snapshots = 1 {
                    member feature CC1_t_startShot_snapshots :>> CC1_t_snapshots featured by CC1::t::startShot;
                }
            }
            portion t1 :> timeSlices {
                portion :>> startShot {
                    // var feature :>> x = 2;
                    member feature :>> CC1::x featured by CC1_t_t1_startShot_snapshots = 2 {
                        member feature CC1_t_t1_startShot_snapshots :>> CC1_snapshots featured by CC1::t::t1::startShot;
                    }
                    // var feature :>> y = 3;
                    member feature :>> CC1::t::y featured by CC1_t_t1_startShot_snapshots = 3 {
                        member feature CC1_t_t1_startShot_snapshots :>> CC1_t_snapshots featured by CC1::t::t1::startShot;
                    }
                }
            }
        }
    }
    
    private import ScalarValues::Boolean;
    
    class Car {
        var feature driver : Person [0..1];
        
        portion operated [0..*] :> timeSlices {
            var feature :>> driver [1] {
                var feature :>> isLicensed = true;
            }
        }
        
        abstract var feature carParts [0..*];
        var feature engine [1] :> carParts;
        var feature transmission [1] :> carParts;
        
        var connector drive from engine to transmission;
        
        portion inOperable [0..1] :> timeSlices;
        
        succession first operated then inOperable;
    }
    
    class Car_ {
        // var feature driver : Person [0..1];
        member feature driver : Person_ [0..1] featured by Car_snapshots {
            member feature Car_snapshots :>> Occurrences::Occurrence::snapshots featured by Car_;
        }
        
        portion operated [0..*] :> timeSlices {
            // var feature :>> driver [1]
            member feature :>> Car_::driver [1] featured by Car_operated_snapshots {
                member feature Car_operated_snapshots :>> Car_snapshots featured by Car_::operated {
//                    member feature that_Car : Car_ :>> that featured by Car_::operated {
//                        public import driver::Car_snapshots;
//                    }
                }                
                // var feature :>> isLicensed = true;
                member feature isLicensed1 :>> Person_::isLicensed featured by Car_operated_driver_snapshots = true {
                    member feature Car_operated_driver_snapshots :>> Person_snapshots featured by Car_::operated::driver;
                }
            }
        }

        // var abstract feature carParts [0..*];
        member abstract feature carParts [0..*] featured by Car_snapshots {
            member feature Car_snapshots :>> Occurrences::Occurrence::snapshots featured by Car_;
        }
        
        // var feature engine [1];
        member feature engine [1] :> carParts featured by Car_snapshots1 {
            member feature Car_snapshots1 :>> Occurrences::Occurrence::snapshots :> carParts::Car_snapshots featured by Car_;
        }       
        
        // var feature transmission [1];
        member feature transmission [1] :> carParts featured by Car_snapshots1 {
            member feature Car_snapshots1 :>> Occurrences::Occurrence::snapshots :> carParts::Car_snapshots featured by Car_;
        }       
        
        // var connector drive from engine to transmission;
        member connector drive featured by Car_snapshots from engine to transmission {
            member feature Car_snapshots :>> Occurrences::Occurrence::snapshots :> engine::Car_snapshots1, transmission::Car_snapshots1 featured by Car_;
        }
        
        portion inOperable [0..1] :> timeSlices;
        
        // successions are not variable
        succession first operated then inOperable;
    }
    
    class Person {
        var feature isLicensed : Boolean [0..1];
    }
    
    class Person_ {
        // var feature isLicensed : Boolean [0..1];
        member feature isLicensed : Boolean [0..1] featured by Person_snapshots {
            member feature Person_snapshots :>> Occurrences::Occurrence::snapshots featured by Person_;
        }
    }
    
    struct Car1 {
        var feature driver : Person [0..1];

        portion :>> startShot {
            var feature :>> driver [0]; 
        }
    
        succession first startShot then driven; 
    
        portion driven :> timeSlices {     
            var feature :>> driver [1];
        }
    }
    
    struct Car1_ {  // May or may not be a life
        // var feature driver : Person [0..1];
        member feature driver : Person [0..1] featured by Car_snapshots {
            member feature Car_snapshots :>> Occurrences::Occurrence::snapshots featured by Car1;
        }
      
        // :>> timeSlices : Car;  <-- Don't do this!
    
        portion :>> startShot {  // Not a kind of Car!
            // var feature :>> driver [0]; 
            member feature :>> driver : Person [0] featured by Car_startShot_snapshots {
                member feature Car_startShot_snapshots :>> Car_snapshots featured by Car1::startShot;
            }
        }
    
        succession first startShot then driven; 
    
        portion driven :> timeSlices {     
            // var feature :>> driver [1];
            // No conflict with multiplicity! (driven just can't be startshot)
            member feature :>> driver : Person [1] featured by Car_driven_snapshots {
                member feature Car_driven_snapshots :>> Car_snapshots featured by Car1::driven;
            }
        }
    }
    
}