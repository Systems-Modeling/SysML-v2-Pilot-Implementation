block Camera {
	
	perform takePicture[*] by PictureTaking::takePicture;
	
	part focusingSubsystem {
		perform takePicture::focus;
	}
	
	part imagingSubsystem {
		perform takePicture::shoot;
	}
	
}