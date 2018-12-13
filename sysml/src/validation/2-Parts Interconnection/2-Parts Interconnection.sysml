<?xml version="1.0" encoding="ASCII"?>
<sysml:Package xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:sysml="http://www.omg.org/spec/SysML/2.0" name="'2-Parts Interconnection'">
  <ownedImport>
    <importedPackage href="2-Parts%20Interconnection.alf#|0"/>
  </ownedImport>
  <ownedMembership memberName="VehicleA" memberElement="//@ownedMembership.0/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class">
      <ownedElement xsi:type="sysml:Generalization" specific="//@ownedMembership.0/@ownedMemberElement">
        <general href="2-Parts%20Interconnection.alf#|1"/>
      </ownedElement>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="fuelCmdPort" memberFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.9/@ownedMemberElement"/>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="vehicleToRoadPort" memberFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.21/@ownedMemberElement"/>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="RearAxleAssembly" memberElement="//@ownedMembership.1/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class">
      <ownedElement xsi:type="sysml:Generalization" specific="//@ownedMembership.1/@ownedMemberElement">
        <general href="2-Parts%20Interconnection.alf#|4"/>
      </ownedElement>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_d" memberFeature="//@ownedMembership.1/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.15/@ownedMemberElement"/>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="RearAxle" memberElement="//@ownedMembership.2/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class">
      <ownedElement xsi:type="sysml:Generalization" specific="//@ownedMembership.2/@ownedMemberElement">
        <general href="2-Parts%20Interconnection.alf#|6"/>
      </ownedElement>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="WheelAxle" memberElement="//@ownedMembership.3/@ownedMemberElement">
    <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9; * Note: This class is used for both the left and&#xA;&#x9; * right axles within a RearAxle.&#xA;&#x9; */" commentedElement="//@ownedMembership.3/@ownedMemberElement"/>
    <ownedMemberElement xsi:type="sysml:Class">
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="axleToDiffPort" memberFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.17/@ownedMemberElement"/>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="axleToWheelPort" memberFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.18/@ownedMemberElement"/>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="Engine" memberElement="//@ownedMembership.4/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class">
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="fuelCmdPort" memberFeature="//@ownedMembership.4/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.9/@ownedMemberElement"/>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="drivePwrPort" memberFeature="//@ownedMembership.4/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.10/@ownedMemberElement"/>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="Transmission" memberElement="//@ownedMembership.5/@ownedMemberElement">
    <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9; * Class Transmission has one of the two parts its usage has.&#xA;&#x9; */" commentedElement="//@ownedMembership.5/@ownedMemberElement"/>
    <ownedMemberElement xsi:type="sysml:Class">
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="clutchPort" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.11/@ownedMemberElement"/>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="Driveshaft" memberElement="//@ownedMembership.6/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class">
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_b" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.13/@ownedMemberElement"/>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_c" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.14/@ownedMemberElement"/>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="Differential" memberElement="//@ownedMembership.7/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="Wheel">
    <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9; * Class Wheel does not include the ports its usages have.&#xA;&#x9; */" commentedElement="//@ownedMembership.8"/>
    <memberElement href="2-Parts%20Interconnection.alf#|14"/>
  </ownedMembership>
  <ownedMembership memberName="FuelCmdPort" memberElement="//@ownedMembership.9/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="DrivePwrPort" memberElement="//@ownedMembership.10/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="ClutchPort" memberElement="//@ownedMembership.11/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="ShaftPort_a" memberElement="//@ownedMembership.12/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="ShaftPort_b" memberElement="//@ownedMembership.13/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="ShaftPort_c" memberElement="//@ownedMembership.14/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="ShaftPort_d" memberElement="//@ownedMembership.15/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="DiffPort" memberElement="//@ownedMembership.16/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="AxlePort" memberElement="//@ownedMembership.17/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="AxleToWheelPort" memberElement="//@ownedMembership.18/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="WheelToAxlePort" memberElement="//@ownedMembership.19/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="WheelToRoadPort" memberElement="//@ownedMembership.20/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="VehicleToRoadPort" memberElement="//@ownedMembership.21/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class">
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="wheelToRoadPort" memberFeature="//@ownedMembership.21/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.20/@ownedMemberElement">
          <upper xsi:type="sysml:LiteralInteger" value="2"/>
        </ownedFeatureElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="EngineToTransmissionInterface" memberElement="//@ownedMembership.22/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Association">
      <ownedMembership xsi:type="sysml:EndFeatureMembership" memberName="drivePwrPort" memberFeature="//@ownedMembership.22/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement">
        <ownedFeatureElement type="//@ownedMembership.10/@ownedMemberElement"/>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:EndFeatureMembership" memberName="clutchPort" memberFeature="//@ownedMembership.22/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement">
        <ownedFeatureElement type="//@ownedMembership.11/@ownedMemberElement"/>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="DriveshaftInterface" memberElement="//@ownedMembership.23/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Association">
      <ownedMembership xsi:type="sysml:EndFeatureMembership" memberName="shaftPort_a" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.12/@ownedMemberElement"/>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:EndFeatureMembership" memberName="shaftPort_d" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.15/@ownedMemberElement"/>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="driveshaft" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement" isPart="true">
        <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * The driveshaft part is the &quot;interface medium&quot;.&#xA;&#x9;&#x9; * &#xA;&#x9;&#x9; * Note: It would be better if this was a reference rather&#xA;&#x9;&#x9; * than a part, but it is not obvious how to fill in the&#xA;&#x9;&#x9; * actual driveshaft when the association is used to type&#xA;&#x9;&#x9; * a connector.&#xA;&#x9;&#x9; */" commentedElement="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement"/>
        <ownedFeatureElement type="//@ownedMembership.6/@ownedMemberElement">
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_b" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
            <ownedFeatureElement type="//@ownedMembership.13/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_c" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
            <ownedFeatureElement type="//@ownedMembership.14/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" redefinedFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.3/@ownedFeatureElement">
        <ownedFeatureElement xsi:type="sysml:Connector">
          <connectorEnd feature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
          <connectorEnd feature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement">
        <ownedFeatureElement xsi:type="sysml:Connector">
          <connectorEnd feature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
          <connectorEnd feature="//@ownedMembership.23/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement"/>
        </ownedFeatureElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="vehicle1_c1" memberElement="//@ownedMembership.24/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Feature" type="//@ownedMembership.0/@ownedMemberElement">
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="fuelCmdPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.9/@ownedMemberElement">
          <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="vehicleToRoadPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
        <ownedFeatureElement type="//@ownedMembership.21/@ownedMemberElement">
          <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" redefinedFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement"/>
          <ownedImport importedPackage="//@ownedMembership.21/@ownedMemberElement"/>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="leftWheelToRoadPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
            <ownedFeatureElement type="//@ownedMembership.20/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Subset" subsettedFeature="//@ownedMembership.21/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.21/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
                <index xsi:type="sysml:LiteralInteger" value="1"/>
              </value>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rightWheelToRoadPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
            <ownedFeatureElement type="//@ownedMembership.20/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Subset" subsettedFeature="//@ownedMembership.21/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.21/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
                <index xsi:type="sysml:LiteralInteger" value="2"/>
              </value>
            </ownedFeatureElement>
          </ownedMembership>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="engine" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement" isPart="true">
        <ownedFeatureElement type="//@ownedMembership.4/@ownedMemberElement">
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="fuelCmdPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
            <ownedFeatureElement type="//@ownedMembership.9/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.4/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="drivePwrPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
            <ownedFeatureElement type="//@ownedMembership.10/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" redefinedFeature="//@ownedMembership.4/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="transmission" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.3/@ownedFeatureElement" isPart="true">
        <ownedFeatureElement type="//@ownedMembership.5/@ownedMemberElement">
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="clutchPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.3/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
            <ownedFeatureElement type="//@ownedMembership.11/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.3/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_a" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.3/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
            <ownedFeatureElement type="//@ownedMembership.12/@ownedMemberElement"/>
          </ownedMembership>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearAxleAssembly" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement" isPart="true">
        <ownedFeatureElement type="//@ownedMembership.1/@ownedMemberElement">
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_d" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
            <ownedFeatureElement type="//@ownedMembership.15/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.1/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="differential" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
            <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9;&#x9; * Untyped part.&#xA;&#x9;&#x9;&#x9; */" commentedElement="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
            <ownedFeatureElement>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="shaftPort_d" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
                <ownedFeatureElement type="//@ownedMembership.15/@ownedMemberElement"/>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="leftDiffPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
                <ownedFeatureElement type="//@ownedMembership.16/@ownedMemberElement"/>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rightDiffPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement" isPort="true">
                <ownedFeatureElement type="//@ownedMembership.16/@ownedMemberElement"/>
              </ownedMembership>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearAxle" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement type="//@ownedMembership.2/@ownedMemberElement">
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="leftAxle" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPart="true">
                <ownedFeatureElement type="//@ownedMembership.3/@ownedMemberElement">
                  <ownedMembership xsi:type="sysml:FeatureMembership" memberName="axleToDiffPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
                    <ownedFeatureElement type="//@ownedMembership.17/@ownedMemberElement">
                      <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
                    </ownedFeatureElement>
                  </ownedMembership>
                  <ownedMembership xsi:type="sysml:FeatureMembership" memberName="axleToWheelPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
                    <ownedFeatureElement type="//@ownedMembership.18/@ownedMemberElement">
                      <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" redefinedFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement"/>
                    </ownedFeatureElement>
                  </ownedMembership>
                </ownedFeatureElement>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rightAxle" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
                <ownedFeatureElement type="//@ownedMembership.3/@ownedMemberElement">
                  <ownedMembership xsi:type="sysml:FeatureMembership" memberName="axleToDiffPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
                    <ownedFeatureElement type="//@ownedMembership.17/@ownedMemberElement">
                      <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
                    </ownedFeatureElement>
                  </ownedMembership>
                  <ownedMembership xsi:type="sysml:FeatureMembership" memberName="axleToWheelPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
                    <ownedFeatureElement type="//@ownedMembership.18/@ownedMemberElement">
                      <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" redefinedFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement"/>
                    </ownedFeatureElement>
                  </ownedMembership>
                </ownedFeatureElement>
              </ownedMembership>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearWheel" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.3/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement isOrdered="true">
              <upper xsi:type="sysml:LiteralInteger" value="2"/>
              <type href="2-Parts%20Interconnection.alf#|67"/>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="leftWheel" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.4/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement>
              <ownedElement xsi:type="sysml:Subset" subsettedFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.3/@ownedFeatureElement" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.4/@ownedFeatureElement"/>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="wheelToAxlePort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
                <ownedFeatureElement type="//@ownedMembership.19/@ownedMemberElement"/>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="wheelToRoadPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
                <ownedFeatureElement type="//@ownedMembership.20/@ownedMemberElement"/>
              </ownedMembership>
              <type href="2-Parts%20Interconnection.alf#|68"/>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.3/@ownedFeatureElement"/>
                <index xsi:type="sysml:LiteralInteger" value="1"/>
              </value>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rightWheel" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.5/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement>
              <ownedElement xsi:type="sysml:Subset" subsettedFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.3/@ownedFeatureElement" subsettingFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.5/@ownedFeatureElement"/>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="wheelToAxlePort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.5/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPort="true">
                <ownedFeatureElement type="//@ownedMembership.19/@ownedMemberElement"/>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" memberName="wheelToRoadPort" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.5/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPort="true">
                <ownedFeatureElement type="//@ownedMembership.20/@ownedMemberElement"/>
              </ownedMembership>
              <type href="2-Parts%20Interconnection.alf#|73"/>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.3/@ownedFeatureElement"/>
                <index xsi:type="sysml:LiteralInteger" value="2"/>
              </value>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.6/@ownedFeatureElement">
            <ownedFeatureElement xsi:type="sysml:Connector">
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.7/@ownedFeatureElement">
            <ownedFeatureElement xsi:type="sysml:Connector">
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.8/@ownedFeatureElement">
            <ownedFeatureElement xsi:type="sysml:Connector">
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement"/>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.9/@ownedFeatureElement">
            <ownedFeatureElement xsi:type="sysml:Connector">
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.10/@ownedFeatureElement">
            <ownedFeatureElement xsi:type="sysml:Connector">
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
              <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.5/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.5/@ownedFeatureElement">
        <ownedFeatureElement xsi:type="sysml:Connector">
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.6/@ownedFeatureElement">
        <ownedFeatureElement xsi:type="sysml:Connector" association="//@ownedMembership.22/@ownedMemberElement">
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.3/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.7/@ownedFeatureElement">
        <ownedFeatureElement xsi:type="sysml:Connector" association="//@ownedMembership.23/@ownedMemberElement">
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.3/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.8/@ownedFeatureElement">
        <ownedFeatureElement xsi:type="sysml:Connector">
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.9/@ownedFeatureElement">
        <ownedFeatureElement xsi:type="sysml:Connector">
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.4/@ownedFeatureElement/@ownedMembership.5/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
          <connectorEnd feature="//@ownedMembership.24/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
        </ownedFeatureElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
</sysml:Package>
