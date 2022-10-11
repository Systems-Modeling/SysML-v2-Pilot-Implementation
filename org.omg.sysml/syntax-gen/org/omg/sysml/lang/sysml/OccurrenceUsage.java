/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An OccurrenceUsage is a Usage whose type is a Class. Nominally, if the type is an OccurrenceDefinition, an OccurrenceUsage is a Usage of that OccurrenceDefinition within a system. However, other types of Kernel Classes are also allowed, to permit use of Classes from the Kernel Library.</p>
 * 
 * <p>An OccurrenceUsage must subset, directly or indirectly, the base Feature <em><code>occurrences</code></em> from the Kernel model library.</p>
 * 
 * if portionKind = null then portioningFeature = null
 * else 
 *     portioningFeature <> null and
 *     portionKind = portioningFeature.portionKind and
 *     occurrenceDefinition.asSet() = portioningFeature.type.asSet()
 * endif
 * let individualDefinitions : Sequence(OccurrenceDefinition) = 
 *     occurrenceDefinition->
 *         selectByKind(OccurrenceDefinition)->
 *         select(isIndividual) in
 * if individualDefinitions->isEmpty() then null
 * else individualDefinitions->at(1) endif
 * isIndividual implies individualDefinition <> null
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.OccurrenceUsage#getOccurrenceDefinition <em>Occurrence Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.OccurrenceUsage#getPortioningFeature <em>Portioning Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.OccurrenceUsage#getIndividualDefinition <em>Individual Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.OccurrenceUsage#isIndividual <em>Is Individual</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.OccurrenceUsage#getPortionKind <em>Portion Kind</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOccurrenceUsage()
 * @model
 * @generated
 */
public interface OccurrenceUsage extends Usage {
	/**
	 * Returns the value of the '<em><b>Occurrence Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Class}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getDefinition() <em>Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Classes that are the types of this OccurrenceUsage. Nominally, these are OccurrenceDefinitions, but other kinds of Kernel Classes are also allowed, to permit use of Classes from the Kernel Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOccurrenceUsage_OccurrenceDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedOccurrence'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<org.omg.sysml.lang.sysml.Class> getOccurrenceDefinition();

	/**
	 * Returns the value of the '<em><b>Portioning Feature</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A PortioningFeature typed by the <code>occurrenceDefinitions</code> of this OccurrenceUsage, thereby restricting the values of the OccurrenceUsage to be general portions, time slices or snapshots of instances of those definitions, consistence with the <code>portionKind</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Portioning Feature</em>' reference.
	 * @see #setPortioningFeature(PortioningFeature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOccurrenceUsage_PortioningFeature()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='portioningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	PortioningFeature getPortioningFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OccurrenceUsage#getPortioningFeature <em>Portioning Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portioning Feature</em>' reference.
	 * @see #getPortioningFeature()
	 * @generated
	 */
	void setPortioningFeature(PortioningFeature value);

	/**
	 * Returns the value of the '<em><b>Individual Definition</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.OccurrenceUsage#getOccurrenceDefinition() <em>Occurrence Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The one <code>occurrenceDefinition</code> that has <code>isIndividual = true</code> (if any).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Individual Definition</em>' reference.
	 * @see #setIndividualDefinition(OccurrenceDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOccurrenceUsage_IndividualDefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='individualUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	OccurrenceDefinition getIndividualDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OccurrenceUsage#getIndividualDefinition <em>Individual Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Definition</em>' reference.
	 * @see #getIndividualDefinition()
	 * @generated
	 */
	void setIndividualDefinition(OccurrenceDefinition value);

	/**
	 * Returns the value of the '<em><b>Is Individual</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this OccurrenceUsage represents the usage of the specific individual (or portion of it) represented by its <code>individualDefinition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Individual</em>' attribute.
	 * @see #setIsIndividual(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOccurrenceUsage_IsIndividual()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIndividual();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OccurrenceUsage#isIndividual <em>Is Individual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Individual</em>' attribute.
	 * @see #isIndividual()
	 * @generated
	 */
	void setIsIndividual(boolean value);

	/**
	 * Returns the value of the '<em><b>Portion Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.PortionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The kind of portion of the instances of the <code>occurrenceDefinition</code> represented by this OccurrenceUsage, if it is so restricted.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Portion Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.PortionKind
	 * @see #setPortionKind(PortionKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOccurrenceUsage_PortionKind()
	 * @model ordered="false"
	 * @generated
	 */
	PortionKind getPortionKind();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OccurrenceUsage#getPortionKind <em>Portion Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portion Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.PortionKind
	 * @see #getPortionKind()
	 * @generated
	 */
	void setPortionKind(PortionKind value);

} // OccurrenceUsage
