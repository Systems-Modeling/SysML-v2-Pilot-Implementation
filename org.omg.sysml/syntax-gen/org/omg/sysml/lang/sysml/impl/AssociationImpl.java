/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwnedFeatureMembership <em>Owned Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwnedEndFeatureMembership <em>Owned End Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwningConnector <em>Owning Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends ClassImpl implements Association {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> source;

	/**
	 * The cached value of the '{@link #getOwnedEndFeatureMembership() <em>Owned End Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEndFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<EndFeatureMembership> ownedEndFeatureMembership;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.ASSOCIATION__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.ASSOCIATION__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.lang.sysml.Class> getRelatedType() {
		return new DerivedUnionEObjectEList<org.omg.sysml.lang.sysml.Class>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.ASSOCIATION__RELATED_TYPE, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedType() {
		return !getRelatedType().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureMembership> getOwnedFeatureMembership() {
		if (ownedFeatureMembership == null) {
			ownedFeatureMembership = new SubsetSupersetEObjectWithInverseResolvingEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP, OWNED_FEATURE_MEMBERSHIP_ESUPERSETS, OWNED_FEATURE_MEMBERSHIP_ESUBSETS, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY);
		}
		return ownedFeatureMembership;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedFeatureMembership() <em>Owned Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_FEATURE_MEMBERSHIP_ESUBSETS = new int[] {SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedFeatureMembership() <em>Owned Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_FEATURE_MEMBERSHIP_ESUPERSETS = new int[] {SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		if (eContainerFeatureID() != SysMLPackage.ASSOCIATION__OWNER) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Element newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, SysMLPackage.ASSOCIATION__OWNER, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (owningMembership != null && owningMembership != newOwner) {
				setOwningMembership(null);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Element newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.ASSOCIATION__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, SysMLPackage.ELEMENT__OWNED_ELEMENT, Element.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndFeatureMembership> getOwnedEndFeatureMembership() {
		if (ownedEndFeatureMembership == null) {
			ownedEndFeatureMembership = new SubsetSupersetEObjectWithInverseResolvingEList<EndFeatureMembership>(EndFeatureMembership.class, this, SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP, OWNED_END_FEATURE_MEMBERSHIP_ESUPERSETS, null, SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION);
		}
		return ownedEndFeatureMembership;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedEndFeatureMembership() <em>Owned End Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEndFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_END_FEATURE_MEMBERSHIP_ESUPERSETS = new int[] {SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getOwningConnector() {
		Connector owningConnector = basicGetOwningConnector();
		return owningConnector != null && owningConnector.eIsProxy() ? (Connector)eResolveProxy((InternalEObject)owningConnector) : owningConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetOwningConnector() {
		// TODO: implement this method to return the 'Owning Connector' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningConnector(Connector newOwningConnector) {
		// TODO: implement this method to set the 'Owning Connector' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeatureMembership()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Element)otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEndFeatureMembership()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP:
				return ((InternalEList<?>)getOwnedFeatureMembership()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNER:
				return basicSetOwner(null, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				return ((InternalEList<?>)getOwnedEndFeatureMembership()).basicRemove(otherEnd, msgs);
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
			case SysMLPackage.ASSOCIATION__OWNER:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_ELEMENT, Element.class, msgs);
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
			case SysMLPackage.ASSOCIATION__RELATED:
				return getRelated();
			case SysMLPackage.ASSOCIATION__TARGET:
				return getTarget();
			case SysMLPackage.ASSOCIATION__SOURCE:
				return getSource();
			case SysMLPackage.ASSOCIATION__RELATED_TYPE:
				return getRelatedType();
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				return getOwnedEndFeatureMembership();
			case SysMLPackage.ASSOCIATION__OWNING_CONNECTOR:
				if (resolve) return getOwningConnector();
				return basicGetOwningConnector();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.ASSOCIATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				getOwnedEndFeatureMembership().clear();
				getOwnedEndFeatureMembership().addAll((Collection<? extends EndFeatureMembership>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNING_CONNECTOR:
				setOwningConnector((Connector)newValue);
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
			case SysMLPackage.ASSOCIATION__TARGET:
				getTarget().clear();
				return;
			case SysMLPackage.ASSOCIATION__SOURCE:
				getSource().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				getOwnedEndFeatureMembership().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNING_CONNECTOR:
				setOwningConnector((Connector)null);
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
			case SysMLPackage.ASSOCIATION__RELATED:
				return isSetRelated();
			case SysMLPackage.ASSOCIATION__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.ASSOCIATION__SOURCE:
				return source != null && !source.isEmpty();
			case SysMLPackage.ASSOCIATION__RELATED_TYPE:
				return isSetRelatedType();
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP:
				return ownedFeatureMembership != null && !ownedFeatureMembership.isEmpty();
			case SysMLPackage.ASSOCIATION__OWNER:
				return getOwner() != null;
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				return ownedEndFeatureMembership != null && !ownedEndFeatureMembership.isEmpty();
			case SysMLPackage.ASSOCIATION__OWNING_CONNECTOR:
				return basicGetOwningConnector() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.ASSOCIATION__RELATED: return SysMLPackage.RELATIONSHIP__RELATED;
				case SysMLPackage.ASSOCIATION__TARGET: return SysMLPackage.RELATIONSHIP__TARGET;
				case SysMLPackage.ASSOCIATION__SOURCE: return SysMLPackage.RELATIONSHIP__SOURCE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case SysMLPackage.RELATIONSHIP__RELATED: return SysMLPackage.ASSOCIATION__RELATED;
				case SysMLPackage.RELATIONSHIP__TARGET: return SysMLPackage.ASSOCIATION__TARGET;
				case SysMLPackage.RELATIONSHIP__SOURCE: return SysMLPackage.ASSOCIATION__SOURCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelated() {
		@SuppressWarnings("unchecked")
		EList<Element> relatedType = (EList<Element>)((EList<?>)getRelatedType());
		return relatedType;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelated() <em>Related</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ESUBSETS = new int[] {SysMLPackage.ASSOCIATION__TARGET, SysMLPackage.ASSOCIATION__SOURCE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelated() {
  		return false;
	}

} //AssociationImpl
