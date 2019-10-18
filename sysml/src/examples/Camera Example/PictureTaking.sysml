package PictureTaking {
	block Exposure;
	
	activity Focus(out xrsl: Exposure);
	activity Shoot(in xsf: Exposure);	
		
	action takePicture() {		
		action focus: Focus[1] (out xrsl);	
		action shoot: Shoot[1] (in xsf flow from focus::xrsl);
	}
}