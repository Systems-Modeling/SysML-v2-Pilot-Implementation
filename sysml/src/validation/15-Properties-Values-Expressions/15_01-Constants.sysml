package '15_01-Constants' {
    import SI::*;

    /* TODO: Move mathematical and fundamental physical constants to model library package(s) */
    /* TODO: Add concept of precision for Real values */
    
    /* Note: Value properties that are bound to specific values are constants, have the specified
     * values in all contexts. It is not legal to redefine them.
     */    
    
    /**
     * Standard mathematical constants
     */
    package 'Mathematical Constants' {
        value e: Real = 2.71828182845904523536;
        value pi: Real = 3.14159265358979323846; 
    }

    /**
     * Standard fundamental physical constants
     *
     * The reference source is:
     * CODATA - Task Group on Fundamental Physical Constants (TGFC) - 2010 Recommended Values
     * See http://www.codata.org/committees-and-groups/fundamental-physical-constants/tgfc-previous-values-and-publications
     */
    package 'Fundamental Physical Constants' {
        value 'fine structure constant': DimensionOneValue = 7.297352569824E-3;
        value 'electron to proton mass ratio': DimensionOneValue = 5.446170217822E-4;
        value 'speed of light in vacuum': SpeedValue = 299792458@[m/s];
    }

    package 'Global Context' {
        value 'nominal earth gravitational acceleration': AccelerationValue = 9.80665@['m/s²'];
    }

    package 'Model X Context' {
        value 'amplifier gain': DimensionOneValue = 3.5;
    }
}
