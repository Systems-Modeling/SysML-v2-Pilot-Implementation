package PackageAlias1{
	alias A_alias for A;
	feature A{
		feature a{}
		feature a_alias is a;
	}
	alias AA_alias for AA;
	feature AA{
		feature aa{}
		feature aa_alias is aa;
	}
}