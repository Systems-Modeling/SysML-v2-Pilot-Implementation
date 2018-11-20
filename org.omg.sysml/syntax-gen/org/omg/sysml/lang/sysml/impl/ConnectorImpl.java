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
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConnectorEnd;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedFeatureMembership <em>Owned Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getReferencedType <em>Referenced Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwningCategory <em>Owning Category</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getNestedFeature <em>Nested Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getNestingFeature <em>Nesting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedSubset <em>Owned Subset</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwningFeatureMembership <em>Owning Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsNonunique <em>Is Nonunique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getRelatedFeatures <em>Related Features</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isIsDirected <em>Is Directed</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getConnectorEnd <em>Connector End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedAssociationType <em>Owned Association Type</em>}</li>
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
	 * The cached value of the '{@link #getReferencedType() <em>Referenced Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> referencedType;

	/**
	 * The cached value of the '{@link #getOwningCategory() <em>Owning Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningCategory()
	 * @generated
	 * @ordered
	 */
	protected Category owningCategory;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> type;

	/**
	 * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> ownedType;

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
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_EDEFAULT = "[0..*]";

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNonunique() <em>Is Nonunique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNonunique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NONUNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNonunique() <em>Is Nonunique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNonunique()
	 * @generated
	 * @ordered
	 */
	protected boolean isNonunique = IS_NONUNIQUE_EDEFAULT;

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
	 * The cached value of the '{@link #getConnectorEnd() <em>Connector End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEnd> connectorEnd;

	/**
	 * The cached value of the '{@link #getOwnedAssociationType() <em>Owned Association Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAssociationType()
	 * @generated
	 * @ordered
	 */
	protected Association ownedAssociationType;

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
			ownedImport = new EObjectContainmentWithInverseEList<Import>(Import.class, this, SysMLPackage.CONNECTOR__OWNED_IMPORT, SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE);
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
			ownedMembership = new EObjectContainmentWithInverseEList<Membership>(Membership.class, this, SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP, SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE);
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
			ownedFeature = new EObjectWithInverseResolvingEList<Feature>(Feature.class, this, SysMLPackage.CONNECTOR__OWNED_FEATURE, SysMLPackage.FEATURE__OWNING_CATEGORY);
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
			ownedGeneralization = new EObjectWithInverseResolvingEList<Generalization>(Generalization.class, this, SysMLPackage.CONNECTOR__OWNED_GENERALIZATION, SysMLPackage.GENERALIZATION__OWNING_CATEGORY);
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
			ownedFeatureMembership = new EObjectWithInverseResolvingEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY);
		}
		return ownedFeatureMembership;
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
	public EList<Category> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<Category>(Category.class, this, SysMLPackage.CONNECTOR__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getReferencedType() {
		if (referencedType == null) {
			referencedType = new EObjectResolvingEList<Category>(Category.class, this, SysMLPackage.CONNECTOR__REFERENCED_TYPE);
		}
		return referencedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getOwningCategory() {
		if (owningCategory != null && owningCategory.eIsProxy()) {
			InternalEObject oldOwningCategory = (InternalEObject)owningCategory;
			owningCategory = (Category)eResolveProxy(oldOwningCategory);
			if (owningCategory != oldOwningCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR__OWNING_CATEGORY, oldOwningCategory, owningCategory));
			}
		}
		return owningCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetOwningCategory() {
		return owningCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningCategory(Category newOwningCategory, NotificationChain msgs) {
		Category oldOwningCategory = owningCategory;
		owningCategory = newOwningCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__OWNING_CATEGORY, oldOwningCategory, newOwningCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningCategory(Category newOwningCategory) {
		if (newOwningCategory != owningCategory) {
			NotificationChain msgs = null;
			if (owningCategory != null)
				msgs = ((InternalEObject)owningCategory).eInverseRemove(this, SysMLPackage.CATEGORY__OWNED_FEATURE, Category.class, msgs);
			if (newOwningCategory != null)
				msgs = ((InternalEObject)newOwningCategory).eInverseAdd(this, SysMLPackage.CATEGORY__OWNED_FEATURE, Category.class, msgs);
			msgs = basicSetOwningCategory(newOwningCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__OWNING_CATEGORY, newOwningCategory, newOwningCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectResolvingEList<Category>(Category.class, this, SysMLPackage.CONNECTOR__OWNED_TYPE);
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
	public String getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(String newMultiplicity) {
		String oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNonunique() {
		return isNonunique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNonunique(boolean newIsNonunique) {
		boolean oldIsNonunique = isNonunique;
		isNonunique = newIsNonunique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__IS_NONUNIQUE, oldIsNonunique, isNonunique));
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
	public EList<ConnectorEnd> getConnectorEnd() {
		if (connectorEnd == null) {
			connectorEnd = new EObjectContainmentWithInverseEList<ConnectorEnd>(ConnectorEnd.class, this, SysMLPackage.CONNECTOR__CONNECTOR_END, SysMLPackage.CONNECTOR_END__CONNECTOR);
		}
		return connectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getOwnedAssociationType() {
		if (ownedAssociationType != null && ownedAssociationType.eIsProxy()) {
			InternalEObject oldOwnedAssociationType = (InternalEObject)ownedAssociationType;
			ownedAssociationType = (Association)eResolveProxy(oldOwnedAssociationType);
			if (ownedAssociationType != oldOwnedAssociationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE, oldOwnedAssociationType, ownedAssociationType));
			}
		}
		return ownedAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetOwnedAssociationType() {
		return ownedAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedAssociationType(Association newOwnedAssociationType, NotificationChain msgs) {
		Association oldOwnedAssociationType = ownedAssociationType;
		ownedAssociationType = newOwnedAssociationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE, oldOwnedAssociationType, newOwnedAssociationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedAssociationType(Association newOwnedAssociationType) {
		if (newOwnedAssociationType != ownedAssociationType) {
			NotificationChain msgs = null;
			if (ownedAssociationType != null)
				msgs = ((InternalEObject)ownedAssociationType).eInverseRemove(this, SysMLPackage.ASSOCIATION__OWNING_CONNECTOR, Association.class, msgs);
			if (newOwnedAssociationType != null)
				msgs = ((InternalEObject)newOwnedAssociationType).eInverseAdd(this, SysMLPackage.ASSOCIATION__OWNING_CONNECTOR, Association.class, msgs);
			msgs = basicSetOwnedAssociationType(newOwnedAssociationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE, newOwnedAssociationType, newOwnedAssociationType));
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
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedGeneralization()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeatureMembership()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeature()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNING_CATEGORY:
				if (owningCategory != null)
					msgs = ((InternalEObject)owningCategory).eInverseRemove(this, SysMLPackage.CATEGORY__OWNED_FEATURE, Category.class, msgs);
				return basicSetOwningCategory((Category)otherEnd, msgs);
			case SysMLPackage.CONNECTOR__NESTED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedFeature()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__NESTING_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestingFeature()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedSubset()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningFeatureMembership((FeatureMembership)otherEnd, msgs);
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectorEnd()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				if (ownedAssociationType != null)
					msgs = ((InternalEObject)ownedAssociationType).eInverseRemove(this, SysMLPackage.ASSOCIATION__OWNING_CONNECTOR, Association.class, msgs);
				return basicSetOwnedAssociationType((Association)otherEnd, msgs);
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
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				return ((InternalEList<?>)getOwnedGeneralization()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				return ((InternalEList<?>)getOwnedFeatureMembership()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				return ((InternalEList<?>)getOwnedFeature()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNING_CATEGORY:
				return basicSetOwningCategory(null, msgs);
			case SysMLPackage.CONNECTOR__LOWER:
				return basicSetLower(null, msgs);
			case SysMLPackage.CONNECTOR__UPPER:
				return basicSetUpper(null, msgs);
			case SysMLPackage.CONNECTOR__NESTED_FEATURE:
				return ((InternalEList<?>)getNestedFeature()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__NESTING_FEATURE:
				return ((InternalEList<?>)getNestingFeature()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				return ((InternalEList<?>)getOwnedSubset()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__VALUE:
				return basicSetValue(null, msgs);
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
				return basicSetOwningFeatureMembership(null, msgs);
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				return ((InternalEList<?>)getConnectorEnd()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				return basicSetOwnedAssociationType(null, msgs);
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
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				return getOwnedGeneralization();
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				return getOwnedFeatureMembership();
			case SysMLPackage.CONNECTOR__FEATURE:
				return getFeature();
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				return getOwnedFeature();
			case SysMLPackage.CONNECTOR__INPUT:
				return getInput();
			case SysMLPackage.CONNECTOR__OUTPUT:
				return getOutput();
			case SysMLPackage.CONNECTOR__IS_ABSTRACT:
				return isIsAbstract();
			case SysMLPackage.CONNECTOR__REFERENCED_TYPE:
				return getReferencedType();
			case SysMLPackage.CONNECTOR__OWNING_CATEGORY:
				if (resolve) return getOwningCategory();
				return basicGetOwningCategory();
			case SysMLPackage.CONNECTOR__LOWER:
				return getLower();
			case SysMLPackage.CONNECTOR__UPPER:
				return getUpper();
			case SysMLPackage.CONNECTOR__IS_UNIQUE:
				return isIsUnique();
			case SysMLPackage.CONNECTOR__IS_ORDERED:
				return isIsOrdered();
			case SysMLPackage.CONNECTOR__TYPE:
				return getType();
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
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
				return getOwningFeatureMembership();
			case SysMLPackage.CONNECTOR__IS_COMPOSITE:
				return isIsComposite();
			case SysMLPackage.CONNECTOR__MULTIPLICITY:
				return getMultiplicity();
			case SysMLPackage.CONNECTOR__IS_NONUNIQUE:
				return isIsNonunique();
			case SysMLPackage.CONNECTOR__RELATED_FEATURES:
				return getRelatedFeatures();
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				return isIsDirected();
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				return getConnectorEnd();
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				if (resolve) return getOwnedAssociationType();
				return basicGetOwnedAssociationType();
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
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				getOwnedGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				getOwnedFeatureMembership().addAll((Collection<? extends FeatureMembership>)newValue);
				return;
			case SysMLPackage.CONNECTOR__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__REFERENCED_TYPE:
				getReferencedType().clear();
				getReferencedType().addAll((Collection<? extends Category>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNING_CATEGORY:
				setOwningCategory((Category)newValue);
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
			case SysMLPackage.CONNECTOR__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Category>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends Category>)newValue);
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
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
				setOwningFeatureMembership((FeatureMembership)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__MULTIPLICITY:
				setMultiplicity((String)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_NONUNIQUE:
				setIsNonunique((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__RELATED_FEATURES:
				getRelatedFeatures().clear();
				getRelatedFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				setIsDirected((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				getConnectorEnd().clear();
				getConnectorEnd().addAll((Collection<? extends ConnectorEnd>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				setOwnedAssociationType((Association)newValue);
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
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				return;
			case SysMLPackage.CONNECTOR__FEATURE:
				getFeature().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				getOwnedFeature().clear();
				return;
			case SysMLPackage.CONNECTOR__INPUT:
				getInput().clear();
				return;
			case SysMLPackage.CONNECTOR__OUTPUT:
				getOutput().clear();
				return;
			case SysMLPackage.CONNECTOR__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__REFERENCED_TYPE:
				getReferencedType().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNING_CATEGORY:
				setOwningCategory((Category)null);
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
			case SysMLPackage.CONNECTOR__TYPE:
				getType().clear();
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
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
				setOwningFeatureMembership((FeatureMembership)null);
				return;
			case SysMLPackage.CONNECTOR__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__IS_NONUNIQUE:
				setIsNonunique(IS_NONUNIQUE_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__RELATED_FEATURES:
				getRelatedFeatures().clear();
				return;
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				setIsDirected(IS_DIRECTED_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				getConnectorEnd().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				setOwnedAssociationType((Association)null);
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
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				return ownedGeneralization != null && !ownedGeneralization.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				return ownedFeatureMembership != null && !ownedFeatureMembership.isEmpty();
			case SysMLPackage.CONNECTOR__FEATURE:
				return feature != null && !feature.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				return ownedFeature != null && !ownedFeature.isEmpty();
			case SysMLPackage.CONNECTOR__INPUT:
				return input != null && !input.isEmpty();
			case SysMLPackage.CONNECTOR__OUTPUT:
				return output != null && !output.isEmpty();
			case SysMLPackage.CONNECTOR__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case SysMLPackage.CONNECTOR__REFERENCED_TYPE:
				return referencedType != null && !referencedType.isEmpty();
			case SysMLPackage.CONNECTOR__OWNING_CATEGORY:
				return owningCategory != null;
			case SysMLPackage.CONNECTOR__LOWER:
				return lower != null;
			case SysMLPackage.CONNECTOR__UPPER:
				return upper != null;
			case SysMLPackage.CONNECTOR__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case SysMLPackage.CONNECTOR__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case SysMLPackage.CONNECTOR__TYPE:
				return type != null && !type.isEmpty();
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
			case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP:
				return getOwningFeatureMembership() != null;
			case SysMLPackage.CONNECTOR__IS_COMPOSITE:
				return isComposite != IS_COMPOSITE_EDEFAULT;
			case SysMLPackage.CONNECTOR__MULTIPLICITY:
				return MULTIPLICITY_EDEFAULT == null ? multiplicity != null : !MULTIPLICITY_EDEFAULT.equals(multiplicity);
			case SysMLPackage.CONNECTOR__IS_NONUNIQUE:
				return isNonunique != IS_NONUNIQUE_EDEFAULT;
			case SysMLPackage.CONNECTOR__RELATED_FEATURES:
				return relatedFeatures != null && !relatedFeatures.isEmpty();
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				return association != null;
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				return isDirected != IS_DIRECTED_EDEFAULT;
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				return connectorEnd != null && !connectorEnd.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				return ownedAssociationType != null;
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
		if (baseClass == Category.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION: return SysMLPackage.CATEGORY__OWNED_GENERALIZATION;
				case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP: return SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP;
				case SysMLPackage.CONNECTOR__FEATURE: return SysMLPackage.CATEGORY__FEATURE;
				case SysMLPackage.CONNECTOR__OWNED_FEATURE: return SysMLPackage.CATEGORY__OWNED_FEATURE;
				case SysMLPackage.CONNECTOR__INPUT: return SysMLPackage.CATEGORY__INPUT;
				case SysMLPackage.CONNECTOR__OUTPUT: return SysMLPackage.CATEGORY__OUTPUT;
				case SysMLPackage.CONNECTOR__IS_ABSTRACT: return SysMLPackage.CATEGORY__IS_ABSTRACT;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTOR__REFERENCED_TYPE: return SysMLPackage.FEATURE__REFERENCED_TYPE;
				case SysMLPackage.CONNECTOR__OWNING_CATEGORY: return SysMLPackage.FEATURE__OWNING_CATEGORY;
				case SysMLPackage.CONNECTOR__LOWER: return SysMLPackage.FEATURE__LOWER;
				case SysMLPackage.CONNECTOR__UPPER: return SysMLPackage.FEATURE__UPPER;
				case SysMLPackage.CONNECTOR__IS_UNIQUE: return SysMLPackage.FEATURE__IS_UNIQUE;
				case SysMLPackage.CONNECTOR__IS_ORDERED: return SysMLPackage.FEATURE__IS_ORDERED;
				case SysMLPackage.CONNECTOR__TYPE: return SysMLPackage.FEATURE__TYPE;
				case SysMLPackage.CONNECTOR__OWNED_TYPE: return SysMLPackage.FEATURE__OWNED_TYPE;
				case SysMLPackage.CONNECTOR__NESTED_FEATURE: return SysMLPackage.FEATURE__NESTED_FEATURE;
				case SysMLPackage.CONNECTOR__NESTING_FEATURE: return SysMLPackage.FEATURE__NESTING_FEATURE;
				case SysMLPackage.CONNECTOR__OWNED_REDEFINITION: return SysMLPackage.FEATURE__OWNED_REDEFINITION;
				case SysMLPackage.CONNECTOR__OWNED_SUBSET: return SysMLPackage.FEATURE__OWNED_SUBSET;
				case SysMLPackage.CONNECTOR__VALUE: return SysMLPackage.FEATURE__VALUE;
				case SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP: return SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP;
				case SysMLPackage.CONNECTOR__IS_COMPOSITE: return SysMLPackage.FEATURE__IS_COMPOSITE;
				case SysMLPackage.CONNECTOR__MULTIPLICITY: return SysMLPackage.FEATURE__MULTIPLICITY;
				case SysMLPackage.CONNECTOR__IS_NONUNIQUE: return SysMLPackage.FEATURE__IS_NONUNIQUE;
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
		if (baseClass == Category.class) {
			switch (baseFeatureID) {
				case SysMLPackage.CATEGORY__OWNED_GENERALIZATION: return SysMLPackage.CONNECTOR__OWNED_GENERALIZATION;
				case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP: return SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP;
				case SysMLPackage.CATEGORY__FEATURE: return SysMLPackage.CONNECTOR__FEATURE;
				case SysMLPackage.CATEGORY__OWNED_FEATURE: return SysMLPackage.CONNECTOR__OWNED_FEATURE;
				case SysMLPackage.CATEGORY__INPUT: return SysMLPackage.CONNECTOR__INPUT;
				case SysMLPackage.CATEGORY__OUTPUT: return SysMLPackage.CONNECTOR__OUTPUT;
				case SysMLPackage.CATEGORY__IS_ABSTRACT: return SysMLPackage.CONNECTOR__IS_ABSTRACT;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case SysMLPackage.FEATURE__REFERENCED_TYPE: return SysMLPackage.CONNECTOR__REFERENCED_TYPE;
				case SysMLPackage.FEATURE__OWNING_CATEGORY: return SysMLPackage.CONNECTOR__OWNING_CATEGORY;
				case SysMLPackage.FEATURE__LOWER: return SysMLPackage.CONNECTOR__LOWER;
				case SysMLPackage.FEATURE__UPPER: return SysMLPackage.CONNECTOR__UPPER;
				case SysMLPackage.FEATURE__IS_UNIQUE: return SysMLPackage.CONNECTOR__IS_UNIQUE;
				case SysMLPackage.FEATURE__IS_ORDERED: return SysMLPackage.CONNECTOR__IS_ORDERED;
				case SysMLPackage.FEATURE__TYPE: return SysMLPackage.CONNECTOR__TYPE;
				case SysMLPackage.FEATURE__OWNED_TYPE: return SysMLPackage.CONNECTOR__OWNED_TYPE;
				case SysMLPackage.FEATURE__NESTED_FEATURE: return SysMLPackage.CONNECTOR__NESTED_FEATURE;
				case SysMLPackage.FEATURE__NESTING_FEATURE: return SysMLPackage.CONNECTOR__NESTING_FEATURE;
				case SysMLPackage.FEATURE__OWNED_REDEFINITION: return SysMLPackage.CONNECTOR__OWNED_REDEFINITION;
				case SysMLPackage.FEATURE__OWNED_SUBSET: return SysMLPackage.CONNECTOR__OWNED_SUBSET;
				case SysMLPackage.FEATURE__VALUE: return SysMLPackage.CONNECTOR__VALUE;
				case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP: return SysMLPackage.CONNECTOR__OWNING_FEATURE_MEMBERSHIP;
				case SysMLPackage.FEATURE__IS_COMPOSITE: return SysMLPackage.CONNECTOR__IS_COMPOSITE;
				case SysMLPackage.FEATURE__MULTIPLICITY: return SysMLPackage.CONNECTOR__MULTIPLICITY;
				case SysMLPackage.FEATURE__IS_NONUNIQUE: return SysMLPackage.CONNECTOR__IS_NONUNIQUE;
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
		if (baseClass == Category.class) {
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
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(", isNonunique: ");
		result.append(isNonunique);
		result.append(", isDirected: ");
		result.append(isDirected);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
