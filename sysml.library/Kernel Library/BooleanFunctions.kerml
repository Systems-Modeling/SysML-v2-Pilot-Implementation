package BooleanFunctions {
	import ScalarValues::*;
	
	function '!'(x: Boolean): Boolean specializes ScalarFunctions::'!';
	
	function '|'(x: Boolean, y: Boolean): Boolean specializes ScalarFunctions::'|';
	function '^'(x: Boolean, y: Boolean): Boolean specializes ScalarFunctions::'^';
	function '&'(x: Boolean, y: Boolean): Boolean specializes ScalarFunctions::'&';
	
	function '=='(x: Boolean, y: Boolean): Boolean specializes BaseFunctions::'==';
	function '!='(x: Boolean, y: Boolean): Boolean specializes BaseFunctions::'!=';
	
	function ToString(x: Boolean): String specializes BaseFunctions::ToString;
	function ToBoolean(x: String): Boolean;
	
}
	
