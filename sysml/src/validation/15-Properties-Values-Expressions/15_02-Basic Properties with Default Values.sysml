package '15_02-Basic Properties with Default Values' {
    import SI::*;
    import USCustomaryUnits::*;
    import '15_12-Compound Value Type'::CartesianAxisPlacement3D;

    block Wheel {
        value width: LengthValue = 245@[mm];
        value diameter: LengthValue = 18@['in'];
        value placement: CartesianAxisPlacement3D[0..1];
    }

    block Vehicle {
        value mass: MassValue = 1200@[kg];
        value length: LengthValue = 4.82@[m];
        part leftFrontWheel : Wheel;
        part rightFrontWheel : Wheel;
    }
}
