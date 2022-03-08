package CsgExpressionBasics {
	import Shapes::*;
	import ShapeCalculations::*;
	import SI::mm;

    part def PartA {
    	private attribute myBox : Box {
    		:>> length = 100[mm];
    		:>> width = 30[mm];
    		:>> height = 15[mm];
       	}
       	private attribute myCyl : Cylinder {
       		:>> radius = 8[mm];
       		:>> height = 40[mm];
       	}
       	
       	attribute myBoxAndCylUnion : CsgCompound = myBox + myCyl;
		attribute myBoxWithCylCut : CsgCompound = myBox - myCyl;
		attribute myBoxCylIntersection : CsgCompound = myBox & myCyl;

		attribute shape : Shape = myBoxWithCylCut;
    }
}