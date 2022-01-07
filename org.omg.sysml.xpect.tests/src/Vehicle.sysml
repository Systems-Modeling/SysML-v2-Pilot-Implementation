package Vehicle {
    part def Vehicle {
        attribute cylinders: ScalarValues::Integer = 3;
        attribute mass: ScalarValues::Real = 1000.1;
    }

    part vehicle_1 : Vehicle {
        attribute cylinders :>> Vehicle::cylinders = 4;
        attribute mass :>> Vehicle::mass = 1.1;
    }

    part vehicle_1a :> vehicle_1 {
        attribute cylinders :>> vehicle_1::cylinders = 6;
        attribute mass :>> vehicle_1::mass = 2.1;

        part experiment {
            attribute cylinders: Integer = 1;
        }
    }
}
