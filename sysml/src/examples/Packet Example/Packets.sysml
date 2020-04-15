package Packets {
	private import ScalarValues::*;
	private import Time::DateTime;
	
	value 'packet header' { }
	
	value 'packet data field' {	
		value 'packet secondary header' redefines 'packet header';
		value 'user data field';
	}
	
	block 'Data Packet' {
		value 'packet primary header' redefines 'packet header' {
			value 'packet version number': Integer;
			value 'packet identification': String;
			value 'packet data length': Integer;
		}
		value redefines 'packet data field';
	}
	
	block 'Thermal Data Packet' :> 'Data Packet' {
		value 'packet data field' redefines Packets::'packet data field'{
			value 'packet secondary header' redefines 'packet header' {
				value 'packet timestamp': DateTime;
				value 'telemetry packet type': String;
			}
			
			value 'user data field' redefines Packets::'packet data field'::'user data field' {
				value timestamp: DateTime;
				value temperature: Real;
			}
		}
	}
	
}