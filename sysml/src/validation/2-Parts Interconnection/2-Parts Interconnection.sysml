<?xml version="1.0" encoding="ASCII"?>
<sysml:Package xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:sysml="http://www.omg.org/spec/SysML/2.0">
  <ownedImport>
    <importedPackage href="1a-Parts%20Tree.sysml#/"/>
  </ownedImport>
  <ownedMembership memberName="VehicleA" memberElement="//@ownedMembership.0/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.0/@ownedMemberElement">
        <superclass href="1a-Parts%20Tree.sysml#//@ownedMembership.0/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="fuelCmdPort" memberFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.9/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="vehicleToRoadPort" memberFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.21/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="RearAxleAssembly" memberElement="//@ownedMembership.1/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.1/@ownedMemberElement">
        <superclass href="1a-Parts%20Tree.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_d" memberFeature="//@ownedMembership.1/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.15/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.1/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="RearAxle" memberElement="//@ownedMembership.2/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.2/@ownedMemberElement">
        <superclass href="1a-Parts%20Tree.sysml#//@ownedMembership.2/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="WheelAxle" memberElement="//@ownedMembership.3/@ownedMemberElement">
    <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.3/@ownedMemberElement">
      <ownedRelatedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9; * Note: This class is used for both the left and&#xA;&#x9; * right axles within a RearAxle.&#xA;&#x9; */" annotationForComment="//@ownedMembership.3/@ownedRelationship.0"/>
    </ownedRelationship>
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.3/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="axleToDiffPort" memberFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.17/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="axleToWheelPort" memberFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.18/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="Engine" memberElement="//@ownedMembership.4/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.4/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="fuelCmdPort" memberFeature="//@ownedMembership.4/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.9/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.4/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="drivePwrPort" memberFeature="//@ownedMembership.4/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.10/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.4/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="Transmission" memberElement="//@ownedMembership.5/@ownedMemberElement">
    <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.5/@ownedMemberElement">
      <ownedRelatedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9; * Class Transmission has one of the two parts its usage has.&#xA;&#x9; */" annotationForComment="//@ownedMembership.5/@ownedRelationship.0"/>
    </ownedRelationship>
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.5/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="clutchPort" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.11/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="Driveshaft" memberElement="//@ownedMembership.6/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.6/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_b" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.13/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_c" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.14/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="Differential" memberElement="//@ownedMembership.7/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.7/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="Wheel">
    <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.8">
      <ownedRelatedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9; * Class Wheel does not include the ports its usages have.&#xA;&#x9; */" annotationForComment="//@ownedMembership.8/@ownedRelationship.0"/>
    </ownedRelationship>
    <memberElement href="1a-Parts%20Tree.sysml#//@ownedMembership.4/@ownedMemberElement"/>
  </ownedMembership>
  <ownedMembership memberName="FuelCmdPort" memberElement="//@ownedMembership.9/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.9/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="DrivePwrPort" memberElement="//@ownedMembership.10/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.10/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="ClutchPort" memberElement="//@ownedMembership.11/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.11/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="ShaftPort_a" memberElement="//@ownedMembership.12/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.12/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="ShaftPort_b" memberElement="//@ownedMembership.13/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.13/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="ShaftPort_c" memberElement="//@ownedMembership.14/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.14/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="ShaftPort_d" memberElement="//@ownedMembership.15/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.15/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="DiffPort" memberElement="//@ownedMembership.16/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.16/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="AxlePort" memberElement="//@ownedMembership.17/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.17/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="AxleToWheelPort" memberElement="//@ownedMembership.18/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.18/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="WheelToAxlePort" memberElement="//@ownedMembership.19/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.19/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="WheelToRoadPort" memberElement="//@ownedMembership.20/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.20/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="VehicleToRoadPort" memberElement="//@ownedMembership.21/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.21/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="wheelToRoadPort" memberFeature="//@ownedMembership.21/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.20/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.21/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
          <multiplicity>
            <upper xsi:type="sysml:LiteralInteger" value="2">
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.21/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature/@multiplicity/@upper">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
              </ownedRelationship>
            </upper>
          </multiplicity>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="EngineToTransmissionInterface" memberElement="//@ownedMembership.22/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Association">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.22/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.5/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:EndFeatureMembership" memberName="drivePwrPort" memberFeature="//@ownedMembership.22/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.10/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.22/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
            <redefinedFeature href="../../library/Base.sysml#//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:EndFeatureMembership" memberName="clutchPort" memberFeature="//@ownedMembership.22/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.11/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.22/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature">
            <redefinedFeature href="../../library/Base.sysml#//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="DriveshaftInterface" memberElement="//@ownedMembership.23/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Association">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.23/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.5/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:EndFeatureMembership" memberName="shaftPort_a" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.12/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
            <redefinedFeature href="../../library/Base.sysml#//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:EndFeatureMembership" memberName="shaftPort_d" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.15/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature">
            <redefinedFeature href="../../library/Base.sysml#//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="driveshaft" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.6/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_b" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPort="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.13/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" redefinedFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_c" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPort="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.14/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" redefinedFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature"/>
            </ownedMemberFeature>
          </ownedMembership>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.3/@ownedMemberFeature">
        <ownedMemberFeature xsi:type="sysml:Connector">
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.3/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.14/@ownedMemberElement"/>
          </ownedRelationship>
          <connectorEnd feature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
          <connectorEnd feature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature"/>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.4/@ownedMemberFeature">
        <ownedMemberFeature xsi:type="sysml:Connector">
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.4/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.14/@ownedMemberElement"/>
          </ownedRelationship>
          <connectorEnd feature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature"/>
          <connectorEnd feature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature"/>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="vehicle1_c1" memberElement="//@ownedMembership.24/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Feature">
      <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.0/@ownedMemberElement"/>
      <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement">
        <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="fuelCmdPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.9/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" redefinedFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature">
        <ownedMemberFeature xsi:type="sysml:Connector">
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.14/@ownedMemberElement"/>
          </ownedRelationship>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature"/>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="engine" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature" isPart="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.4/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="fuelCmdPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPort="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.9/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" redefinedFeature="//@ownedMembership.4/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="drivePwrPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPort="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.10/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" redefinedFeature="//@ownedMembership.4/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature"/>
            </ownedMemberFeature>
          </ownedMembership>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.3/@ownedMemberFeature">
        <ownedMemberFeature xsi:type="sysml:Connector">
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.22/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.3/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.14/@ownedMemberElement"/>
          </ownedRelationship>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature"/>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature"/>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="transmission" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedMemberFeature" isPart="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.5/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="clutchPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPort="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.11/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" redefinedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_a" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPort="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.12/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
              </ownedRelationship>
            </ownedMemberFeature>
          </ownedMembership>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="driveshaft" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.5/@ownedMemberFeature" isPart="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.6/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.5/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.6/@ownedMemberFeature">
        <ownedMemberFeature xsi:type="sysml:Connector">
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.23/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.6/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.14/@ownedMemberElement"/>
          </ownedRelationship>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="driveshaft" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.6/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.6/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" redefinedFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature"/>
              <valuation>
                <value xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.5/@ownedMemberFeature">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.6/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature/@valuation/@value">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                </value>
              </valuation>
            </ownedMemberFeature>
          </ownedMembership>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature"/>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature"/>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearAxleAssembly" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature" isPart="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.1/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_d" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPort="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.15/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" redefinedFeature="//@ownedMembership.1/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
            <ownedMemberFeature xsi:type="sysml:Connector">
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.14/@ownedMemberElement"/>
              </ownedRelationship>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature"/>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature"/>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="differential" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature" isPart="true">
            <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature">
              <ownedRelatedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9;&#x9; * Untyped part.&#xA;&#x9;&#x9;&#x9; */" annotationForComment="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedRelationship.0"/>
            </ownedRelationship>
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
              </ownedRelationship>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_d" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPort="true">
                <ownedMemberFeature>
                  <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.15/@ownedMemberElement"/>
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
                  </ownedRelationship>
                </ownedMemberFeature>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="leftDiffPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPort="true">
                <ownedMemberFeature>
                  <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.16/@ownedMemberElement"/>
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
                  </ownedRelationship>
                </ownedMemberFeature>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rightDiffPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature" isPort="true">
                <ownedMemberFeature>
                  <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.16/@ownedMemberElement"/>
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
                  </ownedRelationship>
                </ownedMemberFeature>
              </ownedMembership>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.3/@ownedMemberFeature">
            <ownedMemberFeature xsi:type="sysml:Connector">
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.3/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.14/@ownedMemberElement"/>
              </ownedRelationship>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature"/>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature"/>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.4/@ownedMemberFeature">
            <ownedMemberFeature xsi:type="sysml:Connector">
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.4/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.14/@ownedMemberElement"/>
              </ownedRelationship>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature"/>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature"/>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearAxle" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.2/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
              </ownedRelationship>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="leftAxle" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPart="true">
                <ownedMemberFeature>
                  <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.3/@ownedMemberElement"/>
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
                  </ownedRelationship>
                  <ownedMembership xsi:type="sysml:FeatureMembership" memberName="axleToDiffPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPort="true">
                    <ownedMemberFeature>
                      <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.17/@ownedMemberElement"/>
                      <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" redefinedFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
                    </ownedMemberFeature>
                  </ownedMembership>
                  <ownedMembership xsi:type="sysml:FeatureMembership" memberName="axleToWheelPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPort="true">
                    <ownedMemberFeature>
                      <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.18/@ownedMemberElement"/>
                      <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" redefinedFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature"/>
                    </ownedMemberFeature>
                  </ownedMembership>
                </ownedMemberFeature>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rightAxle" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPart="true">
                <ownedMemberFeature>
                  <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.3/@ownedMemberElement"/>
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
                  </ownedRelationship>
                  <ownedMembership xsi:type="sysml:FeatureMembership" memberName="axleToDiffPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPort="true">
                    <ownedMemberFeature>
                      <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.17/@ownedMemberElement"/>
                      <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" redefinedFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
                    </ownedMemberFeature>
                  </ownedMembership>
                  <ownedMembership xsi:type="sysml:FeatureMembership" memberName="axleToWheelPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPort="true">
                    <ownedMemberFeature>
                      <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.18/@ownedMemberElement"/>
                      <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" redefinedFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature"/>
                    </ownedMemberFeature>
                  </ownedMembership>
                </ownedMemberFeature>
              </ownedMembership>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.6/@ownedMemberFeature">
            <ownedMemberFeature xsi:type="sysml:Connector">
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.6/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.14/@ownedMemberElement"/>
              </ownedRelationship>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature"/>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.9/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature"/>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.7/@ownedMemberFeature">
            <ownedMemberFeature xsi:type="sysml:Connector">
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.7/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.14/@ownedMemberElement"/>
              </ownedRelationship>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.5/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature"/>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature"/>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearWheel" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.8/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature isOrdered="true">
              <ownedRelationship xsi:type="sysml:FeatureTyping">
                <type href="1a-Parts%20Tree.sysml#//@ownedMembership.4/@ownedMemberElement"/>
              </ownedRelationship>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.8/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
              </ownedRelationship>
              <multiplicity>
                <upper xsi:type="sysml:LiteralInteger" value="2">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.8/@ownedMemberFeature/@multiplicity/@upper">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                </upper>
              </multiplicity>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="leftWheel" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.9/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping">
                <type href="1a-Parts%20Tree.sysml#//@ownedMembership.4/@ownedMemberElement"/>
              </ownedRelationship>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettedFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.8/@ownedMemberFeature" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.9/@ownedMemberFeature"/>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="wheelToAxlePort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.9/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPort="true">
                <ownedMemberFeature>
                  <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.19/@ownedMemberElement"/>
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.9/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
                  </ownedRelationship>
                </ownedMemberFeature>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="wheelToRoadPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.9/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPort="true">
                <ownedMemberFeature>
                  <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.20/@ownedMemberElement"/>
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.9/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
                  </ownedRelationship>
                </ownedMemberFeature>
              </ownedMembership>
              <valuation>
                <value xsi:type="sysml:SequenceAccessExpression">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.9/@ownedMemberFeature/@valuation/@value">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                  <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.8/@ownedMemberFeature">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.9/@ownedMemberFeature/@valuation/@value/@primary">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </primary>
                  <index xsi:type="sysml:LiteralInteger" value="1">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.9/@ownedMemberFeature/@valuation/@value/@index">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </index>
                </value>
              </valuation>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rightWheel" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.10/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping">
                <type href="1a-Parts%20Tree.sysml#//@ownedMembership.4/@ownedMemberElement"/>
              </ownedRelationship>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettedFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.8/@ownedMemberFeature" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.10/@ownedMemberFeature"/>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="wheelToAxlePort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPort="true">
                <ownedMemberFeature>
                  <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.19/@ownedMemberElement"/>
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
                  </ownedRelationship>
                </ownedMemberFeature>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="wheelToRoadPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPort="true">
                <ownedMemberFeature>
                  <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.20/@ownedMemberElement"/>
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
                  </ownedRelationship>
                </ownedMemberFeature>
              </ownedMembership>
              <valuation>
                <value xsi:type="sysml:SequenceAccessExpression">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.10/@ownedMemberFeature/@valuation/@value">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                  <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.8/@ownedMemberFeature">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.10/@ownedMemberFeature/@valuation/@value/@primary">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </primary>
                  <index xsi:type="sysml:LiteralInteger" value="2">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.10/@ownedMemberFeature/@valuation/@value/@index">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </index>
                </value>
              </valuation>
            </ownedMemberFeature>
          </ownedMembership>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.8/@ownedMemberFeature">
        <ownedMemberFeature xsi:type="sysml:Connector">
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.8/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.14/@ownedMemberElement"/>
          </ownedRelationship>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.9/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature"/>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature"/>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.9/@ownedMemberFeature">
        <ownedMemberFeature xsi:type="sysml:Connector">
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.9/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.14/@ownedMemberElement"/>
          </ownedRelationship>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedMemberFeature/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature"/>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature"/>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="vehicleToRoadPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature" isPort="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.21/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature" redefinedFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature"/>
          <ownedImport importedPackage="//@ownedMembership.21/@ownedMemberElement"/>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="leftWheelToRoadPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPort="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.20/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettedFeature="//@ownedMembership.21/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature"/>
              <valuation>
                <value xsi:type="sysml:SequenceAccessExpression">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature/@valuation/@value">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                  <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.21/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature/@valuation/@value/@primary">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </primary>
                  <index xsi:type="sysml:LiteralInteger" value="1">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature/@valuation/@value/@index">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </index>
                </value>
              </valuation>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rightWheelToRoadPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPort="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.20/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettedFeature="//@ownedMembership.21/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature"/>
              <valuation>
                <value xsi:type="sysml:SequenceAccessExpression">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@valuation/@value">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                  <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.21/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@valuation/@value/@primary">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </primary>
                  <index xsi:type="sysml:LiteralInteger" value="2">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.10/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@valuation/@value/@index">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </index>
                </value>
              </valuation>
            </ownedMemberFeature>
          </ownedMembership>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
</sysml:Package>
