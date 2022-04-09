package VehicleGeometryAndCoordinateFrames {
	import SI::*;
	import Time::*;

    import ShapeItems::*;
    import SpatialItems::*;

    import UnitsAndScales::TranslationRotationSequence;
    import UnitsAndScales::Translation;
    import UnitsAndScales::Rotation;
    
    private import Collections::Array;
    private import ScalarValues::Real;

    part def Vehicle :> SpatialItem;

    part def Wheel :> SpatialItem {
        item :>> shape : Cylinder {
        	// estimated radius of 22 inch hub + 110 mm tire height 
            :>> radius = 22/2*25.4 + 110 [mm]; 
            :>> height = 220 [mm];
        }
    }

    part def Chassis :> SpatialItem {
        item :> shape : Box[1] {
            :>> length = 4800 [mm];
            :>> width = 1840 [mm];
            :>> height = 1350 [mm];
        }
    }

    part vehicle : Vehicle {
		/* 
		 * Vehicle frame origin at center of bottom plate of chassis
		 * with +Z upwards and +X in the forward (front) direction
		 */
        attribute datum :>> coordinateFrame {
            :>> mRefs = (mm, mm, mm);
        }

        part chassis : Chassis[1] :> componentItems {
			attribute :>> coordinateFrame {
				attribute :>> transformation : TranslationRotationSequence {
                	:>> sequence = Translation((-(shape as Box).length/2, -(shape as Box).width/2, 0)[datum]);
                } 
			}        	
        }

        private attribute plusXAxis : Array { :>> dimensions = 3; :>> elements : Real[3] = (1, 0, 0); }
        private attribute xFrontWheelShift : Real = 1670;
        private attribute xRearWheelShift : Real = -1820;
        private attribute yWheelShift : Real = 720;

        part leftFrontWheel : Wheel[1] {
            attribute :>> coordinateFrame {
                attribute :>> transformation : TranslationRotationSequence {
	            	attribute :>> source = datum;
                	attribute :>> sequence = (Translation((xFrontWheelShift, yWheelShift, 80)[datum]), Rotation(plusXAxis[datum], -90['°']));
                }
            }
        }
        part rightFrontWheel : Wheel[1] :> componentItems {
            attribute :>> coordinateFrame {
                attribute :>> transformation : TranslationRotationSequence {
                	attribute :>> source = datum;
                	attribute :>> sequence = (Translation((xFrontWheelShift, -yWheelShift, 80)[datum]), Rotation((1, 0, 0)[datum], 90['°']));
                }
            }
        }
        part leftRearWheel : Wheel[1] :> componentItems {
            attribute :>> coordinateFrame {
                attribute :>> transformation : TranslationRotationSequence {
                	attribute :>> source = datum;
                	attribute :>> sequence = (Translation((xRearWheelShift, yWheelShift, 80)[datum]), Rotation((1, 0, 0)[datum], 90['°']));
                }
            }
        }
        part rightRearWheel : Wheel[1] :> componentItems {
            attribute :>> coordinateFrame {
                attribute :>> transformation : TranslationRotationSequence {
					attribute :>> source = datum;
                	attribute :>> sequence = (Translation((xRearWheelShift, -yWheelShift, 80)[datum]), Rotation((-1, 0, 0)[datum], 90['°']));
                }
            }
        }
    }
}
