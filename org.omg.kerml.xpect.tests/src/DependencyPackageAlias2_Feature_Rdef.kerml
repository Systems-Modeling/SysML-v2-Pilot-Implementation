package PackageAlias2{
	import PackageAlias1::*;
	feature B redefines A_alias{
		alias b for a_alias;
	}
}