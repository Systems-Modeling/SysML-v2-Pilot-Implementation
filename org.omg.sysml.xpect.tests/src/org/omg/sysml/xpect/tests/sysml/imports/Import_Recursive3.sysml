 package P {
    part def X {
    	part def X1;
    }
    package Q {
      part def Y;
      package R {
        part def Z;
      }
    }
    package S {
      part def S1 specializes X;
      package T {
        part def T1;
        package U {
        	part def U1;
        }
      }
    }
    
  }