/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RelationshipImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RelationshipImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RelationshipImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends ElementImpl implements Relationship {
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
	 * The cached value of the '{@link #getOwnedRelatedElement() <em>Owned Related Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> ownedRelatedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getRelatedElement() {
		return new DerivedUnionEObjectEList<Element>(Element.class, this, SysMLPackage.RELATIONSHIP__RELATED_ELEMENT, RELATED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElement() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] {SysMLPackage.RELATIONSHIP__TARGET, SysMLPackage.RELATIONSHIP__SOURCE, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT, SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		if (ownedRelatedElement == null) {
			ownedRelatedElement = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.RELATIONSHIP__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.RELATIONSHIP__SOURCE);
		}
		return source;
	}
	
	// Utility
	
	public <T> T getOwningRelatedElement(Class<T> class_) {
		return cast(getOwningRelatedElement(), class_);
	}
	
	public <T> EList<T> getOwnedRelatedElement(Class<T> class_) {
		return filter(getOwnedRelatedElement(), class_);
	}
	
	public Element getFirstOwnedRelatedElement() {
		return getOwnedRelatedElement().stream().findFirst().orElse(null);
	}
	
	public <T> T getOwnedRelatedElement(Class<T> class_, int n) {
		List<T> relatedElements = filter(getOwnedRelatedElement(), class_);
		return relatedElements.size() <= n? null: (T)relatedElements.get(n);
	}
	
	public <T> T getFirstOwnedRelatedElement(Class<T> class_) {
		return getOwnedRelatedElement(class_, 0);
	}
	
	public <T> T getSecondOwnedRelatedElement(Class<T> class_) {
		return getOwnedRelatedElement(class_, 1);
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
			case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
			case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
			case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT:
				return ((InternalEList<?>)getOwnedRelatedElement()).basicRemove(otherEnd, msgs);
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
			case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT:
				return getRelatedElement();
			case SysMLPackage.RELATIONSHIP__TARGET:
				return getTarget();
			case SysMLPackage.RELATIONSHIP__SOURCE:
				return getSource();
			case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement();
			case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT:
				return getOwnedRelatedElement();
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
			case SysMLPackage.RELATIONSHIP__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.RELATIONSHIP__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)newValue);
				return;
			case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				getOwnedRelatedElement().addAll((Collection<? extends Element>)newValue);
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
			case SysMLPackage.RELATIONSHIP__TARGET:
				getTarget().clear();
				return;
			case SysMLPackage.RELATIONSHIP__SOURCE:
				getSource().clear();
				return;
			case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)null);
				return;
			case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
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
			case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT:
				return isSetRelatedElement();
			case SysMLPackage.RELATIONSHIP__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.RELATIONSHIP__SOURCE:
				return source != null && !source.isEmpty();
			case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElement() {
		return eIsSet(SysMLPackage.RELATIONSHIP__TARGET)
			|| eIsSet(SysMLPackage.RELATIONSHIP__SOURCE)
			|| eIsSet(SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT)
			|| eIsSet(SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT);
	}

} //RelationshipImpl
