//* XPECT_SETUP org.omg.sysml.xpect.tests.expression.SysMLTests
        ResourceSet {
                ThisFile {}
                File {from ="/library.kernel/Base.kerml"}
                File {from ="/library.kernel/Links.kerml"}
                File {from ="/library.kernel/Occurrences.kerml"}
                File {from ="/library.kernel/Objects.kerml"}
                File {from ="/library.kernel/Performances.kerml"}
                File {from ="/library.kernel/ScalarValues.kerml"}
                File {from ="/library.kernel/BaseFunctions.kerml"}
                File {from ="/library.kernel/DataFunctions.kerml"}
                File {from ="/library.kernel/ControlFunctions.kerml"}
                File {from ="/library.systems/Items.sysml"}
                File {from ="/library.systems/Parts.sysml"}
                File {from ="/src/Vehicle.sysml"}
        }
        Workspace {
                JavaProject {
                        SrcFolder {
                                ThisFile {}
                                File {from ="/library.kernel/Base.kerml"}
                                File {from ="/library.kernel/Links.kerml"}
                                File {from ="/library.kernel/Occurrences.kerml"}
                 				File {from ="/library.kernel/Objects.kerml"}
                				File {from ="/library.kernel/Performances.kerml"}
                                File {from ="/library.kernel/ScalarValues.kerml"}
                                File {from ="/library.kernel/BaseFunctions.kerml"}
                                File {from ="/library.kernel/DataFunctions.kerml"}
                				File {from ="/library.kernel/ControlFunctions.kerml"}
                				File {from ="/library.systems/Items.sysml"}
                				File {from ="/library.systems/Parts.sysml"}
                                File {from ="/src/Vehicle.sysml"}
                        }
                }
        }
END_SETUP
*/

// XPECT noErrors ---> ""
package P {
    public import ScalarValues::*;
    public import Vehicle::*;

    attribute v1_cylinders: Integer = vehicle_1.cylinders;

    attribute v1_mass: Real = vehicle_1.mass;

    attribute v2_mass: Real = vehicle_1a.mass;
    
    part vehicle4cyl: Vehicle = (vehicle_1, vehicle_1a).{in ref v:Vehicle; v.cylinders == 4};

    part vehicles[*]: Vehicle = (all Vehicle).{in ref v:Vehicle; v.mass > 100};
}
