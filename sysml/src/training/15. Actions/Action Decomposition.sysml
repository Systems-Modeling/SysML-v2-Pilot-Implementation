package 'Action Decomposition' {
	part def Scene;
	part def Image;
	part def Picture;
	
	action def Focus(in scene : Scene, out image : Image);
	action def Shoot(in image : Image, out picture : Picture);	
	action def TakePicture(in scene : Scene, out picture : Picture);
		
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