package 'Subsetting Example' {
	
	block Vehicle {
		part parts : VehiclePart[*];
		
		part eng : Engine subsets parts;
		part trans : Transmission subsets parts;
		part wheels : Wheel[4] :> parts;
	}
	
	abstract block VehiclePart;
	block Engine :> VehiclePart;
	block Transmission :> VehiclePart;
	block Wheel :> VehiclePart;
}