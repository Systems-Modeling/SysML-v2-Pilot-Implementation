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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjugation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugationImpl#getConjugatedType <em>Conjugated Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugationImpl#getOwnedRelatedElement_comp <em>Owned Related Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugationImpl#getOriginalType <em>Original Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugationImpl#getOwningType <em>Owning Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConjugationImpl extends RelationshipImpl implements Conjugation {
	/**
	 * The cached value of the '{@link #getConjugatedType() <em>Conjugated Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjugatedType()
	 * @generated
	 * @ordered
	 */
	protected Type conjugatedType;

	/**
	 * The cached value of the '{@link #getOriginalType() <em>Original Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalType()
	 * @generated
	 * @ordered
	 */
	protected Type originalType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjugationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONJUGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getConjugatedType() {
		if (conjugatedType != null && conjugatedType.eIsProxy()) {
			InternalEObject oldConjugatedType = (InternalEObject)conjugatedType;
			conjugatedType = (Type)eResolveProxy(oldConjugatedType);
			if (conjugatedType != oldConjugatedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONJUGATION__CONJUGATED_TYPE, oldConjugatedType, conjugatedType));
			}
		}
		return conjugatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetConjugatedType() {
		return conjugatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConjugatedType(Type newConjugatedType, NotificationChain msgs) {
		Type oldConjugatedType = conjugatedType;
		conjugatedType = newConjugatedType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONJUGATION__CONJUGATED_TYPE, oldConjugatedType, newConjugatedType);
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
	public void setConjugatedType(Type newConjugatedType) {
		if (newConjugatedType != conjugatedType) {
			NotificationChain msgs = null;
			if (conjugatedType != null)
				msgs = ((InternalEObject)conjugatedType).eInverseRemove(this, SysMLPackage.TYPE__CONJUGATOR, Type.class, msgs);
			if (newConjugatedType != null)
				msgs = ((InternalEObject)newConjugatedType).eInverseAdd(this, SysMLPackage.TYPE__CONJUGATOR, Type.class, msgs);
			msgs = basicSetConjugatedType(newConjugatedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONJUGATION__CONJUGATED_TYPE, newConjugatedType, newConjugatedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConjugatedType() {
		return conjugatedType != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement_comp() {
		if (ownedRelatedElement_comp == null) {
			ownedRelatedElement_comp = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.CONJUGATION__OWNED_RELATED_ELEMENT_COMP, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOriginalType() {
		if (originalType != null && originalType.eIsProxy()) {
			InternalEObject oldOriginalType = (InternalEObject)originalType;
			originalType = (Type)eResolveProxy(oldOriginalType);
			if (originalType != oldOriginalType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONJUGATION__ORIGINAL_TYPE, oldOriginalType, originalType));
			}
		}
		return originalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetOriginalType() {
		return originalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalType(Type newOriginalType) {
		Type oldOriginalType = originalType;
		originalType = newOriginalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONJUGATION__ORIGINAL_TYPE, oldOriginalType, originalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOriginalType() {
		return originalType != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		Type owningType = basicGetOwningType();
		return owningType != null && owningType.eIsProxy() ? (Type)eResolveProxy((InternalEObject)owningType) : owningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetOwningType() {
		Element owner = getOwner();
		return owner instanceof Type? (Type)owner: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningType(Type newOwningType) {
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
			case SysMLPackage.CONJUGATION__CONJUGATED_TYPE:
				if (conjugatedType != null)
					msgs = ((InternalEObject)conjugatedType).eInverseRemove(this, SysMLPackage.TYPE__CONJUGATOR, Type.class, msgs);
				return basicSetConjugatedType((Type)otherEnd, msgs);
			case SysMLPackage.CONJUGATION__OWNED_RELATED_ELEMENT_COMP:
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
			case SysMLPackage.CONJUGATION__CONJUGATED_TYPE:
				return basicSetConjugatedType(null, msgs);
			case SysMLPackage.CONJUGATION__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<?>)getOwnedRelatedElement_comp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONJUGATION__CONJUGATED_TYPE:
				if (resolve) return getConjugatedType();
				return basicGetConjugatedType();
			case SysMLPackage.CONJUGATION__ORIGINAL_TYPE:
				if (resolve) return getOriginalType();
				return basicGetOriginalType();
			case SysMLPackage.CONJUGATION__OWNING_TYPE:
				if (resolve) return getOwningType();
				return basicGetOwningType();
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
			case SysMLPackage.CONJUGATION__CONJUGATED_TYPE:
				setConjugatedType((Type)newValue);
				return;
			case SysMLPackage.CONJUGATION__ORIGINAL_TYPE:
				setOriginalType((Type)newValue);
				return;
			case SysMLPackage.CONJUGATION__OWNING_TYPE:
				setOwningType((Type)newValue);
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
			case SysMLPackage.CONJUGATION__CONJUGATED_TYPE:
				setConjugatedType((Type)null);
				return;
			case SysMLPackage.CONJUGATION__ORIGINAL_TYPE:
				setOriginalType((Type)null);
				return;
			case SysMLPackage.CONJUGATION__OWNING_TYPE:
				setOwningType((Type)null);
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
			case SysMLPackage.CONJUGATION__CONJUGATED_TYPE:
				return isSetConjugatedType();
			case SysMLPackage.CONJUGATION__OWNED_RELATED_ELEMENT_COMP:
				return ownedRelatedElement_comp != null && !ownedRelatedElement_comp.isEmpty();
			case SysMLPackage.CONJUGATION__TARGET:
				return isSetTarget();
			case SysMLPackage.CONJUGATION__SOURCE:
				return isSetSource();
			case SysMLPackage.CONJUGATION__ORIGINAL_TYPE:
				return isSetOriginalType();
			case SysMLPackage.CONJUGATION__OWNING_TYPE:
				return basicGetOwningType() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Type originalType = getOriginalType();
		if (originalType != null) {
			target.add(originalType);
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
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Type conjugatedType = getConjugatedType();
		if (conjugatedType != null) {
			source.add(conjugatedType);
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

} //ConjugationImpl
