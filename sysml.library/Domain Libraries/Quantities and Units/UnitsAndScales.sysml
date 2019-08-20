package UnitsAndScales {

	/**
	 * Top-level representation of measurement scale.
	 * 
	 * A MeasurementScale can have zero or more scaleValueDefinition that define particular essential 
	 * values on the measurement scale.
	 */
	abstract block MeasurementScale {
		value name: ScalarValues::String; 
		part scaleValueDefinition: ScaleValueDefinition[0..*];
	}
	
	/**
	 * Representation of a measurement unit.
	 * 
	 * Note: MeasurementUnit specializes MeasurementScale in order to allow for efficient and intuitive definition of a ratio scale.
	 * 
	 * A MeasurementUnit can be used in two ways:
	 * 1. Directly as the scale in a QuantityValue, which implies that the effective measurement scale is a ratio scale.
	 * 2. As the unit value of a non-ratio scale, see the specializations of NonRatioScale.
	 * 
	 * A MeasurementUnit specifies one or more UnitPowerFactor 
	 */
	abstract block MeasurementUnit :> MeasurementScale { 
		value unitPowerFactor: UnitPowerFactor[1..*] ordered;
		part unitConversion: UnitConversion[0..1];
	}
	
	/**
	 * Representation of a measurement unit that does not depend on any other measurement unit.
	 */
	abstract block SimpleUnit :> MeasurementUnit {
		ref self : SimpleUnit redefines Base::self;
		value unitPowerFactor: UnitPowerFactor redefines MeasurementUnit::unitPowerFactor {
			ref unit redefines UnitPowerFactor::unit = self;
			value exponent redefines UnitPowerFactor::exponent = 1;			
		}
	}
	
	/**
	 * Representation of a measurement unit that depends on one or more powers of other measurement units.
	 */
	abstract block DerivedUnit :> MeasurementUnit;
	
	/**
	 * Representation of a measurement unit power factor
	 * 
	 * Specifies a tuple of a referenced measurement unit and an exponent.
	 */
	value type UnitPowerFactor {
		ref unit: MeasurementUnit;
		value exponent: ScalarValues::Number;
	}
	
	/**
	 * Representation of the linear conversion relationship between one measurement unit and another measurement unit, that acts as a reference.  
	 */
	abstract block UnitConversion {
		ref referenceUnit: MeasurementUnit;
		value conversionFactor: ScalarValues::Number;
	}
	
	/**
	 * Representation of a UnitConversion that is defined according to some convention.
	 */
	block ConversionByConvention :> UnitConversion { }
	
	/**
	 * Representation of a UnitConversion that is defined through reference to a named unit prefix associated to a conversion factor 
	 * that is a decimal or binary multiple or sub-multiple, as defined in ISO/IEC 80000-1.
	 * 
	 * Note: The actual value of the conversion factor is derived from the definition of the unit prefix.
	 * 
	 * Examples: kilometre for conversion factor 1000 with reference unit metre, nanofarad for 1E-9 farad.
	 */
	block ConversionByPrefix :> UnitConversion {
		ref prefix: UnitPrefix {
			value conversionFactor: ScalarValues::Real redefines UnitPrefix::conversionFactor;
		}
		value conversionFactor redefines UnitConversion::conversionFactor = prefix.conversionFactor;		
	}

	/**
	 * Representation of a multiple or sub-multiple measurement unit prefix as defined in ISO/IEC 80000-1.
	 */	
	block UnitPrefix {
		value name: ScalarValues::String;
		value symbol: ScalarValues::String;
		value conversionFactor: ScalarValues::Integer;
	}
	
		
	/**
	 * Representation of a non-ratio measurement scale as opposed to a ratio measurement scale.
	 * 
	 * Note: A ratio scale is implied by direct use of a MeasurementUnit as the scale in a QuantityValue.
	 */
	abstract block NonRatioScale :> MeasurementScale {
		ref unit: MeasurementUnit;
		part scaleValueMapping: ScaleValueMapping[0..1];	
	}
	
	/**
	 * Representation of an ordinal measurement scale.
	 */
	block OrdinalScale :> NonRatioScale;
	
	/**
	 * Representation of an interval measurement scale.
	 * 
	 * The offset of one interval measurement scale w.r.t. another interval or ratio scale is defined through a scaleValueMapping, see NonRatioScale.
	 */
	block IntervalScale :> NonRatioScale;
	
	/**
	 * Representation of a ratio measurement scale with a periodic cycle.
	 * 
	 * Note: The magnitude of the periodic cycle is defined by the modulus of the scale.
	 * Example: Planar angle with modulus 360 degree, therefore on such a cyclic ration scale 
	 * an angle of 450 degree is equivalent to an angle of 90 degree, and -60 degree is equivalent to 300 degree.
	 */
	block CyclicRatioScale :> NonRatioScale { 
		value modulus: ScalarValues::Number;
	}

	/**
	 * Representation of a logarithmic measurement scale
	 * 
	 * The magnitude v of a ratio quantity value expressed on a logarithmic scale 
	 * for a magnitude x of a quantity value expressed on a ratio scale is computed as follows:
	 *   v = f · log_base( (x / x_ref )^a )
     * where:
	 *   f is a multiplication factor,
     *   log_base is the log function for the given logarithm base,
     *   x is the actual quantity,
     *   x_ref is a reference quantity,
     *   a is an exponent.
	 */
	block LogarithmicScale :> NonRatioScale {
		value logarithmBase: ScalarValues::Number;
		value factor: ScalarValues::Number;
		value exponent: ScalarValues::Number;
		value referenceQuantity: Quantities::QuantityValue[0..1];
	}
	
	/**
	 * Representation of the mapping of equivalent quantity values expressed on two different measurement scales
	 * 
	 * Example: The mapping between the equivalent temperature quantity values of 273.16 K on kelvin ratio scale 
	 * and 0.01 degree Celsius on the celsius interval scale would specify a referenceScaleValue referencing the 
	 * ScaleValueDefinition (273.16, "absolute thermodynamic temperature of the triple point of water") of the kelvin ratio scale
	 * and specify a mappedScaleValue referencing the 
	 * ScaleValueDefinition (0.01, "absolute thermodynamic temperature of the triple point of water") of the celsius interval scale.
	 */
	block ScaleValueMapping {
		ref referenceScaleValue: ScaleValueDefinition;	
		ref mappedScaleValue: ScaleValueDefinition;
	}
	
	/**
	 * Representation of a particular value on a measurement scale
	 * 
	 * Typically such a particular value is defined by convention.
	 * Example: The 'kelvin' ratio scale for temperature could have a 
	 * ScaleValueDefinition(magnitude => 273.16, description => "absolute temperature of the triple point of pure water")
	 * that is part of the definition of the scale.
	 */
	block ScaleValueDefinition {
		value magnitude: ScalarValues::Number;
		value description: ScalarValues::String;
	}
	
	/**
	 * Representation of a quantity dimension, which is a product of powers of the set of base quantities defined for a particular system of quantities, scales and units
	 */
	value type QuantityDimension {
		// Should be ordered or the order should be derived from an ordered set of base units
		value baseUnitPowerFactor: UnitPowerFactor[0..*] ordered;
	}
}