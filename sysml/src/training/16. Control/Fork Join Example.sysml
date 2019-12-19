package 'Fork Join Example' {
	import ScalarValues::*;
	
	value type TurnKeyToOn;
	value type BrakePressure;
	
	activity MonitorBrakePedal(out brakePressure : BrakePressure);
	activity MonitorTraction(out modulationFrequency : Real);
	activity Braking(in brakePressure : BrakePressure, in modulationFrequency : Real);
	
	activity Brake {
		accept (TurnKeyToOn);
		
		then fork;
			then monitorBrakePedal;
			then monitorTraction;
			then braking;
		
		action monitorBrakePedal : MonitorBrakePedal (
			out brakePressure
		);
		then joinNode;
		
		action monitorTraction : MonitorTraction (
			out modulationFrequency);
		then joinNode;
		
		action braking : Braking(
			in stream from monitorBrakePedal::brakePressure, 
			in stream from monitorTraction::modulationFrequency);
		then joinNode;
		
		join joinNode;
		then done;
	}
}