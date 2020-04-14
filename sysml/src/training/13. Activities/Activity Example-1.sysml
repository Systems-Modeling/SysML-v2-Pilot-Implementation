package 'Activity Example-1' {
	block Scene;
	block Image;
	block Picture;
	
	activity Focus(in scene : Scene, out image : Image);
	activity Shoot(in image: Image, out picture : Picture);	
		
	activity TakePicture(in scene : Scene, out picture : Picture) {
		bind focus::scene = scene;
		
		action focus: Focus (in scene, out image);
		
		flow focus::image to shoot::image;
		
		action shoot: Shoot (in image, out picture);
		
		bind shoot::picture = picture;
	}
	
}