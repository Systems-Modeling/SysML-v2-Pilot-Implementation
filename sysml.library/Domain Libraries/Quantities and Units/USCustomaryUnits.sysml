/**
 * US customary units defined w.r.t. SI units
 * Conversion factors are taken from NIST SP 811 Appendix B
 * See https://www.nist.gov/physical-measurement-laboratory/nist-guide-si-appendix-b
 */
package USCustomaryUnits {	
	import SI::*;
	import RationalFunctions::Rat;
	
	part ft: LengthUnit = LengthUnit(name => "foot", unitConversion => ConversionByConvention(referenceUnit => m, conversionFactor => Rat(3048, 10000)));
	part 'in': LengthUnit = LengthUnit(name => "inch", unitConversion => ConversionByConvention(referenceUnit => ft, conversionFactor => Rat(1, 12)));
    part mi: LengthUnit = LengthUnit(name => "mile", unitConversion => ConversionByConvention(referenceUnit => ft, conversionFactor => 5280 ));	

    part lb: MassUnit = MassUnit(name => "pound (avoirdupois)", unitConversion => ConversionByConvention(referenceUnit => kg, conversionFactor => Rat(4535924, 10000000)));

    part 'mi/h': SpeedUnit = mi / h { name redefines MeasurementReference::name = "mile per hour"; }
    
    part lbf: ForceUnit = ForceUnit(name => "pound-force", unitConversion => ConversionByConvention(referenceUnit => N, conversionFactor => Rat(4448222, 1000000) ));

    /*
     * Definition of an alias for mile per hour
     */
    alias 'mi/h' as mph;

	/*
	 * degree Fahrenheit unit for relative temperature (i.e. temperature difference) quantities
	 */
	part '°F«rel»': TemperatureUnit = TemperatureUnit(name => "degree fahrenheit (relative)", unitConversion => ConversionByConvention(referenceUnit => K, conversionFactor => Rat(5, 9)));
	 
	/*
	 * degree Fahrenheit interval scale for absolute temperature quantities
	 * 
	 * The interval scale is defined with an explicit mapping to the degree Celsius interval scale from which the offset between the scales can be computed.
	 */
	part '°F«abs»': IntervalScale = IntervalScale(name => "degree fahrenheit (absolute)") {
		ref unit redefines MeasurementScale::unit = '°F«rel»';
		private part temperatureWaterAtFreezingPointInF: ScaleValueDefinition = ScaleValueDefinition(
			num => 32.0, description => "temperature in degree Fahrenheit of pure water at freezing point"
		);
		private part fahrenheitToCelsiusScaleMapping: ScaleValueMapping = ScaleValueMapping(
			mappedScaleValue => temperatureWaterAtFreezingPointInF, referenceScaleValue => '°C«abs»'::temperatureWaterAtFreezingPointInC
		);
		ref scaleValueDefinition: ScaleValueDefinition :>> MeasurementReference::scaleValueDefinition = temperatureWaterAtFreezingPointInF;
		ref scaleValueMapping redefines MeasurementScale::scaleValueMapping = fahrenheitToCelsiusScaleMapping;
	}
	alias '°F«abs»' as '°F';
}