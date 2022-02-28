package TrigFunctions {
	import ScalarValues::Real;
	
	feature pi : Real;
	
	function deg(theta_rad : Real) {
		theta_rad * 180 / pi
	}
	function rad(theta_deg : Real) {
		theta_deg * pi / 180
	}
	
	datatype UnitBoundedReal :> Real {
		private x :>> self;
		inv unitBound { -1.0 <= x & x <= 1.0 }
	}
	
	function sin(theta : Real) : UnitBoundedReal;
	function cos(theta : Real) : UnitBoundedReal;
	function tan(theta : Real) : Real {
		sin(theta) / cos(theta)
	}
	function Cot(theta : Real) : Real {
		cos(theta) / sin(theta)
	}
	
	function arcsin(x : UnitBoundedReal) : Real;
	function arccos(x : UnitBoundedReal) : Real;
	function arctan(x : Real) : Real;
}