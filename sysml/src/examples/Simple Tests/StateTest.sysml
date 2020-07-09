package StateTest {
	attribute def Sig;
	attribute def Exit;
	
	part p;
	
	action act;
	
	state def S {
		entry action A; then S1;
		do action B;
		exit act;
		
		state S1;
			accept Sig
			do action D
			then S2;
		
		state S2;
		accept Exit then done;
		
		transition T
			first S2
			accept Sig
			if true
			do send Sig() to p
			then S1;		
	}
}