package StateTest {
	value type Sig;
	
	action act;
	
	state S {
		entry action A;
		do action B;
		exit act;
		
		transition T
			first S2
			accept Sig
			if true
			do send Sig() to S
			then S1;
		
		state S1;
			accept Sig
			do action D
			then S2;
		
		state S2;
		
	}
}