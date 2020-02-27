package Conjugation {
	class A {
		feature in f;
	}
	
	class B conjugates A;
	
	feature g ~ B::f;
}