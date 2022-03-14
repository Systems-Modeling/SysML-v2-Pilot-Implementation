/**
 * This package provides convenience operators for constructing CompoundShapeDefinitions and defines 
 * calculations for reifying ShapeDefinitions into SpatialItems.
 */
package ShapeCalculations {
	private import ShapeDefinitions::*;
	private import BasicShapeItems::*;
	private import SpatialItems::SpatialItem;
	private import ControlFunctions::collect;

    /** 
     * Constructive Solid Geometry Union
     * Returns the union of the solid extents of x and y combined
     * Note: Operands x and y may overlap, touch or have no common extent.
     */
	calc def '+' specializes DataFunctions::'+' (x: ShapeDefinition[1], y: ShapeDefinition[1]): CompoundShapeDefinition[1] {
		ShapeUnion((x, y))
	}

    /**
     * Constructive Solid Geometry Difference
     * Returns the solid extent of x with the solid extent of y removed
     */
	calc def '-' specializes DataFunctions::'-' (x: ShapeDefinition[1], y: ShapeDefinition[1]): CompoundShapeDefinition[1] {
		ShapeDifference((x, y))
	}

    /**
     * Constructive Solid Geometry Intersection
     * Returns the common (overlapping) solid extents of x and y
     * Note: Can be empty if no overlap between x and y exists.
     */
	calc def '&' specializes DataFunctions::'&' (x: ShapeDefinition[1], y: ShapeDefinition[1]): CompoundShapeDefinition[1] {
		ShapeIntersection((x, y))
	}
	
	/**
	 * Return a SpatialItem with a spatial extent determined by a given ShapeDefinition.
	 */
	abstract calc def ReifyShape (shapeDef : ShapeDefinition) {
		return reifiedShape : SpatialItem {
			attribute :>> shapeDefinition = shapeDef;
		}
	}
	
	/**
	 * Return an Object whose special extent is determined by a ShapeUnion shape.
	 */
	calc def ReifyShapeUnion :> ReifyShape (shapeDef : ShapeUnion) {
		return unionObject : SpatialItem {
			:>> unionsOf[1] {
				:>> elements = shapeDef.operands->collect{in s; ReifyShape(s)};
			}
		}
	}
	
	/**
	 * Return an Object whose spatial extent is determined by a ShapeDifference shape.
	 */
	calc def ReifyShapeDifference :> ReifyShape (shapeDef : ShapeDifference) {
		return differenceObject : SpatialItem {
			:>> differencesOf[1] {
				:>> elements = shapeDef.operands->collect{in s; ReifyShape(s)};
			}
		}
	}
	
	/**
	 * Return an Object whose spatial extent is determined by a ShapeIntersection shape.
	 */
	calc def ReifyShapeIntersection :> ReifyShape (shapeDef : ShapeIntersection) {
		return intersectionObject : SpatialItem {
			:>> intersectionsOf[1] {
				:>> elements = shapeDef.operands->collect{in s; ReifyShape(s)};
			}
		}
	}
	
	calc def ReifyCuboid :> ReifyShape (shapeDef : CuboidDefinition) : Cuboid;
	calc def ReifyCylinder :> ReifyShape (shape : CylinderDefinition) : Cylinder;
	calc def ReifyCone :> ReifyShape (shapeDef : ConeDefinition) : Cone;
	calc def ReifySphere :> ReifyShape (shapeDef : SphereDefinition) : Sphere;
}