/**
 */
package org.omg.sysml.groups;

import org.eclipse.emf.common.util.EList;

import org.omg.sysml.core.Element;
import org.omg.sysml.core.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Naming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.groups.MemberNaming#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.groups.MemberNaming#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.groups.MemberNaming#getElement <em>Element</em>}</li>
 *   <li>{@link org.omg.sysml.groups.MemberNaming#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.groups.MemberNaming#getAliases <em>Aliases</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.groups.GroupsPackage#getMemberNaming()
 * @model
 * @generated
 */
public interface MemberNaming extends Relationship {
	/**
	 * Returns the value of the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Name</em>' attribute.
	 * @see #setMemberName(String)
	 * @see org.omg.sysml.groups.GroupsPackage#getMemberNaming_MemberName()
	 * @model ordered="false"
	 * @generated
	 */
	String getMemberName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.MemberNaming#getMemberName <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Name</em>' attribute.
	 * @see #getMemberName()
	 * @generated
	 */
	void setMemberName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.groups.Namespace#getMemberNaming <em>Member Naming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' container reference.
	 * @see #setNamespace(Namespace)
	 * @see org.omg.sysml.groups.GroupsPackage#getMemberNaming_Namespace()
	 * @see org.omg.sysml.groups.Namespace#getMemberNaming
	 * @model opposite="memberNaming" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.MemberNaming#getNamespace <em>Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' container reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(Element)
	 * @see org.omg.sysml.groups.GroupsPackage#getMemberNaming_Element()
	 * @model ordered="false"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.MemberNaming#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.groups.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.groups.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.omg.sysml.groups.GroupsPackage#getMemberNaming_Visibility()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.MemberNaming#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.groups.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliases</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' attribute list.
	 * @see org.omg.sysml.groups.GroupsPackage#getMemberNaming_Aliases()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getAliases();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" namingRequired="true" namingOrdered="false"
	 * @generated
	 */
	boolean isDistinguishableFrom(MemberNaming naming);

} // MemberNaming
