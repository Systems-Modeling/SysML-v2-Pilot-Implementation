package PortionModeling2 {

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
    
    class CC2 {
        feature x;
        
        portion :>> startShot {
            that : CC1 :>> that;
            :>> that.x = 0;
        }
        
        portion t :> timeSlices {
            that : CC1 :>> that;
            feature y;
            portion :>> startShot {
                that :> t :>> that;
                :>> that.that.x = 1;
                :>> that.y = 2;
            }
            portion t1 :> timeSlices {
                that :> t :>> that;
                portion :>> startShot {
                    that :> t1 :>> that;
                    :>> that.that.that.x = 2;
                    :>> that.that.y = 3;
                }
            }
        }
    }
}