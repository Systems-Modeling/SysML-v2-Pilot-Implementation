package BasicShapeItems {
	private import SequenceFunctions::isEmpty;
	private import TrigFunctions::pi;
	private import ISQ::length;
	private import ISQ::radius;
	private import SpatialItems::SpatialItem;
	private import ShapeDefinitions::*;
	
	/**
	* Straight line.
	*/
	item def Line :> SpatialItem, BasicShapes::Line {
		attribute :>> length;
	}

	/**
	 * Flat surface.
	 */
	item def PlanarSurface :> SpatialItem, BasicShapes::PlanarSurface {
		attribute surfaceDefinition : SurfaceDefinition;
	}

	item def Circle :> SpatialItem, BasicShapes::Circle {
		attribute :>> radius;

		item :>> edges [1] {
			attribute circumference :>> length = Circle::radius * pi;
		}
	}

	/**
	 * Surface bounded by a circle.
	 */
	item def Disc :> SpatialItem, BasicShapes::Disc {
		attribute radius :>> radius;

		item :>> shape : Circle [1] {  
			attribute :>> radius = Disc::radius;
		}
	}

	item def Sphere :> SpatialItem, BasicShapes::Sphere {
		attribute :>> shapeDefinition : SphereDefinition;
	}

	/**
	 * Right circular cylinder.
	 */
	item def Cylinder :> Cone {
		attribute :>> shapeDefinition : CylinderDefinition;
	}

	/**
	 * Right circular cylinder, possibly truncated.
	 */
	item def Cone :> SpatialItem, BasicShapes::Cone {
		attribute :>> shapeDefinition : ConeDefinition;
		attribute isTruncated = shapeDefinition.apexRadius > 0;

		assert constraint { (shapeDefinition.apexRadius == 0) == isEmpty(af) }
	}

	/**
	 * Six-sided polyhedron with rectangular sides.
	 */
	item def Cuboid :> SpatialItem, BasicShapes::Cuboid {
		attribute :>> shapeDefinition : CuboidDefinition;

		item :>> tfe { attribute :>> length = shapeDefinition.length; }
		item :>> tre { attribute :>> length = shapeDefinition.length; }
		item :>> tsle { attribute :>> length = shapeDefinition.width; }
		item :>> tsre { attribute :>> length = shapeDefinition.width; }
		item :>> bfe { attribute :>> length = shapeDefinition.length; }
		item :>> bre { attribute :>> length = shapeDefinition.length; }
		item :>> bsle { attribute :>> length = shapeDefinition.width; }
		item :>> bsre { attribute :>> length = shapeDefinition.width; }
		item :>> ufle { attribute :>> length = shapeDefinition.height; }
		item :>> ufre { attribute :>> length = shapeDefinition.height; }
		item :>> urle { attribute :>> length = shapeDefinition.height; }
		item :>> urre { attribute :>> length = shapeDefinition.height; }
	}
	alias Box for Cuboid;
}