package ExternalShapeRefExample {
	import Items::Item;
	import ScalarValues::String;
	import ShapeItems::*;
	import ISQ::mass;
	import SI::mm;
	private import ISQ::Cartesian3dSpatialCoordinateSystem;

	/**
	 * Abstract general tangible item (temporary placeholder)
	 * 
	 * TODO: Should be moved to a library package
	 */
	abstract item def TangibleItem {
        attribute localFrame : Cartesian3dSpatialCoordinateSystem[1];
		item alternativeShapes : Item[0..*];
	}
	
	/**
	 * Reference to an externally defined shape
	 */
	item def ExternalShapeRef {
		attribute purpose : String[1];
		attribute shapeIri : String[1];
	}
	
	part myBatteryUnit : TangibleItem {
		private item envelopingBoxBatteryUnit : Box {
			:>> length = 140[mm];
			:>> width = 148[mm];
			:>> height = 90[mm];
		}
		private item extShape : ExternalShapeRef {
			:>> purpose = "highLoD";
			:>> shapeIri = "file:/detailed-geometry/LEMS-250W_BatteryHousing_Example.step";
		}		
		item :>> shape = envelopingBoxBatteryUnit;
		item :>> alternativeShapes = extShape;
	}
}