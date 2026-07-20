/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>FeatureReferenceExpression</code> is an <code>Expression</code> whose <code>result</code> is bound to a <code>referent</code> <code>Feature</code>.</p>
 * referent =
 *     let nonParameterMemberships : Sequence(Membership) = ownedMembership->
 *         reject(oclIsKindOf(ParameterMembership)) in
 *     if nonParameterMemberships->isEmpty() or
 *        not nonParameterMemberships->first().memberElement.oclIsKindOf(Feature)
 *     then null
 *     else nonParameterMemberships->first().memberElement.oclAsType(Feature)
 *     endif
 * ownedMember->selectByKind(BindingConnector)->exists(b |
 *     b.relatedFeatures->includes(targetFeature) and
 *     b.relatedFeatures->includes(result))
 * let membership : Membership = 
 *     ownedMembership->reject(m | m.oclIsKindOf(ParameterMembership)) in
 * membership->notEmpty() and
 * membership->at(1).memberElement.oclIsKindOf(Feature)
 * result.owningType() = self and result.specializes(referent)
 * result.owningType = self
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureReferenceExpression#getReferent <em>Referent</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureReferenceExpression()
 * @model
 * @generated
 */
public interface FeatureReferenceExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Referent</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getMember() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that is referenced by this <code>FeatureReferenceExpression</code>, which is its first non-<code>parameter</code> <code>member</code>.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referent</em>' reference.
	 * @see #setReferent(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureReferenceExpression_Referent()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referenceExpression'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getReferent();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureReferenceExpression#getReferent <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referent</em>' reference.
	 * @see #getReferent()
	 * @generated
	 */
	void setReferent(Feature value);

} // FeatureReferenceExpression
