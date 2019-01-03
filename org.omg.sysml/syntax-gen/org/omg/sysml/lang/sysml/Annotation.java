/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatingComment <em>Annotating Comment</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends Relationship {
	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference.
	 * @see #setAnnotatedElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotation_AnnotatedElement()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='annotation'"
	 * @generated
	 */
	Element getAnnotatedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatedElement <em>Annotated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Element</em>' reference.
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	void setAnnotatedElement(Element value);

	/**
	 * Returns the value of the '<em><b>Annotating Comment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Comment#getAnnotationForComment <em>Annotation For Comment</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotating Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotating Comment</em>' reference.
	 * @see #setAnnotatingComment(Comment)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotation_AnnotatingComment()
	 * @see org.omg.sysml.lang.sysml.Comment#getAnnotationForComment
	 * @model opposite="annotationForComment" required="true" ordered="false"
	 * @generated
	 */
	Comment getAnnotatingComment();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatingComment <em>Annotating Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotating Comment</em>' reference.
	 * @see #getAnnotatingComment()
	 * @generated
	 */
	void setAnnotatingComment(Comment value);

} // Annotation
