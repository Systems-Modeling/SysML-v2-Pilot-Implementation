package IntegerFunctions {
	import ScalarValues::*;
	
	function Abs(x: Integer): Natural specializes NumericalFunctions::Abs;
	
	function '+'(x: Integer, y: Integer[0..1]): Integer specializes NumericalFunctions::'+';
	function '-'(x: Integer, y: Integer[0..1]): Integer specializes NumericalFunctions::'-';
	function '*'(x: Integer, y: Integer): Integer specializes NumericalFunctions::'*';
	function '/'(x: Integer, y: Integer): Integer specializes NumericalFunctions::'/';
	function '**'(x: Integer, y: Natural): Integer specializes NumericalFunctions::'**';
	function '%'(x: Integer, y: Integer): Integer specializes NumericalFunctions::'%';
	
	function '<'(x: Integer, y: Integer): Boolean specializes NumericalFunctions::'<';
	function '>'(x: Integer, y: Integer): Boolean specializes NumericalFunctions::'>';
	function '<='(x: Integer, y: Integer): Boolean specializes NumericalFunctions::'<=';
	function '>='(x: Integer, y: Integer): Boolean specializes NumericalFunctions::'>=';

	function Max(x: Integer, y: Integer): Integer specializes NumericalFunctions::Max;
	function Min(x: Integer, y: Integer): Integer specializes NumericalFunctions::Min;

	function '=='(x: Integer, y: Integer): Boolean specializes BaseFunctions::'==';
	function '!='(x: Integer, y: Integer): Boolean specializes BaseFunctions::'!=';
	
	function '..'(lower: Integer, upper: Integer): Integer[0..*] specializes ScalarFunctions::'..';	
	
	function ToString(x: Integer): String specializes BaseFunctions::ToString;
	function ToNatural(x: Integer): Natural;
	function ToInteger(x: String): Integer;
	function ToRational(x: Integer): Rational;
	function ToReal(x: Integer): Real;
	
	function sum(collection: Integer[0..*]): Integer specializes ScalarFunctions::sum {
		ScalarFunctions::sum0(collection, 0)
	}
	
	function product(collection: Integer[0..*]): Integer specializes ScalarFunctions::product {
		ScalarFunctions::product1(collection, 1)
	}
}	
