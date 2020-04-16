/**
 * This package defines the root representations for quantities and their values.
 */
package Quantities {
	
	/**
	 * The value of a quantity is a tuple of a number (i.e. mathematical number value) and a reference to a MeasurementReference.
	 * The reference can be a MeasurementUnit, which implies that the associated measurement scale is a ratio scale,
	 * or a MeasurementScale, whose specializations represent all possible non-ratio scales.
	 */
	abstract value type QuantityValue :> ScalarValues::NumericalValue {
		value num: ScalarValues::Number;
		ref mRef: UnitsAndScales::MeasurementReference;
	}
	
	/**
	 * Quantities are defined as self-standing features that can then be used consistently to instantiate quantities as 
	 * properties of SysML objects. Each quantity feature is a specialization of the root feature 'quantity' and, so, 
	 * must be typed by a QuantityValue, i.e. the range of a quantity feature is a suitable specialization of QuantityValue.
	 */
	value quantity: QuantityValue;
}