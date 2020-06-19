package 'Action Definition Example-1' {
	part def Scene;
	part def Image;
	part def Picture;
	
	action def Focus(in scene : Scene, out image : Image);
	action def Shoot(in image: Image, out picture : Picture);	
		
	action def TakePicture(in scene : Scene, out picture : Picture) {
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