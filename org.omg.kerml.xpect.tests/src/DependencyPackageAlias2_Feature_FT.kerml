package PackageAlias2{
	public import PackageAlias1::*;
	feature B : A_alias{
		alias b for a_alias;
	}
}