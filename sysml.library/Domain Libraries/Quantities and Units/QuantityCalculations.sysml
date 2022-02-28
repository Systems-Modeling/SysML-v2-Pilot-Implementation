package QuantityCalculations {
	import ScalarValues::*;
    import Quantities::ScalarQuantityValue;
    import UnitsAndScales::ScalarMeasurementReference;
    import UnitsAndScales::DimensionOneValue;
    
    calc def isZero :> NumericalFunctions::isZero(x: ScalarQuantityValue): Boolean {
    	NumericalFunctions::isZero(x.num)
    }
    calc def isUnit :> NumericalFunctions::isUnit(x: ScalarQuantityValue): Boolean {
    	NumericalFunctions::isUnit(x.num)
    }
    
    calc def '[' specializes BaseFunctions::'[' (x: NumericalValue, y: ScalarMeasurementReference): ScalarQuantityValue;

	calc def Abs specializes NumericalFunctions::Abs (x: ScalarQuantityValue): ScalarQuantityValue;

	calc def '+' specializes NumericalFunctions::'+' (x: ScalarQuantityValue, y: ScalarQuantityValue[0..1]): ScalarQuantityValue;
	calc def '-' specializes NumericalFunctions::'-' (x: ScalarQuantityValue, y: ScalarQuantityValue[0..1]): ScalarQuantityValue;
	calc def '*' specializes NumericalFunctions::'*' (x: ScalarQuantityValue, y: ScalarQuantityValue): ScalarQuantityValue;
	calc def '/' specializes NumericalFunctions::'/' (x: ScalarQuantityValue, y: ScalarQuantityValue): ScalarQuantityValue;
	calc def '**' specializes NumericalFunctions::'**' (x: ScalarQuantityValue, y: Real): ScalarQuantityValue;
	calc def '^' specializes NumericalFunctions::'^' (x: ScalarQuantityValue, y: Real): ScalarQuantityValue;
	
	calc def '<' specializes NumericalFunctions::'<' (x: ScalarQuantityValue, y: ScalarQuantityValue): Boolean;
	calc def '>' specializes NumericalFunctions::'>' (x: ScalarQuantityValue, y: ScalarQuantityValue): Boolean;
	calc def '<=' specializes NumericalFunctions::'<=' (x: ScalarQuantityValue, y: ScalarQuantityValue): Boolean;
	calc def '>=' specializes NumericalFunctions::'>=' (x: ScalarQuantityValue, y: ScalarQuantityValue): Boolean;

	calc def Max specializes NumericalFunctions::Max (x: ScalarQuantityValue, y: ScalarQuantityValue): ScalarQuantityValue;
	calc def Min specializes NumericalFunctions::Min (x: ScalarQuantityValue, y: ScalarQuantityValue): ScalarQuantityValue;

	calc def '==' specializes BaseFunctions::'==' (x: ScalarQuantityValue, y: ScalarQuantityValue): Boolean;
	calc def '!=' specializes BaseFunctions::'!=' (x: ScalarQuantityValue, y: ScalarQuantityValue): Boolean;
		
	calc def Sqrt(x: ScalarQuantityValue): ScalarQuantityValue;

	calc def Floor(x: ScalarQuantityValue): ScalarQuantityValue;
	calc def Round(x: ScalarQuantityValue): ScalarQuantityValue;
	
	calc def ToString specializes BaseFunctions::ToString (x: ScalarQuantityValue): String;
	calc def ToInteger(x: ScalarQuantityValue): Integer;
	calc def ToRational(x: ScalarQuantityValue): Rational;
	calc def ToReal(x: ScalarQuantityValue): Real;
	calc def ToDimensionOneValue(x: Real): DimensionOneValue;
	
	calc def sum specializes NumericalFunctions::sum (collection: ScalarQuantityValue[0..*]): ScalarQuantityValue {
		private attribute zero : ScalarQuantityValue;
		assert constraint { isZero(zero) }
		NumericalFunctions::sum0(collection, zero)
	}
	
	calc def product specializes NumericalFunctions::product (collection: ScalarQuantityValue[0..*]): ScalarQuantityValue {
		private attribute one : ScalarQuantityValue;
		assert constraint { isUnit(one) }
		NumericalFunctions::product1(collection, one)
	}

    calc def ConvertQuantity(x: ScalarQuantityValue, targetMRef: ScalarMeasurementReference): ScalarQuantityValue;
}
