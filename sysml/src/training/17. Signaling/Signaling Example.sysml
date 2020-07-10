package 'Signaling Example' {
	part def Scene;
	part def Image;
	part def Picture;
	
	action def Focus(in scene : Scene, out image : Image);
	action def Shoot(in image : Image, out picture : Picture);
	action def TakePicture;
	
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