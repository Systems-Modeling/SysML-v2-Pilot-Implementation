/**
 * Library package with measurement unit declarations generated from NIST SP811 Appendix B
 * See https://www.nist.gov/pml/special-publication-811/nist-guide-si-appendix-b-conversion-factors/nist-guide-si-appendix-b8
 * Generated at 2022-02-11T23:27:48Z
 */
package <SI_recognized> 'International System of Units - Units recognized in SI' {
    private import UnitsAndScales::*;
    import ISQ::*;
    import SI::*;

    attribute <g_n> 'acceleration of free fall, standard' : AccelerationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m/s^2; :>> conversionFactor = 9.80665E+00; } }
    attribute <'A⋅h'> 'ampere hour' : ElectricChargeUnit = A*h;
    attribute <'Å'> 'ångström' : LengthUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m; :>> conversionFactor = 1.0E-10; } }
    attribute <a> 'are' : AreaUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m^2; :>> conversionFactor = 1.0E+02; } }
    attribute <au> 'astronomical unit' : LengthUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m; :>> conversionFactor = 1.495979E+11; :>> isExact = false; } }
    attribute <atm> 'atmosphere, standard' : PressureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa; :>> conversionFactor = 1.01325E+05; } }
    attribute <bar> 'bar' : PressureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa; :>> conversionFactor = 1.0E+05; } }
    attribute <b> 'barn' : AreaUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m^2; :>> conversionFactor = 1.0E-28; } }
    attribute <cal_IT> 'calorie (IT)' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 4.1868E+00; } }
    alias cal for cal_IT;
    attribute <cal_nutrition_IT> 'calorie (IT), kilogram (nutrition)' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 4.1868E+03; } }
    alias cal_nutrition for cal_nutrition_IT;
    attribute <'cal_IT/g'> 'calorie (IT) per gram' : SpecificEnergyUnit = cal_IT/g;
    attribute <'cal_IT/(g⋅°C)'> 'calorie (IT) per gram degree Celsius' : SpecificHeatCapacityUnit = cal_IT/(g*'°C');
    attribute <'cal_IT/(g⋅K)'> 'calorie (IT) per gram kelvin' : SpecificHeatCapacityUnit = cal_IT/(g*K);
    attribute 'carat, metric' : MassUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = kg; :>> conversionFactor = 2.0E-04; } }
    attribute 'darcy' : PermeabilityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m^2; :>> conversionFactor = 9.869233E-13; :>> isExact = false; } }
    attribute <d> 'day' : DurationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = s; :>> conversionFactor = 8.64E+04; } }
    attribute 'day (sidereal)' : DurationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = s; :>> conversionFactor = 8.616409E+04; :>> isExact = false; } }
    attribute <'°'> 'degree (angle)' : AngularMeasureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = rad; :>> conversionFactor = 1.745329E-02; :>> isExact = false; } }
    attribute <'°C'> 'degree Celsius (temperature)' : ThermodynamicTemperatureUnit; // conversion TBD
    //attribute 'degree Celsius (temperature interval)' : TemperatureDifferenceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = K; :>> conversionFactor = 1.0E+00; } }
    attribute 'denier' : LinearMassDensityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = kg/m; :>> conversionFactor = 1.111111E-07; :>> isExact = false; } }
    attribute <eV> 'electronvolt' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 1.602177E-19; :>> isExact = false; } }
    attribute 'faraday (based on carbon 12)' : ElectricChargeUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = C; :>> conversionFactor = 9.648531E+04; :>> isExact = false; } }
    attribute 'fermi' : LengthUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m; :>> conversionFactor = 1.0E-15; } }
    attribute <gon> 'gon (also called grade)' : AngularMeasureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = rad; :>> conversionFactor = 1.570796E-02; :>> isExact = false; } }
    attribute <'g/cm³'> 'gram per cubic centimeter' : MassDensityUnit = g/cm^3;
    attribute <ha> 'hectare' : AreaUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m^2; :>> conversionFactor = 1.0E+04; } }
    attribute <h> 'hour' : DurationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = s; :>> conversionFactor = 3.6E+03; } }
    attribute 'hour (sidereal)' : DurationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = s; :>> conversionFactor = 3.590170E+03; :>> isExact = false; } }
    attribute <kcal_IT> 'kilocalorie (IT)' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 4.1868E+03; } }
    alias kcal for kcal_IT;
    attribute <'km/h'> 'kilometer per hour' : SpeedUnit = km/h;
    attribute <'kW⋅h'> 'kilowatt hour' : EnergyUnit = kW*h;
    attribute 'lambert' : LuminanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = cd/m^2; :>> conversionFactor = 3.183099E+03; :>> isExact = false; } }
    attribute <'l.y.'> 'light year' : LengthUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m; :>> conversionFactor = 9.46073E+15; :>> isExact = false; } }
    attribute <L> 'liter' : VolumeUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m^3; :>> conversionFactor = 1.0E-03; } }
    attribute <mil_NATO> 'mil (angle)' : AngularMeasureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = rad; :>> conversionFactor = 9.817477E-04; :>> isExact = false; } }
    attribute <mbar> 'millibar' : PressureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa; :>> conversionFactor = 1.0E+02; } }
    attribute <mmHg> 'millimeter of mercury, conventional' : PressureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa; :>> conversionFactor = 1.333224E+02; :>> isExact = false; } }
    attribute <'′'> 'minute (angle)' : AngularMeasureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = rad; :>> conversionFactor = 2.908882E-04; :>> isExact = false; } }
    attribute <min> 'minute' : DurationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = s; :>> conversionFactor = 6.0E+01; } }
    attribute 'minute (sidereal)' : DurationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = s; :>> conversionFactor = 5.983617E+01; :>> isExact = false; } }
    attribute <'Ω⋅cm'> 'ohm centimeter' : ResistivityUnit = 'Ω'*cm;
    attribute <pc> 'parsec' : LengthUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m; :>> conversionFactor = 3.085678E+16; :>> isExact = false; } }
    attribute <r> 'revolution' : AngularMeasureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = rad; :>> conversionFactor = 6.283185E+00; :>> isExact = false; } }
    attribute <'r/min'> 'revolution per minute (rpm)' : AngularVelocityUnit = r/min;
    attribute 'rpm (revolution per minute)' : AngularVelocityUnit = r/min;
    attribute <'″'> 'second (angle)' : AngularMeasureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = rad; :>> conversionFactor = 4.848137E-06; :>> isExact = false; } }
    attribute 'second (sidereal)' : DurationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = s; :>> conversionFactor = 9.972696E-01; :>> isExact = false; } }
    attribute 'shake' : DurationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = s; :>> conversionFactor = 1.0E-08; } }
    attribute <st> 'stere' : VolumeUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m^3; :>> conversionFactor = 1.0E+00; } }
    attribute 'tex' : LinearMassDensityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = kg/m; :>> conversionFactor = 1.0E-06; } }
    attribute <t> 'ton, metric' : MassUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = kg; :>> conversionFactor = 1.0E+03; } }
    attribute 'tonne (called "metric ton" in US)' : MassUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = kg; :>> conversionFactor = 1.0E+03; } }
    attribute 'ton of TNT (energy equivalent)' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 4.184E+09; } }
    attribute <'W⋅h'> 'watt hour' : EnergyUnit = W*h;
    attribute <'W/cm²'> 'watt per square centimeter' : DensityOfHeatFlowRateUnit = W/cm^2;
    attribute <'W⋅s'> 'watt second' : EnergyUnit = W*s;
    attribute 'year (365 days)' : DurationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = s; :>> conversionFactor = 3.1536E+07; } }
    attribute 'year (sidereal)' : DurationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = s; :>> conversionFactor = 3.155815E+07; :>> isExact = false; } }
    attribute 'year (tropical)' : DurationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = s; :>> conversionFactor = 3.155693E+07; :>> isExact = false; } }

}
