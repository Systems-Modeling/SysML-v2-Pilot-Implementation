/**
 */
package org.omg.sysml.kerml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A basic object which asserts a "namespace" for a constituents of the model. Can "own" other ElementRecord's and Container's.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.core.Container#getPackageVisibility <em>Package Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.Container#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.Container#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.core.CorePackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends ElementRecord {
	/**
	 * Returns the value of the '<em><b>Package Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.kerml.core.visibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Visibility</em>' attribute.
	 * @see org.omg.sysml.kerml.core.visibilityKind
	 * @see #setPackageVisibility(visibilityKind)
	 * @see org.omg.sysml.kerml.core.CorePackage#getContainer_PackageVisibility()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	visibilityKind getPackageVisibility();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.core.Container#getPackageVisibility <em>Package Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Visibility</em>' attribute.
	 * @see org.omg.sysml.kerml.core.visibilityKind
	 * @see #getPackageVisibility()
	 * @generated
	 */
	void setPackageVisibility(visibilityKind value);

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.core.ElementRecord}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.core.ElementRecord#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' containment reference list.
	 * @see org.omg.sysml.kerml.core.CorePackage#getContainer_OwnedMember()
	 * @see org.omg.sysml.kerml.core.ElementRecord#getNamespace
	 * @model opposite="namespace" containment="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ElementRecord> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.core.ElementRecord}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.core.ElementRecord#getMemberOfNamespace <em>Member Of Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see org.omg.sysml.kerml.core.CorePackage#getContainer_Member()
	 * @see org.omg.sysml.kerml.core.ElementRecord#getMemberOfNamespace
	 * @model opposite="memberOfNamespace" derived="true" ordered="false"
	 * @generated
	 */
	EList<ElementRecord> getMember();

} // Container
