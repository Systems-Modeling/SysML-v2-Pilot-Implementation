package 'Packet Usage' {
	public import Packets::*;
	private import ScalarValues::Real;
	
	part packet1: 'Thermal Data Packet';
	part packet2: 'Thermal Data Packet';
	part packet3: 'Thermal Data Packet' {
		value 'special data field' redefines 'packet data field'{
			value 'user data field' {
				value 'special data': Real;
			}
		}
	}
	
}
	
