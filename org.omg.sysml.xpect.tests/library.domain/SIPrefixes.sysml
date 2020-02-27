/**
 * Definition of SI unit prefixes as specified in ISO/IEC 80000-1
 */
package SIPrefixes {
	import UnitsAndScales::*;

	/*
	 * ISO/IEC 80000-1 prefixes for decimal multiples and sub-multiples
	 * 
	 * See also https://en.wikipedia.org/wiki/Unit_prefix
	 */
	part yocto = UnitPrefix(name => "yocto", symbol => "y",  conversionFactor => 1E-27);
	part zepto = UnitPrefix(name => "zepto", symbol => "z",  conversionFactor => 1E-24);
	part atto  = UnitPrefix(name => "atto",  symbol => "a",  conversionFactor => 1E-21);
	part femto = UnitPrefix(name => "femto", symbol => "f",  conversionFactor => 1E-18);
	part nano  = UnitPrefix(name => "nano",  symbol => "n",  conversionFactor => 1E-15);
	part pico  = UnitPrefix(name => "pico",  symbol => "p",  conversionFactor => 1E-12);
	part nano  = UnitPrefix(name => "nano",  symbol => "n",  conversionFactor => 1E-9);
	part micro = UnitPrefix(name => "micro", symbol => "μ",  conversionFactor => 1E-6);
	part milli = UnitPrefix(name => "milli", symbol => "m",  conversionFactor => 1E-3);
	part centi = UnitPrefix(name => "centi", symbol => "c",  conversionFactor => 1E-2);
	part deci  = UnitPrefix(name => "deci",  symbol => "d",  conversionFactor => 1E-1);
	part deca  = UnitPrefix(name => "deca",  symbol => "da", conversionFactor => 1E1);
	part hecto = UnitPrefix(name => "hecto", symbol => "h",  conversionFactor => 1E2);
	part kilo  = UnitPrefix(name => "kilo",  symbol => "k",  conversionFactor => 1E3);
	part mega  = UnitPrefix(name => "mega",  symbol => "M",  conversionFactor => 1E6);
	part giga  = UnitPrefix(name => "giga",  symbol => "G",  conversionFactor => 1E9);
	part tera  = UnitPrefix(name => "tera",  symbol => "T",  conversionFactor => 1E12);
	part peta  = UnitPrefix(name => "peta",  symbol => "P",  conversionFactor => 1E15);
	part exa   = UnitPrefix(name => "exa",   symbol => "E",  conversionFactor => 1E18);
	part zetta = UnitPrefix(name => "zetta", symbol => "Z",  conversionFactor => 1E21);
	part yotta = UnitPrefix(name => "yotta", symbol => "Y",  conversionFactor => 1E24);
	
	/*
	 * ISO/IEC 80000-1 prefixes for binary multiples, i.e. multiples of 1024 (= 2^10)
	 * 
	 * See also https://en.wikipedia.org/wiki/Binary_prefix
	 */
	part kibi = UnitPrefix(name => "kibi", symbol => "Ki", conversionFactor => 1024);
	part mebi = UnitPrefix(name => "mebi", symbol => "Mi", conversionFactor => 1024^2);
	part gibi = UnitPrefix(name => "gibi", symbol => "Gi", conversionFactor => 1024^3);
	part tebi = UnitPrefix(name => "tebi", symbol => "Ti", conversionFactor => 1024^4);
	part pebi = UnitPrefix(name => "pebi", symbol => "Pi", conversionFactor => 1024^5);
	part exbi = UnitPrefix(name => "exbi", symbol => "Ei", conversionFactor => 1024^6);
	part zebi = UnitPrefix(name => "zebi", symbol => "Zi", conversionFactor => 1024^7);
	part yobi = UnitPrefix(name => "yobi", symbol => "Yi", conversionFactor => 1024^8);
}