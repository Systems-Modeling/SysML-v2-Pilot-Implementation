package 'Activity Example-1' {
	block Scene;
	block Image;
	block Picture;
	
	activity Focus(in scene : Scene, out image : Image);
	activity Shoot(in image: Image, out picture : Picture);	
		
	activity TakePicture(in scene : Scene, out picture : Picture) {
		action focus: Focus (
			in scene = TakePicture::scene, 
			out image
		);
		
		action shoot: Shoot (
			in image flow from focus::image, 
			out picture = TakePicture::picture
		);
	}
	
}