package ShapeCalculations {
	import Shapes::CsgSolid;
	import Shapes::CsgCompound;

    /** 
     * Constructive Solid Geometry Union
     * Returns the union of the solid extents of x and y combined
     * Note: Operands x and y may overlap, touch or have no common extent.
     */
	calc def csgUnion(x: CsgSolid[1], y: CsgSolid[1]): CsgCompound[1];
	calc def '+' specializes DataFunctions::'+' (x: CsgSolid[1], y: CsgSolid[1]): CsgCompound[1] {
		csgUnion(x, y)
	}

    /**
     * Constructive Solid Geometry Difference
     * Returns the solid extent of x with the solid extent of y removed
     */
	calc def csgDifference(x: CsgSolid[1], y: CsgSolid[1]): CsgCompound[1];
	calc def '-' specializes DataFunctions::'-' (x: CsgSolid[1], y: CsgSolid[1]): CsgCompound[1] {
		csgDifference(x, y)
	}

    /**
     * Constructive Solid Geometry Intersection
     * Returns the common (overlapping) solid extents of x and y
     * Note: Can be empty if no overlap between x and y exists.
     */
	calc def csgIntersection(x: CsgSolid[1], y: CsgSolid[1]): CsgCompound[1];
	calc def '&' specializes DataFunctions::'&' (x: CsgSolid[1], y: CsgSolid[1]): CsgCompound[1] {
		csgIntersection(x, y)
	}
}