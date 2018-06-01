/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl#getOwningGeneralization <em>Owning Generalization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends RelationshipImpl implements Generalization {
	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Class general;

	/**
	 * The cached value of the '{@link #getSpecific() <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecific()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Class specific;

	/**
	 * The cached value of the '{@link #getOwningGeneralization() <em>Owning Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningGeneralization()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Class owningGeneralization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class getGeneral() {
		if (general != null && general.eIsProxy()) {
			InternalEObject oldGeneral = (InternalEObject)general;
			general = (org.omg.sysml.lang.sysml.Class)eResolveProxy(oldGeneral);
			if (general != oldGeneral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.GENERALIZATION__GENERAL, oldGeneral, general));
			}
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class basicGetGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(org.omg.sysml.lang.sysml.Class newGeneral) {
		org.omg.sysml.lang.sysml.Class oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.GENERALIZATION__GENERAL, oldGeneral, general));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class getSpecific() {
		if (specific != null && specific.eIsProxy()) {
			InternalEObject oldSpecific = (InternalEObject)specific;
			specific = (org.omg.sysml.lang.sysml.Class)eResolveProxy(oldSpecific);
			if (specific != oldSpecific) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.GENERALIZATION__SPECIFIC, oldSpecific, specific));
			}
		}
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class basicGetSpecific() {
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(org.omg.sysml.lang.sysml.Class newSpecific) {
		org.omg.sysml.lang.sysml.Class oldSpecific = specific;
		specific = newSpecific;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.GENERALIZATION__SPECIFIC, oldSpecific, specific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class getOwningGeneralization() {
		if (owningGeneralization != null && owningGeneralization.eIsProxy()) {
			InternalEObject oldOwningGeneralization = (InternalEObject)owningGeneralization;
			owningGeneralization = (org.omg.sysml.lang.sysml.Class)eResolveProxy(oldOwningGeneralization);
			if (owningGeneralization != oldOwningGeneralization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.GENERALIZATION__OWNING_GENERALIZATION, oldOwningGeneralization, owningGeneralization));
			}
		}
		return owningGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class basicGetOwningGeneralization() {
		return owningGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningGeneralization(org.omg.sysml.lang.sysml.Class newOwningGeneralization, NotificationChain msgs) {
		org.omg.sysml.lang.sysml.Class oldOwningGeneralization = owningGeneralization;
		owningGeneralization = newOwningGeneralization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.GENERALIZATION__OWNING_GENERALIZATION, oldOwningGeneralization, newOwningGeneralization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningGeneralization(org.omg.sysml.lang.sysml.Class newOwningGeneralization) {
		if (newOwningGeneralization != owningGeneralization) {
			NotificationChain msgs = null;
			if (owningGeneralization != null)
				msgs = ((InternalEObject)owningGeneralization).eInverseRemove(this, SysMLPackage.CLASS__OWNED_GENERALIZATION, org.omg.sysml.lang.sysml.Class.class, msgs);
			if (newOwningGeneralization != null)
				msgs = ((InternalEObject)newOwningGeneralization).eInverseAdd(this, SysMLPackage.CLASS__OWNED_GENERALIZATION, org.omg.sysml.lang.sysml.Class.class, msgs);
			msgs = basicSetOwningGeneralization(newOwningGeneralization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.GENERALIZATION__OWNING_GENERALIZATION, newOwningGeneralization, newOwningGeneralization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.GENERALIZATION__OWNING_GENERALIZATION:
				if (owningGeneralization != null)
					msgs = ((InternalEObject)owningGeneralization).eInverseRemove(this, SysMLPackage.CLASS__OWNED_GENERALIZATION, org.omg.sysml.lang.sysml.Class.class, msgs);
				return basicSetOwningGeneralization((org.omg.sysml.lang.sysml.Class)otherEnd, msgs);
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
			case SysMLPackage.GENERALIZATION__OWNING_GENERALIZATION:
				return basicSetOwningGeneralization(null, msgs);
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
			case SysMLPackage.GENERALIZATION__GENERAL:
				if (resolve) return getGeneral();
				return basicGetGeneral();
			case SysMLPackage.GENERALIZATION__SPECIFIC:
				if (resolve) return getSpecific();
				return basicGetSpecific();
			case SysMLPackage.GENERALIZATION__OWNING_GENERALIZATION:
				if (resolve) return getOwningGeneralization();
				return basicGetOwningGeneralization();
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
			case SysMLPackage.GENERALIZATION__GENERAL:
				setGeneral((org.omg.sysml.lang.sysml.Class)newValue);
				return;
			case SysMLPackage.GENERALIZATION__SPECIFIC:
				setSpecific((org.omg.sysml.lang.sysml.Class)newValue);
				return;
			case SysMLPackage.GENERALIZATION__OWNING_GENERALIZATION:
				setOwningGeneralization((org.omg.sysml.lang.sysml.Class)newValue);
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
			case SysMLPackage.GENERALIZATION__GENERAL:
				setGeneral((org.omg.sysml.lang.sysml.Class)null);
				return;
			case SysMLPackage.GENERALIZATION__SPECIFIC:
				setSpecific((org.omg.sysml.lang.sysml.Class)null);
				return;
			case SysMLPackage.GENERALIZATION__OWNING_GENERALIZATION:
				setOwningGeneralization((org.omg.sysml.lang.sysml.Class)null);
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
			case SysMLPackage.GENERALIZATION__GENERAL:
				return general != null;
			case SysMLPackage.GENERALIZATION__SPECIFIC:
				return specific != null;
			case SysMLPackage.GENERALIZATION__OWNING_GENERALIZATION:
				return owningGeneralization != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneralizationImpl
