/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>OccurrenceDefinition</code> is a <code>Definition</code> of a <code>Class</code> of individuals that have an independent life over time and potentially an extent over space. This includes both structural things and behaviors that act on such structures.</p>
 * 
 * <p>If <code>isIndividual</code> is true, then the <code>OccurrenceDefinition</code> is constrained to represent an individual thing. The instances of such an <code>OccurrenceDefinition</code> include all spatial and temporal portions of the individual being represented, but only one of these can be the complete <code>Life</code> of the individual. All other instances must be portions of the &quot;maximal portion&quot; that is single <code>Life</code> instance, capturing the conception that all of the instances represent one individual with a single &quot;identity&quot;.</p>
 * 
 * <p>An <code>OccurrenceDefinition</code> must specialize, directly or indirectly, the base <code>Class</code> <code><em>Occurrence</em></code> from the Kernel Semantic Library.</p>
 * 
 * let n : Integer = ownedMember->selectByKind(LifeClass) in
 * if isIndividual then n = 1 else n = 0 endif
 * lifeClass =
 *     let lifeClasses: OrderedSet(LifeClass) = 
 *         ownedMember->selectByKind(LifeClass) in
 *     if lifeClasses->isEmpty() then null
 *     else lifeClasses->first()
 *     endif
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.OccurrenceDefinition#getLifeClass <em>Life Class</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.OccurrenceDefinition#isIndividual <em>Is Individual</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOccurrenceDefinition()
 * @model
 * @generated
 */
public interface OccurrenceDefinition extends Definition, org.omg.sysml.lang.sysml.Class {
	/**
	 * Returns the value of the '<em><b>Life Class</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>If <code>isIndividual</code> is true, a <code>LifeClass</code> that specializes this <code>OccurrenceDefinition</code>, restricting it to represent an individual.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Life Class</em>' reference.
	 * @see #setLifeClass(LifeClass)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOccurrenceDefinition_LifeClass()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='individualDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	LifeClass getLifeClass();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OccurrenceDefinition#getLifeClass <em>Life Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Class</em>' reference.
	 * @see #getLifeClass()
	 * @generated
	 */
	void setLifeClass(LifeClass value);

	/**
	 * Returns the value of the '<em><b>Is Individual</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this OccurrenceDefinition is constrained to represent single individual.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Individual</em>' attribute.
	 * @see #setIsIndividual(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOccurrenceDefinition_IsIndividual()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIndividual();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OccurrenceDefinition#isIndividual <em>Is Individual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Individual</em>' attribute.
	 * @see #isIndividual()
	 * @generated
	 */
	void setIsIndividual(boolean value);

} // OccurrenceDefinition
