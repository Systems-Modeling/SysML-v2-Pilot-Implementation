package Shapes {
	private import ScalarValues::String;
	private import UnitsAndScales::CoordinateTransformation;


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
     * Most general representation of a surface in 3D space
     */
    attribute def Surface;
	
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