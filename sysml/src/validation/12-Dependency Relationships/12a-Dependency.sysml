package '12a-Dependency' {
	
	package 'Application Layer';
	package 'Service Layer';
	package 'Data Layer';
	
	dependency Usage of 'Application Layer' on 'Service Layer';
	dependency of 'Service Layer' on 'Data Layer';
	
	attribute x;
	attribute y;
	attribute z;
	
	dependency z on x, y;
	
}