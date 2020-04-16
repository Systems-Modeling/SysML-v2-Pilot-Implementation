package '15_12-Compound Value Type' {
	import ScalarValues::*;
	
	/*
	 * Real world user models would use quantity and vector types
	 * from library models. They are included here for the purpose
	 * of showing how such value types can be defined.
	 */

    value type PositionVector {
        value x: Real[1];
        value y: Real[1];
        value z: Real[1];
    }
    
    value type LengthValue :> Real;

    value type TireInfo {
    	value manufacturer: String;
        value hubDiameter: LengthValue;
        value width: Integer;
        value placement: PositionVector[0..1];
    }
    
    value frenchTireInfo: TireInfo {
    	value :>> manufacturer = "Michelin";
    	value :>> hubDiameter = 18.0;
    	value :>> width = 245;
    }
}
