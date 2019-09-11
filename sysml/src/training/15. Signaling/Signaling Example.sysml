package 'Signaling Example' {
	block Scene;
	block Image;
	block Picture;
	
	activity Focus(in scene : Scene, out image : Image);
	activity Shoot(in image : Image, out picture : Picture);
	activity TakePicture;
	
	action display;
		
	action takePicture : TakePicture {
		accept trigger (scene : Scene);
		
		then action focus : Focus (
			in scene = trigger::scene, 
			out image
		);
		
		then action shoot : Shoot (
			in image stream from focus::image, 
			out picture
		);
		
		then send shoot::picture to display;
	}
}