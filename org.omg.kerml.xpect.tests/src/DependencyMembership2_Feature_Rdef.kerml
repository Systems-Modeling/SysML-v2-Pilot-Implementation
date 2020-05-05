package OuterPackage3{
	import OuterPackage2::C;
	feature D subsets C{
		feature f redefines b;
	}
}