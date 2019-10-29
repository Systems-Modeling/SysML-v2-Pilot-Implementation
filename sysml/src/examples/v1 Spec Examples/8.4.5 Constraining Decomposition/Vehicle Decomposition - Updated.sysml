/**
 * Example from the SysML 1.6 spec, subclause 8.4.5 Constraining Decomposition,
 * updated for usage-focused approach.
 */
package 'Vehicle Decomposition - Updated' {
	
	// Blocks
	
	block Vehicle;
	
	block 'Chassis Assembly';
	
	block Wheel;
	
	block LugBolt;
	
	block RollBar;
	block HeavyRollBar :> RollBar;
	block LightRollBar :> RollBar;
	
	block Engine;
	
	block Cylinder;
	
	// Parts
	
	part vehicle : Vehicle {
		part chs : 'Chassis Assembly'[1] {
			part rb : RollBar[0..1];
			part w : Wheel[4] {
				part lb : LugBolt[6..10];
			}
		}
		part eng: Engine[1] {
			part cyl : Cylinder[4..8];
		}
	}
	
	
	part 'vehicle model 1' :> vehicle {
		part redefines chs {
			part redefines rb : LightRollBar[0..1];
			part redefines w {
				part redefines lb;
			}
		}
		part redefines eng {
			part redefines cyl[4];
		}
		
		// Constrains total number of lugbolts.
		ref lugBolts[24] = chs::w::lb;
	}
	
	part 'vehicle model 2' :> vehicle {
		part redefines chs {
			part redefines rb[0];
			part redefines w {
				// Constrains number of lugbolts per wheel.
				part redefines lb[6..7];
			}
		}
		part redefines eng {
			part redefines cyl[6..8];
		}
	}
}