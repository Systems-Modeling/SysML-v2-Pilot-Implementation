/**
 */
package org.omg.sysml.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.omg.sysml.groups.ElementGroup;
import org.omg.sysml.groups.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.core.Element#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.sysml.core.Element#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.core.Element#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.omg.sysml.core.Element#getOwningGroup <em>Owning Group</em>}</li>
 *   <li>{@link org.omg.sysml.core.Element#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.core.Element#getOwningNamespace <em>Owning Namespace</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.core.CorePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.core.Element}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.core.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference list.
	 * @see org.omg.sysml.core.CorePackage#getElement_OwnedElement()
	 * @see org.omg.sysml.core.Element#getOwner
	 * @model opposite="owner" containment="true" ordered="false"
	 * @generated
	 */
	EList<Element> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.core.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Element)
	 * @see org.omg.sysml.core.CorePackage#getElement_Owner()
	 * @see org.omg.sysml.core.Element#getOwnedElement
	 * @model opposite="ownedElement" transient="false" ordered="false"
	 * @generated
	 */
	Element getOwner();

	/**
	 * Sets the value of the '{@link org.omg.sysml.core.Element#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Element value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.omg.sysml.core.CorePackage#getElement_Identifier()
	 * @model default="" required="true" derived="true" ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.omg.sysml.core.Element#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Owning Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Group</em>' reference.
	 * @see #setOwningGroup(ElementGroup)
	 * @see org.omg.sysml.core.CorePackage#getElement_OwningGroup()
	 * @model ordered="false"
	 * @generated
	 */
	ElementGroup getOwningGroup();

	/**
	 * Sets the value of the '{@link org.omg.sysml.core.Element#getOwningGroup <em>Owning Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Group</em>' reference.
	 * @see #getOwningGroup()
	 * @generated
	 */
	void setOwningGroup(ElementGroup value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.sysml.core.CorePackage#getElement_Name()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.core.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Namespace</em>' reference.
	 * @see #setOwningNamespace(Namespace)
	 * @see org.omg.sysml.core.CorePackage#getElement_OwningNamespace()
	 * @model derived="true"
	 * @generated
	 */
	Namespace getOwningNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.core.Element#getOwningNamespace <em>Owning Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Namespace</em>' reference.
	 * @see #getOwningNamespace()
	 * @generated
	 */
	void setOwningNamespace(Namespace value);

} // Element
