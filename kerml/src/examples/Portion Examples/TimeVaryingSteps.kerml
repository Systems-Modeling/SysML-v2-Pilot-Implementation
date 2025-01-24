package TimeVaryingSteps {
	behavior TakePicture {
 		// var step merge : MergePerformance [0..1];
 		member step merge : ControlPerformances::MergePerformance [0..1] featured by TakePicture_snapshots {
 			member feature TakePicture_snapshots :>> Occurrences::Occurrence::snapshots featured by TakePicture {
 				public import merge;
 			}
 		}
 		
		// var step focus [0..1];
 		member step focus [0..1] featured by TakePicture_snapshots {
 			member feature TakePicture_snapshots :>> Occurrences::Occurrence::snapshots featured by TakePicture {
 				public import focus;
 			}
 		}
 		
 		// var step shoot [0..1];
 		member step shoot [0..1] featured by TakePicture_snapshots {
 			member feature TakePicture_snapshots :>> Occurrences::Occurrence::snapshots featured by TakePicture {
 				public import shoot;
 			}
 		}
 		
 		// var step decide : DecisionPerformance [0..1];
 		member step decide : ControlPerformances::DecisionPerformance [0..1] featured by TakePicture_snapshots {
 			member feature TakePicture_snapshots :>> Occurrences::Occurrence::snapshots featured by TakePicture {
 				public import decide;
 			}
 		}
 		
 		succession first startShot [0..1] then merge::TakePicture_snapshots.merge [1];
 		succession first merge::TakePicture_snapshots.merge [1] then focus::TakePicture_snapshots.focus [1];
  		succession first focus::TakePicture_snapshots.focus [1] then shoot::TakePicture_snapshots.shoot [1];
  		succession first shoot::TakePicture_snapshots.shoot [1] then decide::TakePicture_snapshots.decide [1];
  		succession first decide::TakePicture_snapshots.decide [0..1] then merge::TakePicture_snapshots.merge [0..1];
  		succession first decide::TakePicture_snapshots.decide [1] then endShot [0..1];
  	}
	
	struct Camera {
		// Is always taking a picture, one at a time.
		// var step takePic : TakePicture [1];		
		member step takePic : TakePicture [1] featured by Camera_snapshots {
 			member feature Camera_snapshots :>> Occurrences::Occurrence::snapshots featured by Camera;
		}
	}

	struct MultiCamera {
		// Can take many pictures at one time.
		// var step takePics : TakePicture [0..*];		
		member step takePics : TakePicture [0..*] featured by Camera_snapshots {
 			member feature Camera_snapshots :>> Occurrences::Occurrence::snapshots featured by Camera;
		}
	}

}