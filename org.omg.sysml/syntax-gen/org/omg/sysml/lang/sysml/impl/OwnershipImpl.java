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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Ownership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ownership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OwnershipImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OwnershipImpl#getOwnedRelatedElement_comp <em>Owned Related Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OwnershipImpl#getOwningSource <em>Owning Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OwnershipImpl#getOwnedTarget_comp <em>Owned Target comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OwnershipImpl#getOwnedTarget <em>Owned Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OwnershipImpl extends RelationshipImpl implements Ownership {
	/**
	 * The cached value of the '{@link #getOwningSource() <em>Owning Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningSource()
	 * @generated
	 * @ordered
	 */
	protected Element owningSource;

	/**
	 * The cached value of the '{@link #getOwnedTarget_comp() <em>Owned Target comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTarget_comp()
	 * @generated
	 * @ordered
	 */
	protected Element ownedTarget_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwnershipImpl() {
		super();
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Element owningSource = getOwningSource();
		if (owningSource != null) {
			source.add(owningSource);
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
		Element ownedTarget_comp = getOwnedTarget_comp();
		if (ownedTarget_comp != null) {
			target.add(ownedTarget_comp);
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
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.OWNERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.OWNERSHIP__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.OWNERSHIP__OWNING_RELATED_ELEMENT, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (owningSource != null && owningSource != newOwningRelatedElement) {
				setOwningSource(null);
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
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.OWNERSHIP__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.OWNERSHIP__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement_comp() {
		if (ownedRelatedElement_comp == null) {
			ownedRelatedElement_comp = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.OWNERSHIP__OWNED_RELATED_ELEMENT_COMP, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningSource() {
		if (owningSource != null && owningSource.eIsProxy()) {
			InternalEObject oldOwningSource = (InternalEObject)owningSource;
			owningSource = (Element)eResolveProxy(oldOwningSource);
			if (owningSource != oldOwningSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.OWNERSHIP__OWNING_SOURCE, oldOwningSource, owningSource));
			}
		}
		return owningSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwningSource() {
		return owningSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningSource(Element newOwningSource) {
		Element oldOwningSource = owningSource;
		owningSource = newOwningSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.OWNERSHIP__OWNING_SOURCE, oldOwningSource, owningSource));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningSource != null) {
				Element owningRelatedElement = getOwningRelatedElement();
				if (newOwningSource != owningRelatedElement) {
					setOwningRelatedElement(newOwningSource);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningSource() {
		return owningSource != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwnedTarget_comp() {
		return ownedTarget_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTarget_comp(Element newOwnedTarget_comp, NotificationChain msgs) {
		Element oldOwnedTarget_comp = ownedTarget_comp;
		ownedTarget_comp = newOwnedTarget_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.OWNERSHIP__OWNED_TARGET_COMP, oldOwnedTarget_comp, newOwnedTarget_comp);
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
	public void setOwnedTarget_comp(Element newOwnedTarget_comp) {
		if (newOwnedTarget_comp != ownedTarget_comp) {
			NotificationChain msgs = null;
			if (ownedTarget_comp != null)
				msgs = ((InternalEObject)ownedTarget_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.OWNERSHIP__OWNED_TARGET_COMP, null, msgs);
			if (newOwnedTarget_comp != null)
				msgs = ((InternalEObject)newOwnedTarget_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.OWNERSHIP__OWNED_TARGET_COMP, null, msgs);
			msgs = basicSetOwnedTarget_comp(newOwnedTarget_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.OWNERSHIP__OWNED_TARGET_COMP, newOwnedTarget_comp, newOwnedTarget_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedTarget_comp() {
		return ownedTarget_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwnedTarget() {
		Element ownedTarget = basicGetOwnedTarget();
		return ownedTarget != null && ownedTarget.eIsProxy() ? (Element)eResolveProxy((InternalEObject)ownedTarget) : ownedTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetOwnedTarget() {
		return getOwnedTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedTarget(Element newOwnedTarget) {
		throw new UnsupportedOperationException();
	}

	// Additional subsets
	
	@Override
	public EList<Element> getOwnedRelatedElement() {
		EList<Element> relatedElements = super.getOwnedRelatedElement();
		relatedElements.add(getOwnedTarget());
		return relatedElements;
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.OWNERSHIP__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
			case SysMLPackage.OWNERSHIP__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement_comp()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.OWNERSHIP__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
			case SysMLPackage.OWNERSHIP__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<?>)getOwnedRelatedElement_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.OWNERSHIP__OWNED_TARGET_COMP:
				return basicSetOwnedTarget_comp(null, msgs);
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
			case SysMLPackage.OWNERSHIP__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.OWNERSHIP__OWNING_SOURCE:
				if (resolve) return getOwningSource();
				return basicGetOwningSource();
			case SysMLPackage.OWNERSHIP__OWNED_TARGET_COMP:
				return getOwnedTarget_comp();
			case SysMLPackage.OWNERSHIP__OWNED_TARGET:
				if (resolve) return getOwnedTarget();
				return basicGetOwnedTarget();
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
			case SysMLPackage.OWNERSHIP__OWNING_SOURCE:
				setOwningSource((Element)newValue);
				return;
			case SysMLPackage.OWNERSHIP__OWNED_TARGET_COMP:
				setOwnedTarget_comp((Element)newValue);
				return;
			case SysMLPackage.OWNERSHIP__OWNED_TARGET:
				setOwnedTarget((Element)newValue);
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
			case SysMLPackage.OWNERSHIP__OWNING_SOURCE:
				setOwningSource((Element)null);
				return;
			case SysMLPackage.OWNERSHIP__OWNED_TARGET_COMP:
				setOwnedTarget_comp((Element)null);
				return;
			case SysMLPackage.OWNERSHIP__OWNED_TARGET:
				setOwnedTarget((Element)null);
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
			case SysMLPackage.OWNERSHIP__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.OWNERSHIP__OWNED_RELATED_ELEMENT_COMP:
				return ownedRelatedElement_comp != null && !ownedRelatedElement_comp.isEmpty();
			case SysMLPackage.OWNERSHIP__SOURCE:
				return isSetSource();
			case SysMLPackage.OWNERSHIP__TARGET:
				return isSetTarget();
			case SysMLPackage.OWNERSHIP__OWNING_SOURCE:
				return isSetOwningSource();
			case SysMLPackage.OWNERSHIP__OWNED_TARGET_COMP:
				return isSetOwnedTarget_comp();
			case SysMLPackage.OWNERSHIP__OWNED_TARGET:
				return basicGetOwnedTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //OwnershipImpl
