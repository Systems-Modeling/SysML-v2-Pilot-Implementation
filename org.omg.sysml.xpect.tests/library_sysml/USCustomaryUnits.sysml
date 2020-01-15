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

    part 'mi/hr': SpeedUnit = mi / hr { name redefines MeasurementScale::name = "mile per hour"; }
    
    part lbf = ForceUnit(name => "pound-force", unitConversion => ConversionByConvention(referenceUnit => N, conversionFactor => 4.448222 ));

    /*
     * Definition of an alias for mile per hour
     */
    part mph is 'mi/hr';
}