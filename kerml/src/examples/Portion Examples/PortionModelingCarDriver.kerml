package PortionModelingCarDriver {
	
	import Occurrences::Occurrence;
	import Occurrences::Life;
	import ScalarValues::Boolean;


       /* classes = lives, timeslices/snapshots not specifically typed */

	class Car1 :> Life {
		feature operated subsets timeSlices {
			:>> snapshots {
				feature driver : Person1 [1] {  // Requires drivers to be licensed their whole lives
					:>> isLicensed = true; } } } }  // Can't find isLicensed
				
	class Person1 :> Life {
		:>> snapshots {
			feature isLicensed : Boolean [1]; } }


        /* Narrowing when licenses are required.  */

	class Car2 :> Life {
		feature operated subsets timeSlices {
			:>> snapshots {
				feature driver [1] : Person1 {  
					feature thatCarSnap : Occurrence = that; 
					feature driverSnaps :>> snapshots; // Requires drivers to be licensed while driving
					feature driverNow [1] subsets driverSnaps, thatCarSnap.timeCoincidentOccurrences {
						:>> isLicensed = true; } } } } }


        /* "Typing" snapshots via portionOfLife  */

	class Car3 :> Life {
		feature operated subsets timeSlices {
			:>> snapshots {
				feature driver : Occurrence [1] {    
					:>> portionOfLife : Person3 { // "Types" driver
						feature driverLife : Person3 :>> self;
						feature thatDriverSnap : Occurrence subsets driverLife.snapshots = that; }
				    feature driverSnaps :>> snapshots;
					feature thatCarSnap : Occurrence = that;
					:>> self subsets driverSnaps, thatCarSnap.timeCoincidentOccurrences {
						:>> isLicensed = true; } } } } }  // Can't find isLicensed

	class Person3 :> Life {
		:>> snapshots {
			feature isLicensed : Boolean [1];
			feature drives : Occurrence [0..1] {
	 			:>> portionOfLife : Car3 {  // "Types" drives
					feature thatCarSnap : Occurrence subsets self.snapshots = that; } } } }


        /* Typing snapshots by features  */

	class Car33 :> Life {
		feature operated subsets timeSlices {
			:>> snapshots {
				feature driver : Occurrence [1] {    
				    feature driverSnaps : Person33::snapshots :>> snapshots;
					feature thatCarSnap : Occurrence = that;
					:>> self subsets driverSnaps, thatCarSnap.timeCoincidentOccurrences {
						:>> isLicensed = true; } } } } } 

	class Person33 :> Life {
		:>> snapshots {
			feature isLicensed : Boolean [1]; } }
							


        /* Typing snapshots by features, inverses.  */

	class Car333 :> Life {   //↓↓ Instead of snap class
		feature allDrivers : Person333::snapshots [*] = operated.snapshots.driver;
		feature operated subsets timeSlices {
			:>> snapshots {      //↓↓ Instead of snap class
				feature driver : Person333::snapshots [1] inverse of Person333::snapshots::drives { 
					feature thatCarSnap : Car333::operated::snapshots = that;
					:>> self subsets thatCarSnap.timeCoincidentOccurrences {
						:>> isLicensed = true; } } } } }

	class Person333 :> Life {  //↓↓ Instead of snap class
		feature allDrives : Car333::operated::snapshots [*] = snapshots.drives;
		:>> snapshots {
			feature isLicensed : Boolean [1];   //↓↓ Instead of snap class
			feature drives : Car333::operated::snapshots [0..1]; } }



        /* Car333 with top classes as timeslices.  */

	class Car333TS {
		feature driver : Person333TS [*] inverse of drives = operated.snapshots.driver;
		feature : Car333TS :>> timeSlices; // Includes snapshots, should be in library
		feature operated : Car333TS subsets timeSlices { 
			:>> snapshots : Car333TS { //←←↑↑ Redundant typing just to make sure
				:>> driver : Person333TS::snapshots [1] {
					feature thatCarSnap : Car333TS = that;
					:>> self subsets thatCarSnap.timeCoincidentOccurrences {
						:>> isLicensed = true; } } } } }

	class Person333TS {
		feature drives : Car333TS [*] = snapshots.drives;
		feature : Person333TS :>> timeSlices; // Includes snapshots
		:>> snapshots : Person333TS {
			feature isLicensed : Boolean [1];
			:>> drives : Car333TS::operated::snapshots [0..1]; } }



        /* Adding snapshot classes to resolve isLicensed, "top" classes still lives.    */

	class Car4 :> Life {
		feature allDriver : Person4Snap = operated.snapshots.driver;
		feature operated subsets timeSlices {
			:>> snapshots : Car4Snap {  //Requires drivers to be licensed only while driving
				:>> driver : Person4Snap [1] subsets self.timeCoincidentOccurrences {
					:>> isLicensed = true; } } } }

	class Car4Snap { 
		feature driver : Person4Snap [0..1] inverse of Person4Snap::drives;
		:>> portionOfLife : Car4 {  // Could startShot subsets endShot to be sure, or add SnapClass
			feature thatCarSnap : Occurrence subsets self.snapshots = that; } }

	class Person4 :> Life {
		feature allDrives : Car4Snap [*] = snapshots.drives; 
		:>> snapshots : Person4Snap {
			:>> drives : Car4Snap [0..1] subsets self.timeCoincidentOccurrences; } }

	class Person4Snap { 
		feature isLicensed : Boolean [1];
		feature drives : Car4Snap [0..1];
		:>> portionOfLife : Person4 { // Could startShot subsets endShot to be sure, or add SnapClass
			feature thatPersonSnap : Occurrence subsets self.snapshots = that; } }



        /* Snapshot classes to resolve isLicensed, top classes as timeslices,
            typing their snapshots, declare all features, snap classes specializing them.  */

	class Car5 {  
		feature driver : Person5 [*] inverse of Person5::drives = operated.snapshots.driver;
		feature : Car5 :>> timeSlices; // Includes snapshots
		feature operated subsets timeSlices {
			:>> snapshots : Car5Snap {  //Requires drivers to be licensed only while driving
				:>> driver : Person5Snap [1] subsets self.timeCoincidentOccurrences {
					:>> isLicensed = true; } } } }

	class Car5Snap :> Car5 {
		:>> portionOfLife : Car5 { // Could startShot subsets endShot to be sure, or add SnapClass
			feature thatCarSnap : Car5Snap subsets self.snapshots = that; } }

	class Person5 { 
		feature isLicensed : Boolean [1];
		feature drives : Car5 [0..1];
		feature : Person5 :>> timeSlices; // Includes snapshots
		:>> snapshots : Person5Snap {
			:>> drives : Car5Snap [0..1] subsets self.timeCoincidentOccurrences; } }

	class Person5Snap :> Person5 { 
		:>> portionOfLife : Person5 { // Could startShot subsets endShot to be sure, or add SnapClass
			feature thatPersonSnap : Person5Snap subsets self.snapshots = that; } }

}













	
					



