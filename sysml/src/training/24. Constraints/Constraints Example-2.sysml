package 'Constraints Example-2' {
	import ISQ::*;
	import SI::*;
	import ScalarFunctions::*;
	
	block Engine;
	block Transmission;
	
	constraint def MassConstraint {
		value partMasses : MassValue[0..*];
		value massLimit : MassValue;
			
		sum(partMasses) <= massLimit
	}
	
	block Vehicle {
		constraint massConstraint : MassConstraint {
			redefines partMasses = {chassisMass, engine::mass, transmission::mass};
			redefines massLimit = 2500@[kg];
		}
		
		value chassisMass : MassValue;
		
		value engine : Engine {
			value mass : MassValue;
		}
		
		value transmission : Engine {
			value mass : MassValue;
		}
	}
}