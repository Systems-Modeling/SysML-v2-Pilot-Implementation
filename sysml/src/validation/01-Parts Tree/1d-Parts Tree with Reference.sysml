package '1d-Parts Tree with Reference' {
	
	package Definitions {
		block Vehicle;
		block Trailer;
		block TrailerHitch;
		block HitchBall;
		block TrailerCoupler;
	}
	
	package Usages {
		import Definitions::*;
		
		part vehicle_trailer_system {
			
			part vehicle1_c1: Vehicle {
				/**
				 * 'vehicle1_c1'::'hitchBall' is a reference property that is
				 * a bound reference to 'trailerHitch'::'hitchBall'. If
				 * 'vehicle1_c1' is removed or destroyed, this does not effect
				 * 'trailerHitch'::'hitchBall'.
				 */
				ref hitchBall : HitchBall = trailerHitch::hitchBall;
			}
			
			part trailerHitch: TrailerHitch {				
				part hitchBall: HitchBall;
				part trailerCoupler: TrailerCoupler;
			}
			
			part trailer1: Trailer {
				ref trailerCoupler : TrailerCoupler = trailerHitch::trailerCoupler;
			}
		}
	}
}