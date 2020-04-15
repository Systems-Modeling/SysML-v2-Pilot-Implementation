package RationalFunctions {
	import ScalarValues::*;
	
	function Rat(numer: Integer, denum: Integer): Rational;
	function Numer(rat: Rational): Integer;
	function Denom(rat: Rational): Integer;
	
	function Abs(x: Rational): Rational specializes NumericalFunctions::Abs;

	function '+'(x: Rational, y: Rational[0..1]): Rational specializes NumericalFunctions::'+';
	function '-'(x: Rational, y: Rational[0..1]): Rational specializes NumericalFunctions::'-';
	function '*'(x: Rational, y: Rational): Rational specializes NumericalFunctions::'*';
	function '/'(x: Rational, y: Rational): Rational specializes NumericalFunctions::'/';
	function '**'(x: Rational, y: Rational): Rational specializes NumericalFunctions::'**';
	
	function '<'(x: Rational, y: Rational): Boolean specializes NumericalFunctions::'<';
	function '>'(x: Rational, y: Rational): Boolean specializes NumericalFunctions::'>';
	function '<='(x: Rational, y: Rational): Boolean specializes NumericalFunctions::'<=';
	function '>='(x: Rational, y: Rational): Boolean specializes NumericalFunctions::'>=';

	function Max(x: Rational, y: Rational): Rational specializes NumericalFunctions::Max;
	function Min(x: Rational, y: Rational): Rational specializes NumericalFunctions::Min;

	function '=='(x: Rational, y: Rational): Boolean specializes BaseFunctions::'==';
	function '!='(x: Rational, y: Rational): Boolean specializes BaseFunctions::'!=';
	
	function GCD(x: Rational, y: Rational): Integer;
		
	function Floor(x: Rational): Integer;
	function Round(x: Rational): Integer;
	
	function ToString(x: Rational): String specializes BaseFunctions::ToString;
	function ToInteger(x: Rational): Integer;
	function ToRational(x: String): Rational;
	function ToReal(x: Rational): Real;
	function ToComplex(x: Rational): Complex;
	
	function sum(collection: Rational[0..*]): Rational specializes ScalarFunctions::sum {
		ScalarFunctions::sum0(collection, Rat(0, 1))
	}
	
	function product(collection: Rational[0..*]): Rational specializes ScalarFunctions::product {
		ScalarFunctions::product1(collection, Rat(1, 1))
	}	
}
