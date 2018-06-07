/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;

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

import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subset;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedImport <em>Owned Import</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getFeaturingClasses <em>Featuring Classes</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getReferencedType <em>Referenced Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getNestedFeature <em>Nested Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getNestingFeature <em>Nesting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedSubset <em>Owned Subset</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsPort <em>Is Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getRelatedFeatures <em>Related Features</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getTargetFeature <em>Target Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getTargetPath <em>Target Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends RelationshipImpl implements Connector {
	/**
	 * The cached value of the '{@link #getMembership() <em>Membership</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<Membership> membership;

	/**
	 * The cached value of the '{@link #getOwnedImport() <em>Owned Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> ownedImport;

	/**
	 * The cached value of the '{@link #getImportedMember() <em>Imported Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> importedMember;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> member;

	/**
	 * The cached value of the '{@link #getOwnedMember() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> ownedMember;

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
	protected EList<org.omg.sysml.lang.sysml.Class> featuringClasses;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Class class_;

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
	 * The cached value of the '{@link #getNestingFeature() <em>Nesting Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestingFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature nestingFeature;

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
	 * The default value of the '{@link #isIsPort() <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPort()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPort() <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPort()
	 * @generated
	 * @ordered
	 */
	protected boolean isPort = IS_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final FeatureDirectionKind DIRECTION_EDEFAULT = FeatureDirectionKind.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected FeatureDirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedFeatures() <em>Related Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> relatedFeatures;

	/**
	 * The cached value of the '{@link #getSourceFeature() <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature sourceFeature;

	/**
	 * The cached value of the '{@link #getTargetFeature() <em>Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature targetFeature;

	/**
	 * The cached value of the '{@link #getSourcePath() <em>Source Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePath()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> sourcePath;

	/**
	 * The cached value of the '{@link #getTargetPath() <em>Target Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPath()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> targetPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Membership> getMembership() {
		if (membership == null) {
			membership = new EObjectContainmentWithInverseEList<Membership>(Membership.class, this, SysMLPackage.CONNECTOR__MEMBERSHIP, SysMLPackage.MEMBERSHIP__PACKAGE);
		}
		return membership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getOwnedImport() {
		if (ownedImport == null) {
			ownedImport = new EObjectContainmentWithInverseEList<Import>(Import.class, this, SysMLPackage.CONNECTOR__OWNED_IMPORT, SysMLPackage.IMPORT__IMPORTING_PACKAGE);
		}
		return ownedImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getImportedMember() {
		if (importedMember == null) {
			importedMember = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.CONNECTOR__IMPORTED_MEMBER);
		}
		return importedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getMember() {
		if (member == null) {
			member = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.CONNECTOR__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getOwnedMember() {
		if (ownedMember == null) {
			ownedMember = new EObjectWithInverseResolvingEList<Element>(Element.class, this, SysMLPackage.CONNECTOR__OWNED_MEMBER, SysMLPackage.ELEMENT__OWNING_PACKAGE);
		}
		return ownedMember;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__LOWER, oldLower, newLower);
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
				msgs = ((InternalEObject)lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__LOWER, null, msgs);
			if (newLower != null)
				msgs = ((InternalEObject)newLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__LOWER, null, msgs);
			msgs = basicSetLower(newLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__LOWER, newLower, newLower));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__UPPER, oldUpper, newUpper);
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
				msgs = ((InternalEObject)upper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__UPPER, null, msgs);
			if (newUpper != null)
				msgs = ((InternalEObject)newUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__UPPER, null, msgs);
			msgs = basicSetUpper(newUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__UPPER, newUpper, newUpper));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__IS_DERIVED, oldIsDerived, isDerived));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__IS_UNIQUE, oldIsUnique, isUnique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.lang.sysml.Class> getFeaturingClasses() {
		if (featuringClasses == null) {
			featuringClasses = new EObjectWithInverseResolvingEList.ManyInverse<org.omg.sysml.lang.sysml.Class>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.CONNECTOR__FEATURING_CLASSES, SysMLPackage.CLASS__FEATURE);
		}
		return featuringClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (org.omg.sysml.lang.sysml.Class)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(org.omg.sysml.lang.sysml.Class newClass, NotificationChain msgs) {
		org.omg.sysml.lang.sysml.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(org.omg.sysml.lang.sysml.Class newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, SysMLPackage.CLASS__OWNED_FEATURE, org.omg.sysml.lang.sysml.Class.class, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, SysMLPackage.CLASS__OWNED_FEATURE, org.omg.sysml.lang.sysml.Class.class, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.lang.sysml.Class> getType() {
		if (type == null) {
			type = new EObjectWithInverseResolvingEList.ManyInverse<org.omg.sysml.lang.sysml.Class>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.CONNECTOR__TYPE, SysMLPackage.CLASS__TYPED_FEATURE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.lang.sysml.Class> getReferencedType() {
		if (referencedType == null) {
			referencedType = new EObjectResolvingEList<org.omg.sysml.lang.sysml.Class>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.CONNECTOR__REFERENCED_TYPE);
		}
		return referencedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.lang.sysml.Class> getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectResolvingEList<org.omg.sysml.lang.sysml.Class>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.CONNECTOR__OWNED_TYPE);
		}
		return ownedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getNestedFeature() {
		if (nestedFeature == null) {
			nestedFeature = new EObjectWithInverseResolvingEList<Feature>(Feature.class, this, SysMLPackage.CONNECTOR__NESTED_FEATURE, SysMLPackage.FEATURE__NESTING_FEATURE);
		}
		return nestedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getNestingFeature() {
		if (nestingFeature != null && nestingFeature.eIsProxy()) {
			InternalEObject oldNestingFeature = (InternalEObject)nestingFeature;
			nestingFeature = (Feature)eResolveProxy(oldNestingFeature);
			if (nestingFeature != oldNestingFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR__NESTING_FEATURE, oldNestingFeature, nestingFeature));
			}
		}
		return nestingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetNestingFeature() {
		return nestingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingFeature(Feature newNestingFeature, NotificationChain msgs) {
		Feature oldNestingFeature = nestingFeature;
		nestingFeature = newNestingFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__NESTING_FEATURE, oldNestingFeature, newNestingFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingFeature(Feature newNestingFeature) {
		if (newNestingFeature != nestingFeature) {
			NotificationChain msgs = null;
			if (nestingFeature != null)
				msgs = ((InternalEObject)nestingFeature).eInverseRemove(this, SysMLPackage.FEATURE__NESTED_FEATURE, Feature.class, msgs);
			if (newNestingFeature != null)
				msgs = ((InternalEObject)newNestingFeature).eInverseAdd(this, SysMLPackage.FEATURE__NESTED_FEATURE, Feature.class, msgs);
			msgs = basicSetNestingFeature(newNestingFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__NESTING_FEATURE, newNestingFeature, newNestingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Redefinition> getOwnedRedefinition() {
		if (ownedRedefinition == null) {
			ownedRedefinition = new EObjectWithInverseResolvingEList<Redefinition>(Redefinition.class, this, SysMLPackage.CONNECTOR__OWNED_REDEFINITION, SysMLPackage.REDEFINITION__OWNING_FEATURE);
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
			ownedSubset = new EObjectWithInverseResolvingEList<Subset>(Subset.class, this, SysMLPackage.CONNECTOR__OWNED_SUBSET, SysMLPackage.SUBSET__OWNING_FEATURE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__VALUE, oldValue, newValue);
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
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPort() {
		return isPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPort(boolean newIsPort) {
		boolean oldIsPort = isPort;
		isPort = newIsPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__IS_PORT, oldIsPort, isPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(FeatureDirectionKind newDirection) {
		FeatureDirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getRelatedFeatures() {
		if (relatedFeatures == null) {
			relatedFeatures = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.CONNECTOR__RELATED_FEATURES);
		}
		return relatedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSourceFeature() {
		if (sourceFeature != null && sourceFeature.eIsProxy()) {
			InternalEObject oldSourceFeature = (InternalEObject)sourceFeature;
			sourceFeature = (Feature)eResolveProxy(oldSourceFeature);
			if (sourceFeature != oldSourceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
			}
		}
		return sourceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSourceFeature() {
		return sourceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFeature(Feature newSourceFeature) {
		Feature oldSourceFeature = sourceFeature;
		sourceFeature = newSourceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getTargetFeature() {
		if (targetFeature != null && targetFeature.eIsProxy()) {
			InternalEObject oldTargetFeature = (InternalEObject)targetFeature;
			targetFeature = (Feature)eResolveProxy(oldTargetFeature);
			if (targetFeature != oldTargetFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR__TARGET_FEATURE, oldTargetFeature, targetFeature));
			}
		}
		return targetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetTargetFeature() {
		return targetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFeature(Feature newTargetFeature) {
		Feature oldTargetFeature = targetFeature;
		targetFeature = newTargetFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__TARGET_FEATURE, oldTargetFeature, targetFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getSourcePath() {
		if (sourcePath == null) {
			sourcePath = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.CONNECTOR__SOURCE_PATH);
		}
		return sourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getTargetPath() {
		if (targetPath == null) {
			targetPath = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.CONNECTOR__TARGET_PATH);
		}
		return targetPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String nameOf(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case SysMLPackage.CONNECTOR__MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembership()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedImport()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMember()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__FEATURING_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeaturingClasses()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__CLASS:
				if (class_ != null)
					msgs = ((InternalEObject)class_).eInverseRemove(this, SysMLPackage.CLASS__OWNED_FEATURE, org.omg.sysml.lang.sysml.Class.class, msgs);
				return basicSetClass((org.omg.sysml.lang.sysml.Class)otherEnd, msgs);
			case SysMLPackage.CONNECTOR__TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getType()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__NESTED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedFeature()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__NESTING_FEATURE:
				if (nestingFeature != null)
					msgs = ((InternalEObject)nestingFeature).eInverseRemove(this, SysMLPackage.FEATURE__NESTED_FEATURE, Feature.class, msgs);
				return basicSetNestingFeature((Feature)otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_REDEFINITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRedefinition()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedSubset()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.CONNECTOR__MEMBERSHIP:
				return ((InternalEList<?>)getMembership()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_IMPORT:
				return ((InternalEList<?>)getOwnedImport()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__LOWER:
				return basicSetLower(null, msgs);
			case SysMLPackage.CONNECTOR__UPPER:
				return basicSetUpper(null, msgs);
			case SysMLPackage.CONNECTOR__FEATURING_CLASSES:
				return ((InternalEList<?>)getFeaturingClasses()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__CLASS:
				return basicSetClass(null, msgs);
			case SysMLPackage.CONNECTOR__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__NESTED_FEATURE:
				return ((InternalEList<?>)getNestedFeature()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__NESTING_FEATURE:
				return basicSetNestingFeature(null, msgs);
			case SysMLPackage.CONNECTOR__OWNED_REDEFINITION:
				return ((InternalEList<?>)getOwnedRedefinition()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				return ((InternalEList<?>)getOwnedSubset()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__VALUE:
				return basicSetValue(null, msgs);
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
			case SysMLPackage.CONNECTOR__MEMBERSHIP:
				return getMembership();
			case SysMLPackage.CONNECTOR__OWNED_IMPORT:
				return getOwnedImport();
			case SysMLPackage.CONNECTOR__IMPORTED_MEMBER:
				return getImportedMember();
			case SysMLPackage.CONNECTOR__MEMBER:
				return getMember();
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				return getOwnedMember();
			case SysMLPackage.CONNECTOR__LOWER:
				return getLower();
			case SysMLPackage.CONNECTOR__UPPER:
				return getUpper();
			case SysMLPackage.CONNECTOR__IS_DERIVED:
				return isIsDerived();
			case SysMLPackage.CONNECTOR__IS_UNIQUE:
				return isIsUnique();
			case SysMLPackage.CONNECTOR__IS_READ_ONLY:
				return isIsReadOnly();
			case SysMLPackage.CONNECTOR__IS_ORDERED:
				return isIsOrdered();
			case SysMLPackage.CONNECTOR__FEATURING_CLASSES:
				return getFeaturingClasses();
			case SysMLPackage.CONNECTOR__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case SysMLPackage.CONNECTOR__TYPE:
				return getType();
			case SysMLPackage.CONNECTOR__REFERENCED_TYPE:
				return getReferencedType();
			case SysMLPackage.CONNECTOR__OWNED_TYPE:
				return getOwnedType();
			case SysMLPackage.CONNECTOR__NESTED_FEATURE:
				return getNestedFeature();
			case SysMLPackage.CONNECTOR__NESTING_FEATURE:
				if (resolve) return getNestingFeature();
				return basicGetNestingFeature();
			case SysMLPackage.CONNECTOR__OWNED_REDEFINITION:
				return getOwnedRedefinition();
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				return getOwnedSubset();
			case SysMLPackage.CONNECTOR__VALUE:
				return getValue();
			case SysMLPackage.CONNECTOR__IS_PORT:
				return isIsPort();
			case SysMLPackage.CONNECTOR__DIRECTION:
				return getDirection();
			case SysMLPackage.CONNECTOR__RELATED_FEATURES:
				return getRelatedFeatures();
			case SysMLPackage.CONNECTOR__SOURCE_FEATURE:
				if (resolve) return getSourceFeature();
				return basicGetSourceFeature();
			case SysMLPackage.CONNECTOR__TARGET_FEATURE:
				if (resolve) return getTargetFeature();
				return basicGetTargetFeature();
			case SysMLPackage.CONNECTOR__SOURCE_PATH:
				return getSourcePath();
			case SysMLPackage.CONNECTOR__TARGET_PATH:
				return getTargetPath();
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
			case SysMLPackage.CONNECTOR__MEMBERSHIP:
				getMembership().clear();
				getMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_IMPORT:
				getOwnedImport().clear();
				getOwnedImport().addAll((Collection<? extends Import>)newValue);
				return;
			case SysMLPackage.CONNECTOR__IMPORTED_MEMBER:
				getImportedMember().clear();
				getImportedMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR__LOWER:
				setLower((Expression)newValue);
				return;
			case SysMLPackage.CONNECTOR__UPPER:
				setUpper((Expression)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__FEATURING_CLASSES:
				getFeaturingClasses().clear();
				getFeaturingClasses().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
				return;
			case SysMLPackage.CONNECTOR__CLASS:
				setClass((org.omg.sysml.lang.sysml.Class)newValue);
				return;
			case SysMLPackage.CONNECTOR__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
				return;
			case SysMLPackage.CONNECTOR__REFERENCED_TYPE:
				getReferencedType().clear();
				getReferencedType().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
				return;
			case SysMLPackage.CONNECTOR__NESTED_FEATURE:
				getNestedFeature().clear();
				getNestedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__NESTING_FEATURE:
				setNestingFeature((Feature)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_REDEFINITION:
				getOwnedRedefinition().clear();
				getOwnedRedefinition().addAll((Collection<? extends Redefinition>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				getOwnedSubset().clear();
				getOwnedSubset().addAll((Collection<? extends Subset>)newValue);
				return;
			case SysMLPackage.CONNECTOR__VALUE:
				setValue((Expression)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_PORT:
				setIsPort((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__DIRECTION:
				setDirection((FeatureDirectionKind)newValue);
				return;
			case SysMLPackage.CONNECTOR__RELATED_FEATURES:
				getRelatedFeatures().clear();
				getRelatedFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__SOURCE_FEATURE:
				setSourceFeature((Feature)newValue);
				return;
			case SysMLPackage.CONNECTOR__TARGET_FEATURE:
				setTargetFeature((Feature)newValue);
				return;
			case SysMLPackage.CONNECTOR__SOURCE_PATH:
				getSourcePath().clear();
				getSourcePath().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__TARGET_PATH:
				getTargetPath().clear();
				getTargetPath().addAll((Collection<? extends Feature>)newValue);
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
			case SysMLPackage.CONNECTOR__MEMBERSHIP:
				getMembership().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_IMPORT:
				getOwnedImport().clear();
				return;
			case SysMLPackage.CONNECTOR__IMPORTED_MEMBER:
				getImportedMember().clear();
				return;
			case SysMLPackage.CONNECTOR__MEMBER:
				getMember().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case SysMLPackage.CONNECTOR__LOWER:
				setLower((Expression)null);
				return;
			case SysMLPackage.CONNECTOR__UPPER:
				setUpper((Expression)null);
				return;
			case SysMLPackage.CONNECTOR__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__FEATURING_CLASSES:
				getFeaturingClasses().clear();
				return;
			case SysMLPackage.CONNECTOR__CLASS:
				setClass((org.omg.sysml.lang.sysml.Class)null);
				return;
			case SysMLPackage.CONNECTOR__TYPE:
				getType().clear();
				return;
			case SysMLPackage.CONNECTOR__REFERENCED_TYPE:
				getReferencedType().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case SysMLPackage.CONNECTOR__NESTED_FEATURE:
				getNestedFeature().clear();
				return;
			case SysMLPackage.CONNECTOR__NESTING_FEATURE:
				setNestingFeature((Feature)null);
				return;
			case SysMLPackage.CONNECTOR__OWNED_REDEFINITION:
				getOwnedRedefinition().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				getOwnedSubset().clear();
				return;
			case SysMLPackage.CONNECTOR__VALUE:
				setValue((Expression)null);
				return;
			case SysMLPackage.CONNECTOR__IS_PORT:
				setIsPort(IS_PORT_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__RELATED_FEATURES:
				getRelatedFeatures().clear();
				return;
			case SysMLPackage.CONNECTOR__SOURCE_FEATURE:
				setSourceFeature((Feature)null);
				return;
			case SysMLPackage.CONNECTOR__TARGET_FEATURE:
				setTargetFeature((Feature)null);
				return;
			case SysMLPackage.CONNECTOR__SOURCE_PATH:
				getSourcePath().clear();
				return;
			case SysMLPackage.CONNECTOR__TARGET_PATH:
				getTargetPath().clear();
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
			case SysMLPackage.CONNECTOR__MEMBERSHIP:
				return membership != null && !membership.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_IMPORT:
				return ownedImport != null && !ownedImport.isEmpty();
			case SysMLPackage.CONNECTOR__IMPORTED_MEMBER:
				return importedMember != null && !importedMember.isEmpty();
			case SysMLPackage.CONNECTOR__MEMBER:
				return member != null && !member.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case SysMLPackage.CONNECTOR__LOWER:
				return lower != null;
			case SysMLPackage.CONNECTOR__UPPER:
				return upper != null;
			case SysMLPackage.CONNECTOR__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case SysMLPackage.CONNECTOR__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case SysMLPackage.CONNECTOR__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case SysMLPackage.CONNECTOR__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case SysMLPackage.CONNECTOR__FEATURING_CLASSES:
				return featuringClasses != null && !featuringClasses.isEmpty();
			case SysMLPackage.CONNECTOR__CLASS:
				return class_ != null;
			case SysMLPackage.CONNECTOR__TYPE:
				return type != null && !type.isEmpty();
			case SysMLPackage.CONNECTOR__REFERENCED_TYPE:
				return referencedType != null && !referencedType.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case SysMLPackage.CONNECTOR__NESTED_FEATURE:
				return nestedFeature != null && !nestedFeature.isEmpty();
			case SysMLPackage.CONNECTOR__NESTING_FEATURE:
				return nestingFeature != null;
			case SysMLPackage.CONNECTOR__OWNED_REDEFINITION:
				return ownedRedefinition != null && !ownedRedefinition.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				return ownedSubset != null && !ownedSubset.isEmpty();
			case SysMLPackage.CONNECTOR__VALUE:
				return value != null;
			case SysMLPackage.CONNECTOR__IS_PORT:
				return isPort != IS_PORT_EDEFAULT;
			case SysMLPackage.CONNECTOR__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case SysMLPackage.CONNECTOR__RELATED_FEATURES:
				return relatedFeatures != null && !relatedFeatures.isEmpty();
			case SysMLPackage.CONNECTOR__SOURCE_FEATURE:
				return sourceFeature != null;
			case SysMLPackage.CONNECTOR__TARGET_FEATURE:
				return targetFeature != null;
			case SysMLPackage.CONNECTOR__SOURCE_PATH:
				return sourcePath != null && !sourcePath.isEmpty();
			case SysMLPackage.CONNECTOR__TARGET_PATH:
				return targetPath != null && !targetPath.isEmpty();
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
		if (baseClass == org.omg.sysml.lang.sysml.Package.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTOR__MEMBERSHIP: return SysMLPackage.PACKAGE__MEMBERSHIP;
				case SysMLPackage.CONNECTOR__OWNED_IMPORT: return SysMLPackage.PACKAGE__OWNED_IMPORT;
				case SysMLPackage.CONNECTOR__IMPORTED_MEMBER: return SysMLPackage.PACKAGE__IMPORTED_MEMBER;
				case SysMLPackage.CONNECTOR__MEMBER: return SysMLPackage.PACKAGE__MEMBER;
				case SysMLPackage.CONNECTOR__OWNED_MEMBER: return SysMLPackage.PACKAGE__OWNED_MEMBER;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTOR__LOWER: return SysMLPackage.FEATURE__LOWER;
				case SysMLPackage.CONNECTOR__UPPER: return SysMLPackage.FEATURE__UPPER;
				case SysMLPackage.CONNECTOR__IS_DERIVED: return SysMLPackage.FEATURE__IS_DERIVED;
				case SysMLPackage.CONNECTOR__IS_UNIQUE: return SysMLPackage.FEATURE__IS_UNIQUE;
				case SysMLPackage.CONNECTOR__IS_READ_ONLY: return SysMLPackage.FEATURE__IS_READ_ONLY;
				case SysMLPackage.CONNECTOR__IS_ORDERED: return SysMLPackage.FEATURE__IS_ORDERED;
				case SysMLPackage.CONNECTOR__FEATURING_CLASSES: return SysMLPackage.FEATURE__FEATURING_CLASSES;
				case SysMLPackage.CONNECTOR__CLASS: return SysMLPackage.FEATURE__CLASS;
				case SysMLPackage.CONNECTOR__TYPE: return SysMLPackage.FEATURE__TYPE;
				case SysMLPackage.CONNECTOR__REFERENCED_TYPE: return SysMLPackage.FEATURE__REFERENCED_TYPE;
				case SysMLPackage.CONNECTOR__OWNED_TYPE: return SysMLPackage.FEATURE__OWNED_TYPE;
				case SysMLPackage.CONNECTOR__NESTED_FEATURE: return SysMLPackage.FEATURE__NESTED_FEATURE;
				case SysMLPackage.CONNECTOR__NESTING_FEATURE: return SysMLPackage.FEATURE__NESTING_FEATURE;
				case SysMLPackage.CONNECTOR__OWNED_REDEFINITION: return SysMLPackage.FEATURE__OWNED_REDEFINITION;
				case SysMLPackage.CONNECTOR__OWNED_SUBSET: return SysMLPackage.FEATURE__OWNED_SUBSET;
				case SysMLPackage.CONNECTOR__VALUE: return SysMLPackage.FEATURE__VALUE;
				case SysMLPackage.CONNECTOR__IS_PORT: return SysMLPackage.FEATURE__IS_PORT;
				case SysMLPackage.CONNECTOR__DIRECTION: return SysMLPackage.FEATURE__DIRECTION;
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
		if (baseClass == org.omg.sysml.lang.sysml.Package.class) {
			switch (baseFeatureID) {
				case SysMLPackage.PACKAGE__MEMBERSHIP: return SysMLPackage.CONNECTOR__MEMBERSHIP;
				case SysMLPackage.PACKAGE__OWNED_IMPORT: return SysMLPackage.CONNECTOR__OWNED_IMPORT;
				case SysMLPackage.PACKAGE__IMPORTED_MEMBER: return SysMLPackage.CONNECTOR__IMPORTED_MEMBER;
				case SysMLPackage.PACKAGE__MEMBER: return SysMLPackage.CONNECTOR__MEMBER;
				case SysMLPackage.PACKAGE__OWNED_MEMBER: return SysMLPackage.CONNECTOR__OWNED_MEMBER;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case SysMLPackage.FEATURE__LOWER: return SysMLPackage.CONNECTOR__LOWER;
				case SysMLPackage.FEATURE__UPPER: return SysMLPackage.CONNECTOR__UPPER;
				case SysMLPackage.FEATURE__IS_DERIVED: return SysMLPackage.CONNECTOR__IS_DERIVED;
				case SysMLPackage.FEATURE__IS_UNIQUE: return SysMLPackage.CONNECTOR__IS_UNIQUE;
				case SysMLPackage.FEATURE__IS_READ_ONLY: return SysMLPackage.CONNECTOR__IS_READ_ONLY;
				case SysMLPackage.FEATURE__IS_ORDERED: return SysMLPackage.CONNECTOR__IS_ORDERED;
				case SysMLPackage.FEATURE__FEATURING_CLASSES: return SysMLPackage.CONNECTOR__FEATURING_CLASSES;
				case SysMLPackage.FEATURE__CLASS: return SysMLPackage.CONNECTOR__CLASS;
				case SysMLPackage.FEATURE__TYPE: return SysMLPackage.CONNECTOR__TYPE;
				case SysMLPackage.FEATURE__REFERENCED_TYPE: return SysMLPackage.CONNECTOR__REFERENCED_TYPE;
				case SysMLPackage.FEATURE__OWNED_TYPE: return SysMLPackage.CONNECTOR__OWNED_TYPE;
				case SysMLPackage.FEATURE__NESTED_FEATURE: return SysMLPackage.CONNECTOR__NESTED_FEATURE;
				case SysMLPackage.FEATURE__NESTING_FEATURE: return SysMLPackage.CONNECTOR__NESTING_FEATURE;
				case SysMLPackage.FEATURE__OWNED_REDEFINITION: return SysMLPackage.CONNECTOR__OWNED_REDEFINITION;
				case SysMLPackage.FEATURE__OWNED_SUBSET: return SysMLPackage.CONNECTOR__OWNED_SUBSET;
				case SysMLPackage.FEATURE__VALUE: return SysMLPackage.CONNECTOR__VALUE;
				case SysMLPackage.FEATURE__IS_PORT: return SysMLPackage.CONNECTOR__IS_PORT;
				case SysMLPackage.FEATURE__DIRECTION: return SysMLPackage.CONNECTOR__DIRECTION;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == org.omg.sysml.lang.sysml.Package.class) {
			switch (baseOperationID) {
				case SysMLPackage.PACKAGE___NAME_OF__ELEMENT: return SysMLPackage.CONNECTOR___NAME_OF__ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.CONNECTOR___NAME_OF__ELEMENT:
				return nameOf((Element)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", isPort: ");
		result.append(isPort);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
