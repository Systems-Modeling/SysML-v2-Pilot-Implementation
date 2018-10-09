<?xml version="1.0" encoding="ASCII"?>
<sysml:Package xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:sysml="http://www.omg.org/spec/SysML/2.0" name="'2-Parts Interconnection'">
  <ownedImport>
    <importedPackage href="2-Parts%20Interconnection.alf#|0"/>
  </ownedImport>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="VehicleA">
      <ownedElement xsi:type="sysml:Generalization">
        <general href="2-Parts%20Interconnection.alf#|1"/>
      </ownedElement>
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="fuelCmdPort">
          <referencedType href="2-Parts%20Interconnection.alf#|2"/>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="vehicleToRoadPort">
          <referencedType href="2-Parts%20Interconnection.alf#|3"/>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="RearAxleAssembly">
      <ownedElement xsi:type="sysml:Generalization">
        <general href="2-Parts%20Interconnection.alf#|4"/>
      </ownedElement>
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="shaftPort_d">
          <referencedType href="2-Parts%20Interconnection.alf#|5"/>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="RearAxle">
      <ownedElement xsi:type="sysml:Generalization">
        <general href="2-Parts%20Interconnection.alf#|6"/>
      </ownedElement>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9; * Note: This class is used for both the left and&#xA;&#x9; * right axles within a RearAxle.&#xA;&#x9; */"/>
    <ownedMemberElement xsi:type="sysml:Class" name="WheelAxle">
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="axleToDiffPort">
          <referencedType href="2-Parts%20Interconnection.alf#|7"/>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="axleToWheelPort">
          <referencedType href="2-Parts%20Interconnection.alf#|8"/>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="Engine">
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="fuelCmdPort">
          <referencedType href="2-Parts%20Interconnection.alf#|9"/>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="drivePwrPort">
          <referencedType href="2-Parts%20Interconnection.alf#|10"/>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9; * Class Transmission has one of the two parts its usage has.&#xA;&#x9; */"/>
    <ownedMemberElement xsi:type="sysml:Class" name="Transmission">
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="clutchPort">
          <referencedType href="2-Parts%20Interconnection.alf#|11"/>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="Driveshaft">
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="shaftPort_b">
          <referencedType href="2-Parts%20Interconnection.alf#|12"/>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="shaftPort_c">
          <referencedType href="2-Parts%20Interconnection.alf#|13"/>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="Differential"/>
  </ownedMembership>
  <ownedMembership memberName="Wheel">
    <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9; * Class Wheel does not include the ports its usages have.&#xA;&#x9; */"/>
    <memberElement href="2-Parts%20Interconnection.alf#|14"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="FuelCmdPort"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="DrivePwrPort"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="ClutchPort"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="ShaftPort_a"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="ShaftPort_b"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="ShaftPort_c"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="ShaftPort_d"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="DiffPort"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="AxlePort"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="AxleToWheelPort"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="WheelToAxlePort"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="WheelToRoadPort"/>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Class" name="VehicleToRoadPort">
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="wheelToRoadPort">
          <upper xsi:type="sysml:LiteralInteger" value="2"/>
          <referencedType href="2-Parts%20Interconnection.alf#|15"/>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Association" name="EngineToTransmissionInterface">
      <ownedMembership xsi:type="sysml:EndFeatureMembership">
        <ownedMemberElement xsi:type="sysml:Feature" name="drivePwrPort">
          <referencedType href="2-Parts%20Interconnection.alf#|16"/>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:EndFeatureMembership">
        <ownedMemberElement xsi:type="sysml:Feature" name="clutchPort">
          <referencedType href="2-Parts%20Interconnection.alf#|17"/>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Association" name="DriveshaftInterface">
      <ownedMembership xsi:type="sysml:EndFeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="shaftPort_a">
          <referencedType href="2-Parts%20Interconnection.alf#|18"/>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:EndFeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="shaftPort_d">
          <referencedType href="2-Parts%20Interconnection.alf#|19"/>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
        <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9; * The driveshaft part is the &quot;interface medium&quot;.&#xA;&#x9;&#x9; * &#xA;&#x9;&#x9; * Note: It would be better if this was a reference rather&#xA;&#x9;&#x9; * than a part, but it is not obvious how to fill in the&#xA;&#x9;&#x9; * actual driveshaft when the association is used to type&#xA;&#x9;&#x9; * a connector.&#xA;&#x9;&#x9; */"/>
        <ownedMemberElement xsi:type="sysml:Feature" name="driveshaft">
          <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="shaftPort_b">
              <ownedElement xsi:type="sysml:Redefinition">
                <redefinedFeature href="2-Parts%20Interconnection.alf#|21"/>
              </ownedElement>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="shaftPort_c">
              <ownedElement xsi:type="sysml:Redefinition">
                <redefinedFeature href="2-Parts%20Interconnection.alf#|22"/>
              </ownedElement>
            </ownedMemberElement>
          </ownedMembership>
          <referencedType href="2-Parts%20Interconnection.alf#|20"/>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership">
        <ownedMemberElement xsi:type="sysml:Connector">
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|23"/>
          </connectorEnd>
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|24"/>
          </connectorEnd>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership">
        <ownedMemberElement xsi:type="sysml:Connector">
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|25"/>
          </connectorEnd>
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|26"/>
          </connectorEnd>
        </ownedMemberElement>
      </ownedMembership>
    </ownedMemberElement>
  </ownedMembership>
  <ownedMembership>
    <ownedMemberElement xsi:type="sysml:Feature" name="vehicle1_c1">
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="fuelCmdPort">
          <ownedElement xsi:type="sysml:Redefinition">
            <redefinedFeature href="2-Parts%20Interconnection.alf#|28"/>
          </ownedElement>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="vehicleToRoadPort">
          <ownedElement xsi:type="sysml:Redefinition">
            <redefinedFeature href="2-Parts%20Interconnection.alf#|29"/>
          </ownedElement>
          <ownedImport>
            <importedPackage href="2-Parts%20Interconnection.alf#|30"/>
          </ownedImport>
          <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="leftWheelToRoadPort">
              <ownedElement xsi:type="sysml:Subset">
                <subsettedFeature href="2-Parts%20Interconnection.alf#|31"/>
              </ownedElement>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression">
                  <referent href="2-Parts%20Interconnection.alf#|32"/>
                </primary>
                <index xsi:type="sysml:LiteralInteger" value="1"/>
              </value>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="rightWheelToRoadPort">
              <ownedElement xsi:type="sysml:Subset">
                <subsettedFeature href="2-Parts%20Interconnection.alf#|33"/>
              </ownedElement>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression">
                  <referent href="2-Parts%20Interconnection.alf#|34"/>
                </primary>
                <index xsi:type="sysml:LiteralInteger" value="2"/>
              </value>
            </ownedMemberElement>
          </ownedMembership>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="engine">
          <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="fuelCmdPort">
              <ownedElement xsi:type="sysml:Redefinition">
                <redefinedFeature href="2-Parts%20Interconnection.alf#|36"/>
              </ownedElement>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="drivePwrPort">
              <ownedElement xsi:type="sysml:Redefinition">
                <redefinedFeature href="2-Parts%20Interconnection.alf#|37"/>
              </ownedElement>
            </ownedMemberElement>
          </ownedMembership>
          <referencedType href="2-Parts%20Interconnection.alf#|35"/>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="transmission">
          <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="clutchPort">
              <ownedElement xsi:type="sysml:Redefinition">
                <redefinedFeature href="2-Parts%20Interconnection.alf#|39"/>
              </ownedElement>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="shaftPort_a">
              <referencedType href="2-Parts%20Interconnection.alf#|40"/>
            </ownedMemberElement>
          </ownedMembership>
          <referencedType href="2-Parts%20Interconnection.alf#|38"/>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
        <ownedMemberElement xsi:type="sysml:Feature" name="rearAxleAssembly_c1">
          <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="shaftPort_d">
              <ownedElement xsi:type="sysml:Redefinition">
                <redefinedFeature href="2-Parts%20Interconnection.alf#|42"/>
              </ownedElement>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
            <ownedElement xsi:type="sysml:Comment" body="/**&#xA;&#x9;&#x9;&#x9; * Untyped part.&#xA;&#x9;&#x9;&#x9; */"/>
            <ownedMemberElement xsi:type="sysml:Feature" name="differential">
              <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="shaftPort_d">
                  <referencedType href="2-Parts%20Interconnection.alf#|43"/>
                </ownedMemberElement>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="leftDiffPort">
                  <referencedType href="2-Parts%20Interconnection.alf#|44"/>
                </ownedMemberElement>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="rightDiffPort">
                  <referencedType href="2-Parts%20Interconnection.alf#|45"/>
                </ownedMemberElement>
              </ownedMembership>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="rearAxle">
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="leftAxle">
                  <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
                    <ownedMemberElement xsi:type="sysml:Feature" name="axleToDiffPort">
                      <ownedElement xsi:type="sysml:Redefinition">
                        <redefinedFeature href="2-Parts%20Interconnection.alf#|48"/>
                      </ownedElement>
                    </ownedMemberElement>
                  </ownedMembership>
                  <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
                    <ownedMemberElement xsi:type="sysml:Feature" name="axleToWheelPort">
                      <ownedElement xsi:type="sysml:Redefinition">
                        <redefinedFeature href="2-Parts%20Interconnection.alf#|49"/>
                      </ownedElement>
                    </ownedMemberElement>
                  </ownedMembership>
                  <referencedType href="2-Parts%20Interconnection.alf#|47"/>
                </ownedMemberElement>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="rightAxle">
                  <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
                    <ownedMemberElement xsi:type="sysml:Feature" name="axleToDiffPort">
                      <ownedElement xsi:type="sysml:Redefinition">
                        <redefinedFeature href="2-Parts%20Interconnection.alf#|51"/>
                      </ownedElement>
                    </ownedMemberElement>
                  </ownedMembership>
                  <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
                    <ownedMemberElement xsi:type="sysml:Feature" name="axleToWheelPort">
                      <ownedElement xsi:type="sysml:Redefinition">
                        <redefinedFeature href="2-Parts%20Interconnection.alf#|52"/>
                      </ownedElement>
                    </ownedMemberElement>
                  </ownedMembership>
                  <referencedType href="2-Parts%20Interconnection.alf#|50"/>
                </ownedMemberElement>
              </ownedMembership>
              <referencedType href="2-Parts%20Interconnection.alf#|46"/>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="rearWheel" isOrdered="true">
              <upper xsi:type="sysml:LiteralInteger" value="2"/>
              <referencedType href="2-Parts%20Interconnection.alf#|53"/>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="leftWheel">
              <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="wheelToAxlePort">
                  <referencedType href="2-Parts%20Interconnection.alf#|54"/>
                </ownedMemberElement>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="wheelToRoadPort">
                  <referencedType href="2-Parts%20Interconnection.alf#|55"/>
                </ownedMemberElement>
              </ownedMembership>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression">
                  <referent href="2-Parts%20Interconnection.alf#|56"/>
                </primary>
                <index xsi:type="sysml:LiteralInteger" value="1"/>
              </value>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership" isComposite="true">
            <ownedMemberElement xsi:type="sysml:Feature" name="rightWheel">
              <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="wheelToAxlePort">
                  <referencedType href="2-Parts%20Interconnection.alf#|57"/>
                </ownedMemberElement>
              </ownedMembership>
              <ownedMembership xsi:type="sysml:FeatureMembership" isPort="true">
                <ownedMemberElement xsi:type="sysml:Feature" name="wheelToRoadPort">
                  <referencedType href="2-Parts%20Interconnection.alf#|58"/>
                </ownedMemberElement>
              </ownedMembership>
              <value xsi:type="sysml:SequenceAccessExpression">
                <primary xsi:type="sysml:ElementReferenceExpression">
                  <referent href="2-Parts%20Interconnection.alf#|59"/>
                </primary>
                <index xsi:type="sysml:LiteralInteger" value="2"/>
              </value>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership">
            <ownedMemberElement xsi:type="sysml:Connector">
              <connectorEnd>
                <feature href="2-Parts%20Interconnection.alf#|60"/>
              </connectorEnd>
              <connectorEnd>
                <feature href="2-Parts%20Interconnection.alf#|61"/>
              </connectorEnd>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership">
            <ownedMemberElement xsi:type="sysml:Connector">
              <connectorEnd>
                <feature href="2-Parts%20Interconnection.alf#|62"/>
              </connectorEnd>
              <connectorEnd>
                <feature href="2-Parts%20Interconnection.alf#|63"/>
              </connectorEnd>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership">
            <ownedMemberElement xsi:type="sysml:Connector">
              <connectorEnd>
                <feature href="2-Parts%20Interconnection.alf#|64"/>
              </connectorEnd>
              <connectorEnd>
                <feature href="2-Parts%20Interconnection.alf#|65"/>
              </connectorEnd>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership">
            <ownedMemberElement xsi:type="sysml:Connector">
              <connectorEnd>
                <feature href="2-Parts%20Interconnection.alf#|66"/>
              </connectorEnd>
              <connectorEnd>
                <feature href="2-Parts%20Interconnection.alf#|67"/>
              </connectorEnd>
            </ownedMemberElement>
          </ownedMembership>
          <ownedMembership xsi:type="sysml:FeatureMembership">
            <ownedMemberElement xsi:type="sysml:Connector">
              <connectorEnd>
                <feature href="2-Parts%20Interconnection.alf#|68"/>
              </connectorEnd>
              <connectorEnd>
                <feature href="2-Parts%20Interconnection.alf#|69"/>
              </connectorEnd>
            </ownedMemberElement>
          </ownedMembership>
          <referencedType href="2-Parts%20Interconnection.alf#|41"/>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership">
        <ownedMemberElement xsi:type="sysml:Connector">
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|70"/>
          </connectorEnd>
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|71"/>
          </connectorEnd>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership">
        <ownedMemberElement xsi:type="sysml:Connector">
          <association href="2-Parts%20Interconnection.alf#|72"/>
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|73"/>
          </connectorEnd>
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|74"/>
          </connectorEnd>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership">
        <ownedMemberElement xsi:type="sysml:Connector">
          <association href="2-Parts%20Interconnection.alf#|75"/>
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|76"/>
          </connectorEnd>
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|77"/>
          </connectorEnd>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership">
        <ownedMemberElement xsi:type="sysml:Connector">
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|78"/>
          </connectorEnd>
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|79"/>
          </connectorEnd>
        </ownedMemberElement>
      </ownedMembership>
      <ownedMembership xsi:type="sysml:FeatureMembership">
        <ownedMemberElement xsi:type="sysml:Connector">
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|80"/>
          </connectorEnd>
          <connectorEnd>
            <feature href="2-Parts%20Interconnection.alf#|81"/>
          </connectorEnd>
        </ownedMemberElement>
      </ownedMembership>
      <referencedType href="2-Parts%20Interconnection.alf#|27"/>
    </ownedMemberElement>
  </ownedMembership>
</sysml:Package>
