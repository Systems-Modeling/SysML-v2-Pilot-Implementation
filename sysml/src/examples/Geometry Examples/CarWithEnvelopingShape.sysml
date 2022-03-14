package CarWithEnvelopingShape {
	import Items::Item;
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
	 * Example car with simple eveloping shape that is a solid box
	 */
	part def Car :> TangibleItem {
		private item envelopingBox : Box {
			:>> length = 4800 [mm];
			:>> width = 1840 [mm];
			:>> height = 1350 [mm];
		}
		:>> shape = envelopingBox;
	}
}