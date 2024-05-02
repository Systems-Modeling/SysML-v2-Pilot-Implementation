package s_friedenthal_SimpleVehicle{
    // this is a simplified version of the vehicle model
    import Definitions::*;
    package Definitions{
        import PartDefinitions::*;
        import PortDefinitions::*;
        import ItemDefinitions::*;
        import ActionDefinitions::*;
        import RequirementDefinitions::*;
        import VerificationCaseDefinitions::*;
        import AttributeDefinitions::*;
        package PartDefinitions{
            part def Vehicle{
                attribute mass :> ISQ::mass = dryMass + cargoMass + fuelMass;
                attribute dryMass:>ISQ::mass;
                attribute cargoMass:>ISQ::mass;
                attribute fuelMass:>ISQ::mass;
                //attribute position:ISQ::LengthValue;
                attribute position:>ISQ::length;
                attribute velocity:>ISQ::speed;
                attribute acceleration:>ISQ::acceleration;
                attribute avgFuelEconomy:>distancePerVolume;
                attribute electricalPower:> ISQ::power;
                port fuelCmdPort:FuelCmdPort;
                port ignitionCmdPort:IgnitionCmdPort;
                port vehicleToRoadPort:VehicleToRoadPort;
                perform action providePower;
                exhibit state vehicleStates parallel {
                    state operatingStates {
                        entry action initial;
                        state off;                                  
                        state on {
                            entry action performSelfTest;
                            do providePower;
                            exit action applyParkingBrake;
                            constraint {electricalPower<=500[W]}
                        }
                        transition initial then off;
                        transition off_To_on
                            first off
                            accept ignitionCmd:IgnitionCmd via ignitionCmdPort
                                if ignitionCmd.ignitionOnOff==IgnitionOnOff::on
                            then on;
                        transition on_To_off
                            first on
                            accept ignitionCmd:IgnitionCmd via ignitionCmdPort
                                if ignitionCmd.ignitionOnOff==IgnitionOnOff::off
                            then off;
                    }
                    state healthStates {
                        entry action initial;
                        state normal;
                        state degraded; 
                        
                        transition initial then normal;
                        transition normal_To_degraded
                            first normal
                            then degraded;
                        transition degraded_To_normal
                            first degraded
                            then normal;
                    }
                }
            }
            part def Engine{
                attribute mass:>ISQ::mass;
                attribute displacement:>ISQ::distance;
                port fuelCmdPort;
                port ignitionCmdPort:IgnitionCmdPort;
                port drivePwrPort:DrivePwrPort{
                    //out redefines torque;
                }
                //port p1_out;
            }
            part def Transmission{
                attribute mass:>ISQ::mass;
                port drivePwrPort:~DrivePwrPort{
                    //out redefines torque;
                }
                port p2_in;
                port p2_out;
                perform action amplifyTorque;
            }
            part def Cylinder{
                attribute mass:>ISQ::mass;
            }
        }
        package PortDefinitions{
            port def PwrCmdPort{
                in item pwrCmd:PwrCmd;
            }
            port def FuelCmdPort:>PwrCmdPort{
                in item fuelCmd:FuelCmd redefines pwrCmd;
            }
            port def IgnitionCmdPort{
                in item ignitionCmd:IgnitionCmd;
            }
            port def DrivePwrPort{
                out torque:Torque;
            }
            port def VehicleToRoadPort;
        }
        package ItemDefinitions{
            item def Fuel{
                attribute fuelMass:>ISQ::mass;
            }
            item def PwrCmd{
                attribute throttleLevel:Real;
            }
            item def FuelCmd:>PwrCmd;
            
            item def IgnitionCmd{
                attribute ignitionOnOff:IgnitionOnOff;
            }
        }
        package ActionDefinitions{
            action def ProvidePower {
                in item fuelCmd:FuelCmd;
                out wheelToRoadTorque:Torque[2];
            }
            action def GenerateTorque {
                in item fuelCmd:FuelCmd;
                out engineTorque:Torque;
            }
            action def AmplifyTorque {
                in engineTorque:Torque;
                out transmissionTorque:Torque;
            }
        }
        package RequirementDefinitions{
            requirement def MassRequirement{
                doc /*The actual mass shall be less than the required mass*/
                attribute massRequired:>ISQ::mass;
                attribute massActual:>ISQ::mass;
                require constraint {massActual<=massRequired}
            }
            requirement def FuelEconomyRequirement {
                doc /* The vehicle shall maintain an average fuel economomy of at least x miles per gallon for the nominal 
                driving scenario */
                //attribute actualFuelEconomy : DistancePerVolumeValue;
                //attribute requiredFuelEconomy : DistancePerVolumeValue;
                attribute actualFuelEconomy :> distancePerVolume;
                attribute requiredFuelEconomy :> distancePerVolume;
                require constraint {actualFuelEconomy >= requiredFuelEconomy}
            }
        }
        package VerificationCaseDefinitions{
            verification def MassTest;
            verification def AccelerationTest;
            verification def ReliabilityTest;
        }    
        package AttributeDefinitions{
            import ScalarValues::*;
            // Scalar Functions provides Sum expression
            import NumericalFunctions::*;
            import Quantities::*;
            import SI::*;
            //import USCustomaryUnits::*;
            alias Torque for ISQ::TorqueValue;
            attribute distancePerVolume :> scalarQuantities = distance / volume;
            attribute timePerDistance :> scalarQuantities = time / distance;
            enum def IgnitionOnOff {on; off;}
        }
    }
    package Configurations{
        package Configuration_1{
            package PartsTree{
                part vehicle_1:Vehicle{
                    attribute mass redefines mass;
                    attribute dryMass redefines dryMass = sum (partMasses);
                    attribute partMasses=(engine.mass,transmission.mass);
                    perform ActionTree::providePower redefines providePower;
                    part engine:Engine{
                        attribute mass redefines mass default 200 [kg];
                        port fuelCmdPort:>>fuelCmdPort=vehicle_1.fuelCmdPort;
                        port ignitionCmdPort:>>ignitionCmdPort=vehicle_1.ignitionCmdPort;
                        perform ActionTree::providePower.generateTorque;
                        part cylinders[6]:Cylinder;
                    }
                    part transmission:Transmission{
                        attribute mass redefines mass default 60 [kg];
                        perform action amplifyTorque:>> amplifyTorque = ActionTree::providePower.amplifyTorque;

                    }
                    connect engine.drivePwrPort to transmission.drivePwrPort;
                }
            }
            package ActionTree{
                action providePower:ProvidePower{
                    action generateTorque:GenerateTorque{
                        //in item fuelCmd :>> fuelCmd = providePower.fuelCmd;
                    }
                    action amplifyTorque:AmplifyTorque;
                    first start then generateTorque;
                    flow generateToAmplify from generateTorque.engineTorque to amplifyTorque.engineTorque;
                    //first generateTorque then amplifyTorque;
                    first amplifyTorque then done;
                    bind providePower.fuelCmd = providePower.generateTorque.fuelCmd;
                }
            }
            package Requirements{
                item marketSurvey;
                dependency from vehicleSpecification to marketSurvey;
                
                requirement vehicleSpecification{
                    subject vehicle:Vehicle;
                    requirement <'1'> vehicleMassRequirement: MassRequirement {
                        doc /* The total mass of a vehicle shall be less than or equal to the required mass.
                        Assume total mass includes a full tank of gas of 60 kg*/
                        attribute redefines massRequired=2000 [kg];                     
                        attribute redefines massActual = vehicle.dryMass + fuelMassActual;
                        attribute fuelMassActual:>ISQ::mass;
                        attribute fuelMassMax:>ISQ::mass = 60 [kg];
                        assume constraint {fuelMassActual==fuelMassMax}
                    }

                    
                    allocate vehicleMassRequirement to PartsTree::vehicle_1.mass;
                    
                    requirement <'2'> vehicleFuelEconomyRequirements{
                        doc /* fuel economy requirements group */
                        attribute assumedCargoMass:>ISQ::mass;
                        assume constraint {assumedCargoMass<=500 [kg]}                        
                        requirement <'2_1'> cityFuelEconomyRequirement:FuelEconomyRequirement{
                            redefines requiredFuelEconomy= 10 [km / L];
                        }
                        requirement <'2_2'> highwayFuelEconomyRequirement:FuelEconomyRequirement{
                            redefines requiredFuelEconomy= 12.75 [km / L];
                        }
                    }
                }
            }
        }
    }
    package FuelEconomyAnalysisModel{
        import Configurations::Configuration_1::**;
        import SampledFunctions::SampledFunction;
        
        /*
        This analysis model was provided by Hisashi Miyashita on January 27, 2021
          We use the simplest fuel consumption analysis model introduced in:
          Akcelik, R. "Fuel efficiency and other objectives in traffic system management." Traffic Engineering and Control 22.2 (1981): 54-65. 

          Fuel consumption rate f can be decomposed to:
          f = f_a + f_b * tpd_avg,
          where tpd_avg is average interrupted travel time per unit distance, actually the inverse of the average velocity [t/km];
          f_a is the best fuel consumption per distance; and
          f_b is the additional fuel consumption per distance and average travel time, which can be regarded as the idling fuel consumption.
          Approximately, it is proportional to engine displacement and it ranges from 0.5 to 0.6 [l/hour/litre of engine displacement]
          according to:
          Review of the Incidence, Energy Use and Costs of Passenger Vehicle Idling; Gordon W. Taylor, P.Eng. Prepared for the Office of Energy Efficiency, Natural Resources Canada, 2003

          We assume f_a can be approximated to
          fuel_consumption / distance = BSFC * SGG * required_power_avg * tpd_avg,
          where required_power_avg is the required power, and it can be approximately derived from:
              total_energy == P_req * tpd_avg * distance == 1/2 * mass / tpd_avg^2
          This part is computed with BestFuelConsumptionPerDistance calc def.

          BSFC means Brake-Specific Fuel Consumption, defined as gram/power.  SGG is the specific gravity of gasoline.
          The high octane gasoline is about 0.76[l/kg].
        */

        attribute def Scenario :> SampledFunction {
            attribute wayPoint[1..*] {
                attribute elapseTime[1] :> ISQ::time;
                attribute position[1] :> ISQ::distance;
            }
        }

        //calc def FuelConsumption (bestFuelConsumption: Real, idlingFuelConsumption: Real, tpd_avg: Real) : KilometersPerLitre {
        calc def FuelConsumption {
        	in bestFuelConsumption: Real;
        	in idlingFuelConsumption: Real; 
        	in tpd_avg:>timePerDistance; 
        	
            attribute f = bestFuelConsumption + idlingFuelConsumption * tpd_avg;
            return :> distancePerVolume = 1/f;
        }
        calc def AverageTravelTimePerDistance { in scenario: Scenario; return tpd_avg:>timePerDistance; }
        calc def TraveledDistance { in scenario: Scenario; return distance:> length; }
        calc def IdlingFuelConsumptionPerTime { 
        	in engine: Engine; 
            attribute idlingFuelConsumptionPerDisplacement: Real = 0.5;
            return f_a : Real = engine.displacement * idlingFuelConsumptionPerDisplacement;
        }

        attribute specificGravityOfGasoline: Real = 0.76;
        calc def BestFuelConsumptionPerDistance {
        	in mass: MassValue;
        	in bsfc: Real;
        	in tpd_avg:> timePerDistance;
        	in distance:>length;
        	
            attribute required_power_avg:> power;
            constraint {
                required_power_avg == 1/2 * mass * tpd_avg **(-3) / distance
            }
            
            return  f_b : Real = bsfc * specificGravityOfGasoline * required_power_avg * tpd_avg;
        }

        calc def ComputeBSFC { in engine: Engine; return : Real; }

        analysis fuelEconomyAnalysis  {

            subject = vehicle_1;

            in attribute scenario: Scenario;
            // define a series of waypoints

            objective fuelEconomyAnalysisObjective {
                doc /*the objective of this analysis is to determine whether the vehicle design configuration can 
                satisfy the fuel economy requirements*/
                require vehicleSpecification.vehicleFuelEconomyRequirements;
            }

            // specify vehicle_b.engine.displacement;

            attribute distance = TraveledDistance(scenario);
            attribute tpd_avg = AverageTravelTimePerDistance(scenario);
            attribute bsfc = ComputeBSFC(vehicle_1.engine);
            attribute f_a = BestFuelConsumptionPerDistance(vehicle_1.mass, bsfc, tpd_avg, distance);
            attribute f_b = IdlingFuelConsumptionPerTime(vehicle_1.engine);

            //-return attribute calculatedFuelEconomy:KilometersPerLitre=FuelConsumption(f_a, f_b, tpd_avg) ;
            return attribute calculatedFuelEconomy:>distancePerVolume=FuelConsumption(f_a, f_b, tpd_avg);
        }
    }
    package VehicleVerification{
        import Configurations::Configuration_1::**;
        // the following is a model library which contains VerfictKind
        import VerificationCases::*;
        package VerificationCases1{
            verification massTests:MassTest {
                subject = vehicle_1;
                objective {
                    verify vehicleSpecification.vehicleMassRequirement;
                }
               @ VerificationMethod{
                    kind = (VerificationMethodKind::test, VerificationMethodKind::analyze);
                }
                action weighVehicle {
                    out massMeasured:>ISQ::mass;
                }
                then action evaluatePassFail {
                    in massMeasured:>ISQ::mass;
                    out verdict = PassIf(vehicleSpecification::vehicleMassRequirement(vehicle_1));
                }
            }
        }
        package VerificationSystem{
            import VerificationCases1::*;
            part massVerificationSystem{
                perform massTests;
                part scale{
                    perform massTests.weighVehicle;
                }
                part operator{
                    perform massTests.evaluatePassFail;
                }
            }
        }
    }
}
package s_friedenthal_SimplePartsTree0{
    part part0{
        part part1;
        part par2;
    }
    action action0{
        action action1;
        action action2;
    }
    
}
package s_friedenthal_SimplePartsTree1{
    part part0{
        port port0_in;
        port port0_out;
        part part1{
            port port1_in;
            port port1_out;
        }
        part part2{
            port port2_in;
            port port2_out;        
        }
        connect part1.port1_out to part2.port2_in;
    }
    action action0{
        action action1;
        action action2;
        
        first start then action1;
        first action1 then action2;
        first action2 then done;
        
        /* the followoing does not create a sequence
        first start;
        then action1;
        then action2;
        then done;
        */
    }
}
package s_friedenthal_SimplePartsTree2{
    //import Definitions::**;
    package Definitions{
        package PartDefinitions{
            part def A{
                port p0_in;
                port p0_out;
            }
            part def B1{
                port p1_in;
                port p1_out;
            }
            part def B2{
                port p2_in;
                port p2_out;
                perform action action2;
            }
            part def C1;
            part def C2;
            part def C3;
            part def C4;
        }
        package ActionDefinitions{
            action def Action1;
            action def Action2;
        }
    }
    package Configurations{
        import Definitions::**;
        package Configuration_1{
            package PartsTree{
                part a:A{
                    perform ActionTree::action0;
                    part b1:B1{
                        port p1_in:>>p1_in=a.p0_in;
                        perform ActionTree::action0.action1;
                        part c1:C1;
                        part c2:C2;
                    }
                    part b2:B2{
                        perform action2:>> action2 = ActionTree::action0.action2;
                        part c3:C3;
                        part c4:C4;
                    }
                    connect b1.p1_out to b2.p2_in;
                }
            }
            package ActionTree{
                action action0{
                    action action1:Action1;
                    action action2:Action2;
                }
            }
        }
    }
}

