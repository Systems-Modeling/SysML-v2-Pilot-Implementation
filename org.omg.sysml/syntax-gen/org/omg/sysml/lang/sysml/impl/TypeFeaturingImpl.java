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
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Featuring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeFeaturingImpl#getFeatureOfType <em>Feature Of Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeFeaturingImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeFeaturingImpl#getFeaturingType <em>Featuring Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeFeaturingImpl#getOwningFeatureOfType <em>Owning Feature Of Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeFeaturingImpl extends RelationshipImpl implements TypeFeaturing {
	/**
	 * The cached value of the '{@link #getFeatureOfType() <em>Feature Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfType()
	 * @generated
	 * @ordered
	 */
	protected Feature featureOfType;

	/**
	 * The cached value of the '{@link #getFeaturingType() <em>Featuring Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingType()
	 * @generated
	 * @ordered
	 */
	protected Type featuringType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeFeaturingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TYPE_FEATURING;
	}
	
	@Override
	public Feature getFeatureOfType() {
		return featureOfType == null? basicGetFeatureOfType(): getFeatureOfTypeGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeatureOfTypeGen() {
		if (featureOfType != null && featureOfType.eIsProxy()) {
			InternalEObject oldFeatureOfType = (InternalEObject)featureOfType;
			featureOfType = (Feature)eResolveProxy(oldFeatureOfType);
			if (featureOfType != oldFeatureOfType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.TYPE_FEATURING__FEATURE_OF_TYPE, oldFeatureOfType, featureOfType));
			}
		}
		return featureOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * If the TypeFeaturing has a Feature as its owningRelatedElement, then use this as the default value for its featureOfType property.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetFeatureOfType() {
		if (featureOfType == null) {
			Element owner = getOwningRelatedElement();
			if (owner instanceof Feature) {
				featureOfType = (Feature)owner;
			}
		}
		return featureOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureOfType(Feature newFeatureOfType) {
		Feature oldFeatureOfType = featureOfType;
		featureOfType = newFeatureOfType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.TYPE_FEATURING__FEATURE_OF_TYPE, oldFeatureOfType, featureOfType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureOfType() {
		return featureOfType != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getFeaturingType() {
		if (featuringType != null && featuringType.eIsProxy()) {
			InternalEObject oldFeaturingType = (InternalEObject)featuringType;
			featuringType = (Type)eResolveProxy(oldFeaturingType);
			if (featuringType != oldFeaturingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.TYPE_FEATURING__FEATURING_TYPE, oldFeaturingType, featuringType));
			}
		}
		return featuringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetFeaturingType() {
		return featuringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeaturingType(Type newFeaturingType) {
		Type oldFeaturingType = featuringType;
		featuringType = newFeaturingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.TYPE_FEATURING__FEATURING_TYPE, oldFeaturingType, featuringType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeaturingType() {
		return featuringType != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwningFeatureOfType() {
		Feature owningFeatureOfType = basicGetOwningFeatureOfType();
		return owningFeatureOfType != null && owningFeatureOfType.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)owningFeatureOfType) : owningFeatureOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetOwningFeatureOfType() {
		Element owner = super.getOwningRelatedElement();
		return owner instanceof Feature? (Feature)owner: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningFeatureOfType(Feature newOwningFeatureOfType) {
		if (getFeatureOfType() != newOwningFeatureOfType) {
			setFeatureOfType(newOwningFeatureOfType);
		}
		setOwningRelatedElement(newOwningFeatureOfType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.TYPE_FEATURING__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.TYPE_FEATURING__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.TYPE_FEATURING__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP, Element.class, msgs);
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
			case SysMLPackage.TYPE_FEATURING__FEATURE_OF_TYPE:
				if (resolve) return getFeatureOfType();
				return basicGetFeatureOfType();
			case SysMLPackage.TYPE_FEATURING__FEATURING_TYPE:
				if (resolve) return getFeaturingType();
				return basicGetFeaturingType();
			case SysMLPackage.TYPE_FEATURING__OWNING_FEATURE_OF_TYPE:
				if (resolve) return getOwningFeatureOfType();
				return basicGetOwningFeatureOfType();
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
			case SysMLPackage.TYPE_FEATURING__FEATURE_OF_TYPE:
				setFeatureOfType((Feature)newValue);
				return;
			case SysMLPackage.TYPE_FEATURING__FEATURING_TYPE:
				setFeaturingType((Type)newValue);
				return;
			case SysMLPackage.TYPE_FEATURING__OWNING_FEATURE_OF_TYPE:
				setOwningFeatureOfType((Feature)newValue);
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
			case SysMLPackage.TYPE_FEATURING__FEATURE_OF_TYPE:
				setFeatureOfType((Feature)null);
				return;
			case SysMLPackage.TYPE_FEATURING__FEATURING_TYPE:
				setFeaturingType((Type)null);
				return;
			case SysMLPackage.TYPE_FEATURING__OWNING_FEATURE_OF_TYPE:
				setOwningFeatureOfType((Feature)null);
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
			case SysMLPackage.TYPE_FEATURING__FEATURE_OF_TYPE:
				return isSetFeatureOfType();
			case SysMLPackage.TYPE_FEATURING__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.TYPE_FEATURING__SOURCE:
				return isSetSource();
			case SysMLPackage.TYPE_FEATURING__TARGET:
				return isSetTarget();
			case SysMLPackage.TYPE_FEATURING__FEATURING_TYPE:
				return isSetFeaturingType();
			case SysMLPackage.TYPE_FEATURING__OWNING_FEATURE_OF_TYPE:
				return basicGetOwningFeatureOfType() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Feature featureOfType = getFeatureOfType();
		if (featureOfType != null) {
			source.add(featureOfType);
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
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Type featuringType = getFeaturingType();
		if (featuringType != null) {
			target.add(featuringType);
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
		if (eContainerFeatureID() != SysMLPackage.TYPE_FEATURING__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}
	
	@Override
	public void transform() {
		((ElementImpl)getFeatureOfType()).transform();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.TYPE_FEATURING__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.TYPE_FEATURING__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRelatedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRelatedElement != null)
				msgs = ((InternalEObject)newOwningRelatedElement).eInverseAdd(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP, Element.class, msgs);
			msgs = basicSetOwningRelatedElement(newOwningRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.TYPE_FEATURING__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

} //TypeFeaturingImpl
