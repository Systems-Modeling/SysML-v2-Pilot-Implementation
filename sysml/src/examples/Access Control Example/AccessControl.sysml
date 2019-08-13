package AccessControl {
	import ScalarValues::*;
	
	port def AccessPointPort;
	port def ConsolePort;
	port def AuthorizerPort;
	port def SupervisorPort;
	port def UserPort;
	port def DoorPort;
	
	block Authorizer {
		port ap: AccessPointPort[1];
		port console: ConsolePort[1];
	}
	block SpecialAuthorizer :> AuthorizerPort;
	
	block Console {
		port authorizer: AuthorizerPort[*];
		port supervisor: SupervisorPort[1];
	}
	
	block AccessPoint {
		value floor: Integer; // 0..10
		value seclev: Integer; // 1..4
		
		port user: UserPort;
		port door: DoorPort;
		port authorizer: AuthorizerPort[1];
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
		
		port user: UserPort;
		port door: DoorPort;
		port supervisor: SupervisorPort;
		
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