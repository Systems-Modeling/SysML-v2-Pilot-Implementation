package 'AnnexA.3.8.2' {

	import Atoms::*;
	import Links::*;
	import Performances::*;
	import StatePerformances::*;
	import ControlPerformances::*;
	import Occurrences::*;
	
	// From the previous 3.8.1 section
	behavior Admit;
	behavior Ship;
	
	// ** User Model **
	package user_model {
		/* Imagine a "factory" that requires multiple repeated steps to ship successfully. */
		behavior FactoryCycle {
			step admit : Admit [1];
			/* The "merge" provides a way to target a step to create a loop that repeats successions. */
			step merge : MergePerformance [*];
			step paint : Paint [1..*];
			step dry : Dry [1..*];
			/* Rather than a trivial infinite loop, create an exit condition as a "decision". */
			step decideWhetherToExit : DecisionPerformance [1..*];
			/* If there is ever a decision to exit the loop, it will occur only once here. */
			/* For more information on decisions and guards, see A3.9 */
			step ship : Ship [1];

			succession a_before_merge first admit [0..1] then merge [1];
			succession merge_before_paint first merge [1] then paint [1];
			succession paint_before_dry first paint [1] then dry [1];
			succession dry_before_decide first dry [1] then decideWhetherToExit [1];
			succession decide_before_exit [1..*] first decideWhetherToExit [1] then ship [0..1];
			succession decide_before_loop [1..*] first decideWhetherToExit [0..1] then merge [0..1];
			
			/* Timing constraints. */
			/* Decision and merge timing constraints. */
			feature decideHBLinks : HappensBefore [*] unions decide_before_exit, decide_before_loop;
			connector bindDecideHBL : SelfLink
				from decideHBLinks [1] to decideWhetherToExit.outgoingHBLink [1];
			
			feature mergeHBLinks : HappensBefore [*] unions a_before_merge, decide_before_loop;
			connector bindMergeHBL : SelfLink
				from mergeHBLinks [1] to merge.incomingHBLink [1];
		}
		
		behavior Paint;
		behavior Dry;
	}
	
	package executed {
		import user_model::*;
				
		#atom behavior Admit1 :> Admit;
		
		// Note - We do not "assign" the atom for the incoming HappensBefore link for the Merge.
		// Instead, to show the sequence of execution, that will be bound as part of the 
		// ExampleTwoLoopCycle behavior trace below. Here we declare the atom for referencw.
		#atom behavior Merge1 :> MergePerformance;
		
		#atom assoc Admit1_to_Merge1 :> HappensBefore{
			end :>> earlierOccurrence : Admit1;
			end :>> laterOccurrence : Merge1;
		}
		
		#atom behavior Paint1 :> Paint;
		#atom assoc Merge1_to_Paint1 :> HappensBefore{
			end :>> earlierOccurrence : Merge1;
			end :>> laterOccurrence : Paint1;
		}
		
		
		#atom behavior Dry1 :> Dry;
		#atom assoc Paint1_to_Dry1 :> HappensBefore{
			end :>> earlierOccurrence : Paint1;
			end :>> laterOccurrence : Dry1;
		}
		
		#atom behavior Decide1 :> DecisionPerformance;
		
		#atom assoc Dry1_to_Decide1 :> HappensBefore{
			end :>> earlierOccurrence : Dry1;
			end :>> laterOccurrence : Decide1;
		}
		
		#atom behavior Merge2 :> MergePerformance;
		
		#atom assoc Decide1_to_Merge2 :> HappensBefore{
			end :>> earlierOccurrence : Decide1;
			end :>> laterOccurrence : Merge2;
		}
		
		#atom behavior Paint2 :> Paint;
		#atom assoc Merge2_to_Paint2 :> HappensBefore{
			end :>> earlierOccurrence : Merge2;
			end :>> laterOccurrence : Paint2;
		}
		
		#atom behavior Dry2 :> Dry;
		#atom assoc Paint2_to_Dry2 :> HappensBefore{
			end :>> earlierOccurrence : Paint2;
			end :>> laterOccurrence : Dry2;
		}
		
		#atom behavior Decide2 :> DecisionPerformance;
		
		
		#atom assoc Dry2_to_Decide2 :> HappensBefore{
			end :>> earlierOccurrence : Dry2;
			end :>> laterOccurrence : Decide2;
		}
		
		#atom behavior Ship1 :> Ship;
		#atom assoc Decide2_to_Ship1 :> HappensBefore{
			end :>> earlierOccurrence : Decide2;
			end :>> laterOccurrence : Ship1;
		}
		
		behavior Decisions unions Decide1, Decide2;
		behavior Dries unions Dry1, Dry2;
		behavior Merges unions Merge1, Merge2;
		behavior Paints unions Paint1, Paint2;
		
		assoc Merge_HB_Links :> HappensBefore unions Admit1_to_Merge1, Decide1_to_Merge2;
		assoc Decisions_HB_Links :> HappensBefore unions Decide1_to_Merge2, Decide2_to_Ship1;
		
		#atom
		assoc BindMerge1HBL specializes SelfLink {
			end :>> thisThing : Admit1_to_Merge1;
			end :>> sameThing : Admit1_to_Merge1;
		}
		
		#atom
		assoc BindMerge2HBL specializes SelfLink {
			end :>> thisThing : Decide1_to_Merge2;
			end :>> sameThing : Decide1_to_Merge2;
		}
		
		#atom
		assoc BindDecide1HBL specializes SelfLink {
			end :>> thisThing : Decide1_to_Merge2;
			end :>> sameThing : Decide1_to_Merge2;
		}
		
		#atom
		assoc BindDecide2HBL specializes SelfLink {
			end :>> thisThing : Decide2_to_Ship1;
			end :>> sameThing : Decide2_to_Ship1;
		}
		
		#atom 
		behavior ExampleTwoLoopCycle :> FactoryCycle{
			:>> merge : Merges [2] unions merge1, merge2;
			:>> paint : Paints [2] unions paint1, paint2;
			:>> dry : Dries [2] unions dry1, dry2;
			:>> decideWhetherToExit : Decisions [2] unions decide1, decide2;
			
			step :>> admit : Admit1 [1];
		
			succession admit_to_merge1 :> a_before_merge : Admit1_to_Merge1 [1] first admit [1] then merge1 [1];
		
			step merge1 : Merge1 [1];
		
			succession merge1_to_paint1 :> merge_before_paint : Merge1_to_Paint1 [1] first admit [1] then merge1 [1];
			step paint1 : Paint1 :> paint [1];
			succession paint1_to_dry1 :> paint_before_dry : Paint1_to_Dry1 [1] first paint1 [1] then dry1 [1];
			step dry1 : Dry1 :> dry [1];
			succession dry1_to_decide1 :> dry_before_decide : Dry1_to_Decide1 [1] first dry1 [1] then decide1 [1];
			step decide1 : Decide1 :> decideWhetherToExit [1];
		
			// Note that in the user model, the multiplicities are [0..1], but here we've resolved them to [1] in the subset.
			// Note there is no succession from "admit" to "merge2"! It isn't in the subset.
			succession decide1_to_merge2 :> decide_before_loop : Decide1_to_Merge2 [1] 
				first decide1 [1] then merge2 [1];
		
			step merge2 : Merge2 :> merge [1];
			
			succession merge2_to_paint2 :> merge_before_paint : Merge2_to_Paint2 [1] first merge2 [1] then paint2 [1];
			step paint2 : Paint2 :> paint [1];
			succession paint2_to_dry2 :> paint_before_dry : Paint2_to_Dry2 [1] first paint2 [1] then dry2 [1];
			step dry2 : Dry2 :> dry [1];
			succession dry2_to_decide2 :> dry_before_decide : Dry2_to_Decide2 [1] first dry2 [1] then decide2 [1];
			step decide2 : Decide2 :> decideWhetherToExit [1];
			succession decide2_to_ship1 :> decide_before_exit : Decide2_to_Ship1 [1] first decide2 [1] then ship [1];
			step :>> ship : Ship1 [1];
		
			:>> mergeHBLinks : Merge_HB_Links [2] unions merge1HBLink, merge2HBLink;
			feature merge1HBLink : Admit1_to_Merge1;
			feature merge2HBLink : Decide1_to_Merge2;
		
			:>> bindMergeHBL [2] unions merge1HBL, merge2HBL;			
			connector merge1HBL :> bindMergeHBL : BindMerge1HBL 
				from merge1HBLink [1] to merge1.incomingHBLink [1];
			connector merge2HBL :> bindMergeHBL : BindMerge2HBL 
				from merge2HBLink [1] to merge2.incomingHBLink [1];
			
			:>> decideHBLinks : Decisions_HB_Links [2] unions decide1HBLink, decide2HBLink;
			feature decide1HBLink : Decide1_to_Merge2;
			feature decide2HBLink : Decide2_to_Ship1;
			
			:>> bindDecideHBL [2] unions decide1HBL, decide2HBL;
			connector decide1HBL :> bindDecideHBL : BindDecide1HBL 
				from decide1HBLink [1] to decide1.outgoingHBLink [1];
			connector decide2HBL :> bindDecideHBL : BindDecide2HBL 
				from decide2HBLink [1] to decide2.outgoingHBLink [1];
		}
	}
}