package PortionModelingCarDriver {
	
	import Occurrences::Occurrence;
	import ScalarValues::Boolean;

        /* Reverse chronological */

        /*   */

	class Car4 {  //implied specialization of Life
		feature operated subsets timeSlices {
			:>> snapshots : Car4Snap {  //Requires drivers to be licensed only while driving
				:>> driver : Person4Snap [1] subsets self.timeCoincidentOccurrences {
					:>> isLicensed = true; } } } }

	class Car4Snap { 
		feature driver : Person4Snap [0..1] inverse of Person4Snap::drives;
		:>> portionOfLife : Car4 {
			feature thatCarSnap : Occurrence subsets self.snapshots = that; } }

	class Person4 { //implied specialization of Life
		:>> snapshots : Person4Snap {
			:>> drives : Car4Snap [0..1] subsets self.timeCoincidentOccurrences; }}

	class Person4Snap { 
		feature isLicensed : Boolean [1];
		feature drives : Car4Snap [0..1];
		:>> portionOfLife : Person4 {
			feature thatPersonSnap : Occurrence subsets self.snapshots = that; } }



        /*   */

	class Car3 {  //implied specialization of Life
		feature driver : Occurrence [*];
		feature operated subsets timeSlices {
			:>> snapshots {
				:>> driver : Occurrence [1] {    
					:>> portionOfLife : Person3 { // "Types" driver
						feature thatDriverSnap : Occurrence subsets self.snapshots = that; }
					feature thatCarSnap : Occurrence = that;
					:>> self subsets snapshots, thatCarSnap.timeCoincidentOccurrences {
						:>> isLicensed = true; } } } } }

	class Person3 {  //implied specialization of Life
		feature isLicensed : Boolean [*];
		:>> snapshots {
			feature isLicensed : Boolean [1];
			feature drives : Occurrence [0..1] {
	 			:>> portionOfLife : Car3 {  // "Types" drives
					feature thatCarSnap : Occurrence subsets self.snapshots = that; } } } }


        /*   */

	class Car2 {  //implied specialization of Life
		feature driver : Person1 [*];
		feature operated subsets timeSlices {
			:>> snapshots {
				:>> driver [1] {  // Requires drivers to be licensed while driving
					feature thatCarSnap : Occurrence = that;
					feature driverNow [1] subsets snapshots, thatCarSnap.timeCoincidentOccurrences {

						:>> isLicensed = true; } } } } }

        /*   */

	class Car1 {  //implied specialization of Life
		feature driver : Person1 [*];
		feature operated subsets timeSlices {
			:>> snapshots {
				:>> driver [1] {  // Requires drivers to be licensed their whole lives
					:>> isLicensed = true; } } } }
				
	class Person1 {  //implied specialization of Life
		feature isLicensed : Boolean [*];
		:>> snapshots {
			:>> isLicensed [1]; } }
}