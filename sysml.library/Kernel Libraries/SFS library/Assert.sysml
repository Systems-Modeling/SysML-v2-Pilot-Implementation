//standard 
library package Assert {

private import ScalarValues::String;

metadata def Assert {
  attribute f[1..*] : String;
}

metadata def Invariant {
  attribute inv[1] : String;
}

}