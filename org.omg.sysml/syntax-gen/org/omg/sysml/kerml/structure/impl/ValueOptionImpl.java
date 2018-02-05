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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.kerml.structure.Feature;
import org.omg.sysml.kerml.structure.Generalization;
import org.omg.sysml.kerml.structure.StructurePackage;
import org.omg.sysml.kerml.structure.StructuredFeature;
import org.omg.sysml.kerml.structure.ValueOption;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getPackageVisibility <em>Package Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getSpecificClassifier <em>Specific Classifier</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getGeneralClassifier <em>General Classifier</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getInheritedFeature <em>Inherited Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getTypesFeature <em>Types Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getNestedFeatureOfClass <em>Nested Feature Of Class</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl#getOptionOfProperty <em>Option Of Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueOptionImpl extends org.omg.sysml.kerml.core.impl.RelationshipImpl implements ValueOption {
	/**
	 * The default value of the '{@link #getPackageVisibility() <em>Package Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final org.omg.sysml.kerml.core.visibilityKind PACKAGE_VISIBILITY_EDEFAULT = org.omg.sysml.kerml.core.visibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getPackageVisibility() <em>Package Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageVisibility()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.kerml.core.visibilityKind packageVisibility = PACKAGE_VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedMember() <em>Owned Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.kerml.core.ElementRecord> ownedMember;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.kerml.core.ElementRecord> member;

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
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.kerml.structure.Class> option;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.VALUE_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.core.visibilityKind getPackageVisibility() {
		return packageVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageVisibility(org.omg.sysml.kerml.core.visibilityKind newPackageVisibility) {
		org.omg.sysml.kerml.core.visibilityKind oldPackageVisibility = packageVisibility;
		packageVisibility = newPackageVisibility == null ? PACKAGE_VISIBILITY_EDEFAULT : newPackageVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.VALUE_OPTION__PACKAGE_VISIBILITY, oldPackageVisibility, packageVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.kerml.core.ElementRecord> getOwnedMember() {
		if (ownedMember == null) {
			ownedMember = new EObjectContainmentWithInverseEList<org.omg.sysml.kerml.core.ElementRecord>(org.omg.sysml.kerml.core.ElementRecord.class, this, StructurePackage.VALUE_OPTION__OWNED_MEMBER, org.omg.sysml.kerml.core.CorePackage.ELEMENT_RECORD__NAMESPACE);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.kerml.core.ElementRecord> getMember() {
		if (member == null) {
			member = new EObjectWithInverseResolvingEList.ManyInverse<org.omg.sysml.kerml.core.ElementRecord>(org.omg.sysml.kerml.core.ElementRecord.class, this, StructurePackage.VALUE_OPTION__MEMBER, org.omg.sysml.kerml.core.CorePackage.ELEMENT_RECORD__MEMBER_OF_NAMESPACE);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.kerml.structure.Class> getSpecificClassifier() {
		if (specificClassifier == null) {
			specificClassifier = new EObjectResolvingEList<org.omg.sysml.kerml.structure.Class>(org.omg.sysml.kerml.structure.Class.class, this, StructurePackage.VALUE_OPTION__SPECIFIC_CLASSIFIER);
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
			generalClassifier = new EObjectResolvingEList<org.omg.sysml.kerml.structure.Class>(org.omg.sysml.kerml.structure.Class.class, this, StructurePackage.VALUE_OPTION__GENERAL_CLASSIFIER);
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
			ownedFeature = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, StructurePackage.VALUE_OPTION__OWNED_FEATURE, StructurePackage.FEATURE__CLASS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.VALUE_OPTION__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getInheritedFeature() {
		if (inheritedFeature == null) {
			inheritedFeature = new EObjectResolvingEList<Feature>(Feature.class, this, StructurePackage.VALUE_OPTION__INHERITED_FEATURE);
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
			typesFeature = new EObjectResolvingEList<Feature>(Feature.class, this, StructurePackage.VALUE_OPTION__TYPES_FEATURE);
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
			feature = new EObjectWithInverseResolvingEList<Feature>(Feature.class, this, StructurePackage.VALUE_OPTION__FEATURE, StructurePackage.FEATURE__FEATURING_CLASSIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.VALUE_OPTION__INSTANCE_OF, oldInstanceOf, instanceOf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.VALUE_OPTION__INSTANCE_OF, oldInstanceOf, instanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, StructurePackage.VALUE_OPTION__GENERALIZATION, StructurePackage.GENERALIZATION__SPECIFIC);
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
			nestedFeatureOfClass = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, StructurePackage.VALUE_OPTION__NESTED_FEATURE_OF_CLASS, StructurePackage.FEATURE__CONTEXT);
		}
		return nestedFeatureOfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.kerml.structure.Class> getOption() {
		if (option == null) {
			option = new EObjectResolvingEList<org.omg.sysml.kerml.structure.Class>(org.omg.sysml.kerml.structure.Class.class, this, StructurePackage.VALUE_OPTION__OPTION);
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredFeature getOptionOfProperty() {
		if (eContainerFeatureID() != StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY) return null;
		return (StructuredFeature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionOfProperty(StructuredFeature newOptionOfProperty, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOptionOfProperty, StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionOfProperty(StructuredFeature newOptionOfProperty) {
		if (newOptionOfProperty != eInternalContainer() || (eContainerFeatureID() != StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY && newOptionOfProperty != null)) {
			if (EcoreUtil.isAncestor(this, newOptionOfProperty))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOptionOfProperty != null)
				msgs = ((InternalEObject)newOptionOfProperty).eInverseAdd(this, StructurePackage.STRUCTURED_FEATURE__OPTION, StructuredFeature.class, msgs);
			msgs = basicSetOptionOfProperty(newOptionOfProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY, newOptionOfProperty, newOptionOfProperty));
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
			case StructurePackage.VALUE_OPTION__OWNED_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMember()).basicAdd(otherEnd, msgs);
			case StructurePackage.VALUE_OPTION__MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMember()).basicAdd(otherEnd, msgs);
			case StructurePackage.VALUE_OPTION__OWNED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeature()).basicAdd(otherEnd, msgs);
			case StructurePackage.VALUE_OPTION__FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeature()).basicAdd(otherEnd, msgs);
			case StructurePackage.VALUE_OPTION__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
			case StructurePackage.VALUE_OPTION__NESTED_FEATURE_OF_CLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedFeatureOfClass()).basicAdd(otherEnd, msgs);
			case StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOptionOfProperty((StructuredFeature)otherEnd, msgs);
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
			case StructurePackage.VALUE_OPTION__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case StructurePackage.VALUE_OPTION__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case StructurePackage.VALUE_OPTION__OWNED_FEATURE:
				return ((InternalEList<?>)getOwnedFeature()).basicRemove(otherEnd, msgs);
			case StructurePackage.VALUE_OPTION__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case StructurePackage.VALUE_OPTION__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case StructurePackage.VALUE_OPTION__NESTED_FEATURE_OF_CLASS:
				return ((InternalEList<?>)getNestedFeatureOfClass()).basicRemove(otherEnd, msgs);
			case StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY:
				return basicSetOptionOfProperty(null, msgs);
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
			case StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY:
				return eInternalContainer().eInverseRemove(this, StructurePackage.STRUCTURED_FEATURE__OPTION, StructuredFeature.class, msgs);
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
			case StructurePackage.VALUE_OPTION__PACKAGE_VISIBILITY:
				return getPackageVisibility();
			case StructurePackage.VALUE_OPTION__OWNED_MEMBER:
				return getOwnedMember();
			case StructurePackage.VALUE_OPTION__MEMBER:
				return getMember();
			case StructurePackage.VALUE_OPTION__SPECIFIC_CLASSIFIER:
				return getSpecificClassifier();
			case StructurePackage.VALUE_OPTION__GENERAL_CLASSIFIER:
				return getGeneralClassifier();
			case StructurePackage.VALUE_OPTION__OWNED_FEATURE:
				return getOwnedFeature();
			case StructurePackage.VALUE_OPTION__IS_ABSTRACT:
				return isIsAbstract();
			case StructurePackage.VALUE_OPTION__INHERITED_FEATURE:
				return getInheritedFeature();
			case StructurePackage.VALUE_OPTION__TYPES_FEATURE:
				return getTypesFeature();
			case StructurePackage.VALUE_OPTION__FEATURE:
				return getFeature();
			case StructurePackage.VALUE_OPTION__INSTANCE_OF:
				if (resolve) return getInstanceOf();
				return basicGetInstanceOf();
			case StructurePackage.VALUE_OPTION__GENERALIZATION:
				return getGeneralization();
			case StructurePackage.VALUE_OPTION__NESTED_FEATURE_OF_CLASS:
				return getNestedFeatureOfClass();
			case StructurePackage.VALUE_OPTION__OPTION:
				return getOption();
			case StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY:
				return getOptionOfProperty();
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
			case StructurePackage.VALUE_OPTION__PACKAGE_VISIBILITY:
				setPackageVisibility((org.omg.sysml.kerml.core.visibilityKind)newValue);
				return;
			case StructurePackage.VALUE_OPTION__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends org.omg.sysml.kerml.core.ElementRecord>)newValue);
				return;
			case StructurePackage.VALUE_OPTION__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends org.omg.sysml.kerml.core.ElementRecord>)newValue);
				return;
			case StructurePackage.VALUE_OPTION__SPECIFIC_CLASSIFIER:
				getSpecificClassifier().clear();
				getSpecificClassifier().addAll((Collection<? extends org.omg.sysml.kerml.structure.Class>)newValue);
				return;
			case StructurePackage.VALUE_OPTION__GENERAL_CLASSIFIER:
				getGeneralClassifier().clear();
				getGeneralClassifier().addAll((Collection<? extends org.omg.sysml.kerml.structure.Class>)newValue);
				return;
			case StructurePackage.VALUE_OPTION__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.VALUE_OPTION__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case StructurePackage.VALUE_OPTION__INHERITED_FEATURE:
				getInheritedFeature().clear();
				getInheritedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.VALUE_OPTION__TYPES_FEATURE:
				getTypesFeature().clear();
				getTypesFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.VALUE_OPTION__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.VALUE_OPTION__INSTANCE_OF:
				setInstanceOf((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.VALUE_OPTION__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case StructurePackage.VALUE_OPTION__NESTED_FEATURE_OF_CLASS:
				getNestedFeatureOfClass().clear();
				getNestedFeatureOfClass().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.VALUE_OPTION__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends org.omg.sysml.kerml.structure.Class>)newValue);
				return;
			case StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY:
				setOptionOfProperty((StructuredFeature)newValue);
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
			case StructurePackage.VALUE_OPTION__PACKAGE_VISIBILITY:
				setPackageVisibility(PACKAGE_VISIBILITY_EDEFAULT);
				return;
			case StructurePackage.VALUE_OPTION__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case StructurePackage.VALUE_OPTION__MEMBER:
				getMember().clear();
				return;
			case StructurePackage.VALUE_OPTION__SPECIFIC_CLASSIFIER:
				getSpecificClassifier().clear();
				return;
			case StructurePackage.VALUE_OPTION__GENERAL_CLASSIFIER:
				getGeneralClassifier().clear();
				return;
			case StructurePackage.VALUE_OPTION__OWNED_FEATURE:
				getOwnedFeature().clear();
				return;
			case StructurePackage.VALUE_OPTION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case StructurePackage.VALUE_OPTION__INHERITED_FEATURE:
				getInheritedFeature().clear();
				return;
			case StructurePackage.VALUE_OPTION__TYPES_FEATURE:
				getTypesFeature().clear();
				return;
			case StructurePackage.VALUE_OPTION__FEATURE:
				getFeature().clear();
				return;
			case StructurePackage.VALUE_OPTION__INSTANCE_OF:
				setInstanceOf((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.VALUE_OPTION__GENERALIZATION:
				getGeneralization().clear();
				return;
			case StructurePackage.VALUE_OPTION__NESTED_FEATURE_OF_CLASS:
				getNestedFeatureOfClass().clear();
				return;
			case StructurePackage.VALUE_OPTION__OPTION:
				getOption().clear();
				return;
			case StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY:
				setOptionOfProperty((StructuredFeature)null);
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
			case StructurePackage.VALUE_OPTION__PACKAGE_VISIBILITY:
				return packageVisibility != PACKAGE_VISIBILITY_EDEFAULT;
			case StructurePackage.VALUE_OPTION__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case StructurePackage.VALUE_OPTION__MEMBER:
				return member != null && !member.isEmpty();
			case StructurePackage.VALUE_OPTION__SPECIFIC_CLASSIFIER:
				return specificClassifier != null && !specificClassifier.isEmpty();
			case StructurePackage.VALUE_OPTION__GENERAL_CLASSIFIER:
				return generalClassifier != null && !generalClassifier.isEmpty();
			case StructurePackage.VALUE_OPTION__OWNED_FEATURE:
				return ownedFeature != null && !ownedFeature.isEmpty();
			case StructurePackage.VALUE_OPTION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case StructurePackage.VALUE_OPTION__INHERITED_FEATURE:
				return inheritedFeature != null && !inheritedFeature.isEmpty();
			case StructurePackage.VALUE_OPTION__TYPES_FEATURE:
				return typesFeature != null && !typesFeature.isEmpty();
			case StructurePackage.VALUE_OPTION__FEATURE:
				return feature != null && !feature.isEmpty();
			case StructurePackage.VALUE_OPTION__INSTANCE_OF:
				return instanceOf != null;
			case StructurePackage.VALUE_OPTION__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case StructurePackage.VALUE_OPTION__NESTED_FEATURE_OF_CLASS:
				return nestedFeatureOfClass != null && !nestedFeatureOfClass.isEmpty();
			case StructurePackage.VALUE_OPTION__OPTION:
				return option != null && !option.isEmpty();
			case StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY:
				return getOptionOfProperty() != null;
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
		if (baseClass == org.omg.sysml.kerml.core.Container.class) {
			switch (derivedFeatureID) {
				case StructurePackage.VALUE_OPTION__PACKAGE_VISIBILITY: return org.omg.sysml.kerml.core.CorePackage.CONTAINER__PACKAGE_VISIBILITY;
				case StructurePackage.VALUE_OPTION__OWNED_MEMBER: return org.omg.sysml.kerml.core.CorePackage.CONTAINER__OWNED_MEMBER;
				case StructurePackage.VALUE_OPTION__MEMBER: return org.omg.sysml.kerml.core.CorePackage.CONTAINER__MEMBER;
				default: return -1;
			}
		}
		if (baseClass == org.omg.sysml.kerml.structure.Class.class) {
			switch (derivedFeatureID) {
				case StructurePackage.VALUE_OPTION__SPECIFIC_CLASSIFIER: return StructurePackage.CLASS__SPECIFIC_CLASSIFIER;
				case StructurePackage.VALUE_OPTION__GENERAL_CLASSIFIER: return StructurePackage.CLASS__GENERAL_CLASSIFIER;
				case StructurePackage.VALUE_OPTION__OWNED_FEATURE: return StructurePackage.CLASS__OWNED_FEATURE;
				case StructurePackage.VALUE_OPTION__IS_ABSTRACT: return StructurePackage.CLASS__IS_ABSTRACT;
				case StructurePackage.VALUE_OPTION__INHERITED_FEATURE: return StructurePackage.CLASS__INHERITED_FEATURE;
				case StructurePackage.VALUE_OPTION__TYPES_FEATURE: return StructurePackage.CLASS__TYPES_FEATURE;
				case StructurePackage.VALUE_OPTION__FEATURE: return StructurePackage.CLASS__FEATURE;
				case StructurePackage.VALUE_OPTION__INSTANCE_OF: return StructurePackage.CLASS__INSTANCE_OF;
				case StructurePackage.VALUE_OPTION__GENERALIZATION: return StructurePackage.CLASS__GENERALIZATION;
				case StructurePackage.VALUE_OPTION__NESTED_FEATURE_OF_CLASS: return StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS;
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
		if (baseClass == org.omg.sysml.kerml.core.Container.class) {
			switch (baseFeatureID) {
				case org.omg.sysml.kerml.core.CorePackage.CONTAINER__PACKAGE_VISIBILITY: return StructurePackage.VALUE_OPTION__PACKAGE_VISIBILITY;
				case org.omg.sysml.kerml.core.CorePackage.CONTAINER__OWNED_MEMBER: return StructurePackage.VALUE_OPTION__OWNED_MEMBER;
				case org.omg.sysml.kerml.core.CorePackage.CONTAINER__MEMBER: return StructurePackage.VALUE_OPTION__MEMBER;
				default: return -1;
			}
		}
		if (baseClass == org.omg.sysml.kerml.structure.Class.class) {
			switch (baseFeatureID) {
				case StructurePackage.CLASS__SPECIFIC_CLASSIFIER: return StructurePackage.VALUE_OPTION__SPECIFIC_CLASSIFIER;
				case StructurePackage.CLASS__GENERAL_CLASSIFIER: return StructurePackage.VALUE_OPTION__GENERAL_CLASSIFIER;
				case StructurePackage.CLASS__OWNED_FEATURE: return StructurePackage.VALUE_OPTION__OWNED_FEATURE;
				case StructurePackage.CLASS__IS_ABSTRACT: return StructurePackage.VALUE_OPTION__IS_ABSTRACT;
				case StructurePackage.CLASS__INHERITED_FEATURE: return StructurePackage.VALUE_OPTION__INHERITED_FEATURE;
				case StructurePackage.CLASS__TYPES_FEATURE: return StructurePackage.VALUE_OPTION__TYPES_FEATURE;
				case StructurePackage.CLASS__FEATURE: return StructurePackage.VALUE_OPTION__FEATURE;
				case StructurePackage.CLASS__INSTANCE_OF: return StructurePackage.VALUE_OPTION__INSTANCE_OF;
				case StructurePackage.CLASS__GENERALIZATION: return StructurePackage.VALUE_OPTION__GENERALIZATION;
				case StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS: return StructurePackage.VALUE_OPTION__NESTED_FEATURE_OF_CLASS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (packageVisibility: ");
		result.append(packageVisibility);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ValueOptionImpl
