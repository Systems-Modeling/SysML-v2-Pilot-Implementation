/**
 * International system of quantities (ISQ), as defined in ISO/IEC 80000
 */
package ISQ {
	private import ScalarValues::Real;
	private import Quantities::*;
	private import UnitsAndScales::*;

    // ISO 80000-3 "Space and Time" 
    import ISQSpaceTime::*;
    // ISO 80000-4 "Mechanics" 
    import ISQMechanics::*;
    // ISO 80000-5 "Thermodynamics" 
    import ISQThermodynamics::*;
    // IEC 80000-6 "Electromagnetism" 
    import ISQElectromagnetism::*;
    // ISO 80000-7 "Light" 
    import ISQLight::*;
    // ISO 80000-8 "Acoustics" 
    import ISQAcoustics::*;
    // ISO 80000-9 "Physical chemistry and molecular physics" 
    import ISQChemistryMolecular::*;
    // ISO 80000-10 "Atomic and nuclear physics"
    import ISQAtomicNuclear::*;
    // ISO 80000-11 "Characteristic numbers" 
    import ISQCharacteristicNumbers::*;
	
	/*
	 * The ISQ base quantities are defined in the packages for the individual ISO/IEC 80000 parts, as follows:
     * - length in ISQSpaceTime (ISO 80000-3)
     * - mass in ISQMechanics (ISO 80000-4)
     * - time or duration in ISQSpaceTime (ISO 80000-3) - Note: ISO 80000-3:2019 defines duration as the primary name.
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
		attribute lengthPowerFactor subsets MeasurementUnit::unitPowerFactor {
			attribute redefines unit: LengthUnit;
			attribute redefines exponent = 0;
		}
		attribute massPowerFactor subsets MeasurementUnit::unitPowerFactor {
			attribute redefines unit: MassUnit;
			attribute redefines exponent = 0;
		}
		attribute timePowerFactor subsets MeasurementUnit::unitPowerFactor {
			attribute redefines unit: TimeUnit;
			attribute redefines exponent = 0;
		}
		attribute electricCurrentPowerFactor subsets MeasurementUnit::unitPowerFactor {
			attribute redefines unit: ElectricCurrentUnit;
			attribute redefines exponent = 0;
		}
		attribute temperaturePowerFactor subsets MeasurementUnit::unitPowerFactor {
			attribute redefines unit: TemperatureUnit;
			attribute redefines exponent = 0;
		}
		attribute amountOfSubstancePowerFactor subsets MeasurementUnit::unitPowerFactor {
			attribute redefines unit: AmountOfSubstanceUnit;
			attribute redefines exponent = 0;
		}
		attribute luminousIntensityPowerFactor subsets MeasurementUnit::unitPowerFactor {
			attribute redefines unit: LuminousIntensityUnit;
			attribute redefines exponent = 0;
		}
	}	 
}