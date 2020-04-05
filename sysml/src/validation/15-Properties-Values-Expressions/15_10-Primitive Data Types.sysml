package '15.10-Primitive Data Types' {
	/*
	 * The following primitive data types are defined in the normative Kernel model library.
	 * Any more specialized data types can be declared in user-defined model libraries or
	 * models as needed.
	 */
	 
	/**
	 * The unqualified Integer is signed, in line with integer numbers in mathematics.
	 */
	import ScalarValues::Integer;
	
	import ScalarValues::Natural;
	/** Mathematically, unsigned integers are just natural numbers (non-negative integers). */
	value type UnsignedInteger :> Natural;
	
	/**
	 * The unqualified Real is signed, in line with real numbers in mathematics.
	 */
	import ScalarValues::Real;
	
	/* TODO: Move this to the model library. */
	value type UnsignedReal :> Real {
		assert constraint { self >= 0.0 }
	}
	
	/**
	 * String values that are sequences of characters.
	 * TODO: Specify any requirements on character encoding.
	 */
	import ScalarValues::String;
	
	/**
	 * Boolean type has two legal values: true, false.
	 */
	import ScalarValues::Boolean;
	
	/* TODO: Specify standardized string encodings. */
	import Time::DateTime;
	
	/* TODO: Define support for enumeration types. */
}