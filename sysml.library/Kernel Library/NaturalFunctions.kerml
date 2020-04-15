package NaturalFunctions {
	import ScalarValues::*;
	
	function '+'(x: Natural, y: Natural[0..1]): Natural specializes IntegerFunctions::'+';
	function '*'(x: Natural, y: Natural): Natural specializes IntegerFunctions::'*';
	function '/'(x: Natural, y: Natural): Natural specializes IntegerFunctions::'/';
	function '%'(x: Natural, y: Natural): Natural specializes IntegerFunctions::'%';
	
	function '<'(x: Natural, y: Natural): Boolean specializes IntegerFunctions::'<', UnlimitedNaturalFunctions::'<';
	function '>'(x: Natural, y: Natural): Boolean specializes IntegerFunctions::'>', UnlimitedNaturalFunctions::'>';
	function '<='(x: Natural, y: Natural): Boolean specializes IntegerFunctions::'<=', UnlimitedNaturalFunctions::'<=';
	function '>='(x: Natural, y: Natural): Boolean specializes IntegerFunctions::'>=', UnlimitedNaturalFunctions::'>=';	

	function Max(x: Natural, y: Natural): Natural specializes IntegerFunctions::Max, UnlimitedNaturalFunctions::Max;

	function '=='(x: UnlimitedNatural, y: UnlimitedNatural): Boolean specializes IntegerFunctions::'==', UnlimitedNaturalFunctions::'=';
	function '/='(x: UnlimitedNatural, y: UnlimitedNatural): Boolean specializes IntegerFunctions::'!=', UnlimitedNaturalFunctions::'!=';
	
	function ToString(x: Natural): String specializes IntegerFunctions::ToString, UnlimitedNaturalFunctions::ToString;
	function ToNatural(x: String): Natural;
}	
