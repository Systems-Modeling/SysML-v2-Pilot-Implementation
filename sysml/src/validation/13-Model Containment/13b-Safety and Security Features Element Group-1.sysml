package '13b-Safety and Security Features Element Group-1' {
	import ScalarValues::*;
	
	abstract attribute def PartInfo {
		attribute isMandatory: Boolean[0..1];
	}
	attribute def Safety :> PartInfo;
	attribute def Security :> PartInfo {
		attribute :> isMandatory = false;
	}
	
	part vehicle1_c1: '2a-Parts Interconnection'::VehicleA {
		part interior {
			part alarm {@Security;}
			part seatBelt[2] {@Safety{isMandatory = true;}}
			part frontSeat[2];
			part driverAirBag {@Safety;}
		}
		part bodyAssy {
			part body;
			part bumper {@Safety;}
			part keylessEntry {@Security;}
		}
		part wheelAssy {
			part wheel[2];
			part antilockBrakes[2] {@Safety{isMandatory = false;}}
		}
	}
	
	package 'Safety Features' {
		/* Parts that contribute to safety. */
		
		import vehicle1_c1::**[@Safety];
	}
	
	package 'Security Features' {
		/* Parts that contribute to security. */
		
		import vehicle1_c1::**[@Security];
	}
	
	package 'Safety & Security Features' {
		/* Parts that contribute to safety OR security. */
		 
		import vehicle1_c1::**[@Safety || @Security];
	}
	
	package 'Mandatory Features' {
		import vehicle1_c1::**[PartInfo::isMandatory];
	}
}
