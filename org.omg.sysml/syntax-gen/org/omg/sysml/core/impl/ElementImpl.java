/**
 */
package org.omg.sysml.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.core.CorePackage;
import org.omg.sysml.core.Element;

import org.omg.sysml.groups.ElementGroup;
import org.omg.sysml.groups.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.core.impl.ElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.sysml.core.impl.ElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.core.impl.ElementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.omg.sysml.core.impl.ElementImpl#getOwningGroup <em>Owning Group</em>}</li>
 *   <li>{@link org.omg.sysml.core.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.core.impl.ElementImpl#getOwningNamespace <em>Owning Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> ownedElement;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwningGroup() <em>Owning Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningGroup()
	 * @generated
	 * @ordered
	 */
	protected ElementGroup owningGroup;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwningNamespace() <em>Owning Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace owningNamespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getOwnedElement() {
		if (ownedElement == null) {
			ownedElement = new EObjectContainmentWithInverseEList<Element>(Element.class, this, CorePackage.ELEMENT__OWNED_ELEMENT, CorePackage.ELEMENT__OWNER);
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		if (eContainerFeatureID() != CorePackage.ELEMENT__OWNER) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Element newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, CorePackage.ELEMENT__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Element newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != CorePackage.ELEMENT__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, CorePackage.ELEMENT__OWNED_ELEMENT, Element.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENT__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroup getOwningGroup() {
		if (owningGroup != null && owningGroup.eIsProxy()) {
			InternalEObject oldOwningGroup = (InternalEObject)owningGroup;
			owningGroup = (ElementGroup)eResolveProxy(oldOwningGroup);
			if (owningGroup != oldOwningGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ELEMENT__OWNING_GROUP, oldOwningGroup, owningGroup));
			}
		}
		return owningGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroup basicGetOwningGroup() {
		return owningGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningGroup(ElementGroup newOwningGroup) {
		ElementGroup oldOwningGroup = owningGroup;
		owningGroup = newOwningGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENT__OWNING_GROUP, oldOwningGroup, owningGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getOwningNamespace() {
		if (owningNamespace != null && owningNamespace.eIsProxy()) {
			InternalEObject oldOwningNamespace = (InternalEObject)owningNamespace;
			owningNamespace = (Namespace)eResolveProxy(oldOwningNamespace);
			if (owningNamespace != oldOwningNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ELEMENT__OWNING_NAMESPACE, oldOwningNamespace, owningNamespace));
			}
		}
		return owningNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetOwningNamespace() {
		return owningNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningNamespace(Namespace newOwningNamespace) {
		Namespace oldOwningNamespace = owningNamespace;
		owningNamespace = newOwningNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENT__OWNING_NAMESPACE, oldOwningNamespace, owningNamespace));
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
			case CorePackage.ELEMENT__OWNED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedElement()).basicAdd(otherEnd, msgs);
			case CorePackage.ELEMENT__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Element)otherEnd, msgs);
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
			case CorePackage.ELEMENT__OWNED_ELEMENT:
				return ((InternalEList<?>)getOwnedElement()).basicRemove(otherEnd, msgs);
			case CorePackage.ELEMENT__OWNER:
				return basicSetOwner(null, msgs);
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
			case CorePackage.ELEMENT__OWNER:
				return eInternalContainer().eInverseRemove(this, CorePackage.ELEMENT__OWNED_ELEMENT, Element.class, msgs);
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
			case CorePackage.ELEMENT__OWNED_ELEMENT:
				return getOwnedElement();
			case CorePackage.ELEMENT__OWNER:
				return getOwner();
			case CorePackage.ELEMENT__IDENTIFIER:
				return getIdentifier();
			case CorePackage.ELEMENT__OWNING_GROUP:
				if (resolve) return getOwningGroup();
				return basicGetOwningGroup();
			case CorePackage.ELEMENT__NAME:
				return getName();
			case CorePackage.ELEMENT__OWNING_NAMESPACE:
				if (resolve) return getOwningNamespace();
				return basicGetOwningNamespace();
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
			case CorePackage.ELEMENT__OWNED_ELEMENT:
				getOwnedElement().clear();
				getOwnedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case CorePackage.ELEMENT__OWNER:
				setOwner((Element)newValue);
				return;
			case CorePackage.ELEMENT__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case CorePackage.ELEMENT__OWNING_GROUP:
				setOwningGroup((ElementGroup)newValue);
				return;
			case CorePackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case CorePackage.ELEMENT__OWNING_NAMESPACE:
				setOwningNamespace((Namespace)newValue);
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
			case CorePackage.ELEMENT__OWNED_ELEMENT:
				getOwnedElement().clear();
				return;
			case CorePackage.ELEMENT__OWNER:
				setOwner((Element)null);
				return;
			case CorePackage.ELEMENT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case CorePackage.ELEMENT__OWNING_GROUP:
				setOwningGroup((ElementGroup)null);
				return;
			case CorePackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.ELEMENT__OWNING_NAMESPACE:
				setOwningNamespace((Namespace)null);
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
			case CorePackage.ELEMENT__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
			case CorePackage.ELEMENT__OWNER:
				return getOwner() != null;
			case CorePackage.ELEMENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case CorePackage.ELEMENT__OWNING_GROUP:
				return owningGroup != null;
			case CorePackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.ELEMENT__OWNING_NAMESPACE:
				return owningNamespace != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
