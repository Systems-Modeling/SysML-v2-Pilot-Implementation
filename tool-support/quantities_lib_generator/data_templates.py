class DATA:
    """
    Parameterized templates of SysML code snippets for use in library generation, for use with string.format method.
    Field names are denoted by enclosing them in a pair of curly brackets.
    A literal curly bracket is escaped by doubling it, i.e. using {{ or }}.
    See https://docs.python.org/3/library/string.html#string.Formatter.format .
    """
    PACKAGE_START = """\
standard library package {PACKAGE_NAME} {{
    doc
    /*
     * International System of Quantities and Units
     * Generated on {TIME_STAMP} from standard {SOURCE_REF}
     * see also {SOURCE_URI}
     * 
     * Note 1: In documentation comments, AsciiMath notation (see http://asciimath.org/) is used for mathematical concepts,
     * with Greek letters in Unicode encoding. In running text, AsciiMath is placed between backticks.
     * Note 2: For vector and tensor quantities currently the unit and quantity value type for their (scalar) magnitude is 
     * defined, as well as their typical Cartesian 3d VectorMeasurementReference (i.e. coordinate system) 
     * or TensorMeasurementReference.
     */

    private import ScalarValues::Real;
    private import Quantities::*;
    private import MeasurementReferences::*;
    private import ISQBase::*;

"""

    extra_imports = {
        "Mechanics": """\
    private import ISQThermodynamics::EnergyValue;
""",
        "Thermodynamics": """\

""",
        "Electromagnetism": """\
    private import ISQMechanics::PowerValue;
    private import ISQSpaceTime::AngularMeasureValue;
    private import ISQThermodynamics::EnergyValue;
""",
        "Light": """\
    private import ISQThermodynamics::EnergyValue;
""",
        "Acoustics": """\
    private import ISQMechanics::PowerValue;
    private import ISQMechanics::PressureValue;
    private import ISQSpaceTime::CartesianSpatial3dCoordinateFrame;
    private import ISQSpaceTime::SpeedValue;
    private import ISQSpaceTime::CartesianVelocity3dCoordinateFrame;
    private import ISQSpaceTime::AccelerationValue;
    private import ISQSpaceTime::CartesianAcceleration3dCoordinateFrame;
    private import ISQThermodynamics::EnergyValue;
""",
        "ChemistryMolecular": """\
    private import ISQSpaceTime::AngularMeasureValue;
    private import ISQThermodynamics::EnergyValue;
""",
        "AtomicNuclear": """\
    private import ISQChemistryMolecular::DiffusionCoefficientUnit;
    private import ISQChemistryMolecular::DiffusionCoefficientValue;
    private import ISQChemistryMolecular::diffusionCoefficient;    
    private import ISQElectromagnetism::ElectricChargeValue;
    private import ISQSpaceTime::AngularFrequencyValue;
    private import ISQSpaceTime::AreaValue;
    private import ISQThermodynamics::EnergyValue;
""",
        "CondensedMatter": """\
    private import ISQElectromagnetism::ElectricPotentialDifferenceValue;
    private import ISQElectromagnetism::MagneticFluxDensityValue;
    private import ISQElectromagnetism::ResistivityValue;
    private import ISQSpaceTime::CartesianSpatial3dCoordinateFrame;
    private import ISQSpaceTime::AngularFrequencyValue;
    private import ISQSpaceTime::AngularMeasureValue;
    private import ISQSpaceTime::RepetencyValue;
    private import ISQThermodynamics::EnergyValue;
""",
        "Information": """\
    private import ISQMechanics::PowerValue;
    private import ISQSpaceTime::FrequencyValue;
    private import ISQThermodynamics::EnergyValue;
""",
    }

    BASE_PACKAGE_START = """\
standard library package ISQBase {{
    doc
    /*
     * International System of Quantities and Units
     * Generated on {TIME_STAMP} from standard {SOURCE_REF}
     * 
     * Note 1: In documentation comments, AsciiMath notation (see http://asciimath.org/) is used for mathematical concepts,
     * with Greek letters in Unicode encoding. In running text, AsciiMath is placed between backticks.
     */

    private import ScalarValues::Real;
    private import Quantities::*;
    private import MeasurementReferences::*;

"""

    BASE_PACKAGE_END = """\
    attribute <isq> 'International System of Quantities': SystemOfQuantities {
        doc
        /*
         * Declaration of the International System of Quantities (ISQ), 
         * including its base quantities and symbols as specified in ISO 80000-1:2009.
         */
        attribute :>> baseQuantities = ( L, M, T, I, 'Θ', N, J );
        
        attribute L: LengthValue[1];
        attribute M: MassValue[1];
        attribute T: DurationValue[1];
        attribute I: ElectricCurrentValue[1];
        attribute 'Θ': ThermodynamicTemperatureValue[1];
        attribute N: AmountOfSubstanceValue[1];
        attribute J: LuminousIntensityValue[1];
    }
}
"""

    SPATIAL_COORDINATE_FRAMES = """\
    /* Spatial coordinate frames */
    
    attribute def Spatial3dCoordinateFrame :> '3dCoordinateFrame' {
        doc
        /*
         * Most general spatial 3D coordinate frame
         */
        attribute :>> isBound = true;
    }

    attribute def CartesianSpatial3dCoordinateFrame :> Spatial3dCoordinateFrame {
        doc
        /*
         * Cartesian spatial 3D coordinate frame
         *
         * source: ISO 80000-2 item 2-17.1 Cartesian coordinates
         *
         * The components of a vector expressed on a Cartesian spatial coordinate frame are all LengthValues, and denoted with symbols `x`, `y`, `z`.
         *
         * Note 1: The Cartesian basis vectors `vec(e_x)`, `vec(e_y)` and `vec(e_z)` form an orthonormal right-handed coordinate frame.
         * Note 2: The measurement units for the 3 dimensions are typically the same, but may be different.
         */
        attribute xUnit : LengthUnit = mRefs#(1);
        attribute yUnit : LengthUnit = mRefs#(2);
        attribute zUnit : LengthUnit = mRefs#(3);
        attribute :>> mRefs : LengthUnit[3];
        attribute :>> isOrthogonal = true;
    }

    attribute universalCartesianSpatial3dCoordinateFrame : CartesianSpatial3dCoordinateFrame[1] {
        doc
        /*
         * A singleton CartesianSpatial3dCoordinateFrame that can be used as a default universal Cartesian 3D coordinate frame.
         */
         
        attribute :>> mRefs default (SI::m, SI::m, SI::m) {
            doc /*
             * By default, the universalCartesianSpatial3dCoordinateFrame uses meters as the units on all three axes.
             */
        }
        
        attribute :>> transformation[0..0] {
            doc /*
             * The universalCartesianSpatial3dCoordinateFrame is the "top-level" coordinate frame, not nested in any other frame.
             */
        }
        
    }

    attribute def CylindricalSpatial3dCoordinateFrame :> Spatial3dCoordinateFrame {
        doc
        /*
         * Cylindrical spatial 3D coordinate frame
         *
         * source: ISO 80000-2 item 2-17.2 cylindrical coordinates
         *
         * The components of a (position) vector to a point P in a cylindrical coordinate frame are:
         * - radialDistance (symbol `ρ`) defined by LengthValue, that is the radial distance from the cylinder axis to P
         * - azimuth (symbol `φ`) defined by AngularMeasure, that is the angle between the azimuth reference direction and the line segment
         * from the cylinder axis, in the plane that is orthogonal to the cylinder axis and intersects P
         * - z coordinate (symbol `z`) defined by LengthValue, the coordinate along the clyinder axis.
         *
         * Note 1: The basis vectors `vec(e_ρ)(φ)`, `vec(e_φ)(φ)` and `vec(e_z)` form an orthonormal right-handed coordinate frame, where
         * `vec(e_φ)` is tangent to the circular arc in the `φ` direction.
         * Note 2: In order to enable transformation to and from a CartesianSpatial3dCoordinateFrame the `vec(e_x)` Cartesian basis vector is aligned
         * with the `φ=0` direction in the cylindrical frame, and the `vec(e_z)` Cartesian basis vector is aligned with
         * the `vec(e_z)` cylindrical basis vector.
         * Note 3: If `z = 0`, then `ρ` and `φ` are polar coordinates in the XY-plane.
         * Note 4: See also https://en.wikipedia.org/wiki/Cylindrical_coordinate_system .
         */
        attribute radialDistanceUnit : LengthUnit;
        attribute azimuthUnit : AngularMeasureUnit;
        attribute zUnit : LengthUnit;
        attribute :>> mRefs = (radialDistanceUnit, azimuthUnit, zUnit);
        attribute :>> isOrthogonal = true;
    }

    attribute def SphericalSpatial3dCoordinateFrame :> Spatial3dCoordinateFrame {
        doc
        /*
         * Spherical spatial 3D coordinate frame
         *
         * source: ISO 80000-2 item 2-17.3 spherical coordinates
         *
         * The components of a (position) vector to a point P specified in a spherical coordinate frame are:
         * - radialDistance (symbol `r`) defined by LengthValue, that is the distance from the origin to P
         * - inclination (symbol `θ`) defined by AngularMeasure, that is the angle between the zenith direction and the line segment from origin to P
         * - azimuth (symbol `φ`) defined by AngularMeasure, that is the angle between the azimuth reference direction and the line segment
         * from the origin to the orthogonal projection of P on the reference plane, normal to the zenith direction.
         *
         * Note 1: The basis vectors `vec(e_r)(θ,φ)`, `vec(e_θ)(θ,φ)` and `vec(e_φ)(φ)` form an orthonormal right-handed frame, where
         * `vec(e_θ)` and `vec(e_φ)` are tangent to the respective circular arcs in the `θ` and `φ` directions.
         * Note 2: In order to transform to and from a CartesianSpatial3dCoordinateFrame the `vec(e_x)` Cartesian basis vector is aligned
         * with the `θ=π/4` and `φ=0` direction in the spherical frame, and the `vec(e_z)` Cartesian basis vector is aligned
         * with the `θ=0` zenith direction in the spherical frame.
         * Note 3: If `θ = π/4`, then `ρ` and `φ` are polar coordinates in the XY-plane.
         * Note 4: See also https://en.wikipedia.org/wiki/Spherical_coordinate_system .
         */
        attribute radialDistanceUnit : LengthUnit;
        attribute inclinationUnit : AngularMeasureUnit;
        attribute azimuthUnit : AngularMeasureUnit;
        attribute :>> mRefs = (radialDistanceUnit, inclinationUnit, azimuthUnit);
        attribute :>> isOrthogonal = true;
    }

     attribute def PlanetarySpatial3dCoordinateFrame :> Spatial3dCoordinateFrame {
        doc
        /*
         * Planetary spatial 3D coordinate frame
         *
         * A planetary spatial 3D coordinate frame is a generalization for any planet of the geographic coordinate frame and geocentric coordinate
         * for Earth. In such coordinate frames, typically the origin is located at the planet's centre of gravity, and the surface of the planet
         * is approximated by a reference ellipsoid centred on the origin, with its major axes oriented along the south to north pole vector and
         * the equatorial plane.
         *
         * The components of a (position) vector to a point P specified in a planetary coordinate frame are:
         * - latitude (symbol `lat` or `φ`) defined by AngularMeasure, that is the angle between the equatorial plane and the vector from
         *   the origin to P, similar to the inclination in a spherical spatial coordinate frame. Typically, the zero reference latitude is chosen
         *   for positions in the equatorial plane, with positive latitude for positions in the northern hemisphere and negative latitude for positions
         *   in the southern hemisphere.
         * - longitude (symbol `long` or `λ`) defined by AngularMeasure, that is the angle between a reference meridian and the meridian
         *   passing through P, similar to the azimuth of a spherical spatial coordinate frame. The convention is to connotate positive longitude
         *   with eastward direction and negative longitude with westward direction. The reference meridian for `long=0` is chosen to pass
         *   through a particular feature of the planet, e.g., for Earth typically the position of the British Royal Observatory in Greenwich, UK.
         * - altitude (symbol `h`) defined by LengthValue, that is the distance between P and the reference ellipsoid
         *   in the normal direction to the ellipsoid. Positive altitude specifies a position above the reference ellipsoid surface,
         *   while a negative value specifies a position below.
         *
         * Note 1: The reference meridian is also called prime meridian.
         * Note 2: The basis vectors `vec(e_φ)(φ)`, `vec(e_λ)(λ)` and `vec(e_h)(φ,λ)` form an orthonormal right-handed frame, where
         * `vec(e_φ)` and `vec(e_λ)` are tangent to the reference ellipsoid in the respective latitude and longitude directions,
         * and `vec(e_h)` is normal to the reference ellipsoid.
         * Note 3: In order to transform to and from a CartesianSpatial3dCoordinateFrame the `vec(e_x)` Cartesian basis vector is aligned
         * with the `φ=0` and `λ=0` direction in the planetary frame, and the `vec(e_z)` Cartesian basis vector is aligned
         * with the `λ=π/2` (north pole) direction in the planetary frame.
         * Note 4: See also https://en.wikipedia.org/wiki/Planetary_coordinate_system .
         */
        attribute latitudeUnit : AngularMeasureUnit;
        attribute longitudeUnit : AngularMeasureUnit;
        attribute altitudeUnit : LengthUnit;
        attribute :>> mRefs = (longitudeUnit, latitudeUnit, altitudeUnit);
        attribute :>> isOrthogonal = true;
    }

"""

    SPATIAL_CARTESIAN_VECTOR_QUANTITIES = """\
    attribute def Cartesian{quantity_definition} :> {quantity_definition} {{
        attribute x : LengthValue = num#(1) [mRef.mRefs#(1)];
        attribute y : LengthValue = num#(2) [mRef.mRefs#(2)];
        attribute z : LengthValue = num#(3) [mRef.mRefs#(3)];
        attribute :>> mRef : CartesianSpatial3dCoordinateFrame[1];
    }}
    attribute cartesian{quantity_definition} : Cartesian{quantity_definition} :> {quantity_usage};

"""

    SPATIAL_CYLINDRICAL_VECTOR_QUANTITIES = """\
    attribute def Cylindrical{quantity_definition} :> {quantity_definition} {{
        attribute <'ρ'> radialDistance : LengthValue = num#(1) [mRef.mRefs#(1)];
        attribute <'φ'> azimuth : AngularMeasureUnit = num#(2) [mRef.mRefs#(2)];
        attribute <h> height : LengthValue = num#(3) [mRef.mRefs#(3)];
        attribute :>> mRef : CylindricalSpatial3dCoordinateFrame[1];
    }}
    attribute cylindrical{quantity_definition} : Cylindrical{quantity_definition} :> {quantity_usage};

"""

    SPATIAL_SPHERICAL_VECTOR_QUANTITIES = """\
    attribute def Spherical{quantity_definition} :> {quantity_definition} {{
        attribute <r> radialDistance : LengthValue = num#(1) [mRef.mRefs#(1)];
        attribute <'θ'> inclination : AngularMeasureUnit = num#(2) [mRef.mRefs#(2)];
        attribute <'φ'> azimuth : AngularMeasureUnit = num#(3) [mRef.mRefs#(3)];
        attribute :>> mRef : SphericalSpatial3dCoordinateFrame[1];
    }}
    attribute spherical{quantity_definition} : Spherical{quantity_definition} :> {quantity_usage};

"""

    SPATIAL_PLANETARY_VECTOR_QUANTITIES = """\
    attribute def Planetary{quantity_definition} :> {quantity_definition} {{
        attribute <lat> latitude : AngularMeasureUnit = num#(1) [mRef.mRefs#(1)];
        attribute <long> longitude : AngularMeasureUnit = num#(2) [mRef.mRefs#(2)];
        attribute <h> altitude : LengthValue = num#(3) [mRef.mRefs#(3)];
        attribute :>> mRef : PlanetarySpatial3dCoordinateFrame[1];
    }}
    attribute planetary{quantity_definition} : Planetary{quantity_definition} :> {quantity_usage};

"""
