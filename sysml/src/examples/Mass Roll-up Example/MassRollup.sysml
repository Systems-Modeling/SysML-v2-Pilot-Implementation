package MassRollup {
	import ScalarFunctions::*;
	
	block MassedThing {
		value mass subsets ISQ::mass; 
		value totalMass subsets ISQ::mass;
	}
	
	part simpleThing : MassedThing {
		value totalMass redefines MassedThing::totalMass = mass;
	}
	
	part compositeThing : MassedThing {
		part subcomponents: MassedThing[*];
		
		value totalMass redefines MassedThing::totalMass =
			mass + (subcomponents->collect p:MassedThing (p::totalMass)->reduce '+') ?? 0.0;
	}
	
	part filteredMassThing :> compositeThing {
		value totalMass redefines MassedThing::totalMass =
			./subcomponents/mass[p:ISQ::mass (p > 10.0)]->reduce '+' ?? 0.0;		
	}

}