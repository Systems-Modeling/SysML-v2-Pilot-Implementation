package VariableFeatureSubsetting {
    class A {
        :>> snapshots {
            feature s;
        }
        var feature x :> snapshots.s;
        feature y :> x;
        var feature z :> x, y;
    }
    
    class B {
        feature y;   
        var feature x :> y;
    }
     
    class C {
        feature a : A;
        var feature b : B;
         
        connector a to b;
        connector {
            end ::> a;  
            end ::> b;
        }
    }
}