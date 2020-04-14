package 'Constraint Assertions-2' {
	import ISQ::*;
	import SI::*;
	import ScalarFunctions::*;
	
	block Engine;
	block Transmission;
	
	constraint def MassConstraint (
		partMasses : MassValue[0..*],
		massLimit : MassValue);
	
	constraint massConstraint : MassConstraint (
		partMasses : MassValue[0..*],
		massLimit : MassValue) {
			
		sum(partMasses) <= massLimit
	}
	
	block Vehicle {
		assert massConstraint (
			partMasses = {chassisMass, engine::mass, transmission::mass},
			massLimit = 2500@[kg]
		);
		
		value chassisMass : MassValue;
		
		value engine : Engine {
			value mass : MassValue;
		}
		
		value transmission : Engine {
			value mass : MassValue;
		}
	}	
}