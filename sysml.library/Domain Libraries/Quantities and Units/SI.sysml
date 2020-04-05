/**
 * International System of (Measurement) Units -- Système International d'Unités (SI), as defined in ISO/IEC 80000
 */
package SI {
	import UnitsAndScales::*;
	import ISQ::*;
	import SIPrefixes::*;
	private import RationalFunctions::Rat;
	
	/*
	 * SI simple units needed before creation of base units
	 */
	part g: MassUnit = MassUnit(name => "gram");

	/*
	 * SI base units
	 */	
	part m: LengthUnit = LengthUnit(name => "metre"); // Using en-GB spelling in line with ISO 80000

	part mm: LengthUnit = LengthUnit(name => "millimetre", unitConversion => ConversionByPrefix(prefix => milli, referenceUnit => m));
	
	part kg: MassUnit = MassUnit(name => "kilogram", unitConversion => ConversionByPrefix(prefix => kilo, referenceUnit => g));

	part s: TimeUnit = TimeUnit(name => "second");

	part A: ElectricCurrentUnit = ElectricCurrentUnit(name => "ampere");
	
	part K: TemperatureUnit = TemperatureUnit(name => "kelvin") { 
		part temperatureOfWaterAtTriplePointInK = ScaleValueDefinition(num => Rat(27316, 100), description => "temperature in kelvin of pure water at the triple point");
		ref scaleValueDefinition: ScaleValueDefinition :>> MeasurementReference::scaleValueDefinition = temperatureOfWaterAtTriplePointInK; 
	}
	
	part mol: AmountOfSubstanceUnit = AmountOfSubstanceUnit(name => "mol");

	part cd: LuminousIntensityUnit = LuminousIntensityUnit(name => "candela");
	
	/*
	 * Derived units
	 */ 

	// TODO: Auto-generate a complete list of quantities and units for the ISO/IEC 80000 parts 3 to 14

	part N: ForceUnit = kg * m / s**2 {name redefines MeasurementReference::name = "newton";}
	part 'm/s': SpeedUnit = m / s {name redefines MeasurementReference::name = "metre per second";}
	part 'm/s²': AccelerationUnit = m / s**2 {name redefines MeasurementReference::name = "metre per second squared";}
	part J : EnergyUnit = N * m  {name redefines MeasurementReference::name = "joule";}
	part 'N·m': TorqueUnit = N * m {name redefines MeasurementReference::name = "newton metre";}
	
	/*
	 * Non-standard conversion based units that are accepted in SI
	 */
	part min: TimeUnit = TimeUnit(name => "minute", unitConversion => ConversionByConvention(referenceUnit => s, conversionFactor => 60));
	part h: TimeUnit = TimeUnit(name => "hour", unitConversion => ConversionByConvention(referenceUnit => min, conversionFactor => 60));
	part 'km/h': SpeedUnit = km / h {name redefines MeasurementReference::name = "kilometre per hour";}
		
	/* 
	 * Prefixed units
	 */
	part mm: LengthUnit = LengthUnit(name => "millimetre", unitConversion => ConversionByPrefix(prefix => milli, referenceUnit => m));
	part km: LengthUnit = LengthUnit(name => "kilometre", unitConversion => ConversionByPrefix(prefix => kilo, referenceUnit => m));
	part mN: ForceUnit = ForceUnit(name => "millinewton", unitConversion => ConversionByPrefix(prefix => milli, referenceUnit => N));
	part kJ: EnergyUnit = EnergyUnit(name => "kilojoule", unitConversion => ConversionByPrefix(prefix => kilo, referenceUnit => J));
	part MJ: EnergyUnit = EnergyUnit(name => "megajoule", unitConversion => ConversionByPrefix(prefix => mega, referenceUnit => J));
	part GJ: EnergyUnit = EnergyUnit(name => "gigajoule", unitConversion => ConversionByPrefix(prefix => giga, referenceUnit => J));
	
	/*
	 * degree Celsius unit for relative temperature (i.e. temperature difference) quantities
	 */
	part '°C«rel»': TemperatureUnit = TemperatureUnit(name => "degree celsius (relative)", unitConversion => ConversionByConvention(referenceUnit => K, conversionFactor => 1));
	 
	/*
	 * degree Celsius interval scale for absolute temperature quantities
	 * 
	 * The interval scale is defined with an explicit mapping to the kelvin ratio scale from which the offset between the scales can be computed.
	 */
	part '°C«abs»': IntervalScale = IntervalScale(name => "degree celsius (absolute)") {
		ref unit redefines MeasurementScale::unit = '°C«rel»';
		part temperatureWaterAtFreezingPointInC: ScaleValueDefinition = ScaleValueDefinition(
			num => 0, description => "temperature in degree Celsius of pure water at freezing point"
		);
		private part temperatureWaterAtTriplePointInC: ScaleValueDefinition = ScaleValueDefinition(
			num => Rat(1, 100), description => "temperature in degree Celsius of pure water at the triple point"
		);
		private part celsiusToKelvinScaleMapping: ScaleValueMapping = ScaleValueMapping(
			mappedScaleValue => temperatureWaterAtTriplePointInC, referenceScaleValue => K::temperatureOfWaterAtTriplePointInK
		);
		ref scaleValueDefinition: ScaleValueDefinition :>> MeasurementReference::scaleValueDefinition = {temperatureWaterAtTriplePointInC, temperatureWaterAtFreezingPointInC};
		ref scaleValueMapping redefines MeasurementScale::scaleValueMapping = celsiusToKelvinScaleMapping;
	}
	alias '°C«abs»' as '°C';
}
