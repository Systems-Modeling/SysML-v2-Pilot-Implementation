package Expressions {
	import BaseFunctions::ToString;
	
	a: ScalarValues::Integer;
	x = ToString(a * a + 3 == 4); 
	y = NumericalFunctions::'+'(1,2);
	z = a & true ^ x | false;
	
	b = x > y? x-y: y-x;
	c = x->collect xx (xx + 1); 
	d = x->while q (q > 3) r (r - 1)->reduce s t (s + t)->reduce ScalarFunctions::'+';
	
	function w(initial) result specializes ControlFunctions::while {
		expr condition(v) redefines ControlFunctions::while::condition {v > 3}
		expr body(u) redefines ControlFunctions::while::body {u - 1}
	}
	
	xx = x == 1 && y == 2? a:
	     x == 2? b:
	     x == 3? c:
	     0;
    
    function TotalMass(partMass, subparts) {
		partMass + (subparts->collect p (totalMass(partMass, subparts))->reduce ScalarFunctions::'+' ?? 0.0)
	}
	
	expr totalMass: TotalMass (mass, sub);
}