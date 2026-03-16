package 'FAQ-Ports-Provided_and_required_operations_on_a_port' {
	doc /*
	 * How do you do provided and required operations on a port?
	 * (Based on "Migrating from Sysml V1.6 -> How to replace ProxyPorts / InterfaceBlocks" 
	 * by Andreas Henke 23 May 2023)
	 */
	 
	private import ScalarValues::Integer;
	
	item def Rcptn {
		attribute arg : Integer;
	}
	
	port def IB_A {
		in attribute attr : Integer;
		out ref action oprtn { // "provided" operation
			in arg : Integer;
		}
	}
	
	part def Block {
		port ppIB_A : IB_A;
		port ppIB_A_conj : ~IB_A;
		
		attribute attrIn;
		attribute attrOut;

		bind ppIB_A.attr = attrIn;
		bind ppIB_A_conj.attr = attrOut;
		
		action provOprtn {
			in arg : Integer;
			perform ppIB_A_conj.oprtn {
				in arg = provOprtn::arg * 2;
			}
		}
		
		bind ppIB_A.oprtn = provOprtn;
		
		state stateMachine[1] {
			entry; then wait;
			
			state wait;
			transition
				first wait
				accept provRecptn : Rcptn via ppIB_A
				do send new Rcptn(provRecptn.arg * 2) via ppIB_A_conj
				then wait;
		}
	}
	
	interface def Simplex {
		end port pp : IB_A;
		end port pp_conj : ~IB_A;
		
		flow pp_conj.attr to pp.attr;
		bind pp_conj.oprtn = pp.oprtn;
	}
	
	connection def Duplex {
		end part block1 : Block;
		end part block2 : Block;
		
		interface : Simplex connect block1.ppIB_A to block2.ppIB_A_conj;
		interface : Simplex connect block2.ppIB_A to block1.ppIB_A_conj;		
	}
	
	part def System {
		part blockA : Block;
		part blockB : Block;
		
		connection : Duplex connect blockA to blockB;
	}
}