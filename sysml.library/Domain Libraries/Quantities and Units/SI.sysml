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
	attribute g: MassUnit = MassUnit(name => "gram");

	/*
	 * SI base units
	 */	
	attribute m: LengthUnit = LengthUnit(name => "metre"); // Using en-GB spelling in line with ISO 80000

	attribute mm: LengthUnit = LengthUnit(name => "millimetre", unitConversion => ConversionByPrefix(prefix => milli, referenceUnit => m));
	
	attribute kg: MassUnit = MassUnit(name => "kilogram", unitConversion => ConversionByPrefix(prefix => kilo, referenceUnit => g));

	attribute s: TimeUnit = TimeUnit(name => "second");

	attribute A: ElectricCurrentUnit = ElectricCurrentUnit(name => "ampere");
	
	attribute K: TemperatureUnit = TemperatureUnit(name => "kelvin") { 
		attribute temperatureOfWaterAtTriplePointInK = ScaleValueDefinition(num => Rat(27316, 100), description => "temperature in kelvin of pure water at the triple point");
		attribute scaleValueDefinition: ScaleValueDefinition :>> MeasurementReference::scaleValueDefinition = temperatureOfWaterAtTriplePointInK; 
	}
	
	attribute mol: AmountOfSubstanceUnit = AmountOfSubstanceUnit(name => "mol");

	attribute cd: LuminousIntensityUnit = LuminousIntensityUnit(name => "candela");
	
	/*
	 * Derived units
	 */ 

	// TODO: Auto-generate a complete list of quantities and units for the ISO/IEC 80000 parts 3 to 14

	attribute N: ForceUnit = kg * m / s**2 {name redefines MeasurementReference::name = "newton";}
	attribute 'm/s': SpeedUnit = m / s {name redefines MeasurementReference::name = "metre per second";}
	attribute 'm/s²': AccelerationUnit = m / s**2 {name redefines MeasurementReference::name = "metre per second squared";}
	attribute J : EnergyUnit = N * m  {name redefines MeasurementReference::name = "joule";}
	attribute 'N·m': TorqueUnit = N * m {name redefines MeasurementReference::name = "newton metre";}
	
	/*
	 * Non-standard conversion based units that are accepted in SI
	 */
	attribute min: TimeUnit = TimeUnit(name => "minute", unitConversion => ConversionByConvention(referenceUnit => s, conversionFactor => 60));
	attribute h: TimeUnit = TimeUnit(name => "hour", unitConversion => ConversionByConvention(referenceUnit => min, conversionFactor => 60));
	attribute 'km/h': SpeedUnit = km / h {name redefines MeasurementReference::name = "kilometre per hour";}
		
	/* 
	 * Prefixed units
	 */
	attribute mm: LengthUnit = LengthUnit(name => "millimetre", unitConversion => ConversionByPrefix(prefix => milli, referenceUnit => m));
	attribute km: LengthUnit = LengthUnit(name => "kilometre", unitConversion => ConversionByPrefix(prefix => kilo, referenceUnit => m));
	attribute mN: ForceUnit = ForceUnit(name => "millinewton", unitConversion => ConversionByPrefix(prefix => milli, referenceUnit => N));
	attribute kJ: EnergyUnit = EnergyUnit(name => "kilojoule", unitConversion => ConversionByPrefix(prefix => kilo, referenceUnit => J));
	attribute MJ: EnergyUnit = EnergyUnit(name => "megajoule", unitConversion => ConversionByPrefix(prefix => mega, referenceUnit => J));
	attribute GJ: EnergyUnit = EnergyUnit(name => "gigajoule", unitConversion => ConversionByPrefix(prefix => giga, referenceUnit => J));
	
	/*
	 * degree Celsius unit for relative temperature (i.e. temperature difference) quantities
	 */
	attribute '°C«rel»': TemperatureUnit = TemperatureUnit(name => "degree celsius (relative)", unitConversion => ConversionByConvention(referenceUnit => K, conversionFactor => 1));
	 
	/*
	 * degree Celsius interval scale for absolute temperature quantities
	 * 
	 * The interval scale is defined with an explicit mapping to the kelvin ratio scale from which the offset between the scales can be computed.
	 */
	attribute '°C«abs»': IntervalScale = IntervalScale(name => "degree celsius (absolute)") {
		attribute unit redefines MeasurementScale::unit = '°C«rel»';
		attribute temperatureWaterAtFreezingPointInC: ScaleValueDefinition = ScaleValueDefinition(
			num => 0, description => "temperature in degree Celsius of pure water at freezing point"
		);
		private attribute temperatureWaterAtTriplePointInC: ScaleValueDefinition = ScaleValueDefinition(
			num => Rat(1, 100), description => "temperature in degree Celsius of pure water at the triple point"
		);
		private attribute celsiusToKelvinScaleMapping: ScaleValueMapping = ScaleValueMapping(
			mappedScaleValue => temperatureWaterAtTriplePointInC, referenceScaleValue => K::temperatureOfWaterAtTriplePointInK
		);
		attribute scaleValueDefinition: ScaleValueDefinition :>> MeasurementReference::scaleValueDefinition = {temperatureWaterAtTriplePointInC, temperatureWaterAtFreezingPointInC};
		attribute scaleValueMapping redefines MeasurementScale::scaleValueMapping = celsiusToKelvinScaleMapping;
	}
	alias '°C«abs»' as '°C';
}
