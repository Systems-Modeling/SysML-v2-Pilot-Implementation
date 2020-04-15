package 'Action Decomposition' {
	block Scene;
	block Image;
	block Picture;
	
	activity Focus(in scene : Scene, out image : Image);
	activity Shoot(in image : Image, out picture : Picture);	
	activity TakePicture(in scene : Scene, out picture : Picture);
		
	action takePicture : TakePicture (in scene, out picture) {
		action focus : Focus (
			in scene = takePicture::scene, 
			out image
		);
		
		action shoot : Shoot (
			in image flow from focus::image, 
			out picture = takePicture::picture
		);
	}
	
}