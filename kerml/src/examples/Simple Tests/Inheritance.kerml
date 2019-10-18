package Inheritance {
	class A {
		feature f;
	}
	
	class B specializes A {
		
	}
	
	feature x is B::f;
	
	feature y: A {
		feature g redefines f;
	}
	
	feature z is y::f;
	
	feature w subsets y;
	
	feature u is w::g;
	
	feature yy: y;
}