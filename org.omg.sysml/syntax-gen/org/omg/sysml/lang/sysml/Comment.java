/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Comment</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * commentedElement = annotationForComment.annotatedElement
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Comment#getBody <em>Body</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Comment#getCommentedElement <em>Commented Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Comment#getAnnotationForComment <em>Annotation For Comment</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends Element {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getComment_Body()
	 * @model dataType="org.omg.sysml.lang.types.String" required="true"
	 *        ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Commented Element</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commented Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Commented Element</em>' reference.
	 * @see #setCommentedElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getComment_CommentedElement()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
	 *        body='comment'"
	 * @generated
	 */
	Element getCommentedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Comment#getCommentedElement <em>Commented Element</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commented Element</em>' reference.
	 * @see #getCommentedElement()
	 * @generated
	 */
	void setCommentedElement(Element value);

	/**
	 * Returns the value of the '<em><b>Annotation For Comment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatingComment <em>Annotating Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation For Comment</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation For Comment</em>' reference.
	 * @see #setAnnotationForComment(Annotation)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getComment_AnnotationForComment()
	 * @see org.omg.sysml.lang.sysml.Annotation#getAnnotatingComment
	 * @model opposite="annotatingComment" required="true" ordered="false"
	 * @generated
	 */
	Annotation getAnnotationForComment();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Comment#getAnnotationForComment <em>Annotation For Comment</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Annotation For Comment</em>' reference.
	 * @see #getAnnotationForComment()
	 * @generated
	 */
	void setAnnotationForComment(Annotation value);

} // Comment
