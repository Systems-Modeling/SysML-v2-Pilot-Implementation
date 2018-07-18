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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subset;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getReferencedType <em>Referenced Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getNestedFeature <em>Nested Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getNestingFeature <em>Nesting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedSubset <em>Owned Subset</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getParticipantOfAssociation <em>Participant Of Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningFeatureMembership <em>Owning Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getEndOfAssociation <em>End Of Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isIsComposite <em>Is Composite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends ClassImpl implements Feature {
	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Expression lower;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Expression upper;

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
	 * The cached value of the '{@link #getOwningClass() <em>Owning Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningClass()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Class owningClass;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.lang.sysml.Class> type;

	/**
	 * The cached value of the '{@link #getReferencedType() <em>Referenced Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedType()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.lang.sysml.Class> referencedType;

	/**
	 * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedType()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.lang.sysml.Class> ownedType;

	/**
	 * The cached value of the '{@link #getNestedFeature() <em>Nested Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> nestedFeature;

	/**
	 * The cached value of the '{@link #getNestingFeature() <em>Nesting Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestingFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> nestingFeature;

	/**
	 * The cached value of the '{@link #getOwnedRedefinition() <em>Owned Redefinition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRedefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Redefinition> ownedRedefinition;

	/**
	 * The cached value of the '{@link #getOwnedSubset() <em>Owned Subset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubset()
	 * @generated
	 * @ordered
	 */
	protected EList<Subset> ownedSubset;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

	/**
	 * The cached value of the '{@link #getParticipantOfAssociation() <em>Participant Of Association</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantOfAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> participantOfAssociation;

	/**
	 * The cached value of the '{@link #getEndOfAssociation() <em>End Of Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association endOfAssociation;

	/**
	 * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

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
		return SysMLPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLower(Expression newLower, NotificationChain msgs) {
		Expression oldLower = lower;
		lower = newLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__LOWER, oldLower, newLower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(Expression newLower) {
		if (newLower != lower) {
			NotificationChain msgs = null;
			if (lower != null)
				msgs = ((InternalEObject)lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.FEATURE__LOWER, null, msgs);
			if (newLower != null)
				msgs = ((InternalEObject)newLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.FEATURE__LOWER, null, msgs);
			msgs = basicSetLower(newLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__LOWER, newLower, newLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpper(Expression newUpper, NotificationChain msgs) {
		Expression oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__UPPER, oldUpper, newUpper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(Expression newUpper) {
		if (newUpper != upper) {
			NotificationChain msgs = null;
			if (upper != null)
				msgs = ((InternalEObject)upper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.FEATURE__UPPER, null, msgs);
			if (newUpper != null)
				msgs = ((InternalEObject)newUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.FEATURE__UPPER, null, msgs);
			msgs = basicSetUpper(newUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__UPPER, newUpper, newUpper));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__IS_UNIQUE, oldIsUnique, isUnique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class getOwningClass() {
		if (owningClass != null && owningClass.eIsProxy()) {
			InternalEObject oldOwningClass = (InternalEObject)owningClass;
			owningClass = (org.omg.sysml.lang.sysml.Class)eResolveProxy(oldOwningClass);
			if (owningClass != oldOwningClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE__OWNING_CLASS, oldOwningClass, owningClass));
			}
		}
		return owningClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class basicGetOwningClass() {
		return owningClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningClass(org.omg.sysml.lang.sysml.Class newOwningClass, NotificationChain msgs) {
		org.omg.sysml.lang.sysml.Class oldOwningClass = owningClass;
		owningClass = newOwningClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__OWNING_CLASS, oldOwningClass, newOwningClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningClass(org.omg.sysml.lang.sysml.Class newOwningClass) {
		if (newOwningClass != owningClass) {
			NotificationChain msgs = null;
			if (owningClass != null)
				msgs = ((InternalEObject)owningClass).eInverseRemove(this, SysMLPackage.CLASS__OWNED_FEATURE, org.omg.sysml.lang.sysml.Class.class, msgs);
			if (newOwningClass != null)
				msgs = ((InternalEObject)newOwningClass).eInverseAdd(this, SysMLPackage.CLASS__OWNED_FEATURE, org.omg.sysml.lang.sysml.Class.class, msgs);
			msgs = basicSetOwningClass(newOwningClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__OWNING_CLASS, newOwningClass, newOwningClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.lang.sysml.Class> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<org.omg.sysml.lang.sysml.Class>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.FEATURE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.lang.sysml.Class> getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectWithInverseResolvingEList<org.omg.sysml.lang.sysml.Class>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.FEATURE__OWNED_TYPE, SysMLPackage.CLASS__OWNING_FEATURE);
		}
		return ownedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.lang.sysml.Class> getReferencedType() {
		if (referencedType == null) {
			referencedType = new EObjectResolvingEList<org.omg.sysml.lang.sysml.Class>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.FEATURE__REFERENCED_TYPE);
		}
		return referencedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getNestedFeature() {
		if (nestedFeature == null) {
			nestedFeature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, SysMLPackage.FEATURE__NESTED_FEATURE, SysMLPackage.FEATURE__NESTING_FEATURE);
		}
		return nestedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getNestingFeature() {
		if (nestingFeature == null) {
			nestingFeature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, SysMLPackage.FEATURE__NESTING_FEATURE, SysMLPackage.FEATURE__NESTED_FEATURE);
		}
		return nestingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Redefinition> getOwnedRedefinition() {
		if (ownedRedefinition == null) {
			ownedRedefinition = new EObjectResolvingEList<Redefinition>(Redefinition.class, this, SysMLPackage.FEATURE__OWNED_REDEFINITION);
		}
		return ownedRedefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subset> getOwnedSubset() {
		if (ownedSubset == null) {
			ownedSubset = new EObjectWithInverseResolvingEList<Subset>(Subset.class, this, SysMLPackage.FEATURE__OWNED_SUBSET, SysMLPackage.SUBSET__OWNING_FEATURE);
		}
		return ownedSubset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		Expression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.FEATURE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.FEATURE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getParticipantOfAssociation() {
		if (participantOfAssociation == null) {
			participantOfAssociation = new EObjectWithInverseResolvingEList.ManyInverse<Association>(Association.class, this, SysMLPackage.FEATURE__PARTICIPANT_OF_ASSOCIATION, SysMLPackage.ASSOCIATION__PARTICIPANT_FEATURE);
		}
		return participantOfAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMembership getOwningFeatureMembership() {
		if (eContainerFeatureID() != SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP) return null;
		return (FeatureMembership)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningFeatureMembership(FeatureMembership newOwningFeatureMembership, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningFeatureMembership, SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFeatureMembership(FeatureMembership newOwningFeatureMembership) {
		if (newOwningFeatureMembership != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP && newOwningFeatureMembership != null)) {
			if (EcoreUtil.isAncestor(this, newOwningFeatureMembership))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningFeatureMembership != null)
				msgs = ((InternalEObject)newOwningFeatureMembership).eInverseAdd(this, SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT, FeatureMembership.class, msgs);
			msgs = basicSetOwningFeatureMembership(newOwningFeatureMembership, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP, newOwningFeatureMembership, newOwningFeatureMembership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getEndOfAssociation() {
		if (endOfAssociation != null && endOfAssociation.eIsProxy()) {
			InternalEObject oldEndOfAssociation = (InternalEObject)endOfAssociation;
			endOfAssociation = (Association)eResolveProxy(oldEndOfAssociation);
			if (endOfAssociation != oldEndOfAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE__END_OF_ASSOCIATION, oldEndOfAssociation, endOfAssociation));
			}
		}
		return endOfAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetEndOfAssociation() {
		return endOfAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndOfAssociation(Association newEndOfAssociation, NotificationChain msgs) {
		Association oldEndOfAssociation = endOfAssociation;
		endOfAssociation = newEndOfAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__END_OF_ASSOCIATION, oldEndOfAssociation, newEndOfAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOfAssociation(Association newEndOfAssociation) {
		if (newEndOfAssociation != endOfAssociation) {
			NotificationChain msgs = null;
			if (endOfAssociation != null)
				msgs = ((InternalEObject)endOfAssociation).eInverseRemove(this, SysMLPackage.ASSOCIATION__END_FEATURE, Association.class, msgs);
			if (newEndOfAssociation != null)
				msgs = ((InternalEObject)newEndOfAssociation).eInverseAdd(this, SysMLPackage.ASSOCIATION__END_FEATURE, Association.class, msgs);
			msgs = basicSetEndOfAssociation(newEndOfAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__END_OF_ASSOCIATION, newEndOfAssociation, newEndOfAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(boolean newIsComposite) {
		boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__IS_COMPOSITE, oldIsComposite, isComposite));
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
			case SysMLPackage.FEATURE__OWNING_CLASS:
				if (owningClass != null)
					msgs = ((InternalEObject)owningClass).eInverseRemove(this, SysMLPackage.CLASS__OWNED_FEATURE, org.omg.sysml.lang.sysml.Class.class, msgs);
				return basicSetOwningClass((org.omg.sysml.lang.sysml.Class)otherEnd, msgs);
			case SysMLPackage.FEATURE__OWNED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedType()).basicAdd(otherEnd, msgs);
			case SysMLPackage.FEATURE__NESTED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedFeature()).basicAdd(otherEnd, msgs);
			case SysMLPackage.FEATURE__NESTING_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestingFeature()).basicAdd(otherEnd, msgs);
			case SysMLPackage.FEATURE__OWNED_SUBSET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedSubset()).basicAdd(otherEnd, msgs);
			case SysMLPackage.FEATURE__PARTICIPANT_OF_ASSOCIATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipantOfAssociation()).basicAdd(otherEnd, msgs);
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningFeatureMembership((FeatureMembership)otherEnd, msgs);
			case SysMLPackage.FEATURE__END_OF_ASSOCIATION:
				if (endOfAssociation != null)
					msgs = ((InternalEObject)endOfAssociation).eInverseRemove(this, SysMLPackage.ASSOCIATION__END_FEATURE, Association.class, msgs);
				return basicSetEndOfAssociation((Association)otherEnd, msgs);
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
			case SysMLPackage.FEATURE__LOWER:
				return basicSetLower(null, msgs);
			case SysMLPackage.FEATURE__UPPER:
				return basicSetUpper(null, msgs);
			case SysMLPackage.FEATURE__OWNING_CLASS:
				return basicSetOwningClass(null, msgs);
			case SysMLPackage.FEATURE__OWNED_TYPE:
				return ((InternalEList<?>)getOwnedType()).basicRemove(otherEnd, msgs);
			case SysMLPackage.FEATURE__NESTED_FEATURE:
				return ((InternalEList<?>)getNestedFeature()).basicRemove(otherEnd, msgs);
			case SysMLPackage.FEATURE__NESTING_FEATURE:
				return ((InternalEList<?>)getNestingFeature()).basicRemove(otherEnd, msgs);
			case SysMLPackage.FEATURE__OWNED_SUBSET:
				return ((InternalEList<?>)getOwnedSubset()).basicRemove(otherEnd, msgs);
			case SysMLPackage.FEATURE__VALUE:
				return basicSetValue(null, msgs);
			case SysMLPackage.FEATURE__PARTICIPANT_OF_ASSOCIATION:
				return ((InternalEList<?>)getParticipantOfAssociation()).basicRemove(otherEnd, msgs);
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				return basicSetOwningFeatureMembership(null, msgs);
			case SysMLPackage.FEATURE__END_OF_ASSOCIATION:
				return basicSetEndOfAssociation(null, msgs);
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
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT, FeatureMembership.class, msgs);
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
			case SysMLPackage.FEATURE__LOWER:
				return getLower();
			case SysMLPackage.FEATURE__UPPER:
				return getUpper();
			case SysMLPackage.FEATURE__IS_UNIQUE:
				return isIsUnique();
			case SysMLPackage.FEATURE__IS_ORDERED:
				return isIsOrdered();
			case SysMLPackage.FEATURE__OWNING_CLASS:
				if (resolve) return getOwningClass();
				return basicGetOwningClass();
			case SysMLPackage.FEATURE__TYPE:
				return getType();
			case SysMLPackage.FEATURE__REFERENCED_TYPE:
				return getReferencedType();
			case SysMLPackage.FEATURE__OWNED_TYPE:
				return getOwnedType();
			case SysMLPackage.FEATURE__NESTED_FEATURE:
				return getNestedFeature();
			case SysMLPackage.FEATURE__NESTING_FEATURE:
				return getNestingFeature();
			case SysMLPackage.FEATURE__OWNED_REDEFINITION:
				return getOwnedRedefinition();
			case SysMLPackage.FEATURE__OWNED_SUBSET:
				return getOwnedSubset();
			case SysMLPackage.FEATURE__VALUE:
				return getValue();
			case SysMLPackage.FEATURE__PARTICIPANT_OF_ASSOCIATION:
				return getParticipantOfAssociation();
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				return getOwningFeatureMembership();
			case SysMLPackage.FEATURE__END_OF_ASSOCIATION:
				if (resolve) return getEndOfAssociation();
				return basicGetEndOfAssociation();
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				return isIsComposite();
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
			case SysMLPackage.FEATURE__LOWER:
				setLower((Expression)newValue);
				return;
			case SysMLPackage.FEATURE__UPPER:
				setUpper((Expression)newValue);
				return;
			case SysMLPackage.FEATURE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__OWNING_CLASS:
				setOwningClass((org.omg.sysml.lang.sysml.Class)newValue);
				return;
			case SysMLPackage.FEATURE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
				return;
			case SysMLPackage.FEATURE__REFERENCED_TYPE:
				getReferencedType().clear();
				getReferencedType().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
				return;
			case SysMLPackage.FEATURE__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
				return;
			case SysMLPackage.FEATURE__NESTED_FEATURE:
				getNestedFeature().clear();
				getNestedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.FEATURE__NESTING_FEATURE:
				getNestingFeature().clear();
				getNestingFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.FEATURE__OWNED_REDEFINITION:
				getOwnedRedefinition().clear();
				getOwnedRedefinition().addAll((Collection<? extends Redefinition>)newValue);
				return;
			case SysMLPackage.FEATURE__OWNED_SUBSET:
				getOwnedSubset().clear();
				getOwnedSubset().addAll((Collection<? extends Subset>)newValue);
				return;
			case SysMLPackage.FEATURE__VALUE:
				setValue((Expression)newValue);
				return;
			case SysMLPackage.FEATURE__PARTICIPANT_OF_ASSOCIATION:
				getParticipantOfAssociation().clear();
				getParticipantOfAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				setOwningFeatureMembership((FeatureMembership)newValue);
				return;
			case SysMLPackage.FEATURE__END_OF_ASSOCIATION:
				setEndOfAssociation((Association)newValue);
				return;
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
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
			case SysMLPackage.FEATURE__LOWER:
				setLower((Expression)null);
				return;
			case SysMLPackage.FEATURE__UPPER:
				setUpper((Expression)null);
				return;
			case SysMLPackage.FEATURE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__OWNING_CLASS:
				setOwningClass((org.omg.sysml.lang.sysml.Class)null);
				return;
			case SysMLPackage.FEATURE__TYPE:
				getType().clear();
				return;
			case SysMLPackage.FEATURE__REFERENCED_TYPE:
				getReferencedType().clear();
				return;
			case SysMLPackage.FEATURE__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case SysMLPackage.FEATURE__NESTED_FEATURE:
				getNestedFeature().clear();
				return;
			case SysMLPackage.FEATURE__NESTING_FEATURE:
				getNestingFeature().clear();
				return;
			case SysMLPackage.FEATURE__OWNED_REDEFINITION:
				getOwnedRedefinition().clear();
				return;
			case SysMLPackage.FEATURE__OWNED_SUBSET:
				getOwnedSubset().clear();
				return;
			case SysMLPackage.FEATURE__VALUE:
				setValue((Expression)null);
				return;
			case SysMLPackage.FEATURE__PARTICIPANT_OF_ASSOCIATION:
				getParticipantOfAssociation().clear();
				return;
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				setOwningFeatureMembership((FeatureMembership)null);
				return;
			case SysMLPackage.FEATURE__END_OF_ASSOCIATION:
				setEndOfAssociation((Association)null);
				return;
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
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
			case SysMLPackage.FEATURE__LOWER:
				return lower != null;
			case SysMLPackage.FEATURE__UPPER:
				return upper != null;
			case SysMLPackage.FEATURE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case SysMLPackage.FEATURE__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case SysMLPackage.FEATURE__OWNING_CLASS:
				return owningClass != null;
			case SysMLPackage.FEATURE__TYPE:
				return type != null && !type.isEmpty();
			case SysMLPackage.FEATURE__REFERENCED_TYPE:
				return referencedType != null && !referencedType.isEmpty();
			case SysMLPackage.FEATURE__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case SysMLPackage.FEATURE__NESTED_FEATURE:
				return nestedFeature != null && !nestedFeature.isEmpty();
			case SysMLPackage.FEATURE__NESTING_FEATURE:
				return nestingFeature != null && !nestingFeature.isEmpty();
			case SysMLPackage.FEATURE__OWNED_REDEFINITION:
				return ownedRedefinition != null && !ownedRedefinition.isEmpty();
			case SysMLPackage.FEATURE__OWNED_SUBSET:
				return ownedSubset != null && !ownedSubset.isEmpty();
			case SysMLPackage.FEATURE__VALUE:
				return value != null;
			case SysMLPackage.FEATURE__PARTICIPANT_OF_ASSOCIATION:
				return participantOfAssociation != null && !participantOfAssociation.isEmpty();
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				return getOwningFeatureMembership() != null;
			case SysMLPackage.FEATURE__END_OF_ASSOCIATION:
				return endOfAssociation != null;
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				return isComposite != IS_COMPOSITE_EDEFAULT;
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
		result.append(" (isUnique: ");
		result.append(isUnique);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
