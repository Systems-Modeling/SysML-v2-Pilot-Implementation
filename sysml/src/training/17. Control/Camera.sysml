package Camera {
	import 'Action Decomposition'::*;
	
	part def Camera;
	part def FocusingSubsystem;
	part def ImagingSubsystem;
	
	part camera : Camera {
		ref view : Scene;
		part photos : Picture[*];
				
		part autoFocus {
			ref in view : Scene = camera::view;		
			ref out realImage : Image;
		}
		
		flow autoFocus::realImage to imager::focusedImage;
		
		part imager {
			ref in focusedImage : Image;		
			ref out photo : Picture :> photos;
		}
		
	}
}
