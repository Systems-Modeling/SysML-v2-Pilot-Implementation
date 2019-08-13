block Camera {
	
	action takePicture[*] := PictureTaking::takePicture;
	
	part focusingSubsystem {
		perform takePicture::focus;
	}
	
	part imagingSubsystem {
		perform takePicture::shoot;
	}
	
}