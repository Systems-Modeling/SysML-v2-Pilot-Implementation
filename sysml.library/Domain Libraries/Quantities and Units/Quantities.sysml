/**
 * This package defines the root representations for quantities and their values.
 */
package Quantities {
	
	/**
	 * The value of a quantity is a tuple of a magnitude (i.e. the mathematical number value) and a reference to a MeasurementScale.
	 * The scale may directly reference a MeasurementUnit, which implies an associated measurement scale that is a ratio scale.
	 */
	abstract value type QuantityValue :> ScalarValues::NumericalValue {
		value magnitude: ScalarValues::Number;
		ref scale: UnitsAndScales::MeasurementScale;
	}
	
	/**
	 * Quantities are defined as self-standing features that can then be used consistently to instantiate quantities as 
	 * properties of SysML objects. Each quantity feature is a specialization of the root feature 'quantity' and, so, 
	 * must be typed by a QuantityValue, i.e. the range of a quantity feature is a suitable specialization of QuantityValue.
	 */
	value quantity: QuantityValue;
}