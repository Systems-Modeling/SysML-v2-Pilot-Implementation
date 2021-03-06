/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.kerml.owl.owl.Annotation#getAnnotationAnnotations <em>Annotation Annotations</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.Annotation#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.Annotation#getAnnotationvalue <em>Annotationvalue</em>}</li>
 * </ul>
 *
 * @see org.omg.kerml.owl.owl.OwlPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.kerml.owl.owl.Annotation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation Annotations</em>' containment reference list.
   * @see org.omg.kerml.owl.owl.OwlPackage#getAnnotation_AnnotationAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotationAnnotations();

  /**
   * Returns the value of the '<em><b>Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation Property</em>' containment reference.
   * @see #setAnnotationProperty(AnnotationProperty)
   * @see org.omg.kerml.owl.owl.OwlPackage#getAnnotation_AnnotationProperty()
   * @model containment="true"
   * @generated
   */
  AnnotationProperty getAnnotationProperty();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.Annotation#getAnnotationProperty <em>Annotation Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation Property</em>' containment reference.
   * @see #getAnnotationProperty()
   * @generated
   */
  void setAnnotationProperty(AnnotationProperty value);

  /**
   * Returns the value of the '<em><b>Annotationvalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotationvalue</em>' containment reference.
   * @see #setAnnotationvalue(AnnotationValue)
   * @see org.omg.kerml.owl.owl.OwlPackage#getAnnotation_Annotationvalue()
   * @model containment="true"
   * @generated
   */
  AnnotationValue getAnnotationvalue();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.Annotation#getAnnotationvalue <em>Annotationvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotationvalue</em>' containment reference.
   * @see #getAnnotationvalue()
   * @generated
   */
  void setAnnotationvalue(AnnotationValue value);

} // Annotation
