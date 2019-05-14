/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureReferenceExpressionImpl#getReferent <em>Referent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureReferenceExpressionImpl extends ExpressionImpl implements FeatureReferenceExpression {
	/**
	 * The cached value of the '{@link #getReferent() <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferent()
	 * @generated
	 * @ordered
	 */
	protected Feature referent;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureReferenceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_REFERENCE_EXPRESSION;
	}

	@Override
	public Feature getReferent() {
		getReferentGen();
		List<FeatureMembership> memberships = getOwnedFeatureMembership().stream().
				filter(m->m.getOwnedMemberFeature() == null).collect(Collectors.toList());
		FeatureMembership membership;
		if (!memberships.isEmpty()) {
			membership = memberships.get(0);
		} else {
			membership = SysMLFactory.eINSTANCE.createFeatureMembership();
			getOwnedRelationship().add(membership);
		}
		membership.setMemberName(referent.getName());
		membership.setMemberFeature((Feature)referent);
		return referent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getReferentGen() {
		if (referent != null && referent.eIsProxy()) {
			InternalEObject oldReferent = (InternalEObject)referent;
			referent = (Feature)eResolveProxy(oldReferent);
			if (referent != oldReferent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT, oldReferent, referent));
			}
		}
		return referent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetReferent() {
		return referent;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferent(Feature newReferent) {
		Feature oldReferent = referent;
		referent = newReferent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT, oldReferent, referent));
	}

	@Override
	public Feature getResult() {
		return getReferent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT:
				if (resolve) return getReferent();
				return basicGetReferent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT:
				setReferent((Feature)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT:
				setReferent((Feature)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT:
				return referent != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureReferenceExpressionImpl
