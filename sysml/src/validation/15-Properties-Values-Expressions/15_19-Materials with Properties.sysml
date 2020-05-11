package '15_19-Materials with Properties' {
	import ScalarValues::Real;
	import Quantities::*;
	import UnitsAndScales::*;
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

    block Substance;
    block Material :> Substance;

	/*
	 * The classification of materials into metals and alloys is grossly simplified and not exhaustive.
	 * A more complete classification would include: ChemicalSubstance, PureMaterial, MixedMaterial,
	 * Class, Ceramic, OrganicMaterial, AnorganicMaterial, Polymer, HybridMaterial, CompositeMaterial,
	 * etc.
	 */

    block Metal :> Material {
        value atomicMass: AtomicMassValue[1];
    }

    value type MaterialFraction {
        ref material: Material[1]; 
        value massFraction: MassFractionValue[1];
    }

    value type MassFractionValue :> DimensionOneValue;    

    block Alloy :> Material {
        value fractions: MaterialFraction[2..*];
    }

    individual def Iron :> Metal {
        value :>> atomicMass = 55.845@[Da];
    }

    individual def Carbon :> Metal {
        value atomicMass :>> Metal::atomicMass = 12.011@[Da];
    }

    individual def Manganese :> Metal {
        value atomicMass :>> Metal::atomicMass = 54.938@[Da];
    }

 	/**
	 * Particular example of high tensile strength steel.
	 */
    individual def Steel_980 :> Alloy {
        value fraction1 :> fractions {
        	ref :>> material : Iron;
        	value :>> massFraction = 0.9862;
        }
        
        value fraction2 :> fractions {
        	ref :>> material : Carbon;
        	value :>> massFraction = 0.9862;
        }
        
        value fraction3 :> fractions {
        	ref :>> material : Manganese;
        	value :>> massFraction = 0.9862;
        }
        
        value tensileStrength: TensileStrengthValue = 980@['N/mm²'];
    }
}
