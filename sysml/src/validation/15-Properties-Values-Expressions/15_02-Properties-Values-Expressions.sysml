package '15_02-Properties-Values-Expressions' {
    import SI::*;
    import USCustomaryUnits::*;

    block Wheel {
        value width: LengthValue[1] = 245@[mm];
        value diameter: LengthValue[1] = 18@[in];
        value placement: CartesianAxisPlacement3D[0..1];
    }

    block Vehicle {
        value mass: MassValue[1] = 1200@[kg];
        value length: LengthValue[1] = 4.82@[m];
        part leftFrontWheel : Wheel;
        part rightFrontWheel : Wheel;
    }
}
