package VectorFunctions {
	import ScalarValues::*;
    import Quantities::*;

    /** Vector addition and subtraction */
	calc def '+' specializes NumericalFunctions::'+' (x: VectorQuantityValue, y: VectorQuantityValue): VectorQuantityValue;
	calc def '-' specializes NumericalFunctions::'-' (x: VectorQuantityValue, y: VectorQuantityValue): VectorQuantityValue;

    /** Scalar-vector multiplication */
	calc def '*' specializes NumericalFunctions::'*' (x: Real, y: VectorQuantityValue): VectorQuantityValue;
	calc def '*' specializes NumericalFunctions::'*' (x: VectorQuantityValue, y: Real): VectorQuantityValue;
}
