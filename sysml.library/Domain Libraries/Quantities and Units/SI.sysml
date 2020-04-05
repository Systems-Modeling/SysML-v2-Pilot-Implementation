/**
 * International System of (Measurement) Units -- Système International d'Unités (SI), as defined in ISO/IEC 80000
 */
package SI {
	import UnitsAndScales::*;
	import ISQ::*;
	import SIPrefixes::*;
	
	/*
	 * SI simple units needed before creation of base units
	 */
	part g = MassUnit(name => "gram");

	/*
	 * SI base units
	 */	
	part m = LengthUnit(name => "metre"); // Using en-GB spelling in line with ISO 80000

	part mm = LengthUnit(name => "millimetre", unitConversion => ConversionByPrefix(prefix => milli, referenceUnit => m));
	
	part kg = MassUnit(name => "kilogram", unitConversion => ConversionByPrefix(prefix => kilo, referenceUnit => g));

	part s = TimeUnit(name => "second");

	part A = ElectricCurrentUnit(name => "ampere");
	
	part temperatureInKelvinTriplePointWater = ScaleValueDefinition(magnitude => 273.16, description => "temperature in kelvin of the triple point of pure water");
	part K: TemperatureUnit = TemperatureUnit(name => "kelvin") {
		ref scaleValueDefinition: ScaleValueDefinition :> MeasurementScale::scaleValueDefinition = temperatureInKelvinTriplePointWater; 
	}
	
	part mol = AmountOfSubstanceUnit(name => "mol");

	part cd = LuminousIntensityUnit(name => "candela");
	
	/*
	 * SI derived units
	 */ 

	/*
	 * newton
	 * N: ForceUnit = Quantities::DerivedUnit({ 
	 *   Quantities::MeasurementUnitPowerFactor(kg, 1), 
	 *   Quantities::MeasurementUnitPowerFactor(m, 1), 
	 *   Quantities::MeasurementUnitPowerFactor(s, -2)
	 * });	 
	 */
	part N: ForceUnit = kg * m / s ^ 2 {name redefines MeasurementScale::name = "newton"; }
	
	part 'm/s': SpeedUnit = m / s {name redefines MeasurementScale::name = "metre per second"; }
	part J : EnergyUnit = N * m  {name redefines MeasurementScale::name = "joule"; }
	part 'N.m': TorqueUnit = N * m {name redefines MeasurementScale::name = "newton metre"; }
	
	/*
	 * Examples of other conversion based units that are accepted in SI, but not standard 
	 */
	part min = TimeUnit(name => "minute", unitConversion => ConversionByConvention(referenceUnit => s, conversionFactor => 60.0));
	part hr = TimeUnit(name => "hour", unitConversion => ConversionByConvention(referenceUnit => min, conversionFactor => 60.0));		

	/* 
	 * Prefixed units - incomplete list
	 */
	part mm = LengthUnit(name => "millimetre", unitConversion => ConversionByPrefix(prefix => milli, referenceUnit => m));
	part km = LengthUnit(name => "kilometre", unitConversion => ConversionByPrefix(prefix => kilo, referenceUnit => m));
	part mN = ForceUnit(name => "millinewton", unitConversion => ConversionByPrefix(prefix => milli, referenceUnit => N));
	part kJ = EnergyUnit(name => "kilojoule", unitConversion => ConversionByPrefix(prefix => kilo, referenceUnit => J));
	part MJ = EnergyUnit(name => "megajoule", unitConversion => ConversionByPrefix(prefix => mega, referenceUnit => J));
	part GJ = EnergyUnit(name => "gigajoule", unitConversion => ConversionByPrefix(prefix => giga, referenceUnit => J));
	
	/*
	 * Derived units - incomplete list
	 */
	part 'km/hr': SpeedUnit = km / hr;
	
	/*
	 * Interval scales - incomplete list
	 */
	 
	/*
	 * The degree celsius unit and scale
	 * 
	 * The interval scale is defined with an explicit mapping to the kelvin scale from which the offset between the scales can be computed.
	 */
	part '°C' = TemperatureUnit(name => "degree celsius", unitConversion => ConversionByConvention(referenceUnit => K, conversionFactor => 1.0));
	 
	part temperatureInCelsiusTriplePointWater = ScaleValueDefinition(magnitude => 0.01, description => "temperature in degree celsius of the triple point of pure water");
	part celsiusToKelvinScaleMapping = ScaleValueMapping(mappedScaleValue => temperatureInCelsiusTriplePointWater, referenceScaleValue => temperatureInKelvinTriplePointWater);
	part '°C scale': IntervalScale = IntervalScale(name => "degree celsius scale") {
		ref unit redefines NonRatioScale::unit = '°C';
		ref scaleValueDefinition: ScaleValueDefinition :> MeasurementScale::scaleValueDefinition = temperatureInCelsiusTriplePointWater;
		ref scaleValueMapping redefines NonRatioScale::scaleValueMapping = celsiusToKelvinScaleMapping;
	}
}
