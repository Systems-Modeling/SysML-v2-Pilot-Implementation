package CarWithEnvelopingShape {
	import Shapes::*;
	import ISQ::mass;
	import SI::mm;
	private import ISQ::Cartesian3dSpatialCoordinateSystem;

	/**
	 * Abstract general tangible item
	 * 
	 * TODO: Move to Items.sysml library? Rename to PhysicalItem? Add other attributes?
	 */
	abstract item def TangibleItem {
        attribute localFrame : Cartesian3dSpatialCoordinateSystem[1];
	    attribute shape : Shape[0..*];
	}
	
	/**
	 * Example car with simple eveloping shape that is a solid box
	 */
	part def Car :> TangibleItem {
		private attribute envelopingBox : Box {
			// :>> transformation : CoordinateTransformation { ... }
			:>> length = 4800 [mm];
			:>> width = 1840 [mm];
			:>> height = 1350 [mm];
		}
		:>> shape = envelopingBox;
	}
}