/**
 * International system of quantities (ISQ), as defined in ISO/IEC 80000
 */
package ISQ {
	private import ScalarValues::Real;
	private import Quantities::*;
	private import UnitsAndScales::*;

    // Temporary import from generated package
    import ISO_80000_03_SpaceAndTime::LengthUnit, LengthValue, length, TimeUnit, TimeValue, time, AccelerationUnit, AccelerationValue, acceleration;
	
	/*
	 * Definition of the seven abstract base units, one for each of the base quantities in ISO/IEC 80000
	 * 
	 * Define the following for each: abstract unit type, quantity attribute def, quantity value
	 */
	 
	 /**
	  * length
	  */
	// attribute def LengthUnit :> SimpleUnit {
	// 	attribute unitPowerFactor redefines SimpleUnit::unitPowerFactor {
	// 		attribute unit: LengthUnit redefines UnitPowerFactor::unit;
	// 	}
	// }
	// attribute def LengthValue :> QuantityValue {
	// 	attribute num: Real redefines QuantityValue::num;
	// 	attribute mRef: LengthUnit redefines QuantityValue::mRef;
	// }	
	// attribute length: LengthValue :> quantity;
	
	 /**
	  * mass
	  */
	attribute def MassUnit :> SimpleUnit { 
		attribute unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			attribute unit: MassUnit redefines UnitPowerFactor::unit;
		}
	}
	attribute def MassValue :> QuantityValue {
		attribute num: Real redefines QuantityValue::num;
		attribute mRef: MassUnit redefines QuantityValue::mRef;
	}
	attribute mass: MassValue :> quantity;

	 /**
	  * time
	  */
	// attribute def TimeUnit :> SimpleUnit { 
	// 	attribute unitPowerFactor redefines SimpleUnit::unitPowerFactor {
	// 		attribute unit: TimeUnit redefines UnitPowerFactor::unit;
	// 	}
	// }
	// attribute def TimeValue :> QuantityValue {
	// 	attribute num: Real redefines QuantityValue::num;
	// 	attribute mRef: TimeUnit redefines QuantityValue::mRef;
	// }
	// attribute time: TimeValue :> quantity;
	
	 /**
	  * electric current
	  */
	attribute def ElectricCurrentUnit :> SimpleUnit { 
		attribute unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			attribute unit: ElectricCurrentUnit redefines UnitPowerFactor::unit;
		}
	}
	attribute def ElectricCurrentValue :> QuantityValue {
		attribute num: Real redefines QuantityValue::num;
		attribute mRef: ElectricCurrentUnit redefines QuantityValue::mRef;
	}
	attribute electricCurrent: ElectricCurrentValue :> quantity;
	
	
	 /**
	  * thermodynamic temperature
	  */
	attribute def TemperatureUnit :> SimpleUnit {
		attribute unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			attribute unit: TemperatureUnit redefines UnitPowerFactor::unit;
		}
	}
	attribute def TemperatureValue :> QuantityValue {
		attribute num: Real redefines QuantityValue::num;
		attribute mRef: TemperatureUnit redefines QuantityValue::mRef;
	}
	attribute temperature: TemperatureValue :> quantity;
	
	 /**
	  * amount of substance
	  */
	attribute def AmountOfSubstanceUnit :> SimpleUnit { 
		attribute unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			attribute unit: AmountOfSubstanceUnit redefines UnitPowerFactor::unit;
		}		
	}
	attribute def AmountOfSubstanceValue :> QuantityValue {
		attribute num: Real redefines QuantityValue::num;
		attribute mRef: AmountOfSubstanceUnit redefines QuantityValue::mRef;
	}
	attribute amountOfSubstance: AmountOfSubstanceValue :> quantity;
			

	 /**
	  * luminous intensity
	  */
	attribute def LuminousIntensityUnit :> SimpleUnit {
		attribute unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			attribute unit: LuminousIntensityUnit redefines UnitPowerFactor::unit;
		}
	}	
	attribute def LuminousIntensityValue :> QuantityValue {
		attribute num: Real redefines QuantityValue::num;
		attribute mRef: LuminousIntensityUnit redefines QuantityValue::mRef;
	}
	attribute luminousIntensity: LuminousIntensityValue :> quantity;
	
	/*
	 * Definition of derived quantities and units
	 */
	 
	/**
	 * Define abstract super attribute def for all derived units in ISO/IEC 80000
	 * 
	 * An SI derived unit is always defined in terms of powers of the SI base units.
	 * As a default all unit power factor exponents are set to zero.
	 */	 
	abstract attribute def SIDerivedUnit :> DerivedUnit {
		attribute lengthPowerFactor :> MeasurementUnit::unitPowerFactor {
			attribute unit: LengthUnit redefines UnitPowerFactor::unit;
			attribute exponent redefines UnitPowerFactor::exponent = 0;
		}
		attribute massPowerFactor :> MeasurementUnit::unitPowerFactor {
			attribute unit: MassUnit redefines UnitPowerFactor::unit;
			attribute exponent redefines UnitPowerFactor::exponent = 0;
		}
		attribute timePowerFactor :> MeasurementUnit::unitPowerFactor {
			attribute unit: TimeUnit redefines UnitPowerFactor::unit;
			attribute exponent redefines UnitPowerFactor::exponent = 0;
		}
		attribute electricCurrentPowerFactor :> MeasurementUnit::unitPowerFactor {
			attribute unit: ElectricCurrentUnit  redefines UnitPowerFactor::unit;
			attribute exponent redefines UnitPowerFactor::exponent = 0;
		}
		attribute temperaturePowerFactor :> MeasurementUnit::unitPowerFactor {
			attribute unit: TemperatureUnit redefines UnitPowerFactor::unit;
			attribute exponent redefines UnitPowerFactor::exponent = 0;
		}
		attribute amountOfSubstancePowerFactor :> MeasurementUnit::unitPowerFactor {
			attribute unit: AmountOfSubstanceUnit redefines UnitPowerFactor::unit;
			attribute exponent redefines UnitPowerFactor::exponent = 0;
		}
		attribute luminousIntensityPowerFactor :> MeasurementUnit::unitPowerFactor {
			attribute unit: LuminousIntensityUnit redefines UnitPowerFactor::unit;
			attribute exponent redefines UnitPowerFactor::exponent = 0;
		}
	}	 
	 
	/**
	 * force
	 */	
	attribute def ForceUnit :> SIDerivedUnit {
		attribute lengthPowerFactor redefines SIDerivedUnit::lengthPowerFactor {
			attribute exponent redefines UnitPowerFactor::exponent = 1;
		}
		attribute massPowerFactor redefines SIDerivedUnit::massPowerFactor {
			attribute exponent redefines UnitPowerFactor::exponent = 1;
		}
		attribute timePowerFactor redefines SIDerivedUnit::timePowerFactor {
			attribute exponent redefines UnitPowerFactor::exponent = -2;
		}
	}
	attribute def ForceValue :> QuantityValue {
		attribute num: Real redefines QuantityValue::num;
		attribute mRef: ForceUnit redefines QuantityValue::mRef;
	}
	attribute force: ForceValue :> quantity;
	
	/**
	 * speed
	 */
	attribute def SpeedUnit :> SIDerivedUnit {
		attribute lengthPowerFactor :> SIDerivedUnit::lengthPowerFactor {
			attribute exponent redefines UnitPowerFactor::exponent = 1;
		}
		attribute timePowerFactor :> SIDerivedUnit::timePowerFactor {
			attribute exponent redefines UnitPowerFactor::exponent = -1;
		}		
	}
	attribute def SpeedValue :> QuantityValue {
		attribute num: Real redefines QuantityValue::num;
		attribute mRef: SpeedUnit redefines QuantityValue::mRef;
	}
	attribute speed: SpeedValue :> quantity;
	
	/**
	 * torque
	 */
	attribute def TorqueUnit :> SIDerivedUnit {
		attribute lengthPowerFactor redefines SIDerivedUnit::lengthPowerFactor {
			attribute exponent redefines UnitPowerFactor::exponent = 2;
		}
		attribute massPowerFactor redefines SIDerivedUnit::massPowerFactor {
			attribute exponent redefines UnitPowerFactor::exponent = 1;
		}
		attribute timePowerFactor redefines SIDerivedUnit::timePowerFactor {
			attribute exponent redefines UnitPowerFactor::exponent = -2;
		}
	}
	attribute def TorqueValue :> QuantityValue {
		attribute num: Real redefines QuantityValue::num;
		attribute mRef: TorqueUnit redefines QuantityValue::mRef;
	}
	attribute torque: TorqueValue :> quantity;
	
	/**
	 * energy
	 */
	attribute def EnergyUnit :> SIDerivedUnit {
		attribute lengthPowerFactor redefines SIDerivedUnit::lengthPowerFactor {
			attribute exponent redefines UnitPowerFactor::exponent = 2;
		}
		attribute massPowerFactor redefines SIDerivedUnit::massPowerFactor {
			attribute exponent redefines UnitPowerFactor::exponent = 1;
		}
		attribute timePowerFactor redefines SIDerivedUnit::timePowerFactor {
			attribute exponent redefines UnitPowerFactor::exponent = -2;
		}
	}
	attribute def EnergyValue :> QuantityValue {
		attribute num: Real redefines QuantityValue::num;
		attribute mRef: EnergyUnit redefines QuantityValue::mRef;
	}
	attribute energy: EnergyValue :> quantity;
	
	/*
	 * Qualified specializations of basic features, i.e. features adding more specific semantics
	 */
	 
	attribute kineticEnergy :> energy;
	attribute potentialEnergy :> energy;
	
	/**
	 * acceleration
	 */	
    // attribute def AccelerationUnit :> SIDerivedUnit {
	// 	attribute lengthPowerFactor :> SIDerivedUnit::lengthPowerFactor {
	// 		attribute exponent redefines UnitPowerFactor::exponent = 1;
	// 	}
	// 	attribute timePowerFactor :> SIDerivedUnit::timePowerFactor {
	// 		attribute exponent redefines UnitPowerFactor::exponent = -2;
	// 	}		
    // }
    // attribute def AccelerationValue :> QuantityValue {
	// 	attribute num: Real redefines QuantityValue::num;
    // 	attribute mRef: AccelerationUnit redefines QuantityValue::mRef;
    // }
    // attribute acceleration: AccelerationValue :> quantity;
}