/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.VariantMembershipImpl#getMembershipOwningPackage <em>Membership Owning Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.VariantMembershipImpl#getOwningVariationDefinition <em>Owning Variation Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.VariantMembershipImpl#getOwningVariationUsage <em>Owning Variation Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.VariantMembershipImpl#getOwnedVariantUsage_comp <em>Owned Variant Usage comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.VariantMembershipImpl#getOwnedVariantUsage <em>Owned Variant Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantMembershipImpl extends MembershipImpl implements VariantMembership {
	/**
	 * The cached value of the '{@link #getOwnedVariantUsage_comp() <em>Owned Variant Usage comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVariantUsage_comp()
	 * @generated
	 * @ordered
	 */
	protected Usage ownedVariantUsage_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariantMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.VARIANT_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.sysml.lang.sysml.Package getMembershipOwningPackage() {
		if (eContainerFeatureID() != SysMLPackage.VARIANT_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE) return null;
		return (org.omg.sysml.lang.sysml.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembershipOwningPackage(org.omg.sysml.lang.sysml.Package newMembershipOwningPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMembershipOwningPackage, SysMLPackage.VARIANT_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			Definition owningVariationDefinition = getOwningVariationDefinition();
			if (owningVariationDefinition != null && owningVariationDefinition != newMembershipOwningPackage) {
				setOwningVariationDefinition(null);
			}
			Usage owningVariationUsage = getOwningVariationUsage();
			if (owningVariationUsage != null && owningVariationUsage != newMembershipOwningPackage) {
				setOwningVariationUsage(null);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMembershipOwningPackage(org.omg.sysml.lang.sysml.Package newMembershipOwningPackage) {
		if (newMembershipOwningPackage != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.VARIANT_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE && newMembershipOwningPackage != null)) {
			if (EcoreUtil.isAncestor(this, newMembershipOwningPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMembershipOwningPackage != null)
				msgs = ((InternalEObject)newMembershipOwningPackage).eInverseAdd(this, SysMLPackage.PACKAGE__OWNED_MEMBERSHIP_COMP, org.omg.sysml.lang.sysml.Package.class, msgs);
			msgs = basicSetMembershipOwningPackage(newMembershipOwningPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.VARIANT_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE, newMembershipOwningPackage, newMembershipOwningPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembershipOwningPackage() {
		return getMembershipOwningPackage() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Definition getOwningVariationDefinition() {
		org.omg.sysml.lang.sysml.Package owningPackage = super.getMembershipOwningPackage();
		return owningPackage instanceof Definition && ((Definition)owningPackage).isVariation()? (Definition)owningPackage: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningVariationDefinition(Definition newOwningVariationDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningVariationDefinition, SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_DEFINITION, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningVariationDefinition != null) {
				org.omg.sysml.lang.sysml.Package membershipOwningPackage = getMembershipOwningPackage();
				if (newOwningVariationDefinition != membershipOwningPackage) {
					setMembershipOwningPackage(newOwningVariationDefinition);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningVariationDefinition(Definition newOwningVariationDefinition) {
		if (newOwningVariationDefinition != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_DEFINITION && newOwningVariationDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newOwningVariationDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningVariationDefinition != null)
				msgs = ((InternalEObject)newOwningVariationDefinition).eInverseAdd(this, SysMLPackage.DEFINITION__VARIANT_MEMBERSHIP_COMP, Definition.class, msgs);
			msgs = basicSetOwningVariationDefinition(newOwningVariationDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_DEFINITION, newOwningVariationDefinition, newOwningVariationDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Usage getOwningVariationUsage() {
		org.omg.sysml.lang.sysml.Package owningPackage = super.getMembershipOwningPackage();
		return owningPackage instanceof Usage && ((Usage)owningPackage).isVariation()? (Usage)owningPackage: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningVariationUsage(Usage newOwningVariationUsage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningVariationUsage, SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_USAGE, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningVariationUsage != null) {
				org.omg.sysml.lang.sysml.Package membershipOwningPackage = getMembershipOwningPackage();
				if (newOwningVariationUsage != membershipOwningPackage) {
					setMembershipOwningPackage(newOwningVariationUsage);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningVariationUsage(Usage newOwningVariationUsage) {
		if (newOwningVariationUsage != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_USAGE && newOwningVariationUsage != null)) {
			if (EcoreUtil.isAncestor(this, newOwningVariationUsage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningVariationUsage != null)
				msgs = ((InternalEObject)newOwningVariationUsage).eInverseAdd(this, SysMLPackage.USAGE__VARIANT_MEMBERSHIP_COMP, Usage.class, msgs);
			msgs = basicSetOwningVariationUsage(newOwningVariationUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_USAGE, newOwningVariationUsage, newOwningVariationUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwnedVariantUsage_comp() {
		return ownedVariantUsage_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedVariantUsage_comp(Usage newOwnedVariantUsage_comp, NotificationChain msgs) {
		Usage oldOwnedVariantUsage_comp = ownedVariantUsage_comp;
		ownedVariantUsage_comp = newOwnedVariantUsage_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP, oldOwnedVariantUsage_comp, newOwnedVariantUsage_comp);
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
	public void setOwnedVariantUsage_comp(Usage newOwnedVariantUsage_comp) {
		if (newOwnedVariantUsage_comp != ownedVariantUsage_comp) {
			NotificationChain msgs = null;
			if (ownedVariantUsage_comp != null)
				msgs = ((InternalEObject)ownedVariantUsage_comp).eInverseRemove(this, SysMLPackage.USAGE__OWNING_VARIANT_MEMBERSHIP, Usage.class, msgs);
			if (newOwnedVariantUsage_comp != null)
				msgs = ((InternalEObject)newOwnedVariantUsage_comp).eInverseAdd(this, SysMLPackage.USAGE__OWNING_VARIANT_MEMBERSHIP, Usage.class, msgs);
			msgs = basicSetOwnedVariantUsage_comp(newOwnedVariantUsage_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP, newOwnedVariantUsage_comp, newOwnedVariantUsage_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedVariantUsage_comp() {
		return ownedVariantUsage_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwnedVariantUsage() {
		Usage ownedVariantUsage = basicGetOwnedVariantUsage();
		return ownedVariantUsage != null && ownedVariantUsage.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)ownedVariantUsage) : ownedVariantUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetOwnedVariantUsage() {
		return getOwnedVariantUsage_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedVariantUsage(Usage newOwnedVariantUsage) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.VARIANT_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMembershipOwningPackage((org.omg.sysml.lang.sysml.Package)otherEnd, msgs);
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningVariationDefinition((Definition)otherEnd, msgs);
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_USAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningVariationUsage((Usage)otherEnd, msgs);
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP:
				if (ownedVariantUsage_comp != null)
					msgs = ((InternalEObject)ownedVariantUsage_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP, null, msgs);
				return basicSetOwnedVariantUsage_comp((Usage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.VARIANT_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				return basicSetMembershipOwningPackage(null, msgs);
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_DEFINITION:
				return basicSetOwningVariationDefinition(null, msgs);
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_USAGE:
				return basicSetOwningVariationUsage(null, msgs);
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP:
				return basicSetOwnedVariantUsage_comp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SysMLPackage.VARIANT_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.PACKAGE__OWNED_MEMBERSHIP_COMP, org.omg.sysml.lang.sysml.Package.class, msgs);
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_DEFINITION:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.DEFINITION__VARIANT_MEMBERSHIP_COMP, Definition.class, msgs);
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_USAGE:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.USAGE__VARIANT_MEMBERSHIP_COMP, Usage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_DEFINITION:
				return getOwningVariationDefinition();
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_USAGE:
				return getOwningVariationUsage();
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP:
				return getOwnedVariantUsage_comp();
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE:
				if (resolve) return getOwnedVariantUsage();
				return basicGetOwnedVariantUsage();
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
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_DEFINITION:
				setOwningVariationDefinition((Definition)newValue);
				return;
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_USAGE:
				setOwningVariationUsage((Usage)newValue);
				return;
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP:
				setOwnedVariantUsage_comp((Usage)newValue);
				return;
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE:
				setOwnedVariantUsage((Usage)newValue);
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
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_DEFINITION:
				setOwningVariationDefinition((Definition)null);
				return;
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_USAGE:
				setOwningVariationUsage((Usage)null);
				return;
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP:
				setOwnedVariantUsage_comp((Usage)null);
				return;
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE:
				setOwnedVariantUsage((Usage)null);
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
			case SysMLPackage.VARIANT_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE:
				return isSetMembershipOwningPackage();
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP:
				return isSetOwnedMemberElement_comp();
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_DEFINITION:
				return getOwningVariationDefinition() != null;
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_VARIATION_USAGE:
				return getOwningVariationUsage() != null;
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP:
				return isSetOwnedVariantUsage_comp();
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE:
				return basicGetOwnedVariantUsage() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwnedMemberElement_comp() {
		return getOwnedVariantUsage_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberElement_comp(Element newOwnedMemberElement_comp, NotificationChain msgs) {
		if (newOwnedMemberElement_comp != null && !(newOwnedMemberElement_comp instanceof Usage)) {
			throw new IllegalArgumentException("newOwnedMemberElement_comp must be an instance of Usage");
		}
		return basicSetOwnedVariantUsage_comp((Usage) newOwnedMemberElement_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberElement_comp(Element newOwnedMemberElement_comp) {
		if (newOwnedMemberElement_comp != null && !(newOwnedMemberElement_comp instanceof Usage)) {
			throw new IllegalArgumentException("newOwnedMemberElement_comp must be an instance of Usage");
		}
		setOwnedVariantUsage_comp((Usage) newOwnedMemberElement_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberElement_comp() {
  		return false;
	}

} //VariantMembershipImpl
