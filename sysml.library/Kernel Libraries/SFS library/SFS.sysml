package SFS {

private import Interfaces::BinaryInterface;
private import Flows::Flow;
private import AADL::DataPort;

  interface def DataPortConnection :> BinaryInterface {
      flow move : Flow {
        end occurrence source : DataPort :>> source = BinaryInterface::source;
        end occurrence target : DataPort :>> target = BinaryInterface::target;
      }
  }


}