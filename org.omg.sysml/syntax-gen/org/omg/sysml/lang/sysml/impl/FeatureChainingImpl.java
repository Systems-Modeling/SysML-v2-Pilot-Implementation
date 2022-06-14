/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Chaining</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureChainingImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureChainingImpl#getChainingFeature <em>Chaining Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureChainingImpl#getFeatureChained <em>Feature Chained</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureChainingImpl extends RelationshipImpl implements FeatureChaining {
	/**
	 * The cached value of the '{@link #getChainingFeature() <em>Chaining Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainingFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature chainingFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureChainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_CHAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getChainingFeature() {
		if (chainingFeature != null && chainingFeature.eIsProxy()) {
			InternalEObject oldChainingFeature = (InternalEObject)chainingFeature;
			chainingFeature = (Feature)eResolveProxy(oldChainingFeature);
			if (chainingFeature != oldChainingFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_CHAINING__CHAINING_FEATURE, oldChainingFeature, chainingFeature));
			}
		}
		return chainingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetChainingFeature() {
		return chainingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChainingFeature(Feature newChainingFeature) {
		Feature oldChainingFeature = chainingFeature;
		chainingFeature = newChainingFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_CHAINING__CHAINING_FEATURE, oldChainingFeature, chainingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChainingFeature() {
		return chainingFeature != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getFeatureChained() {
		Feature featureChained = basicGetFeatureChained();
		return featureChained != null && featureChained.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)featureChained) : featureChained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetFeatureChained() {
		Element owningRelatedElement = getOwningRelatedElement();
		return owningRelatedElement instanceof Feature? (Feature)owningRelatedElement: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setFeatureChained(Feature newFeatureChained) {
		super.basicSetOwningRelatedElement(newFeatureChained, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureChained() {
		return basicGetFeatureChained() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Feature chainingFeature = getChainingFeature();
		if (chainingFeature != null) {
			target.add(chainingFeature);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__TARGET, target.size(), target.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTarget() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.FEATURE_CHAINING__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Feature featureChained = getFeatureChained();
		if (featureChained != null) {
			source.add(featureChained);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__SOURCE, source.size(), source.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.FEATURE_CHAINING__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.FEATURE_CHAINING__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRelatedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRelatedElement != null)
				msgs = ((InternalEObject)newOwningRelatedElement).eInverseAdd(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
			msgs = basicSetOwningRelatedElement(newOwningRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_CHAINING__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE_CHAINING__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
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
			case SysMLPackage.FEATURE_CHAINING__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
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
			case SysMLPackage.FEATURE_CHAINING__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
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
			case SysMLPackage.FEATURE_CHAINING__CHAINING_FEATURE:
				if (resolve) return getChainingFeature();
				return basicGetChainingFeature();
			case SysMLPackage.FEATURE_CHAINING__FEATURE_CHAINED:
				if (resolve) return getFeatureChained();
				return basicGetFeatureChained();
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
			case SysMLPackage.FEATURE_CHAINING__CHAINING_FEATURE:
				setChainingFeature((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_CHAINING__FEATURE_CHAINED:
				setFeatureChained((Feature)newValue);
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
			case SysMLPackage.FEATURE_CHAINING__CHAINING_FEATURE:
				setChainingFeature((Feature)null);
				return;
			case SysMLPackage.FEATURE_CHAINING__FEATURE_CHAINED:
				setFeatureChained((Feature)null);
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
			case SysMLPackage.FEATURE_CHAINING__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.FEATURE_CHAINING__TARGET:
				return isSetTarget();
			case SysMLPackage.FEATURE_CHAINING__SOURCE:
				return isSetSource();
			case SysMLPackage.FEATURE_CHAINING__CHAINING_FEATURE:
				return isSetChainingFeature();
			case SysMLPackage.FEATURE_CHAINING__FEATURE_CHAINED:
				return isSetFeatureChained();
		}
		return super.eIsSet(featureID);
	}

} //FeatureChainingImpl
