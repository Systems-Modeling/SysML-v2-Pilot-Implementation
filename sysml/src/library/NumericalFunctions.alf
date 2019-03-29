package NumericalFunctions {
	import ScalarValues::*;
	
	abstract function Abs(x: NumericalValue): NumericalValue;
		
	abstract function '+'(x: NumericalValue, y: NumericalValue[0..1]): NumericalValue specializes ScalarFunctions::'+';
	abstract function '-'(x: NumericalValue, y: NumericalValue[0..1]): NumericalValue specializes ScalarFunctions::'-';
	abstract function '*'(x: NumericalValue, y: NumericalValue): NumericalValue specializes ScalarFunctions::'*';
	abstract function '/'(x: NumericalValue, y: NumericalValue): NumericalValue specializes ScalarFunctions::'/';
	abstract function '**'(x: NumericalValue, y: NumericalValue): NumericalValue specializes ScalarFunctions::'**';
	abstract function '%'(x: NumericalValue, y: NumericalValue): NumericalValue specializes ScalarFunctions::'%';
	
	abstract function '<'(x: NumericalValue, y: NumericalValue): Boolean specializes ScalarFunctions::'<';
	abstract function '>'(x: NumericalValue, y: NumericalValue): Boolean specializes ScalarFunctions::'>';
	abstract function '<='(x: NumericalValue, y: NumericalValue): Boolean specializes ScalarFunctions::'<=';
	abstract function '>='(x: NumericalValue, y: NumericalValue): Boolean specializes ScalarFunctions::'>=';
	
	abstract function Max(x: NumericalValue, y: NumericalValue): NumericalValue specializes ScalarFunctions::Max;
	abstract function Min(x: NumericalValue, y: NumericalValue): NumericalValue specializes ScalarFunctions::Min;
}