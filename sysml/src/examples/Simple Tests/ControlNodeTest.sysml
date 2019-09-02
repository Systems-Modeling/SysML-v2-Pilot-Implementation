activity ControlNodeTest {
	action A1;
	action A2;
	
	succession A1 then J;
	succession A2 then J;
	
	join J;
	then fork F;
	
	succession F then B1;
	succession F then B2;
	
	action B1;
	action B2;
}