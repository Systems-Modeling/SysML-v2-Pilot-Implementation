
package SequencesModelToBeExecuted {
	
	import Links::*;

	behavior Manufacture {
		step paint : Paint [1];
		step dry : Dry [*];
		succession p_before_d first paint [1] then dry [1];
		step ship : Ship [*];
		succession d_before_s first dry [1] then ship [1];
	}
	behavior Paint;
	behavior Dry;
	behavior Ship;
}

package SequencesExecution {
	
	import Atoms::*;
	import SequencesModelToBeExecuted::*;
	import Occurrences::Occurrence;
	import Occurrences::HappensBefore;

	#atom
	behavior MyPaint :> Paint;
	#atom
	behavior MyDry :> Dry;

	#atom
	assoc MyPaint_Before_Dry_Link :> HappensBefore {
		end :>> earlierOccurrence : MyPaint;
		end :>> laterOccurrence : MyDry;
	}

	behavior MyManufactureStepsPD unions MyPaint, MyDry;

	#atom
	behavior MyShip :> Ship;

	#atom
	assoc MyDry_Before_Ship_Link :> HappensBefore {
		end :>> earlierOccurrence : MyDry;
		end :>> laterOccurrence : MyShip;
	}

	behavior MyManufactureStepsPDS unions MyManufactureStepsPD, MyShip;

	#atom
	behavior MyManufacture :> Manufacture {
		:>> timeEnclosedOccurrences : MyManufactureStepsPDS [3];
		step :>> paint : MyPaint;
		step :>> dry : MyDry [1];
		succession :>> p_before_d : MyPaint_Before_Dry_Link [1] first paint then dry;
		step :>> ship : MyShip [1];
		succession :>> d_before_s : MyDry_Before_Ship_Link [1] first dry then ship;
	}
}