part def Camera {
	import PictureTaking::*;
	
	perform takePicture[*] as PictureTaking::takePicture;
	
	part focusingSubsystem {
		perform takePicture::focus;
	}
	
	part imagingSubsystem {
		perform takePicture::shoot;
	}
	
}