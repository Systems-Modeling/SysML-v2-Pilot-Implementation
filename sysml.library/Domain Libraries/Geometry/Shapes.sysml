package Shapes {
	private import ScalarValues::String;
	private import ScalarValues::Boolean;
	private import UnitsAndScales::CoordinateTransformation;
	private import ISQ::*;
	private import SI::*;
	private import Collections::KeyValuePair;
	private import Collections::Map;


    /**
     * Most general representation of a geometric shape.
     */
	abstract attribute def Shape {
	}
	
	/**
	 * Most general representation of a 3D solid shape
	 * 
	 * Attribute transformation allow to place the shape w.r.t. the coordinate frame of the owning Item.
	 */
	abstract attribute def Solid3dShape :> Shape {
		attribute transformation : CoordinateTransformation[0..1];
	}
	
	/**
	 * Most general representation of a CSG 3D solid shape
	 * 
	 * Note: CSG stands for Constructive Solid Geometry, see https://en.wikipedia.org/wiki/Constructive_solid_geometry .
	 */
	abstract attribute def CsgSolid :> Solid3dShape {
	}
	
	/**
	 * 3D CSG solid that is the result of a CSG boolean expression
	 */
	attribute def CsgCompound :> CsgSolid{
		attribute operands : CsgSolid[2..*] ordered;
		attribute operator : BooleanOperatorKind[1];
    }
    
    /**
     * Enumeration of CSG boolean operators 
     */
     enum def BooleanOperatorKind {
     	enum Union;
     	enum Difference;
     	enum Intersection;
     }
    
    /**
     * Most general representation of a primitive CSG 3D solid shape
     * 
     * Note: A CsgPrimitive may be used as any operand in a CsgCompound.
     */
	abstract attribute def CsgPrimitive :> CsgSolid {
    }
	
	/**
	 * Representation of a 3D cuboid solid shape
	 */
	abstract attribute def Cuboid :> CsgPrimitive {
		attribute :>> length;
		attribute :>> width;
		attribute :>> height;
	}
	alias Box for Cuboid;
	
	/**
	 * Representation of a 3D right circular cylinder solid shape
	 */
	abstract attribute def Cylinder :> CsgPrimitive {
		attribute :>> radius;
		attribute :>> height;
	}

	/**
	 * Representation of a 3D right circular cone solid shape
	 */
	abstract attribute def Cone :> CsgPrimitive {
		attribute baseRadius :>> radius;
		attribute apexRadius :>> radius default 0 [m];
		attribute :>> height;
	}
		
	/**
	 * Representation of a 3D sphere solid shape
	 */
	abstract attribute def Sphere :> CsgPrimitive {
		attribute :>> radius;
	}

    /**
     * Most general representation of a surface in 3D space
     */
    attribute def Surface;
	
	/**
	 * Representation of a 3D halfspace solid shape for use as CSG difference operand
	 * 
	 * Note: A CsgHalfSpaceSolid may only be used as the second or subsequent operand in a CsgCompound.
	 */
	attribute def CsgHalfSpaceSolid :> CsgSolid {
		attribute baseSurface : Surface[1];
		attribute antiNormalSideSelect : Boolean[1];
    }
    
    /**
     * 3D halfspace solid shape trimmed by a surrounding rectangular box aligned with coordinate axes
     */
	attribute def CsgBoxedHalfSpaceSolid :> CsgHalfSpaceSolid {
		attribute trimmingBoxCorner : Cartesian3dPositionVector[1];
		attribute trimmingLength :>> length;
		attribute trimmingWidth :>> width;
		attribute trimmingHeight :>> height;
    }

	/**
	 * Reference to an externally defined shape
	 *  
	 * Attribute levelOfDetail denotes the level-of-detail of an external shape representation,
	 * e.g. "medium level-of-detail" of "MLoD", "high level-of-detail" or "HLoD", "high fidelity".
	 * Attribute shapeIri is an Internationalized Resource Identifier (IRI) that references an external shape definition,
	 * in neutral or native CAD format, in a file or repository.
	 * 
	 * TODO: Consider replacing levelOfDetail type by enum def.
	 * TODO: Attribute shapeIri should be a specialization of a generic IRI datatype, 
	 * and aligned with the general KerML / SysML concept for external reference.
	 */
	attribute def ExternalShapeRef :> Solid3dShape {
		attribute levelOfDetail : String[1];
		attribute shapeIri : String[1];
	}
}