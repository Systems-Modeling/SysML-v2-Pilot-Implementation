package SimplePartWithShape {
	import Shapes::*;
	import SI::*;

	abstract item def TangibleItem {
	    attribute shape : Shape;
	}
	
	part def Car :> TangibleItem {
		private attribute envelopingBox : SolidBox {
			:>> length = 4800 [mm];
			:>> width = 1840 [mm];
			:>> height = 1350 [mm];
		}
		:>> shape = envelopingBox;
	}
}