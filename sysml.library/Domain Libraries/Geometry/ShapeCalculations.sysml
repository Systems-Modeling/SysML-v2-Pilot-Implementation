package ShapeCalculations {
	private import Objects::Object;
	private import Shapes::Shape;
	private import CSGShapes::*;
	private import ControlFunctions::collect;

    /** 
     * Constructive Solid Geometry Union
     * Returns the union of the solid extents of x and y combined
     * Note: Operands x and y may overlap, touch or have no common extent.
     */
	calc def '+' specializes DataFunctions::'+' (x: CsgSolid[1], y: CsgSolid[1]): CsgCompound[1] {
		CsgUnion((x, y))
	}

    /**
     * Constructive Solid Geometry Difference
     * Returns the solid extent of x with the solid extent of y removed
     */
	calc def '-' specializes DataFunctions::'-' (x: CsgSolid[1], y: CsgSolid[1]): CsgCompound[1] {
		CsgDifference((x, y))
	}

    /**
     * Constructive Solid Geometry Intersection
     * Returns the common (overlapping) solid extents of x and y
     * Note: Can be empty if no overlap between x and y exists.
     */
	calc def '&' specializes DataFunctions::'&' (x: CsgSolid[1], y: CsgSolid[1]): CsgCompound[1] {
		CsgIntersection((x, y))
	}
	
	/**
	 * Return an Object with a spatial extent determined by a given Shape.
	 */
	abstract calc def ReifyShape (shape : Shape): Object;
	
	/**
	 * Return an Object whose special extent is determined by a CsgUnion shape.
	 */
	calc def ReifyCsgUnion :> ReifyShape (shape : CsgUnion) {
		return unionObject : Object {
			:>> unionsOf[1] {
				:>> elements = shape.operands->collect{in s; ReifyShape(s)};
			}
		}
	}
	
	/**
	 * Return an Object whose special extent is determined by a CsgDifference shape.
	 */
	calc def ReifyCsgDifference :> ReifyShape (shape : CsgDifference) {
		return differenceObject : Object {
			:>> differencesOf[1] {
				:>> elements = shape.operands->collect{in s; ReifyShape(s)};
			}
		}
	}
	
	/**
	 * Return an Object whose special extent is determined by a CsgIntersection shape.
	 */
	calc def ReifyCsgIntersection :> ReifyShape (shape : CsgIntersection) {
		return intersectionObject : Object {
			:>> intersectionsOf[1] {
				:>> elements = shape.operands->collect{in s; ReifyShape(s)};
			}
		}
	}
	
	/*
	 * TODO: Update return operations to library types for Objects (Items) corresponding
	 * to each of the primitive CSG shapes.
	 */
	calc def ReifyCuboid :> ReifyShape (shape : Cuboid) : Object;
	calc def ReifyCylinder :> ReifyShape (shape : Cylinder) : Object;
	calc def ReifyCone :> ReifyShape (shape : Cone) : Object;
	calc def ReifySphere :> ReifyShape (shape : Sphere) : Object;
}