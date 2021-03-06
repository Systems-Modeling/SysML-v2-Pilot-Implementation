/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.omg.kerml.owl.owl.FacetRestriction;
import org.omg.kerml.owl.owl.Literal;
import org.omg.kerml.owl.owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.kerml.owl.owl.impl.FacetRestrictionImpl#getConstrainingFacet <em>Constraining Facet</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.impl.FacetRestrictionImpl#getRestrictionValue <em>Restriction Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacetRestrictionImpl extends MinimalEObjectImpl.Container implements FacetRestriction
{
  /**
   * The default value of the '{@link #getConstrainingFacet() <em>Constraining Facet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstrainingFacet()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINING_FACET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstrainingFacet() <em>Constraining Facet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstrainingFacet()
   * @generated
   * @ordered
   */
  protected String constrainingFacet = CONSTRAINING_FACET_EDEFAULT;

  /**
   * The cached value of the '{@link #getRestrictionValue() <em>Restriction Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestrictionValue()
   * @generated
   * @ordered
   */
  protected Literal restrictionValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacetRestrictionImpl()
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
    return OwlPackage.Literals.FACET_RESTRICTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getConstrainingFacet()
  {
    return constrainingFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConstrainingFacet(String newConstrainingFacet)
  {
    String oldConstrainingFacet = constrainingFacet;
    constrainingFacet = newConstrainingFacet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.FACET_RESTRICTION__CONSTRAINING_FACET, oldConstrainingFacet, constrainingFacet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Literal getRestrictionValue()
  {
    return restrictionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRestrictionValue(Literal newRestrictionValue, NotificationChain msgs)
  {
    Literal oldRestrictionValue = restrictionValue;
    restrictionValue = newRestrictionValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.FACET_RESTRICTION__RESTRICTION_VALUE, oldRestrictionValue, newRestrictionValue);
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
  public void setRestrictionValue(Literal newRestrictionValue)
  {
    if (newRestrictionValue != restrictionValue)
    {
      NotificationChain msgs = null;
      if (restrictionValue != null)
        msgs = ((InternalEObject)restrictionValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlPackage.FACET_RESTRICTION__RESTRICTION_VALUE, null, msgs);
      if (newRestrictionValue != null)
        msgs = ((InternalEObject)newRestrictionValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OwlPackage.FACET_RESTRICTION__RESTRICTION_VALUE, null, msgs);
      msgs = basicSetRestrictionValue(newRestrictionValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.FACET_RESTRICTION__RESTRICTION_VALUE, newRestrictionValue, newRestrictionValue));
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
      case OwlPackage.FACET_RESTRICTION__RESTRICTION_VALUE:
        return basicSetRestrictionValue(null, msgs);
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
      case OwlPackage.FACET_RESTRICTION__CONSTRAINING_FACET:
        return getConstrainingFacet();
      case OwlPackage.FACET_RESTRICTION__RESTRICTION_VALUE:
        return getRestrictionValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OwlPackage.FACET_RESTRICTION__CONSTRAINING_FACET:
        setConstrainingFacet((String)newValue);
        return;
      case OwlPackage.FACET_RESTRICTION__RESTRICTION_VALUE:
        setRestrictionValue((Literal)newValue);
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
      case OwlPackage.FACET_RESTRICTION__CONSTRAINING_FACET:
        setConstrainingFacet(CONSTRAINING_FACET_EDEFAULT);
        return;
      case OwlPackage.FACET_RESTRICTION__RESTRICTION_VALUE:
        setRestrictionValue((Literal)null);
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
      case OwlPackage.FACET_RESTRICTION__CONSTRAINING_FACET:
        return CONSTRAINING_FACET_EDEFAULT == null ? constrainingFacet != null : !CONSTRAINING_FACET_EDEFAULT.equals(constrainingFacet);
      case OwlPackage.FACET_RESTRICTION__RESTRICTION_VALUE:
        return restrictionValue != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (constrainingFacet: ");
    result.append(constrainingFacet);
    result.append(')');
    return result.toString();
  }

} //FacetRestrictionImpl
