package ShapeDefinitions {
	private import ScalarValues::Boolean;
	private import ISQ::Cartesian3dPositionVector;
	private import ISQ::length;
	private import ISQ::width;
	private import ISQ::height;
	private import ISQ::radius;
	private import ISQ::area;
	private import SI::m;
	
	/**
	 * A ShapeDefinition contains the attributive information necessary to defintion the shape
	 * of a solid SpatialItem.
	 */
	abstract attribute def ShapeDefinition;
	
	/**
	 * A CompoundShapeDefinition is a ShapeDefinition that is the result of 
	 * a constructive solid geometry expression.
	 */
	abstract attribute def CompoundShapeDefinition :> ShapeDefinition {
		attribute operands : ShapeDefinition[1..*] ordered;
    }
    attribute def ShapeUnion :> CompoundShapeDefinition;
    attribute def ShapeDifference :> CompoundShapeDefinition;
    attribute def ShapeIntersection :> CompoundShapeDefinition;
        
    /**
     * A PrimitiveShapeDefinition is a ShapeDefinition that is not constructed
     * from other ShapeDefinitions.
     * 
     * Note: A PrimitiveShapeDefinition may be used as any operand in a CompoundShapeDefinition.
     */
	abstract attribute def PrimitiveShapeDefinition :> ShapeDefinition {
    }
	
	/**
	 * A CuboidShapeDefinition is the PrimitiveShapeDefinition of a 3D cuboid shape.
	 */
	attribute def CuboidDefinition :> PrimitiveShapeDefinition {
		attribute :>> length;
		attribute :>> width;
		attribute :>> height;
	}
	alias Box for CuboidDefinition;
	
	/**
	 * A ConeShapeDefinition is the PrimitiveShapeDefinition of a 3D right circular cone shape
	 */
	attribute def ConeDefinition :> PrimitiveShapeDefinition {
		attribute baseRadius :> radius;
		attribute apexRadius :> radius default 0 [m];
		attribute :>> height;
	}
		
	/**
	 * A CylinderShapeDefinition is the PrimitiveShapeDefniition of a 3D right circular cylinder shape.
	 */
	attribute def CylinderDefinition :> ConeDefinition {
		attribute :>> radius = baseRadius;
		attribute :>> baseRadius = apexRadius;
	}

	/**
	 * A SphereDefinition is the PrimitiveShapeDefinition of a 3D sphere solid shape
	 */
	attribute def SphereDefinition :> PrimitiveShapeDefinition {
		attribute :>> radius;
	}

	/**
	 * A SurfaceDefinition contains the attributive information necessary to define a surface
	 * in 3D space.
	 */
	 attribute def SurfaceDefinition {
	 	attribute :>> area;
	 	// other info TBD
	 }
	
	/**
	 * A HalfSpaceShapeDefinition is a ShapeDefinitionof a 3D halfspace solid shape for use as a 
	 * ShapeDifference operand.
	 * 
	 * Note: A HalfSpaceShapeDefinition may only be used as the second or subsequent operand in a 
	 * CompoundShapeDefinition.
	 */
	attribute def HalfSpaceDefinition :> ShapeDefinition {
		attribute baseSurface : SurfaceDefinition[1];
		attribute antiNormalSideSelect : Boolean[1];
    }
    
    /**
     * A BoxedHalfSpaceShapeDefinition is a HalfSpaceShapeDefinition trimmed by a surrounding 
     * rectangular box aligned with coordinate axes
     */
	attribute def BoxedHalfSpaceDefinition :> HalfSpaceDefinition {
		attribute trimmingBoxCorner : Cartesian3dPositionVector[1];
		attribute trimmingLength :>> length;
		attribute trimmingWidth :>> width;
		attribute trimmingHeight :>> height;
    }
	
}