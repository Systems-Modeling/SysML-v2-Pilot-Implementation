package CarWithEnvelopingShape {
	import SpatialItems::SpatialItem;
    import ShapeItems::Box;
	import SI::mm;
	import SequenceFunctions::includes;

	/**
	 * Example car with simple enveloping shape that is a solid box
	 */
	part def Car :> SpatialItem {
		private item envelopingShape : Box[1] {
			:>> length = 4800 [mm];
			:>> width = 1840 [mm];
			:>> height = 1350 [mm];
		}
		
		assert constraint { envelopingShape.spaceInterior->includes(shape) }
	}
}