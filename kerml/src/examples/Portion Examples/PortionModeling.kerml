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
            portion t1 :> t :> timeSlices {
                portion :>> startShot {
                    :>> x = 2;
                    :>> y = 3;
                }
            }
        }
    }
   
}