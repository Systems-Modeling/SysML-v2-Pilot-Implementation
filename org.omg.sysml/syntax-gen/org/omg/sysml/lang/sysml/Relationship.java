/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Relationship</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Relationship is an Element that relates two or more other Elements. Some of its <tt>relatedElements</tt> may be owned, in which case those <tt>ownedRelatedElements</tt> will be deleted from a model if their <tt>owningRelationship</tt> is. A Relationship may also be owned by another Element, in which case the <tt>ownedRelatedElements</tt> of the Relationship are also considered to be transitively owned by the <tt>owningRelatedElement</tt> of the Relationship.</p>
 * 
 * <p>The <tt>relatedElements</tt> of a Relationship are divided into <tt>source</tt> and <tt>target</tt> Elements. The Relationship is considered to be directed from the <tt>source</tt> to the <tt>target</tt> Elements. An undirected Relationship may have either all <tt>source</tt> or all <tt>target</tt> Elements.</p>
 * 
 * <p>A &quot;relationship Element&quot; in the kernel abstract syntax is generically any Element that is an instance of either Relationship or a direct or indirect specialization of Relationship. Any other kind of Element is a &quot;non-relationship Element&quot;. It is a convention of the kernel abstract syntax that non-relationship Elements are <em>only</em> related via reified relationship Elements. Any meta-associations directly between non-relationship Elements must be derived from underlying reified Relationships.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement_comp <em>Owned Related Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends Element {
	/**
	 * Returns the value of the '<em><b>Owned Related Element</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Related Element</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Related Element</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship_OwnedRelatedElement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Element> getOwnedRelatedElement();

	/**
	 * Returns the value of the '<em><b>Owning Related Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship_comp <em>Owned Relationship comp</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Related Element</em>' container reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <tt>relatedElement</tt> of this Relationship that owns the Relationship, if any.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Related Element</em>' container reference.
	 * @see #setOwningRelatedElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship_OwningRelatedElement()
	 * @see org.omg.sysml.lang.sysml.Element#getOwnedRelationship_comp
	 * @model opposite="ownedRelationship_comp" transient="false" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Element getOwningRelatedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement <em>Owning Related Element</em>}' container reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Related Element</em>' container reference.
	 * @see #getOwningRelatedElement()
	 * @generated
	 */
	void setOwningRelatedElement(Element value);

	/**
	 * Returns the value of the '<em><b>Owned Related Element comp</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwningRelationship <em>Owning Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Related Element comp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <tt>relatedElements</tt> of this Relationship that are owned by the Relationship.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Related Element comp</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship_OwnedRelatedElement_comp()
	 * @see org.omg.sysml.lang.sysml.Element#getOwningRelationship
	 * @model opposite="owningRelationship" containment="true" ordered="false"
	 * @generated
	 */
	EList<Element> getOwnedRelatedElement_comp();

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
	 * <!-- begin-model-doc -->
	 * <p>The Elements that are related by this Relationship, derived as the union of the <tt>source</tt> and <tt>target</tt> Elements of the Relationship. Every Relationship must have at least two <tt>relatedElements</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Element</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship_RelatedElement()
	 * @model lower="2" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='relationship'"
	 *        annotation="union"
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
	 * If the meaning of the '<em>Target</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship_Target()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='targetRelationship'"
	 *        annotation="subsets"
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
	 * If the meaning of the '<em>Source</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <tt>relatedElements</tt> from which this Relationship is considered to be directed.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRelationship_Source()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sourceRelationship'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Element> getSource();

} // Relationship
