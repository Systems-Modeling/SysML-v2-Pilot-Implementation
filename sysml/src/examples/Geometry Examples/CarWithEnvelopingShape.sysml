package CarWithEnvelopingShape {
	import ShapeItems::Box;
	import SpatialItems::*;
	import SI::mm;

	/**
	 * Example car with simple enveloping shape that is a solid box
	 */
	part def Car :> CompoundSpatialItem {

		item boundingBox : Box [1] :> boundingShapes {
			:>> length = 4800 [mm];
			:>> width  = 1840 [mm];
			:>> height = 1350 [mm];

			  /* Need to ORIENT BOX TO COORD SYSTEM.
			     HP: Could define Box by displacement vector from origin.
			     AP242 ?
			  */

			  /* Bounding box origin usually at a vertez, but car origin typically in center. */

			attribute :>> nestedCoordinateFrame {  /* OR coordinateFrame? */
				attribute :>> transformation : TranslationRotationSequence {
					attribute :>> source = Car::nestedCoordinateFrame;  /* OR coordinateFrame? */
					attribute :>> elements = Translation((-length/2, -width/2, 0)[Car::coordinateFrame]);
				}
			}
		}
	}
}