/**
 * International system of quantities (ISQ), as defined in ISO/IEC 80000
 */
package ISQ {
	import ScalarValues::Real;
	import Quantities::*;
	import UnitsAndScales::*;	
	
	/*
	 * Definition of the seven abstract base units, one for each of the base quantities in ISO/IEC 80000
	 * 
	 * Define the following for each: abstract unit type, quantity value type, quantity value
	 */
	 
	 /**
	  * length
	  */
	block LengthUnit :> SimpleUnit {
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: LengthUnit redefines UnitPowerFactor::unit;
		}
	}
	value type LengthValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		ref mRef: LengthUnit redefines QuantityValue::mRef;
	}	
	value length: LengthValue :> quantity;
	
	 /**
	  * mass
	  */
	block MassUnit :> SimpleUnit { 
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: MassUnit redefines UnitPowerFactor::unit;
		}
	}
	value type MassValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		ref mRef: MassUnit redefines QuantityValue::mRef;
	}
	value mass: MassValue :> quantity;

	 /**
	  * time
	  */
	block TimeUnit :> SimpleUnit { 
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: TimeUnit redefines UnitPowerFactor::unit;
		}
	}
	value type TimeValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		ref mRef: TimeUnit redefines QuantityValue::mRef;
	}
	value time: TimeValue :> quantity;
	
	 /**
	  * electric current
	  */
	block ElectricCurrentUnit :> SimpleUnit { 
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: ElectricCurrentUnit redefines UnitPowerFactor::unit;
		}
	}
	value type ElectricCurrentValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		ref mRef: ElectricCurrentUnit redefines QuantityValue::mRef;
	}
	value electricCurrent: ElectricCurrentValue :> quantity;
	
	
	 /**
	  * thermodynamic temperature
	  */
	block TemperatureUnit :> SimpleUnit {
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: TemperatureUnit redefines UnitPowerFactor::unit;
		}
	}
	value type TemperatureValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		ref mRef: TemperatureUnit redefines QuantityValue::mRef;
	}
	value temperature: TemperatureValue :> quantity;
	
	 /**
	  * amount of substance
	  */
	block AmountOfSubstanceUnit :> SimpleUnit { 
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: AmountOfSubstanceUnit redefines UnitPowerFactor::unit;
		}		
	}
	value type AmountOfSubstanceValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		ref mRef: AmountOfSubstanceUnit redefines QuantityValue::mRef;
	}
	value amountOfSubstance: AmountOfSubstanceValue :> quantity;
			

	 /**
	  * luminous intensity
	  */
	block LuminousIntensityUnit :> SimpleUnit {
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: LuminousIntensityUnit redefines UnitPowerFactor::unit;
		}
	}	
	value type LuminousIntensityValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		ref mRef: LuminousIntensityUnit redefines QuantityValue::mRef;
	}
	value luminousIntensity: LuminousIntensityValue :> quantity;
	
	/*
	 * Definition of derived quantities and units
	 */
	 
	/**
	 * Define abstract super block for all derived units in ISO/IEC 80000
	 * 
	 * An SI derived unit is always defined in terms of powers of the SI base units.
	 * As a default all unit power factor exponents are set to zero.
	 */	 
	abstract block SIDerivedUnit :> DerivedUnit {
		value lengthPowerFactor :> MeasurementUnit::unitPowerFactor {
			ref unit: LengthUnit redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
		value massPowerFactor :> MeasurementUnit::unitPowerFactor {
			ref unit: MassUnit redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
		value timePowerFactor :> MeasurementUnit::unitPowerFactor {
			ref unit: TimeUnit redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
		value electricCurrentPowerFactor :> MeasurementUnit::unitPowerFactor {
			ref unit: ElectricCurrentUnit  redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
		value temperaturePowerFactor :> MeasurementUnit::unitPowerFactor {
			ref unit: TemperatureUnit redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
		value amountOfSubstancePowerFactor :> MeasurementUnit::unitPowerFactor {
			ref unit: AmountOfSubstanceUnit redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
		value luminousIntensityPowerFactor :> MeasurementUnit::unitPowerFactor {
			ref unit: LuminousIntensityUnit redefines UnitPowerFactor::unit;
			value exponent redefines UnitPowerFactor::exponent = 0;
		}
	}	 
	 
	/**
	 * force
	 */	
	block ForceUnit :> SIDerivedUnit {
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
		ref mRef: ForceUnit redefines QuantityValue::mRef;
	}
	value force: ForceValue :> quantity;
	
	/**
	 * speed
	 */
	block SpeedUnit :> SIDerivedUnit {
		value lengthPowerFactor :> SIDerivedUnit::lengthPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = 1;
		}
		value timePowerFactor :> SIDerivedUnit::timePowerFactor {
			value exponent redefines UnitPowerFactor::exponent = -1;
		}		
	}
	value type SpeedValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
		ref mRef: SpeedUnit redefines QuantityValue::mRef;
	}
	value speed: SpeedValue :> quantity;
	
	/**
	 * torque
	 */
	block TorqueUnit :> SIDerivedUnit {
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
		ref mRef: TorqueUnit redefines QuantityValue::mRef;
	}
	value torque: TorqueValue :> quantity;
	
	/**
	 * energy
	 */
	block EnergyUnit :> SIDerivedUnit {
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
		ref mRef: EnergyUnit redefines QuantityValue::mRef;
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
    block AccelerationUnit :> SIDerivedUnit {
		value lengthPowerFactor :> SIDerivedUnit::lengthPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = 1;
		}
		value timePowerFactor :> SIDerivedUnit::timePowerFactor {
			value exponent redefines UnitPowerFactor::exponent = -2;
		}		
    }
    value type AccelerationValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
    	ref mRef: AccelerationUnit redefines QuantityValue::mRef;
    }
    value acceleration: AccelerationValue :> quantity;
}