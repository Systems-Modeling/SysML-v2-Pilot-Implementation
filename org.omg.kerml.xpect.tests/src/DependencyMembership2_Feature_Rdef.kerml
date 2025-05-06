package OuterPackage3{
	public import OuterPackage2::C;
	feature D subsets C{
		feature f redefines b;
	}
}