/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Superclassing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuperclassingImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuperclassingImpl#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuperclassingImpl#getOwningClass <em>Owning Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperclassingImpl extends GeneralizationImpl implements Superclassing {
	/**
	 * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclass()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Class superclass;

	/**
	 * The cached value of the '{@link #getSubclass() <em>Subclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclass()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Class subclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperclassingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SUPERCLASSING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class getSuperclass() {
		if (superclass != null && superclass.eIsProxy()) {
			InternalEObject oldSuperclass = (InternalEObject)superclass;
			superclass = (org.omg.sysml.lang.sysml.Class)eResolveProxy(oldSuperclass);
			if (superclass != oldSuperclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUPERCLASSING__SUPERCLASS, oldSuperclass, superclass));
			}
		}
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class basicGetSuperclass() {
		return superclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperclass(org.omg.sysml.lang.sysml.Class newSuperclass) {
		org.omg.sysml.lang.sysml.Class oldSuperclass = superclass;
		superclass = newSuperclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUPERCLASSING__SUPERCLASS, oldSuperclass, superclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuperclass() {
		return superclass != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class getSubclass() {
		if (subclass != null && subclass.eIsProxy()) {
			InternalEObject oldSubclass = (InternalEObject)subclass;
			subclass = (org.omg.sysml.lang.sysml.Class)eResolveProxy(oldSubclass);
			if (subclass != oldSubclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUPERCLASSING__SUBCLASS, oldSubclass, subclass));
			}
		}
		return subclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class basicGetSubclass() {
		return subclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubclass(org.omg.sysml.lang.sysml.Class newSubclass) {
		org.omg.sysml.lang.sysml.Class oldSubclass = subclass;
		subclass = newSubclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUPERCLASSING__SUBCLASS, oldSubclass, subclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubclass() {
		return subclass != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class getOwningClass() {
		org.omg.sysml.lang.sysml.Class owningClass = basicGetOwningClass();
		return owningClass != null && owningClass.eIsProxy() ? (org.omg.sysml.lang.sysml.Class)eResolveProxy((InternalEObject)owningClass) : owningClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class basicGetOwningClass() {
		// TODO: implement this method to return the 'Owning Class' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningClass(org.omg.sysml.lang.sysml.Class newOwningClass) {
		// TODO: implement this method to set the 'Owning Class' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningClass() {
		return basicGetOwningClass() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SUPERCLASSING__SUPERCLASS:
				if (resolve) return getSuperclass();
				return basicGetSuperclass();
			case SysMLPackage.SUPERCLASSING__SUBCLASS:
				if (resolve) return getSubclass();
				return basicGetSubclass();
			case SysMLPackage.SUPERCLASSING__OWNING_CLASS:
				if (resolve) return getOwningClass();
				return basicGetOwningClass();
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
			case SysMLPackage.SUPERCLASSING__SUPERCLASS:
				setSuperclass((org.omg.sysml.lang.sysml.Class)newValue);
				return;
			case SysMLPackage.SUPERCLASSING__SUBCLASS:
				setSubclass((org.omg.sysml.lang.sysml.Class)newValue);
				return;
			case SysMLPackage.SUPERCLASSING__OWNING_CLASS:
				setOwningClass((org.omg.sysml.lang.sysml.Class)newValue);
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
			case SysMLPackage.SUPERCLASSING__SUPERCLASS:
				setSuperclass((org.omg.sysml.lang.sysml.Class)null);
				return;
			case SysMLPackage.SUPERCLASSING__SUBCLASS:
				setSubclass((org.omg.sysml.lang.sysml.Class)null);
				return;
			case SysMLPackage.SUPERCLASSING__OWNING_CLASS:
				setOwningClass((org.omg.sysml.lang.sysml.Class)null);
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
			case SysMLPackage.SUPERCLASSING__GENERAL:
				return isSetGeneral();
			case SysMLPackage.SUPERCLASSING__SPECIFIC:
				return isSetSpecific();
			case SysMLPackage.SUPERCLASSING__OWNING_CATEGORY:
				return isSetOwningCategory();
			case SysMLPackage.SUPERCLASSING__SUPERCLASS:
				return isSetSuperclass();
			case SysMLPackage.SUPERCLASSING__SUBCLASS:
				return isSetSubclass();
			case SysMLPackage.SUPERCLASSING__OWNING_CLASS:
				return isSetOwningClass();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getGeneral() {
		return getSuperclass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category basicGetGeneral() {
		return basicGetSuperclass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Category newGeneral) {
		if (newGeneral != null && !(newGeneral instanceof org.omg.sysml.lang.sysml.Class)) {
			throw new IllegalArgumentException("newGeneral must be an instance of org.omg.sysml.lang.sysml.Class");
		}
		setSuperclass((org.omg.sysml.lang.sysml.Class) newGeneral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGeneral() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getSpecific() {
		return getSubclass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category basicGetSpecific() {
		return basicGetSubclass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Category newSpecific) {
		if (newSpecific != null && !(newSpecific instanceof org.omg.sysml.lang.sysml.Class)) {
			throw new IllegalArgumentException("newSpecific must be an instance of org.omg.sysml.lang.sysml.Class");
		}
		setSubclass((org.omg.sysml.lang.sysml.Class) newSpecific);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecific() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getOwningCategory() {
		return getOwningClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category basicGetOwningCategory() {
		return basicGetOwningClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningCategory(Category newOwningCategory) {
		if (newOwningCategory != null && !(newOwningCategory instanceof org.omg.sysml.lang.sysml.Class)) {
			throw new IllegalArgumentException("newOwningCategory must be an instance of org.omg.sysml.lang.sysml.Class");
		}
		setOwningClass((org.omg.sysml.lang.sysml.Class) newOwningCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningCategory() {
  		return false;
	}

} //SuperclassingImpl
