package CalculationExample {
	import ISQ::*;
	import ScalarFunctions::*;
	
	part vehicle {
		attribute m : MassValue;
		
		part eng {
			attribute m : MassValue;
		}
		
		part trans {
			attribute m : MassValue;
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