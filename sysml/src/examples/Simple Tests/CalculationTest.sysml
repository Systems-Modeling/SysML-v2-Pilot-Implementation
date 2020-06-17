package CalculationExample {
	import ISQ::*;
	import ScalarFunctions::*;
	
	part vehicle {
		value m : MassValue;
		
		part eng {
			value m : MassValue;
		}
		
		part trans {
			value m : MassValue;
		}
	}
	
	calc def MassSum (
		partMasses : MassValue[0..*] )
		totalMass : MassValue 
	{
		sum(partMasses)
	}
	
	calc ms: MassSum (
		totalMass = vehicle::m)
		partMasses = {vehicle::eng::m, vehicle::trans::m};
}