/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Category;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl#getOwningCategory <em>Owning Category</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends RelationshipImpl implements Generalization {
	/**
	 * The cached value of the '{@link #getOwningCategory() <em>Owning Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningCategory()
	 * @generated
	 * @ordered
	 */
	protected Category owningCategory;

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected Category general;

	/**
	 * The cached value of the '{@link #getSpecific() <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecific()
	 * @generated
	 * @ordered
	 */
	protected Category specific;

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
	public Category getOwningCategory() {
		if (owningCategory != null && owningCategory.eIsProxy()) {
			InternalEObject oldOwningCategory = (InternalEObject)owningCategory;
			owningCategory = (Category)eResolveProxy(oldOwningCategory);
			if (owningCategory != oldOwningCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.GENERALIZATION__OWNING_CATEGORY, oldOwningCategory, owningCategory));
			}
		}
		return owningCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetOwningCategory() {
		return owningCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningCategory(Category newOwningCategory, NotificationChain msgs) {
		Category oldOwningCategory = owningCategory;
		owningCategory = newOwningCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.GENERALIZATION__OWNING_CATEGORY, oldOwningCategory, newOwningCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningCategory(Category newOwningCategory) {
		if (newOwningCategory != owningCategory) {
			NotificationChain msgs = null;
			if (owningCategory != null)
				msgs = ((InternalEObject)owningCategory).eInverseRemove(this, SysMLPackage.CATEGORY__OWNED_GENERALIZATION, Category.class, msgs);
			if (newOwningCategory != null)
				msgs = ((InternalEObject)newOwningCategory).eInverseAdd(this, SysMLPackage.CATEGORY__OWNED_GENERALIZATION, Category.class, msgs);
			msgs = basicSetOwningCategory(newOwningCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.GENERALIZATION__OWNING_CATEGORY, newOwningCategory, newOwningCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getGeneral() {
		if (general != null && general.eIsProxy()) {
			InternalEObject oldGeneral = (InternalEObject)general;
			general = (Category)eResolveProxy(oldGeneral);
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
	public Category basicGetGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Category newGeneral) {
		Category oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.GENERALIZATION__GENERAL, oldGeneral, general));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getSpecific() {
		if (specific != null && specific.eIsProxy()) {
			InternalEObject oldSpecific = (InternalEObject)specific;
			specific = (Category)eResolveProxy(oldSpecific);
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
	public Category basicGetSpecific() {
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Category newSpecific) {
		Category oldSpecific = specific;
		specific = newSpecific;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.GENERALIZATION__SPECIFIC, oldSpecific, specific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.GENERALIZATION__OWNING_CATEGORY:
				if (owningCategory != null)
					msgs = ((InternalEObject)owningCategory).eInverseRemove(this, SysMLPackage.CATEGORY__OWNED_GENERALIZATION, Category.class, msgs);
				return basicSetOwningCategory((Category)otherEnd, msgs);
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
			case SysMLPackage.GENERALIZATION__OWNING_CATEGORY:
				return basicSetOwningCategory(null, msgs);
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
			case SysMLPackage.GENERALIZATION__OWNING_CATEGORY:
				if (resolve) return getOwningCategory();
				return basicGetOwningCategory();
			case SysMLPackage.GENERALIZATION__GENERAL:
				if (resolve) return getGeneral();
				return basicGetGeneral();
			case SysMLPackage.GENERALIZATION__SPECIFIC:
				if (resolve) return getSpecific();
				return basicGetSpecific();
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
			case SysMLPackage.GENERALIZATION__OWNING_CATEGORY:
				setOwningCategory((Category)newValue);
				return;
			case SysMLPackage.GENERALIZATION__GENERAL:
				setGeneral((Category)newValue);
				return;
			case SysMLPackage.GENERALIZATION__SPECIFIC:
				setSpecific((Category)newValue);
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
			case SysMLPackage.GENERALIZATION__OWNING_CATEGORY:
				setOwningCategory((Category)null);
				return;
			case SysMLPackage.GENERALIZATION__GENERAL:
				setGeneral((Category)null);
				return;
			case SysMLPackage.GENERALIZATION__SPECIFIC:
				setSpecific((Category)null);
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
			case SysMLPackage.GENERALIZATION__OWNING_CATEGORY:
				return owningCategory != null;
			case SysMLPackage.GENERALIZATION__GENERAL:
				return general != null;
			case SysMLPackage.GENERALIZATION__SPECIFIC:
				return specific != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneralizationImpl
