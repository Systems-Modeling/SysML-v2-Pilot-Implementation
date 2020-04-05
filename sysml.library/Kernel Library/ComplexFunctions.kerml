package ComplexFunctions {
	import ScalarValues::*;
		
	feature i: Complex = Rect(0.0, 1.0);
	
	function Rect(re: Real, im: Real): Complex;
	function Polar(abs: Real, arg: Real): Complex;
	
	function Re(x: Complex): Real;
	function Im(x: Complex): Real;
	
	function Abs(x: Complex): Real specializes NumericalFunctions::Abs;
	function Arg(x: Complex): Real;
	
	function '+'(x: Complex, y: Complex[0..1]): Complex specializes NumericalFunctions::'+';
	function '-'(x: Complex, y: Complex[0..1]): Complex specializes NumericalFunctions::'-';
	function '*'(x: Complex, y: Complex): Complex specializes NumericalFunctions::'*';
	function '/'(x: Complex, y: Complex): Complex specializes NumericalFunctions::'/';
	function '**'(x: Complex, y: Complex): Complex specializes NumericalFunctions::'**';
	
	function '=='(x: Complex, y: Complex): Boolean specializes BaseFunctions::'==';
	function '!='(x: Complex, y: Complex): Boolean specializes BaseFunctions::'!=';
	
	function ToString(x: Complex): String specializes BaseFunctions::ToString;
	function ToComplex(x: String): Complex;
	
	function sum(collection: Complex[0..*]): Complex specializes ScalarFunctions::sum {
		ScalarFunctions::sum0(collection, Rect(0.0, 0.0))
	}
	
	function product(collection: Complex[0..*]): Complex specializes ScalarFunctions::product {
		ScalarFunctions::product1(collection, Rect(1.0, 0.0))
	}	
}
