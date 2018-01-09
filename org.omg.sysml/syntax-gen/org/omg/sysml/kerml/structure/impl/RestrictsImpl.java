/**
 */
package org.omg.sysml.kerml.structure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.kerml.core.impl.RelationshipImpl;

import org.omg.sysml.kerml.structure.DataType;
import org.omg.sysml.kerml.structure.Generalization;
import org.omg.sysml.kerml.structure.Restricts;
import org.omg.sysml.kerml.structure.StructurePackage;
import org.omg.sysml.kerml.structure.ValueRestriction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restricts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.RestrictsImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.RestrictsImpl#getSpecific <em>Specific</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.RestrictsImpl#getRestricted <em>Restricted</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.RestrictsImpl#getRestrictedBy <em>Restricted By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestrictsImpl extends RelationshipImpl implements Restricts {
	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.kerml.structure.Class general;

	/**
	 * The cached value of the '{@link #getSpecific() <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecific()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.kerml.structure.Class specific;

	/**
	 * The cached value of the '{@link #getRestricted() <em>Restricted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestricted()
	 * @generated
	 * @ordered
	 */
	protected DataType restricted;

	/**
	 * The cached value of the '{@link #getRestrictedBy() <em>Restricted By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictedBy()
	 * @generated
	 * @ordered
	 */
	protected ValueRestriction restrictedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.RESTRICTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class getGeneral() {
		if (general != null && general.eIsProxy()) {
			InternalEObject oldGeneral = (InternalEObject)general;
			general = (org.omg.sysml.kerml.structure.Class)eResolveProxy(oldGeneral);
			if (general != oldGeneral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.RESTRICTS__GENERAL, oldGeneral, general));
			}
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class basicGetGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(org.omg.sysml.kerml.structure.Class newGeneral) {
		org.omg.sysml.kerml.structure.Class oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.RESTRICTS__GENERAL, oldGeneral, general));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class getSpecific() {
		if (specific != null && specific.eIsProxy()) {
			InternalEObject oldSpecific = (InternalEObject)specific;
			specific = (org.omg.sysml.kerml.structure.Class)eResolveProxy(oldSpecific);
			if (specific != oldSpecific) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.RESTRICTS__SPECIFIC, oldSpecific, specific));
			}
		}
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class basicGetSpecific() {
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecific(org.omg.sysml.kerml.structure.Class newSpecific, NotificationChain msgs) {
		org.omg.sysml.kerml.structure.Class oldSpecific = specific;
		specific = newSpecific;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.RESTRICTS__SPECIFIC, oldSpecific, newSpecific);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(org.omg.sysml.kerml.structure.Class newSpecific) {
		if (newSpecific != specific) {
			NotificationChain msgs = null;
			if (specific != null)
				msgs = ((InternalEObject)specific).eInverseRemove(this, StructurePackage.CLASS__GENERALIZATION, org.omg.sysml.kerml.structure.Class.class, msgs);
			if (newSpecific != null)
				msgs = ((InternalEObject)newSpecific).eInverseAdd(this, StructurePackage.CLASS__GENERALIZATION, org.omg.sysml.kerml.structure.Class.class, msgs);
			msgs = basicSetSpecific(newSpecific, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.RESTRICTS__SPECIFIC, newSpecific, newSpecific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getRestricted() {
		if (restricted != null && restricted.eIsProxy()) {
			InternalEObject oldRestricted = (InternalEObject)restricted;
			restricted = (DataType)eResolveProxy(oldRestricted);
			if (restricted != oldRestricted) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.RESTRICTS__RESTRICTED, oldRestricted, restricted));
			}
		}
		return restricted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetRestricted() {
		return restricted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestricted(DataType newRestricted) {
		DataType oldRestricted = restricted;
		restricted = newRestricted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.RESTRICTS__RESTRICTED, oldRestricted, restricted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRestriction getRestrictedBy() {
		if (restrictedBy != null && restrictedBy.eIsProxy()) {
			InternalEObject oldRestrictedBy = (InternalEObject)restrictedBy;
			restrictedBy = (ValueRestriction)eResolveProxy(oldRestrictedBy);
			if (restrictedBy != oldRestrictedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.RESTRICTS__RESTRICTED_BY, oldRestrictedBy, restrictedBy));
			}
		}
		return restrictedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRestriction basicGetRestrictedBy() {
		return restrictedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictedBy(ValueRestriction newRestrictedBy) {
		ValueRestriction oldRestrictedBy = restrictedBy;
		restrictedBy = newRestrictedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.RESTRICTS__RESTRICTED_BY, oldRestrictedBy, restrictedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.RESTRICTS__SPECIFIC:
				if (specific != null)
					msgs = ((InternalEObject)specific).eInverseRemove(this, StructurePackage.CLASS__GENERALIZATION, org.omg.sysml.kerml.structure.Class.class, msgs);
				return basicSetSpecific((org.omg.sysml.kerml.structure.Class)otherEnd, msgs);
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
			case StructurePackage.RESTRICTS__SPECIFIC:
				return basicSetSpecific(null, msgs);
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
			case StructurePackage.RESTRICTS__GENERAL:
				if (resolve) return getGeneral();
				return basicGetGeneral();
			case StructurePackage.RESTRICTS__SPECIFIC:
				if (resolve) return getSpecific();
				return basicGetSpecific();
			case StructurePackage.RESTRICTS__RESTRICTED:
				if (resolve) return getRestricted();
				return basicGetRestricted();
			case StructurePackage.RESTRICTS__RESTRICTED_BY:
				if (resolve) return getRestrictedBy();
				return basicGetRestrictedBy();
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
			case StructurePackage.RESTRICTS__GENERAL:
				setGeneral((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.RESTRICTS__SPECIFIC:
				setSpecific((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.RESTRICTS__RESTRICTED:
				setRestricted((DataType)newValue);
				return;
			case StructurePackage.RESTRICTS__RESTRICTED_BY:
				setRestrictedBy((ValueRestriction)newValue);
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
			case StructurePackage.RESTRICTS__GENERAL:
				setGeneral((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.RESTRICTS__SPECIFIC:
				setSpecific((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.RESTRICTS__RESTRICTED:
				setRestricted((DataType)null);
				return;
			case StructurePackage.RESTRICTS__RESTRICTED_BY:
				setRestrictedBy((ValueRestriction)null);
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
			case StructurePackage.RESTRICTS__GENERAL:
				return general != null;
			case StructurePackage.RESTRICTS__SPECIFIC:
				return specific != null;
			case StructurePackage.RESTRICTS__RESTRICTED:
				return restricted != null;
			case StructurePackage.RESTRICTS__RESTRICTED_BY:
				return restrictedBy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Generalization.class) {
			switch (derivedFeatureID) {
				case StructurePackage.RESTRICTS__GENERAL: return StructurePackage.GENERALIZATION__GENERAL;
				case StructurePackage.RESTRICTS__SPECIFIC: return StructurePackage.GENERALIZATION__SPECIFIC;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Generalization.class) {
			switch (baseFeatureID) {
				case StructurePackage.GENERALIZATION__GENERAL: return StructurePackage.RESTRICTS__GENERAL;
				case StructurePackage.GENERALIZATION__SPECIFIC: return StructurePackage.RESTRICTS__SPECIFIC;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RestrictsImpl
