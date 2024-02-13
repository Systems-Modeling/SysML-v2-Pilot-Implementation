
package TimingForStructuresModelToBeExecuted1 {
	doc
	/* 
	 */

	import WithoutConnectorsModelToBeExecuted::Wheel;
	import WithoutConnectorsModelToBeExecuted::BikeFork;
	import Occurrences::Occurrence;

	struct Bicycle {
		feature rollsOn : Wheel [2] subsets timeCoincidentOccurrences;
		feature holdsWheel : BikeFork [2] subsets timeCoincidentOccurrences;
	}
}

package TimingForStructuresExecution1 {
	doc
	/* 
	 */

	import Atoms::*;
	import TimingForStructuresModelToBeExecuted1::*;
	import OneToOneConnectorsExecution::MyWheel;
	import OneToOneConnectorsExecution::MyBikeFork;

	struct MyBikeTimeCoincident unions MyWheel, MyBikeFork, MyBike;

	#atom
	struct MyBike :> Bicycle {
		:>> self : MyBike;
		:>> timeCoincidentOccurrences : MyBikeTimeCoincident [4];
		:>> rollsOn : MyWheel;
		:>> holdsWheel : MyBikeFork;
	}
}


package TimingForStructuresModelToBeExecuted2 {
	doc
	/* 
	 */

	import WithoutConnectorsModelToBeExecuted::Wheel;
	import WithoutConnectorsModelToBeExecuted::BikeFork;
	import Occurrences::Occurrence;
	import Occurrences::HappensDuring;

	struct Bicycle {
		feature rollsOn : Wheel [2];
		feature holdsWheel : BikeFork [2];
		feature allParts : Occurrence unions rollsOn, holdsWheel;
		connector b_during_ap : HappensDuring from self [1] to allParts [*];
	}
}

package TimingForStructuresExecution2 {
	doc
	/* 
	 */

	import Atoms::*;
	import TimingForStructuresModelToBeExecuted2::*;
	import Occurrences::HappensDuring;
	import OneToOneConnectorsExecution::MyWheel1;
	import OneToOneConnectorsExecution::MyWheel2;
	import OneToOneConnectorsExecution::MyWheel;
	import OneToOneConnectorsExecution::MyBikeFork1;
	import OneToOneConnectorsExecution::MyBikeFork2;
	import OneToOneConnectorsExecution::MyBikeFork;

	#atom
	assoc MyBike_During_Wheel1_Link :> HappensDuring {
		end :>> shorterOccurrence : MyBike;
		end :>> longerOccurrence : MyWheel1;
	}
	#atom
	assoc MyBike_During_Wheel2_Link :> HappensDuring {
		end :>> shorterOccurrence : MyBike;
		end :>> longerOccurrence : MyWheel2;
	}
	#atom
	assoc MyBike_During_Fork1_Link :> HappensDuring {
		end :>> shorterOccurrence : MyBike;
		end :>> longerOccurrence : MyBikeFork1;
	}
	#atom
	assoc MyBike_During_Fork2_Link :> HappensDuring {
		end :>> shorterOccurrence : MyBike;
		end :>> longerOccurrence : MyBikeFork2;
	}

	assoc MyBike_During_Parts_Link :> HappensDuring
		unions MyBike_During_Wheel1_Link, MyBike_During_Fork1_Link,
		       MyBike_During_Wheel2_Link, MyBike_During_Fork2_Link;

	struct MyBikeParts unions MyWheel, MyBikeFork;

	#atom
	struct MyBike :> Bicycle {
		:>> rollsOn : MyWheel;
		:>> holdsWheel : MyBikeFork;
		:>> allParts : MyBikeParts [4];

		:>> self : MyBike;
		connector redefines b_during_ap : MyBike_During_Parts_Link [4]
			from self [1] to allParts [*];
	}
}

package TimingForStructuresModelToBeExecuted3 {
	doc
	/* 
	 */

	import WithoutConnectorsModelToBeExecuted::Wheel;
	import WithoutConnectorsModelToBeExecuted::BikeFork;
	import Occurrences::Occurrence;
	import Occurrences::HappensWhile;

	struct Bicycle {
		feature rollsOn : Wheel [2];
		feature holdsWheel : BikeFork [2];
		feature allParts : Occurrence unions rollsOn, holdsWheel;
		:>> endShot : Bicycle;
		connector be_while_pe : HappensWhile from endShot [1] to endShot.allParts.endShot[*];
	}
}

package TimingForStructuresExecution3 {
	doc
	/* 
	 */

	import Atoms::*;
	import TimingForStructuresModelToBeExecuted3::*;
	import Occurrences::Occurrence;
	import Occurrences::HappensWhile;
	import WithoutConnectorsModelToBeExecuted::Wheel;
	import WithoutConnectorsModelToBeExecuted::BikeFork;

	  /* End atoms */
	#atom
	struct MyWheel1End :> Wheel;
	#atom
	struct MyWheel1 :> Wheel {
		redefines endShot : MyWheel1End;
	}
	#atom
	struct MyWheel2End :> Wheel;
	#atom
	struct MyWheel2 :> Wheel {
		redefines endShot : MyWheel2End;
	}
	struct MyBikeFork1End :> BikeFork;
	#atom
	struct MyBikeFork1 :> BikeFork {
		redefines endShot : MyBikeFork1End;
	}
	struct MyBikeFork2End :> BikeFork;
	#atom
	struct MyBikeFork2 :> BikeFork {
		redefines endShot : MyBikeFork2End;
	}
	#atom
	struct MyBikeEnd :> Bicycle;

	  /* HappensWhile atoms */
	#atom
	assoc MyBikeEnd_While_Wheel1End_Link :> HappensWhile {
		end :>> thisOccurrence : MyBikeEnd;
		end :>> thatOccurrence : MyWheel1End;
	}
	#atom
	assoc MyBikeEnd_While_Wheel2End_Link :> HappensWhile {
		end :>> thisOccurrence : MyBikeEnd;
		end :>> thatOccurrence : MyWheel2End;
	}
	#atom
	assoc MyBikeEnd_While_Fork1End_Link :> HappensWhile {
		end :>> thisOccurrence : MyBikeEnd;
		end :>> thatOccurrence : MyBikeFork1End;
	}
	#atom
	assoc MyBikeEnd_While_Fork2End_Link :> HappensWhile {
		end :>> thisOccurrence : MyBikeEnd;
		end :>> thatOccurrence : MyBikeFork2End;
	}

	assoc MyBikeEnd_While_PartsEnd_Link  :> HappensWhile
		unions MyBikeEnd_While_Wheel1End_Link, MyBikeEnd_While_Fork1End_Link,
		       MyBikeEnd_While_Wheel2End_Link, MyBikeEnd_While_Fork2End_Link;

	#atom
	struct MyBike :> Bicycle {
		redefines endShot : MyBikeEnd;
		connector :>> be_while_pe : HappensWhile [4]
			from endShot [1] to endShot.allParts.endShot[*];  
	}
}