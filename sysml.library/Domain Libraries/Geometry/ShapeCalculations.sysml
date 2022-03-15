/**
 * This package provides convenience operators for constructing CompoundShapeDefinitions and defines 
 * calculations for reifying ShapeDefinitions into SpatialItems.
 */
package ShapeCalculations {
	private import Items::Item;
	private import ShapeDefinitions::*;
	private import ShapeItems::*;
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
	 * Return a Item with a spatial extent determined by a given ShapeDefinition.
	 */
	abstract calc def ReifyShape (shapeDef : ShapeDefinition) shapedItem : Item;
	
	/**
	 * Return an Object whose special extent is determined by a ShapeUnion shape.
	 */
	calc def ReifyShapeUnion :> ReifyShape (shapeDef : ShapeUnion) {
		return shapedItem {
			:>> unionsOf[1] {
				:>> elements = shapeDef.operands->collect{in s; ReifyShape(s)};
			}
		}
	}
	
	/**
	 * Return an Object whose spatial extent is determined by a ShapeDifference shape.
	 */
	calc def ReifyShapeDifference :> ReifyShape (shapeDef : ShapeDifference) {
		return shapedItem {
			:>> differencesOf[1] {
				:>> elements = shapeDef.operands->collect{in s; ReifyShape(s)};
			}
		}
	}
	
	/**
	 * Return an Object whose spatial extent is determined by a ShapeIntersection shape.
	 */
	calc def ReifyShapeIntersection :> ReifyShape (shapeDef : ShapeIntersection) {
		return shapedItem {
			:>> intersectionsOf[1] {
				:>> elements = shapeDef.operands->collect{in s; ReifyShape(s)};
			}
		}
	}
	
	calc def ReifyCuboid :> ReifyShape (shapeDef : CuboidDefinition) {
		return shapedItem : Cuboid {
			:>> length = shapeDef.length;
			:>> width = shapeDef.width;
			:>> height = shapeDef.height;
		}
	}
	
	calc def ReifyCone :> ReifyShape (shapeDef : ConeDefinition) {
		return shapedItem : Cone {
			:>> baseRadius = shapeDef.baseRadius;
			:>> apexRadius = shapeDef.apexRadius;
			:>> height = shapeDef.height;
		}
	}
	
	calc def ReifyCylinder :> ReifyCone (shapeDef : CylinderDefinition) {
		return shapedItem : Cylinder {
			:>> radius = shapeDef.radius;
			:>> height = shapeDef.height;
		}
	}
	
	calc def ReifySphere :> ReifyShape (shapeDef : SphereDefinition) {
		return shapedItem : Sphere {
			:>> radius = shapeDef.radius;
		}
	}
}