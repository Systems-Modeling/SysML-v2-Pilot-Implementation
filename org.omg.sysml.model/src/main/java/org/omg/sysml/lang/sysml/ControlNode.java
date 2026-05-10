/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ControlNode</code> is an <code>ActionUsage</code> that does not have any inherent behavior but provides constraints on incoming and outgoing <code>Successions</code> that are used to control other <code>Actions</code>. A <code>ControlNode</code> must be a composite owned <code>usage</code> of an <code>ActionDefinition</code> or <code>ActionUsage</code>.</p>
 * 
 * sourceConnector->selectByKind(Succession)->
 *     collect(connectorEnd->at(1).multiplicity)->
 *     forAll(sourceMult | 
 *         multiplicityHasBounds(sourceMult, 1, 1))
 * owningType <> null and 
 * (owningType.oclIsKindOf(ActionDefinition) or
 *  owningType.oclIsKindOf(ActionUsage))
 * targetConnector->selectByKind(Succession)->
 *     collect(connectorEnd->at(2).multiplicity)->
 *     forAll(targetMult | 
 *         multiplicityHasBounds(targetMult, 1, 1))
 * specializesFromLibrary('Action::Action::controls')
 * isComposite
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getControlNode()
 * @model abstract="true"
 * @generated
 */
public interface ControlNode extends ActionUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Check that the given <code>Multiplicity</code> has <code>lowerBound</code> and <code>upperBound</code> expressions that are model-level evaluable to the given <code>lower</code> and <code>upper</code> values.</p>
	 * mult <> null and
	 * if mult.oclIsKindOf(MultiplicityRange) then
	 *     mult.oclAsType(MultiplicityRange).hasBounds(lower, upper)
	 * else
	 *     mult.allSuperTypes()->exists(
	 *         oclisKindOf(MultiplicityRange) and
	 *         oclAsType(MultiplicityRange).hasBounds(lower, upper)
	 * endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" multRequired="true" multOrdered="false" lowerRequired="true" lowerOrdered="false" upperRequired="true" upperOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean multiplicityHasBounds(Multiplicity mult, int lower, int upper);

} // ControlNode
