package '15_12-Compound Value Type' {
    import ISQ::*;
    import RealFunctions::Sqrt;
    import '15_01-Constants'::'Mathematical Constants'::pi;

    value type CartesianLocation3D {
		value x: LengthValue;
		value y: LengthValue;
		value z: LengthValue;
    }

	/* Is this supposed to be a QuantityValue? */
    value type DirectionValue :> Real;

    value type CartesianDirection3D {
		value dirX: DirectionValue;
		value dirY: DirectionValue;
		value dirZ: DirectionValue;
		
		assert constraint { Sqrt(dirX**2 + dirY**2 + dirZ**2) == 1.0 }
    }

    /* 
       Axis placement is modeled after the ISO 10303 (STEP) standard
       way of defining numerically stable coordinate
       transformations. The corresponding STEP concept is
       AxisPlacement3D.
     */
    value type CartesianAxisPlacement3D {
		value location: CartesianLocation3D;
		value dirZAxis: CartesianDirection3D;
		value dirXAxis: CartesianDirection3D;
    }
}
