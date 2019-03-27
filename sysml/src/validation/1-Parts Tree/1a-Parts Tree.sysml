<?xml version="1.0" encoding="ASCII"?>
<sysml:Package xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:sysml="http://www.omg.org/spec/SysML/2.0">
  <ownedMembership memberName="Vehicle" memberElement="//@ownedMembership.0/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.0/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="mass" memberFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="AxleAssembly" memberElement="//@ownedMembership.1/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.1/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="Axle" memberElement="//@ownedMembership.2/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.2/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="mass" memberFeature="//@ownedMembership.2/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.2/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="FrontAxle" memberElement="//@ownedMembership.3/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" superclass="//@ownedMembership.2/@ownedMemberElement" subclass="//@ownedMembership.3/@ownedMemberElement"/>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="steeringAngle" memberFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.3/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="Wheel" memberElement="//@ownedMembership.4/@ownedMemberElement">
    <ownedMemberElement xsi:type="sysml:ObjectClass">
      <ownedRelationship xsi:type="sysml:Superclassing" subclass="//@ownedMembership.4/@ownedMemberElement">
        <superclass href="../../library/Base.sysml#//@ownedMembership.1/@ownedMemberElement"/>
      </ownedRelationship>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="vehicle1" memberElement="//@ownedMembership.5/@ownedMemberElement">
    <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.5/@ownedMemberElement">
      <ownedRelatedElement xsi:type="sysml:Comment" body="/** &#xA;&#x9; * 'vehicle1' is a package-owned feature of type Vehicle.&#xA;&#x9; * It is not marked as a &quot;part&quot;, because that is only&#xA;&#x9; * valid in the context of a nested feature.&#xA;&#x9; */" annotationForComment="//@ownedMembership.5/@ownedRelationship.0"/>
    </ownedRelationship>
    <ownedMemberElement xsi:type="sysml:Feature">
      <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.0/@ownedMemberElement"/>
      <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.5/@ownedMemberElement">
        <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="mass" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
        <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
          <ownedRelatedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * This redefines the 'mass' feature from Vehicle to give&#xA;&#x9;&#x9; * it a fixed value.&#xA;&#x9;&#x9; */" annotationForComment="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedRelationship.0"/>
        </ownedRelationship>
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" redefinedFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
          <valuation>
            <value xsi:type="sysml:LiteralInteger" value="1000">
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature/@valuation/@value">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
              </ownedRelationship>
            </value>
          </valuation>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontAxleAssembly" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature" isPart="true">
        <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature">
          <ownedRelatedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * 'frontAxleAssembly' is a nested feature of feature 'vehicle1'.&#xA;&#x9;&#x9; * It is marked as a &quot;part&quot;, which indicates that it is a&#xA;&#x9;&#x9; * composite part of the containing feature.&#xA;&#x9;&#x9; * &#xA;&#x9;&#x9; * (And similarly for 'rearAxleAssembly'.)&#xA;&#x9;&#x9; */" annotationForComment="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedRelationship.0"/>
        </ownedRelationship>
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.1/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontAxle" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.2/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
              </ownedRelationship>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontWheel" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPart="true">
            <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
              <ownedRelatedElement xsi:type="sysml:Comment" body="/** &#xA;&#x9;&#x9;&#x9; * 'frontWheel' is a nested feature of type 'Wheel' with&#xA;&#x9;&#x9;&#x9; * multiplicity &quot;2&quot;. This means that this axle assembly&#xA;&#x9;&#x9;&#x9; * must have exactly two wheels. However, there is still&#xA;&#x9;&#x9;&#x9; * only one 'frontWheel' feature. The feature is &quot;ordered&quot;,&#xA;&#x9;&#x9;&#x9; * so that the first wheel can be distinguished from the&#xA;&#x9;&#x9;&#x9; * second.&#xA;&#x9;&#x9;&#x9; */" annotationForComment="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedRelationship.0"/>
            </ownedRelationship>
            <ownedMemberFeature isOrdered="true">
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.4/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
              </ownedRelationship>
              <multiplicity>
                <upper xsi:type="sysml:LiteralInteger" value="2">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@multiplicity/@upper">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                </upper>
              </multiplicity>
            </ownedMemberFeature>
          </ownedMembership>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearAxleAssembly" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature" isPart="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.1/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearAxle" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.2/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
              </ownedRelationship>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearWheel" memberFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature isOrdered="true">
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.4/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
              </ownedRelationship>
              <multiplicity>
                <upper xsi:type="sysml:LiteralInteger" value="2">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.5/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@multiplicity/@upper">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                </upper>
              </multiplicity>
            </ownedMemberFeature>
          </ownedMembership>
        </ownedMemberFeature>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership memberName="vehicle1_c1" memberElement="//@ownedMembership.6/@ownedMemberElement">
    <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.6/@ownedMemberElement">
      <ownedRelatedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9; * 'vehicle1_c1' is a modified copy of 'vehicle1'. There is no&#xA;&#x9; * connection between this copy and the original version in the&#xA;&#x9; * model.&#xA;&#x9; */" annotationForComment="//@ownedMembership.6/@ownedRelationship.0"/>
    </ownedRelationship>
    <ownedMemberElement xsi:type="sysml:Feature">
      <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.0/@ownedMemberElement"/>
      <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement">
        <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
      </ownedRelationship>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="mass" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
        <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature">
          <ownedRelatedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * The mass value has been modified.&#xA;&#x9;&#x9; */" annotationForComment="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedRelationship.0"/>
        </ownedRelationship>
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:Redefinition" redefiningFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature" redefinedFeature="//@ownedMembership.0/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature"/>
          <valuation>
            <value xsi:type="sysml:LiteralInteger" value="2000">
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature/@valuation/@value">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
              </ownedRelationship>
            </value>
          </valuation>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontAxleAssembly" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature" isPart="true">
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.1/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontAxle" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPart="true">
            <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature">
              <ownedRelatedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9;&#x9; * The part 'frontAxle' has been modified to have type 'FrontAxle'.&#xA;&#x9;&#x9;&#x9; */" annotationForComment="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.0/@ownedRelationship.0"/>
            </ownedRelationship>
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.3/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
              </ownedRelationship>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontWheel" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPart="true">
            <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
              <ownedRelatedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9;&#x9; * The parts 'frontWheel_1' and 'frontWheel_2' have been added&#xA;&#x9;&#x9;&#x9; * as subsets of 'frontWheel'. These are separate features from&#xA;&#x9;&#x9;&#x9; * 'frontWheel', but essebtially provide alternate names for&#xA;&#x9;&#x9;&#x9; * each of the two wheels, as given by their defining expressions.&#xA;&#x9;&#x9;&#x9; */" annotationForComment="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedRelationship.0"/>
            </ownedRelationship>
            <ownedMemberFeature isOrdered="true">
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.4/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
              </ownedRelationship>
              <multiplicity>
                <upper xsi:type="sysml:LiteralInteger" value="2">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@multiplicity/@upper">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                </upper>
              </multiplicity>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontWheel_1" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettedFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature"/>
              <valuation>
                <value xsi:type="sysml:SequenceAccessExpression">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@valuation/@value">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                  <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@valuation/@value/@primary">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </primary>
                  <index xsi:type="sysml:LiteralInteger" value="1">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@valuation/@value/@index">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </index>
                </value>
              </valuation>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="frontWheel_2" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.3/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettedFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.3/@ownedMemberFeature"/>
              <valuation>
                <value xsi:type="sysml:SequenceAccessExpression">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.3/@ownedMemberFeature/@valuation/@value">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                  <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.3/@ownedMemberFeature/@valuation/@value/@primary">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </primary>
                  <index xsi:type="sysml:LiteralInteger" value="2">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.1/@ownedMemberFeature/@ownedMembership.3/@ownedMemberFeature/@valuation/@value/@index">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </index>
                </value>
              </valuation>
            </ownedMemberFeature>
          </ownedMembership>
        </ownedMemberFeature>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearAxleAssembly" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature" isPart="true">
        <ownedRelationship xsi:type="sysml:Annotation" annotatedElement="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature">
          <ownedRelatedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * 'rearAxleAssembly' has also been modified to add subsetting features&#xA;&#x9;&#x9; * for 'rearWheel'.&#xA;&#x9;&#x9; */" annotationForComment="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedRelationship.0"/>
        </ownedRelationship>
        <ownedMemberFeature>
          <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.1/@ownedMemberElement"/>
          <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature">
            <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
          </ownedRelationship>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearAxle" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.2/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.0/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
              </ownedRelationship>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearWheel" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature isOrdered="true">
              <ownedRelationship xsi:type="sysml:FeatureTyping" type="//@ownedMembership.4/@ownedMemberElement"/>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.10/@ownedMemberElement"/>
              </ownedRelationship>
              <multiplicity>
                <upper xsi:type="sysml:LiteralInteger" value="2">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature/@multiplicity/@upper">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                </upper>
              </multiplicity>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearWheel_1" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettedFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature"/>
              <valuation>
                <value xsi:type="sysml:SequenceAccessExpression">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@valuation/@value">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                  <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@valuation/@value/@primary">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </primary>
                  <index xsi:type="sysml:LiteralInteger" value="1">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.2/@ownedMemberFeature/@valuation/@value/@index">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </index>
                </value>
              </valuation>
            </ownedMemberFeature>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" memberName="rearWheel_2" memberFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.3/@ownedMemberFeature" isPart="true">
            <ownedMemberFeature>
              <ownedRelationship xsi:type="sysml:Subsetting" subsettedFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.3/@ownedMemberFeature"/>
              <valuation>
                <value xsi:type="sysml:SequenceAccessExpression">
                  <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.3/@ownedMemberFeature/@valuation/@value">
                    <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                  </ownedRelationship>
                  <primary xsi:type="sysml:ElementReferenceExpression" referent="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.1/@ownedMemberFeature">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.3/@ownedMemberFeature/@valuation/@value/@primary">
                      <subsettedFeature href="../../library/Base.sysml#//@ownedMembership.17/@ownedMemberElement"/>
                    </ownedRelationship>
                  </primary>
                  <index xsi:type="sysml:LiteralInteger" value="2">
                    <ownedRelationship xsi:type="sysml:Subsetting" subsettingFeature="//@ownedMembership.6/@ownedMemberElement/@ownedMembership.2/@ownedMemberFeature/@ownedMembership.3/@ownedMemberFeature/@valuation/@value/@index">
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
