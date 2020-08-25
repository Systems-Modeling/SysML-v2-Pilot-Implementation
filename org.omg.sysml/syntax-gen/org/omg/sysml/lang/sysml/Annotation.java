/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Annotation is a Relationship between an AnnotatingElement and the Element that is annotated by that AnnotatingElement.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatingElement <em>Annotating Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatedElement <em>Owning Annotated Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends Relationship {
	/**
	 * Returns the value of the '<em><b>Annotating Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.AnnotatingElement#getAnnotation <em>Annotation</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The AnnotatingElement that annotates the <code>annotatedElement</code> of this Annotation.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotating Element</em>' reference.
	 * @see #setAnnotatingElement(AnnotatingElement)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotation_AnnotatingElement()
	 * @see org.omg.sysml.lang.sysml.AnnotatingElement#getAnnotation
	 * @model opposite="annotation" required="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	AnnotatingElement getAnnotatingElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatingElement <em>Annotating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotating Element</em>' reference.
	 * @see #getAnnotatingElement()
	 * @generated
	 */
	void setAnnotatingElement(AnnotatingElement value);

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
	 * <!-- begin-model-doc -->
	 * <p>The Element that is annotated by the <code>annotatingElement</code> of this Annotation.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference.
	 * @see #setAnnotatedElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotation_AnnotatedElement()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='annotation'"
	 *        annotation="redefines"
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
	 * Returns the value of the '<em><b>Owning Annotated Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwnedAnnotation_comp <em>Owned Annotation comp</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatedElement() <em>Annotated Element</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>annotatedElement</code> of this Annotation, when it is also its <code>owningRelatedElement</code>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Annotated Element</em>' container reference.
	 * @see #setOwningAnnotatedElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotation_OwningAnnotatedElement()
	 * @see org.omg.sysml.lang.sysml.Element#getOwnedAnnotation_comp
	 * @model opposite="ownedAnnotation_comp" transient="false" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Element getOwningAnnotatedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatedElement <em>Owning Annotated Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Annotated Element</em>' container reference.
	 * @see #getOwningAnnotatedElement()
	 * @generated
	 */
	void setOwningAnnotatedElement(Element value);

} // Annotation
