/**
 */
package org.omg.sysml.classification.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.omg.sysml.classification.ClassificationPackage;
import org.omg.sysml.classification.Generalization;

import org.omg.sysml.core.impl.RelationshipImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.classification.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.GeneralizationImpl#getOwningGeneralization <em>Owning Generalization</em>}</li>
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
	protected org.omg.sysml.classification.Class general;

	/**
	 * The cached value of the '{@link #getSpecific() <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecific()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.classification.Class specific;

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
		return ClassificationPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.classification.Class getGeneral() {
		if (general != null && general.eIsProxy()) {
			InternalEObject oldGeneral = (InternalEObject)general;
			general = (org.omg.sysml.classification.Class)eResolveProxy(oldGeneral);
			if (general != oldGeneral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.GENERALIZATION__GENERAL, oldGeneral, general));
			}
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.classification.Class basicGetGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(org.omg.sysml.classification.Class newGeneral) {
		org.omg.sysml.classification.Class oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.GENERALIZATION__GENERAL, oldGeneral, general));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.classification.Class getSpecific() {
		if (specific != null && specific.eIsProxy()) {
			InternalEObject oldSpecific = (InternalEObject)specific;
			specific = (org.omg.sysml.classification.Class)eResolveProxy(oldSpecific);
			if (specific != oldSpecific) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.GENERALIZATION__SPECIFIC, oldSpecific, specific));
			}
		}
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.classification.Class basicGetSpecific() {
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(org.omg.sysml.classification.Class newSpecific) {
		org.omg.sysml.classification.Class oldSpecific = specific;
		specific = newSpecific;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.GENERALIZATION__SPECIFIC, oldSpecific, specific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.classification.Class getOwningGeneralization() {
		if (eContainerFeatureID() != ClassificationPackage.GENERALIZATION__OWNING_GENERALIZATION) return null;
		return (org.omg.sysml.classification.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningGeneralization(org.omg.sysml.classification.Class newOwningGeneralization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningGeneralization, ClassificationPackage.GENERALIZATION__OWNING_GENERALIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningGeneralization(org.omg.sysml.classification.Class newOwningGeneralization) {
		if (newOwningGeneralization != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.GENERALIZATION__OWNING_GENERALIZATION && newOwningGeneralization != null)) {
			if (EcoreUtil.isAncestor(this, newOwningGeneralization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningGeneralization != null)
				msgs = ((InternalEObject)newOwningGeneralization).eInverseAdd(this, ClassificationPackage.CLASS__OWNED_GENERALIZATION, org.omg.sysml.classification.Class.class, msgs);
			msgs = basicSetOwningGeneralization(newOwningGeneralization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.GENERALIZATION__OWNING_GENERALIZATION, newOwningGeneralization, newOwningGeneralization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassificationPackage.GENERALIZATION__OWNING_GENERALIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningGeneralization((org.omg.sysml.classification.Class)otherEnd, msgs);
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
			case ClassificationPackage.GENERALIZATION__OWNING_GENERALIZATION:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ClassificationPackage.GENERALIZATION__OWNING_GENERALIZATION:
				return eInternalContainer().eInverseRemove(this, ClassificationPackage.CLASS__OWNED_GENERALIZATION, org.omg.sysml.classification.Class.class, msgs);
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
			case ClassificationPackage.GENERALIZATION__GENERAL:
				if (resolve) return getGeneral();
				return basicGetGeneral();
			case ClassificationPackage.GENERALIZATION__SPECIFIC:
				if (resolve) return getSpecific();
				return basicGetSpecific();
			case ClassificationPackage.GENERALIZATION__OWNING_GENERALIZATION:
				return getOwningGeneralization();
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
			case ClassificationPackage.GENERALIZATION__GENERAL:
				setGeneral((org.omg.sysml.classification.Class)newValue);
				return;
			case ClassificationPackage.GENERALIZATION__SPECIFIC:
				setSpecific((org.omg.sysml.classification.Class)newValue);
				return;
			case ClassificationPackage.GENERALIZATION__OWNING_GENERALIZATION:
				setOwningGeneralization((org.omg.sysml.classification.Class)newValue);
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
			case ClassificationPackage.GENERALIZATION__GENERAL:
				setGeneral((org.omg.sysml.classification.Class)null);
				return;
			case ClassificationPackage.GENERALIZATION__SPECIFIC:
				setSpecific((org.omg.sysml.classification.Class)null);
				return;
			case ClassificationPackage.GENERALIZATION__OWNING_GENERALIZATION:
				setOwningGeneralization((org.omg.sysml.classification.Class)null);
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
			case ClassificationPackage.GENERALIZATION__GENERAL:
				return general != null;
			case ClassificationPackage.GENERALIZATION__SPECIFIC:
				return specific != null;
			case ClassificationPackage.GENERALIZATION__OWNING_GENERALIZATION:
				return getOwningGeneralization() != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneralizationImpl
