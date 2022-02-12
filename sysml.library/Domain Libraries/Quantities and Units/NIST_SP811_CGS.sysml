package <CGS> 'Centimetre-Gram-Second System of Units' {
    doc /*
    Library package with measurement unit declarations generated from NIST SP811 Appendix B
    See https://www.nist.gov/pml/special-publication-811/nist-guide-si-appendix-b-conversion-factors/nist-guide-si-appendix-b8
    Generated at 2022-02-11T23:27:48Z
    */

    private import UnitsAndScales::*;
    import ISQ::*;
    import SI::*;

    attribute 'abampere' : ElectricCurrentUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = A; :>> conversionFactor = 1.0E+01; } }
    attribute 'abcoulomb' : ElectricChargeUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = C; :>> conversionFactor = 1.0E+01; } }
    attribute 'abfarad' : CapacitanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = F; :>> conversionFactor = 1.0E+09; } }
    //attribute 'abhenry' : InductanceUnit, PermeanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = H; :>> conversionFactor = 1.0E-09; } }
    attribute 'abmho' : ConductanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = S; :>> conversionFactor = 1.0E+09; } }
    attribute 'abohm' : ResistanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = 'Ω'; :>> conversionFactor = 1.0E-09; } }
    attribute 'abvolt' : ElectricPotentialUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = V; :>> conversionFactor = 1.0E-08; } }
    attribute <Bi> 'biot' : ElectricCurrentUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = A; :>> conversionFactor = 1.0E+01; } }
    attribute <cP> 'centipoise' : DynamicViscosityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa*s; :>> conversionFactor = 1.0E-03; } }
    attribute <cSt> 'centistokes' : KinematicViscosityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m^2/s; :>> conversionFactor = 1.0E-06; } }
    attribute <D> 'debye' : ElectricDipoleMomentUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = C*m; :>> conversionFactor = 3.335641E-30; :>> isExact = false; } }
    attribute <dyn> 'dyne' : ForceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = N; :>> conversionFactor = 1.0E-05; } }
    attribute <'dyn⋅cm'> 'dyne centimeter' : MomentOfForceUnit = dyn*cm;
    attribute <'dyn/cm²'> 'dyne per square centimeter' : PressureUnit = dyn/cm^2;
    attribute 'EMU of capacitance' : CapacitanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = F; :>> conversionFactor = 1.0E+09; } }
    attribute 'EMU of current' : ElectricCurrentUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = A; :>> conversionFactor = 1.0E+01; } }
    attribute 'EMU of electric potential' : ElectricPotentialUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = V; :>> conversionFactor = 1.0E-08; } }
    //attribute 'EMU of inductance' : InductanceUnit, PermeanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = H; :>> conversionFactor = 1.0E-09; } }
    attribute 'EMU of resistance' : ResistanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = 'Ω'; :>> conversionFactor = 1.0E-09; } }
    attribute <erg> 'erg' : EnergyUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = J; :>> conversionFactor = 1.0E-07; } }
    attribute <'erg/s'> 'erg per second' : PowerUnit = erg/s;
    attribute <'erg/(cm²⋅s)'> 'erg per square centimeter second' : DensityOfHeatFlowRateUnit = erg/(cm^2*s);
    attribute 'ESU of capacitance' : CapacitanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = F; :>> conversionFactor = 1.112650E-12; :>> isExact = false; } }
    attribute 'ESU of current' : ElectricCurrentUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = A; :>> conversionFactor = 3.335641E-10; :>> isExact = false; } }
    attribute 'ESU of electric potential' : ElectricPotentialUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = V; :>> conversionFactor = 2.997925E+02; :>> isExact = false; } }
    //attribute 'ESU of inductance' : InductanceUnit, PermeanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = H; :>> conversionFactor = 8.987552E+11; :>> isExact = false; } }
    attribute 'ESU of resistance' : ResistanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = 'Ω'; :>> conversionFactor = 8.987552E+11; :>> isExact = false; } }
    attribute <Fr> 'franklin' : ElectricChargeUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = C; :>> conversionFactor = 3.335641E-10; :>> isExact = false; } }
    attribute <Gal> 'gal (acceleration)' : AccelerationUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m/s^2; :>> conversionFactor = 1.0E-02; } }
    attribute <'γ'> 'gamma' : MagneticFluxDensityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = T; :>> conversionFactor = 1.0E-09; } }
    attribute <Gs> 'gauss' : MagneticFluxDensityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = T; :>> conversionFactor = 1.0E-04; } }
    alias G for Gs;
    attribute <Gi> 'gilbert' : ElectricCurrentUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = A; :>> conversionFactor = 7.957747E-01; :>> isExact = false; } }
    attribute <K> 'kayser' : CurvatureUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m^-1; :>> conversionFactor = 1.0E+02; } }
    attribute <Mx> 'maxwell' : MagneticFluxUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Wb; :>> conversionFactor = 1.0E-08; } }
    attribute <Oe> 'oersted' : LinearElectricCurrentDensityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = A/m; :>> conversionFactor = 7.957747E+01; :>> isExact = false; } }
    attribute <ph> 'phot' : IlluminanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = lx; :>> conversionFactor = 1.0E+04; } }
    attribute <P> 'poise' : DynamicViscosityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Pa*s; :>> conversionFactor = 1.0E-01; } }
    attribute <rad> 'rad (absorbed dose)' : AbsorbedDoseUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Gy; :>> conversionFactor = 1.0E-02; } }
    attribute <rem> 'rem' : DoseEquivalentUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = Sv; :>> conversionFactor = 1.0E-02; } }
    attribute 'statampere' : ElectricCurrentUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = A; :>> conversionFactor = 3.335641E-10; :>> isExact = false; } }
    attribute 'statcoulomb' : ElectricChargeUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = C; :>> conversionFactor = 3.335641E-10; :>> isExact = false; } }
    attribute 'statfarad' : CapacitanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = F; :>> conversionFactor = 1.112650E-12; :>> isExact = false; } }
    //attribute 'stathenry' : InductanceUnit, PermeanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = H; :>> conversionFactor = 8.987552E+11; :>> isExact = false; } }
    attribute 'statmho' : ConductanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = S; :>> conversionFactor = 1.112650E-12; :>> isExact = false; } }
    attribute 'statohm' : ResistanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = 'Ω'; :>> conversionFactor = 8.987552E+11; :>> isExact = false; } }
    attribute 'statvolt' : ElectricPotentialUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = V; :>> conversionFactor = 2.997925E+02; :>> isExact = false; } }
    attribute <sb> 'stilb' : LuminanceUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = cd/m^2; :>> conversionFactor = 1.0E+04; } }
    attribute <St> 'stokes' : KinematicViscosityUnit { :>> unitConversion: ConversionByConvention { :>> referenceUnit = m^2/s; :>> conversionFactor = 1.0E-04; } }

}
