/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ElementReferenceExpression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementReferenceExpressionImpl#getReferent <em>Referent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementReferenceExpressionImpl extends ExpressionImpl implements ElementReferenceExpression {
	/**
	 * The cached value of the '{@link #getReferent() <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferent()
	 * @generated
	 * @ordered
	 */
	protected Element referent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementReferenceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ELEMENT_REFERENCE_EXPRESSION;
	}
	
	@Override
	public Element getReferent() {
		getReferentGen();
		if (referent instanceof Feature) {
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
		}
		return referent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getReferentGen() {
		if (referent != null && referent.eIsProxy()) {
			InternalEObject oldReferent = (InternalEObject)referent;
			referent = (Element)eResolveProxy(oldReferent);
			if (referent != oldReferent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__REFERENT, oldReferent, referent));
			}
		}
		return referent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetReferent() {
		return referent;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferent(Element newReferent) {
		Element oldReferent = referent;
		referent = newReferent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__REFERENT, oldReferent, referent));
	}
	
	@Override
	public Feature getResult() {
		Element referent = getReferent();
		return referent instanceof Feature? (Feature)referent: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__REFERENT:
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
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__REFERENT:
				setReferent((Element)newValue);
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
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__REFERENT:
				setReferent((Element)null);
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
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__REFERENT:
				return referent != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementReferenceExpressionImpl
