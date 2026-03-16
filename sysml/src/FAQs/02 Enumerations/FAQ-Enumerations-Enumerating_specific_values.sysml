package 'FAQ-Enumerations-Enumerating_specific_values' {
	doc /*
	 * How do you enumerate specific values?
	 * (Based on "Enum usage value assignment" by Santiago Leon, 11 Jan 2024)
	 */
	 
	private import ScalarValues::*;
	
	enum def ColorKind {
		enum none;
		enum red;
		enum blue;
		enum green;       
	}
	
	attribute colorKind : ColorKind = ColorKind::none;
	
	enum def ColorKindInt :> Integer {
		enum none = 0;
		enum red = 1;
		enum blue = 2;
		enum green = 3;       
	}
	
	attribute colorKindInt : ColorKindInt = 0;
}