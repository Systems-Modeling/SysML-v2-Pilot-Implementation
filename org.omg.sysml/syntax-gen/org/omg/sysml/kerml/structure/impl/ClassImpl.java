/**
 */
package org.omg.sysml.kerml.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.kerml.core.impl.ContainerImpl;

import org.omg.sysml.kerml.structure.Feature;
import org.omg.sysml.kerml.structure.Generalization;
import org.omg.sysml.kerml.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ClassImpl#getSpecificClassifier <em>Specific Classifier</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ClassImpl#getGeneralClassifier <em>General Classifier</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ClassImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ClassImpl#getInheritedFeature <em>Inherited Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ClassImpl#getTypesFeature <em>Types Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ClassImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ClassImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ClassImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ClassImpl#getNestedFeatureOfClass <em>Nested Feature Of Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ContainerImpl implements org.omg.sysml.kerml.structure.Class {
	/**
	 * The cached value of the '{@link #getSpecificClassifier() <em>Specific Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.kerml.structure.Class> specificClassifier;

	/**
	 * The cached value of the '{@link #getGeneralClassifier() <em>General Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.kerml.structure.Class> generalClassifier;

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
	 * The cached value of the '{@link #getInheritedFeature() <em>Inherited Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> inheritedFeature;

	/**
	 * The cached value of the '{@link #getTypesFeature() <em>Types Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> typesFeature;

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
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.kerml.structure.Class instanceOf;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalization;

	/**
	 * The cached value of the '{@link #getNestedFeatureOfClass() <em>Nested Feature Of Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedFeatureOfClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> nestedFeatureOfClass;

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
		return StructurePackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.kerml.structure.Class> getSpecificClassifier() {
		if (specificClassifier == null) {
			specificClassifier = new EObjectResolvingEList<org.omg.sysml.kerml.structure.Class>(org.omg.sysml.kerml.structure.Class.class, this, StructurePackage.CLASS__SPECIFIC_CLASSIFIER);
		}
		return specificClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.kerml.structure.Class> getGeneralClassifier() {
		if (generalClassifier == null) {
			generalClassifier = new EObjectResolvingEList<org.omg.sysml.kerml.structure.Class>(org.omg.sysml.kerml.structure.Class.class, this, StructurePackage.CLASS__GENERAL_CLASSIFIER);
		}
		return generalClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getOwnedFeature() {
		if (ownedFeature == null) {
			ownedFeature = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, StructurePackage.CLASS__OWNED_FEATURE, StructurePackage.FEATURE__CLASS);
		}
		return ownedFeature;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getInheritedFeature() {
		if (inheritedFeature == null) {
			inheritedFeature = new EObjectResolvingEList<Feature>(Feature.class, this, StructurePackage.CLASS__INHERITED_FEATURE);
		}
		return inheritedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getTypesFeature() {
		if (typesFeature == null) {
			typesFeature = new EObjectResolvingEList<Feature>(Feature.class, this, StructurePackage.CLASS__TYPES_FEATURE);
		}
		return typesFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectWithInverseResolvingEList<Feature>(Feature.class, this, StructurePackage.CLASS__FEATURE, StructurePackage.FEATURE__FEATURING_CLASSIFIER);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class getInstanceOf() {
		if (instanceOf != null && instanceOf.eIsProxy()) {
			InternalEObject oldInstanceOf = (InternalEObject)instanceOf;
			instanceOf = (org.omg.sysml.kerml.structure.Class)eResolveProxy(oldInstanceOf);
			if (instanceOf != oldInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CLASS__INSTANCE_OF, oldInstanceOf, instanceOf));
			}
		}
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class basicGetInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceOf(org.omg.sysml.kerml.structure.Class newInstanceOf) {
		org.omg.sysml.kerml.structure.Class oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CLASS__INSTANCE_OF, oldInstanceOf, instanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, StructurePackage.CLASS__GENERALIZATION, StructurePackage.GENERALIZATION__SPECIFIC);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getNestedFeatureOfClass() {
		if (nestedFeatureOfClass == null) {
			nestedFeatureOfClass = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS, StructurePackage.FEATURE__CONTEXT);
		}
		return nestedFeatureOfClass;
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
			case StructurePackage.CLASS__OWNED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeature()).basicAdd(otherEnd, msgs);
			case StructurePackage.CLASS__FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeature()).basicAdd(otherEnd, msgs);
			case StructurePackage.CLASS__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
			case StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedFeatureOfClass()).basicAdd(otherEnd, msgs);
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
			case StructurePackage.CLASS__OWNED_FEATURE:
				return ((InternalEList<?>)getOwnedFeature()).basicRemove(otherEnd, msgs);
			case StructurePackage.CLASS__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case StructurePackage.CLASS__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS:
				return ((InternalEList<?>)getNestedFeatureOfClass()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.CLASS__SPECIFIC_CLASSIFIER:
				return getSpecificClassifier();
			case StructurePackage.CLASS__GENERAL_CLASSIFIER:
				return getGeneralClassifier();
			case StructurePackage.CLASS__OWNED_FEATURE:
				return getOwnedFeature();
			case StructurePackage.CLASS__IS_ABSTRACT:
				return isIsAbstract();
			case StructurePackage.CLASS__INHERITED_FEATURE:
				return getInheritedFeature();
			case StructurePackage.CLASS__TYPES_FEATURE:
				return getTypesFeature();
			case StructurePackage.CLASS__FEATURE:
				return getFeature();
			case StructurePackage.CLASS__INSTANCE_OF:
				if (resolve) return getInstanceOf();
				return basicGetInstanceOf();
			case StructurePackage.CLASS__GENERALIZATION:
				return getGeneralization();
			case StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS:
				return getNestedFeatureOfClass();
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
			case StructurePackage.CLASS__SPECIFIC_CLASSIFIER:
				getSpecificClassifier().clear();
				getSpecificClassifier().addAll((Collection<? extends org.omg.sysml.kerml.structure.Class>)newValue);
				return;
			case StructurePackage.CLASS__GENERAL_CLASSIFIER:
				getGeneralClassifier().clear();
				getGeneralClassifier().addAll((Collection<? extends org.omg.sysml.kerml.structure.Class>)newValue);
				return;
			case StructurePackage.CLASS__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.CLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case StructurePackage.CLASS__INHERITED_FEATURE:
				getInheritedFeature().clear();
				getInheritedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.CLASS__TYPES_FEATURE:
				getTypesFeature().clear();
				getTypesFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.CLASS__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.CLASS__INSTANCE_OF:
				setInstanceOf((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.CLASS__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS:
				getNestedFeatureOfClass().clear();
				getNestedFeatureOfClass().addAll((Collection<? extends Feature>)newValue);
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
			case StructurePackage.CLASS__SPECIFIC_CLASSIFIER:
				getSpecificClassifier().clear();
				return;
			case StructurePackage.CLASS__GENERAL_CLASSIFIER:
				getGeneralClassifier().clear();
				return;
			case StructurePackage.CLASS__OWNED_FEATURE:
				getOwnedFeature().clear();
				return;
			case StructurePackage.CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case StructurePackage.CLASS__INHERITED_FEATURE:
				getInheritedFeature().clear();
				return;
			case StructurePackage.CLASS__TYPES_FEATURE:
				getTypesFeature().clear();
				return;
			case StructurePackage.CLASS__FEATURE:
				getFeature().clear();
				return;
			case StructurePackage.CLASS__INSTANCE_OF:
				setInstanceOf((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.CLASS__GENERALIZATION:
				getGeneralization().clear();
				return;
			case StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS:
				getNestedFeatureOfClass().clear();
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
			case StructurePackage.CLASS__SPECIFIC_CLASSIFIER:
				return specificClassifier != null && !specificClassifier.isEmpty();
			case StructurePackage.CLASS__GENERAL_CLASSIFIER:
				return generalClassifier != null && !generalClassifier.isEmpty();
			case StructurePackage.CLASS__OWNED_FEATURE:
				return ownedFeature != null && !ownedFeature.isEmpty();
			case StructurePackage.CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case StructurePackage.CLASS__INHERITED_FEATURE:
				return inheritedFeature != null && !inheritedFeature.isEmpty();
			case StructurePackage.CLASS__TYPES_FEATURE:
				return typesFeature != null && !typesFeature.isEmpty();
			case StructurePackage.CLASS__FEATURE:
				return feature != null && !feature.isEmpty();
			case StructurePackage.CLASS__INSTANCE_OF:
				return instanceOf != null;
			case StructurePackage.CLASS__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS:
				return nestedFeatureOfClass != null && !nestedFeatureOfClass.isEmpty();
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
