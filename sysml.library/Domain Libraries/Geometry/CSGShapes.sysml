package CSGShapes {
	private import ScalarValues::Boolean;
	private import Shapes::Solid3dShape;
	private import Shapes::Surface;
	private import ISQ::Cartesian3dPositionVector;
	private import ISQ::length;
	private import ISQ::width;
	private import ISQ::height;
	private import ISQ::radius;
	private import SI::m;
	
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
	abstract attribute def CsgCompound :> CsgSolid{
		attribute operands : CsgSolid[1..*] ordered;
    }
    attribute def CsgUnion :> CsgCompound;
    attribute def CsgDifference :> CsgCompound;
    attribute def CsgIntersection :> CsgCompound;
        
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
	attribute def Cuboid :> CsgPrimitive {
		attribute :>> length;
		attribute :>> width;
		attribute :>> height;
	}
	alias Box for Cuboid;
	
	/**
	 * Representation of a 3D right circular cylinder solid shape
	 */
	attribute def Cylinder :> CsgPrimitive {
		attribute :>> radius;
		attribute :>> height;
	}

	/**
	 * Representation of a 3D right circular cone solid shape
	 */
	attribute def Cone :> CsgPrimitive {
		attribute baseRadius :>> radius;
		attribute apexRadius :>> radius default 0 [m];
		attribute :>> height;
	}
		
	/**
	 * Representation of a 3D sphere solid shape
	 */
	attribute def Sphere :> CsgPrimitive {
		attribute :>> radius;
	}

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
	
}