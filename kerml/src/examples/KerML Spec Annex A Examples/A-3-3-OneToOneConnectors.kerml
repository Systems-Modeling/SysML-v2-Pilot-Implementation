
package OneToOneConnectorsModelToBeExecuted {
	doc
	/* 
	 */

        import WithoutConnectorsModelToBeExecuted::Wheel;
        import WithoutConnectorsModelToBeExecuted::BikeFork;

	classifier Bicycle {
		feature rollsOn : Wheel [2];
		feature holdsWheel : BikeFork [*];
		connector fixWheel : BikeWheelFixed from rollsOn [1] to holdsWheel [1];
	}
	assoc BikeWheelFixed {
		end feature wheel : Wheel;
		end feature fixedTo : BikeFork;
	}
}

package OneToOneConnectorsExecution {
	doc
	/* 
	 */

	import Atoms::*;
	import OneToOneConnectorsModelToBeExecuted::*;
	import WithoutConnectorsExecution::MyWheel1;
	import WithoutConnectorsExecution::MyWheel2;
	import WithoutConnectorsExecution::MyWheel;

	#atom
	classifier MyBikeFork1 :> BikeFork;
	#atom
	classifier MyBikeFork2 :> BikeFork;

	classifier MyBikeFork unions MyBikeFork1, MyBikeFork2;

	#atom
	classifier MyBike :> Bicycle {
		:>> rollsOn : MyWheel;
		:>> holdsWheel : MyBikeFork;
	}
	#atom
 	assoc MyBikeWheel1_Fork1_BWF_Link :> BikeWheelFixed {
		end :>> wheel : MyWheel1;
		end :>> fixedTo : MyBikeFork1;
	}
	#atom
	assoc MyBikeWheel2_Fork2_BWF_Link :> BikeWheelFixed {
		end :>> wheel : MyWheel2;
		end :>> fixedTo : MyBikeFork2;
	}

	classifier MyBikeWheel_Fork_BWF_Link unions MyBikeWheel1_Fork1_BWF_Link, MyBikeWheel2_Fork2_BWF_Link;

	#atom
	classifier MyBikeWithConnector :> Bicycle {
		:>> rollsOn : MyWheel;
		:>> holdsWheel : MyBikeFork;
		connector :>> fixWheel : MyBikeWheel_Fork_BWF_Link [2] from rollsOn [1] to holdsWheel [1];
	}
}
