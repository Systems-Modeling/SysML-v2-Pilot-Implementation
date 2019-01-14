/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Relationship#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends Element {
	/**
	 * Returns the value of the '<em><b>Owned Related Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwningRelationship <em>Owning Relationship</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Related Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Related Element</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship_OwnedRelatedElement()
	 * @see org.omg.sysml.lang.sysml.Element#getOwningRelationship
	 * @model opposite="owningRelationship" containment="true" ordered="false"
	 * @generated
	 */
	EList<Element> getOwnedRelatedElement();

	/**
	 * Returns the value of the '<em><b>Owning Related Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship <em>Owned Relationship</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Related Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Related Element</em>' container reference.
	 * @see #setOwningRelatedElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship_OwningRelatedElement()
	 * @see org.omg.sysml.lang.sysml.Element#getOwnedRelationship
	 * @model opposite="ownedRelationship" transient="false" ordered="false"
	 * @generated
	 */
	Element getOwningRelatedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement <em>Owning Related Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Related Element</em>' container reference.
	 * @see #getOwningRelatedElement()
	 * @generated
	 */
	void setOwningRelatedElement(Element value);

	/**
	 * Returns the value of the '<em><b>Related Element</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Element</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship_RelatedElement()
	 * @model lower="2" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='relationship'"
	 * @generated
	 */
	EList<Element> getRelatedElement();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship_Target()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='targetRelationship'"
	 * @generated
	 */
	EList<Element> getTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship_Source()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sourceRelationship'"
	 * @generated
	 */
	EList<Element> getSource();
	
	// Additional operations
	
	/**
	 * This operation may be overridden to provide an effective union property for all owned related Elements, without introducing explicit subsetting.
	 * The regular ownedRelatedElement property can then still be used to add otherwise undifferentiated owned Elements.
	 * @return the union of all owned related Elements.
	 */
	default EList<Element> getAllOwnedRelatedElements() {
		return new UniqueEList<Element>(getOwnedRelatedElement());
	}

} // Relationship
