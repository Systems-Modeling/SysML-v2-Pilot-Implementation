package 'FAQ-Actions-Send_and_reply_to_asynchronous_signals' {
	doc /*
	 * How do you send and reply to asynchronous signals?
	 * (Based on "Capturing return value" by Kobi Kobiaszu 4 Aug 2023)
	 */
	 
	private import ScalarValues::*;
     
    item def EnableCommand;
    item def SpeedRequest;
    item def SpeedReading {
        attribute speed : Integer;
    }
    item def CruiseAck {
    	attribute ack : Boolean;
    }
   
    part def CruiseControl {
        port driverCommands;
        port speedData;	

        state cruiseState {
            entry;
            then disabled;
            
            state disabled;
            transition
            	first disabled
            	accept EnableCommand via driverCommands
                do send new SpeedRequest() via speedData
                then waitingForSpeed;
 
            state waitingForSpeed;
            transition
            	first waitingForSpeed
            	accept reading: SpeedReading via driverCommands
                if reading.speed <= 45
                then disabled;
            transition
            	first waitingForSpeed
            	accept reading: SpeedReading via driverCommands
                if reading.speed > 45
                then enabled;	 
 
            state enabled;
            transition
            	first enabled
            	accept EnableCommand via driverCommands
                do send new CruiseAck(ack = true) via driverCommands
                then disabled;
        }
    }

    part def Driver {
        port driverCommands;
    }
    
    part def Speedometer {
    	port speedData;
    }
     
    part Vehicle {
        part driver : Driver;
        part cruiseControl : CruiseControl;
        part speedometer : Speedometer;
        
        interface driver.driverCommands to cruiseControl.driverCommands;
        interface cruiseControl.speedData to speedometer.speedData;   
    }
}
