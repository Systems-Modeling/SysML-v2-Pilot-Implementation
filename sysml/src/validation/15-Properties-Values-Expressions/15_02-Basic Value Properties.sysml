package '15_02-Basic Value Properties' {
	import ScalarValues::*;
	
	/**
	 * Real world user models would use a quantity type
	 * from the library model. A value type is defined
	 * here to show that it is possible.
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
