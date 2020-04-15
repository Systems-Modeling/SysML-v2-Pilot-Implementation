package BasicGeometry {
    import SI::*;
    import RealFunctions::*;

    /**
     * Component of Cartesian direction vector with value in interval [-1:1]
     */
    value type DirectionValue :> DimensionOneValue {
    	assert constraint { num >= -1.0 & num <= 1.0 }
    }

    value type CoordinateValue :> LengthValue;

    value type Location3DCartesian {
        value x: CoordinateValue[1];
        value y: CoordinateValue[1];
        value z: CoordinateValue[1];
    }

    value type Direction3DCartesian {
        value xDir: DirectionValue[1];
        value yDir: DirectionValue[1];
        value zDir: DirectionValue[1];
        assert constraint { xDir**2 + yDir**2 + zDir**2 == 1.0 }
    }

    value type AxisPlacement3DCartesian {
        value location: Location3DCartesian[1];
        value zAxisDir: Direction3DCartesian[1];
        value xAxisDir: Direction3DCartesian[1];
    }
}