/**
 * Definition of SI unit prefixes as specified in ISO/IEC 80000-1
 */
package SIPrefixes {
	private import UnitsAndScales::*;

	/*
	 * ISO/IEC 80000-1 prefixes for decimal multiples and sub-multiples
	 * 
	 * See also https://en.wikipedia.org/wiki/Unit_prefix
	 */
	value yocto = UnitPrefix(name => "yocto", symbol => "y",  conversionFactor => 1E-27);
	value zepto = UnitPrefix(name => "zepto", symbol => "z",  conversionFactor => 1E-24);
	value atto  = UnitPrefix(name => "atto",  symbol => "a",  conversionFactor => 1E-21);
	value femto = UnitPrefix(name => "femto", symbol => "f",  conversionFactor => 1E-18);
	value nano  = UnitPrefix(name => "nano",  symbol => "n",  conversionFactor => 1E-15);
	value pico  = UnitPrefix(name => "pico",  symbol => "p",  conversionFactor => 1E-12);
	value nano  = UnitPrefix(name => "nano",  symbol => "n",  conversionFactor => 1E-9);
	value micro = UnitPrefix(name => "micro", symbol => "μ",  conversionFactor => 1E-6);
	value milli = UnitPrefix(name => "milli", symbol => "m",  conversionFactor => 1E-3);
	value centi = UnitPrefix(name => "centi", symbol => "c",  conversionFactor => 1E-2);
	value deci  = UnitPrefix(name => "deci",  symbol => "d",  conversionFactor => 1E-1);
	value deca  = UnitPrefix(name => "deca",  symbol => "da", conversionFactor => 1E1);
	value hecto = UnitPrefix(name => "hecto", symbol => "h",  conversionFactor => 1E2);
	value kilo  = UnitPrefix(name => "kilo",  symbol => "k",  conversionFactor => 1E3);
	value mega  = UnitPrefix(name => "mega",  symbol => "M",  conversionFactor => 1E6);
	value giga  = UnitPrefix(name => "giga",  symbol => "G",  conversionFactor => 1E9);
	value tera  = UnitPrefix(name => "tera",  symbol => "T",  conversionFactor => 1E12);
	value peta  = UnitPrefix(name => "peta",  symbol => "P",  conversionFactor => 1E15);
	value exa   = UnitPrefix(name => "exa",   symbol => "E",  conversionFactor => 1E18);
	value zetta = UnitPrefix(name => "zetta", symbol => "Z",  conversionFactor => 1E21);
	value yotta = UnitPrefix(name => "yotta", symbol => "Y",  conversionFactor => 1E24);
	
	/*
	 * ISO/IEC 80000-1 prefixes for binary multiples, i.e. multiples of 1024 (= 2^10)
	 * 
	 * See also https://en.wikipedia.org/wiki/Binary_prefix
	 */
	value kibi = UnitPrefix(name => "kibi", symbol => "Ki", conversionFactor => 1024);
	value mebi = UnitPrefix(name => "mebi", symbol => "Mi", conversionFactor => 1024^2);
	value gibi = UnitPrefix(name => "gibi", symbol => "Gi", conversionFactor => 1024^3);
	value tebi = UnitPrefix(name => "tebi", symbol => "Ti", conversionFactor => 1024^4);
	value pebi = UnitPrefix(name => "pebi", symbol => "Pi", conversionFactor => 1024^5);
	value exbi = UnitPrefix(name => "exbi", symbol => "Ei", conversionFactor => 1024^6);
	value zebi = UnitPrefix(name => "zebi", symbol => "Zi", conversionFactor => 1024^7);
	value yobi = UnitPrefix(name => "yobi", symbol => "Yi", conversionFactor => 1024^8);
}