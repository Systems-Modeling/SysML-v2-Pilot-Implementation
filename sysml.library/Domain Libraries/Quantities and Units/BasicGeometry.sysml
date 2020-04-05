package BasicGeometry {
    import SI::*;
    import RealFunctions::*;

    /**
     * Component of Cartesian direction vector with value in interval [-1:1]
     */
    value type DirectionValue :> DimensionOneValue {
    	assert constraint { num >= -1 & num <= 1 }
    }

    value type CoordinateValue :> LengthValue;

    value type Location3DCartesian {
        value x: CoordinateValue;
        value y: CoordinateValue;
        value z: CoordinateValue;
    }

    value type Direction3DCartesian {
        value xDir: DirectionValue;
        value yDir: DirectionValue;
        value zDir: DirectionValue;
        assert constraint { xDir**2 + yDir**2 + zDir**2 == 1 }
    }

    value type AxisPlacement3DCartesian {
        value location: Location3DCartesian;
        value zAxisDir: Direction3DCartesian;
        value xAxisDir: Direction3DCartesian;
    }
}