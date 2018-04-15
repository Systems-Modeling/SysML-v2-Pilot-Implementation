/**
 */
package org.omg.sysml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.core.Comment#getBody <em>Body</em>}</li>
 *   <li>{@link org.omg.sysml.core.Comment#getCommentedElement <em>Commented Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.core.CorePackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends Element {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.omg.sysml.core.CorePackage#getComment_Body()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.omg.sysml.core.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Commented Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commented Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commented Element</em>' reference.
	 * @see #setCommentedElement(Element)
	 * @see org.omg.sysml.core.CorePackage#getComment_CommentedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Element getCommentedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.core.Comment#getCommentedElement <em>Commented Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commented Element</em>' reference.
	 * @see #getCommentedElement()
	 * @generated
	 */
	void setCommentedElement(Element value);

} // Comment
