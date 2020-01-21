package '15_19-Materials with Properties' {
    value type AtomicMassValue;

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

    part Iron: Metal {
        value atomicMass redefines Metal::atomicMass = 55.845@[Da];
    }

    part Carbon: Metal {
        value atomicMass redefines Metal::atomicMass = 12.011@[Da];
    }

    part Manganese: Metal {
        value atomicMass redefines Metal::atomicMass = 54.938@[Da];
    }

    value type TensileStrengthValue;

    block Alloy :> Material {
        value fractions: MaterialFraction[2..*];
    }

    part Steel_980: Alloy {
        value fractions redefines Alloy::fractions = {{Iron, 0.9862}, {Carbon, 0.0018}, {Manganese, 0.012}};
        value tensileStrength: TensileStrengthValue = 980@[N/mm^2];
    }
}
