/**
 */
package org.omg.sysml.classification.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.classification.ClassificationPackage;
import org.omg.sysml.classification.Feature;
import org.omg.sysml.classification.Generalization;

import org.omg.sysml.groups.impl.NamespaceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.classification.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.ClassImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.ClassImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.ClassImpl#getTypedFeature <em>Typed Feature</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.ClassImpl#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends NamespaceImpl implements org.omg.sysml.classification.Class {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * The cached value of the '{@link #getOwnedFeature() <em>Owned Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> ownedFeature;

	/**
	 * The cached value of the '{@link #getTypedFeature() <em>Typed Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> typedFeature;

	/**
	 * The cached value of the '{@link #getOwnedGeneralization() <em>Owned Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> ownedGeneralization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, ClassificationPackage.CLASS__FEATURE, ClassificationPackage.FEATURE__FEATURING_CLASSES);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getOwnedFeature() {
		if (ownedFeature == null) {
			ownedFeature = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, ClassificationPackage.CLASS__OWNED_FEATURE, ClassificationPackage.FEATURE__CLASS);
		}
		return ownedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getTypedFeature() {
		if (typedFeature == null) {
			typedFeature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, ClassificationPackage.CLASS__TYPED_FEATURE, ClassificationPackage.FEATURE__TYPE);
		}
		return typedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getOwnedGeneralization() {
		if (ownedGeneralization == null) {
			ownedGeneralization = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, ClassificationPackage.CLASS__OWNED_GENERALIZATION, ClassificationPackage.GENERALIZATION__OWNING_GENERALIZATION);
		}
		return ownedGeneralization;
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
			case ClassificationPackage.CLASS__FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeature()).basicAdd(otherEnd, msgs);
			case ClassificationPackage.CLASS__OWNED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeature()).basicAdd(otherEnd, msgs);
			case ClassificationPackage.CLASS__TYPED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypedFeature()).basicAdd(otherEnd, msgs);
			case ClassificationPackage.CLASS__OWNED_GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedGeneralization()).basicAdd(otherEnd, msgs);
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
			case ClassificationPackage.CLASS__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASS__OWNED_FEATURE:
				return ((InternalEList<?>)getOwnedFeature()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASS__TYPED_FEATURE:
				return ((InternalEList<?>)getTypedFeature()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASS__OWNED_GENERALIZATION:
				return ((InternalEList<?>)getOwnedGeneralization()).basicRemove(otherEnd, msgs);
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
			case ClassificationPackage.CLASS__IS_ABSTRACT:
				return isIsAbstract();
			case ClassificationPackage.CLASS__FEATURE:
				return getFeature();
			case ClassificationPackage.CLASS__OWNED_FEATURE:
				return getOwnedFeature();
			case ClassificationPackage.CLASS__TYPED_FEATURE:
				return getTypedFeature();
			case ClassificationPackage.CLASS__OWNED_GENERALIZATION:
				return getOwnedGeneralization();
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
			case ClassificationPackage.CLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case ClassificationPackage.CLASS__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case ClassificationPackage.CLASS__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case ClassificationPackage.CLASS__TYPED_FEATURE:
				getTypedFeature().clear();
				getTypedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case ClassificationPackage.CLASS__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				getOwnedGeneralization().addAll((Collection<? extends Generalization>)newValue);
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
			case ClassificationPackage.CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case ClassificationPackage.CLASS__FEATURE:
				getFeature().clear();
				return;
			case ClassificationPackage.CLASS__OWNED_FEATURE:
				getOwnedFeature().clear();
				return;
			case ClassificationPackage.CLASS__TYPED_FEATURE:
				getTypedFeature().clear();
				return;
			case ClassificationPackage.CLASS__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
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
			case ClassificationPackage.CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case ClassificationPackage.CLASS__FEATURE:
				return feature != null && !feature.isEmpty();
			case ClassificationPackage.CLASS__OWNED_FEATURE:
				return ownedFeature != null && !ownedFeature.isEmpty();
			case ClassificationPackage.CLASS__TYPED_FEATURE:
				return typedFeature != null && !typedFeature.isEmpty();
			case ClassificationPackage.CLASS__OWNED_GENERALIZATION:
				return ownedGeneralization != null && !ownedGeneralization.isEmpty();
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
