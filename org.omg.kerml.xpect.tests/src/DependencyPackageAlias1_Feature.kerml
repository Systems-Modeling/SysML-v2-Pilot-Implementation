package PackageAlias1{
	alias A as A_alias;
	feature A{
		feature a{}
		feature a_alias is a;
	}
	alias AA as AA_alias;
	feature AA{
		feature aa{}
		feature aa_alias is aa;
	}
}