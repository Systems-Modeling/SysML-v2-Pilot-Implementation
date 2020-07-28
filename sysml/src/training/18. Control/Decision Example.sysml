package 'Decision Example' {
	import ScalarValues::*;
	
	attribute def BatteryCharged;
	
	part battery;
	part powerSystem;
	
	action def AddCharge (in charge : Real);
	
	action def ChargeBattery {
		first start;

		then merge continueCharging;
		
		then accept monitor (batteryCharge : Real);
		
		then decide;
			if monitor::batteryCharge < 100 then addCharge;
			if monitor::batteryCharge >= 100 then signalCharged;
			
		action addCharge : AddCharge (batteryCharge);
		then continueCharging;
		
		send signalCharged of BatteryCharged() to powerSystem;
		then done;
	}
}