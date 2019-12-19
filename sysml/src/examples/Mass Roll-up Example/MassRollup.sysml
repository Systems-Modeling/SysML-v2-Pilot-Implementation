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
			mass + (subcomponents->collect p:MassedThing (p::totalMass)->reduce '+' ?? 0.0); 
	}
	
	part filteredMassThing :> compositeThing {
		abstract value minMass :> ISQ::mass;
		
		value totalMass redefines MassedThing::totalMass =
			(./subcomponents/mass[p (p > minMass)])->reduce '+' ?? 0.0;
	}

}