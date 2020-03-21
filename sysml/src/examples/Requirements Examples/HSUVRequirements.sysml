package HSUVRequirements {
	import Requirements::*;
	
	requirement def HybridSUV {
		
		requirement "UR1.1" Load: FunctionalRequirementCheck {
			requirement Passengers;
			requirement FuelCapacity;
			requirement Cargo;
		}
		
		requirement "UR1.2" EcoFriendliness: PerformanceRequirementCheck {
			requirement "URI1.2.1" Emissions: PerformanceRequirementCheck {
				/* The car shall meet 2010 Kyoto Accord emissions standards. */
			}
		}
		
		requirement "URI1.3" Performance: PerformanceRequirementCheck {
			requirement Acceleration;
			requirement "URI1.3.1" FuelEconomy: PerformanceRequirementCheck {
				/* User shall obtain fuel economy better than that provided by
				 * 95% of cars built in 2004.
				 */
			}
			requirement Braking;
			requirement Range;
			requirement Power;
		}
		
		requirement Ergonomics;
	}
}