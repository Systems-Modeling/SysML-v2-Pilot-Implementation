package '15_02-Basic Properties with Default Values' {
    import SI::*;
    import USCustomaryUnits::*;
    import BasicGeometry::AxisPlacement3DCartesian;

    block Wheel {
        value hubDiameter: LengthValue = 18@['in'];
        value width: LengthValue = 245@[mm];
        value placement: AxisPlacement3DCartesian[0..1];
    }

    block Vehicle_1 {
        value mass: MassValue = 1200@[kg];
        value length: LengthValue = 4.82@[m];
        part leftFrontWheel : Wheel;
        part rightFrontWheel : Wheel;
    }
}
