package MassConstraintExample {
	import ISQ::*;
	import SI::*;
	import ScalarFunctions::*;
	
	block Engine {
		value m :> mass;
	}
	
	block Transmission {
		value m :> mass;
	}
	
	block Vehicle {
		value m : MassValue = eng::m + trans::m;
		
		part eng : Engine {
			value m : MassValue;
		}
		
		part trans : Transmission {
			value m : MassValue;
		}
	}
	
	block Vehicle {
		assert constraint { m == eng::m + trans::m }
		
		value m : MassValue;
		
		part eng : Engine {
			value m : MassValue;
		}
		
		part trans : Transmission {
			value m : MassValue;
		}
	}
	
	constraint def MassConstraint (
		totalMass : MassValue, 
		partMasses : MassValue[0..*]) {
			
		totalMass == sum(partMasses)
	}
	
	block Vehicle {
		assert constraint massConstraint : MassConstraint (
			totalMass = m, 
			partMasses = {eng::m, trans::m}
		);
		
		value m : MassValue;
		
		part eng {
			value m : MassValue;
		}
		
		part trans {
			value m : MassValue;
		}
	}
	
	constraint def MassConstraint (
		totalMass : MassValue, 
		partMasses : MassValue[0..*]);
	
	constraint mc : MassConstraint (
		totalMass : MassValue, 
		partMasses : MassValue[0..*]) {
		
		totalMass == sum(partMasses)
	}
	
	block Vehicle {
		assert mc (
			totalMass = m, 
			partMasses = {eng::m, trans::m}
		);
		
		value m : MassValue;
		
		part eng : Engine {
			value m : MassValue;
		}
		
		part trans : Transmission {
			value m : MassValue;
		}
	}
	
	constraint def MassLimit (
		mass : MassValue, 
		maxMass : MassValue) {
			
		mass <= maxMass
	}
	
	block Vehicle {
		assert constraint ml : MassLimit (
			mass = m, 
			maxMass = 2500@[kg]
		);
		
		value m : MassValue = eng::m + trans::m;
		
		part eng : Engine {
			value m : MassValue;
		}
		
		part trans : Transmission {
			value m : MassValue;
		}
	}	
	
}