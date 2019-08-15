package AccessControl {
	import ScalarValues::*;
	
	block Authorizer {
		port ap[1];
		port console[1];
	}
	block SpecialAuthorizer :> Authorizer;
	
	block Console {
		port authorizer[*];
		port supervisor[1];
	}
	
	block AccessPoint {
		value floor: Integer; // 0..10
		value seclev: Integer; // 1..4
		
		port user;
		port door;
		port authorizer[1];
	}
	
	block BlockingAccessPoint :> AccessPoint;
	block LoggingAccessPoint :> AccessPoint;
	
	block ACSystem {
		part ap: AccessPoint[2..100] {
			port user redefines AccessPoint::user;
			port authorizer redefines AccessPoint::authorizer;
		}
		part aut: Authorizer[2] {
			port ap redefines Authorizer::ap;
			port console redefines Authorizer::console;
		}
		part c: Console[1] {
			port authorizer redefines Console::authorizer;
			port supervisor redefines Console::supervisor;
		}
		
		port user;
		port door;
		port supervisor;
		
		bind ap::user[*] = user;
		bind c::supervisor[1] = supervisor[1];
		
		interface ap_aut connect ap::authorizer[*] to aut::ap[1];
		interface aut_c connect aut::console[*] to c::authorizer[1];
		
	}
	
	block MyACSystem :> ACSystem {
		part ground: LoggingAccessPoint[1..25] subsets ap;
		part top: BlockingAccessPoint[2..99] subsets ap;
	}
	
	block MyACSnapshot :> MyACSystem {
		part zero: LoggingAccessPoint[1..25] subsets ground {
			value floor redefines LoggingAccessPoint::floor = 0;
			value seclev redefines LoggingAccessPoint::seclev = 4;
			
			port authorizer redefines LoggingAccessPoint::authorizer;
		}
		part 'first': BlockingAccessPoint[2..99] subsets top {
			value floor redefines LoggingAccessPoint::floor = 1;
			value seclev redefines LoggingAccessPoint::seclev = 3;
			
			port authorizer redefines LoggingAccessPoint::authorizer;
		}
		part second: BlockingAccessPoint[2..99] subsets top {
			value floor redefines LoggingAccessPoint::floor = 2;
			value seclev redefines LoggingAccessPoint::seclev = 3;
			
			port authorizer redefines LoggingAccessPoint::authorizer;
		}
		
		part secureAut: SpecialAuthorizer[1] subsets aut {
			port ap redefines aut::ap;
		}
		part regularAut: Authorizer[1] subsets aut {
			port ap redefines aut::ap;
		}
		
		interface zero_aut subsets ap_aut connect zero::authorizer[1] to secureAut::ap[1];
		interface first_aut subsets ap_aut connect 'first'::authorizer[1] to regularAut::ap[1];
		interface second_aut subsets ap_aut connect second::authorizer[1] to regularAut::ap[1];
	}

}