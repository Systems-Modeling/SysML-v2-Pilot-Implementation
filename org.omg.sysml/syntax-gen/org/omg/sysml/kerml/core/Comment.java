/**
 */
package org.omg.sysml.kerml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An object in the model that exists solely for the purposes of describing other objects within the model. The target of this description can be specified via the "annotatedElement" metaproperty.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.core.Comment#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.Comment#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.core.CorePackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends ElementRecord {
	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.core.ElementRecord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference list.
	 * @see org.omg.sysml.kerml.core.CorePackage#getComment_AnnotatedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ElementRecord> getAnnotatedElement();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.omg.sysml.kerml.core.CorePackage#getComment_Comment()
	 * @model ordered="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.core.Comment#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // Comment
