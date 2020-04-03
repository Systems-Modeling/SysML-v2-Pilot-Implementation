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
    part mph is 'mi/h';

	/*
	 * degree fahrenheit unit for temperature difference quantities
	 */
	part '°F' = TemperatureUnit(name => "degree fahrenheit", unitConversion => ConversionByConvention(referenceUnit => K, conversionFactor => 5.0/9.0));
	 
	/*
	 * degree fahrenheit interval scale for absolute temperature quantities
	 * 
	 * The interval scale is defined with an explicit mapping to the celsius scale from which the offset between the scales can be computed.
	 */
	part temperatureWaterAtFreezingPointInF = ScaleValueDefinition(num => 32.0, description => "temperature in degree Fahrenheit of pure water at freezing point");
	part fahrenheitToCelsiusScaleMapping = ScaleValueMapping(mappedScaleValue => temperatureWaterAtFreezingPointInF, referenceScaleValue => temperatureWaterAtFreezingPointInC);
	
	/* TODO: Consider part name '°F_abs' or '°F (abs)' */
	part '°F scale' = IntervalScale(name => "degree fahrenheit scale") {
		ref unit redefines MeasurementScale::unit = '°F';
		ref scaleValueDefinition: ScaleValueDefinition :> MeasurementReference::scaleValueDefinition = temperatureWaterAtFreezingPointInF;
		ref scaleValueMapping redefines MeasurementScale::scaleValueMapping = fahrenheitToCelsiusScaleMapping;
	}
}