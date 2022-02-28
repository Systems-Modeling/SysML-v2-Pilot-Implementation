/**
 * This package models SpatialFrames that provide a frame of reference for
 * quantifying the position of points in a three-dimensional space. 
 */
package SpatialFrames {
	private import VectorValues::ThreeVectorValue;
	private import VectorValues::CartesianThreeVectorValue;
	private import VectorFunctions::isZeroVector;
	
	// TODO: Replace with import after ST6RI-505 is done. 
	struct Point;
	
	/**
	 * A fixed SpatialFrame used as a universal default.
	 */
	feature defaultFrame : SpatialFrame[1];
	
	/**
	 * A SpatialFrame is a Structure that provides a spatial extent over all time, 
	 * that acts as a frame of reference for defining phyiscal position and displacement 
	 * vectors.
	 */
	abstract struct SpatialFrame {
		// TODO: Add topological invariants after ST6RI-505 is done.
	}
	
	/**
	 * The PositionOf a Point relative to a SpatialFrame as a positionVector that is a
	 * ThreeVectorValue.
	 */
	abstract function PositionOf {
		in point : Point[1];
		in frame : SpatialFrame[1] default defaultFrame;
		return positionVector : ThreeVectorValue[1];
	}
	
	/**
	 * The DisplacementOf two Points relative to a SpatialFrame is the displacementVector
	 * computed as the difference between the PositionOf the first point and PositionOf the
	 * second point, relative to that SpatialFrame.
	 */
	function DisplacementOf {
		in point1 : Point[1];
		in point2 : Point[1];
		in frame : SpatialFrame[1] default defaultFrame;
		return displacementVector : ThreeVectorValue[1] =
			PositionOf(point2, frame) - PositionOf(point1, frame);
		
		inv zeroDisplacementConstraint { 
			(point1 == point2) == isZeroVector(displacementVector)
		}
	}
	
	/**
	 * A CartesianSpatialFrame is a SpatialFrame relative to which all position and displacement
	 * vectors can be represented as CartesianThreeVectorValues.
	 */
	struct CartesianSpatialFrame :> SpatialFrame;
	
	/**
	 * The PositionOf a point relative to a CartesianSpatialFrame is a CartesianThreeVectorValue.
	 */
	function CartesianPositionOf :> PositionOf {
		in point : Point[1];
		in frame : CartesianSpatialFrame[1];
		return positionVector : CartesianThreeVectorValue;
	}
	
	/**
	 * The DisplacementOf two points relative to a CartesianSpatialFrame is a CartesianThreeVectorValue.
	 */
	function Cartesian3DDisplacementOf :> DisplacementOf {
		in point1 : Point[1];
		in point2 : Point[1];
		in frame : CartesianSpatialFrame;
		return displacementVector : CartesianThreeVectorValue[1];
	}
		
}