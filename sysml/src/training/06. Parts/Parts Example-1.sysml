package 'Parts Example-1' {
	
	// Definitions
	
	block Vehicle {
		part eng : Engine;
	}
	
	block Engine {
		part cyl : Cylinder[4..6];
	}
	
	block Cylinder;
	
	// Usages
	
	part smallVehicle : Vehicle {
		part redefines eng {
			part redefines cyl[4];
		}
	}
	
	part bigVehicle : Vehicle {
		part redefines eng {
			part redefines cyl[6];
		}
	}
	
}