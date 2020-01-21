package '15_12-Compound Value Type' {
    import ISQ::*;

    value type CartesianLocation3D {
	value x: LengthValue;
	value y: LengthValue;
	value z: LengthValue;
    }

    // We would need constraint to give strict definitions to DirectionValue
    value type DirectionValue;

    value type CartesianDirection3D {
	value dirX: DirectionValue;
	value dirY: DirectionValue;
	value dirZ: DirectionValue;
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
