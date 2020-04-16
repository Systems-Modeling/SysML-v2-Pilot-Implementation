package '15_05-Unification of Expression and Constraint Definition' {
	import '15_03-Value Expression'::*;
	
	constraint def DiscBrakeConstraint {
		part wheelAssy : WheelAssy[4];
		
		wheelAssy->forAll w: WheelAssy ( 
			w::discBrakeAssy::radius < w::wheel::outerDiameter
		)
	}
	
	constraint def DiscBrakeFitConstraint_Alt {
		part discBrakeAssy : DiscBrakeAssy[1];
		part wheel : Wheel[1];
		
		2 * discBrakeAssy::radius < wheel::outerDiameter
	}
	
	block Vehicle_2 {
		value mass : MassValue[1] = 1200@[kg];
		value length : LengthValue[1] = 4.82@[m];
		
		part wheelAssy : WheelAssy[4];
		
		/** 
		 * This constraint is computed, but not asserted. This means a tool can identify 
		 * when it is violated without the model being inconsistent.
		 */
		constraint discBrakeConstraint : DiscBrakeConstraint {
			part :>> wheelAssy = Vehicle_2::wheelAssy;
		}
	}
	
	block WheelAssy {
		part wheel : Wheel[1];
		part discBrakeAssy : DiscBrakeAssy[1];
		
		/**
		 * This constraint is asserted to be true, which means that the model
		 * is inconsistent if it the constraint is violated.
		 */
		assert constraint discBrakeFitConstraint_Alt: DiscBrakeFitConstraint_Alt {
			part :>> discBrakeAssy = WheelAssy::discBrakeAssy;
			part :>> wheel = WheelAssy::wheel;
		}
	}
	
	block DiscBrakeAssy {
		value radius : LengthValue[1] = 95@[mm];
	}
}