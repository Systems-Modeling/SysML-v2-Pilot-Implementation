

package ExternalShapeRefExample {
	import Shapes::*;
	import ISQ::mass;
	import SI::mm;
	private import ISQ::Cartesian3dSpatialCoordinateSystem;

	abstract item def TangibleItem {
        attribute localFrame : Cartesian3dSpatialCoordinateSystem[1];
	    attribute shape : Shape[0..*];
	}

	part myBatteryUnit : TangibleItem {
		private attribute envelopingBoxBatteryUnit : Box {
			:>> length = 140[mm];
			:>> width = 148[mm];
			:>> height = 90[mm];
		}
		private attribute extShape : ExternalShapeRef {
			:>> levelOfDetail = "highLoD";
			:>> shapeIri = "file:/detailed-geometry/LEMS-250W_BatteryHousing_Example.step";
		}		
		attribute :>> shape = (envelopingBoxBatteryUnit, extShape);
	}
}