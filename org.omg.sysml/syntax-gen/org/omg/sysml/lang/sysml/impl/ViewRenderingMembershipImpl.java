/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.ViewRenderingMembership;
import org.omg.sysml.util.FeatureUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Rendering Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewRenderingMembershipImpl#getOwnedRendering <em>Owned Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewRenderingMembershipImpl#getReferencedRendering <em>Referenced Rendering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewRenderingMembershipImpl extends FeatureMembershipImpl implements ViewRenderingMembership {
	/**
	 * The cached value of the '{@link #getOwnedRendering() <em>Owned Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRendering()
	 * @generated
	 * @ordered
	 */
	protected RenderingUsage ownedRendering;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewRenderingMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.VIEW_RENDERING_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenderingUsage getOwnedRendering() {
		if (ownedRendering != null && ownedRendering.eIsProxy()) {
			InternalEObject oldOwnedRendering = (InternalEObject)ownedRendering;
			ownedRendering = (RenderingUsage)eResolveProxy(oldOwnedRendering);
			if (ownedRendering != oldOwnedRendering) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.VIEW_RENDERING_MEMBERSHIP__OWNED_RENDERING, oldOwnedRendering, ownedRendering));
			}
		}
		return ownedRendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingUsage basicGetOwnedRendering() {
		return ownedRendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedRendering(RenderingUsage newOwnedRendering) {
		RenderingUsage oldOwnedRendering = ownedRendering;
		ownedRendering = newOwnedRendering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.VIEW_RENDERING_MEMBERSHIP__OWNED_RENDERING, oldOwnedRendering, ownedRendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenderingUsage getReferencedRendering() {
		RenderingUsage referencedRendering = basicGetReferencedRendering();
		return referencedRendering != null && referencedRendering.eIsProxy() ? (RenderingUsage)eResolveProxy((InternalEObject)referencedRendering) : referencedRendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RenderingUsage basicGetReferencedRendering() {
		return FeatureUtil.getSubsettedFeatureOf(getOwnedRendering(), RenderingUsage.class, feature->false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setReferencedRendering(RenderingUsage newReferencedRendering) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.VIEW_RENDERING_MEMBERSHIP__OWNED_RENDERING:
				if (resolve) return getOwnedRendering();
				return basicGetOwnedRendering();
			case SysMLPackage.VIEW_RENDERING_MEMBERSHIP__REFERENCED_RENDERING:
				if (resolve) return getReferencedRendering();
				return basicGetReferencedRendering();
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
			case SysMLPackage.VIEW_RENDERING_MEMBERSHIP__OWNED_RENDERING:
				setOwnedRendering((RenderingUsage)newValue);
				return;
			case SysMLPackage.VIEW_RENDERING_MEMBERSHIP__REFERENCED_RENDERING:
				setReferencedRendering((RenderingUsage)newValue);
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
			case SysMLPackage.VIEW_RENDERING_MEMBERSHIP__OWNED_RENDERING:
				setOwnedRendering((RenderingUsage)null);
				return;
			case SysMLPackage.VIEW_RENDERING_MEMBERSHIP__REFERENCED_RENDERING:
				setReferencedRendering((RenderingUsage)null);
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
			case SysMLPackage.VIEW_RENDERING_MEMBERSHIP__OWNED_RENDERING:
				return ownedRendering != null;
			case SysMLPackage.VIEW_RENDERING_MEMBERSHIP__REFERENCED_RENDERING:
				return basicGetReferencedRendering() != null;
		}
		return super.eIsSet(featureID);
	}

} //ViewRenderingMembershipImpl
