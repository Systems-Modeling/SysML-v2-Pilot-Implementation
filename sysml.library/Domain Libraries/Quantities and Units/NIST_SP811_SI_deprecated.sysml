/**
 * Library package with measurement unit declarations generated from NIST SP811 Appendix B
 * See https://www.nist.gov/pml/special-publication-811/nist-guide-si-appendix-b-conversion-factors/nist-guide-si-appendix-b8
 * Generated at 2022-02-11T23:27:48Z
 */
package <SI_deprecated> 'International System of Units - Deprecated units' {
    private import UnitsAndScales::*;
    import ISQ::*;
    import SI::*;

    attribute <'at'> 'atmosphere, technical' : PressureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa; :>> conversionFactor = 9.80665E+04; } }
    attribute <cal_th> 'calorie (th)' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 4.184E+00; } }
    attribute <cal_mean> 'calorie (mean)' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 4.19002E+00; :>> isExact = false; } }
    attribute <cal_15> 'calorie (15 °C)' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 4.18580E+00; :>> isExact = false; } }
    attribute <cal_20> 'calorie (20 °C)' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 4.18190E+00; :>> isExact = false; } }
    attribute <cal_nutrition_th> 'calorie (th), kilogram (nutrition)' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 4.184E+03; } }
    attribute <cal_nutrition_mean> 'calorie (mean), kilogram (nutrition)' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 4.19002E+03; :>> isExact = false; } }
    attribute <'cal_th/(cm⋅s⋅°C)'> 'calorie (th) per centimeter second degree Celsius' : ThermalConductivityUnit = cal_th/(cm*s*'°C');
    attribute <'cal_th/g'> 'calorie (th) per gram' : SpecificEnergyUnit = cal_th/g;
    attribute <'cal_th/(g⋅°C)'> 'calorie (th) per gram degree Celsius' : SpecificHeatCapacityUnit = cal_th/(g*'°C');
    attribute <'cal_th/(g·K)'> 'calorie (th) per gram kelvin' : SpecificHeatCapacityUnit = cal_th/(g*K);
    attribute <'cal_th/min'> 'calorie (th) per minute' : PowerUnit = cal_th/min;
    attribute <'cal_th/s'> 'calorie (th) per second' : PowerUnit = cal_th/s;
    //attribute <'cal_th/cm²'> 'calorie (th) per square centimeter' : SurfaceHeatDensityUnit = cal_th/cm^2;
    attribute <'cal_th/(cm²⋅min)'> 'calorie (th) per square centimeter minute' : DensityOfHeatFlowRateUnit = cal_th/(cm^2*min);
    attribute <'cal_th/(cm²⋅s)'> 'calorie (th) per square centimeter second' : DensityOfHeatFlowRateUnit = cal_th/(cm^2*s);
    attribute 'centimeter of mercury (0 °C)' : PressureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa; :>> conversionFactor = 1.33322E+03; :>> isExact = false; } }
    attribute <cmHg> 'centimeter of mercury, conventional' : PressureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa; :>> conversionFactor = 1.333224E+03; :>> isExact = false; } }
    attribute 'centimeter of water (4 °C)' : PressureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa; :>> conversionFactor = 9.80638E+01; :>> isExact = false; } }
    attribute <cmH2O> 'centimeter of water, conventional' : PressureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa; :>> conversionFactor = 9.80665E+01; } }
    attribute <Ci> 'curie' : NuclearActivityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Bq; :>> conversionFactor = 3.7E+10; } }
    //attribute 'degree centigrade (temperature)' : ThermodynamicTemperatureUnit; // conversion TBD
    //attribute 'degree centigrade (temperature interval)' : TemperatureDifferenceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = '°C'; :>> conversionFactor = 1.0E+00; :>> isExact = false; } }
    attribute <gf> 'gram-force' : ForceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = N; :>> conversionFactor = 9.80665E-03; } }
    attribute <'gf/cm²'> 'gram-force per square centimeter' : PressureUnit = gf/cm^2;
    attribute <hp_metric> 'horsepower (metric)' : PowerUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = W; :>> conversionFactor = 7.354988E+02; :>> isExact = false; } }
    attribute <kcal_th> 'kilocalorie (th)' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 4.184E+03; } }
    attribute <kcal_mean> 'kilocalorie (mean)' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 4.19002E+03; :>> isExact = false; } }
    attribute <'kcal_th/min'> 'kilocalorie (th) per minute' : PowerUnit = kcal_th/min;
    attribute <'kcal_th/s'> 'kilocalorie (th) per second' : PowerUnit = kcal_th/s;
    attribute <kgf> 'kilogram-force' : ForceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = N; :>> conversionFactor = 9.80665E+00; } }
    attribute <'kgf⋅m'> 'kilogram-force meter' : MomentOfForceUnit = kgf*m;
    attribute <'kgf/cm²'> 'kilogram-force per square centimeter' : PressureUnit = kgf/cm^2;
    attribute <'kgf/m²'> 'kilogram-force per square meter' : PressureUnit = kgf/m^2;
    attribute <'kgf/mm²'> 'kilogram-force per square millimeter' : PressureUnit = kgf/mm^2;
    attribute <'kgf⋅s²/m'> 'kilogram-force second squared per meter' : MassUnit = kgf*s^2/m;
    attribute <kp> 'kilopond (kilogram-force)' : ForceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = N; :>> conversionFactor = 9.80665E+00; } }
    attribute 'mho' : ConductanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = S; :>> conversionFactor = 1.0E+00; } }
    attribute <'μ'> 'micron' : LengthUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m; :>> conversionFactor = 1.0E-06; } }
    attribute <mmH2O> 'millimeter of water, conventional' : PressureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa; :>> conversionFactor = 9.80665E+00; } }
    //attribute 'rhe' : ReciprocalDynamicViscosityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa^-1*s^-1; :>> conversionFactor = 1.0E+01; } }
    attribute <R> 'roentgen' : ExposureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = C/kg; :>> conversionFactor = 2.58E-04; } }
    attribute <Torr> 'torr' : PressureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa; :>> conversionFactor = 1.333224E+02; :>> isExact = false; } }

}
