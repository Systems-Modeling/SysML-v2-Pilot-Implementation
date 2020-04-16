package RealFunctions {
	import ScalarValues::*;
	
	function Abs(x: Real): Real specializes NumericalFunctions::Abs;

	function '+'(x: Real, y: Real[0..1]): Real specializes NumericalFunctions::'+';
	function '-'(x: Real, y: Real[0..1]): Real specializes NumericalFunctions::'-';
	function '*'(x: Real, y: Real): Real specializes NumericalFunctions::'*';
	function '/'(x: Real, y: Real): Real specializes NumericalFunctions::'/';
	function '**'(x: Real, y: Real): Real specializes NumericalFunctions::'**';
	
	function '<'(x: Real, y: Real): Boolean specializes NumericalFunctions::'<';
	function '>'(x: Real, y: Real): Boolean specializes NumericalFunctions::'>';
	function '<='(x: Real, y: Real): Boolean specializes NumericalFunctions::'<=';
	function '>='(x: Real, y: Real): Boolean specializes NumericalFunctions::'>=';

	function Max(x: Real, y: Real): Real specializes NumericalFunctions::Max;
	function Min(x: Real, y: Real): Real specializes NumericalFunctions::Min;

	function '=='(x: Real, y: Real): Boolean specializes BaseFunctions::'==';
	function '!='(x: Real, y: Real): Boolean specializes BaseFunctions::'!=';
		
	function Sqrt(x: Real): Real;

	function Floor(x: Real): Integer;
	function Round(x: Real): Integer;
	
	function ToString(x: Real): String specializes BaseFunctions::ToString;
	function ToInteger(x: Real): Integer;
	function ToRatioanl(x: Real): Rational;
	function ToReal(x: String): Real;
	function ToComplex(x: Real): Complex;
	
	function sum(collection: Real[0..*]): Real specializes ScalarFunctions::sum {
		ScalarFunctions::sum0(collection, 0.0)
	}
	
	function product(collection: Real[0..*]): Real specializes ScalarFunctions::product {
		ScalarFunctions::product1(collection, 1.0)
	}	
}
