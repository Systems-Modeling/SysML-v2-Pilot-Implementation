package '15_02-Basic Value Properties' {
	import ScalarValues::*;
	
	/*
	 * Real world user models would use quantity types
	 * from library models.
	 */

    value type LengthValue :> Real;

    block Tire {
    	value manufacturer: String;
        value hubDiameter: LengthValue;
        value width: Integer;
    }
    
    part frenchTire: Tire {
    	value :>> manufacturer = "Michelin";
    	value :>> hubDiameter = 18.0;
    	value :>> width = 245;
    }
    
}
