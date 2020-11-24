package '9-Verification-simplified' {
	import Verifications::*;
	import Definitions::*;
	
	package Definitions {
	
		requirement def id '2' MassRequirement {
			attribute massActual :> ISQ::mass;
			attribute massReqd :> ISQ::mass;
			
			doc /* The actual mass shall be less than or equal to the required mass limit. */
			
			require constraint { massActual <= massReqd }
		}
		
		part def Vehicle {
			attribute mass :> ISQ::mass;
		}
		
		part def Scale;
		part def TestOperator;
		
		verification def MassTest {
			objective massVerificationObjective {
				verify requirement massRequirement : MassRequirement;
			}
		}
		
		individual def TestVehicle :> Vehicle;
	
	}
	
	package Usages {
	
		requirement id '2.1' vehicleMassRequirement : MassRequirement {
			subject vehicle : Vehicle;
			
			doc /* The vehicle mass shall be less than or equal to 2500 kg. */
				
			:>> massReqd = 2500@[SI::kg];
		}
		
		part vehicle1_c2 : Vehicle {
			// ...
		}
		
		verification vehicleMassTest : MassTest {
			subject vehicle : Vehicle;
			objective vehicleMassVerificationObjective {
				verify vehicleMassRequirement :>> massRequirement;
			}
			
			action collectData {
				in part testVehicle : Vehicle = vehicle;
				out massMeasured :> ISQ::mass;
			}
			
			action processData {
				in massMeasured :> ISQ::mass = collectData::massMeasured;
				out massProcessed :> ISQ::mass;
			}
			
			action evaluateData {
				in massProcessed :> ISQ::mass = processData::massProcessed;
				calc :>> vehicleMassRequirement {
					:>> massActual = massProcessed;
					return isSatisfied;
				}
				out verdict : VerdictKind = PassIf(vehicleMassRequirement::isSatisfied);
			}
			
			return verdict : VerdictKind = evaluateData::verdict;
		}
		
		part massVerificationSystem {
			perform vehicleMassTest {
				part :>> vehicle = vehicleUnderTest;
			}
			
			ref part vehicleUnderTest : Vehicle;
			
			part testOperator : TestOperator;
			
			part scale : Scale {
				perform vehicleMassTest::collectData {
					in part :>> testVehicle;
					
					// In reality, this would be some more involved process.
					measurement = testVehicle::mass;
					
					out :>> massMeasured = measurement;
				}
			}
		}
		
		part massVerificationContext {
			ref individual testVehicle : TestVehicle :> vehicle1_c2 {
				:>> mass = 2500@[SI::kg];
			}
			
			ref part :>> massVerificationSystem {
				ref part :>> vehicleUnderTest = testVehicle;
			}
		}
		
	}
	
}