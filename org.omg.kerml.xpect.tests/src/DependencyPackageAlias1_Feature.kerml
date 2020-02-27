package PackageAlias1{
	A_alias is A;
	feature A{
		feature a{}
			a_alias is a;
	}
	AA_alias is AA;
	feature AA{
		feature aa{}
		aa_alias is aa;
	}
}