package ViewTest {
	package P;
	
	part def S;
	
	concern def C {
		stakeholder s : S;
	}
	
	concern c : C {
		stakeholder s1;
	}
	
	viewpoint def VP {
		frame c;
	}
	
	rendering def R;
	
	rendering r : R;
	
	view def V {
		viewpoint vp: VP {
			frame concern c1;
			concern c2;
		}
		rendering r1: R[0..1]; 
		
		view v: V[0..*] {
			expose P::*;
			render r;
		}
	}

}