package MassRollup {
	import ScalarFunctions::*;
	
	block MassedThing {
		value mass :> ISQ::mass; 
		value totalMass :> ISQ::mass;
	}
	
	part simpleThing : MassedThing {
		value totalMass redefines MassedThing::totalMass = mass;
	}
	
	part compositeThing : MassedThing {
		part subcomponents: MassedThing[*];
		
		value totalMass redefines MassedThing::totalMass =
			mass + sum(subcomponents->collect p:MassedThing (p::totalMass)); 
	}
	
	part filteredMassThing :> compositeThing {
		abstract value minMass :> ISQ::mass;
		
		value totalMass redefines MassedThing::totalMass =
			sum(./subcomponents/totalMass[p (p >= minMass)]);
	}

}