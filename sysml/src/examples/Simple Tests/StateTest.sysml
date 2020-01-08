package StateTest {
	value type Sig;
	
	state S {
		entry action A;
		do action B;
		exit action C;
		
		state S1;
			accept Sig
			do action D
			then S2;
		
		state S2;
		
		transition T
			first S2
			accept Sig
			do action E
			then S1;
		
	}
}