package Vehicle {
    block Vehicle {
        value cylinders: ScalarValues::Integer = 3;
        value mass: Real = 1000.1;
    }

    part vehicle_1 : Vehicle {
        value cylinders :>> Vehicle::cylinders = 4;
        value mass :>> Vehicle::mass = 1.1;
    }

    part vehicle_1a :> vehicle_1 {
        value cylinders :>> vehicle_1::cylinders = 6;
        value mass :>> vehicle_1::mass = 2.1;

        part experiment {
            value cylinders: Integer = 1;
        }
    }
}
