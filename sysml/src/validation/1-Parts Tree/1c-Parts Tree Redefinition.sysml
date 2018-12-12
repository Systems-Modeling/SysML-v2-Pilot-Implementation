<?xml version="1.0" encoding="ASCII"?>
<sysml:Package xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:sysml="http://www.omg.org/spec/SysML/2.0" name="'1c-Parts Tree Redefinition'">
  <ownedMembership memberName="Vehicle" memberElement="//@ownedMembership.0/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class">
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="mass" memberFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement">
        <ownedFeatureElement/>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="AxleAssembly" memberElement="//@ownedMembership.1/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="Axle" memberElement="//@ownedMembership.2/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class">
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="mass" memberFeature="//@ownedMembership.2/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement">
        <ownedFeatureElement/>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="FrontAxle" memberElement="//@ownedMembership.3/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class">
      <ownedElement xsi:type="sysml:Generalization" general="//@ownedMembership.2/@ownedMemberElement" specific="//@ownedMembership.3/@ownedMemberElement"/>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="steeringAngle" memberFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement">
        <ownedFeatureElement/>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="Wheel" memberElement="//@ownedMembership.4/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Class"/>
  </ownedMembership>
  <ownedMembership memberName="vehicle1" memberElement="//@ownedMembership.5/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Feature" type="//@ownedMembership.0/@ownedMemberElement">
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="mass" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement">
        <ownedFeatureElement>
          <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
          <value xsi:type="sysml:LiteralInteger" value="1000"/>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontAxleAssembly" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
        <ownedFeatureElement type="//@ownedMembership.1/@ownedMemberElement">
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontAxle" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement type="//@ownedMembership.2/@ownedMemberElement"/>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontWheel" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement isOrdered="true" type="//@ownedMembership.4/@ownedMemberElement">
              <upper xsi:type="sysml:LiteralInteger" value="2"/>
            </ownedFeatureElement>
          </ownedMembership>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearAxleAssembly" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement" isPart="true">
        <ownedFeatureElement type="//@ownedMembership.1/@ownedMemberElement">
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearAxle" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement type="//@ownedMembership.2/@ownedMemberElement"/>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearWheel" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement isOrdered="true" type="//@ownedMembership.4/@ownedMemberElement">
              <upper xsi:type="sysml:LiteralInteger" value="2"/>
            </ownedFeatureElement>
          </ownedMembership>
        </ownedFeatureElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="vehicle1_c1" memberElement="//@ownedMembership.6/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:Feature">
      <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.6/@ownedMemberElement" redefinedFeature="//@ownedMembership.5/@ownedMemberElement"/>
      <ownedImport importedPackage="//@ownedMembership.5/@ownedMemberElement"/>
      <ownedImport importedPackage="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement"/>
      <ownedImport importedPackage="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement"/>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="mass" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement">
        <ownedFeatureElement>
          <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
          <value xsi:type="sysml:LiteralInteger" value="2000"/>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontAxleAssembly_c1" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
        <ownedFeatureElement type="//@ownedMembership.1/@ownedMemberElement">
          <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" redefinedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement"/>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontAxle_c1" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement type="//@ownedMembership.3/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontWheel_1" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement type="//@ownedMembership.4/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Subset" subsettedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
                <index xsi:type="sysml:LiteralInteger" value="1"/>
              </value>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontWheel_2" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement type="//@ownedMembership.4/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Subset" subsettedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement"/>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
                <index xsi:type="sysml:LiteralInteger" value="2"/>
              </value>
            </ownedFeatureElement>
          </ownedMembership>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearAxleAssembly_c1" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement" isPart="true">
        <ownedFeatureElement type="//@ownedMembership.1/@ownedMemberElement">
          <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement" redefinedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement"/>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearAxle_c1" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement type="//@ownedMembership.2/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearWheel_1" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement type="//@ownedMembership.4/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Subset" subsettedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
                <index xsi:type="sysml:LiteralInteger" value="1"/>
              </value>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearWheel_2" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement type="//@ownedMembership.4/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Subset" subsettedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement"/>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
                <index xsi:type="sysml:LiteralInteger" value="2"/>
              </value>
            </ownedFeatureElement>
          </ownedMembership>
        </ownedFeatureElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
</sysml:Package>
