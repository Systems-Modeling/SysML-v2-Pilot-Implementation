package '15_01-Constants' {
    import SI::*;
    import USCustomaryUnits::*;

    /* I believe these math and physical constants should be defined in the model library. */

    /**
     Examples of mathematical constants
     Note: There shall be a way to mark these as "invariant" 
     */
    block 'Mathematical Constants' {
        value e: Real = 2.71828182845904523536;
        value pi: Real = 3.14159265358979323846;
    }

    /**
     Examples of fundamental physical constants
     Note: There shall be a way to mark these as "invariant" 
     */
    /**
     * The reference source is:
     CODATA - Task Group on Fundamental Physical Constants (TGFC) - 2010 Recommended Values - See http://www.codata.org/committees-and-groups/fundamental-physical-constants/tgfc-previous-values-and-publications
     */
    block 'Fundamental Physical Constants' {
        value 'fine structure constant': DimensionOneValue = 7.297352569824E-3;
        value 'electron to proton mass ratio': DimensionOneValue = 5.446170217822E-4;
        value 'speed of light in vacuum': SpeedValue = 299792458@[m/s];
    }

    block 'Global Context' {
        value 'nominal earth gravitational acceleration': AccelerationValue = 9.80665@[m/s^2];
    }

    block 'Model X Context' {
        value 'amplifier gain': DimensionOneValue = 3.5;
    }

}
