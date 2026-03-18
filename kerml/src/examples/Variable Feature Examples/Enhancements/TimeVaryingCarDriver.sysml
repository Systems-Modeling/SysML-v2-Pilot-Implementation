package TimeVaryingCarDriver_SysML {
    private import ScalarValues::*;
    
    part def Person {
        attribute isLicensed : Boolean [1];
    }
    
    part def Car {
        ref part driver : Person [0..1];
        
        snapshot :>> start {
            ref part :>> driver [0]; 
        }
        
        succession first start then operated; 

        timeslice operated [0..*] {
            ref part :>> driver [1] {
                attribute :>> isLicensed = true;
            }
        }
        
        abstract part carParts [0..*];
        part engine [1] :> carParts;
        part transmission [1] :> carParts;
        
        connection drive connect engine to transmission;
    }
}