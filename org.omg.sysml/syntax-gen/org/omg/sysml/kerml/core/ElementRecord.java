/**
 */
package org.omg.sysml.kerml.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.core.ElementRecord#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.ElementRecord#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.ElementRecord#getTitle <em>Title</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.ElementRecord#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.ElementRecord#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.ElementRecord#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.ElementRecord#getMemberOfNamespace <em>Member Of Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.ElementRecord#getSourceRelationship <em>Source Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.ElementRecord#getTargetRelationship <em>Target Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.ElementRecord#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.ElementRecord#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.core.CorePackage#getElementRecord()
 * @model
 * @generated
 */
public interface ElementRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.omg.sysml.kerml.core.CorePackage#getElementRecord_Documentation()
	 * @model ordered="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.core.ElementRecord#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.core.ElementRecord#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(ElementRecord)
	 * @see org.omg.sysml.kerml.core.CorePackage#getElementRecord_Owner()
	 * @see org.omg.sysml.kerml.core.ElementRecord#getOwnedElement
	 * @model opposite="ownedElement" transient="false" ordered="false"
	 * @generated
	 */
	ElementRecord getOwner();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.core.ElementRecord#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ElementRecord value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.omg.sysml.kerml.core.CorePackage#getElementRecord_Title()
	 * @model ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.core.ElementRecord#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see org.omg.sysml.kerml.core.CorePackage#getElementRecord_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.core.ElementRecord#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.core.Relationship}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.core.Relationship#getRelated <em>Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference list.
	 * @see org.omg.sysml.kerml.core.CorePackage#getElementRecord_Relationship()
	 * @see org.omg.sysml.kerml.core.Relationship#getRelated
	 * @model opposite="related" derived="true" ordered="false"
	 * @generated
	 */
	EList<Relationship> getRelationship();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.core.Container#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' container reference.
	 * @see #setNamespace(Container)
	 * @see org.omg.sysml.kerml.core.CorePackage#getElementRecord_Namespace()
	 * @see org.omg.sysml.kerml.core.Container#getOwnedMember
	 * @model opposite="ownedMember" transient="false" derived="true" ordered="false"
	 * @generated
	 */
	Container getNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.core.ElementRecord#getNamespace <em>Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' container reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Container value);

	/**
	 * Returns the value of the '<em><b>Member Of Namespace</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.core.Container}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.core.Container#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Of Namespace</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Of Namespace</em>' reference list.
	 * @see org.omg.sysml.kerml.core.CorePackage#getElementRecord_MemberOfNamespace()
	 * @see org.omg.sysml.kerml.core.Container#getMember
	 * @model opposite="member" derived="true" ordered="false"
	 * @generated
	 */
	EList<Container> getMemberOfNamespace();

	/**
	 * Returns the value of the '<em><b>Source Relationship</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.core.Relationship}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.core.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Relationship</em>' reference list.
	 * @see org.omg.sysml.kerml.core.CorePackage#getElementRecord_SourceRelationship()
	 * @see org.omg.sysml.kerml.core.Relationship#getSource
	 * @model opposite="source" derived="true" ordered="false"
	 * @generated
	 */
	EList<Relationship> getSourceRelationship();

	/**
	 * Returns the value of the '<em><b>Target Relationship</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.core.Relationship}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.core.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Relationship</em>' reference list.
	 * @see org.omg.sysml.kerml.core.CorePackage#getElementRecord_TargetRelationship()
	 * @see org.omg.sysml.kerml.core.Relationship#getTarget
	 * @model opposite="target" derived="true" ordered="false"
	 * @generated
	 */
	EList<Relationship> getTargetRelationship();

	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.core.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Comment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Comment</em>' reference list.
	 * @see org.omg.sysml.kerml.core.CorePackage#getElementRecord_OwnedComment()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Comment> getOwnedComment();

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.core.ElementRecord}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.core.ElementRecord#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference list.
	 * @see org.omg.sysml.kerml.core.CorePackage#getElementRecord_OwnedElement()
	 * @see org.omg.sysml.kerml.core.ElementRecord#getOwner
	 * @model opposite="owner" containment="true" ordered="false"
	 * @generated
	 */
	EList<ElementRecord> getOwnedElement();

} // ElementRecord
