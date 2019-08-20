/**
 * International system of quantities (ISQ), as defined in ISO/IEC 80000
 */
package ISQ {
	import ScalarFunctions::*;
	import ScalarValues::Real;
	import Quantities::*;
	import UnitsAndScales::*;
	
	
	/*
	 * Definition of the seven abstract base units, one for each of the base quantities in ISO/IEC 80000
	 * 
	 * Define the following for each: abstract unit type, quantity value type, quantity value
	 */
	 
	 /*
	  * length
	  */
	block LengthUnit :> SimpleUnit {
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: LengthUnit redefines UnitPowerFactor::unit;
		}
	}
	value type LengthValue :> QuantityValue {
		value magnitude: Real redefines QuantityValue::magnitude;
		ref scale: LengthUnit redefines QuantityValue::scale;
	}	
	value length: LengthValue[1..1] :> quantity;
	
	 /*
	  * mass
	  */
	block MassUnit :> SimpleUnit { 
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: MassUnit redefines UnitPowerFactor::unit;
		}
	}
	value type MassValue :> QuantityValue {
		value magnitude: Real redefines QuantityValue::magnitude;
		ref scale: MassUnit redefines QuantityValue::scale;
	}
	value mass: MassValue :> quantity;

	 /*
	  * time
	  */
	block TimeUnit :> SimpleUnit { 
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: TimeUnit redefines UnitPowerFactor::unit;
		}
	}
	value type TimeValue :> QuantityValue {
		value magnitude: Real redefines QuantityValue::magnitude;
		ref scale: TimeUnit redefines QuantityValue::scale;
	}
	value time: TimeValue :> quantity;
	
	 /*
	  * electric current
	  */
	block ElectricCurrentUnit :> SimpleUnit { 
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: ElectricCurrentUnit redefines UnitPowerFactor::unit;
		}
	}
	value type ElectricCurrentValue :> QuantityValue {
		value magnitude: Real redefines QuantityValue::magnitude;
		ref scale: ElectricCurrentUnit redefines QuantityValue::scale;
	}
	value electricCurrent: ElectricCurrentValue :> quantity;
	
	
	 /*
	  * thermodynamic temperature
	  */
	block TemperatureUnit :> SimpleUnit {
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: TemperatureUnit redefines UnitPowerFactor::unit;
		}
	}
	value type TemperatureValue :> QuantityValue {
		value magnitude: Real redefines QuantityValue::magnitude;
		ref scale: TemperatureUnit redefines QuantityValue::scale;
	}
	value temperature: TemperatureValue :> quantity;
	
	 /*
	  * amount of substance
	  */
	block AmountOfSubstanceUnit :> SimpleUnit { 
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: AmountOfSubstanceUnit redefines UnitPowerFactor::unit;
		}		
	}
	value type AmountOfSubstanceValue :> QuantityValue {
		value magnitude: Real redefines QuantityValue::magnitude;
		ref scale: AmountOfSubstanceUnit redefines QuantityValue::scale;
	}
	value amountOfSubstance: AmountOfSubstanceValue :> quantity;
			

	 /*
	  * luminous intensity
	  */
	block LuminousIntensityUnit :> SimpleUnit {
		value unitPowerFactor redefines SimpleUnit::unitPowerFactor {
			ref unit: LuminousIntensityUnit redefines UnitPowerFactor::unit;
		}
	}	
	value type LuminousIntensityValue :> QuantityValue {
		value magnitude: Real redefines QuantityValue::magnitude;
		ref scale: LuminousIntensityUnit redefines QuantityValue::scale;
	}
	value luminousIntensity: LuminousIntensityValue :> quantity;
	
	/*
	 * Definition of derived quantities and units
	 */
	 
	/*
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
	 
	/*
	 * Explicit definition of "unit of dimension one" also known as "dimensionless unit"
	 */
	block UnitOfDimensionOne :> DerivedUnit {
		value name: ScalarValues::String redefines MeasurementScale::name = "unit of dimension one";
	}
	
	/*
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
		value magnitude: Real redefines QuantityValue::magnitude;
		ref scale: ForceUnit redefines QuantityValue::scale;
	}
	value force: ForceValue :> quantity;
	
	/*
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
		value magnitude: Real redefines QuantityValue::magnitude;
		ref scale: SpeedUnit redefines QuantityValue::scale;
	}
	value speed: SpeedValue :> quantity;
	
	/*
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
		value magnitude: Real redefines QuantityValue::magnitude;
		ref scale: TorqueUnit redefines QuantityValue::scale;
	}
	value torque: TorqueValue :> quantity;
	
	/*
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
		value magnitude: Real redefines QuantityValue::magnitude;
		ref scale: EnergyUnit redefines QuantityValue::scale;
	}
	value energy: EnergyValue :> quantity;
	
	/*
	 * Qualified specializations of basic features, i.e. features adding more specific semantics
	 */
	value kineticEnergy :> energy;
	value potentialEnergy :> energy;
}