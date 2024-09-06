package TimeVaryingAttribute1 {
    private import SI::s;
    
    item def PwrCmd {
        attribute pwrLevel: ScalarValues::Integer;
    }
    
    part def Transport {
        private import Time::*;
        attribute startTime = TimeOf(start);
        attribute elapseTime :> ISQ::duration;
        attribute :>> localClock.currentTime = startTime + elapseTime;
        
        out item pwrCmd:PwrCmd;
        // initial conditions
        snapshot :>> start {
            :>> elapseTime = 0 [s];
            :>> pwrCmd.pwrLevel = 0;
        }
        :>> start.elapseTime = 0 [s];
        timeslice transportPeriod {
            :>> start.elapseTime = 0 [s]; // probably not valid either
            snapshot :>> start{
                :>> elapseTime = 1 [s]; // violates validateFeatureValueOverriding
            }
            snapshot :>> done {
                :>> elapseTime = 1.5 [s]; // violates validateFeatureValueOverriding
            }
           :>> pwrCmd.pwrLevel = 2*elapseTime.num;
        }
       // final conditions
        snapshot :>> done {
            :>> elapseTime = 2 [s];
            :>> pwrCmd.pwrLevel = 1;
        }
    }
}