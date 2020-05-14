/**
 * International system of quantities (ISQ), as defined in ISO/IEC 80000
 */
package ISQ {
	private import ScalarValues::Real;
	private import Quantities::*;
	private import UnitsAndScales::*;	
	
	/*
	 * Definition of the seven abstract base units, one for each of the base quantities in ISO/IEC 80000
	 * 
	 * Define the following for each: abstract unit type, quantity value type, quantity value
	 */
	 
	 /**
	  * length
	  */
	value type LengthUnit :> SimpleUnit {
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			value unit: LengthUnit redefines UnitPowerFactor::unit;
		}
	}
	value type LengthValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		value mRef: LengthUnit redefines QuantityValue::mRef;
	}	
	value length: LengthValue :> quantity;
	
	 /**
	  * mass
	  */
	value type MassUnit :> SimpleUnit { 
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			value unit: MassUnit redefines UnitPowerFactor::unit;
		}
	}
	value type MassValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		value mRef: MassUnit redefines QuantityValue::mRef;
	}
	value mass: MassValue :> quantity;

	 /**
	  * time
	  */
	value type TimeUnit :> SimpleUnit { 
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			value unit: TimeUnit redefines UnitPowerFactor::unit;
		}
	}
	value type TimeValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		value mRef: TimeUnit redefines QuantityValue::mRef;
	}
	value time: TimeValue :> quantity;
	
	 /**
	  * electric current
	  */
	value type ElectricCurrentUnit :> SimpleUnit { 
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			value unit: ElectricCurrentUnit redefines UnitPowerFactor::unit;
		}
	}
	value type ElectricCurrentValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		value mRef: ElectricCurrentUnit redefines QuantityValue::mRef;
	}
	value electricCurrent: ElectricCurrentValue :> quantity;
	
	
	 /**
	  * thermodynamic temperature
	  */
	value type TemperatureUnit :> SimpleUnit {
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			value unit: TemperatureUnit redefines UnitPowerFactor::unit;
		}
	}
	value type TemperatureValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		value mRef: TemperatureUnit redefines QuantityValue::mRef;
	}
	value temperature: TemperatureValue :> quantity;
	
	 /**
	  * amount of substance
	  */
	value type AmountOfSubstanceUnit :> SimpleUnit { 
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			value unit: AmountOfSubstanceUnit redefines UnitPowerFactor::unit;
		}		
	}
	value type AmountOfSubstanceValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		value mRef: AmountOfSubstanceUnit redefines QuantityValue::mRef;
	}
	value amountOfSubstance: AmountOfSubstanceValue :> quantity;
			

	 /**
	  * luminous intensity
	  */
	value type LuminousIntensityUnit :> SimpleUnit {
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			value unit: LuminousIntensityUnit redefines UnitPowerFactor::unit;
		}
	}	
	value type LuminousIntensityValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		value mRef: LuminousIntensityUnit redefines QuantityValue::mRef;
	}
	value luminousIntensity: LuminousIntensityValue :> quantity;
	
	/*
	 * Definition of derived quantities and units
	 */
	 
	/**
	 * Define abstract super value type for all derived units in ISO/IEC 80000
	 * 
	 * An SI derived unit is always defined in terms of powers of the SI base units.
	 * As a default all unit power factor exponents are set to zero.
	 */	 
	abstract value type SIDerivedUnit :> DerivedUnit {
		value lengthPowerFactor :> MeasurementUnit::unitPowerFactor {
			value unit: LengthUnit redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
		value massPowerFactor :> MeasurementUnit::unitPowerFactor {
			value unit: MassUnit redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
		value timePowerFactor :> MeasurementUnit::unitPowerFactor {
			value unit: TimeUnit redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
		value electricCurrentPowerFactor :> MeasurementUnit::unitPowerFactor {
			value unit: ElectricCurrentUnit  redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
		value temperaturePowerFactor :> MeasurementUnit::unitPowerFactor {
			value unit: TemperatureUnit redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
		value amountOfSubstancePowerFactor :> MeasurementUnit::unitPowerFactor {
			value unit: AmountOfSubstanceUnit redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
		value luminousIntensityPowerFactor :> MeasurementUnit::unitPowerFactor {
			value unit: LuminousIntensityUnit redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
	}	 
	 
	/**
	 * force
	 */	
	value type ForceUnit :> SIDerivedUnit {
		value lengthPowerFactor redefines SIDerivedUnit::lengthPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = 1;
		}
		value massPowerFactor redefines SIDerivedUnit::massPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = 1;
		}
		value timePowerFactor redefines SIDerivedUnit::timePowerFactor {
			value exponent redefines UnitPowerFactor::exponent = -2;
		}
	}
	value type ForceValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		value mRef: ForceUnit redefines QuantityValue::mRef;
	}
	value force: ForceValue :> quantity;
	
	/**
	 * speed
	 */
	value type SpeedUnit :> SIDerivedUnit {
		value lengthPowerFactor :> SIDerivedUnit::lengthPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = 1;
		}
		value timePowerFactor :> SIDerivedUnit::timePowerFactor {
			value exponent redefines UnitPowerFactor::exponent = -1;
		}		
	}
	value type SpeedValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		value mRef: SpeedUnit redefines QuantityValue::mRef;
	}
	value speed: SpeedValue :> quantity;
	
	/**
	 * torque
	 */
	value type TorqueUnit :> SIDerivedUnit {
		value lengthPowerFactor redefines SIDerivedUnit::lengthPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = 2;
		}
		value massPowerFactor redefines SIDerivedUnit::massPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = 1;
		}
		value timePowerFactor redefines SIDerivedUnit::timePowerFactor {
			value exponent redefines UnitPowerFactor::exponent = -2;
		}
	}
	value type TorqueValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		value mRef: TorqueUnit redefines QuantityValue::mRef;
	}
	value torque: TorqueValue :> quantity;
	
	/**
	 * energy
	 */
	value type EnergyUnit :> SIDerivedUnit {
		value lengthPowerFactor redefines SIDerivedUnit::lengthPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = 2;
		}
		value massPowerFactor redefines SIDerivedUnit::massPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = 1;
		}
		value timePowerFactor redefines SIDerivedUnit::timePowerFactor {
			value exponent redefines UnitPowerFactor::exponent = -2;
		}
	}
	value type EnergyValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		value mRef: EnergyUnit redefines QuantityValue::mRef;
	}
	value energy: EnergyValue :> quantity;
	
	/*
	 * Qualified specializations of basic features, i.e. features adding more specific semantics
	 */
	 
	value kineticEnergy :> energy;
	value potentialEnergy :> energy;
	
	/**
	 * acceleration
	 */	
    value type AccelerationUnit :> SIDerivedUnit {
		value lengthPowerFactor :> SIDerivedUnit::lengthPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = 1;
		}
		value timePowerFactor :> SIDerivedUnit::timePowerFactor {
			value exponent redefines UnitPowerFactor::exponent = -2;
		}		
    }
    value type AccelerationValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
    	value mRef: AccelerationUnit redefines QuantityValue::mRef;
    }
    value acceleration: AccelerationValue :> quantity;
}