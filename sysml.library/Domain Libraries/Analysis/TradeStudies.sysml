package TradeStudies {
	import Base::Anything;
	import ScalarValues::*;
	import ScalarFunctions::*;
	
	calc def ObjectiveFunction(alternative : Anything) result : ScalarValue[1];
	
	abstract requirement def TradeStudyObjective {
		subject selectedAlternative : Anything;
		in ref alternatives : Anything[1..*];
		in calc fn : ObjectiveFunction;
		out attribute best : ScalarValue;
				
		require constraint { fn(selectedAlternative) == best }
	}
		
	requirement def MinimizeObjective :> TradeStudyObjective {
		out attribute :>> best = alternatives->minimize x (fn(x));
	}
	
	requirement def MaximizeObjective :> TradeStudyObjective {
		out attribute :>> best = alternatives->maximize x (fn(x));
	}
	
	analysis def TradeStudy {
		subject studyAlternatives : Anything[1..*];
		calc objectiveFunction : ObjectiveFunction;
		
		objective tradeStudyObjective : TradeStudyObjective {
			in ref :>> alternatives = studyAlternatives;
			in calc :>> fn = objectiveFunction;
		}
		
		return ref selectedAlternative = studyAlternatives->selectOne a (objectiveFunction(a))[1];
	}
	
}