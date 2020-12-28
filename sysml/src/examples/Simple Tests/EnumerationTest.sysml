package EnumerationTest {
	
	attribute def Color {
		attribute val : ScalarValues::Natural;
	}
	
	/**
	 * An EnumerationDefinition can contain only EnumerationUsages. However,
	 * it can specialize an AttributeDefinition in order to inherit
	 * common features for its enumeration values.
	 */
	enum def ColorKind :> Color {
		enum red {
			:>> val = 0;
		}
		enum blue {
			:>> val = 1;
		}
		enum green {
			:>> val = 2;
		}
	}
	
	enum color : ColorKind;
	attribute color1 : ColorKind = ColorKind::blue;
	
	/**
	 * The "enum" keyword is optional for EnumerationUsages used to defined the
	 * enumerated values of an EnumerationDefinition.
	 */
	enum def E1 { a; b; c; }
	
	enum def E2;
	
}