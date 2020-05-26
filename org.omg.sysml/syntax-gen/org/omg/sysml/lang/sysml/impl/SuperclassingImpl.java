/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Superclassing</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuperclassingImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuperclassingImpl#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuperclassingImpl#getOwningClassifier <em>Owning Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperclassingImpl extends GeneralizationImpl implements Superclassing {
	/**
	 * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSuperclass()
	 * @generated
	 * @ordered
	 */
	protected Classifier superclass;

	/**
	 * The cached value of the '{@link #getSubclass() <em>Subclass</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubclass()
	 * @generated
	 * @ordered
	 */
	protected Classifier subclass;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperclassingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SUPERCLASSING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getSuperclass() {
		if (superclass != null && superclass.eIsProxy()) {
			InternalEObject oldSuperclass = (InternalEObject)superclass;
			superclass = (Classifier)eResolveProxy(oldSuperclass);
			if (superclass != oldSuperclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUPERCLASSING__SUPERCLASS, oldSuperclass, superclass));
			}
		}
		return superclass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetSuperclass() {
		return superclass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperclass(Classifier newSuperclass) {
		Classifier oldSuperclass = superclass;
		superclass = newSuperclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUPERCLASSING__SUPERCLASS, oldSuperclass, superclass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuperclass() {
		return superclass != null;
	}

	public org.omg.sysml.lang.sysml.Classifier getSubclass() {
		return subclass == null ? basicGetSubclass() : getSubclassGen();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSubclassGen() {
		if (subclass != null && subclass.eIsProxy()) {
			InternalEObject oldSubclass = (InternalEObject)subclass;
			subclass = (Classifier)eResolveProxy(oldSubclass);
			if (subclass != oldSubclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUPERCLASSING__SUBCLASS, oldSubclass, subclass));
			}
		}
		return subclass;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * If the Superclassing has a Classifier as its owner,
	 * the use this as the default value of the subclass property. 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public org.omg.sysml.lang.sysml.Classifier basicGetSubclass() {
		if (subclass == null) {
			Element owner = getOwningRelatedElement();
			if (owner instanceof Classifier) {
				subclass = (Classifier) owner;
			}
		}
		return subclass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubclass(Classifier newSubclass) {
		Classifier oldSubclass = subclass;
		subclass = newSubclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUPERCLASSING__SUBCLASS, oldSubclass, subclass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubclass() {
		return subclass != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getOwningClassifier() {
		Classifier owningClassifier = basicGetOwningClassifier();
		return owningClassifier != null && owningClassifier.eIsProxy() ? (Classifier)eResolveProxy((InternalEObject)owningClassifier) : owningClassifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public Classifier basicGetOwningClassifier() {
		Type owningType = super.basicGetOwningType();
		return owningType instanceof Classifier ? (org.omg.sysml.lang.sysml.Classifier) owningType : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	@Override
	public void setOwningClassifier(Classifier newOwningClassifier) {
		super.setOwningType(newOwningClassifier);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningClassifier() {
		return basicGetOwningClassifier() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case SysMLPackage.SUPERCLASSING__OWNING_CLASSIFIER:
				if (resolve) return getOwningClassifier();
				return basicGetOwningClassifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.SUPERCLASSING__SUPERCLASS:
				setSuperclass((Classifier)newValue);
				return;
			case SysMLPackage.SUPERCLASSING__SUBCLASS:
				setSubclass((Classifier)newValue);
				return;
			case SysMLPackage.SUPERCLASSING__OWNING_CLASSIFIER:
				setOwningClassifier((Classifier)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.SUPERCLASSING__SUPERCLASS:
				setSuperclass((Classifier)null);
				return;
			case SysMLPackage.SUPERCLASSING__SUBCLASS:
				setSubclass((Classifier)null);
				return;
			case SysMLPackage.SUPERCLASSING__OWNING_CLASSIFIER:
				setOwningClassifier((Classifier)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.SUPERCLASSING__GENERAL:
				return isSetGeneral();
			case SysMLPackage.SUPERCLASSING__SPECIFIC:
				return isSetSpecific();
			case SysMLPackage.SUPERCLASSING__OWNING_TYPE:
				return isSetOwningType();
			case SysMLPackage.SUPERCLASSING__SUPERCLASS:
				return isSetSuperclass();
			case SysMLPackage.SUPERCLASSING__SUBCLASS:
				return isSetSubclass();
			case SysMLPackage.SUPERCLASSING__OWNING_CLASSIFIER:
				return isSetOwningClassifier();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getGeneral() {
		return getSuperclass();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetGeneral() {
		return basicGetSuperclass();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Type newGeneral) {
		if (newGeneral != null && !(newGeneral instanceof Classifier)) {
			throw new IllegalArgumentException("newGeneral must be an instance of Classifier");
		}
		setSuperclass((Classifier) newGeneral);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGeneral() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getSpecific() {
		return getSubclass();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetSpecific() {
		return basicGetSubclass();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Type newSpecific) {
		if (newSpecific != null && !(newSpecific instanceof Classifier)) {
			throw new IllegalArgumentException("newSpecific must be an instance of Classifier");
		}
		setSubclass((Classifier) newSpecific);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecific() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		return getOwningClassifier();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetOwningType() {
		return basicGetOwningClassifier();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningType(Type newOwningType) {
		if (newOwningType != null && !(newOwningType instanceof Classifier)) {
			throw new IllegalArgumentException("newOwningType must be an instance of Classifier");
		}
		setOwningClassifier((Classifier) newOwningType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningType() {
  		return false;
	}

} // SuperclassingImpl
