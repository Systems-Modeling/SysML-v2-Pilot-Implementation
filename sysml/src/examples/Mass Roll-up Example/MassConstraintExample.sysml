package MassConstraintExample {
	import ISQ::*;
	import SI::*;
	import ScalarFunctions::*;
	
	part def Engine {
		attribute m :> mass;
	}
	
	part def Transmission {
		attribute m :> mass;
	}
	
	part def Vehicle {
		attribute m : MassValue = eng::m + trans::m;
		
		part eng : Engine {
			attribute m : MassValue;
		}
		
		part trans : Transmission {
			attribute m : MassValue;
		}
	}
	
	part def Vehicle {
		assert constraint { m == eng::m + trans::m }
		
		attribute m : MassValue;
		
		part eng : Engine {
			attribute m : MassValue;
		}
		
		part trans : Transmission {
			attribute m : MassValue;
		}
	}
	
	constraint def MassConstraint (
		totalMass : MassValue, 
		partMasses : MassValue[0..*]) {
			
		totalMass == sum(partMasses)
	}
	
	part def Vehicle {
		assert constraint massConstraint : MassConstraint (
			totalMass = m, 
			partMasses = {eng::m, trans::m}
		);
		
		attribute m : MassValue;
		
		part eng {
			attribute m : MassValue;
		}
		
		part trans {
			attribute m : MassValue;
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
	
	part def Vehicle {
		assert mc (
			totalMass = m, 
			partMasses = {eng::m, trans::m}
		);
		
		attribute m : MassValue;
		
		part eng : Engine {
			attribute m : MassValue;
		}
		
		part trans : Transmission {
			attribute m : MassValue;
		}
	}
	
	constraint def MassLimit (
		mass : MassValue, 
		maxMass : MassValue) {
			
		mass <= maxMass
	}
	
	part def Vehicle {
		assert constraint ml : MassLimit (
			mass = m, 
			maxMass = 2500@[kg]
		);
		
		attribute m : MassValue = eng::m + trans::m;
		
		part eng : Engine {
			attribute m : MassValue;
		}
		
		part trans : Transmission {
			attribute m : MassValue;
		}
	}	
	
}