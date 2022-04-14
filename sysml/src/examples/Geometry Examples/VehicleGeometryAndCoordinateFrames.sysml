package VehicleGeometryAndCoordinateFrames {
    import TrigFunctions::*;
    import ISQ::*;
	import SI::*;
	import Time::*;

    import ShapeItems::*;
    import SpatialItems::*;

    import UnitsAndScales::CoordinateFrame;
    import UnitsAndScales::TranslationRotationSequence;
    import UnitsAndScales::Translation;
    import UnitsAndScales::Rotation;
    
    private import Collections::Array;
    private import ScalarValues::Real;
    private import ScalarValues::Natural;
    
    part def Vehicle :> CompoundSpatialItem;

    part def Chassis :> CompoundSpatialItem {
        item :>> shape = Box(4800 [mm], 1840 [mm], 1350 [mm]);
    }

	/**
	 * Generic wheel with lugbolts
	 * 
	 * The radius is estimated for 22 inch hub and 110 mm tire height
	 * The wheel width is equal to the cylinder height 
	 */
    part def Wheel :> CompoundSpatialItem {
    	ref item :>> self : Wheel;
        item :>> shape : Cylinder {
            :>> radius = 22/2*25.4 + 110 [mm]; 
            :>> height = 220 [mm];
        }
        attribute numberOfBolts : Natural = 5;
		part lugBolts : LugBolt[Wheel::numberOfBolts] = (
			LugBolt(1, numberOfBolts, self.coordinateFrame),
			LugBolt(2, numberOfBolts, self.coordinateFrame),
			LugBolt(3, numberOfBolts, self.coordinateFrame),
			LugBolt(4, numberOfBolts, self.coordinateFrame),
			LugBolt(5, numberOfBolts, self.coordinateFrame),
		);
    }

    part def LugBolt :> CompoundSpatialItem {
        attribute boltNumber : Natural;
        attribute numberOfBolts : Natural;
        attribute <scf> sourceCoordinateFrame : CoordinateFrame;
        attribute <lbpr> lugBoltPlacementRadius :>> radius default 60 [mm];
		private attribute lugBoltPlacementAngle :>> planeAngle = 360/numberOfBolts ['°'];
        private attribute lbpa : Real = lugBoltPlacementAngle.num * (pi/180); // placement angle in radian
    	item :>> shape : Cylinder {
    		:>> radius = 14 [mm];
    		:>> height = 40 [mm];
    	}
		attribute :>> coordinateFrame {
			attribute :>> transformation : TranslationRotationSequence {
 	          	attribute :>> source = scf;
            	attribute :>> sequence = Translation((lbpr*cos((boltNumber-1)*lbpa), lbpr*sin((boltNumber-1)*lbpa), -8)[scf]);
            } 
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
	 	          	attribute :>> source = datum;
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
