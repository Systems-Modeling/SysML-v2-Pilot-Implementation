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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.kerml.core.impl.ContainerImpl;

import org.omg.sysml.kerml.core.visibilityKind;

import org.omg.sysml.kerml.structure.Feature;
import org.omg.sysml.kerml.structure.FeaturePathNode;
import org.omg.sysml.kerml.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getRedefinedFeature <em>Redefined Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getSubsettedFeature <em>Subsetted Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getMethodVisibility <em>Method Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getFeaturePath <em>Feature Path</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getNestingFeature <em>Nesting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getNestedFeature <em>Nested Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getDefiningType <em>Defining Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getRefiningType <em>Refining Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.FeatureImpl#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends ContainerImpl implements Feature {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.kerml.structure.Class> type;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedefinedFeature() <em>Redefined Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> redefinedFeature;

	/**
	 * The cached value of the '{@link #getSubsettedFeature() <em>Subsetted Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> subsettedFeature;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodVisibility() <em>Method Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final visibilityKind METHOD_VISIBILITY_EDEFAULT = visibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getMethodVisibility() <em>Method Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodVisibility()
	 * @generated
	 * @ordered
	 */
	protected visibilityKind methodVisibility = METHOD_VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeaturePath() <em>Feature Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturePath()
	 * @generated
	 * @ordered
	 */
	protected EList<FeaturePathNode> featurePath;

	/**
	 * The cached value of the '{@link #getNestedFeature() <em>Nested Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> nestedFeature;

	/**
	 * The cached value of the '{@link #getDefiningType() <em>Defining Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningType()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.kerml.structure.Class definingType;

	/**
	 * The cached value of the '{@link #getRefiningType() <em>Refining Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefiningType()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.kerml.structure.Class refiningType;

	/**
	 * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedType()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.kerml.structure.Class> ownedType;

	/**
	 * The cached value of the '{@link #getFeaturingClassifier() <em>Featuring Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingClassifier()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.kerml.structure.Class featuringClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.kerml.structure.Class> getType() {
		if (type == null) {
			type = new EObjectWithInverseResolvingEList.ManyInverse<org.omg.sysml.kerml.structure.Class>(org.omg.sysml.kerml.structure.Class.class, this, StructurePackage.FEATURE__TYPE, StructurePackage.CLASS__TYPES_FEATURE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class getClass_() {
		if (eContainerFeatureID() != StructurePackage.FEATURE__CLASS) return null;
		return (org.omg.sysml.kerml.structure.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(org.omg.sysml.kerml.structure.Class newClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClass, StructurePackage.FEATURE__CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(org.omg.sysml.kerml.structure.Class newClass) {
		if (newClass != eInternalContainer() || (eContainerFeatureID() != StructurePackage.FEATURE__CLASS && newClass != null)) {
			if (EcoreUtil.isAncestor(this, newClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, StructurePackage.CLASS__OWNED_FEATURE, org.omg.sysml.kerml.structure.Class.class, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getRedefinedFeature() {
		if (redefinedFeature == null) {
			redefinedFeature = new EObjectResolvingEList<Feature>(Feature.class, this, StructurePackage.FEATURE__REDEFINED_FEATURE);
		}
		return redefinedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getSubsettedFeature() {
		if (subsettedFeature == null) {
			subsettedFeature = new EObjectResolvingEList<Feature>(Feature.class, this, StructurePackage.FEATURE__SUBSETTED_FEATURE);
		}
		return subsettedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public visibilityKind getMethodVisibility() {
		return methodVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodVisibility(visibilityKind newMethodVisibility) {
		visibilityKind oldMethodVisibility = methodVisibility;
		methodVisibility = newMethodVisibility == null ? METHOD_VISIBILITY_EDEFAULT : newMethodVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__METHOD_VISIBILITY, oldMethodVisibility, methodVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class getContext() {
		if (eContainerFeatureID() != StructurePackage.FEATURE__CONTEXT) return null;
		return (org.omg.sysml.kerml.structure.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(org.omg.sysml.kerml.structure.Class newContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContext, StructurePackage.FEATURE__CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(org.omg.sysml.kerml.structure.Class newContext) {
		if (newContext != eInternalContainer() || (eContainerFeatureID() != StructurePackage.FEATURE__CONTEXT && newContext != null)) {
			if (EcoreUtil.isAncestor(this, newContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS, org.omg.sysml.kerml.structure.Class.class, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeaturePathNode> getFeaturePath() {
		if (featurePath == null) {
			featurePath = new EObjectContainmentEList<FeaturePathNode>(FeaturePathNode.class, this, StructurePackage.FEATURE__FEATURE_PATH);
		}
		return featurePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getNestingFeature() {
		if (eContainerFeatureID() != StructurePackage.FEATURE__NESTING_FEATURE) return null;
		return (Feature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingFeature(Feature newNestingFeature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNestingFeature, StructurePackage.FEATURE__NESTING_FEATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingFeature(Feature newNestingFeature) {
		if (newNestingFeature != eInternalContainer() || (eContainerFeatureID() != StructurePackage.FEATURE__NESTING_FEATURE && newNestingFeature != null)) {
			if (EcoreUtil.isAncestor(this, newNestingFeature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNestingFeature != null)
				msgs = ((InternalEObject)newNestingFeature).eInverseAdd(this, StructurePackage.FEATURE__NESTED_FEATURE, Feature.class, msgs);
			msgs = basicSetNestingFeature(newNestingFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__NESTING_FEATURE, newNestingFeature, newNestingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getNestedFeature() {
		if (nestedFeature == null) {
			nestedFeature = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, StructurePackage.FEATURE__NESTED_FEATURE, StructurePackage.FEATURE__NESTING_FEATURE);
		}
		return nestedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class getDefiningType() {
		if (definingType != null && definingType.eIsProxy()) {
			InternalEObject oldDefiningType = (InternalEObject)definingType;
			definingType = (org.omg.sysml.kerml.structure.Class)eResolveProxy(oldDefiningType);
			if (definingType != oldDefiningType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.FEATURE__DEFINING_TYPE, oldDefiningType, definingType));
			}
		}
		return definingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class basicGetDefiningType() {
		return definingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningType(org.omg.sysml.kerml.structure.Class newDefiningType) {
		org.omg.sysml.kerml.structure.Class oldDefiningType = definingType;
		definingType = newDefiningType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__DEFINING_TYPE, oldDefiningType, definingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class getRefiningType() {
		if (refiningType != null && refiningType.eIsProxy()) {
			InternalEObject oldRefiningType = (InternalEObject)refiningType;
			refiningType = (org.omg.sysml.kerml.structure.Class)eResolveProxy(oldRefiningType);
			if (refiningType != oldRefiningType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.FEATURE__REFINING_TYPE, oldRefiningType, refiningType));
			}
		}
		return refiningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class basicGetRefiningType() {
		return refiningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefiningType(org.omg.sysml.kerml.structure.Class newRefiningType) {
		org.omg.sysml.kerml.structure.Class oldRefiningType = refiningType;
		refiningType = newRefiningType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__REFINING_TYPE, oldRefiningType, refiningType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.kerml.structure.Class> getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectContainmentEList<org.omg.sysml.kerml.structure.Class>(org.omg.sysml.kerml.structure.Class.class, this, StructurePackage.FEATURE__OWNED_TYPE);
		}
		return ownedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class getFeaturingClassifier() {
		if (featuringClassifier != null && featuringClassifier.eIsProxy()) {
			InternalEObject oldFeaturingClassifier = (InternalEObject)featuringClassifier;
			featuringClassifier = (org.omg.sysml.kerml.structure.Class)eResolveProxy(oldFeaturingClassifier);
			if (featuringClassifier != oldFeaturingClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.FEATURE__FEATURING_CLASSIFIER, oldFeaturingClassifier, featuringClassifier));
			}
		}
		return featuringClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class basicGetFeaturingClassifier() {
		return featuringClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeaturingClassifier(org.omg.sysml.kerml.structure.Class newFeaturingClassifier, NotificationChain msgs) {
		org.omg.sysml.kerml.structure.Class oldFeaturingClassifier = featuringClassifier;
		featuringClassifier = newFeaturingClassifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__FEATURING_CLASSIFIER, oldFeaturingClassifier, newFeaturingClassifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturingClassifier(org.omg.sysml.kerml.structure.Class newFeaturingClassifier) {
		if (newFeaturingClassifier != featuringClassifier) {
			NotificationChain msgs = null;
			if (featuringClassifier != null)
				msgs = ((InternalEObject)featuringClassifier).eInverseRemove(this, StructurePackage.CLASS__FEATURE, org.omg.sysml.kerml.structure.Class.class, msgs);
			if (newFeaturingClassifier != null)
				msgs = ((InternalEObject)newFeaturingClassifier).eInverseAdd(this, StructurePackage.CLASS__FEATURE, org.omg.sysml.kerml.structure.Class.class, msgs);
			msgs = basicSetFeaturingClassifier(newFeaturingClassifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.FEATURE__FEATURING_CLASSIFIER, newFeaturingClassifier, newFeaturingClassifier));
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
			case StructurePackage.FEATURE__TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getType()).basicAdd(otherEnd, msgs);
			case StructurePackage.FEATURE__CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClass((org.omg.sysml.kerml.structure.Class)otherEnd, msgs);
			case StructurePackage.FEATURE__CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContext((org.omg.sysml.kerml.structure.Class)otherEnd, msgs);
			case StructurePackage.FEATURE__NESTING_FEATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNestingFeature((Feature)otherEnd, msgs);
			case StructurePackage.FEATURE__NESTED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedFeature()).basicAdd(otherEnd, msgs);
			case StructurePackage.FEATURE__FEATURING_CLASSIFIER:
				if (featuringClassifier != null)
					msgs = ((InternalEObject)featuringClassifier).eInverseRemove(this, StructurePackage.CLASS__FEATURE, org.omg.sysml.kerml.structure.Class.class, msgs);
				return basicSetFeaturingClassifier((org.omg.sysml.kerml.structure.Class)otherEnd, msgs);
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
			case StructurePackage.FEATURE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case StructurePackage.FEATURE__CLASS:
				return basicSetClass(null, msgs);
			case StructurePackage.FEATURE__CONTEXT:
				return basicSetContext(null, msgs);
			case StructurePackage.FEATURE__FEATURE_PATH:
				return ((InternalEList<?>)getFeaturePath()).basicRemove(otherEnd, msgs);
			case StructurePackage.FEATURE__NESTING_FEATURE:
				return basicSetNestingFeature(null, msgs);
			case StructurePackage.FEATURE__NESTED_FEATURE:
				return ((InternalEList<?>)getNestedFeature()).basicRemove(otherEnd, msgs);
			case StructurePackage.FEATURE__OWNED_TYPE:
				return ((InternalEList<?>)getOwnedType()).basicRemove(otherEnd, msgs);
			case StructurePackage.FEATURE__FEATURING_CLASSIFIER:
				return basicSetFeaturingClassifier(null, msgs);
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
			case StructurePackage.FEATURE__CLASS:
				return eInternalContainer().eInverseRemove(this, StructurePackage.CLASS__OWNED_FEATURE, org.omg.sysml.kerml.structure.Class.class, msgs);
			case StructurePackage.FEATURE__CONTEXT:
				return eInternalContainer().eInverseRemove(this, StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS, org.omg.sysml.kerml.structure.Class.class, msgs);
			case StructurePackage.FEATURE__NESTING_FEATURE:
				return eInternalContainer().eInverseRemove(this, StructurePackage.FEATURE__NESTED_FEATURE, Feature.class, msgs);
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
			case StructurePackage.FEATURE__TYPE:
				return getType();
			case StructurePackage.FEATURE__UPPER:
				return getUpper();
			case StructurePackage.FEATURE__LOWER:
				return getLower();
			case StructurePackage.FEATURE__CLASS:
				return getClass_();
			case StructurePackage.FEATURE__REDEFINED_FEATURE:
				return getRedefinedFeature();
			case StructurePackage.FEATURE__SUBSETTED_FEATURE:
				return getSubsettedFeature();
			case StructurePackage.FEATURE__IS_DERIVED:
				return isIsDerived();
			case StructurePackage.FEATURE__IS_UNIQUE:
				return isIsUnique();
			case StructurePackage.FEATURE__IS_READ_ONLY:
				return isIsReadOnly();
			case StructurePackage.FEATURE__IS_ORDERED:
				return isIsOrdered();
			case StructurePackage.FEATURE__METHOD_VISIBILITY:
				return getMethodVisibility();
			case StructurePackage.FEATURE__CONTEXT:
				return getContext();
			case StructurePackage.FEATURE__FEATURE_PATH:
				return getFeaturePath();
			case StructurePackage.FEATURE__NESTING_FEATURE:
				return getNestingFeature();
			case StructurePackage.FEATURE__NESTED_FEATURE:
				return getNestedFeature();
			case StructurePackage.FEATURE__DEFINING_TYPE:
				if (resolve) return getDefiningType();
				return basicGetDefiningType();
			case StructurePackage.FEATURE__REFINING_TYPE:
				if (resolve) return getRefiningType();
				return basicGetRefiningType();
			case StructurePackage.FEATURE__OWNED_TYPE:
				return getOwnedType();
			case StructurePackage.FEATURE__FEATURING_CLASSIFIER:
				if (resolve) return getFeaturingClassifier();
				return basicGetFeaturingClassifier();
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
			case StructurePackage.FEATURE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends org.omg.sysml.kerml.structure.Class>)newValue);
				return;
			case StructurePackage.FEATURE__UPPER:
				setUpper((Integer)newValue);
				return;
			case StructurePackage.FEATURE__LOWER:
				setLower((Integer)newValue);
				return;
			case StructurePackage.FEATURE__CLASS:
				setClass((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.FEATURE__REDEFINED_FEATURE:
				getRedefinedFeature().clear();
				getRedefinedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.FEATURE__SUBSETTED_FEATURE:
				getSubsettedFeature().clear();
				getSubsettedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.FEATURE__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case StructurePackage.FEATURE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case StructurePackage.FEATURE__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case StructurePackage.FEATURE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case StructurePackage.FEATURE__METHOD_VISIBILITY:
				setMethodVisibility((visibilityKind)newValue);
				return;
			case StructurePackage.FEATURE__CONTEXT:
				setContext((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.FEATURE__FEATURE_PATH:
				getFeaturePath().clear();
				getFeaturePath().addAll((Collection<? extends FeaturePathNode>)newValue);
				return;
			case StructurePackage.FEATURE__NESTING_FEATURE:
				setNestingFeature((Feature)newValue);
				return;
			case StructurePackage.FEATURE__NESTED_FEATURE:
				getNestedFeature().clear();
				getNestedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.FEATURE__DEFINING_TYPE:
				setDefiningType((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.FEATURE__REFINING_TYPE:
				setRefiningType((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.FEATURE__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends org.omg.sysml.kerml.structure.Class>)newValue);
				return;
			case StructurePackage.FEATURE__FEATURING_CLASSIFIER:
				setFeaturingClassifier((org.omg.sysml.kerml.structure.Class)newValue);
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
			case StructurePackage.FEATURE__TYPE:
				getType().clear();
				return;
			case StructurePackage.FEATURE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case StructurePackage.FEATURE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case StructurePackage.FEATURE__CLASS:
				setClass((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.FEATURE__REDEFINED_FEATURE:
				getRedefinedFeature().clear();
				return;
			case StructurePackage.FEATURE__SUBSETTED_FEATURE:
				getSubsettedFeature().clear();
				return;
			case StructurePackage.FEATURE__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case StructurePackage.FEATURE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case StructurePackage.FEATURE__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case StructurePackage.FEATURE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case StructurePackage.FEATURE__METHOD_VISIBILITY:
				setMethodVisibility(METHOD_VISIBILITY_EDEFAULT);
				return;
			case StructurePackage.FEATURE__CONTEXT:
				setContext((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.FEATURE__FEATURE_PATH:
				getFeaturePath().clear();
				return;
			case StructurePackage.FEATURE__NESTING_FEATURE:
				setNestingFeature((Feature)null);
				return;
			case StructurePackage.FEATURE__NESTED_FEATURE:
				getNestedFeature().clear();
				return;
			case StructurePackage.FEATURE__DEFINING_TYPE:
				setDefiningType((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.FEATURE__REFINING_TYPE:
				setRefiningType((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.FEATURE__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case StructurePackage.FEATURE__FEATURING_CLASSIFIER:
				setFeaturingClassifier((org.omg.sysml.kerml.structure.Class)null);
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
			case StructurePackage.FEATURE__TYPE:
				return type != null && !type.isEmpty();
			case StructurePackage.FEATURE__UPPER:
				return upper != UPPER_EDEFAULT;
			case StructurePackage.FEATURE__LOWER:
				return lower != LOWER_EDEFAULT;
			case StructurePackage.FEATURE__CLASS:
				return getClass_() != null;
			case StructurePackage.FEATURE__REDEFINED_FEATURE:
				return redefinedFeature != null && !redefinedFeature.isEmpty();
			case StructurePackage.FEATURE__SUBSETTED_FEATURE:
				return subsettedFeature != null && !subsettedFeature.isEmpty();
			case StructurePackage.FEATURE__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case StructurePackage.FEATURE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case StructurePackage.FEATURE__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case StructurePackage.FEATURE__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case StructurePackage.FEATURE__METHOD_VISIBILITY:
				return methodVisibility != METHOD_VISIBILITY_EDEFAULT;
			case StructurePackage.FEATURE__CONTEXT:
				return getContext() != null;
			case StructurePackage.FEATURE__FEATURE_PATH:
				return featurePath != null && !featurePath.isEmpty();
			case StructurePackage.FEATURE__NESTING_FEATURE:
				return getNestingFeature() != null;
			case StructurePackage.FEATURE__NESTED_FEATURE:
				return nestedFeature != null && !nestedFeature.isEmpty();
			case StructurePackage.FEATURE__DEFINING_TYPE:
				return definingType != null;
			case StructurePackage.FEATURE__REFINING_TYPE:
				return refiningType != null;
			case StructurePackage.FEATURE__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case StructurePackage.FEATURE__FEATURING_CLASSIFIER:
				return featuringClassifier != null;
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
		result.append(" (upper: ");
		result.append(upper);
		result.append(", lower: ");
		result.append(lower);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", methodVisibility: ");
		result.append(methodVisibility);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
