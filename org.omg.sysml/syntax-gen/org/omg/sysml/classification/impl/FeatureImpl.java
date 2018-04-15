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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.behaviors.Expression;

import org.omg.sysml.classification.ClassificationPackage;
import org.omg.sysml.classification.Feature;

import org.omg.sysml.groups.impl.NamespaceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#getFeaturingClasses <em>Featuring Classes</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#getReferencedType <em>Referenced Type</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#getRedefinedFeature <em>Redefined Feature</em>}</li>
 *   <li>{@link org.omg.sysml.classification.impl.FeatureImpl#getSubsettedFeature <em>Subsetted Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends NamespaceImpl implements Feature {
	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Expression lower;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Expression upper;

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
	 * The cached value of the '{@link #getFeaturingClasses() <em>Featuring Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.classification.Class> featuringClasses;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.classification.Class> type;

	/**
	 * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedType()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.classification.Class> ownedType;

	/**
	 * The cached value of the '{@link #getReferencedType() <em>Referenced Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedType()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.classification.Class> referencedType;

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
		return ClassificationPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLower() {
		if (lower != null && lower.eIsProxy()) {
			InternalEObject oldLower = (InternalEObject)lower;
			lower = (Expression)eResolveProxy(oldLower);
			if (lower != oldLower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.FEATURE__LOWER, oldLower, lower));
			}
		}
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(Expression newLower) {
		Expression oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.FEATURE__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getUpper() {
		if (upper != null && upper.eIsProxy()) {
			InternalEObject oldUpper = (InternalEObject)upper;
			upper = (Expression)eResolveProxy(oldUpper);
			if (upper != oldUpper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.FEATURE__UPPER, oldUpper, upper));
			}
		}
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(Expression newUpper) {
		Expression oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.FEATURE__UPPER, oldUpper, upper));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.FEATURE__IS_DERIVED, oldIsDerived, isDerived));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.FEATURE__IS_UNIQUE, oldIsUnique, isUnique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.FEATURE__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.FEATURE__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.classification.Class> getFeaturingClasses() {
		if (featuringClasses == null) {
			featuringClasses = new EObjectWithInverseResolvingEList.ManyInverse<org.omg.sysml.classification.Class>(org.omg.sysml.classification.Class.class, this, ClassificationPackage.FEATURE__FEATURING_CLASSES, ClassificationPackage.CLASS__FEATURE);
		}
		return featuringClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.classification.Class getClass_() {
		if (eContainerFeatureID() != ClassificationPackage.FEATURE__CLASS) return null;
		return (org.omg.sysml.classification.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(org.omg.sysml.classification.Class newClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClass, ClassificationPackage.FEATURE__CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(org.omg.sysml.classification.Class newClass) {
		if (newClass != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.FEATURE__CLASS && newClass != null)) {
			if (EcoreUtil.isAncestor(this, newClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, ClassificationPackage.CLASS__OWNED_FEATURE, org.omg.sysml.classification.Class.class, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.FEATURE__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.classification.Class> getType() {
		if (type == null) {
			type = new EObjectWithInverseResolvingEList.ManyInverse<org.omg.sysml.classification.Class>(org.omg.sysml.classification.Class.class, this, ClassificationPackage.FEATURE__TYPE, ClassificationPackage.CLASS__TYPED_FEATURE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.classification.Class> getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectContainmentEList<org.omg.sysml.classification.Class>(org.omg.sysml.classification.Class.class, this, ClassificationPackage.FEATURE__OWNED_TYPE);
		}
		return ownedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.classification.Class> getReferencedType() {
		if (referencedType == null) {
			referencedType = new EObjectResolvingEList<org.omg.sysml.classification.Class>(org.omg.sysml.classification.Class.class, this, ClassificationPackage.FEATURE__REFERENCED_TYPE);
		}
		return referencedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getRedefinedFeature() {
		if (redefinedFeature == null) {
			redefinedFeature = new EObjectResolvingEList<Feature>(Feature.class, this, ClassificationPackage.FEATURE__REDEFINED_FEATURE);
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
			subsettedFeature = new EObjectResolvingEList<Feature>(Feature.class, this, ClassificationPackage.FEATURE__SUBSETTED_FEATURE);
		}
		return subsettedFeature;
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
			case ClassificationPackage.FEATURE__FEATURING_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeaturingClasses()).basicAdd(otherEnd, msgs);
			case ClassificationPackage.FEATURE__CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClass((org.omg.sysml.classification.Class)otherEnd, msgs);
			case ClassificationPackage.FEATURE__TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getType()).basicAdd(otherEnd, msgs);
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
			case ClassificationPackage.FEATURE__FEATURING_CLASSES:
				return ((InternalEList<?>)getFeaturingClasses()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.FEATURE__CLASS:
				return basicSetClass(null, msgs);
			case ClassificationPackage.FEATURE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.FEATURE__OWNED_TYPE:
				return ((InternalEList<?>)getOwnedType()).basicRemove(otherEnd, msgs);
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
			case ClassificationPackage.FEATURE__CLASS:
				return eInternalContainer().eInverseRemove(this, ClassificationPackage.CLASS__OWNED_FEATURE, org.omg.sysml.classification.Class.class, msgs);
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
			case ClassificationPackage.FEATURE__LOWER:
				if (resolve) return getLower();
				return basicGetLower();
			case ClassificationPackage.FEATURE__UPPER:
				if (resolve) return getUpper();
				return basicGetUpper();
			case ClassificationPackage.FEATURE__IS_DERIVED:
				return isIsDerived();
			case ClassificationPackage.FEATURE__IS_UNIQUE:
				return isIsUnique();
			case ClassificationPackage.FEATURE__IS_READ_ONLY:
				return isIsReadOnly();
			case ClassificationPackage.FEATURE__IS_ORDERED:
				return isIsOrdered();
			case ClassificationPackage.FEATURE__FEATURING_CLASSES:
				return getFeaturingClasses();
			case ClassificationPackage.FEATURE__CLASS:
				return getClass_();
			case ClassificationPackage.FEATURE__TYPE:
				return getType();
			case ClassificationPackage.FEATURE__OWNED_TYPE:
				return getOwnedType();
			case ClassificationPackage.FEATURE__REFERENCED_TYPE:
				return getReferencedType();
			case ClassificationPackage.FEATURE__REDEFINED_FEATURE:
				return getRedefinedFeature();
			case ClassificationPackage.FEATURE__SUBSETTED_FEATURE:
				return getSubsettedFeature();
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
			case ClassificationPackage.FEATURE__LOWER:
				setLower((Expression)newValue);
				return;
			case ClassificationPackage.FEATURE__UPPER:
				setUpper((Expression)newValue);
				return;
			case ClassificationPackage.FEATURE__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case ClassificationPackage.FEATURE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case ClassificationPackage.FEATURE__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case ClassificationPackage.FEATURE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case ClassificationPackage.FEATURE__FEATURING_CLASSES:
				getFeaturingClasses().clear();
				getFeaturingClasses().addAll((Collection<? extends org.omg.sysml.classification.Class>)newValue);
				return;
			case ClassificationPackage.FEATURE__CLASS:
				setClass((org.omg.sysml.classification.Class)newValue);
				return;
			case ClassificationPackage.FEATURE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends org.omg.sysml.classification.Class>)newValue);
				return;
			case ClassificationPackage.FEATURE__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends org.omg.sysml.classification.Class>)newValue);
				return;
			case ClassificationPackage.FEATURE__REFERENCED_TYPE:
				getReferencedType().clear();
				getReferencedType().addAll((Collection<? extends org.omg.sysml.classification.Class>)newValue);
				return;
			case ClassificationPackage.FEATURE__REDEFINED_FEATURE:
				getRedefinedFeature().clear();
				getRedefinedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case ClassificationPackage.FEATURE__SUBSETTED_FEATURE:
				getSubsettedFeature().clear();
				getSubsettedFeature().addAll((Collection<? extends Feature>)newValue);
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
			case ClassificationPackage.FEATURE__LOWER:
				setLower((Expression)null);
				return;
			case ClassificationPackage.FEATURE__UPPER:
				setUpper((Expression)null);
				return;
			case ClassificationPackage.FEATURE__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case ClassificationPackage.FEATURE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case ClassificationPackage.FEATURE__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case ClassificationPackage.FEATURE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case ClassificationPackage.FEATURE__FEATURING_CLASSES:
				getFeaturingClasses().clear();
				return;
			case ClassificationPackage.FEATURE__CLASS:
				setClass((org.omg.sysml.classification.Class)null);
				return;
			case ClassificationPackage.FEATURE__TYPE:
				getType().clear();
				return;
			case ClassificationPackage.FEATURE__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case ClassificationPackage.FEATURE__REFERENCED_TYPE:
				getReferencedType().clear();
				return;
			case ClassificationPackage.FEATURE__REDEFINED_FEATURE:
				getRedefinedFeature().clear();
				return;
			case ClassificationPackage.FEATURE__SUBSETTED_FEATURE:
				getSubsettedFeature().clear();
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
			case ClassificationPackage.FEATURE__LOWER:
				return lower != null;
			case ClassificationPackage.FEATURE__UPPER:
				return upper != null;
			case ClassificationPackage.FEATURE__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case ClassificationPackage.FEATURE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case ClassificationPackage.FEATURE__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case ClassificationPackage.FEATURE__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case ClassificationPackage.FEATURE__FEATURING_CLASSES:
				return featuringClasses != null && !featuringClasses.isEmpty();
			case ClassificationPackage.FEATURE__CLASS:
				return getClass_() != null;
			case ClassificationPackage.FEATURE__TYPE:
				return type != null && !type.isEmpty();
			case ClassificationPackage.FEATURE__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case ClassificationPackage.FEATURE__REFERENCED_TYPE:
				return referencedType != null && !referencedType.isEmpty();
			case ClassificationPackage.FEATURE__REDEFINED_FEATURE:
				return redefinedFeature != null && !redefinedFeature.isEmpty();
			case ClassificationPackage.FEATURE__SUBSETTED_FEATURE:
				return subsettedFeature != null && !subsettedFeature.isEmpty();
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
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
