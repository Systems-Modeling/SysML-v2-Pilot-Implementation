/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Feature
 * Reference Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureReferenceExpressionImpl#getReferent
 * <em>Referent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureReferenceExpressionImpl extends ExpressionImpl implements FeatureReferenceExpression {
	/**
	 * The cached value of the '{@link #getReferent() <em>Referent</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferent()
	 * @generated
	 * @ordered
	 */
	protected Feature referent;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FeatureReferenceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_REFERENCE_EXPRESSION;
	}

	@Override
	public Feature getReferent() {
		return referent == null ? basicGetReferent() : getReferentGen();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Feature getReferentGen() {
		if (referent != null && referent.eIsProxy()) {
			InternalEObject oldReferent = (InternalEObject) referent;
			referent = (Feature) eResolveProxy(oldReferent);
			if (referent != oldReferent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT, oldReferent, referent));
			}
		}
		return referent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Feature basicGetReferent() {
		if (referent == null) {
			clearCaches();
			EList<Feature> feature = getFeature();
			if (!feature.isEmpty()) {
				referent = feature.get(0);
			}
		}
		return referent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setReferent(Feature newReferent) {
		Feature oldReferent = referent;
		referent = newReferent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT,
					oldReferent, referent));
	}

	@Override
	public Feature getResult() {
		return getReferent();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT:
			if (resolve)
				return getReferent();
			return basicGetReferent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT:
			setReferent((Feature) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT:
			setReferent((Feature) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT:
			return referent != null;
		}
		return super.eIsSet(featureID);
	}

} // FeatureReferenceExpressionImpl
