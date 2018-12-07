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
    <ownedElement xsi:type="sysml:Comment" body="/** &#xA;&#x9; * 'vehicle1' is a package-owned feature of type Vehicle.&#xA;&#x9; * It is not marked as a &quot;part&quot;, because that is only&#xA;&#x9; * valid in the context of a nested feature.&#xA;&#x9; */" commentedElement="//@ownedMembership.5/@ownedMemberElement"/>
    <ownedMemberElement xsi:type="sysml:Feature" type="//@ownedMembership.0/@ownedMemberElement">
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="mass" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement">
        <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * This redefines the 'mass' feature from Vehicle to give&#xA;&#x9;&#x9; * it a fixed value.&#xA;&#x9;&#x9; */" commentedElement="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
        <ownedFeatureElement>
          <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
          <value xsi:type="sysml:LiteralInteger" value="1000"/>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontAxleAssembly" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
        <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * 'frontAxleAssembly' is a nested feature of feature 'vehicle1'.&#xA;&#x9;&#x9; * It is marked as a &quot;part&quot;, which indicates that it is a&#xA;&#x9;&#x9; * composite part of the containing feature.&#xA;&#x9;&#x9; * &#xA;&#x9;&#x9; * (And similarly for 'rearAxleAssembly'.)&#xA;&#x9;&#x9; */" commentedElement="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement"/>
        <ownedFeatureElement type="//@ownedMembership.1/@ownedMemberElement">
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontAxle" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement type="//@ownedMembership.2/@ownedMemberElement"/>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontWheel" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
            <ownedElement xsi:type="sysml:Comment" body="/** &#xA;&#x9;&#x9;&#x9; * 'frontWheel' is a nested feature of type 'Wheel' with&#xA;&#x9;&#x9;&#x9; * multiplicity &quot;2&quot;. This means that this axle assembly&#xA;&#x9;&#x9;&#x9; * must have exactly two wheels. However, there is still&#xA;&#x9;&#x9;&#x9; * only one 'frontWheel' feature. The feature is &quot;ordered&quot;,&#xA;&#x9;&#x9;&#x9; * so that the first wheel can be distinguished from the&#xA;&#x9;&#x9;&#x9; * second.&#xA;&#x9;&#x9;&#x9; */" commentedElement="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
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
    <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9; * 'vehicle1_c1' is a redefinition of 'vehicle1'.&#xA;&#x9; */" commentedElement="//@ownedMembership.6/@ownedMemberElement"/>
    <ownedMemberElement xsi:type="sysml:Feature">
      <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.6/@ownedMemberElement" redefinedFeature="//@ownedMembership.5/@ownedMemberElement"/>
      <ownedImport importedPackage="//@ownedMembership.5/@ownedMemberElement"/>
      <ownedImport importedPackage="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement"/>
      <ownedImport importedPackage="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement"/>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="mass" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement">
        <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * The 'mass' value is redefined again to a new value.&#xA;&#x9;&#x9; */" commentedElement="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
        <ownedFeatureElement>
          <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedFeatureElement"/>
          <value xsi:type="sysml:LiteralInteger" value="2000"/>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
        <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * 'frontAxleAssembly' must be redefined in order to redefine and&#xA;&#x9;&#x9; * subset its composite parts. &#xA;&#x9;&#x9; */" commentedElement="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement"/>
        <ownedFeatureElement>
          <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement" redefinedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement"/>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPart="true">
            <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9;&#x9; * This redefines the part 'frontAxle' to have type 'FrontAxle',&#xA;&#x9;&#x9;&#x9; * without changing the name of the part.&#xA;&#x9;&#x9;&#x9; */" commentedElement="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
            <ownedFeatureElement type="//@ownedMembership.3/@ownedMemberElement">
              <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" redefinedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontWheel_1" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
            <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9;&#x9; * 'frontWheel_1' is a separate feature from 'frontWheel',&#xA;&#x9;&#x9;&#x9; * but it essentially provides an alternate name specifically&#xA;&#x9;&#x9;&#x9; * for the first of the two front wheels, as given by the&#xA;&#x9;&#x9;&#x9; * expression frontWheel[1].&#xA;&#x9;&#x9;&#x9; * &#xA;&#x9;&#x9;&#x9; * (And similarly for 'frontWheel_2'.)&#xA;&#x9;&#x9;&#x9; */" commentedElement="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
            <ownedFeatureElement>
              <ownedElement xsi:type="sysml:Subset" subsettedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
                <index xsi:type="sysml:LiteralInteger" value="1"/>
              </value>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontWheel_2" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement>
              <ownedElement xsi:type="sysml:Subset" subsettedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.2/@ownedFeatureElement"/>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
                <index xsi:type="sysml:LiteralInteger" value="2"/>
              </value>
            </ownedFeatureElement>
          </ownedMembership>
        </ownedFeatureElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement" isPart="true">
        <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * 'rearAxleAssembly' must be redefined in order to add new subsetted&#xA;&#x9;&#x9; * features. However, 'rearAxle' is inherited without redefinition.&#xA;&#x9;&#x9; */" commentedElement="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement"/>
        <ownedFeatureElement>
          <ownedElement xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement" redefinedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement"/>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearWheel_1" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement>
              <ownedElement xsi:type="sysml:Subset" subsettedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.0/@ownedFeatureElement"/>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
                <index xsi:type="sysml:LiteralInteger" value="1"/>
              </value>
            </ownedFeatureElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearWheel_2" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" isPart="true">
            <ownedFeatureElement>
              <ownedElement xsi:type="sysml:Subset" subsettedFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedFeatureElement/@ownedMembership.1/@ownedFeatureElement"/>
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
