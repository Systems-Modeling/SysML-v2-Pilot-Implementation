package Shapes {
	private import ScalarValues::String;
	private import UnitsAndScales::CoordinateTransformation;
	private import ISQ::*;
	private import SI::*;
	private import Collections::KeyValuePair;
	private import Collections::Map;

	abstract attribute def Shape {
	}
	
	abstract attribute def Solid3dShape :> Shape {
		attribute transformation : CoordinateTransformation[1];
	}
	
	abstract attribute def CsgSolid :> Solid3dShape {
	    attribute csgRoot : CsgOperand[1];	    	
	}
	
	abstract attribute def CsgOperand  {
	}
	
	attribute def CsgCompound :> CsgSolid{
		attribute operands : CsgSolid[2..*] ordered;
    }
    
    
	abstract attribute def CsgPrimitive :> CsgSolid {
    }
	
	attribute def CsgHalfSpaceSolid :> CsgSolid {
    }
	
	abstract attribute def SolidCuboid :> CsgPrimitive {
		attribute :>> length;
		attribute :>> width;
		attribute :>> height;
	}
	alias SolidBox for SolidCuboid;
	
	abstract attribute def SolidCylinder :> CsgPrimitive {
		attribute :>> radius;
		attribute :>> height;
	}

	abstract attribute def SolidCone :> CsgPrimitive {
		attribute baseRadius :>> radius;
		attribute apexRadius :>> radius default 0 [m];
		attribute :>> height;
	}
		
	/**
	 * International Resource Identifier (IRI) that references an external shape definition
	 * 
	 * TODO: Attribute iri should be a specialization of a generic IRI datatype.
	 */
	attribute def ShapeRef {
		attribute description: String[1];
		attribute iri : String[1];
	}

	/**
	 * Entry for external shape map
	 * Note: The key is used to distinguish between various level of detail external shape representations,
	 * e.g. "medium level of detail" of "MLoD", "high level of detail" or "HLoD", "high fidelity".
	 * 
	 * TODO: Consider replacing key type by enum def.
	 */
	attribute def ExternalShapeRef :> KeyValuePair {
		:>> key : String;
		:>> val : ShapeRef;
	}

	/**
	 * Reference to an externally defined shape
	 * Note: Typically this will be an IRI pointing to a shape defined in neutral or native CAD file or repository. 
	 */
	attribute def ExternalShape :> Solid3dShape {
		attribute externalShapeMap : Map[1] { :>> elements: ExternalShapeRef[0..*]; }
	}	
}