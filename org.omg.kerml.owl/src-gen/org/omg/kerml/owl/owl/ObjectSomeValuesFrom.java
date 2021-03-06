/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Some Values From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.kerml.owl.owl.ObjectSomeValuesFrom#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.ObjectSomeValuesFrom#getClassExpression <em>Class Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.kerml.owl.owl.OwlPackage#getObjectSomeValuesFrom()
 * @model
 * @generated
 */
public interface ObjectSomeValuesFrom extends ClassExpression
{
  /**
   * Returns the value of the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expression</em>' containment reference.
   * @see #setObjectPropertyExpression(ObjectPropertyExpression)
   * @see org.omg.kerml.owl.owl.OwlPackage#getObjectSomeValuesFrom_ObjectPropertyExpression()
   * @model containment="true"
   * @generated
   */
  ObjectPropertyExpression getObjectPropertyExpression();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.ObjectSomeValuesFrom#getObjectPropertyExpression <em>Object Property Expression</em>}' containment reference.
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
   * @see org.omg.kerml.owl.owl.OwlPackage#getObjectSomeValuesFrom_ClassExpression()
   * @model containment="true"
   * @generated
   */
  ClassExpression getClassExpression();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.ObjectSomeValuesFrom#getClassExpression <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Expression</em>' containment reference.
   * @see #getClassExpression()
   * @generated
   */
  void setClassExpression(ClassExpression value);

} // ObjectSomeValuesFrom
