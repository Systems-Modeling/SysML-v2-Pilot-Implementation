
package OneToUnrestrictedConnectorsModelToBeExecuted {
	doc
	/* 
	 */

	import WithoutConnectorsModelToBeExecuted::BikeFork;

	classifier Bicycle {
		feature carrier : BikeBasket [*];
		feature holdsWheel : BikeFork [*];
		connector carrierFixed : BikeBasketFixed from carrier [*] to holdsWheel [1];
	}
	classifier BikeBasket;

	assoc BikeBasketFixed {
		end feature basket : BikeBasket;
		end feature fixedTo : BikeFork;
	}
}

package OneToUnrestrictedConnectorsExecution {
	doc
	/* 
	 */

	import Atoms::*;
	import OneToUnrestrictedConnectorsModelToBeExecuted::*;
	import OneToOneConnectorsExecution::MyBikeFork1;
	import OneToOneConnectorsExecution::MyBikeFork2;
	import OneToOneConnectorsExecution::MyBikeFork;

	#atom
	classifier MyBikeBasket1 :> BikeBasket;
	#atom
	classifier MyBikeBasket2 :> BikeBasket;

	classifier MyBikeBasket unions MyBikeBasket1, MyBikeBasket2;

	#atom
	classifier MyBike :> Bicycle {
		:>> carrier : MyBikeBasket [2];
		:>> holdsWheel : MyBikeFork [2];
	}
	#atom
	assoc MyBikeBasket1_Fork1_BBF_Link :> BikeBasketFixed {
		end :>> basket : MyBikeBasket1;
		end :>> fixedTo : MyBikeFork1;
	}
	#atom
	assoc MyBikeBasket2_Fork1_BBF_Link :> BikeBasketFixed {
		end :>> basket : MyBikeBasket2;
		end :>> fixedTo : MyBikeFork1;
	}

	classifier MyBikeBasket_Fork_BBF_Link unions MyBikeBasket1_Fork1_BBF_Link, MyBikeBasket2_Fork1_BBF_Link;

	#atom
	classifier MyBike2 :> Bicycle {
		:>> carrier : MyBikeBasket [2];
		connector :>> carrierFixed : MyBikeBasket_Fork_BBF_Link [2] from carrier [*] to holdsWheel [1];
	}
}