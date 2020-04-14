package '15_08-Range Restriction' {
	import SI::*;
	import '15_01-Constants'::'Mathematical Constants'::pi;
	
	block HeadLightsTiltKnob {
		value headLightsTile : LightBeamTiltAngleValue[1];
	}
	
	/* TODO: Define a model library for angular units. */
	value type PlaneAngleValue :> DimensionOneValue;
	part deg: DimensionOneUnit {
		part :>> unitConversion = ConversionByConvention(referenceUnit => one, conversionFactor => pi/180.0);
	}
	
	value type LightBeamTiltAngleValue :> PlaneAngleValue {
		/**
		 * Tilt angle shall be limited to the range between 50 and 80 degrees (inclusive).
		 */
		assert constraint { self >= 50@[deg] & self <= 80@[deg] }
	}
}