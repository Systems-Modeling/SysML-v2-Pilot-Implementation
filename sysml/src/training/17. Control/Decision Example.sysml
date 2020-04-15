package 'Decision Example' {
	import ScalarValues::*;
	
	value type BatteryCharged;
	
	part battery;
	part powerSystem;
	
	activity AddCharge (in charge : Real);
	
	activity ChargeBattery {
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