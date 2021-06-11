/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An OccurrenceDefinition is a Definition of a Class of individuals that have an independent life over time and potentially an extent over space. This includes both structural things and behaviors that act on such structures.</p>
 * 
 * <p>If <code>isIndividual</code> is true, then the OccurrenceDefinition is constrained to represent an individual thing. The instances of such an OccurrenceDefinition include all spatial and temporal portions of the individual being represented, but only one of these can be the complete Life of the individual. All other instances must be portions of the &quot;maximal portion&quot; that is single Life instance, capturing the conception that all of the instances represent one individual with a single &quot;identity&quot;.</p>
 * 
 * <p>An OccurrenceDefinition must subclass, directly or indirectly, the base Class <em>Occurrence</em> from the Kernel model library.</p>
 * 
 * if not isIndividual then lifeClass = null
 * else
 *     lifeClass <> null and
 *     lifeClass.allSupertypes()->includes(self)
 * endif
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
	 * <p>If <code>isIndividual</code> is true, a LifeClass that specializes this OccurrenceDefinition, restricting it to represent an individual.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Life Class</em>' reference.
	 * @see #setLifeClass(LifeClass)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOccurrenceDefinition_LifeClass()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='individualDefinition'"
	 *        annotation="subsets"
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
