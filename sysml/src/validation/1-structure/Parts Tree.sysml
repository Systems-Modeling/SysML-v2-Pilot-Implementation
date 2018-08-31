<?xml version="1.0" encoding="ASCII"?>
<sysml:Package xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:sysml="http://www.omg.org/spec/SysML/2.0" name="'Parts Tree'">
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Package" name="'Create Generic Hierarchical Structure'">
      <ownedMembership>
        <ownedMemberElement xsi:type="sysml:Class" name="Vehicle">
          <ownedMembership xsi:type="sysml:FeatureMembership">
            <ownedMemberElement xsi:type="sysml:Feature" name="mass"/>
          </ownedMembership>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership>
        <ownedMemberElement xsi:type="sysml:Class" name="AxleAssembly"/>
      </ownedMembership>
      <ownedMembership>
        <ownedMemberElement xsi:type="sysml:Class" name="Axle"/>
      </ownedMembership>
      <ownedMembership>
        <ownedMemberElement xsi:type="sysml:Class" name="Wheel"/>
      </ownedMembership>
      <ownedMembership>
        <ownedElement xsi:type="sysml:Comment" body="/** &#xA;&#x9;&#x9; * 'vehicle1' is a package-owned feature of type Vehicle.&#xA;&#x9;&#x9; * It is not marked as a &quot;part&quot;, because that is only&#xA;&#x9;&#x9; * valid in the context of a nested feature.&#xA;&#x9;&#x9; */"/>
        <ownedMemberElement xsi:type="sysml:Feature" name="vehicle1">
          <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
            <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9;&#x9; * 'frontAxleAssembly' is a nested feature of feature 'vehicle1'.&#xA;&#x9;&#x9;&#x9; * It is marked as a &quot;part&quot;, which indicates that it is a&#xA;&#x9;&#x9;&#x9; * composite part of the containing feature.&#xA;&#x9;&#x9;&#x9; * &#xA;&#x9;&#x9;&#x9; * (And similarly for 'rearAxleAssembly'.)&#xA;&#x9;&#x9;&#x9; */"/>
            <ownedMemberElement xsi:type="sysml:Feature" name="frontAxleAssembly">
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="frontAxle">
                  <referencedType href="Parts%20Tree.alf#|2"/>
                </ownedMemberElement>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedElement xsi:type="sysml:Comment" body="/** &#xA;&#x9;&#x9;&#x9;&#x9; * 'frontWheel' is a nested feature of type 'Wheel' with&#xA;&#x9;&#x9;&#x9;&#x9; * multiplicity &quot;2&quot;. This means that this axle assembly&#xA;&#x9;&#x9;&#x9;&#x9; * must have exactly two wheels. However, there is still&#xA;&#x9;&#x9;&#x9;&#x9; * only one 'frontWheel' feature. The feature is &quot;ordered&quot;,&#xA;&#x9;&#x9;&#x9;&#x9; * so that the first wheel can be distinguished from the&#xA;&#x9;&#x9;&#x9;&#x9; * second.&#xA;&#x9;&#x9;&#x9;&#x9; */"/>
                <ownedMemberElement xsi:type="sysml:Feature" name="frontWheel" isOrdered="true">
                  <upper xsi:type="sysml:LiteralInteger" value="2"/>
                  <referencedType href="Parts%20Tree.alf#|3"/>
                </ownedMemberElement>
              </ownedMembership>
              <referencedType href="Parts%20Tree.alf#|1"/>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="rearAxleAssembly">
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="rearAxle">
                  <referencedType href="Parts%20Tree.alf#|5"/>
                </ownedMemberElement>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="rearWheel" isOrdered="true">
                  <upper xsi:type="sysml:LiteralInteger" value="2"/>
                  <referencedType href="Parts%20Tree.alf#|6"/>
                </ownedMemberElement>
              </ownedMembership>
              <referencedType href="Parts%20Tree.alf#|4"/>
            </ownedMemberElement>
          </ownedMembership>
          <referencedType href="Parts%20Tree.alf#|0"/>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Package" name="'Copy of Generic Hierarchical Structure'">
      <ownedImport>
        <importedPackage href="Parts%20Tree.alf#|7"/>
      </ownedImport>
      <ownedMembership>
        <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * 'vehicle1-c1-v1_0' is a redefinition of 'vehicle1'. It is &#xA;&#x9;&#x9; * effectively a &quot;virtual copy&quot;. Any change to the original will&#xA;&#x9;&#x9; * also be propagated to the &quot;copy&quot;.&#xA;&#x9;&#x9; * &#xA;&#x9;&#x9; * Even though the part structure does not appear in the&#xA;&#x9;&#x9; * redefinition, the parts of 'vehicle1' are inherited as&#xA;&#x9;&#x9; * members of 'vehicle1-c1-v1_0'. Thus, 'vehicle1-c1-v1_0'::frontAxleAssembly&#xA;&#x9;&#x9; * names the same (M1) model element as vehicle1::frontAxleAssembly,&#xA;&#x9;&#x9; * but 'vehicle1-c1-v1_0'.frontAxleAssembly will be a distinct (M0) object&#xA;&#x9;&#x9; * from vehicle1.frontAxleAssembly.&#xA;&#x9;&#x9; */"/>
        <ownedMemberElement xsi:type="sysml:Feature" name="'vehicle1-c1-v1_0'">
          <ownedElement xsi:type="sysml:Redefinition">
            <redefinedFeature href="Parts%20Tree.alf#|8"/>
          </ownedElement>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Package" name="'Create Localized Usages'">
      <ownedImport>
        <importedPackage href="Parts%20Tree.alf#|9"/>
      </ownedImport>
      <ownedImport>
        <importedPackage href="Parts%20Tree.alf#|10"/>
      </ownedImport>
      <ownedImport>
        <importedPackage href="Parts%20Tree.alf#|11"/>
      </ownedImport>
      <ownedImport>
        <importedPackage href="Parts%20Tree.alf#|12"/>
      </ownedImport>
      <ownedMembership>
        <ownedMemberElement xsi:type="sysml:Class" name="FrontAxle">
          <ownedElement xsi:type="sysml:Generalization">
            <general href="Parts%20Tree.alf#|13"/>
          </ownedElement>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership>
        <ownedMemberElement xsi:type="sysml:Class" name="RearAxle">
          <ownedElement xsi:type="sysml:Generalization">
            <general href="Parts%20Tree.alf#|14"/>
          </ownedElement>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership>
        <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * 'vehicle1-c1-v1_1' is a physical copy of 'vehicle1-c2_v1_0' from&#xA;&#x9;&#x9; * the 'Copy of Generic Hierarchical Structure' package. This copy&#xA;&#x9;&#x9; * was then modified to redefine vehicle1::frontAxleAssembly::frontAxle&#xA;&#x9;&#x9; * to have type 'FrontAxle' and vehicle1::rearAxleAssembly::rearAxle&#xA;&#x9;&#x9; * to have type 'RearAxle'.&#xA;&#x9;&#x9; * &#xA;&#x9;&#x9; * (Note: &quot;Versioning&quot; is captured here in the naming. There is no&#xA;&#x9;&#x9; * actual versioning metadata.)&#xA;&#x9;&#x9; */"/>
        <ownedMemberElement xsi:type="sysml:Feature" name="'vehicle1-c1-v1_1'">
          <ownedElement xsi:type="sysml:Redefinition">
            <redefinedFeature href="Parts%20Tree.alf#|15"/>
          </ownedElement>
          <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
            <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9;&#x9; * 'frontAxleAssembly' must be redefined in order to redefine one&#xA;&#x9;&#x9;&#x9; * of its composite parts. &#xA;&#x9;&#x9;&#x9; * &#xA;&#x9;&#x9;&#x9; * (And similarly for 'rearAxleAssembly'.)&#xA;&#x9;&#x9;&#x9; */"/>
            <ownedMemberElement xsi:type="sysml:Feature">
              <ownedElement xsi:type="sysml:Redefinition">
                <redefinedFeature href="Parts%20Tree.alf#|16"/>
              </ownedElement>
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9;&#x9;&#x9; * This redefines the part 'frontAxle' to have type 'FrontAxle',&#xA;&#x9;&#x9;&#x9;&#x9; * without changing the name of the part.&#xA;&#x9;&#x9;&#x9;&#x9; */"/>
                <ownedMemberElement xsi:type="sysml:Feature">
                  <ownedElement xsi:type="sysml:Redefinition">
                    <redefinedFeature href="Parts%20Tree.alf#|18"/>
                  </ownedElement>
                  <referencedType href="Parts%20Tree.alf#|17"/>
                </ownedMemberElement>
              </ownedMembership>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
            <ownedMemberElement xsi:type="sysml:Feature">
              <ownedElement xsi:type="sysml:Redefinition">
                <redefinedFeature href="Parts%20Tree.alf#|20"/>
              </ownedElement>
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedMemberElement xsi:type="sysml:Feature">
                  <ownedElement xsi:type="sysml:Redefinition">
                    <redefinedFeature href="Parts%20Tree.alf#|22"/>
                  </ownedElement>
                  <referencedType href="Parts%20Tree.alf#|21"/>
                </ownedMemberElement>
              </ownedMembership>
              <referencedType href="Parts%20Tree.alf#|19"/>
            </ownedMemberElement>
          </ownedMembership>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Package" name="'Create Unambiguous Deeply Nested Structure'">
      <ownedImport>
        <importedPackage href="Parts%20Tree.alf#|23"/>
      </ownedImport>
      <ownedImport>
        <importedPackage href="Parts%20Tree.alf#|24"/>
      </ownedImport>
      <ownedImport>
        <importedPackage href="Parts%20Tree.alf#|25"/>
      </ownedImport>
      <ownedImport>
        <importedPackage href="Parts%20Tree.alf#|26"/>
      </ownedImport>
      <ownedMembership>
        <ownedMemberElement xsi:type="sysml:Class" name="FrontAxle">
          <ownedElement xsi:type="sysml:Generalization">
            <general href="Parts%20Tree.alf#|27"/>
          </ownedElement>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership>
        <ownedMemberElement xsi:type="sysml:Class" name="RearAxle">
          <ownedElement xsi:type="sysml:Generalization">
            <general href="Parts%20Tree.alf#|28"/>
          </ownedElement>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership>
        <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * 'vehicle1-c1-v1_2' is a physical copy of 'vehicle1-c2_v1_1' from&#xA;&#x9;&#x9; * the 'Create Localized Usages' package. In addition to the redefinitions&#xA;&#x9;&#x9; * of 'frontAxle' and 'rearAxle', this copy also defines additional features&#xA;&#x9;&#x9; * in each axle assembly to distinguish each of the front and rear wheels.&#xA;&#x9;&#x9; */"/>
        <ownedMemberElement xsi:type="sysml:Feature" name="'vehicle1-c1-v1_2'">
          <ownedElement xsi:type="sysml:Redefinition">
            <redefinedFeature href="Parts%20Tree.alf#|29"/>
          </ownedElement>
          <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
            <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9;&#x9; * 'frontAxleAssembly' must be redefined in order to redefine and&#xA;&#x9;&#x9;&#x9; * subset its composite parts. &#xA;&#x9;&#x9;&#x9; * &#xA;&#x9;&#x9;&#x9; * (And similarly for 'rearAxleAssembly'.)&#xA;&#x9;&#x9;&#x9; */"/>
            <ownedMemberElement xsi:type="sysml:Feature">
              <ownedElement xsi:type="sysml:Redefinition">
                <redefinedFeature href="Parts%20Tree.alf#|30"/>
              </ownedElement>
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedMemberElement xsi:type="sysml:Feature">
                  <ownedElement xsi:type="sysml:Redefinition">
                    <redefinedFeature href="Parts%20Tree.alf#|32"/>
                  </ownedElement>
                  <referencedType href="Parts%20Tree.alf#|31"/>
                </ownedMemberElement>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9;&#x9;&#x9; * 'frontWheel_1' is a separate feature from 'frontWheel',&#xA;&#x9;&#x9;&#x9;&#x9; * but it essentially provides an alternate name specifically&#xA;&#x9;&#x9;&#x9;&#x9; * for the first of the two front wheels, as given by the&#xA;&#x9;&#x9;&#x9;&#x9; * expression frontWheel[1].&#xA;&#x9;&#x9;&#x9;&#x9; * &#xA;&#x9;&#x9;&#x9;&#x9; * (And similarly for 'frontWheel_2'.)&#xA;&#x9;&#x9;&#x9;&#x9; */"/>
                <ownedMemberElement xsi:type="sysml:Feature" name="frontWheel_1">
                  <ownedElement xsi:type="sysml:Subset">
                    <subsettedFeature href="Parts%20Tree.alf#|33"/>
                  </ownedElement>
                  <value xsi:type="sysml:SequenceAccessExpression">
                    <primary xsi:type="sysml:ElementReferenceExpression">
                      <referent href="Parts%20Tree.alf#|34"/>
                    </primary>
                    <index xsi:type="sysml:LiteralInteger" value="1"/>
                  </value>
                </ownedMemberElement>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="frontWheel_2">
                  <ownedElement xsi:type="sysml:Subset">
                    <subsettedFeature href="Parts%20Tree.alf#|35"/>
                  </ownedElement>
                  <value xsi:type="sysml:SequenceAccessExpression">
                    <primary xsi:type="sysml:ElementReferenceExpression">
                      <referent href="Parts%20Tree.alf#|36"/>
                    </primary>
                    <index xsi:type="sysml:LiteralInteger" value="2"/>
                  </value>
                </ownedMemberElement>
              </ownedMembership>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
            <ownedMemberElement xsi:type="sysml:Feature">
              <ownedElement xsi:type="sysml:Redefinition">
                <redefinedFeature href="Parts%20Tree.alf#|37"/>
              </ownedElement>
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedMemberElement xsi:type="sysml:Feature">
                  <ownedElement xsi:type="sysml:Redefinition">
                    <redefinedFeature href="Parts%20Tree.alf#|39"/>
                  </ownedElement>
                  <referencedType href="Parts%20Tree.alf#|38"/>
                </ownedMemberElement>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="rearWheel_1">
                  <ownedElement xsi:type="sysml:Subset">
                    <subsettedFeature href="Parts%20Tree.alf#|40"/>
                  </ownedElement>
                  <value xsi:type="sysml:SequenceAccessExpression">
                    <primary xsi:type="sysml:ElementReferenceExpression">
                      <referent href="Parts%20Tree.alf#|41"/>
                    </primary>
                    <index xsi:type="sysml:LiteralInteger" value="1"/>
                  </value>
                </ownedMemberElement>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="rearWheel_2">
                  <ownedElement xsi:type="sysml:Subset">
                    <subsettedFeature href="Parts%20Tree.alf#|42"/>
                  </ownedElement>
                  <value xsi:type="sysml:SequenceAccessExpression">
                    <primary xsi:type="sysml:ElementReferenceExpression">
                      <referent href="Parts%20Tree.alf#|43"/>
                    </primary>
                    <index xsi:type="sysml:LiteralInteger" value="2"/>
                  </value>
                </ownedMemberElement>
              </ownedMembership>
            </ownedMemberElement>
          </ownedMembership>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
</sysml:Package>
