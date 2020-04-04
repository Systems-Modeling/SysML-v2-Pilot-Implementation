/**
 * US customary units defined w.r.t. SI units
 * Conversion factors are taken from NIST SP 811 Appendix B
 * See https://www.nist.gov/physical-measurement-laboratory/nist-guide-si-appendix-b
 */
package USCustomaryUnits {	
	import SI::*;
	
	 
	part ft = LengthUnit(name => "foot", unitConversion => ConversionByConvention(referenceUnit => m, conversionFactor => 0.3048));
	part 'in' = LengthUnit(name => "inch", unitConversion => ConversionByConvention(referenceUnit => ft, conversionFactor => 1.0/12.0));
    part mi = LengthUnit(name => "mile", unitConversion => ConversionByConvention(referenceUnit => ft, conversionFactor => 5280.0 ));	

    part lb = MassUnit(name => "pound (avoirdupois)", unitConversion => ConversionByConvention(referenceUnit => kg, conversionFactor => 0.4535924 ));

    part 'mi/h': SpeedUnit = mi / h { name redefines MeasurementReference::name = "mile per hour"; }
    
    part lbf = ForceUnit(name => "pound-force", unitConversion => ConversionByConvention(referenceUnit => N, conversionFactor => 4.448222 ));

    /*
     * Definition of an alias for mile per hour
     */
    alias 'mi/h' as mph;

	/*
	 * degree Fahrenheit unit for relative temperature (i.e. temperature difference) quantities
	 */
	part '°F«rel»' = TemperatureUnit(name => "degree fahrenheit (relative)", unitConversion => ConversionByConvention(referenceUnit => K, conversionFactor => 5.0/9.0));
	 
	/*
	 * degree Fahrenheit interval scale for absolute temperature quantities
	 * 
	 * The interval scale is defined with an explicit mapping to the celsius scale from which the offset between the scales can be computed.
	 */
	part '°F«abs»' = IntervalScale(name => "degree fahrenheit (absolute)") {
		ref unit redefines MeasurementScale::unit = '°F«rel»';
		private part temperatureWaterAtFreezingPointInF = ScaleValueDefinition(
			num => 32.0, description => "temperature in degree Fahrenheit of pure water at freezing point"
		);
		private part fahrenheitToCelsiusScaleMapping = ScaleValueMapping(
			mappedScaleValue => temperatureWaterAtFreezingPointInF, referenceScaleValue => '°C«abs»'::temperatureWaterAtFreezingPointInC
		);
		ref scaleValueDefinition: ScaleValueDefinition :>> MeasurementReference::scaleValueDefinition = temperatureWaterAtFreezingPointInF;
		ref scaleValueMapping redefines MeasurementScale::scaleValueMapping = fahrenheitToCelsiusScaleMapping;
	}
	alias '°F«abs»' as '°F';
}