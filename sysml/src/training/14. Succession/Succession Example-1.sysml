package 'Succession Example-1' {
	block Scene;
	block Image;
	block Picture;
	
	activity Focus(in scene : Scene, out image : Image);
	activity Shoot(in image: Image, out picture : Picture);	
	activity TakePicture(in scene : Scene, out picture : Picture);
		
	action takePicture : TakePicture (in scene, out picture) {
		action focus: Focus (
			in scene = takePicture::scene, 
			out image
		);
		
		succession focus then shoot;
		
		action shoot: Shoot (
			in image stream from focus::image, 
			out picture = takePicture::picture
		);
	}
	
}