package PackageAlias2{
	public import PackageAlias1::*;
	class B specializes A_alias{
		alias b for a_alias;
	}
}