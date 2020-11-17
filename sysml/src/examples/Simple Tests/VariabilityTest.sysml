package VariabilityTest {
	part def P;
	part def Q :> P;
	variation part def V :> P {
		variant part a : Q;
	}
	part q : Q;
	variation part v : P {
		variant part b :> q;
	}
}