package PortionModelingBehavior {
	
	behavior TakePicture {
 		step focus [1];
  		step shoot [*];
  		succession fs first focus [1] then shoot [1];
  		:>> snapshots;  //Not domain of above features.
  	}
 
	struct Camera {
		feature focus : F [*];
 		feature shoot : S [*];
		succession fs first focus [1] then shoot [0..1];
		:>> snapshots; //Not domain of above features.
	}

	behavior F {
		in c: Camera [1];
	}
	
	behavior S {
		in c: Camera [1];
	}
}
