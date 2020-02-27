package PackageAlias2{
	import PackageAlias1::*;
	feature B : A_alias{
		feature b is a_alias{}
	}
}