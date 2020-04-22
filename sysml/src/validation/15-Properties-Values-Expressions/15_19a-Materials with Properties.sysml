package '15_19a-Materials with Properties' {
	import SI::*;
	
	// TODO: Move definition of atomic mass and Da to SI
	block AtomicMassUnit :> MassUnit;
        
    value type AtomicMassValue :> QuantityValue {
		value num: Real :>> QuantityValue::num;
    	ref mRef: AtomicMassUnit :>> QuantityValue::mRef;
    }
    
    part Da: AtomicMassUnit = AtomicMassUnit(
    	name => "dalton", 
    	unitConversion => ConversionByConvention(referenceUnit => kg, conversionFactor => 1.66053906660e-27)
    );
    
	// TODO: Move definition of tensile strength and N/mm² to SI
    block TensileStrengthUnit :> SIDerivedUnit {
		value lengthPowerFactor :>> SIDerivedUnit::lengthPowerFactor {
			value exponent :>> UnitPowerFactor::exponent = -1;
		}
		value massPowerFactor :>> SIDerivedUnit::massPowerFactor {
			value exponent :>> UnitPowerFactor::exponent = 1;
		}
		value timePowerFactor :>> SIDerivedUnit::timePowerFactor {
			value exponent :>> UnitPowerFactor::exponent = -2;
		}
    }
    
    value type TensileStrengthValue :> QuantityValue {
		value num: Real redefines QuantityValue::num;
    	ref mRef: TensileStrengthUnit redefines QuantityValue::mRef;
    }
    
    part 'N/mm²': TensileStrengthUnit = N / mm**2 {
    	value name :>> MeasurementReference::name = "newton per square millimetre";
    }

    value type Substance;
	value type Material :> Substance;
	
	/*
	 * The classification of materials into metals and alloys is grossly simplified and not exhaustive.
	 * A more complete classification would include: ChemicalSubstance, PureMaterial, MixedMaterial,
	 * Class, Ceramic, OrganicMaterial, AnorganicMaterial, Polymer, HybridMaterial, CompositeMaterial,
	 * etc.
	 */

    value type Metal :> Material {
        value atomicMass: AtomicMassValue[1];
    }

    value type Alloy :> Material {
        value fractions: MaterialFraction[2..*];
    }

    value type MaterialFraction {
        ref material: Material[1]; 
        value massFraction: MassFractionValue[1];
    }

    value type MassFractionValue :> DimensionOneValue;    

	/*
	 * Value properties bound to specifically constructed compound values.
	 */
    value Iron = Metal(atomicMass => 55.845@[Da]);
    value Carbon = Metal(atomicMass => 12.011@[Da]);
    value Manganese = Metal(atomicMass => 54.938@[Da]);
    
	/**
	 * Value property with redefined/added sub-properties.
	 * (Particular example of high tensile strength steel.)
	 */
    value Steel_980 : Alloy {
    	value :>> fractions = {
    		MaterialFraction(Iron, 0.9862),
    		MaterialFraction(Carbon, 0.0018),
    		MaterialFraction(Manganese, 0.012)
    	};
        value tensileStrength: TensileStrengthValue = 980@['N/mm²'];
    }
  
}
