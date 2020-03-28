block Camera {
	
	perform takePicture[*] as PictureTaking::takePicture;
	
	part focusingSubsystem {
		perform takePicture::focus;
	}
	
	part imagingSubsystem {
		perform takePicture::shoot;
	}
	
}