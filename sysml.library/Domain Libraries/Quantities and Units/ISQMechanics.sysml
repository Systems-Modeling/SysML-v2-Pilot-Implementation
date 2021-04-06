/**
 * International System of Quantities and Units
 * Generated on 2021-04-05T19:46:40Z from standard ISO-80000-4:2019 "Mechanics"
 * see also https://www.iso.org/obp/ui/#iso:std:iso:80000:-4:ed-2:v1:en
 *
 * Note 1: In documentation comments, AsciiMath notation (see http://asciimath.org/) is used for mathematical concepts,
 * with Greek letters in Unicode encoding. In running text, AsciiMath is placed between backticks.
 * Note 2: For vector and tensor quantities currently the unit and quantity value type for their (scalar) magnitude is 
 * defined, as well as their typical Cartesian 3d VectorMeasurementReference (i.e. coordinate system) 
 * or TensorMeasurementReference.
 */
package ISQMechanics {
    private import ScalarValues::Real;
    private import Quantities::*;
    private import UnitsAndScales::*;
    private import ISQBase::*;

    private import ISQThermodynamics::energyQuantities;
    private import ISQThermodynamics::EnergyValue;

    /**
     * source: item 4-1 mass
     * symbol(s): `m`
     * application domain: generic
     * name: Mass
     * quantity dimension: M^1
     * measurement unit(s): kg
     * tensor order: 0
     * definition: property of a body which expresses itself in terms of inertia with regard to changes in its state of motion as well as its gravitational attraction to other bodies
     * remarks: The kilogram (kg) is one of the seven base units (see ISO 80000-1) of the International System of Units, the SI. See also IEC 60050-113.
     */

    /**
     * See package ISQBase for the declarations for item 4-1:
     * base unit MassUnit and quantity type MassValue.
     */

    /**
     * source: item 4-2 mass density, density
     * symbol(s): `ρ`, `ρ_m`
     * application domain: generic
     * name: MassDensity
     * quantity dimension: L^-3*M^1
     * measurement unit(s): kg*m^-3
     * tensor order: 0
     * definition: quantity representing the spatial distribution of mass of a continuous material: `ρ(vec(r)) = (dm)/(dV)` where `m` is mass of the material contained in an infinitesimal domain at point `vec(r)` and `V` is volume of this domain
     * remarks: 
     */
    attribute def MassDensityUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = -3; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF}; }
    }

    attribute def MassDensityValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: MassDensityUnit[1];
    }
    attribute massDensityQuantities: MassDensityValue[*] nonunique :> scalarQuantities;
    attribute massDensity: MassDensityValue[1] :> massDensityQuantities;

    alias MassDensityUnit as DensityUnit;
    alias MassDensityValue as DensityValue;
    alias massDensityQuantities as densityQuantities;
    alias massDensity as density;

    /**
     * source: item 4-3 specific volume
     * symbol(s): `v`
     * application domain: generic
     * name: SpecificVolume
     * quantity dimension: L^3*M^-1
     * measurement unit(s): kg^-1*m^3
     * tensor order: 0
     * definition: reciprocal of mass density `ρ` (item 4-2): `v = 1/ρ`
     * remarks: 
     */
    attribute def SpecificVolumeUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 3; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = -1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF}; }
    }

    attribute def SpecificVolumeValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: SpecificVolumeUnit[1];
    }
    attribute specificVolumeQuantities: SpecificVolumeValue[*] nonunique :> scalarQuantities;
    attribute specificVolume: SpecificVolumeValue[1] :> specificVolumeQuantities;

    /**
     * source: item 4-4 relative mass density, relative density
     * symbol(s): `d`
     * application domain: generic
     * name: RelativeMassDensity
     * quantity dimension: 1
     * measurement unit(s): 1
     * tensor order: 0
     * definition: quotient of mass density of a substance `ρ` and mass density of a reference substance `ρ_0` : `d = ρ/ρ_0`
     * remarks: Conditions and material should be specified for the reference substance.
     */
    attribute def RelativeMassDensityUnit :> DimensionOneUnit {
        attribute :>> quantityDimension { :>> quantityPowerFactors = {}; }
    }

    attribute def RelativeMassDensityValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: RelativeMassDensityUnit[1];
    }
    attribute relativeMassDensityQuantities: RelativeMassDensityValue[*] nonunique :> scalarQuantities;
    attribute relativeMassDensity: RelativeMassDensityValue[1] :> relativeMassDensityQuantities;

    alias RelativeMassDensityUnit as RelativeDensityUnit;
    alias RelativeMassDensityValue as RelativeDensityValue;
    alias relativeMassDensityQuantities as relativeDensityQuantities;
    alias relativeMassDensity as relativeDensity;

    /**
     * source: item 4-5 surface mass density, surface density
     * symbol(s): `ρ_A`
     * application domain: generic
     * name: SurfaceMassDensity
     * quantity dimension: L^-2*M^1
     * measurement unit(s): kg*m^-2
     * tensor order: 0
     * definition: quantity representing the areal distribution of mass of a continuous material: `ρ_A(vec(r)) = (dm)/(dA)` where `m` is the mass of the material at position `vec(r)` and `A` is area
     * remarks: The name “grammage” should not be used for this quantity.
     */
    attribute def SurfaceMassDensityUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = -2; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF}; }
    }

    attribute def SurfaceMassDensityValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: SurfaceMassDensityUnit[1];
    }
    attribute surfaceMassDensityQuantities: SurfaceMassDensityValue[*] nonunique :> scalarQuantities;
    attribute surfaceMassDensity: SurfaceMassDensityValue[1] :> surfaceMassDensityQuantities;

    alias SurfaceMassDensityUnit as SurfaceDensityUnit;
    alias SurfaceMassDensityValue as SurfaceDensityValue;
    alias surfaceMassDensityQuantities as surfaceDensityQuantities;
    alias surfaceMassDensity as surfaceDensity;

    /**
     * source: item 4-6 linear mass density, linear density
     * symbol(s): `ρ_I`
     * application domain: generic
     * name: LinearMassDensity
     * quantity dimension: L^-1*M^1
     * measurement unit(s): kg*m^-1
     * tensor order: 0
     * definition: quantity representing the linear distribution of mass of a continuous material: `ρ_I(vec(r)) = (dm)/(dI)` where `m` is the mass of the material at position `vec(r)` and `l` is length
     * remarks: 
     */
    attribute def LinearMassDensityUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = -1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF}; }
    }

    attribute def LinearMassDensityValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: LinearMassDensityUnit[1];
    }
    attribute linearMassDensityQuantities: LinearMassDensityValue[*] nonunique :> scalarQuantities;
    attribute linearMassDensity: LinearMassDensityValue[1] :> linearMassDensityQuantities;

    alias LinearMassDensityUnit as LinearDensityUnit;
    alias LinearMassDensityValue as LinearDensityValue;
    alias linearMassDensityQuantities as linearDensityQuantities;
    alias linearMassDensity as linearDensity;

    /**
     * source: item 4-7 moment of inertia (scalar)
     * symbol(s): `J`
     * application domain: generic
     * name: MomentOfInertia
     * quantity dimension: L^2*M^1
     * measurement unit(s): kg*m^2
     * tensor order: 2
     * definition: tensor (ISO 80000-2) quantity representing rotational inertia of a rigid body relative to a fixed centre of rotation expressed by the tensor product: `vec(L) = vec(vec(J)) vec(ω)` where `vec(L)` is angular momentum (item 4-11) of the body relative to the reference point and `vec(ω)` is its angular velocity (ISO 80000-3)
     * remarks: The calculation of the value requires an integration.
     */
    attribute def MomentOfInertiaUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 2; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF}; }
    }

    attribute def MomentOfInertiaValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: MomentOfInertiaUnit[1];
    }
    attribute momentOfInertiaQuantities: MomentOfInertiaValue[*] nonunique :> scalarQuantities;
    attribute momentOfInertia: MomentOfInertiaValue[1] :> momentOfInertiaQuantities;

    /**
     * source: item 4-7 moment of inertia (tensor)
     * symbol(s): `vec(vec(J))`
     * application domain: generic
     * name: MomentOfInertia
     * quantity dimension: L^2*M^1
     * measurement unit(s): kg*m^2
     * tensor order: 2
     * definition: tensor (ISO 80000-2) quantity representing rotational inertia of a rigid body relative to a fixed centre of rotation expressed by the tensor product: `vec(L) = vec(vec(J)) vec(ω)` where `vec(L)` is angular momentum (item 4-11) of the body relative to the reference point and `vec(ω)` is its angular velocity (ISO 80000-3)
     * remarks: The calculation of the value requires an integration.
     */
    attribute def Cartesian3dMomentOfInertiaMeasurementReference :> TensorMeasurementReference {
        attribute :>> dimensions = {3, 3};
        attribute :>> isBound = false;
        attribute :>> mRefs: MomentOfInertiaUnit[9];
    }

    attribute def Cartesian3dMomentOfInertiaTensor :> TensorQuantityValue {
        attribute :>> isBound = false;
        attribute :>> num: Real[9];
        attribute :>> mRef: Cartesian3dMomentOfInertiaMeasurementReference[1];
    }
    attribute momentOfInertiaTensors: Cartesian3dMomentOfInertiaTensor[*] nonunique :> tensorQuantities;
    attribute momentOfInertiaTensor: Cartesian3dMomentOfInertiaTensor[1] :> momentOfInertiaTensors;

    /**
     * source: item 4-8 momentum (scalar)
     * symbol(s): `p`
     * application domain: generic
     * name: Momentum
     * quantity dimension: L^1*M^1*T^-1
     * measurement unit(s): kg*m*s^-1
     * tensor order: 1
     * definition: product of mass `m` (item 4-1) of a body and velocity `vec(v)` (ISO 80000-3) of its centre of mass: `vec(p) = m  vec(v)`
     * remarks: 
     */
    attribute def MomentumUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def MomentumValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: MomentumUnit[1];
    }
    attribute momentumQuantities: MomentumValue[*] nonunique :> scalarQuantities;
    attribute momentum: MomentumValue[1] :> momentumQuantities;

    /**
     * source: item 4-8 momentum (vector)
     * symbol(s): `vec(p)`
     * application domain: generic
     * name: Momentum
     * quantity dimension: L^1*M^1*T^-1
     * measurement unit(s): kg*m*s^-1
     * tensor order: 1
     * definition: product of mass `m` (item 4-1) of a body and velocity `vec(v)` (ISO 80000-3) of its centre of mass: `vec(p) = m  vec(v)`
     * remarks: 
     */
    attribute def Cartesian3dMomentumCoordinateSystem :> VectorMeasurementReference {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> isOrthogonal = true;
        attribute :>> mRefs: MomentumUnit[3];
    }

    attribute def Cartesian3dMomentumVector :> VectorQuantityValue {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> num: Real[3];
        attribute :>> mRef: Cartesian3dMomentumCoordinateSystem[1];
    }
    attribute momentumVectors: Cartesian3dMomentumVector[*] nonunique :> vectorQuantities;
    attribute momentumVector: Cartesian3dMomentumVector[1] :> momentumVectors;

    /**
     * source: item 4-9.1 force (scalar)
     * symbol(s): `F`
     * application domain: generic
     * name: Force
     * quantity dimension: L^1*M^1*T^-2
     * measurement unit(s): N, kg*m*s^-2
     * tensor order: 1
     * definition: vector (ISO 80000-2) quantity describing interaction between bodies or particles
     * remarks: 
     */
    attribute def ForceUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def ForceValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: ForceUnit[1];
    }
    attribute forceQuantities: ForceValue[*] nonunique :> scalarQuantities;
    attribute force: ForceValue[1] :> forceQuantities;

    /**
     * source: item 4-9.1 force (vector)
     * symbol(s): `vec(F)`
     * application domain: generic
     * name: Force
     * quantity dimension: L^1*M^1*T^-2
     * measurement unit(s): N, kg*m*s^-2
     * tensor order: 1
     * definition: vector (ISO 80000-2) quantity describing interaction between bodies or particles
     * remarks: 
     */
    attribute def Cartesian3dForceCoordinateSystem :> VectorMeasurementReference {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> isOrthogonal = true;
        attribute :>> mRefs: ForceUnit[3];
    }

    attribute def Cartesian3dForceVector :> VectorQuantityValue {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> num: Real[3];
        attribute :>> mRef: Cartesian3dForceCoordinateSystem[1];
    }
    attribute forceVectors: Cartesian3dForceVector[*] nonunique :> vectorQuantities;
    attribute forceVector: Cartesian3dForceVector[1] :> forceVectors;

    /**
     * source: item 4-9.2 weight
     * symbol(s): `vec(F_g)`
     * application domain: generic
     * name: Weight (specializes Force)
     * quantity dimension: L^1*M^1*T^-2
     * measurement unit(s): N, kg*m*s^-2
     * tensor order: 1
     * definition: force (item 4-9.1) acting on a body in the gravitational field of Earth: `vec(F_g) = m vec(g)` where `m` (item 4-1) is the mass of the body and `vec(g)` is the local acceleration of free fall (ISO 80000-3)
     * remarks: In colloquial language, the name “weight” continues to be used where “mass” is meant. This practice should be avoided. Weight is an example of a gravitational force. Weight comprises not only the local gravitational force but also the local centrifugal force due to the rotation of the Earth.
     */
    attribute def Cartesian3dWeightVector :> VectorQuantityValue {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> num: Real[3];
        attribute :>> mRef: Cartesian3dForceCoordinateSystem[1];
    }
    attribute weightVectors: Cartesian3dWeightVector[*] nonunique :> vectorQuantities;
    attribute weightVector: Cartesian3dWeightVector[1] :> weightVectors;

    /**
     * source: item 4-9.3 static friction force, static friction
     * symbol(s): `vec(F_s)`
     * application domain: generic
     * name: StaticFrictionForce (specializes Force)
     * quantity dimension: L^1*M^1*T^-2
     * measurement unit(s): N, kg*m*s^-2
     * tensor order: 1
     * definition: force (item 4-9.1) resisting the motion before a body starts to slide on a surface
     * remarks: For the static friction coefficient, see item 4-23.1.
     */
    attribute def Cartesian3dStaticFrictionForceVector :> VectorQuantityValue {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> num: Real[3];
        attribute :>> mRef: Cartesian3dForceCoordinateSystem[1];
    }
    attribute staticFrictionForceVectors: Cartesian3dStaticFrictionForceVector[*] nonunique :> vectorQuantities;
    attribute staticFrictionForceVector: Cartesian3dStaticFrictionForceVector[1] :> staticFrictionForceVectors;

    alias staticFrictionForceVector as staticFrictionVector;

    /**
     * source: item 4-9.4 kinetic friction force, dynamic friction force
     * symbol(s): `vec(F_μ)`
     * application domain: generic
     * name: KineticFrictionForce (specializes Force)
     * quantity dimension: L^1*M^1*T^-2
     * measurement unit(s): N, kg*m*s^-2
     * tensor order: 1
     * definition: force (item 4-9.1) resisting the motion when a body slides on a surface
     * remarks: For the kinetic friction factor, see item 4-23.2.
     */
    attribute def Cartesian3dKineticFrictionForceVector :> VectorQuantityValue {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> num: Real[3];
        attribute :>> mRef: Cartesian3dForceCoordinateSystem[1];
    }
    attribute kineticFrictionForceVectors: Cartesian3dKineticFrictionForceVector[*] nonunique :> vectorQuantities;
    attribute kineticFrictionForceVector: Cartesian3dKineticFrictionForceVector[1] :> kineticFrictionForceVectors;

    alias kineticFrictionForceVector as dynamicFrictionForceVector;

    /**
     * source: item 4-9.5 rolling resistance, rolling drag, rolling friction force
     * symbol(s): `vec(F_"rr")`
     * application domain: generic
     * name: RollingResistance (specializes Force)
     * quantity dimension: L^1*M^1*T^-2
     * measurement unit(s): N, kg*m*s^-2
     * tensor order: 1
     * definition: force (item 4-9.1) resisting the motion when a body rolls on a surface
     * remarks: For the rolling resistance factor, see item 4-23.3.
     */
    attribute def Cartesian3dRollingResistanceVector :> VectorQuantityValue {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> num: Real[3];
        attribute :>> mRef: Cartesian3dForceCoordinateSystem[1];
    }
    attribute rollingResistanceVectors: Cartesian3dRollingResistanceVector[*] nonunique :> vectorQuantities;
    attribute rollingResistanceVector: Cartesian3dRollingResistanceVector[1] :> rollingResistanceVectors;

    alias rollingResistanceVector as rollingDragVector;

    alias rollingResistanceVector as rollingFrictionForceVector;

    /**
     * source: item 4-9.6 drag force
     * symbol(s): `vec(F_D)`
     * application domain: generic
     * name: DragForce (specializes Force)
     * quantity dimension: L^1*M^1*T^-2
     * measurement unit(s): N, kg*m*s^-2
     * tensor order: 1
     * definition: force (item 4-9.1) resisting the motion of a body in a fluid
     * remarks: For the drag coefficient, see item 4-23.4.
     */
    attribute def Cartesian3dDragForceVector :> VectorQuantityValue {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> num: Real[3];
        attribute :>> mRef: Cartesian3dForceCoordinateSystem[1];
    }
    attribute dragForceVectors: Cartesian3dDragForceVector[*] nonunique :> vectorQuantities;
    attribute dragForceVector: Cartesian3dDragForceVector[1] :> dragForceVectors;

    /**
     * source: item 4-10 impulse (scalar)
     * symbol(s): `I`
     * application domain: generic
     * name: Impulse
     * quantity dimension: L^1*M^1*T^-1
     * measurement unit(s): N*s, kg*m*s^-1
     * tensor order: 1
     * definition: vector (ISO 80000-2) quantity describing the effect of force acting during a time interval: `vec(I) = int_(t_1)^(t_2) vec(F)*dt` where `vec(F)` is force (item 4-9.1), `t` is time (ISO 80000-3) and `[t_1, t_2]` is considered time interval
     * remarks: For a time interval `[t_1, t_2]`, `vec(I)(t_1, t_2) = vec(p)(t_1) - vec(p)(t_2) = vec(Δp)` where `vec(p)` is momentum (item 4-8).
     */
    attribute def ImpulseUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def ImpulseValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: ImpulseUnit[1];
    }
    attribute impulseQuantities: ImpulseValue[*] nonunique :> scalarQuantities;
    attribute impulse: ImpulseValue[1] :> impulseQuantities;

    /**
     * source: item 4-10 impulse (vector)
     * symbol(s): `vec(I)`
     * application domain: generic
     * name: Impulse
     * quantity dimension: L^1*M^1*T^-1
     * measurement unit(s): N*s, kg*m*s^-1
     * tensor order: 1
     * definition: vector (ISO 80000-2) quantity describing the effect of force acting during a time interval: `vec(I) = int_(t_1)^(t_2) vec(F)*dt` where `vec(F)` is force (item 4-9.1), `t` is time (ISO 80000-3) and `[t_1, t_2]` is considered time interval
     * remarks: For a time interval `[t_1, t_2]`, `vec(I)(t_1, t_2) = vec(p)(t_1) - vec(p)(t_2) = vec(Δp)` where `vec(p)` is momentum (item 4-8).
     */
    attribute def Cartesian3dImpulseCoordinateSystem :> VectorMeasurementReference {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> isOrthogonal = true;
        attribute :>> mRefs: ImpulseUnit[3];
    }

    attribute def Cartesian3dImpulseVector :> VectorQuantityValue {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> num: Real[3];
        attribute :>> mRef: Cartesian3dImpulseCoordinateSystem[1];
    }
    attribute impulseVectors: Cartesian3dImpulseVector[*] nonunique :> vectorQuantities;
    attribute impulseVector: Cartesian3dImpulseVector[1] :> impulseVectors;

    /**
     * source: item 4-11 angular momentum (scalar)
     * symbol(s): `L`
     * application domain: generic
     * name: AngularMomentum
     * quantity dimension: L^2*M^1*T^-1
     * measurement unit(s): kg*m^2*s^-1
     * tensor order: 1
     * definition: vector (ISO 80000-2) quantity described by the vector product: `vec(L) = vec(r) xx vec(p)` where `vec(r)` is position vector (ISO 80000-3) with respect to the axis of rotation and `vec(p)` is momentum (item 4-8)
     * remarks: 
     */
    attribute def AngularMomentumUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 2; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def AngularMomentumValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: AngularMomentumUnit[1];
    }
    attribute angularMomentumQuantities: AngularMomentumValue[*] nonunique :> scalarQuantities;
    attribute angularMomentum: AngularMomentumValue[1] :> angularMomentumQuantities;

    /**
     * source: item 4-11 angular momentum (vector)
     * symbol(s): `vec(L)`
     * application domain: generic
     * name: AngularMomentum
     * quantity dimension: L^2*M^1*T^-1
     * measurement unit(s): kg*m^2*s^-1
     * tensor order: 1
     * definition: vector (ISO 80000-2) quantity described by the vector product: `vec(L) = vec(r) xx vec(p)` where `vec(r)` is position vector (ISO 80000-3) with respect to the axis of rotation and `vec(p)` is momentum (item 4-8)
     * remarks: 
     */
    attribute def Cartesian3dAngularMomentumCoordinateSystem :> VectorMeasurementReference {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> isOrthogonal = true;
        attribute :>> mRefs: AngularMomentumUnit[3];
    }

    attribute def Cartesian3dAngularMomentumVector :> VectorQuantityValue {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> num: Real[3];
        attribute :>> mRef: Cartesian3dAngularMomentumCoordinateSystem[1];
    }
    attribute angularMomentumVectors: Cartesian3dAngularMomentumVector[*] nonunique :> vectorQuantities;
    attribute angularMomentumVector: Cartesian3dAngularMomentumVector[1] :> angularMomentumVectors;

    /**
     * source: item 4-12.1 moment of force (scalar)
     * symbol(s): `M`
     * application domain: generic
     * name: MomentOfForce
     * quantity dimension: L^2*M^1*T^-2
     * measurement unit(s): N*m, kg*m^2*s^-2
     * tensor order: 1
     * definition: vector (ISO 80000-2) quantity described by the vector product: `vec(M) = vec(r) xx vec(F)` where `vec(r)` is position vector (ISO 80000-3) with respect to the axis of rotation and `vec(F)` is force (item 4-9.1)
     * remarks: The bending moment of force is denoted by `vec(M)_b`.
     */
    attribute def MomentOfForceUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 2; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def MomentOfForceValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: MomentOfForceUnit[1];
    }
    attribute momentOfForceQuantities: MomentOfForceValue[*] nonunique :> scalarQuantities;
    attribute momentOfForce: MomentOfForceValue[1] :> momentOfForceQuantities;

    /**
     * source: item 4-12.1 moment of force (vector)
     * symbol(s): `vec(M)`
     * application domain: generic
     * name: MomentOfForce
     * quantity dimension: L^2*M^1*T^-2
     * measurement unit(s): N*m, kg*m^2*s^-2
     * tensor order: 1
     * definition: vector (ISO 80000-2) quantity described by the vector product: `vec(M) = vec(r) xx vec(F)` where `vec(r)` is position vector (ISO 80000-3) with respect to the axis of rotation and `vec(F)` is force (item 4-9.1)
     * remarks: The bending moment of force is denoted by `vec(M)_b`.
     */
    attribute def Cartesian3dMomentOfForceCoordinateSystem :> VectorMeasurementReference {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> isOrthogonal = true;
        attribute :>> mRefs: MomentOfForceUnit[3];
    }

    attribute def Cartesian3dMomentOfForceVector :> VectorQuantityValue {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> num: Real[3];
        attribute :>> mRef: Cartesian3dMomentOfForceCoordinateSystem[1];
    }
    attribute momentOfForceVectors: Cartesian3dMomentOfForceVector[*] nonunique :> vectorQuantities;
    attribute momentOfForceVector: Cartesian3dMomentOfForceVector[1] :> momentOfForceVectors;

    /**
     * source: item 4-12.2 torque
     * symbol(s): `T`, `M_Q`
     * application domain: generic
     * name: Torque
     * quantity dimension: L^2*M^1*T^-2
     * measurement unit(s): N*m, kg*m^2*s^-2
     * tensor order: 0
     * definition: quantity described by the scalar product: `T = vec(M)*vec(e_Q)` where `vec(M)` is moment of force (item 4-12.1) and `vec(e_Q)` is unit vector of direction with respect to which the torque is considered
     * remarks: For example, torque is the twisting moment of force with respect to the longitudinal axis of a beam or shaft.
     */
    attribute def TorqueUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 2; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def TorqueValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: TorqueUnit[1];
    }
    attribute torqueQuantities: TorqueValue[*] nonunique :> scalarQuantities;
    attribute torque: TorqueValue[1] :> torqueQuantities;

    /**
     * source: item 4-13 angular impulse (scalar)
     * symbol(s): `H`
     * application domain: generic
     * name: AngularImpulse
     * quantity dimension: L^2*M^1*T^-1
     * measurement unit(s): N*m*s, kg*m^2*s^-1
     * tensor order: 1
     * definition: vector (ISO 80000-2) quantity describing the effect of moment of force during a time interval: `vec(H)(t_1; t_2) = int_(t_1)^(t_2) vec(M) dt` where `vec(M)` is moment of force (item 4-12.1), `t` is time (ISO 80000-3) and `[t_1, t_2]` is considered time interval
     * remarks: For a time interval `[t_1, t_2]`, `vec(H)(t_1, t_2) = vec(L)(t_1) - vec(L)(t_2) = vec(ΔL)` where `vec(L)` is angular momentum.
     */
    attribute def AngularImpulseUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 2; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def AngularImpulseValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: AngularImpulseUnit[1];
    }
    attribute angularImpulseQuantities: AngularImpulseValue[*] nonunique :> scalarQuantities;
    attribute angularImpulse: AngularImpulseValue[1] :> angularImpulseQuantities;

    /**
     * source: item 4-13 angular impulse (vector)
     * symbol(s): `vec(H)`
     * application domain: generic
     * name: AngularImpulse
     * quantity dimension: L^2*M^1*T^-1
     * measurement unit(s): N*m*s, kg*m^2*s^-1
     * tensor order: 1
     * definition: vector (ISO 80000-2) quantity describing the effect of moment of force during a time interval: `vec(H)(t_1; t_2) = int_(t_1)^(t_2) vec(M) dt` where `vec(M)` is moment of force (item 4-12.1), `t` is time (ISO 80000-3) and `[t_1, t_2]` is considered time interval
     * remarks: For a time interval `[t_1, t_2]`, `vec(H)(t_1, t_2) = vec(L)(t_1) - vec(L)(t_2) = vec(ΔL)` where `vec(L)` is angular momentum.
     */
    attribute def Cartesian3dAngularImpulseCoordinateSystem :> VectorMeasurementReference {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> isOrthogonal = true;
        attribute :>> mRefs: AngularImpulseUnit[3];
    }

    attribute def Cartesian3dAngularImpulseVector :> VectorQuantityValue {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> num: Real[3];
        attribute :>> mRef: Cartesian3dAngularImpulseCoordinateSystem[1];
    }
    attribute angularImpulseVectors: Cartesian3dAngularImpulseVector[*] nonunique :> vectorQuantities;
    attribute angularImpulseVector: Cartesian3dAngularImpulseVector[1] :> angularImpulseVectors;

    /**
     * source: item 4-14.1 pressure
     * symbol(s): `p`
     * application domain: generic
     * name: Pressure
     * quantity dimension: L^-1*M^1*T^-2
     * measurement unit(s): Pa, N*m^-2, kg*m^-1*s^-2
     * tensor order: 0
     * definition: quotient of the component of a force normal to a surface and its area: `p = (vec(e_n) * vec(F)) / A` where `vec(e_n)` is unit vector of the surface normal, `vec(F)` is force (item 4-9.1) and `A` is area (ISO 80000-3)
     * remarks: 
     */
    attribute def PressureUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = -1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def PressureValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: PressureUnit[1];
    }
    attribute pressureQuantities: PressureValue[*] nonunique :> scalarQuantities;
    attribute pressure: PressureValue[1] :> pressureQuantities;

    /**
     * source: item 4-14.2 gauge pressure
     * symbol(s): `p_e`
     * application domain: generic
     * name: GaugePressure (specializes Pressure)
     * quantity dimension: L^-1*M^1*T^-2
     * measurement unit(s): Pa, N*m^-2, kg*m^-1*s^-2
     * tensor order: 0
     * definition: pressure `p` (item 4-14.1) decremented by ambient pressure `p_amb` : `p_e = p - p_amb`
     * remarks: Often, `p_amb` is chosen as a standard pressure. Gauge pressure is positive or negative.
     */
    attribute gaugePressure: PressureValue[1] :> pressureQuantities;

    /**
     * source: item 4-15 stress (scalar)
     * symbol(s): `σ`
     * application domain: generic
     * name: Stress
     * quantity dimension: L^-1*M^1*T^-2
     * measurement unit(s): Pa, N*m^-2, kg*m^-1*s^-2
     * tensor order: 2
     * definition: tensor (ISO 80000-2) quantity representing state of tension of matter
     * remarks: Stress tensor is symmetric and has three normal-stress and three shear-stress (Cartesian) components.
     */
    attribute def StressUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = -1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def StressValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: StressUnit[1];
    }
    attribute stressQuantities: StressValue[*] nonunique :> scalarQuantities;
    attribute stress: StressValue[1] :> stressQuantities;

    /**
     * source: item 4-15 stress (tensor)
     * symbol(s): `vec(vec(σ))`
     * application domain: generic
     * name: Stress
     * quantity dimension: L^-1*M^1*T^-2
     * measurement unit(s): Pa, N*m^-2, kg*m^-1*s^-2
     * tensor order: 2
     * definition: tensor (ISO 80000-2) quantity representing state of tension of matter
     * remarks: Stress tensor is symmetric and has three normal-stress and three shear-stress (Cartesian) components.
     */
    attribute def Cartesian3dStressMeasurementReference :> TensorMeasurementReference {
        attribute :>> dimensions = {3, 3};
        attribute :>> isBound = false;
        attribute :>> mRefs: StressUnit[9];
    }

    attribute def Cartesian3dStressTensor :> TensorQuantityValue {
        attribute :>> isBound = false;
        attribute :>> num: Real[9];
        attribute :>> mRef: Cartesian3dStressMeasurementReference[1];
    }
    attribute stressTensors: Cartesian3dStressTensor[*] nonunique :> tensorQuantities;
    attribute stressTensor: Cartesian3dStressTensor[1] :> stressTensors;

    /**
     * source: item 4-16.1 normal stress
     * symbol(s): `σ_n`, `σ`
     * application domain: generic
     * name: NormalStress
     * quantity dimension: L^-1*M^1*T^-2
     * measurement unit(s): Pa, N*m^-2, kg*m^-1*s^-2
     * tensor order: 0
     * definition: scalar (ISO 80000-2) quantity describing surface action of a force into a body equal to: `σ_n = (d F_n)/(dA)` where `F_n` is the normal component of force (item 4-9.1) and `A` is the area (ISO 80000-3) of the surface element
     * remarks: A couple of mutually opposite forces of magnitude `F` acting on the opposite surfaces of a slice (layer) of homogenous solid matter normal to it, and evenly distributed, cause a constant normal stress `σ_n = F A` in the slice (layer).
     */
    attribute def NormalStressUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = -1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def NormalStressValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: NormalStressUnit[1];
    }
    attribute normalStressQuantities: NormalStressValue[*] nonunique :> scalarQuantities;
    attribute normalStress: NormalStressValue[1] :> normalStressQuantities;

    /**
     * source: item 4-16.2 shear stress
     * symbol(s): `τ_s`, `τ`
     * application domain: generic
     * name: ShearStress
     * quantity dimension: L^-1*M^1*T^-2
     * measurement unit(s): Pa, N*m^-2, kg*m^-1*s^-2
     * tensor order: 0
     * definition: scalar (ISO 80000-2) quantity describing surface action of a force into a body equal to: `τ_s = (d F_t)/(dA)` where `F_t` is the tangential component of force (item 4-9.1) and `A` is the area (ISO 80000-3) of the surface element
     * remarks: A couple of mutually opposite forces of magnitude `F` acting on the opposite surfaces of a slice (layer) of homogenous solid matter parallel to it, and evenly distributed, cause a constant shear stress `τ = F/A` in the slice (layer).
     */
    attribute def ShearStressUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = -1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def ShearStressValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: ShearStressUnit[1];
    }
    attribute shearStressQuantities: ShearStressValue[*] nonunique :> scalarQuantities;
    attribute shearStress: ShearStressValue[1] :> shearStressQuantities;

    /**
     * source: item 4-17.1 strain (scalar)
     * symbol(s): `ε`
     * application domain: generic
     * name: Strain
     * quantity dimension: 1
     * measurement unit(s): 1
     * tensor order: 2
     * definition: tensor (ISO 80000-2) quantity representing the deformation of matter caused by stress
     * remarks: Strain tensor is symmetric and has three linear-strain and three shear strain (Cartesian) components.
     */
    attribute def StrainUnit :> DimensionOneUnit {
        attribute :>> quantityDimension { :>> quantityPowerFactors = {}; }
    }

    attribute def StrainValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: StrainUnit[1];
    }
    attribute strainQuantities: StrainValue[*] nonunique :> scalarQuantities;
    attribute strain: StrainValue[1] :> strainQuantities;

    /**
     * source: item 4-17.1 strain (tensor)
     * symbol(s): `vec(vec(ε))`
     * application domain: generic
     * name: Strain
     * quantity dimension: 1
     * measurement unit(s): 1
     * tensor order: 2
     * definition: tensor (ISO 80000-2) quantity representing the deformation of matter caused by stress
     * remarks: Strain tensor is symmetric and has three linear-strain and three shear strain (Cartesian) components.
     */
    attribute def Cartesian3dStrainMeasurementReference :> TensorMeasurementReference {
        attribute :>> dimensions = {3, 3};
        attribute :>> isBound = false;
        attribute :>> mRefs: StrainUnit[9];
    }

    attribute def Cartesian3dStrainTensor :> TensorQuantityValue {
        attribute :>> isBound = false;
        attribute :>> num: Real[9];
        attribute :>> mRef: Cartesian3dStrainMeasurementReference[1];
    }
    attribute strainTensors: Cartesian3dStrainTensor[*] nonunique :> tensorQuantities;
    attribute strainTensor: Cartesian3dStrainTensor[1] :> strainTensors;

    /**
     * source: item 4-17.2 relative linear strain
     * symbol(s): `ε`, `(e)`
     * application domain: generic
     * name: RelativeLinearStrain
     * quantity dimension: 1
     * measurement unit(s): 1
     * tensor order: 0
     * definition: quotient of change in length `Δl` (ISO 80000-3) of an object and its length `l` (ISO 80000-3): `ε = (Δl)/l`
     * remarks: 
     */
    attribute def RelativeLinearStrainUnit :> DimensionOneUnit {
        attribute :>> quantityDimension { :>> quantityPowerFactors = {}; }
    }

    attribute def RelativeLinearStrainValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: RelativeLinearStrainUnit[1];
    }
    attribute relativeLinearStrainQuantities: RelativeLinearStrainValue[*] nonunique :> scalarQuantities;
    attribute relativeLinearStrain: RelativeLinearStrainValue[1] :> relativeLinearStrainQuantities;

    /**
     * source: item 4-17.3 shear strain
     * symbol(s): `γ`
     * application domain: generic
     * name: ShearStrain
     * quantity dimension: 1
     * measurement unit(s): 1
     * tensor order: 0
     * definition: quotient of parallel displacement `Δx` (ISO 80000-3) of two surfaces of a layer and the thickness `d` (ISO 80000-3) of the layer: `γ = (Δx)/d`
     * remarks: 
     */
    attribute def ShearStrainUnit :> DimensionOneUnit {
        attribute :>> quantityDimension { :>> quantityPowerFactors = {}; }
    }

    attribute def ShearStrainValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: ShearStrainUnit[1];
    }
    attribute shearStrainQuantities: ShearStrainValue[*] nonunique :> scalarQuantities;
    attribute shearStrain: ShearStrainValue[1] :> shearStrainQuantities;

    /**
     * source: item 4-17.4 relative volume strain
     * symbol(s): `θ`
     * application domain: generic
     * name: RelativeVolumeStrain
     * quantity dimension: 1
     * measurement unit(s): 1
     * tensor order: 0
     * definition: quotient of change in volume `ΔV` (ISO 80000-3) of an object and its volume `V_0` (ISO 80000-3): `θ = (ΔV)/V_0`
     * remarks: 
     */
    attribute def RelativeVolumeStrainUnit :> DimensionOneUnit {
        attribute :>> quantityDimension { :>> quantityPowerFactors = {}; }
    }

    attribute def RelativeVolumeStrainValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: RelativeVolumeStrainUnit[1];
    }
    attribute relativeVolumeStrainQuantities: RelativeVolumeStrainValue[*] nonunique :> scalarQuantities;
    attribute relativeVolumeStrain: RelativeVolumeStrainValue[1] :> relativeVolumeStrainQuantities;

    /**
     * source: item 4-18 Poisson number
     * symbol(s): `μ`, `(v)`
     * application domain: generic
     * name: PoissonNumber
     * quantity dimension: 1
     * measurement unit(s): 1
     * tensor order: 0
     * definition: quotient of change in width `Δb` (width is defined in ISO 80000-3) and change in length `Δl` (length is defined in ISO 80000-3) of an object: `μ = (Δb)/(Δl)`
     * remarks: 
     */
    attribute def PoissonNumberUnit :> DimensionOneUnit {
        attribute :>> quantityDimension { :>> quantityPowerFactors = {}; }
    }

    attribute def PoissonNumberValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: PoissonNumberUnit[1];
    }
    attribute poissonNumberQuantities: PoissonNumberValue[*] nonunique :> scalarQuantities;
    attribute poissonNumber: PoissonNumberValue[1] :> poissonNumberQuantities;

    /**
     * source: item 4-19.1 modulus of elasticity, Young modulus
     * symbol(s): `E`, `E_m`, `Y`
     * application domain: generic
     * name: ModulusOfElasticity
     * quantity dimension: L^-1*M^1*T^-2
     * measurement unit(s): Pa, N*m^-2, kg*m^-1*s^-2
     * tensor order: 0
     * definition: quotient of normal stress `σ` (item 4-16.1) and relative linear strain `ε` (item 4-17.2): `E = σ/ε`
     * remarks: Conditions should be specified (e.g. adiabatic or isothermal process).
     */
    attribute def ModulusOfElasticityUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = -1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def ModulusOfElasticityValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: ModulusOfElasticityUnit[1];
    }
    attribute modulusOfElasticityQuantities: ModulusOfElasticityValue[*] nonunique :> scalarQuantities;
    attribute modulusOfElasticity: ModulusOfElasticityValue[1] :> modulusOfElasticityQuantities;

    alias ModulusOfElasticityUnit as YoungModulusUnit;
    alias ModulusOfElasticityValue as YoungModulusValue;
    alias modulusOfElasticityQuantities as youngModulusQuantities;
    alias modulusOfElasticity as youngModulus;

    /**
     * source: item 4-19.2 modulus of rigidity, shear modulus
     * symbol(s): `G`
     * application domain: generic
     * name: ModulusOfRigidity
     * quantity dimension: L^-1*M^1*T^-2
     * measurement unit(s): Pa, N*m^-2, kg*m^-1*s^-2
     * tensor order: 0
     * definition: quotient of shear stress `τ` (item 4-16.2) and shear strain `γ` (item 4-17.3): `G = τ/γ`
     * remarks: Conditions should be specified (e.g. isentropic or isothermal process).
     */
    attribute def ModulusOfRigidityUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = -1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def ModulusOfRigidityValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: ModulusOfRigidityUnit[1];
    }
    attribute modulusOfRigidityQuantities: ModulusOfRigidityValue[*] nonunique :> scalarQuantities;
    attribute modulusOfRigidity: ModulusOfRigidityValue[1] :> modulusOfRigidityQuantities;

    alias ModulusOfRigidityUnit as ShearModulusUnit;
    alias ModulusOfRigidityValue as ShearModulusValue;
    alias modulusOfRigidityQuantities as shearModulusQuantities;
    alias modulusOfRigidity as shearModulus;

    /**
     * source: item 4-19.3 modulus of compression, bulk modulus
     * symbol(s): `K`, `K_m`, `B`
     * application domain: generic
     * name: ModulusOfCompression
     * quantity dimension: L^-1*M^1*T^-2
     * measurement unit(s): Pa, N*m^-2, kg*m^-1*s^-2
     * tensor order: 0
     * definition: negative of the quotient of pressure `p` (item 4-14.1) and relative volume strain `θ` (item 4-17.4): `K = -(p/θ)`
     * remarks: Conditions should be specified (e.g. isentropic or isothermal process).
     */
    attribute def ModulusOfCompressionUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = -1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def ModulusOfCompressionValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: ModulusOfCompressionUnit[1];
    }
    attribute modulusOfCompressionQuantities: ModulusOfCompressionValue[*] nonunique :> scalarQuantities;
    attribute modulusOfCompression: ModulusOfCompressionValue[1] :> modulusOfCompressionQuantities;

    alias ModulusOfCompressionUnit as BulkModulusUnit;
    alias ModulusOfCompressionValue as BulkModulusValue;
    alias modulusOfCompressionQuantities as bulkModulusQuantities;
    alias modulusOfCompression as bulkModulus;

    /**
     * source: item 4-20 compressibility
     * symbol(s): `ϰ`
     * application domain: generic
     * name: Compressibility
     * quantity dimension: L^1*M^-1*T^2
     * measurement unit(s): Pa^-1, kg^-1*m*s^2
     * tensor order: 0
     * definition: negative relative change of volume `V` (ISO 80000-3) of an object under pressure `p` (item 4-14.1) expressed by: `ϰ = -(1/V)(dV)/(dp)`
     * remarks: Conditions should be specified (e.g. isentropic or isothermal process). See also ISO 80000-5.
     */
    attribute def CompressibilityUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = -1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = 2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def CompressibilityValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: CompressibilityUnit[1];
    }
    attribute compressibilityQuantities: CompressibilityValue[*] nonunique :> scalarQuantities;
    attribute compressibility: CompressibilityValue[1] :> compressibilityQuantities;

    /**
     * source: item 4-21.1 second axial moment of area
     * symbol(s): `I_a`
     * application domain: generic
     * name: SecondAxialMomentOfArea
     * quantity dimension: L^4
     * measurement unit(s): m^4
     * tensor order: 0
     * definition: geometrical characteristic of a shape of a body equal to: `I_a = int int_M r_Q^2 dA` where `M` is the two-dimensional domain of the cross-section of a plane and considered body, `r_Q` is radial distance (ISO 80000-3) from a Q-axis in the plane of the surface considered and `A` is area (ISO 80000-3)
     * remarks: This quantity is often referred to wrongly as “moment of inertia” (item 4-7). The subscript, `a`, may be omitted when there is no risk of confusion.
     */
    attribute def SecondAxialMomentOfAreaUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 4; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF}; }
    }

    attribute def SecondAxialMomentOfAreaValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: SecondAxialMomentOfAreaUnit[1];
    }
    attribute secondAxialMomentOfAreaQuantities: SecondAxialMomentOfAreaValue[*] nonunique :> scalarQuantities;
    attribute secondAxialMomentOfArea: SecondAxialMomentOfAreaValue[1] :> secondAxialMomentOfAreaQuantities;

    /**
     * source: item 4-21.2 second polar moment of area
     * symbol(s): `I_p`
     * application domain: generic
     * name: SecondPolarMomentOfArea
     * quantity dimension: L^4
     * measurement unit(s): m^4
     * tensor order: 0
     * definition: geometrical characteristic of a shape of a body equal to: `I_p = int int_M r_Q^2 * dA` where `M` is the two-dimensional domain of the cross-section of a plane and considered body, `r_Q` is radial distance (ISO 80000-3) from a Q-axis perpendicular to the plane of the surface considered and `A` is area (ISO 80000-3)
     * remarks: This quantity is often referred to wrongly as “moment of inertia” (item 4-7). The subscript, `p`, may be omitted when there is no risk of confusion.
     */
    attribute def SecondPolarMomentOfAreaUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 4; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF}; }
    }

    attribute def SecondPolarMomentOfAreaValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: SecondPolarMomentOfAreaUnit[1];
    }
    attribute secondPolarMomentOfAreaQuantities: SecondPolarMomentOfAreaValue[*] nonunique :> scalarQuantities;
    attribute secondPolarMomentOfArea: SecondPolarMomentOfAreaValue[1] :> secondPolarMomentOfAreaQuantities;

    /**
     * source: item 4-22 section modulus
     * symbol(s): `Z`, `(W)`
     * application domain: generic
     * name: SectionModulus
     * quantity dimension: L^3
     * measurement unit(s): m^3
     * tensor order: 0
     * definition: geometrical characteristic of a shape of a body equal to: `Z = I_a/r_(Q_max)` where `I_a` is the second axial moment of area (item 4-21.1) and `r_(Q,max)` is the maximum radial distance (ISO 80000-3) of any point in the surface considered from the Q-axis with respect to which `I_a` is defined
     * remarks: 
     */
    attribute def SectionModulusUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 3; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF}; }
    }

    attribute def SectionModulusValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: SectionModulusUnit[1];
    }
    attribute sectionModulusQuantities: SectionModulusValue[*] nonunique :> scalarQuantities;
    attribute sectionModulus: SectionModulusValue[1] :> sectionModulusQuantities;

    /**
     * source: item 4-23.1 static friction coefficient, static friction factor, coefficient of static friction
     * symbol(s): `μ_s`, `(f_s)`
     * application domain: generic
     * name: StaticFrictionCoefficient
     * quantity dimension: 1
     * measurement unit(s): 1
     * tensor order: 0
     * definition: proportionality factor between the maximum magnitude of the tangential component `F_max` of the static friction force (item 4-9.3) and the magnitude of the normal component `N` of the contact force (item 4-9.1) between two bodies at relative rest with respect to each other: `F_max = μ_s * N`
     * remarks: When it is not necessary to distinguish between dynamic friction factor and static friction factor, the name friction factor may be used for both.
     */
    attribute def StaticFrictionCoefficientUnit :> DimensionOneUnit {
        attribute :>> quantityDimension { :>> quantityPowerFactors = {}; }
    }

    attribute def StaticFrictionCoefficientValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: StaticFrictionCoefficientUnit[1];
    }
    attribute staticFrictionCoefficientQuantities: StaticFrictionCoefficientValue[*] nonunique :> scalarQuantities;
    attribute staticFrictionCoefficient: StaticFrictionCoefficientValue[1] :> staticFrictionCoefficientQuantities;

    alias StaticFrictionCoefficientUnit as StaticFrictionFactorUnit;
    alias StaticFrictionCoefficientValue as StaticFrictionFactorValue;
    alias staticFrictionCoefficientQuantities as staticFrictionFactorQuantities;
    alias staticFrictionCoefficient as staticFrictionFactor;

    alias StaticFrictionCoefficientUnit as CoefficientOfStaticFrictionUnit;
    alias StaticFrictionCoefficientValue as CoefficientOfStaticFrictionValue;
    alias staticFrictionCoefficientQuantities as coefficientOfStaticFrictionQuantities;
    alias staticFrictionCoefficient as coefficientOfStaticFriction;

    /**
     * source: item 4-23.2 kinetic friction factor, dynamic friction factor
     * symbol(s): `μ`, `(f)`
     * application domain: generic
     * name: KineticFrictionFactor
     * quantity dimension: 1
     * measurement unit(s): 1
     * tensor order: 0
     * definition: proportionality factor between the magnitudes of the kinetic friction force, `F_μ` (item 4-9.4) and the normal component `N` of the contact force (item 4-9.1): `F_μ = μ * N`
     * remarks: When it is not necessary to distinguish between dynamic friction factor and static friction factor, the name friction factor may be used for both. The dynamic friction factor `µ` is independent in first approximation of the contact surface.
     */
    attribute def KineticFrictionFactorUnit :> DimensionOneUnit {
        attribute :>> quantityDimension { :>> quantityPowerFactors = {}; }
    }

    attribute def KineticFrictionFactorValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: KineticFrictionFactorUnit[1];
    }
    attribute kineticFrictionFactorQuantities: KineticFrictionFactorValue[*] nonunique :> scalarQuantities;
    attribute kineticFrictionFactor: KineticFrictionFactorValue[1] :> kineticFrictionFactorQuantities;

    alias KineticFrictionFactorUnit as DynamicFrictionFactorUnit;
    alias KineticFrictionFactorValue as DynamicFrictionFactorValue;
    alias kineticFrictionFactorQuantities as dynamicFrictionFactorQuantities;
    alias kineticFrictionFactor as dynamicFrictionFactor;

    /**
     * source: item 4-23.3 rolling resistance factor
     * symbol(s): `C_"rr"`
     * application domain: generic
     * name: RollingResistanceFactor
     * quantity dimension: 1
     * measurement unit(s): 1
     * tensor order: 0
     * definition: proportionality factor between the magnitude of the tangential component `F` and the magnitude of the normal component `N` of the force applied to a body rolling on a surface at constant speed: `F = C_(rr)*N`
     * remarks: Also known as rolling resistance coefficient, RRC.
     */
    attribute def RollingResistanceFactorUnit :> DimensionOneUnit {
        attribute :>> quantityDimension { :>> quantityPowerFactors = {}; }
    }

    attribute def RollingResistanceFactorValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: RollingResistanceFactorUnit[1];
    }
    attribute rollingResistanceFactorQuantities: RollingResistanceFactorValue[*] nonunique :> scalarQuantities;
    attribute rollingResistanceFactor: RollingResistanceFactorValue[1] :> rollingResistanceFactorQuantities;

    /**
     * source: item 4-23.4 drag coefficient, drag factor
     * symbol(s): `C_D`
     * application domain: generic
     * name: DragCoefficient
     * quantity dimension: 1
     * measurement unit(s): 1
     * tensor order: 0
     * definition: factor proportional to magnitude `F_D` of the drag force (item 4-9.6) of a body moving in a fluid, dependent on the shape and speed `v` (ISO 80000-3) of a body: `F_D = 1/2 * C_D * ρ * v^2 * A` where `ρ` is mass density (item 4-2) of the fluid and `A` is cross-section area (ISO 80000-3) of the body
     * remarks: 
     */
    attribute def DragCoefficientUnit :> DimensionOneUnit {
        attribute :>> quantityDimension { :>> quantityPowerFactors = {}; }
    }

    attribute def DragCoefficientValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: DragCoefficientUnit[1];
    }
    attribute dragCoefficientQuantities: DragCoefficientValue[*] nonunique :> scalarQuantities;
    attribute dragCoefficient: DragCoefficientValue[1] :> dragCoefficientQuantities;

    alias DragCoefficientUnit as DragFactorUnit;
    alias DragCoefficientValue as DragFactorValue;
    alias dragCoefficientQuantities as dragFactorQuantities;
    alias dragCoefficient as dragFactor;

    /**
     * source: item 4-24 dynamic viscosity, viscosity
     * symbol(s): `η`
     * application domain: generic
     * name: DynamicViscosity
     * quantity dimension: L^-1*M^1*T^-1
     * measurement unit(s): Pa*s, kg*m^-1*s^-1
     * tensor order: 0
     * definition: for laminar flows, proportionality constant between shear stress `τ_(xz)` (item 4-16.2) in a fluid moving with a velocity `v_x` (ISO 80000-3) and gradient `(d v_x)/dz` perpendicular to the plane of shear: `τ_(xz) = η (d v_x)/(dz)`
     * remarks: 
     */
    attribute def DynamicViscosityUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = -1; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def DynamicViscosityValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: DynamicViscosityUnit[1];
    }
    attribute dynamicViscosityQuantities: DynamicViscosityValue[*] nonunique :> scalarQuantities;
    attribute dynamicViscosity: DynamicViscosityValue[1] :> dynamicViscosityQuantities;

    alias DynamicViscosityUnit as ViscosityUnit;
    alias DynamicViscosityValue as ViscosityValue;
    alias dynamicViscosityQuantities as viscosityQuantities;
    alias dynamicViscosity as viscosity;

    /**
     * source: item 4-25 kinematic viscosity
     * symbol(s): `v`
     * application domain: generic
     * name: KinematicViscosity
     * quantity dimension: L^2*T^-1
     * measurement unit(s): m^2*s^-1
     * tensor order: 0
     * definition: quotient of dynamic viscosity `η` (item 4-24) and mass density `ρ` (item 4-2) of a fluid: `v = η/ρ`
     * remarks: 
     */
    attribute def KinematicViscosityUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 2; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, durationPF}; }
    }

    attribute def KinematicViscosityValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: KinematicViscosityUnit[1];
    }
    attribute kinematicViscosityQuantities: KinematicViscosityValue[*] nonunique :> scalarQuantities;
    attribute kinematicViscosity: KinematicViscosityValue[1] :> kinematicViscosityQuantities;

    /**
     * source: item 4-26 surface tension
     * symbol(s): `γ`, `σ`
     * application domain: generic
     * name: SurfaceTension
     * quantity dimension: M^1*T^-2
     * measurement unit(s): N*m^-1, kg*s^-2
     * tensor order: 0
     * definition: magnitude of a force acting against the enlargement of area portion of a surface separating a liquid from its surrounding
     * remarks: The concept of surface energy is closely related to surface tension and has the same dimension.
     */
    attribute def SurfaceTensionUnit :> DerivedUnit {
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {massPF, durationPF}; }
    }

    attribute def SurfaceTensionValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: SurfaceTensionUnit[1];
    }
    attribute surfaceTensionQuantities: SurfaceTensionValue[*] nonunique :> scalarQuantities;
    attribute surfaceTension: SurfaceTensionValue[1] :> surfaceTensionQuantities;

    /**
     * source: item 4-27.1 power
     * symbol(s): `P`
     * application domain: generic
     * name: Power
     * quantity dimension: L^2*M^1*T^-3
     * measurement unit(s): W, J*s^-1, kg*m^2*s^-3
     * tensor order: 0
     * definition: quotient of energy (ISO 80000-5) and duration (ISO 80000-3)
     * remarks: 
     */
    attribute def PowerUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 2; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -3; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def PowerValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: PowerUnit[1];
    }
    attribute powerQuantities: PowerValue[*] nonunique :> scalarQuantities;
    attribute power: PowerValue[1] :> powerQuantities;

    /**
     * source: item 4-27 mechanical power
     * symbol(s): `P`
     * application domain: mechanics
     * name: MechanicalPower (specializes Power)
     * quantity dimension: L^2*M^1*T^-3
     * measurement unit(s): W, N*m*s^-1, kg*m^2*s^-3
     * tensor order: 0
     * definition: scalar product of force `vec(F)` (item 4-9.1) acting to a body and its velocity `vec(v)` (ISO 80000-3): `P = vec(F) * vec(v)`
     * remarks: 
     */
    attribute mechanicalPower: PowerValue[1] :> powerQuantities;

    /**
     * source: item 4-28.1 potential energy
     * symbol(s): `V`, `E_p`
     * application domain: generic
     * name: PotentialEnergy (specializes Energy)
     * quantity dimension: L^2*M^1*T^-2
     * measurement unit(s): J, kg*m^2*s^-2
     * tensor order: 0
     * definition: for conservative force `vec(F)`, scalar additive quantity obeying condition `vec(F) = - nabla F`, if it exists
     * remarks: For the definition of energy, see ISO 80000-5. A force is conservative when the force field is irrotational, i.e. `rot(F) = 0` , or `vec(F)` is perpendicular to the speed of the body to ensure `vec(F) * d vec(r) = 0` .
     */
    attribute potentialEnergy: EnergyValue[1] :> energyQuantities;

    /**
     * source: item 4-28.2 kinetic energy
     * symbol(s): `T`, `E_k`
     * application domain: generic
     * name: KineticEnergy (specializes Energy)
     * quantity dimension: L^2*M^1*T^-2
     * measurement unit(s): J, kg*m^2*s^-2
     * tensor order: 0
     * definition: scalar (ISO 80000-2) quantity characterizing a moving body expressed by: `T = 1/2 m v^2` where `m` is mass (item 4-1) of the body and `v` is its speed (ISO 80000-3)
     * remarks: For the definition of energy, see ISO 80000-5.
     */
    attribute kineticEnergy: EnergyValue[1] :> energyQuantities;

    /**
     * source: item 4-28.3 mechanical energy
     * symbol(s): `E`, `W`
     * application domain: generic
     * name: MechanicalEnergy (specializes Energy)
     * quantity dimension: L^2*M^1*T^-2
     * measurement unit(s): J, kg*m^2*s^-2
     * tensor order: 0
     * definition: sum of kinetic energy `T` (item 4-28.2) and potential energy `V` (item 4-28.1): `E = T+V`
     * remarks: The symbols `E` and `W` are also used for other kinds of energy. This definition is understood in a classical way and it does not include thermal motion.
     */
    attribute mechanicalEnergy: EnergyValue[1] :> energyQuantities;

    /**
     * source: item 4-28.4 mechanical work, work
     * symbol(s): `A`, `W`
     * application domain: generic
     * name: MechanicalWork
     * quantity dimension: L^2*M^1*T^-2
     * measurement unit(s): J, kg*m^2*s^-2
     * tensor order: 0
     * definition: process quantity describing the total action of a force `vec(F)` (item 4-9.1) along a continuous curve `Γ` in three-dimensional space with infinitesimal displacement (ISO 80000-3) `dvec(r)`, as a line integral of their scalar product: `A = int_Γ vec(F) * d vec(r)`
     * remarks: The definition covers the case `A = - int_Γ p*dV` where `Γ` is a curve in the phase space and implies that work generally depends upon `Γ`, and that type of process must be defined (e.g. isentropic or isothermic).
     */
    attribute def MechanicalWorkUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 2; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -2; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def MechanicalWorkValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: MechanicalWorkUnit[1];
    }
    attribute mechanicalWorkQuantities: MechanicalWorkValue[*] nonunique :> scalarQuantities;
    attribute mechanicalWork: MechanicalWorkValue[1] :> mechanicalWorkQuantities;

    alias MechanicalWorkUnit as WorkUnit;
    alias MechanicalWorkValue as WorkValue;
    alias mechanicalWorkQuantities as workQuantities;
    alias mechanicalWork as work;

    /**
     * source: item 4-29 mechanical efficiency
     * symbol(s): `η`
     * application domain: mechanics
     * name: MechanicalEfficiency
     * quantity dimension: 1
     * measurement unit(s): 1
     * tensor order: 0
     * definition: quotient of output power `P_"out"` (item 4-27) from a system and input power `P_"in"` (item 4-27) to this system: `η = P_"out"/P_"in"`
     * remarks: The system must be specified. This quantity is often expressed by the unit percent, symbol %.
     */
    attribute def MechanicalEfficiencyUnit :> DimensionOneUnit {
        attribute :>> quantityDimension { :>> quantityPowerFactors = {}; }
    }

    attribute def MechanicalEfficiencyValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: MechanicalEfficiencyUnit[1];
    }
    attribute mechanicalEfficiencyQuantities: MechanicalEfficiencyValue[*] nonunique :> scalarQuantities;
    attribute mechanicalEfficiency: MechanicalEfficiencyValue[1] :> mechanicalEfficiencyQuantities;

    /**
     * source: item 4-30.1 mass flow (scalar)
     * symbol(s): `j_m`
     * application domain: generic
     * name: MassFlow
     * quantity dimension: L^-2*M^1*T^-1
     * measurement unit(s): kg*m^-2*s^-1
     * tensor order: 1
     * definition: vector (ISO 80000-2) quantity characterizing a flowing fluid by the product of its local mass density `ρ` (item 4-2) and local velocity `vec(v)` (ISO 80000-3): `vec(j_m) = ρ vec(v)`
     * remarks: 
     */
    attribute def MassFlowUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = -2; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def MassFlowValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: MassFlowUnit[1];
    }
    attribute massFlowQuantities: MassFlowValue[*] nonunique :> scalarQuantities;
    attribute massFlow: MassFlowValue[1] :> massFlowQuantities;

    /**
     * source: item 4-30.1 mass flow (vector)
     * symbol(s): `vec(j_m)`
     * application domain: generic
     * name: MassFlow
     * quantity dimension: L^-2*M^1*T^-1
     * measurement unit(s): kg*m^-2*s^-1
     * tensor order: 1
     * definition: vector (ISO 80000-2) quantity characterizing a flowing fluid by the product of its local mass density `ρ` (item 4-2) and local velocity `vec(v)` (ISO 80000-3): `vec(j_m) = ρ vec(v)`
     * remarks: 
     */
    attribute def Cartesian3dMassFlowCoordinateSystem :> VectorMeasurementReference {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> isOrthogonal = true;
        attribute :>> mRefs: MassFlowUnit[3];
    }

    attribute def Cartesian3dMassFlowVector :> VectorQuantityValue {
        attribute :>> dimensions = {3};
        attribute :>> isBound = false;
        attribute :>> num: Real[3];
        attribute :>> mRef: Cartesian3dMassFlowCoordinateSystem[1];
    }
    attribute massFlowVectors: Cartesian3dMassFlowVector[*] nonunique :> vectorQuantities;
    attribute massFlowVector: Cartesian3dMassFlowVector[1] :> massFlowVectors;

    /**
     * source: item 4-30.2 mass flow rate
     * symbol(s): `q_m`
     * application domain: generic
     * name: MassFlowRate
     * quantity dimension: M^1*T^-1
     * measurement unit(s): kg*s^-1
     * tensor order: 0
     * definition: scalar (ISO 80000-2) quantity characterizing the total flow through the two-dimensional domain `A` with normal vector `vec(e)_n` of a flowing fluid with mass flow `vec(j)_m` (item 4-30.1) as an integral: `q_m = int int_A vec(j)_m * vec(e)_n dA` where `dA` is the area (ISO 80000-3) of an element of the two-dimensional domain `A`
     * remarks: 
     */
    attribute def MassFlowRateUnit :> DerivedUnit {
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {massPF, durationPF}; }
    }

    attribute def MassFlowRateValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: MassFlowRateUnit[1];
    }
    attribute massFlowRateQuantities: MassFlowRateValue[*] nonunique :> scalarQuantities;
    attribute massFlowRate: MassFlowRateValue[1] :> massFlowRateQuantities;

    /**
     * source: item 4-30.3 mass change rate
     * symbol(s): `q_m`
     * application domain: generic
     * name: MassChangeRate
     * quantity dimension: M^1*T^-1
     * measurement unit(s): kg*s^-1
     * tensor order: 0
     * definition: rate of increment of mass `m` (item 4-1): `q_m = (dm)/(dt)` where `dm` is the infinitesimal mass (item 4-1) increment and `dt` is the infinitesimal duration (ISO 80000-3)
     * remarks: 
     */
    attribute def MassChangeRateUnit :> DerivedUnit {
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {massPF, durationPF}; }
    }

    attribute def MassChangeRateValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: MassChangeRateUnit[1];
    }
    attribute massChangeRateQuantities: MassChangeRateValue[*] nonunique :> scalarQuantities;
    attribute massChangeRate: MassChangeRateValue[1] :> massChangeRateQuantities;

    /**
     * source: item 4-31 volume flow rate
     * symbol(s): `q_v`
     * application domain: generic
     * name: VolumeFlowRate
     * quantity dimension: L^3*T^-1
     * measurement unit(s): m^3*s^-1
     * tensor order: 0
     * definition: scalar (ISO 80000-2) quantity characterizing the total flow through the two-dimensional domain `A` with the normal vector `vec(e)_n` of a flowing fluid with velocity `vec(v)` (ISO 80000-3) as an integral: `q_v = int int_A vec(v) * vec(e)_n dA` where `dA` is the area (ISO 80000-3) of an element of the two-dimensional domain `A`
     * remarks: 
     */
    attribute def VolumeFlowRateUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 3; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, durationPF}; }
    }

    attribute def VolumeFlowRateValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: VolumeFlowRateUnit[1];
    }
    attribute volumeFlowRateQuantities: VolumeFlowRateValue[*] nonunique :> scalarQuantities;
    attribute volumeFlowRate: VolumeFlowRateValue[1] :> volumeFlowRateQuantities;

    /**
     * source: item 4-32 action quantity
     * symbol(s): `S`
     * application domain: generic
     * name: ActionQuantity
     * quantity dimension: L^2*M^1*T^-1
     * measurement unit(s): J*s, kg*m^2*s^-1
     * tensor order: 0
     * definition: time integral of energy `E` over a time interval `(t_1, t_2)`: `S = int_(t_1)^(t_2) E dt`
     * remarks: The energy may be expressed by a Lagrangian or Hamiltonian function.
     */
    attribute def ActionQuantityUnit :> DerivedUnit {
        private attribute lengthPF: QuantityPowerFactor[1] { :>> quantity = L; :>> exponent = 2; }
        private attribute massPF: QuantityPowerFactor[1] { :>> quantity = M; :>> exponent = 1; }
        private attribute durationPF: QuantityPowerFactor[1] { :>> quantity = T; :>> exponent = -1; }
        attribute :>> quantityDimension { :>> quantityPowerFactors = {lengthPF, massPF, durationPF}; }
    }

    attribute def ActionQuantityValue :> ScalarQuantityValue {
        attribute :>> num: Real;
        attribute :>> mRef: ActionQuantityUnit[1];
    }
    attribute actionQuantityQuantities: ActionQuantityValue[*] nonunique :> scalarQuantities;
    attribute actionQuantity: ActionQuantityValue[1] :> actionQuantityQuantities;

}
