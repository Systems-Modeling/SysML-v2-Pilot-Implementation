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
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.kerml.core.CorePackage;
import org.omg.sysml.kerml.core.ElementRecord;

import org.omg.sysml.kerml.core.impl.RelationshipImpl;

import org.omg.sysml.kerml.core.visibilityKind;

import org.omg.sysml.kerml.structure.Association;
import org.omg.sysml.kerml.structure.Connector;
import org.omg.sysml.kerml.structure.Feature;
import org.omg.sysml.kerml.structure.Generalization;
import org.omg.sysml.kerml.structure.StructurePackage;
import org.omg.sysml.kerml.structure.StructuredClass;
import org.omg.sysml.kerml.structure.StructuredFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getPackageVisibility <em>Package Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getSpecificClassifier <em>Specific Classifier</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getGeneralClassifier <em>General Classifier</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getInheritedFeature <em>Inherited Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getTypesFeature <em>Types Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getNestedFeatureOfClass <em>Nested Feature Of Class</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getRequiredProperty <em>Required Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getProvidedProperty <em>Provided Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#isIsEncapsulated <em>Is Encapsulated</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getOwnedStructuredFeature <em>Owned Structured Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getTypesProperty <em>Types Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getBlindProperty <em>Blind Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getPortProperty <em>Port Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getProxyPort <em>Proxy Port</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getSelfPort <em>Self Port</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getFullPort <em>Full Port</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getInteractionParticipant <em>Interaction Participant</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getTargetEndProperty <em>Target End Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getTargetParticipantProperty <em>Target Participant Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getSourceEndProperty <em>Source End Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getSourceParticipantProperty <em>Source Participant Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getParticipantProperty <em>Participant Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getEndProperty <em>End Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.AssociationImpl#getTypesConnector <em>Types Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends RelationshipImpl implements Association {
	/**
	 * The default value of the '{@link #getPackageVisibility() <em>Package Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final visibilityKind PACKAGE_VISIBILITY_EDEFAULT = visibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getPackageVisibility() <em>Package Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageVisibility()
	 * @generated
	 * @ordered
	 */
	protected visibilityKind packageVisibility = PACKAGE_VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedMember() <em>Owned Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementRecord> ownedMember;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementRecord> member;

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
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' reference list.
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
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> output;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> input;

	/**
	 * The cached value of the '{@link #getRequiredProperty() <em>Required Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> requiredProperty;

	/**
	 * The cached value of the '{@link #getProvidedProperty() <em>Provided Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> providedProperty;

	/**
	 * The default value of the '{@link #isIsEncapsulated() <em>Is Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENCAPSULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEncapsulated() <em>Is Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected boolean isEncapsulated = IS_ENCAPSULATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConjugate() <em>Conjugate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjugate()
	 * @generated
	 * @ordered
	 */
	protected StructuredClass conjugate;

	/**
	 * The cached value of the '{@link #getOwnedConnector() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> ownedConnector;

	/**
	 * The cached value of the '{@link #getOwnedStructuredFeature() <em>Owned Structured Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStructuredFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> ownedStructuredFeature;

	/**
	 * The cached value of the '{@link #getTypesProperty() <em>Types Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> typesProperty;

	/**
	 * The cached value of the '{@link #getBlindProperty() <em>Blind Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlindProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> blindProperty;

	/**
	 * The cached value of the '{@link #getPortProperty() <em>Port Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> portProperty;

	/**
	 * The cached value of the '{@link #getProxyPort() <em>Proxy Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyPort()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> proxyPort;

	/**
	 * The cached value of the '{@link #getSelfPort() <em>Self Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfPort()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> selfPort;

	/**
	 * The cached value of the '{@link #getFullPort() <em>Full Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullPort()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> fullPort;

	/**
	 * The cached value of the '{@link #getInteractionParticipant() <em>Interaction Participant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> interactionParticipant;

	/**
	 * The cached value of the '{@link #getTargetEndProperty() <em>Target End Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEndProperty()
	 * @generated
	 * @ordered
	 */
	protected StructuredFeature targetEndProperty;

	/**
	 * The cached value of the '{@link #getTargetParticipantProperty() <em>Target Participant Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetParticipantProperty()
	 * @generated
	 * @ordered
	 */
	protected StructuredFeature targetParticipantProperty;

	/**
	 * The cached value of the '{@link #getSourceEndProperty() <em>Source End Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEndProperty()
	 * @generated
	 * @ordered
	 */
	protected StructuredFeature sourceEndProperty;

	/**
	 * The cached value of the '{@link #getSourceParticipantProperty() <em>Source Participant Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceParticipantProperty()
	 * @generated
	 * @ordered
	 */
	protected StructuredFeature sourceParticipantProperty;

	/**
	 * The cached value of the '{@link #getParticipantProperty() <em>Participant Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> participantProperty;

	/**
	 * The cached value of the '{@link #getEndProperty() <em>End Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> endProperty;

	/**
	 * The cached value of the '{@link #getTypesConnector() <em>Types Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> typesConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public visibilityKind getPackageVisibility() {
		return packageVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageVisibility(visibilityKind newPackageVisibility) {
		visibilityKind oldPackageVisibility = packageVisibility;
		packageVisibility = newPackageVisibility == null ? PACKAGE_VISIBILITY_EDEFAULT : newPackageVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ASSOCIATION__PACKAGE_VISIBILITY, oldPackageVisibility, packageVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementRecord> getOwnedMember() {
		if (ownedMember == null) {
			ownedMember = new EObjectContainmentWithInverseEList<ElementRecord>(ElementRecord.class, this, StructurePackage.ASSOCIATION__OWNED_MEMBER, CorePackage.ELEMENT_RECORD__NAMESPACE);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementRecord> getMember() {
		if (member == null) {
			member = new EObjectWithInverseResolvingEList.ManyInverse<ElementRecord>(ElementRecord.class, this, StructurePackage.ASSOCIATION__MEMBER, CorePackage.ELEMENT_RECORD__MEMBER_OF_NAMESPACE);
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
			specificClassifier = new EObjectResolvingEList<org.omg.sysml.kerml.structure.Class>(org.omg.sysml.kerml.structure.Class.class, this, StructurePackage.ASSOCIATION__SPECIFIC_CLASSIFIER);
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
			generalClassifier = new EObjectResolvingEList<org.omg.sysml.kerml.structure.Class>(org.omg.sysml.kerml.structure.Class.class, this, StructurePackage.ASSOCIATION__GENERAL_CLASSIFIER);
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
			ownedFeature = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, StructurePackage.ASSOCIATION__OWNED_FEATURE, StructurePackage.FEATURE__CLASS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ASSOCIATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getInheritedFeature() {
		if (inheritedFeature == null) {
			inheritedFeature = new EObjectResolvingEList<Feature>(Feature.class, this, StructurePackage.ASSOCIATION__INHERITED_FEATURE);
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
			typesFeature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, StructurePackage.ASSOCIATION__TYPES_FEATURE, StructurePackage.FEATURE__TYPE);
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
			feature = new EObjectWithInverseResolvingEList<Feature>(Feature.class, this, StructurePackage.ASSOCIATION__FEATURE, StructurePackage.FEATURE__FEATURING_CLASSIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.ASSOCIATION__INSTANCE_OF, oldInstanceOf, instanceOf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ASSOCIATION__INSTANCE_OF, oldInstanceOf, instanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectWithInverseResolvingEList<Generalization>(Generalization.class, this, StructurePackage.ASSOCIATION__GENERALIZATION, StructurePackage.GENERALIZATION__SPECIFIC);
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
			nestedFeatureOfClass = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, StructurePackage.ASSOCIATION__NESTED_FEATURE_OF_CLASS, StructurePackage.FEATURE__CONTEXT);
		}
		return nestedFeatureOfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getRequiredProperty() {
		if (requiredProperty == null) {
			requiredProperty = new EObjectResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__REQUIRED_PROPERTY);
		}
		return requiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getProvidedProperty() {
		if (providedProperty == null) {
			providedProperty = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__PROVIDED_PROPERTY);
		}
		return providedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEncapsulated() {
		return isEncapsulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEncapsulated(boolean newIsEncapsulated) {
		boolean oldIsEncapsulated = isEncapsulated;
		isEncapsulated = newIsEncapsulated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ASSOCIATION__IS_ENCAPSULATED, oldIsEncapsulated, isEncapsulated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClass getConjugate() {
		if (conjugate != null && conjugate.eIsProxy()) {
			InternalEObject oldConjugate = (InternalEObject)conjugate;
			conjugate = (StructuredClass)eResolveProxy(oldConjugate);
			if (conjugate != oldConjugate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.ASSOCIATION__CONJUGATE, oldConjugate, conjugate));
			}
		}
		return conjugate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClass basicGetConjugate() {
		return conjugate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConjugate(StructuredClass newConjugate) {
		StructuredClass oldConjugate = conjugate;
		conjugate = newConjugate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ASSOCIATION__CONJUGATE, oldConjugate, conjugate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOwnedConnector() {
		if (ownedConnector == null) {
			ownedConnector = new EObjectContainmentEList<Connector>(Connector.class, this, StructurePackage.ASSOCIATION__OWNED_CONNECTOR);
		}
		return ownedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getOwnedStructuredFeature() {
		if (ownedStructuredFeature == null) {
			ownedStructuredFeature = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__OWNED_STRUCTURED_FEATURE);
		}
		return ownedStructuredFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getTypesProperty() {
		if (typesProperty == null) {
			typesProperty = new EObjectResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__TYPES_PROPERTY);
		}
		return typesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getBlindProperty() {
		if (blindProperty == null) {
			blindProperty = new EObjectResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__BLIND_PROPERTY);
		}
		return blindProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getPortProperty() {
		if (portProperty == null) {
			portProperty = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__PORT_PROPERTY);
		}
		return portProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getProxyPort() {
		if (proxyPort == null) {
			proxyPort = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__PROXY_PORT);
		}
		return proxyPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getSelfPort() {
		if (selfPort == null) {
			selfPort = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__SELF_PORT);
		}
		return selfPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getFullPort() {
		if (fullPort == null) {
			fullPort = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__FULL_PORT);
		}
		return fullPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getInteractionParticipant() {
		if (interactionParticipant == null) {
			interactionParticipant = new EObjectResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__INTERACTION_PARTICIPANT);
		}
		return interactionParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredFeature getTargetEndProperty() {
		if (targetEndProperty != null && targetEndProperty.eIsProxy()) {
			InternalEObject oldTargetEndProperty = (InternalEObject)targetEndProperty;
			targetEndProperty = (StructuredFeature)eResolveProxy(oldTargetEndProperty);
			if (targetEndProperty != oldTargetEndProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.ASSOCIATION__TARGET_END_PROPERTY, oldTargetEndProperty, targetEndProperty));
			}
		}
		return targetEndProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredFeature basicGetTargetEndProperty() {
		return targetEndProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEndProperty(StructuredFeature newTargetEndProperty) {
		StructuredFeature oldTargetEndProperty = targetEndProperty;
		targetEndProperty = newTargetEndProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ASSOCIATION__TARGET_END_PROPERTY, oldTargetEndProperty, targetEndProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredFeature getTargetParticipantProperty() {
		return targetParticipantProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetParticipantProperty(StructuredFeature newTargetParticipantProperty, NotificationChain msgs) {
		StructuredFeature oldTargetParticipantProperty = targetParticipantProperty;
		targetParticipantProperty = newTargetParticipantProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.ASSOCIATION__TARGET_PARTICIPANT_PROPERTY, oldTargetParticipantProperty, newTargetParticipantProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetParticipantProperty(StructuredFeature newTargetParticipantProperty) {
		if (newTargetParticipantProperty != targetParticipantProperty) {
			NotificationChain msgs = null;
			if (targetParticipantProperty != null)
				msgs = ((InternalEObject)targetParticipantProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.ASSOCIATION__TARGET_PARTICIPANT_PROPERTY, null, msgs);
			if (newTargetParticipantProperty != null)
				msgs = ((InternalEObject)newTargetParticipantProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.ASSOCIATION__TARGET_PARTICIPANT_PROPERTY, null, msgs);
			msgs = basicSetTargetParticipantProperty(newTargetParticipantProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ASSOCIATION__TARGET_PARTICIPANT_PROPERTY, newTargetParticipantProperty, newTargetParticipantProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredFeature getSourceEndProperty() {
		if (sourceEndProperty != null && sourceEndProperty.eIsProxy()) {
			InternalEObject oldSourceEndProperty = (InternalEObject)sourceEndProperty;
			sourceEndProperty = (StructuredFeature)eResolveProxy(oldSourceEndProperty);
			if (sourceEndProperty != oldSourceEndProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.ASSOCIATION__SOURCE_END_PROPERTY, oldSourceEndProperty, sourceEndProperty));
			}
		}
		return sourceEndProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredFeature basicGetSourceEndProperty() {
		return sourceEndProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEndProperty(StructuredFeature newSourceEndProperty) {
		StructuredFeature oldSourceEndProperty = sourceEndProperty;
		sourceEndProperty = newSourceEndProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ASSOCIATION__SOURCE_END_PROPERTY, oldSourceEndProperty, sourceEndProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredFeature getSourceParticipantProperty() {
		return sourceParticipantProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceParticipantProperty(StructuredFeature newSourceParticipantProperty, NotificationChain msgs) {
		StructuredFeature oldSourceParticipantProperty = sourceParticipantProperty;
		sourceParticipantProperty = newSourceParticipantProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.ASSOCIATION__SOURCE_PARTICIPANT_PROPERTY, oldSourceParticipantProperty, newSourceParticipantProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceParticipantProperty(StructuredFeature newSourceParticipantProperty) {
		if (newSourceParticipantProperty != sourceParticipantProperty) {
			NotificationChain msgs = null;
			if (sourceParticipantProperty != null)
				msgs = ((InternalEObject)sourceParticipantProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.ASSOCIATION__SOURCE_PARTICIPANT_PROPERTY, null, msgs);
			if (newSourceParticipantProperty != null)
				msgs = ((InternalEObject)newSourceParticipantProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.ASSOCIATION__SOURCE_PARTICIPANT_PROPERTY, null, msgs);
			msgs = basicSetSourceParticipantProperty(newSourceParticipantProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.ASSOCIATION__SOURCE_PARTICIPANT_PROPERTY, newSourceParticipantProperty, newSourceParticipantProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getParticipantProperty() {
		if (participantProperty == null) {
			participantProperty = new EObjectWithInverseResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY, StructurePackage.STRUCTURED_FEATURE__PARTICIPATES_IN);
		}
		return participantProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getEndProperty() {
		if (endProperty == null) {
			endProperty = new EObjectWithInverseResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.ASSOCIATION__END_PROPERTY, StructurePackage.STRUCTURED_FEATURE__END_OF);
		}
		return endProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getTypesConnector() {
		if (typesConnector == null) {
			typesConnector = new EObjectResolvingEList<Connector>(Connector.class, this, StructurePackage.ASSOCIATION__TYPES_CONNECTOR);
		}
		return typesConnector;
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
			case StructurePackage.ASSOCIATION__OWNED_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMember()).basicAdd(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMember()).basicAdd(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__OWNED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeature()).basicAdd(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__TYPES_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypesFeature()).basicAdd(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeature()).basicAdd(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__NESTED_FEATURE_OF_CLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedFeatureOfClass()).basicAdd(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipantProperty()).basicAdd(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__END_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndProperty()).basicAdd(otherEnd, msgs);
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
			case StructurePackage.ASSOCIATION__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__OWNED_FEATURE:
				return ((InternalEList<?>)getOwnedFeature()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__TYPES_FEATURE:
				return ((InternalEList<?>)getTypesFeature()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__NESTED_FEATURE_OF_CLASS:
				return ((InternalEList<?>)getNestedFeatureOfClass()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__PROVIDED_PROPERTY:
				return ((InternalEList<?>)getProvidedProperty()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnector()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__OWNED_STRUCTURED_FEATURE:
				return ((InternalEList<?>)getOwnedStructuredFeature()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__PORT_PROPERTY:
				return ((InternalEList<?>)getPortProperty()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__PROXY_PORT:
				return ((InternalEList<?>)getProxyPort()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__SELF_PORT:
				return ((InternalEList<?>)getSelfPort()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__FULL_PORT:
				return ((InternalEList<?>)getFullPort()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__TARGET_PARTICIPANT_PROPERTY:
				return basicSetTargetParticipantProperty(null, msgs);
			case StructurePackage.ASSOCIATION__SOURCE_PARTICIPANT_PROPERTY:
				return basicSetSourceParticipantProperty(null, msgs);
			case StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY:
				return ((InternalEList<?>)getParticipantProperty()).basicRemove(otherEnd, msgs);
			case StructurePackage.ASSOCIATION__END_PROPERTY:
				return ((InternalEList<?>)getEndProperty()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.ASSOCIATION__PACKAGE_VISIBILITY:
				return getPackageVisibility();
			case StructurePackage.ASSOCIATION__OWNED_MEMBER:
				return getOwnedMember();
			case StructurePackage.ASSOCIATION__MEMBER:
				return getMember();
			case StructurePackage.ASSOCIATION__SPECIFIC_CLASSIFIER:
				return getSpecificClassifier();
			case StructurePackage.ASSOCIATION__GENERAL_CLASSIFIER:
				return getGeneralClassifier();
			case StructurePackage.ASSOCIATION__OWNED_FEATURE:
				return getOwnedFeature();
			case StructurePackage.ASSOCIATION__IS_ABSTRACT:
				return isIsAbstract();
			case StructurePackage.ASSOCIATION__INHERITED_FEATURE:
				return getInheritedFeature();
			case StructurePackage.ASSOCIATION__TYPES_FEATURE:
				return getTypesFeature();
			case StructurePackage.ASSOCIATION__FEATURE:
				return getFeature();
			case StructurePackage.ASSOCIATION__INSTANCE_OF:
				if (resolve) return getInstanceOf();
				return basicGetInstanceOf();
			case StructurePackage.ASSOCIATION__GENERALIZATION:
				return getGeneralization();
			case StructurePackage.ASSOCIATION__NESTED_FEATURE_OF_CLASS:
				return getNestedFeatureOfClass();
			case StructurePackage.ASSOCIATION__OUTPUT:
				return getOutput();
			case StructurePackage.ASSOCIATION__INPUT:
				return getInput();
			case StructurePackage.ASSOCIATION__REQUIRED_PROPERTY:
				return getRequiredProperty();
			case StructurePackage.ASSOCIATION__PROVIDED_PROPERTY:
				return getProvidedProperty();
			case StructurePackage.ASSOCIATION__IS_ENCAPSULATED:
				return isIsEncapsulated();
			case StructurePackage.ASSOCIATION__CONJUGATE:
				if (resolve) return getConjugate();
				return basicGetConjugate();
			case StructurePackage.ASSOCIATION__OWNED_CONNECTOR:
				return getOwnedConnector();
			case StructurePackage.ASSOCIATION__OWNED_STRUCTURED_FEATURE:
				return getOwnedStructuredFeature();
			case StructurePackage.ASSOCIATION__TYPES_PROPERTY:
				return getTypesProperty();
			case StructurePackage.ASSOCIATION__BLIND_PROPERTY:
				return getBlindProperty();
			case StructurePackage.ASSOCIATION__PORT_PROPERTY:
				return getPortProperty();
			case StructurePackage.ASSOCIATION__PROXY_PORT:
				return getProxyPort();
			case StructurePackage.ASSOCIATION__SELF_PORT:
				return getSelfPort();
			case StructurePackage.ASSOCIATION__FULL_PORT:
				return getFullPort();
			case StructurePackage.ASSOCIATION__INTERACTION_PARTICIPANT:
				return getInteractionParticipant();
			case StructurePackage.ASSOCIATION__TARGET_END_PROPERTY:
				if (resolve) return getTargetEndProperty();
				return basicGetTargetEndProperty();
			case StructurePackage.ASSOCIATION__TARGET_PARTICIPANT_PROPERTY:
				return getTargetParticipantProperty();
			case StructurePackage.ASSOCIATION__SOURCE_END_PROPERTY:
				if (resolve) return getSourceEndProperty();
				return basicGetSourceEndProperty();
			case StructurePackage.ASSOCIATION__SOURCE_PARTICIPANT_PROPERTY:
				return getSourceParticipantProperty();
			case StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY:
				return getParticipantProperty();
			case StructurePackage.ASSOCIATION__END_PROPERTY:
				return getEndProperty();
			case StructurePackage.ASSOCIATION__TYPES_CONNECTOR:
				return getTypesConnector();
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
			case StructurePackage.ASSOCIATION__PACKAGE_VISIBILITY:
				setPackageVisibility((visibilityKind)newValue);
				return;
			case StructurePackage.ASSOCIATION__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends ElementRecord>)newValue);
				return;
			case StructurePackage.ASSOCIATION__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends ElementRecord>)newValue);
				return;
			case StructurePackage.ASSOCIATION__SPECIFIC_CLASSIFIER:
				getSpecificClassifier().clear();
				getSpecificClassifier().addAll((Collection<? extends org.omg.sysml.kerml.structure.Class>)newValue);
				return;
			case StructurePackage.ASSOCIATION__GENERAL_CLASSIFIER:
				getGeneralClassifier().clear();
				getGeneralClassifier().addAll((Collection<? extends org.omg.sysml.kerml.structure.Class>)newValue);
				return;
			case StructurePackage.ASSOCIATION__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case StructurePackage.ASSOCIATION__INHERITED_FEATURE:
				getInheritedFeature().clear();
				getInheritedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__TYPES_FEATURE:
				getTypesFeature().clear();
				getTypesFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__INSTANCE_OF:
				setInstanceOf((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.ASSOCIATION__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case StructurePackage.ASSOCIATION__NESTED_FEATURE_OF_CLASS:
				getNestedFeatureOfClass().clear();
				getNestedFeatureOfClass().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__REQUIRED_PROPERTY:
				getRequiredProperty().clear();
				getRequiredProperty().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__PROVIDED_PROPERTY:
				getProvidedProperty().clear();
				getProvidedProperty().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__IS_ENCAPSULATED:
				setIsEncapsulated((Boolean)newValue);
				return;
			case StructurePackage.ASSOCIATION__CONJUGATE:
				setConjugate((StructuredClass)newValue);
				return;
			case StructurePackage.ASSOCIATION__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				getOwnedConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case StructurePackage.ASSOCIATION__OWNED_STRUCTURED_FEATURE:
				getOwnedStructuredFeature().clear();
				getOwnedStructuredFeature().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__TYPES_PROPERTY:
				getTypesProperty().clear();
				getTypesProperty().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__BLIND_PROPERTY:
				getBlindProperty().clear();
				getBlindProperty().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__PORT_PROPERTY:
				getPortProperty().clear();
				getPortProperty().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__PROXY_PORT:
				getProxyPort().clear();
				getProxyPort().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__SELF_PORT:
				getSelfPort().clear();
				getSelfPort().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__FULL_PORT:
				getFullPort().clear();
				getFullPort().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__INTERACTION_PARTICIPANT:
				getInteractionParticipant().clear();
				getInteractionParticipant().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__TARGET_END_PROPERTY:
				setTargetEndProperty((StructuredFeature)newValue);
				return;
			case StructurePackage.ASSOCIATION__TARGET_PARTICIPANT_PROPERTY:
				setTargetParticipantProperty((StructuredFeature)newValue);
				return;
			case StructurePackage.ASSOCIATION__SOURCE_END_PROPERTY:
				setSourceEndProperty((StructuredFeature)newValue);
				return;
			case StructurePackage.ASSOCIATION__SOURCE_PARTICIPANT_PROPERTY:
				setSourceParticipantProperty((StructuredFeature)newValue);
				return;
			case StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY:
				getParticipantProperty().clear();
				getParticipantProperty().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__END_PROPERTY:
				getEndProperty().clear();
				getEndProperty().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.ASSOCIATION__TYPES_CONNECTOR:
				getTypesConnector().clear();
				getTypesConnector().addAll((Collection<? extends Connector>)newValue);
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
			case StructurePackage.ASSOCIATION__PACKAGE_VISIBILITY:
				setPackageVisibility(PACKAGE_VISIBILITY_EDEFAULT);
				return;
			case StructurePackage.ASSOCIATION__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case StructurePackage.ASSOCIATION__MEMBER:
				getMember().clear();
				return;
			case StructurePackage.ASSOCIATION__SPECIFIC_CLASSIFIER:
				getSpecificClassifier().clear();
				return;
			case StructurePackage.ASSOCIATION__GENERAL_CLASSIFIER:
				getGeneralClassifier().clear();
				return;
			case StructurePackage.ASSOCIATION__OWNED_FEATURE:
				getOwnedFeature().clear();
				return;
			case StructurePackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case StructurePackage.ASSOCIATION__INHERITED_FEATURE:
				getInheritedFeature().clear();
				return;
			case StructurePackage.ASSOCIATION__TYPES_FEATURE:
				getTypesFeature().clear();
				return;
			case StructurePackage.ASSOCIATION__FEATURE:
				getFeature().clear();
				return;
			case StructurePackage.ASSOCIATION__INSTANCE_OF:
				setInstanceOf((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.ASSOCIATION__GENERALIZATION:
				getGeneralization().clear();
				return;
			case StructurePackage.ASSOCIATION__NESTED_FEATURE_OF_CLASS:
				getNestedFeatureOfClass().clear();
				return;
			case StructurePackage.ASSOCIATION__OUTPUT:
				getOutput().clear();
				return;
			case StructurePackage.ASSOCIATION__INPUT:
				getInput().clear();
				return;
			case StructurePackage.ASSOCIATION__REQUIRED_PROPERTY:
				getRequiredProperty().clear();
				return;
			case StructurePackage.ASSOCIATION__PROVIDED_PROPERTY:
				getProvidedProperty().clear();
				return;
			case StructurePackage.ASSOCIATION__IS_ENCAPSULATED:
				setIsEncapsulated(IS_ENCAPSULATED_EDEFAULT);
				return;
			case StructurePackage.ASSOCIATION__CONJUGATE:
				setConjugate((StructuredClass)null);
				return;
			case StructurePackage.ASSOCIATION__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				return;
			case StructurePackage.ASSOCIATION__OWNED_STRUCTURED_FEATURE:
				getOwnedStructuredFeature().clear();
				return;
			case StructurePackage.ASSOCIATION__TYPES_PROPERTY:
				getTypesProperty().clear();
				return;
			case StructurePackage.ASSOCIATION__BLIND_PROPERTY:
				getBlindProperty().clear();
				return;
			case StructurePackage.ASSOCIATION__PORT_PROPERTY:
				getPortProperty().clear();
				return;
			case StructurePackage.ASSOCIATION__PROXY_PORT:
				getProxyPort().clear();
				return;
			case StructurePackage.ASSOCIATION__SELF_PORT:
				getSelfPort().clear();
				return;
			case StructurePackage.ASSOCIATION__FULL_PORT:
				getFullPort().clear();
				return;
			case StructurePackage.ASSOCIATION__INTERACTION_PARTICIPANT:
				getInteractionParticipant().clear();
				return;
			case StructurePackage.ASSOCIATION__TARGET_END_PROPERTY:
				setTargetEndProperty((StructuredFeature)null);
				return;
			case StructurePackage.ASSOCIATION__TARGET_PARTICIPANT_PROPERTY:
				setTargetParticipantProperty((StructuredFeature)null);
				return;
			case StructurePackage.ASSOCIATION__SOURCE_END_PROPERTY:
				setSourceEndProperty((StructuredFeature)null);
				return;
			case StructurePackage.ASSOCIATION__SOURCE_PARTICIPANT_PROPERTY:
				setSourceParticipantProperty((StructuredFeature)null);
				return;
			case StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY:
				getParticipantProperty().clear();
				return;
			case StructurePackage.ASSOCIATION__END_PROPERTY:
				getEndProperty().clear();
				return;
			case StructurePackage.ASSOCIATION__TYPES_CONNECTOR:
				getTypesConnector().clear();
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
			case StructurePackage.ASSOCIATION__PACKAGE_VISIBILITY:
				return packageVisibility != PACKAGE_VISIBILITY_EDEFAULT;
			case StructurePackage.ASSOCIATION__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case StructurePackage.ASSOCIATION__MEMBER:
				return member != null && !member.isEmpty();
			case StructurePackage.ASSOCIATION__SPECIFIC_CLASSIFIER:
				return specificClassifier != null && !specificClassifier.isEmpty();
			case StructurePackage.ASSOCIATION__GENERAL_CLASSIFIER:
				return generalClassifier != null && !generalClassifier.isEmpty();
			case StructurePackage.ASSOCIATION__OWNED_FEATURE:
				return ownedFeature != null && !ownedFeature.isEmpty();
			case StructurePackage.ASSOCIATION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case StructurePackage.ASSOCIATION__INHERITED_FEATURE:
				return inheritedFeature != null && !inheritedFeature.isEmpty();
			case StructurePackage.ASSOCIATION__TYPES_FEATURE:
				return typesFeature != null && !typesFeature.isEmpty();
			case StructurePackage.ASSOCIATION__FEATURE:
				return feature != null && !feature.isEmpty();
			case StructurePackage.ASSOCIATION__INSTANCE_OF:
				return instanceOf != null;
			case StructurePackage.ASSOCIATION__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case StructurePackage.ASSOCIATION__NESTED_FEATURE_OF_CLASS:
				return nestedFeatureOfClass != null && !nestedFeatureOfClass.isEmpty();
			case StructurePackage.ASSOCIATION__OUTPUT:
				return output != null && !output.isEmpty();
			case StructurePackage.ASSOCIATION__INPUT:
				return input != null && !input.isEmpty();
			case StructurePackage.ASSOCIATION__REQUIRED_PROPERTY:
				return requiredProperty != null && !requiredProperty.isEmpty();
			case StructurePackage.ASSOCIATION__PROVIDED_PROPERTY:
				return providedProperty != null && !providedProperty.isEmpty();
			case StructurePackage.ASSOCIATION__IS_ENCAPSULATED:
				return isEncapsulated != IS_ENCAPSULATED_EDEFAULT;
			case StructurePackage.ASSOCIATION__CONJUGATE:
				return conjugate != null;
			case StructurePackage.ASSOCIATION__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case StructurePackage.ASSOCIATION__OWNED_STRUCTURED_FEATURE:
				return ownedStructuredFeature != null && !ownedStructuredFeature.isEmpty();
			case StructurePackage.ASSOCIATION__TYPES_PROPERTY:
				return typesProperty != null && !typesProperty.isEmpty();
			case StructurePackage.ASSOCIATION__BLIND_PROPERTY:
				return blindProperty != null && !blindProperty.isEmpty();
			case StructurePackage.ASSOCIATION__PORT_PROPERTY:
				return portProperty != null && !portProperty.isEmpty();
			case StructurePackage.ASSOCIATION__PROXY_PORT:
				return proxyPort != null && !proxyPort.isEmpty();
			case StructurePackage.ASSOCIATION__SELF_PORT:
				return selfPort != null && !selfPort.isEmpty();
			case StructurePackage.ASSOCIATION__FULL_PORT:
				return fullPort != null && !fullPort.isEmpty();
			case StructurePackage.ASSOCIATION__INTERACTION_PARTICIPANT:
				return interactionParticipant != null && !interactionParticipant.isEmpty();
			case StructurePackage.ASSOCIATION__TARGET_END_PROPERTY:
				return targetEndProperty != null;
			case StructurePackage.ASSOCIATION__TARGET_PARTICIPANT_PROPERTY:
				return targetParticipantProperty != null;
			case StructurePackage.ASSOCIATION__SOURCE_END_PROPERTY:
				return sourceEndProperty != null;
			case StructurePackage.ASSOCIATION__SOURCE_PARTICIPANT_PROPERTY:
				return sourceParticipantProperty != null;
			case StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY:
				return participantProperty != null && !participantProperty.isEmpty();
			case StructurePackage.ASSOCIATION__END_PROPERTY:
				return endProperty != null && !endProperty.isEmpty();
			case StructurePackage.ASSOCIATION__TYPES_CONNECTOR:
				return typesConnector != null && !typesConnector.isEmpty();
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
				case StructurePackage.ASSOCIATION__PACKAGE_VISIBILITY: return CorePackage.CONTAINER__PACKAGE_VISIBILITY;
				case StructurePackage.ASSOCIATION__OWNED_MEMBER: return CorePackage.CONTAINER__OWNED_MEMBER;
				case StructurePackage.ASSOCIATION__MEMBER: return CorePackage.CONTAINER__MEMBER;
				default: return -1;
			}
		}
		if (baseClass == org.omg.sysml.kerml.structure.Class.class) {
			switch (derivedFeatureID) {
				case StructurePackage.ASSOCIATION__SPECIFIC_CLASSIFIER: return StructurePackage.CLASS__SPECIFIC_CLASSIFIER;
				case StructurePackage.ASSOCIATION__GENERAL_CLASSIFIER: return StructurePackage.CLASS__GENERAL_CLASSIFIER;
				case StructurePackage.ASSOCIATION__OWNED_FEATURE: return StructurePackage.CLASS__OWNED_FEATURE;
				case StructurePackage.ASSOCIATION__IS_ABSTRACT: return StructurePackage.CLASS__IS_ABSTRACT;
				case StructurePackage.ASSOCIATION__INHERITED_FEATURE: return StructurePackage.CLASS__INHERITED_FEATURE;
				case StructurePackage.ASSOCIATION__TYPES_FEATURE: return StructurePackage.CLASS__TYPES_FEATURE;
				case StructurePackage.ASSOCIATION__FEATURE: return StructurePackage.CLASS__FEATURE;
				case StructurePackage.ASSOCIATION__INSTANCE_OF: return StructurePackage.CLASS__INSTANCE_OF;
				case StructurePackage.ASSOCIATION__GENERALIZATION: return StructurePackage.CLASS__GENERALIZATION;
				case StructurePackage.ASSOCIATION__NESTED_FEATURE_OF_CLASS: return StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS;
				default: return -1;
			}
		}
		if (baseClass == StructuredClass.class) {
			switch (derivedFeatureID) {
				case StructurePackage.ASSOCIATION__OUTPUT: return StructurePackage.STRUCTURED_CLASS__OUTPUT;
				case StructurePackage.ASSOCIATION__INPUT: return StructurePackage.STRUCTURED_CLASS__INPUT;
				case StructurePackage.ASSOCIATION__REQUIRED_PROPERTY: return StructurePackage.STRUCTURED_CLASS__REQUIRED_PROPERTY;
				case StructurePackage.ASSOCIATION__PROVIDED_PROPERTY: return StructurePackage.STRUCTURED_CLASS__PROVIDED_PROPERTY;
				case StructurePackage.ASSOCIATION__IS_ENCAPSULATED: return StructurePackage.STRUCTURED_CLASS__IS_ENCAPSULATED;
				case StructurePackage.ASSOCIATION__CONJUGATE: return StructurePackage.STRUCTURED_CLASS__CONJUGATE;
				case StructurePackage.ASSOCIATION__OWNED_CONNECTOR: return StructurePackage.STRUCTURED_CLASS__OWNED_CONNECTOR;
				case StructurePackage.ASSOCIATION__OWNED_STRUCTURED_FEATURE: return StructurePackage.STRUCTURED_CLASS__OWNED_STRUCTURED_FEATURE;
				case StructurePackage.ASSOCIATION__TYPES_PROPERTY: return StructurePackage.STRUCTURED_CLASS__TYPES_PROPERTY;
				case StructurePackage.ASSOCIATION__BLIND_PROPERTY: return StructurePackage.STRUCTURED_CLASS__BLIND_PROPERTY;
				case StructurePackage.ASSOCIATION__PORT_PROPERTY: return StructurePackage.STRUCTURED_CLASS__PORT_PROPERTY;
				case StructurePackage.ASSOCIATION__PROXY_PORT: return StructurePackage.STRUCTURED_CLASS__PROXY_PORT;
				case StructurePackage.ASSOCIATION__SELF_PORT: return StructurePackage.STRUCTURED_CLASS__SELF_PORT;
				case StructurePackage.ASSOCIATION__FULL_PORT: return StructurePackage.STRUCTURED_CLASS__FULL_PORT;
				case StructurePackage.ASSOCIATION__INTERACTION_PARTICIPANT: return StructurePackage.STRUCTURED_CLASS__INTERACTION_PARTICIPANT;
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
				case CorePackage.CONTAINER__PACKAGE_VISIBILITY: return StructurePackage.ASSOCIATION__PACKAGE_VISIBILITY;
				case CorePackage.CONTAINER__OWNED_MEMBER: return StructurePackage.ASSOCIATION__OWNED_MEMBER;
				case CorePackage.CONTAINER__MEMBER: return StructurePackage.ASSOCIATION__MEMBER;
				default: return -1;
			}
		}
		if (baseClass == org.omg.sysml.kerml.structure.Class.class) {
			switch (baseFeatureID) {
				case StructurePackage.CLASS__SPECIFIC_CLASSIFIER: return StructurePackage.ASSOCIATION__SPECIFIC_CLASSIFIER;
				case StructurePackage.CLASS__GENERAL_CLASSIFIER: return StructurePackage.ASSOCIATION__GENERAL_CLASSIFIER;
				case StructurePackage.CLASS__OWNED_FEATURE: return StructurePackage.ASSOCIATION__OWNED_FEATURE;
				case StructurePackage.CLASS__IS_ABSTRACT: return StructurePackage.ASSOCIATION__IS_ABSTRACT;
				case StructurePackage.CLASS__INHERITED_FEATURE: return StructurePackage.ASSOCIATION__INHERITED_FEATURE;
				case StructurePackage.CLASS__TYPES_FEATURE: return StructurePackage.ASSOCIATION__TYPES_FEATURE;
				case StructurePackage.CLASS__FEATURE: return StructurePackage.ASSOCIATION__FEATURE;
				case StructurePackage.CLASS__INSTANCE_OF: return StructurePackage.ASSOCIATION__INSTANCE_OF;
				case StructurePackage.CLASS__GENERALIZATION: return StructurePackage.ASSOCIATION__GENERALIZATION;
				case StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS: return StructurePackage.ASSOCIATION__NESTED_FEATURE_OF_CLASS;
				default: return -1;
			}
		}
		if (baseClass == StructuredClass.class) {
			switch (baseFeatureID) {
				case StructurePackage.STRUCTURED_CLASS__OUTPUT: return StructurePackage.ASSOCIATION__OUTPUT;
				case StructurePackage.STRUCTURED_CLASS__INPUT: return StructurePackage.ASSOCIATION__INPUT;
				case StructurePackage.STRUCTURED_CLASS__REQUIRED_PROPERTY: return StructurePackage.ASSOCIATION__REQUIRED_PROPERTY;
				case StructurePackage.STRUCTURED_CLASS__PROVIDED_PROPERTY: return StructurePackage.ASSOCIATION__PROVIDED_PROPERTY;
				case StructurePackage.STRUCTURED_CLASS__IS_ENCAPSULATED: return StructurePackage.ASSOCIATION__IS_ENCAPSULATED;
				case StructurePackage.STRUCTURED_CLASS__CONJUGATE: return StructurePackage.ASSOCIATION__CONJUGATE;
				case StructurePackage.STRUCTURED_CLASS__OWNED_CONNECTOR: return StructurePackage.ASSOCIATION__OWNED_CONNECTOR;
				case StructurePackage.STRUCTURED_CLASS__OWNED_STRUCTURED_FEATURE: return StructurePackage.ASSOCIATION__OWNED_STRUCTURED_FEATURE;
				case StructurePackage.STRUCTURED_CLASS__TYPES_PROPERTY: return StructurePackage.ASSOCIATION__TYPES_PROPERTY;
				case StructurePackage.STRUCTURED_CLASS__BLIND_PROPERTY: return StructurePackage.ASSOCIATION__BLIND_PROPERTY;
				case StructurePackage.STRUCTURED_CLASS__PORT_PROPERTY: return StructurePackage.ASSOCIATION__PORT_PROPERTY;
				case StructurePackage.STRUCTURED_CLASS__PROXY_PORT: return StructurePackage.ASSOCIATION__PROXY_PORT;
				case StructurePackage.STRUCTURED_CLASS__SELF_PORT: return StructurePackage.ASSOCIATION__SELF_PORT;
				case StructurePackage.STRUCTURED_CLASS__FULL_PORT: return StructurePackage.ASSOCIATION__FULL_PORT;
				case StructurePackage.STRUCTURED_CLASS__INTERACTION_PARTICIPANT: return StructurePackage.ASSOCIATION__INTERACTION_PARTICIPANT;
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
		result.append(", isEncapsulated: ");
		result.append(isEncapsulated);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
