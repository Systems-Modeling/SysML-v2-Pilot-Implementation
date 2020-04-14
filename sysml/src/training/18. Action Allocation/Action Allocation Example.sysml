package 'Action Allocation Example' {
	import 'Action Decomposition'::*;
	
	block Camera;
	block AutoFocus;
	block Imager;
	
	part camera : Camera {
		ref views : Scene[*] ordered = takePhoto::scene;
		ref photos : Picture[*] ordered = takePhoto::picture;
		
		perform takePhoto[*] ordered 
			as takePicture (in scene, out picture);
		
		part f : AutoFocus {
			perform takePhoto::focus;			
		}
		
		part i : Imager {
			perform takePhoto::shoot;
		}		
	}
}
