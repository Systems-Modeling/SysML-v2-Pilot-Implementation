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

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Disjoining;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disjoining</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DisjoiningImpl#getDisjoiningType <em>Disjoining Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DisjoiningImpl#getTypeDisjoined <em>Type Disjoined</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisjoiningImpl extends RelationshipImpl implements Disjoining {
	/**
	 * The cached value of the '{@link #getDisjoiningType() <em>Disjoining Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjoiningType()
	 * @generated
	 * @ordered
	 */
	protected Type disjoiningType;

	/**
	 * The cached value of the '{@link #getTypeDisjoined() <em>Type Disjoined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDisjoined()
	 * @generated
	 * @ordered
	 */
	protected Type typeDisjoined;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisjoiningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.DISJOINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getDisjoiningType() {
		if (disjoiningType != null && disjoiningType.eIsProxy()) {
			InternalEObject oldDisjoiningType = (InternalEObject)disjoiningType;
			disjoiningType = (Type)eResolveProxy(oldDisjoiningType);
			if (disjoiningType != oldDisjoiningType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.DISJOINING__DISJOINING_TYPE, oldDisjoiningType, disjoiningType));
			}
		}
		return disjoiningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetDisjoiningType() {
		return disjoiningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisjoiningType(Type newDisjoiningType) {
		Type oldDisjoiningType = disjoiningType;
		disjoiningType = newDisjoiningType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.DISJOINING__DISJOINING_TYPE, oldDisjoiningType, disjoiningType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisjoiningType() {
		return disjoiningType != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getTypeDisjoined() {
		if (typeDisjoined != null && typeDisjoined.eIsProxy()) {
			InternalEObject oldTypeDisjoined = (InternalEObject)typeDisjoined;
			typeDisjoined = (Type)eResolveProxy(oldTypeDisjoined);
			if (typeDisjoined != oldTypeDisjoined) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.DISJOINING__TYPE_DISJOINED, oldTypeDisjoined, typeDisjoined));
			}
		}
		return typeDisjoined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetTypeDisjoined() {
		return typeDisjoined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDisjoined(Type newTypeDisjoined, NotificationChain msgs) {
		Type oldTypeDisjoined = typeDisjoined;
		typeDisjoined = newTypeDisjoined;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.DISJOINING__TYPE_DISJOINED, oldTypeDisjoined, newTypeDisjoined);
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
	public void setTypeDisjoined(Type newTypeDisjoined) {
		if (newTypeDisjoined != typeDisjoined) {
			NotificationChain msgs = null;
			if (typeDisjoined != null)
				msgs = ((InternalEObject)typeDisjoined).eInverseRemove(this, SysMLPackage.TYPE__DISJOINING_TYPE_DISJOINING, Type.class, msgs);
			if (newTypeDisjoined != null)
				msgs = ((InternalEObject)newTypeDisjoined).eInverseAdd(this, SysMLPackage.TYPE__DISJOINING_TYPE_DISJOINING, Type.class, msgs);
			msgs = basicSetTypeDisjoined(newTypeDisjoined, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.DISJOINING__TYPE_DISJOINED, newTypeDisjoined, newTypeDisjoined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDisjoined() {
		return typeDisjoined != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				if (typeDisjoined != null)
					msgs = ((InternalEObject)typeDisjoined).eInverseRemove(this, SysMLPackage.TYPE__DISJOINING_TYPE_DISJOINING, Type.class, msgs);
				return basicSetTypeDisjoined((Type)otherEnd, msgs);
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
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				return basicSetTypeDisjoined(null, msgs);
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
			case SysMLPackage.DISJOINING__DISJOINING_TYPE:
				if (resolve) return getDisjoiningType();
				return basicGetDisjoiningType();
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				if (resolve) return getTypeDisjoined();
				return basicGetTypeDisjoined();
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
			case SysMLPackage.DISJOINING__DISJOINING_TYPE:
				setDisjoiningType((Type)newValue);
				return;
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				setTypeDisjoined((Type)newValue);
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
			case SysMLPackage.DISJOINING__DISJOINING_TYPE:
				setDisjoiningType((Type)null);
				return;
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				setTypeDisjoined((Type)null);
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
			case SysMLPackage.DISJOINING__TARGET:
				return isSetTarget();
			case SysMLPackage.DISJOINING__SOURCE:
				return isSetSource();
			case SysMLPackage.DISJOINING__DISJOINING_TYPE:
				return isSetDisjoiningType();
			case SysMLPackage.DISJOINING__TYPE_DISJOINED:
				return isSetTypeDisjoined();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Type disjoiningType = getDisjoiningType();
		if (disjoiningType != null) {
			target.add(disjoiningType);
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
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Type typeDisjoined = getTypeDisjoined();
		if (typeDisjoined != null) {
			source.add(typeDisjoined);
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

} //DisjoiningImpl
