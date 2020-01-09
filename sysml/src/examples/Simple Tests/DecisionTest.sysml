activity DecisionTest {
	value x = 1;
	
	decide 'test x';
	if x == 1 then A1; 
	if x > 1 then A2;
	else A3; 
	
	then decide; 
	if true then A1; 
	if false then A2;
	
	action A1;
	action A2;
	action A3;
}