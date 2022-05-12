package PackageAlias1{
	alias A_alias for A;
	feature A{
		feature a{}
		alias a_alias for a;
	}
	alias AA_alias for AA;
	feature AA{
		feature aa{}
		alias aa_alias for aa;
	}
}