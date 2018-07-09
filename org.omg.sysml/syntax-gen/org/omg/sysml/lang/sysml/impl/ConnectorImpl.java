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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Generalization;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedMembership <em>Owned Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getImportedMembership <em>Imported Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedFeatureMembership <em>Owned Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwningFeature <em>Owning Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getReferencedType <em>Referenced Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getNestedFeature <em>Nested Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getNestingFeature <em>Nesting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedSubset <em>Owned Subset</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getParticipantOfAssociation <em>Participant Of Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwningFeatureMembership <em>Owning Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getEndOfAssociation <em>End Of Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getRelatedFeatures <em>Related Features</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getTargetFeature <em>Target Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getTargetPath <em>Target Path</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsDirected <em>Is Directed</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getSourceLower <em>Source Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getSourceUpper <em>Source Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getTargetLower <em>Target Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getTargetUpper <em>Target Upper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends RelationshipImpl implements Connector {
	/**
	 * The cached value of the '{@link #getMembership() <em>Membership</em>}' reference list.
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
	 * The cached value of the '{@link #getOwnedMembership() <em>Owned Membership</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<Membership> ownedMembership;

	/**
	 * The cached value of the '{@link #getImportedMembership() <em>Imported Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<Membership> importedMembership;

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
	 * The cached value of the '{@link #getOwnedFeature() <em>Owned Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> ownedFeature;

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
	 * The cached value of the '{@link #getOwnedFeatureMembership() <em>Owned Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMembership> ownedFeatureMembership;

	/**
	 * The cached value of the '{@link #getOwningFeature() <em>Owning Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature owningFeature;

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
	protected EList<FeatureMembership> sourcePath;

	/**
	 * The cached value of the '{@link #getTargetPath() <em>Target Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPath()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMembership> targetPath;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association;

	/**
	 * The default value of the '{@link #isIsDirected() <em>Is Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDirected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIRECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDirected() <em>Is Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDirected()
	 * @generated
	 * @ordered
	 */
	protected boolean isDirected = IS_DIRECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceLower() <em>Source Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLower()
	 * @generated
	 * @ordered
	 */
	protected Expression sourceLower;

	/**
	 * The cached value of the '{@link #getSourceUpper() <em>Source Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUpper()
	 * @generated
	 * @ordered
	 */
	protected Expression sourceUpper;

	/**
	 * The cached value of the '{@link #getTargetLower() <em>Target Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLower()
	 * @generated
	 * @ordered
	 */
	protected Expression targetLower;

	/**
	 * The cached value of the '{@link #getTargetUpper() <em>Target Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUpper()
	 * @generated
	 * @ordered
	 */
	protected Expression targetUpper;

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
			membership = new EObjectResolvingEList<Membership>(Membership.class, this, SysMLPackage.CONNECTOR__MEMBERSHIP);
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
			ownedMember = new EObjectWithInverseResolvingEList<Element>(Element.class, this, SysMLPackage.CONNECTOR__OWNED_MEMBER, SysMLPackage.ELEMENT__OWNING_NAMESPACE);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Membership> getOwnedMembership() {
		if (ownedMembership == null) {
			ownedMembership = new EObjectContainmentWithInverseEList<Membership>(Membership.class, this, SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP, SysMLPackage.MEMBERSHIP__OWNING_PACKAGE);
		}
		return ownedMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Membership> getImportedMembership() {
		if (importedMembership == null) {
			importedMembership = new EObjectResolvingEList<Membership>(Membership.class, this, SysMLPackage.CONNECTOR__IMPORTED_MEMBERSHIP);
		}
		return importedMembership;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.CONNECTOR__FEATURE);
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
			ownedFeature = new EObjectWithInverseResolvingEList<Feature>(Feature.class, this, SysMLPackage.CONNECTOR__OWNED_FEATURE, SysMLPackage.FEATURE__OWNING_CLASS);
		}
		return ownedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getOwnedGeneralization() {
		if (ownedGeneralization == null) {
			ownedGeneralization = new EObjectWithInverseResolvingEList<Generalization>(Generalization.class, this, SysMLPackage.CONNECTOR__OWNED_GENERALIZATION, SysMLPackage.GENERALIZATION__OWNING_CLASS);
		}
		return ownedGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.CONNECTOR__INPUT);
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
			output = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.CONNECTOR__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureMembership> getOwnedFeatureMembership() {
		if (ownedFeatureMembership == null) {
			ownedFeatureMembership = new EObjectWithInverseResolvingEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CLASS);
		}
		return ownedFeatureMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getOwningFeature() {
		if (owningFeature != null && owningFeature.eIsProxy()) {
			InternalEObject oldOwningFeature = (InternalEObject)owningFeature;
			owningFeature = (Feature)eResolveProxy(oldOwningFeature);
			if (owningFeature != oldOwningFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR__OWNING_FEATURE, oldOwningFeature, owningFeature));
			}
		}
		return owningFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetOwningFeature() {
		return owningFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningFeature(Feature newOwningFeature, NotificationChain msgs) {
		Feature oldOwningFeature = owningFeature;
		owningFeature = newOwningFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__OWNING_FEATURE, oldOwningFeature, newOwningFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFeature(Feature newOwningFeature) {
		if (newOwningFeature != owningFeature) {
			NotificationChain msgs = null;
			if (owningFeature != null)
				msgs = ((InternalEObject)owningFeature).eInverseRemove(this, SysMLPackage.FEATURE__OWNED_TYPE, Feature.class, msgs);
			if (newOwningFeature != null)
				msgs = ((InternalEObject)newOwningFeature).eInverseAdd(this, SysMLPackage.FEATURE__OWNED_TYPE, Feature.class, msgs);
			msgs = basicSetOwningFeature(newOwningFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__OWNING_FEATURE, newOwningFeature, newOwningFeature));
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
	public org.omg.sysml.lang.sysml.Class getOwningClass() {
		if (owningClass != null && owningClass.eIsProxy()) {
			InternalEObject oldOwningClass = (InternalEObject)owningClass;
			owningClass = (org.omg.sysml.lang.sysml.Class)eResolveProxy(oldOwningClass);
			if (owningClass != oldOwningClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR__OWNING_CLASS, oldOwningClass, owningClass));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__OWNING_CLASS, oldOwningClass, newOwningClass);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__OWNING_CLASS, newOwningClass, newOwningClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.lang.sysml.Class> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<org.omg.sysml.lang.sysml.Class>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.CONNECTOR__TYPE);
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
			ownedType = new EObjectWithInverseResolvingEList<org.omg.sysml.lang.sysml.Class>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.CONNECTOR__OWNED_TYPE, SysMLPackage.CLASS__OWNING_FEATURE);
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
			nestedFeature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, SysMLPackage.CONNECTOR__NESTED_FEATURE, SysMLPackage.FEATURE__NESTING_FEATURE);
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
			nestingFeature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, SysMLPackage.CONNECTOR__NESTING_FEATURE, SysMLPackage.FEATURE__NESTED_FEATURE);
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
			ownedRedefinition = new EObjectResolvingEList<Redefinition>(Redefinition.class, this, SysMLPackage.CONNECTOR__OWNED_REDEFINITION);
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
	public EList<Association> getParticipantOfAssociation() {
		if (participantOfAssociation == null) {
			participantOfAssociation = new EObjectWithInverseResolvingEList.ManyInverse<Association>(Association.class, this, SysMLPackage.CONNECTOR__PARTICIPANT_OF_ASSOCIATION, SysMLPackage.ASSOCIATION__PARTICIPANT);
		}
		return participantOfAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMembership getOwningFeatureMembership() {
		if (eContainerFeatureID() != SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP) return null;
		return (FeatureMembership)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningFeatureMembership(FeatureMembership newOwningFeatureMembership, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningFeatureMembership, SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFeatureMembership(FeatureMembership newOwningFeatureMembership) {
		if (newOwningFeatureMembership != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP && newOwningFeatureMembership != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP, newOwningFeatureMembership, newOwningFeatureMembership));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR__END_OF_ASSOCIATION, oldEndOfAssociation, endOfAssociation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__END_OF_ASSOCIATION, oldEndOfAssociation, newEndOfAssociation);
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
				msgs = ((InternalEObject)endOfAssociation).eInverseRemove(this, SysMLPackage.ASSOCIATION__END, Association.class, msgs);
			if (newEndOfAssociation != null)
				msgs = ((InternalEObject)newEndOfAssociation).eInverseAdd(this, SysMLPackage.ASSOCIATION__END, Association.class, msgs);
			msgs = basicSetEndOfAssociation(newEndOfAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__END_OF_ASSOCIATION, newEndOfAssociation, newEndOfAssociation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__IS_COMPOSITE, oldIsComposite, isComposite));
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
	public EList<FeatureMembership> getSourcePath() {
		if (sourcePath == null) {
			sourcePath = new EObjectResolvingEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.CONNECTOR__SOURCE_PATH);
		}
		return sourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureMembership> getTargetPath() {
		if (targetPath == null) {
			targetPath = new EObjectResolvingEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.CONNECTOR__TARGET_PATH);
		}
		return targetPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (Association)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__ASSOCIATION, oldAssociation, association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDirected() {
		return isDirected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDirected(boolean newIsDirected) {
		boolean oldIsDirected = isDirected;
		isDirected = newIsDirected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__IS_DIRECTED, oldIsDirected, isDirected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSourceLower() {
		return sourceLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceLower(Expression newSourceLower, NotificationChain msgs) {
		Expression oldSourceLower = sourceLower;
		sourceLower = newSourceLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__SOURCE_LOWER, oldSourceLower, newSourceLower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLower(Expression newSourceLower) {
		if (newSourceLower != sourceLower) {
			NotificationChain msgs = null;
			if (sourceLower != null)
				msgs = ((InternalEObject)sourceLower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__SOURCE_LOWER, null, msgs);
			if (newSourceLower != null)
				msgs = ((InternalEObject)newSourceLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__SOURCE_LOWER, null, msgs);
			msgs = basicSetSourceLower(newSourceLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__SOURCE_LOWER, newSourceLower, newSourceLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSourceUpper() {
		return sourceUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceUpper(Expression newSourceUpper, NotificationChain msgs) {
		Expression oldSourceUpper = sourceUpper;
		sourceUpper = newSourceUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__SOURCE_UPPER, oldSourceUpper, newSourceUpper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceUpper(Expression newSourceUpper) {
		if (newSourceUpper != sourceUpper) {
			NotificationChain msgs = null;
			if (sourceUpper != null)
				msgs = ((InternalEObject)sourceUpper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__SOURCE_UPPER, null, msgs);
			if (newSourceUpper != null)
				msgs = ((InternalEObject)newSourceUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__SOURCE_UPPER, null, msgs);
			msgs = basicSetSourceUpper(newSourceUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__SOURCE_UPPER, newSourceUpper, newSourceUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTargetLower() {
		return targetLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetLower(Expression newTargetLower, NotificationChain msgs) {
		Expression oldTargetLower = targetLower;
		targetLower = newTargetLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__TARGET_LOWER, oldTargetLower, newTargetLower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLower(Expression newTargetLower) {
		if (newTargetLower != targetLower) {
			NotificationChain msgs = null;
			if (targetLower != null)
				msgs = ((InternalEObject)targetLower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__TARGET_LOWER, null, msgs);
			if (newTargetLower != null)
				msgs = ((InternalEObject)newTargetLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__TARGET_LOWER, null, msgs);
			msgs = basicSetTargetLower(newTargetLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__TARGET_LOWER, newTargetLower, newTargetLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTargetUpper() {
		return targetUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetUpper(Expression newTargetUpper, NotificationChain msgs) {
		Expression oldTargetUpper = targetUpper;
		targetUpper = newTargetUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__TARGET_UPPER, oldTargetUpper, newTargetUpper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUpper(Expression newTargetUpper) {
		if (newTargetUpper != targetUpper) {
			NotificationChain msgs = null;
			if (targetUpper != null)
				msgs = ((InternalEObject)targetUpper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__TARGET_UPPER, null, msgs);
			if (newTargetUpper != null)
				msgs = ((InternalEObject)newTargetUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONNECTOR__TARGET_UPPER, null, msgs);
			msgs = basicSetTargetUpper(newTargetUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__TARGET_UPPER, newTargetUpper, newTargetUpper));
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
	public EList<Membership> excludeCollisions(EList<Membership> mem) {
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
			case SysMLPackage.CONNECTOR__OWNED_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedImport()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMember()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMembership()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeature()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedGeneralization()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeatureMembership()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNING_FEATURE:
				if (owningFeature != null)
					msgs = ((InternalEObject)owningFeature).eInverseRemove(this, SysMLPackage.FEATURE__OWNED_TYPE, Feature.class, msgs);
				return basicSetOwningFeature((Feature)otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNING_CLASS:
				if (owningClass != null)
					msgs = ((InternalEObject)owningClass).eInverseRemove(this, SysMLPackage.CLASS__OWNED_FEATURE, org.omg.sysml.lang.sysml.Class.class, msgs);
				return basicSetOwningClass((org.omg.sysml.lang.sysml.Class)otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedType()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__NESTED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedFeature()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__NESTING_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestingFeature()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedSubset()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__PARTICIPANT_OF_ASSOCIATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipantOfAssociation()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningFeatureMembership((FeatureMembership)otherEnd, msgs);
			case SysMLPackage.CONNECTOR__END_OF_ASSOCIATION:
				if (endOfAssociation != null)
					msgs = ((InternalEObject)endOfAssociation).eInverseRemove(this, SysMLPackage.ASSOCIATION__END, Association.class, msgs);
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
			case SysMLPackage.CONNECTOR__OWNED_IMPORT:
				return ((InternalEList<?>)getOwnedImport()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP:
				return ((InternalEList<?>)getOwnedMembership()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				return ((InternalEList<?>)getOwnedFeature()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				return ((InternalEList<?>)getOwnedGeneralization()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				return ((InternalEList<?>)getOwnedFeatureMembership()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNING_FEATURE:
				return basicSetOwningFeature(null, msgs);
			case SysMLPackage.CONNECTOR__LOWER:
				return basicSetLower(null, msgs);
			case SysMLPackage.CONNECTOR__UPPER:
				return basicSetUpper(null, msgs);
			case SysMLPackage.CONNECTOR__OWNING_CLASS:
				return basicSetOwningClass(null, msgs);
			case SysMLPackage.CONNECTOR__OWNED_TYPE:
				return ((InternalEList<?>)getOwnedType()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__NESTED_FEATURE:
				return ((InternalEList<?>)getNestedFeature()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__NESTING_FEATURE:
				return ((InternalEList<?>)getNestingFeature()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				return ((InternalEList<?>)getOwnedSubset()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__VALUE:
				return basicSetValue(null, msgs);
			case SysMLPackage.CONNECTOR__PARTICIPANT_OF_ASSOCIATION:
				return ((InternalEList<?>)getParticipantOfAssociation()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
				return basicSetOwningFeatureMembership(null, msgs);
			case SysMLPackage.CONNECTOR__END_OF_ASSOCIATION:
				return basicSetEndOfAssociation(null, msgs);
			case SysMLPackage.CONNECTOR__SOURCE_LOWER:
				return basicSetSourceLower(null, msgs);
			case SysMLPackage.CONNECTOR__SOURCE_UPPER:
				return basicSetSourceUpper(null, msgs);
			case SysMLPackage.CONNECTOR__TARGET_LOWER:
				return basicSetTargetLower(null, msgs);
			case SysMLPackage.CONNECTOR__TARGET_UPPER:
				return basicSetTargetUpper(null, msgs);
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
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
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
			case SysMLPackage.CONNECTOR__MEMBERSHIP:
				return getMembership();
			case SysMLPackage.CONNECTOR__OWNED_IMPORT:
				return getOwnedImport();
			case SysMLPackage.CONNECTOR__MEMBER:
				return getMember();
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				return getOwnedMember();
			case SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP:
				return getOwnedMembership();
			case SysMLPackage.CONNECTOR__IMPORTED_MEMBERSHIP:
				return getImportedMembership();
			case SysMLPackage.CONNECTOR__IS_ABSTRACT:
				return isIsAbstract();
			case SysMLPackage.CONNECTOR__FEATURE:
				return getFeature();
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				return getOwnedFeature();
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				return getOwnedGeneralization();
			case SysMLPackage.CONNECTOR__INPUT:
				return getInput();
			case SysMLPackage.CONNECTOR__OUTPUT:
				return getOutput();
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				return getOwnedFeatureMembership();
			case SysMLPackage.CONNECTOR__OWNING_FEATURE:
				if (resolve) return getOwningFeature();
				return basicGetOwningFeature();
			case SysMLPackage.CONNECTOR__LOWER:
				return getLower();
			case SysMLPackage.CONNECTOR__UPPER:
				return getUpper();
			case SysMLPackage.CONNECTOR__IS_UNIQUE:
				return isIsUnique();
			case SysMLPackage.CONNECTOR__IS_ORDERED:
				return isIsOrdered();
			case SysMLPackage.CONNECTOR__OWNING_CLASS:
				if (resolve) return getOwningClass();
				return basicGetOwningClass();
			case SysMLPackage.CONNECTOR__TYPE:
				return getType();
			case SysMLPackage.CONNECTOR__REFERENCED_TYPE:
				return getReferencedType();
			case SysMLPackage.CONNECTOR__OWNED_TYPE:
				return getOwnedType();
			case SysMLPackage.CONNECTOR__NESTED_FEATURE:
				return getNestedFeature();
			case SysMLPackage.CONNECTOR__NESTING_FEATURE:
				return getNestingFeature();
			case SysMLPackage.CONNECTOR__OWNED_REDEFINITION:
				return getOwnedRedefinition();
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				return getOwnedSubset();
			case SysMLPackage.CONNECTOR__VALUE:
				return getValue();
			case SysMLPackage.CONNECTOR__PARTICIPANT_OF_ASSOCIATION:
				return getParticipantOfAssociation();
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
				return getOwningFeatureMembership();
			case SysMLPackage.CONNECTOR__END_OF_ASSOCIATION:
				if (resolve) return getEndOfAssociation();
				return basicGetEndOfAssociation();
			case SysMLPackage.CONNECTOR__IS_COMPOSITE:
				return isIsComposite();
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
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				return isIsDirected();
			case SysMLPackage.CONNECTOR__SOURCE_LOWER:
				return getSourceLower();
			case SysMLPackage.CONNECTOR__SOURCE_UPPER:
				return getSourceUpper();
			case SysMLPackage.CONNECTOR__TARGET_LOWER:
				return getTargetLower();
			case SysMLPackage.CONNECTOR__TARGET_UPPER:
				return getTargetUpper();
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
			case SysMLPackage.CONNECTOR__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP:
				getOwnedMembership().clear();
				getOwnedMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.CONNECTOR__IMPORTED_MEMBERSHIP:
				getImportedMembership().clear();
				getImportedMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				getOwnedGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case SysMLPackage.CONNECTOR__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				getOwnedFeatureMembership().addAll((Collection<? extends FeatureMembership>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNING_FEATURE:
				setOwningFeature((Feature)newValue);
				return;
			case SysMLPackage.CONNECTOR__LOWER:
				setLower((Expression)newValue);
				return;
			case SysMLPackage.CONNECTOR__UPPER:
				setUpper((Expression)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNING_CLASS:
				setOwningClass((org.omg.sysml.lang.sysml.Class)newValue);
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
				getNestingFeature().clear();
				getNestingFeature().addAll((Collection<? extends Feature>)newValue);
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
			case SysMLPackage.CONNECTOR__PARTICIPANT_OF_ASSOCIATION:
				getParticipantOfAssociation().clear();
				getParticipantOfAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
				setOwningFeatureMembership((FeatureMembership)newValue);
				return;
			case SysMLPackage.CONNECTOR__END_OF_ASSOCIATION:
				setEndOfAssociation((Association)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
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
				getSourcePath().addAll((Collection<? extends FeatureMembership>)newValue);
				return;
			case SysMLPackage.CONNECTOR__TARGET_PATH:
				getTargetPath().clear();
				getTargetPath().addAll((Collection<? extends FeatureMembership>)newValue);
				return;
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				setIsDirected((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__SOURCE_LOWER:
				setSourceLower((Expression)newValue);
				return;
			case SysMLPackage.CONNECTOR__SOURCE_UPPER:
				setSourceUpper((Expression)newValue);
				return;
			case SysMLPackage.CONNECTOR__TARGET_LOWER:
				setTargetLower((Expression)newValue);
				return;
			case SysMLPackage.CONNECTOR__TARGET_UPPER:
				setTargetUpper((Expression)newValue);
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
			case SysMLPackage.CONNECTOR__MEMBER:
				getMember().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP:
				getOwnedMembership().clear();
				return;
			case SysMLPackage.CONNECTOR__IMPORTED_MEMBERSHIP:
				getImportedMembership().clear();
				return;
			case SysMLPackage.CONNECTOR__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__FEATURE:
				getFeature().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				getOwnedFeature().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				return;
			case SysMLPackage.CONNECTOR__INPUT:
				getInput().clear();
				return;
			case SysMLPackage.CONNECTOR__OUTPUT:
				getOutput().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNING_FEATURE:
				setOwningFeature((Feature)null);
				return;
			case SysMLPackage.CONNECTOR__LOWER:
				setLower((Expression)null);
				return;
			case SysMLPackage.CONNECTOR__UPPER:
				setUpper((Expression)null);
				return;
			case SysMLPackage.CONNECTOR__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__OWNING_CLASS:
				setOwningClass((org.omg.sysml.lang.sysml.Class)null);
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
				getNestingFeature().clear();
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
			case SysMLPackage.CONNECTOR__PARTICIPANT_OF_ASSOCIATION:
				getParticipantOfAssociation().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
				setOwningFeatureMembership((FeatureMembership)null);
				return;
			case SysMLPackage.CONNECTOR__END_OF_ASSOCIATION:
				setEndOfAssociation((Association)null);
				return;
			case SysMLPackage.CONNECTOR__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
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
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				setIsDirected(IS_DIRECTED_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__SOURCE_LOWER:
				setSourceLower((Expression)null);
				return;
			case SysMLPackage.CONNECTOR__SOURCE_UPPER:
				setSourceUpper((Expression)null);
				return;
			case SysMLPackage.CONNECTOR__TARGET_LOWER:
				setTargetLower((Expression)null);
				return;
			case SysMLPackage.CONNECTOR__TARGET_UPPER:
				setTargetUpper((Expression)null);
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
			case SysMLPackage.CONNECTOR__MEMBER:
				return member != null && !member.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP:
				return ownedMembership != null && !ownedMembership.isEmpty();
			case SysMLPackage.CONNECTOR__IMPORTED_MEMBERSHIP:
				return importedMembership != null && !importedMembership.isEmpty();
			case SysMLPackage.CONNECTOR__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case SysMLPackage.CONNECTOR__FEATURE:
				return feature != null && !feature.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				return ownedFeature != null && !ownedFeature.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				return ownedGeneralization != null && !ownedGeneralization.isEmpty();
			case SysMLPackage.CONNECTOR__INPUT:
				return input != null && !input.isEmpty();
			case SysMLPackage.CONNECTOR__OUTPUT:
				return output != null && !output.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				return ownedFeatureMembership != null && !ownedFeatureMembership.isEmpty();
			case SysMLPackage.CONNECTOR__OWNING_FEATURE:
				return owningFeature != null;
			case SysMLPackage.CONNECTOR__LOWER:
				return lower != null;
			case SysMLPackage.CONNECTOR__UPPER:
				return upper != null;
			case SysMLPackage.CONNECTOR__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case SysMLPackage.CONNECTOR__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case SysMLPackage.CONNECTOR__OWNING_CLASS:
				return owningClass != null;
			case SysMLPackage.CONNECTOR__TYPE:
				return type != null && !type.isEmpty();
			case SysMLPackage.CONNECTOR__REFERENCED_TYPE:
				return referencedType != null && !referencedType.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case SysMLPackage.CONNECTOR__NESTED_FEATURE:
				return nestedFeature != null && !nestedFeature.isEmpty();
			case SysMLPackage.CONNECTOR__NESTING_FEATURE:
				return nestingFeature != null && !nestingFeature.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_REDEFINITION:
				return ownedRedefinition != null && !ownedRedefinition.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				return ownedSubset != null && !ownedSubset.isEmpty();
			case SysMLPackage.CONNECTOR__VALUE:
				return value != null;
			case SysMLPackage.CONNECTOR__PARTICIPANT_OF_ASSOCIATION:
				return participantOfAssociation != null && !participantOfAssociation.isEmpty();
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
				return getOwningFeatureMembership() != null;
			case SysMLPackage.CONNECTOR__END_OF_ASSOCIATION:
				return endOfAssociation != null;
			case SysMLPackage.CONNECTOR__IS_COMPOSITE:
				return isComposite != IS_COMPOSITE_EDEFAULT;
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
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				return association != null;
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				return isDirected != IS_DIRECTED_EDEFAULT;
			case SysMLPackage.CONNECTOR__SOURCE_LOWER:
				return sourceLower != null;
			case SysMLPackage.CONNECTOR__SOURCE_UPPER:
				return sourceUpper != null;
			case SysMLPackage.CONNECTOR__TARGET_LOWER:
				return targetLower != null;
			case SysMLPackage.CONNECTOR__TARGET_UPPER:
				return targetUpper != null;
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
				case SysMLPackage.CONNECTOR__MEMBER: return SysMLPackage.PACKAGE__MEMBER;
				case SysMLPackage.CONNECTOR__OWNED_MEMBER: return SysMLPackage.PACKAGE__OWNED_MEMBER;
				case SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP: return SysMLPackage.PACKAGE__OWNED_MEMBERSHIP;
				case SysMLPackage.CONNECTOR__IMPORTED_MEMBERSHIP: return SysMLPackage.PACKAGE__IMPORTED_MEMBERSHIP;
				default: return -1;
			}
		}
		if (baseClass == org.omg.sysml.lang.sysml.Class.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTOR__IS_ABSTRACT: return SysMLPackage.CLASS__IS_ABSTRACT;
				case SysMLPackage.CONNECTOR__FEATURE: return SysMLPackage.CLASS__FEATURE;
				case SysMLPackage.CONNECTOR__OWNED_FEATURE: return SysMLPackage.CLASS__OWNED_FEATURE;
				case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION: return SysMLPackage.CLASS__OWNED_GENERALIZATION;
				case SysMLPackage.CONNECTOR__INPUT: return SysMLPackage.CLASS__INPUT;
				case SysMLPackage.CONNECTOR__OUTPUT: return SysMLPackage.CLASS__OUTPUT;
				case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP: return SysMLPackage.CLASS__OWNED_FEATURE_MEMBERSHIP;
				case SysMLPackage.CONNECTOR__OWNING_FEATURE: return SysMLPackage.CLASS__OWNING_FEATURE;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTOR__LOWER: return SysMLPackage.FEATURE__LOWER;
				case SysMLPackage.CONNECTOR__UPPER: return SysMLPackage.FEATURE__UPPER;
				case SysMLPackage.CONNECTOR__IS_UNIQUE: return SysMLPackage.FEATURE__IS_UNIQUE;
				case SysMLPackage.CONNECTOR__IS_ORDERED: return SysMLPackage.FEATURE__IS_ORDERED;
				case SysMLPackage.CONNECTOR__OWNING_CLASS: return SysMLPackage.FEATURE__OWNING_CLASS;
				case SysMLPackage.CONNECTOR__TYPE: return SysMLPackage.FEATURE__TYPE;
				case SysMLPackage.CONNECTOR__REFERENCED_TYPE: return SysMLPackage.FEATURE__REFERENCED_TYPE;
				case SysMLPackage.CONNECTOR__OWNED_TYPE: return SysMLPackage.FEATURE__OWNED_TYPE;
				case SysMLPackage.CONNECTOR__NESTED_FEATURE: return SysMLPackage.FEATURE__NESTED_FEATURE;
				case SysMLPackage.CONNECTOR__NESTING_FEATURE: return SysMLPackage.FEATURE__NESTING_FEATURE;
				case SysMLPackage.CONNECTOR__OWNED_REDEFINITION: return SysMLPackage.FEATURE__OWNED_REDEFINITION;
				case SysMLPackage.CONNECTOR__OWNED_SUBSET: return SysMLPackage.FEATURE__OWNED_SUBSET;
				case SysMLPackage.CONNECTOR__VALUE: return SysMLPackage.FEATURE__VALUE;
				case SysMLPackage.CONNECTOR__PARTICIPANT_OF_ASSOCIATION: return SysMLPackage.FEATURE__PARTICIPANT_OF_ASSOCIATION;
				case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP: return SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP;
				case SysMLPackage.CONNECTOR__END_OF_ASSOCIATION: return SysMLPackage.FEATURE__END_OF_ASSOCIATION;
				case SysMLPackage.CONNECTOR__IS_COMPOSITE: return SysMLPackage.FEATURE__IS_COMPOSITE;
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
				case SysMLPackage.PACKAGE__MEMBER: return SysMLPackage.CONNECTOR__MEMBER;
				case SysMLPackage.PACKAGE__OWNED_MEMBER: return SysMLPackage.CONNECTOR__OWNED_MEMBER;
				case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP: return SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP;
				case SysMLPackage.PACKAGE__IMPORTED_MEMBERSHIP: return SysMLPackage.CONNECTOR__IMPORTED_MEMBERSHIP;
				default: return -1;
			}
		}
		if (baseClass == org.omg.sysml.lang.sysml.Class.class) {
			switch (baseFeatureID) {
				case SysMLPackage.CLASS__IS_ABSTRACT: return SysMLPackage.CONNECTOR__IS_ABSTRACT;
				case SysMLPackage.CLASS__FEATURE: return SysMLPackage.CONNECTOR__FEATURE;
				case SysMLPackage.CLASS__OWNED_FEATURE: return SysMLPackage.CONNECTOR__OWNED_FEATURE;
				case SysMLPackage.CLASS__OWNED_GENERALIZATION: return SysMLPackage.CONNECTOR__OWNED_GENERALIZATION;
				case SysMLPackage.CLASS__INPUT: return SysMLPackage.CONNECTOR__INPUT;
				case SysMLPackage.CLASS__OUTPUT: return SysMLPackage.CONNECTOR__OUTPUT;
				case SysMLPackage.CLASS__OWNED_FEATURE_MEMBERSHIP: return SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP;
				case SysMLPackage.CLASS__OWNING_FEATURE: return SysMLPackage.CONNECTOR__OWNING_FEATURE;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case SysMLPackage.FEATURE__LOWER: return SysMLPackage.CONNECTOR__LOWER;
				case SysMLPackage.FEATURE__UPPER: return SysMLPackage.CONNECTOR__UPPER;
				case SysMLPackage.FEATURE__IS_UNIQUE: return SysMLPackage.CONNECTOR__IS_UNIQUE;
				case SysMLPackage.FEATURE__IS_ORDERED: return SysMLPackage.CONNECTOR__IS_ORDERED;
				case SysMLPackage.FEATURE__OWNING_CLASS: return SysMLPackage.CONNECTOR__OWNING_CLASS;
				case SysMLPackage.FEATURE__TYPE: return SysMLPackage.CONNECTOR__TYPE;
				case SysMLPackage.FEATURE__REFERENCED_TYPE: return SysMLPackage.CONNECTOR__REFERENCED_TYPE;
				case SysMLPackage.FEATURE__OWNED_TYPE: return SysMLPackage.CONNECTOR__OWNED_TYPE;
				case SysMLPackage.FEATURE__NESTED_FEATURE: return SysMLPackage.CONNECTOR__NESTED_FEATURE;
				case SysMLPackage.FEATURE__NESTING_FEATURE: return SysMLPackage.CONNECTOR__NESTING_FEATURE;
				case SysMLPackage.FEATURE__OWNED_REDEFINITION: return SysMLPackage.CONNECTOR__OWNED_REDEFINITION;
				case SysMLPackage.FEATURE__OWNED_SUBSET: return SysMLPackage.CONNECTOR__OWNED_SUBSET;
				case SysMLPackage.FEATURE__VALUE: return SysMLPackage.CONNECTOR__VALUE;
				case SysMLPackage.FEATURE__PARTICIPANT_OF_ASSOCIATION: return SysMLPackage.CONNECTOR__PARTICIPANT_OF_ASSOCIATION;
				case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP: return SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP;
				case SysMLPackage.FEATURE__END_OF_ASSOCIATION: return SysMLPackage.CONNECTOR__END_OF_ASSOCIATION;
				case SysMLPackage.FEATURE__IS_COMPOSITE: return SysMLPackage.CONNECTOR__IS_COMPOSITE;
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
				case SysMLPackage.PACKAGE___EXCLUDE_COLLISIONS__ELIST: return SysMLPackage.CONNECTOR___EXCLUDE_COLLISIONS__ELIST;
				default: return -1;
			}
		}
		if (baseClass == org.omg.sysml.lang.sysml.Class.class) {
			switch (baseOperationID) {
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.CONNECTOR___NAME_OF__ELEMENT:
				return nameOf((Element)arguments.get(0));
			case SysMLPackage.CONNECTOR___EXCLUDE_COLLISIONS__ELIST:
				return excludeCollisions((EList<Membership>)arguments.get(0));
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(", isDirected: ");
		result.append(isDirected);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
