package Camera {
	import 'Action Decomposition'::*;
	
	part def Camera;
	part def FocusingSubsystem;
	part def ImagingSubsystem;
	
	part camera : Camera {
		ref 'view' : Scene;
		part photos : Picture[*];
				
		part autoFocus {
			in ref 'view' : Scene = camera::'view';		
			out ref realImage : Image;
		}
		
		flow autoFocus::realImage to imager::focusedImage;
		
		part imager {
			in ref focusedImage : Image;		
			out ref photo : Picture :> photos;
		}
		
	}
}
