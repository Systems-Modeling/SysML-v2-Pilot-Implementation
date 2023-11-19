package PortionModelingCarDriver {
	
	import Occurrences::Occurrence;
	import ScalarValues::Boolean;

	class Car1 {  //implied specialization of Life
		feature driver : Person [*];
		feature operated subsets timeSlices {
			:>> snapshots {
				:>> driver [1] {  //Requires drivers to be licensed their whole lives
					:>> isLicensed = true; } } } }
				
	class Person {//implied specialization of Life
		feature isLicensed : Boolean [*];
		:>> snapshots {
			:>> isLicensed [1]; } }
			
	class Car2 {  //implied specialization of Life
		feature driver : Person [*];
		feature operated subsets timeSlices {
			:>> snapshots {
				:>> driver [1] {  //Requires drivers to be licensed while driving
					feature thatsn : Occurrence = that;
					feature driverNow [1] subsets snapshots, thatsn.timeCoincidentOccurrences {
						:>> isLicensed = true; } } } } }
			
}