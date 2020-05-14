/**
 * International System of (Measurement) Units -- Système International d'Unités (SI), as defined in ISO/IEC 80000
 */
package SI {
	private import RationalFunctions::Rat;
	private import UnitsAndScales::*;
	import ISQ::*;
	import SIPrefixes::*;
	
	/*
	 * SI simple units needed before creation of base units
	 */
	value g: MassUnit = MassUnit(name => "gram");

	/*
	 * SI base units
	 */	
	value m: LengthUnit = LengthUnit(name => "metre"); // Using en-GB spelling in line with ISO 80000

	value mm: LengthUnit = LengthUnit(name => "millimetre", unitConversion => ConversionByPrefix(prefix => milli, referenceUnit => m));
	
	value kg: MassUnit = MassUnit(name => "kilogram", unitConversion => ConversionByPrefix(prefix => kilo, referenceUnit => g));

	value s: TimeUnit = TimeUnit(name => "second");

	value A: ElectricCurrentUnit = ElectricCurrentUnit(name => "ampere");
	
	value K: TemperatureUnit = TemperatureUnit(name => "kelvin") { 
		value temperatureOfWaterAtTriplePointInK = ScaleValueDefinition(num => Rat(27316, 100), description => "temperature in kelvin of pure water at the triple point");
		value scaleValueDefinition: ScaleValueDefinition :>> MeasurementReference::scaleValueDefinition = temperatureOfWaterAtTriplePointInK; 
	}
	
	value mol: AmountOfSubstanceUnit = AmountOfSubstanceUnit(name => "mol");

	value cd: LuminousIntensityUnit = LuminousIntensityUnit(name => "candela");
	
	/*
	 * Derived units
	 */ 

	// TODO: Auto-generate a complete list of quantities and units for the ISO/IEC 80000 parts 3 to 14

	value N: ForceUnit = kg * m / s**2 {name redefines MeasurementReference::name = "newton";}
	value 'm/s': SpeedUnit = m / s {name redefines MeasurementReference::name = "metre per second";}
	value 'm/s²': AccelerationUnit = m / s**2 {name redefines MeasurementReference::name = "metre per second squared";}
	value J : EnergyUnit = N * m  {name redefines MeasurementReference::name = "joule";}
	value 'N·m': TorqueUnit = N * m {name redefines MeasurementReference::name = "newton metre";}
	
	/*
	 * Non-standard conversion based units that are accepted in SI
	 */
	value min: TimeUnit = TimeUnit(name => "minute", unitConversion => ConversionByConvention(referenceUnit => s, conversionFactor => 60));
	value h: TimeUnit = TimeUnit(name => "hour", unitConversion => ConversionByConvention(referenceUnit => min, conversionFactor => 60));
	value 'km/h': SpeedUnit = km / h {name redefines MeasurementReference::name = "kilometre per hour";}
		
	/* 
	 * Prefixed units
	 */
	value mm: LengthUnit = LengthUnit(name => "millimetre", unitConversion => ConversionByPrefix(prefix => milli, referenceUnit => m));
	value km: LengthUnit = LengthUnit(name => "kilometre", unitConversion => ConversionByPrefix(prefix => kilo, referenceUnit => m));
	value mN: ForceUnit = ForceUnit(name => "millinewton", unitConversion => ConversionByPrefix(prefix => milli, referenceUnit => N));
	value kJ: EnergyUnit = EnergyUnit(name => "kilojoule", unitConversion => ConversionByPrefix(prefix => kilo, referenceUnit => J));
	value MJ: EnergyUnit = EnergyUnit(name => "megajoule", unitConversion => ConversionByPrefix(prefix => mega, referenceUnit => J));
	value GJ: EnergyUnit = EnergyUnit(name => "gigajoule", unitConversion => ConversionByPrefix(prefix => giga, referenceUnit => J));
	
	/*
	 * degree Celsius unit for relative temperature (i.e. temperature difference) quantities
	 */
	value '°C«rel»': TemperatureUnit = TemperatureUnit(name => "degree celsius (relative)", unitConversion => ConversionByConvention(referenceUnit => K, conversionFactor => 1));
	 
	/*
	 * degree Celsius interval scale for absolute temperature quantities
	 * 
	 * The interval scale is defined with an explicit mapping to the kelvin ratio scale from which the offset between the scales can be computed.
	 */
	value '°C«abs»': IntervalScale = IntervalScale(name => "degree celsius (absolute)") {
		value unit redefines MeasurementScale::unit = '°C«rel»';
		value temperatureWaterAtFreezingPointInC: ScaleValueDefinition = ScaleValueDefinition(
			num => 0, description => "temperature in degree Celsius of pure water at freezing point"
		);
		private value temperatureWaterAtTriplePointInC: ScaleValueDefinition = ScaleValueDefinition(
			num => Rat(1, 100), description => "temperature in degree Celsius of pure water at the triple point"
		);
		private value celsiusToKelvinScaleMapping: ScaleValueMapping = ScaleValueMapping(
			mappedScaleValue => temperatureWaterAtTriplePointInC, referenceScaleValue => K::temperatureOfWaterAtTriplePointInK
		);
		value scaleValueDefinition: ScaleValueDefinition :>> MeasurementReference::scaleValueDefinition = {temperatureWaterAtTriplePointInC, temperatureWaterAtFreezingPointInC};
		value scaleValueMapping redefines MeasurementScale::scaleValueMapping = celsiusToKelvinScaleMapping;
	}
	alias '°C«abs»' as '°C';
}
