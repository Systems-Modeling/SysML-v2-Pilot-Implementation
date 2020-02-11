package '15_19-Materials with Properties' {
	import SI::*;
	
	/** This needs to be fully defined. */
    block AtomicMassUnit :> MeasurementUnit;
        
    part Da = AtomicMassUnit();

    value type AtomicMassValue :> QuantityValue {
		value magnitude: Real redefines QuantityValue::magnitude;
    	ref scale: AtomicMassUnit redefines QuantityValue::scale;
    }
    
    block TensileStrengthUnit :> MeasurementUnit {
		value lengthPowerFactor redefines SIDerivedUnit::lengthPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = -1;
		}
		value massPowerFactor redefines SIDerivedUnit::massPowerFactor {
			value exponent redefines UnitPowerFactor::exponent = 1;
		}
		value timePowerFactor redefines SIDerivedUnit::timePowerFactor {
			value exponent redefines UnitPowerFactor::exponent = -2;
		}
    }
    
    value type TensileStrengthValue :> QuantityValue {
		value magnitude: Real redefines QuantityValue::magnitude;
    	ref scale: TensileStrengthUnit redefines QuantityValue::scale;
    }

    block Substance;

    block Material :> Substance;

    value type MassFractionValue;

    value type MaterialFraction {
        ref material: Material; 
        value massFraction: MassFractionValue;
    }

    block Metal :> Material {
        value atomicMass: AtomicMassValue;
    }

    part Iron: Metal { // Individual
        value atomicMass redefines Metal::atomicMass = 55.845@[Da];
    }

    part Carbon: Metal { // Individual
        value atomicMass redefines Metal::atomicMass = 12.011@[Da];
    }

    part Manganese: Metal { // Individual
        value atomicMass redefines Metal::atomicMass = 54.938@[Da];
    }

    block Alloy :> Material {
        value fractions: MaterialFraction[2..*];
    }

    part Steel_980: Alloy { // Individual
        value fractions redefines Alloy::fractions = { 
        	MaterialFraction(Iron, 0.9862), 
        	MaterialFraction(Carbon, 0.0018), 
        	MaterialFraction(Manganese, 0.012)
        };
        value tensileStrength: TensileStrengthValue = 980@[N/(mm^2)];
    }
}
