package '15_03-Value Expression' {
    import SI::*;
    import USCustomaryUnits::*;
    import BasicGeometry::AxisPlacement3DCartesian;

    block Vehicle_1 {
        value mass: MassValue = 1200@[kg];
        value length: LengthValue = 4.82@[m];
        part leftFrontWheel : Wheel;
        part rightFrontWheel : Wheel;
    }

    block Wheel {
    	value hubDiameter: LengthValue = 18@['in'];
        value width: LengthValue = 245@[mm];
        value placement: AxisPlacement3DCartesian[0..1];
        /**
         * This binds 'outDiameter' to the result of a computed value.
         * There is no need to mark it as "derived".
         */
        value outerDiameter: LengthValue = (hubDiameter + 2 * tire::height)@[mm];
        part tire: Tire[1];
    }
    
    block Tire {
    	value profileDepth: LengthValue = 6.0@[mm];
    	/* TODO: Change profileDepth by adding tolerance: profileDepth: LengthValue = @i{6.0 ± 0.5}@[mm]; */
    	value height: LengthValue = 45@[mm];
    }
}
