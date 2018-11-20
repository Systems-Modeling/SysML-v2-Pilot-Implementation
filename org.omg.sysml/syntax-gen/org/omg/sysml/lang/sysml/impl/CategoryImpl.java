/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedFeatureMembership <em>Owned Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends PackageImpl implements Category {
	/**
	 * The cached value of the '{@link #getOwnedGeneralization() <em>Owned Generalization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> ownedGeneralization;

	/**
	 * The cached value of the '{@link #getOwnedFeatureMembership() <em>Owned Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMembership> ownedFeatureMembership;

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
	 * The cached value of the '{@link #getOwnedFeature() <em>Owned Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> ownedFeature;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> output;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getOwnedGeneralization() {
		if (ownedGeneralization == null) {
			ownedGeneralization = new EObjectWithInverseResolvingEList<Generalization>(Generalization.class, this, SysMLPackage.CATEGORY__OWNED_GENERALIZATION, SysMLPackage.GENERALIZATION__OWNING_CATEGORY);
		}
		return ownedGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureMembership> getOwnedFeatureMembership() {
		if (ownedFeatureMembership == null) {
			ownedFeatureMembership = new EObjectWithInverseResolvingEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY);
		}
		return ownedFeatureMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.CATEGORY__FEATURE);
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
			ownedFeature = new EObjectWithInverseResolvingEList<Feature>(Feature.class, this, SysMLPackage.CATEGORY__OWNED_FEATURE, SysMLPackage.FEATURE__OWNING_CATEGORY);
		}
		return ownedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.CATEGORY__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getOutput() {
		if (output == null) {
			output = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.CATEGORY__OUTPUT);
		}
		return output;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CATEGORY__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedGeneralization()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeatureMembership()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeature()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				return ((InternalEList<?>)getOwnedGeneralization()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				return ((InternalEList<?>)getOwnedFeatureMembership()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				return ((InternalEList<?>)getOwnedFeature()).basicRemove(otherEnd, msgs);
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
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				return getOwnedGeneralization();
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				return getOwnedFeatureMembership();
			case SysMLPackage.CATEGORY__FEATURE:
				return getFeature();
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				return getOwnedFeature();
			case SysMLPackage.CATEGORY__INPUT:
				return getInput();
			case SysMLPackage.CATEGORY__OUTPUT:
				return getOutput();
			case SysMLPackage.CATEGORY__IS_ABSTRACT:
				return isIsAbstract();
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
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				getOwnedGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				getOwnedFeatureMembership().addAll((Collection<? extends FeatureMembership>)newValue);
				return;
			case SysMLPackage.CATEGORY__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CATEGORY__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CATEGORY__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CATEGORY__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
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
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				return;
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				return;
			case SysMLPackage.CATEGORY__FEATURE:
				getFeature().clear();
				return;
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				getOwnedFeature().clear();
				return;
			case SysMLPackage.CATEGORY__INPUT:
				getInput().clear();
				return;
			case SysMLPackage.CATEGORY__OUTPUT:
				getOutput().clear();
				return;
			case SysMLPackage.CATEGORY__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
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
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				return ownedGeneralization != null && !ownedGeneralization.isEmpty();
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				return ownedFeatureMembership != null && !ownedFeatureMembership.isEmpty();
			case SysMLPackage.CATEGORY__FEATURE:
				return feature != null && !feature.isEmpty();
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				return ownedFeature != null && !ownedFeature.isEmpty();
			case SysMLPackage.CATEGORY__INPUT:
				return input != null && !input.isEmpty();
			case SysMLPackage.CATEGORY__OUTPUT:
				return output != null && !output.isEmpty();
			case SysMLPackage.CATEGORY__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
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

} //CategoryImpl
