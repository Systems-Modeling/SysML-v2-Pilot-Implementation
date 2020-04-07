package '15_12-Compound Value Type' {
    import ISQ::*;
    import BasicGeometry::*;
    
    /* Note: DirectionValue, LocationCartesian3D, Direction3DCartesian and AxisPlacement3DCartesian
     * are defined in BasicGeometry.
     */

    /**
     * Vehicle with placements of the front left and right wheel assemblies w.r.t the vehicle coordinate frame.
     * 
     * The datum coordinate frame of the vehicle is defined by its origin in the center of the bottomplate, 
     * its +z-axis in the upward direction and its +x-axis in the forward direction,
     * while its +y-axis complements a right-handed Cartesian coordinate frame, i.e. points to the lefthand side.
     */
    block Vehicle {
        value mass: MassValue = 1200@[kg];
        value length: LengthValue = 4820@[mm];
        value width: LengthValue = 1820@[mm];
        part leftFrontWheelAssy : WheelAssy {
        	value placement :>> WheelAssy::placement = AxisPlacement3DCartesian(
        		location => Location3DCartesian(x => 1420@[mm], y => 640@[mm], z => 180@[mm]),
        		zAxisDir => Direction3DCartesian(xDir => 0, yDir => 1, zDir => 0),
        		xAxisDir => Direction3DCartesian(xDir => 1, yDir => 0, zDir => 0)
        	);
        }
        part rightFrontWheelAssy : WheelAssy {
        	value placement :>> WheelAssy::placement = AxisPlacement3DCartesian(
        		location => Location3DCartesian(x => 1420@[mm], y => -640@[mm], z => 180@[mm]),
        		zAxisDir => Direction3DCartesian(xDir => 0, yDir => -1, zDir => 0),
        		xAxisDir => Direction3DCartesian(xDir => -1, yDir => 0, zDir => 0)
        	);
        }
    }

    block WheelAssy {
    	value diameter: LengthValue = 540@[mm];
        value width: LengthValue = 305@[mm];
        value placement: AxisPlacement3DCartesian[0..1];
    }
}
