package 'Redefinition Example' {

	block Vehicle {
		part eng : Engine;
	}
	block SmallVehicle :> Vehicle {
		part smallEng : SmallEngine redefines eng;
	}
	block BigVehicle :> Vehicle {
		part bigEng : BigEngine :>> eng;
	}

	block Engine {
		part cyl : Cylinder[4..6];
	}
	block SmallEngine :> Engine {
		part redefines cyl[4];
	}
	block BigEngine :> Engine {
		part redefines cyl[6];
	}

	block Cylinder;
}
