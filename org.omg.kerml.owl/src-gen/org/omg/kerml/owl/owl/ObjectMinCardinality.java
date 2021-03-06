/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Min Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.kerml.owl.owl.ObjectMinCardinality#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.ObjectMinCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.ObjectMinCardinality#getClassExpression <em>Class Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.kerml.owl.owl.OwlPackage#getObjectMinCardinality()
 * @model
 * @generated
 */
public interface ObjectMinCardinality extends ClassExpression
{
  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' attribute.
   * @see #setCardinality(int)
   * @see org.omg.kerml.owl.owl.OwlPackage#getObjectMinCardinality_Cardinality()
   * @model
   * @generated
   */
  int getCardinality();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.ObjectMinCardinality#getCardinality <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' attribute.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(int value);

  /**
   * Returns the value of the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expression</em>' containment reference.
   * @see #setObjectPropertyExpression(ObjectPropertyExpression)
   * @see org.omg.kerml.owl.owl.OwlPackage#getObjectMinCardinality_ObjectPropertyExpression()
   * @model containment="true"
   * @generated
   */
  ObjectPropertyExpression getObjectPropertyExpression();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.ObjectMinCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Expression</em>' containment reference.
   * @see #getObjectPropertyExpression()
   * @generated
   */
  void setObjectPropertyExpression(ObjectPropertyExpression value);

  /**
   * Returns the value of the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Expression</em>' containment reference.
   * @see #setClassExpression(ClassExpression)
   * @see org.omg.kerml.owl.owl.OwlPackage#getObjectMinCardinality_ClassExpression()
   * @model containment="true"
   * @generated
   */
  ClassExpression getClassExpression();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.ObjectMinCardinality#getClassExpression <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Expression</em>' containment reference.
   * @see #getClassExpression()
   * @generated
   */
  void setClassExpression(ClassExpression value);

} // ObjectMinCardinality
