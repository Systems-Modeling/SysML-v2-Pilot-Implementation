/**
 * International system of quantities (ISQ), as defined in ISO/IEC 80000
 */
package ISQ {
	private import ScalarValues::Real;
	private import Quantities::*;
	private import UnitsAndScales::*;
    import ISQSpaceTime::*;
    import ISQMechanics::*;
    import ISQThermodynamics::*;
    import ISQElectromagnetism::*;
    import ISQLight::*;
    import ISQChemistryMolecular::*;
    import ISQAtomicNuclear::*;
	
	/*
	 * Base units are defined in the ISQ packaged, one for each of the seven base quantities in ISO/IEC 80000
	 * - length in ISQSpaceTime (ISO 80000-3)
     * - mass in ISQMechanics (ISO 80000-4)
     * - duration or time in ISQSpaceTime (ISO 80000-3)
     * - electric current in ISQElectromagnetism (IEC 80000-6)
     * - thermodynamic temperature in ISQThermodynamics (ISO 80000-5)
     * - amount of substance in ISQChemistryMolecular (ISO 80000-9)
     * - luminous intensity in ISQLight (ISO 80000-7)
	 */
	 
	/**
	 * Define abstract super attribute def for all derived units in ISO/IEC 80000
	 * 
	 * An SI derived unit is always defined in terms of powers of the SI base units.
	 * As a default, the exponents of all unit power factors are set to zero,
     * effectively making the default equivalent to a DimensionOneUnit.
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
}