/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.kerml.owl.owl.ClassExpression;
import org.omg.kerml.owl.owl.DataPropertyExpression;
import org.omg.kerml.owl.owl.DataPropertyRange;
import org.omg.kerml.owl.owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.kerml.owl.owl.impl.DataPropertyRangeImpl#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.impl.DataPropertyRangeImpl#getClassExpression <em>Class Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPropertyRangeImpl extends DataPropertyAxiomImpl implements DataPropertyRange
{
  /**
   * The cached value of the '{@link #getDataPropertyExpressions() <em>Data Property Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataPropertyExpressions()
   * @generated
   * @ordered
   */
  protected EList<DataPropertyExpression> dataPropertyExpressions;

  /**
   * The cached value of the '{@link #getClassExpression() <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassExpression()
   * @generated
   * @ordered
   */
  protected ClassExpression classExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataPropertyRangeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OwlPackage.Literals.DATA_PROPERTY_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DataPropertyExpression> getDataPropertyExpressions()
  {
    if (dataPropertyExpressions == null)
    {
      dataPropertyExpressions = new EObjectContainmentEList<DataPropertyExpression>(DataPropertyExpression.class, this, OwlPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSIONS);
    }
    return dataPropertyExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassExpression getClassExpression()
  {
    return classExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassExpression(ClassExpression newClassExpression, NotificationChain msgs)
  {
    ClassExpression oldClassExpression = classExpression;
    classExpression = newClassExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_PROPERTY_RANGE__CLASS_EXPRESSION, oldClassExpression, newClassExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClassExpression(ClassExpression newClassExpression)
  {
    if (newClassExpression != classExpression)
    {
      NotificationChain msgs = null;
      if (classExpression != null)
        msgs = ((InternalEObject)classExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATA_PROPERTY_RANGE__CLASS_EXPRESSION, null, msgs);
      if (newClassExpression != null)
        msgs = ((InternalEObject)newClassExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OwlPackage.DATA_PROPERTY_RANGE__CLASS_EXPRESSION, null, msgs);
      msgs = basicSetClassExpression(newClassExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATA_PROPERTY_RANGE__CLASS_EXPRESSION, newClassExpression, newClassExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OwlPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSIONS:
        return ((InternalEList<?>)getDataPropertyExpressions()).basicRemove(otherEnd, msgs);
      case OwlPackage.DATA_PROPERTY_RANGE__CLASS_EXPRESSION:
        return basicSetClassExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OwlPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSIONS:
        return getDataPropertyExpressions();
      case OwlPackage.DATA_PROPERTY_RANGE__CLASS_EXPRESSION:
        return getClassExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OwlPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSIONS:
        getDataPropertyExpressions().clear();
        getDataPropertyExpressions().addAll((Collection<? extends DataPropertyExpression>)newValue);
        return;
      case OwlPackage.DATA_PROPERTY_RANGE__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OwlPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSIONS:
        getDataPropertyExpressions().clear();
        return;
      case OwlPackage.DATA_PROPERTY_RANGE__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OwlPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSIONS:
        return dataPropertyExpressions != null && !dataPropertyExpressions.isEmpty();
      case OwlPackage.DATA_PROPERTY_RANGE__CLASS_EXPRESSION:
        return classExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //DataPropertyRangeImpl
