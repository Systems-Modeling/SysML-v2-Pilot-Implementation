/**
 * Example from the SysML 1.6 spec, subclause 8.4.5 Constraining Decomposition.
 */
package 'Vehicle Decomposition' {
	
	block Vehicle {
		part chs : 'Chassis Assembly'[1] {
			part rb redefines 'Chassis Assembly'::rb;
			part redefines w {
				part lb redefines w::lb;
			}
		}
		part eng : Engine[1] {
			part cyl redefines Engine::cyl;
		}
		
		ref cylinderBR[*] = eng::cyl;
		ref rollBarBR[*] = chs::rb;
		ref lugBoltBR[24..32] = chs::w::lb;
	}
	
	block 'Chassis Assembly' {
		part w : Wheel[4];
		part rb : RollBar[0..1];
	}
	
	block Wheel {
		part lb : LugBolt[6..10];
	}
	
	block LugBolt;
	
	block RollBar;
	block HeavyRollBar :> RollBar;
	block LightRollBar :> RollBar;
	
	block Engine {
		part cyl : Cylinder[4..8];
	}
	
	block Cylinder;
	
	block 'Vehicle Model 1' :> Vehicle {
		ref redefines cylinderBR[4];
		ref redefines rollBarBR : LightRollBar[*];
		ref redefines lugBoltBR[24];
	}
	
	block 'Vehicle Model 2' :> Vehicle {
		ref redefines cylinderBR[6..8];
		ref redefines rollBarBR[0];
		ref redefines lugBoltBR[24..28]; // 6..7 per wheel
	}
}