/**
 * Library package with measurement unit declarations generated from NIST SP811 Appendix B
 * See https://www.nist.gov/pml/special-publication-811/nist-guide-si-appendix-b-conversion-factors/nist-guide-si-appendix-b8
 * Generated at 2022-02-11T23:27:48Z
 */
package <Imp> 'Imperial (Canadian and UK) Units' {
    private import UnitsAndScales::*;
    import ISQ::*;
    import SI::*;

    attribute <gal> 'gallon (Canadian and UK (Imperial))' : VolumeUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m^3; :>> conversionFactor = 4.54609E-03; } }
    attribute <gi> 'gill (Canadian and UK (Imperial))' : VolumeUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m^3; :>> conversionFactor = 1.420653E-04; :>> isExact = false; } }
    attribute 'horsepower (UK)' : PowerUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = W; :>> conversionFactor = 7.4570E+02; :>> isExact = false; } }
    attribute <oz> 'ounce (troy or apothecary)' : MassUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = kg; :>> conversionFactor = 3.110348E-02; :>> isExact = false; } }
    attribute <floz> 'ounce (Canadian and UK fluid (Imperial))' : VolumeUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m^3; :>> conversionFactor = 2.841306E-05; :>> isExact = false; } }
    attribute <'oz/gal'> 'ounce (avoirdupois) per gallon (Canadian and UK (Imperial))' : MassDensityUnit = oz/gal;
    attribute <dwt> 'pennyweight' : MassUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = kg; :>> conversionFactor = 1.555174E-03; :>> isExact = false; } }
    attribute <lb> 'pound (troy or apothecary)' : MassUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = kg; :>> conversionFactor = 3.732417E-01; :>> isExact = false; } }
    attribute 'poundal' : ForceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = N; :>> conversionFactor = 1.382550E-01; :>> isExact = false; } }
    attribute 'poundal per square foot' : PressureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa; :>> conversionFactor = 1.488164E+00; :>> isExact = false; } }
    attribute 'poundal second per square foot' : DynamicViscosityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa*s; :>> conversionFactor = 1.488164E+00; :>> isExact = false; } }
    attribute <'lb/gal'> 'pound per gallon (Canadian and UK (Imperial))' : MassDensityUnit = lb/gal;

}
