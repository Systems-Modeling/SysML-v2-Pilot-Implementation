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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.kerml.core.CorePackage;
import org.omg.sysml.kerml.core.ElementRecord;

import org.omg.sysml.kerml.core.impl.RelationshipImpl;

import org.omg.sysml.kerml.core.visibilityKind;

import org.omg.sysml.kerml.structure.AggregationKind;
import org.omg.sysml.kerml.structure.Association;
import org.omg.sysml.kerml.structure.Connector;
import org.omg.sysml.kerml.structure.Feature;
import org.omg.sysml.kerml.structure.FeaturePathNode;
import org.omg.sysml.kerml.structure.PropertyAccessKind;
import org.omg.sysml.kerml.structure.RefinedAssociation;
import org.omg.sysml.kerml.structure.StructurePackage;
import org.omg.sysml.kerml.structure.StructuredFeature;
import org.omg.sysml.kerml.structure.ValueOption;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getPackageVisibility <em>Package Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getRedefinedFeature <em>Redefined Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getSubsettedFeature <em>Subsetted Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getMethodVisibility <em>Method Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getFeaturePath <em>Feature Path</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getNestingFeature <em>Nesting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getNestedFeature <em>Nested Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getDefiningType <em>Defining Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getRefiningType <em>Refining Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#isIsPort <em>Is Port</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getOutsideAccess <em>Outside Access</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getInsideAccess <em>Inside Access</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getUnion <em>Union</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#isIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getEndOf <em>End Of</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getParticipatesIn <em>Participates In</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#isIsOutput <em>Is Output</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getTargetPath <em>Target Path</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#isIsDirected <em>Is Directed</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getSourceUpper <em>Source Upper</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getSourceLower <em>Source Lower</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getTargetUpper <em>Target Upper</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getTargetLower <em>Target Lower</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getSourceMultiplicity <em>Source Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getTargetMultiplicity <em>Target Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends RelationshipImpl implements Connector {
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
	 * The cached value of the '{@link #getOutsideAccess() <em>Outside Access</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAccessKind> outsideAccess;

	/**
	 * The cached value of the '{@link #getInsideAccess() <em>Inside Access</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAccessKind> insideAccess;

	/**
	 * The cached value of the '{@link #getUnion() <em>Union</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnion()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> union;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected ValueOption option;

	/**
	 * The default value of the '{@link #isIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NAVIGABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected boolean isNavigable = IS_NAVIGABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationKind AGGREGATION_EDEFAULT = AggregationKind.COMPOSITE;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected AggregationKind aggregation = AGGREGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndOf() <em>End Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOf()
	 * @generated
	 * @ordered
	 */
	protected Association endOf;

	/**
	 * The cached value of the '{@link #getParticipatesIn() <em>Participates In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatesIn()
	 * @generated
	 * @ordered
	 */
	protected Association participatesIn;

	/**
	 * The default value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInput()
	 * @generated
	 * @ordered
	 */
	protected boolean isInput = IS_INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOutput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OUTPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOutput()
	 * @generated
	 * @ordered
	 */
	protected boolean isOutput = IS_OUTPUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourcePath() <em>Source Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePath()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> sourcePath;

	/**
	 * The cached value of the '{@link #getTargetPath() <em>Target Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPath()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> targetPath;

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
	 * The default value of the '{@link #getSourceUpper() <em>Source Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int SOURCE_UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSourceUpper() <em>Source Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUpper()
	 * @generated
	 * @ordered
	 */
	protected int sourceUpper = SOURCE_UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLower() <em>Source Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLower()
	 * @generated
	 * @ordered
	 */
	protected static final int SOURCE_LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSourceLower() <em>Source Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLower()
	 * @generated
	 * @ordered
	 */
	protected int sourceLower = SOURCE_LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetUpper() <em>Target Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTargetUpper() <em>Target Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUpper()
	 * @generated
	 * @ordered
	 */
	protected int targetUpper = TARGET_UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetLower() <em>Target Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLower()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTargetLower() <em>Target Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLower()
	 * @generated
	 * @ordered
	 */
	protected int targetLower = TARGET_LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceMultiplicity() <em>Source Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceMultiplicity() <em>Source Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String sourceMultiplicity = SOURCE_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetMultiplicity() <em>Target Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetMultiplicity() <em>Target Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String targetMultiplicity = TARGET_MULTIPLICITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected RefinedAssociation value;

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
		return StructurePackage.Literals.CONNECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__PACKAGE_VISIBILITY, oldPackageVisibility, packageVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementRecord> getOwnedMember() {
		if (ownedMember == null) {
			ownedMember = new EObjectContainmentWithInverseEList<ElementRecord>(ElementRecord.class, this, StructurePackage.CONNECTOR__OWNED_MEMBER, CorePackage.ELEMENT_RECORD__NAMESPACE);
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
			member = new EObjectWithInverseResolvingEList.ManyInverse<ElementRecord>(ElementRecord.class, this, StructurePackage.CONNECTOR__MEMBER, CorePackage.ELEMENT_RECORD__MEMBER_OF_NAMESPACE);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.kerml.structure.Class> getType() {
		if (type == null) {
			type = new EObjectWithInverseResolvingEList.ManyInverse<org.omg.sysml.kerml.structure.Class>(org.omg.sysml.kerml.structure.Class.class, this, StructurePackage.CONNECTOR__TYPE, StructurePackage.CLASS__TYPES_FEATURE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__UPPER, oldUpper, upper));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class getClass_() {
		if (eContainerFeatureID() != StructurePackage.CONNECTOR__CLASS) return null;
		return (org.omg.sysml.kerml.structure.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(org.omg.sysml.kerml.structure.Class newClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClass, StructurePackage.CONNECTOR__CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(org.omg.sysml.kerml.structure.Class newClass) {
		if (newClass != eInternalContainer() || (eContainerFeatureID() != StructurePackage.CONNECTOR__CLASS && newClass != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getRedefinedFeature() {
		if (redefinedFeature == null) {
			redefinedFeature = new EObjectResolvingEList<Feature>(Feature.class, this, StructurePackage.CONNECTOR__REDEFINED_FEATURE);
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
			subsettedFeature = new EObjectResolvingEList<Feature>(Feature.class, this, StructurePackage.CONNECTOR__SUBSETTED_FEATURE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__IS_DERIVED, oldIsDerived, isDerived));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__IS_UNIQUE, oldIsUnique, isUnique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__IS_ORDERED, oldIsOrdered, isOrdered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__METHOD_VISIBILITY, oldMethodVisibility, methodVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class getContext() {
		if (eContainerFeatureID() != StructurePackage.CONNECTOR__CONTEXT) return null;
		return (org.omg.sysml.kerml.structure.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(org.omg.sysml.kerml.structure.Class newContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContext, StructurePackage.CONNECTOR__CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(org.omg.sysml.kerml.structure.Class newContext) {
		if (newContext != eInternalContainer() || (eContainerFeatureID() != StructurePackage.CONNECTOR__CONTEXT && newContext != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeaturePathNode> getFeaturePath() {
		if (featurePath == null) {
			featurePath = new EObjectContainmentEList<FeaturePathNode>(FeaturePathNode.class, this, StructurePackage.CONNECTOR__FEATURE_PATH);
		}
		return featurePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getNestingFeature() {
		if (eContainerFeatureID() != StructurePackage.CONNECTOR__NESTING_FEATURE) return null;
		return (Feature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingFeature(Feature newNestingFeature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNestingFeature, StructurePackage.CONNECTOR__NESTING_FEATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingFeature(Feature newNestingFeature) {
		if (newNestingFeature != eInternalContainer() || (eContainerFeatureID() != StructurePackage.CONNECTOR__NESTING_FEATURE && newNestingFeature != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__NESTING_FEATURE, newNestingFeature, newNestingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getNestedFeature() {
		if (nestedFeature == null) {
			nestedFeature = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, StructurePackage.CONNECTOR__NESTED_FEATURE, StructurePackage.FEATURE__NESTING_FEATURE);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CONNECTOR__DEFINING_TYPE, oldDefiningType, definingType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__DEFINING_TYPE, oldDefiningType, definingType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CONNECTOR__REFINING_TYPE, oldRefiningType, refiningType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__REFINING_TYPE, oldRefiningType, refiningType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.kerml.structure.Class> getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectContainmentEList<org.omg.sysml.kerml.structure.Class>(org.omg.sysml.kerml.structure.Class.class, this, StructurePackage.CONNECTOR__OWNED_TYPE);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CONNECTOR__FEATURING_CLASSIFIER, oldFeaturingClassifier, featuringClassifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__FEATURING_CLASSIFIER, oldFeaturingClassifier, newFeaturingClassifier);
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__FEATURING_CLASSIFIER, newFeaturingClassifier, newFeaturingClassifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__IS_PORT, oldIsPort, isPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyAccessKind> getOutsideAccess() {
		if (outsideAccess == null) {
			outsideAccess = new EDataTypeUniqueEList<PropertyAccessKind>(PropertyAccessKind.class, this, StructurePackage.CONNECTOR__OUTSIDE_ACCESS);
		}
		return outsideAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyAccessKind> getInsideAccess() {
		if (insideAccess == null) {
			insideAccess = new EDataTypeUniqueEList<PropertyAccessKind>(PropertyAccessKind.class, this, StructurePackage.CONNECTOR__INSIDE_ACCESS);
		}
		return insideAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getUnion() {
		if (union == null) {
			union = new EObjectResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.CONNECTOR__UNION);
		}
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueOption getOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOption(ValueOption newOption, NotificationChain msgs) {
		ValueOption oldOption = option;
		option = newOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__OPTION, oldOption, newOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption(ValueOption newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY, ValueOption.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY, ValueOption.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNavigable() {
		return isNavigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNavigable(boolean newIsNavigable) {
		boolean oldIsNavigable = isNavigable;
		isNavigable = newIsNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__IS_NAVIGABLE, oldIsNavigable, isNavigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind getAggregation() {
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(AggregationKind newAggregation) {
		AggregationKind oldAggregation = aggregation;
		aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__AGGREGATION, oldAggregation, aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getEndOf() {
		if (endOf != null && endOf.eIsProxy()) {
			InternalEObject oldEndOf = (InternalEObject)endOf;
			endOf = (Association)eResolveProxy(oldEndOf);
			if (endOf != oldEndOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CONNECTOR__END_OF, oldEndOf, endOf));
			}
		}
		return endOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetEndOf() {
		return endOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndOf(Association newEndOf, NotificationChain msgs) {
		Association oldEndOf = endOf;
		endOf = newEndOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__END_OF, oldEndOf, newEndOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOf(Association newEndOf) {
		if (newEndOf != endOf) {
			NotificationChain msgs = null;
			if (endOf != null)
				msgs = ((InternalEObject)endOf).eInverseRemove(this, StructurePackage.ASSOCIATION__END_PROPERTY, Association.class, msgs);
			if (newEndOf != null)
				msgs = ((InternalEObject)newEndOf).eInverseAdd(this, StructurePackage.ASSOCIATION__END_PROPERTY, Association.class, msgs);
			msgs = basicSetEndOf(newEndOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__END_OF, newEndOf, newEndOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getParticipatesIn() {
		if (participatesIn != null && participatesIn.eIsProxy()) {
			InternalEObject oldParticipatesIn = (InternalEObject)participatesIn;
			participatesIn = (Association)eResolveProxy(oldParticipatesIn);
			if (participatesIn != oldParticipatesIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CONNECTOR__PARTICIPATES_IN, oldParticipatesIn, participatesIn));
			}
		}
		return participatesIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetParticipatesIn() {
		return participatesIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipatesIn(Association newParticipatesIn, NotificationChain msgs) {
		Association oldParticipatesIn = participatesIn;
		participatesIn = newParticipatesIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__PARTICIPATES_IN, oldParticipatesIn, newParticipatesIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipatesIn(Association newParticipatesIn) {
		if (newParticipatesIn != participatesIn) {
			NotificationChain msgs = null;
			if (participatesIn != null)
				msgs = ((InternalEObject)participatesIn).eInverseRemove(this, StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY, Association.class, msgs);
			if (newParticipatesIn != null)
				msgs = ((InternalEObject)newParticipatesIn).eInverseAdd(this, StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY, Association.class, msgs);
			msgs = basicSetParticipatesIn(newParticipatesIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__PARTICIPATES_IN, newParticipatesIn, newParticipatesIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInput() {
		return isInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInput(boolean newIsInput) {
		boolean oldIsInput = isInput;
		isInput = newIsInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__IS_INPUT, oldIsInput, isInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOutput() {
		return isOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOutput(boolean newIsOutput) {
		boolean oldIsOutput = isOutput;
		isOutput = newIsOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__IS_OUTPUT, oldIsOutput, isOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getSourcePath() {
		if (sourcePath == null) {
			sourcePath = new EObjectResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.CONNECTOR__SOURCE_PATH);
		}
		return sourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getTargetPath() {
		if (targetPath == null) {
			targetPath = new EObjectResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.CONNECTOR__TARGET_PATH);
		}
		return targetPath;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__IS_DIRECTED, oldIsDirected, isDirected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSourceUpper() {
		return sourceUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceUpper(int newSourceUpper) {
		int oldSourceUpper = sourceUpper;
		sourceUpper = newSourceUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__SOURCE_UPPER, oldSourceUpper, sourceUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSourceLower() {
		return sourceLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLower(int newSourceLower) {
		int oldSourceLower = sourceLower;
		sourceLower = newSourceLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__SOURCE_LOWER, oldSourceLower, sourceLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTargetUpper() {
		return targetUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUpper(int newTargetUpper) {
		int oldTargetUpper = targetUpper;
		targetUpper = newTargetUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__TARGET_UPPER, oldTargetUpper, targetUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTargetLower() {
		return targetLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLower(int newTargetLower) {
		int oldTargetLower = targetLower;
		targetLower = newTargetLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__TARGET_LOWER, oldTargetLower, targetLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceMultiplicity() {
		return sourceMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMultiplicity(String newSourceMultiplicity) {
		String oldSourceMultiplicity = sourceMultiplicity;
		sourceMultiplicity = newSourceMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__SOURCE_MULTIPLICITY, oldSourceMultiplicity, sourceMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetMultiplicity() {
		return targetMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMultiplicity(String newTargetMultiplicity) {
		String oldTargetMultiplicity = targetMultiplicity;
		targetMultiplicity = newTargetMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__TARGET_MULTIPLICITY, oldTargetMultiplicity, targetMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedAssociation getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (RefinedAssociation)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.CONNECTOR__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedAssociation basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(RefinedAssociation newValue, NotificationChain msgs) {
		RefinedAssociation oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(RefinedAssociation newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, StructurePackage.REFINED_ASSOCIATION__DEFINING_CONNECTOR, RefinedAssociation.class, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, StructurePackage.REFINED_ASSOCIATION__DEFINING_CONNECTOR, RefinedAssociation.class, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONNECTOR__VALUE, newValue, newValue));
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
			case StructurePackage.CONNECTOR__OWNED_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMember()).basicAdd(otherEnd, msgs);
			case StructurePackage.CONNECTOR__MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMember()).basicAdd(otherEnd, msgs);
			case StructurePackage.CONNECTOR__TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getType()).basicAdd(otherEnd, msgs);
			case StructurePackage.CONNECTOR__CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClass((org.omg.sysml.kerml.structure.Class)otherEnd, msgs);
			case StructurePackage.CONNECTOR__CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContext((org.omg.sysml.kerml.structure.Class)otherEnd, msgs);
			case StructurePackage.CONNECTOR__NESTING_FEATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNestingFeature((Feature)otherEnd, msgs);
			case StructurePackage.CONNECTOR__NESTED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedFeature()).basicAdd(otherEnd, msgs);
			case StructurePackage.CONNECTOR__FEATURING_CLASSIFIER:
				if (featuringClassifier != null)
					msgs = ((InternalEObject)featuringClassifier).eInverseRemove(this, StructurePackage.CLASS__FEATURE, org.omg.sysml.kerml.structure.Class.class, msgs);
				return basicSetFeaturingClassifier((org.omg.sysml.kerml.structure.Class)otherEnd, msgs);
			case StructurePackage.CONNECTOR__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.CONNECTOR__OPTION, null, msgs);
				return basicSetOption((ValueOption)otherEnd, msgs);
			case StructurePackage.CONNECTOR__END_OF:
				if (endOf != null)
					msgs = ((InternalEObject)endOf).eInverseRemove(this, StructurePackage.ASSOCIATION__END_PROPERTY, Association.class, msgs);
				return basicSetEndOf((Association)otherEnd, msgs);
			case StructurePackage.CONNECTOR__PARTICIPATES_IN:
				if (participatesIn != null)
					msgs = ((InternalEObject)participatesIn).eInverseRemove(this, StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY, Association.class, msgs);
				return basicSetParticipatesIn((Association)otherEnd, msgs);
			case StructurePackage.CONNECTOR__VALUE:
				if (value != null)
					msgs = ((InternalEObject)value).eInverseRemove(this, StructurePackage.REFINED_ASSOCIATION__DEFINING_CONNECTOR, RefinedAssociation.class, msgs);
				return basicSetValue((RefinedAssociation)otherEnd, msgs);
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
			case StructurePackage.CONNECTOR__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case StructurePackage.CONNECTOR__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case StructurePackage.CONNECTOR__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case StructurePackage.CONNECTOR__CLASS:
				return basicSetClass(null, msgs);
			case StructurePackage.CONNECTOR__CONTEXT:
				return basicSetContext(null, msgs);
			case StructurePackage.CONNECTOR__FEATURE_PATH:
				return ((InternalEList<?>)getFeaturePath()).basicRemove(otherEnd, msgs);
			case StructurePackage.CONNECTOR__NESTING_FEATURE:
				return basicSetNestingFeature(null, msgs);
			case StructurePackage.CONNECTOR__NESTED_FEATURE:
				return ((InternalEList<?>)getNestedFeature()).basicRemove(otherEnd, msgs);
			case StructurePackage.CONNECTOR__OWNED_TYPE:
				return ((InternalEList<?>)getOwnedType()).basicRemove(otherEnd, msgs);
			case StructurePackage.CONNECTOR__FEATURING_CLASSIFIER:
				return basicSetFeaturingClassifier(null, msgs);
			case StructurePackage.CONNECTOR__OPTION:
				return basicSetOption(null, msgs);
			case StructurePackage.CONNECTOR__END_OF:
				return basicSetEndOf(null, msgs);
			case StructurePackage.CONNECTOR__PARTICIPATES_IN:
				return basicSetParticipatesIn(null, msgs);
			case StructurePackage.CONNECTOR__VALUE:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StructurePackage.CONNECTOR__CLASS:
				return eInternalContainer().eInverseRemove(this, StructurePackage.CLASS__OWNED_FEATURE, org.omg.sysml.kerml.structure.Class.class, msgs);
			case StructurePackage.CONNECTOR__CONTEXT:
				return eInternalContainer().eInverseRemove(this, StructurePackage.CLASS__NESTED_FEATURE_OF_CLASS, org.omg.sysml.kerml.structure.Class.class, msgs);
			case StructurePackage.CONNECTOR__NESTING_FEATURE:
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
			case StructurePackage.CONNECTOR__PACKAGE_VISIBILITY:
				return getPackageVisibility();
			case StructurePackage.CONNECTOR__OWNED_MEMBER:
				return getOwnedMember();
			case StructurePackage.CONNECTOR__MEMBER:
				return getMember();
			case StructurePackage.CONNECTOR__TYPE:
				return getType();
			case StructurePackage.CONNECTOR__UPPER:
				return getUpper();
			case StructurePackage.CONNECTOR__LOWER:
				return getLower();
			case StructurePackage.CONNECTOR__CLASS:
				return getClass_();
			case StructurePackage.CONNECTOR__REDEFINED_FEATURE:
				return getRedefinedFeature();
			case StructurePackage.CONNECTOR__SUBSETTED_FEATURE:
				return getSubsettedFeature();
			case StructurePackage.CONNECTOR__IS_DERIVED:
				return isIsDerived();
			case StructurePackage.CONNECTOR__IS_UNIQUE:
				return isIsUnique();
			case StructurePackage.CONNECTOR__IS_READ_ONLY:
				return isIsReadOnly();
			case StructurePackage.CONNECTOR__IS_ORDERED:
				return isIsOrdered();
			case StructurePackage.CONNECTOR__METHOD_VISIBILITY:
				return getMethodVisibility();
			case StructurePackage.CONNECTOR__CONTEXT:
				return getContext();
			case StructurePackage.CONNECTOR__FEATURE_PATH:
				return getFeaturePath();
			case StructurePackage.CONNECTOR__NESTING_FEATURE:
				return getNestingFeature();
			case StructurePackage.CONNECTOR__NESTED_FEATURE:
				return getNestedFeature();
			case StructurePackage.CONNECTOR__DEFINING_TYPE:
				if (resolve) return getDefiningType();
				return basicGetDefiningType();
			case StructurePackage.CONNECTOR__REFINING_TYPE:
				if (resolve) return getRefiningType();
				return basicGetRefiningType();
			case StructurePackage.CONNECTOR__OWNED_TYPE:
				return getOwnedType();
			case StructurePackage.CONNECTOR__FEATURING_CLASSIFIER:
				if (resolve) return getFeaturingClassifier();
				return basicGetFeaturingClassifier();
			case StructurePackage.CONNECTOR__IS_PORT:
				return isIsPort();
			case StructurePackage.CONNECTOR__OUTSIDE_ACCESS:
				return getOutsideAccess();
			case StructurePackage.CONNECTOR__INSIDE_ACCESS:
				return getInsideAccess();
			case StructurePackage.CONNECTOR__UNION:
				return getUnion();
			case StructurePackage.CONNECTOR__OPTION:
				return getOption();
			case StructurePackage.CONNECTOR__IS_NAVIGABLE:
				return isIsNavigable();
			case StructurePackage.CONNECTOR__AGGREGATION:
				return getAggregation();
			case StructurePackage.CONNECTOR__END_OF:
				if (resolve) return getEndOf();
				return basicGetEndOf();
			case StructurePackage.CONNECTOR__PARTICIPATES_IN:
				if (resolve) return getParticipatesIn();
				return basicGetParticipatesIn();
			case StructurePackage.CONNECTOR__IS_INPUT:
				return isIsInput();
			case StructurePackage.CONNECTOR__IS_OUTPUT:
				return isIsOutput();
			case StructurePackage.CONNECTOR__SOURCE_PATH:
				return getSourcePath();
			case StructurePackage.CONNECTOR__TARGET_PATH:
				return getTargetPath();
			case StructurePackage.CONNECTOR__IS_DIRECTED:
				return isIsDirected();
			case StructurePackage.CONNECTOR__SOURCE_UPPER:
				return getSourceUpper();
			case StructurePackage.CONNECTOR__SOURCE_LOWER:
				return getSourceLower();
			case StructurePackage.CONNECTOR__TARGET_UPPER:
				return getTargetUpper();
			case StructurePackage.CONNECTOR__TARGET_LOWER:
				return getTargetLower();
			case StructurePackage.CONNECTOR__SOURCE_MULTIPLICITY:
				return getSourceMultiplicity();
			case StructurePackage.CONNECTOR__TARGET_MULTIPLICITY:
				return getTargetMultiplicity();
			case StructurePackage.CONNECTOR__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
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
			case StructurePackage.CONNECTOR__PACKAGE_VISIBILITY:
				setPackageVisibility((visibilityKind)newValue);
				return;
			case StructurePackage.CONNECTOR__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends ElementRecord>)newValue);
				return;
			case StructurePackage.CONNECTOR__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends ElementRecord>)newValue);
				return;
			case StructurePackage.CONNECTOR__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends org.omg.sysml.kerml.structure.Class>)newValue);
				return;
			case StructurePackage.CONNECTOR__UPPER:
				setUpper((Integer)newValue);
				return;
			case StructurePackage.CONNECTOR__LOWER:
				setLower((Integer)newValue);
				return;
			case StructurePackage.CONNECTOR__CLASS:
				setClass((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.CONNECTOR__REDEFINED_FEATURE:
				getRedefinedFeature().clear();
				getRedefinedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.CONNECTOR__SUBSETTED_FEATURE:
				getSubsettedFeature().clear();
				getSubsettedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.CONNECTOR__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case StructurePackage.CONNECTOR__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case StructurePackage.CONNECTOR__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case StructurePackage.CONNECTOR__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case StructurePackage.CONNECTOR__METHOD_VISIBILITY:
				setMethodVisibility((visibilityKind)newValue);
				return;
			case StructurePackage.CONNECTOR__CONTEXT:
				setContext((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.CONNECTOR__FEATURE_PATH:
				getFeaturePath().clear();
				getFeaturePath().addAll((Collection<? extends FeaturePathNode>)newValue);
				return;
			case StructurePackage.CONNECTOR__NESTING_FEATURE:
				setNestingFeature((Feature)newValue);
				return;
			case StructurePackage.CONNECTOR__NESTED_FEATURE:
				getNestedFeature().clear();
				getNestedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case StructurePackage.CONNECTOR__DEFINING_TYPE:
				setDefiningType((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.CONNECTOR__REFINING_TYPE:
				setRefiningType((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.CONNECTOR__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends org.omg.sysml.kerml.structure.Class>)newValue);
				return;
			case StructurePackage.CONNECTOR__FEATURING_CLASSIFIER:
				setFeaturingClassifier((org.omg.sysml.kerml.structure.Class)newValue);
				return;
			case StructurePackage.CONNECTOR__IS_PORT:
				setIsPort((Boolean)newValue);
				return;
			case StructurePackage.CONNECTOR__OUTSIDE_ACCESS:
				getOutsideAccess().clear();
				getOutsideAccess().addAll((Collection<? extends PropertyAccessKind>)newValue);
				return;
			case StructurePackage.CONNECTOR__INSIDE_ACCESS:
				getInsideAccess().clear();
				getInsideAccess().addAll((Collection<? extends PropertyAccessKind>)newValue);
				return;
			case StructurePackage.CONNECTOR__UNION:
				getUnion().clear();
				getUnion().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.CONNECTOR__OPTION:
				setOption((ValueOption)newValue);
				return;
			case StructurePackage.CONNECTOR__IS_NAVIGABLE:
				setIsNavigable((Boolean)newValue);
				return;
			case StructurePackage.CONNECTOR__AGGREGATION:
				setAggregation((AggregationKind)newValue);
				return;
			case StructurePackage.CONNECTOR__END_OF:
				setEndOf((Association)newValue);
				return;
			case StructurePackage.CONNECTOR__PARTICIPATES_IN:
				setParticipatesIn((Association)newValue);
				return;
			case StructurePackage.CONNECTOR__IS_INPUT:
				setIsInput((Boolean)newValue);
				return;
			case StructurePackage.CONNECTOR__IS_OUTPUT:
				setIsOutput((Boolean)newValue);
				return;
			case StructurePackage.CONNECTOR__SOURCE_PATH:
				getSourcePath().clear();
				getSourcePath().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.CONNECTOR__TARGET_PATH:
				getTargetPath().clear();
				getTargetPath().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.CONNECTOR__IS_DIRECTED:
				setIsDirected((Boolean)newValue);
				return;
			case StructurePackage.CONNECTOR__SOURCE_UPPER:
				setSourceUpper((Integer)newValue);
				return;
			case StructurePackage.CONNECTOR__SOURCE_LOWER:
				setSourceLower((Integer)newValue);
				return;
			case StructurePackage.CONNECTOR__TARGET_UPPER:
				setTargetUpper((Integer)newValue);
				return;
			case StructurePackage.CONNECTOR__TARGET_LOWER:
				setTargetLower((Integer)newValue);
				return;
			case StructurePackage.CONNECTOR__SOURCE_MULTIPLICITY:
				setSourceMultiplicity((String)newValue);
				return;
			case StructurePackage.CONNECTOR__TARGET_MULTIPLICITY:
				setTargetMultiplicity((String)newValue);
				return;
			case StructurePackage.CONNECTOR__VALUE:
				setValue((RefinedAssociation)newValue);
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
			case StructurePackage.CONNECTOR__PACKAGE_VISIBILITY:
				setPackageVisibility(PACKAGE_VISIBILITY_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case StructurePackage.CONNECTOR__MEMBER:
				getMember().clear();
				return;
			case StructurePackage.CONNECTOR__TYPE:
				getType().clear();
				return;
			case StructurePackage.CONNECTOR__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__CLASS:
				setClass((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.CONNECTOR__REDEFINED_FEATURE:
				getRedefinedFeature().clear();
				return;
			case StructurePackage.CONNECTOR__SUBSETTED_FEATURE:
				getSubsettedFeature().clear();
				return;
			case StructurePackage.CONNECTOR__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__METHOD_VISIBILITY:
				setMethodVisibility(METHOD_VISIBILITY_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__CONTEXT:
				setContext((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.CONNECTOR__FEATURE_PATH:
				getFeaturePath().clear();
				return;
			case StructurePackage.CONNECTOR__NESTING_FEATURE:
				setNestingFeature((Feature)null);
				return;
			case StructurePackage.CONNECTOR__NESTED_FEATURE:
				getNestedFeature().clear();
				return;
			case StructurePackage.CONNECTOR__DEFINING_TYPE:
				setDefiningType((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.CONNECTOR__REFINING_TYPE:
				setRefiningType((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.CONNECTOR__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case StructurePackage.CONNECTOR__FEATURING_CLASSIFIER:
				setFeaturingClassifier((org.omg.sysml.kerml.structure.Class)null);
				return;
			case StructurePackage.CONNECTOR__IS_PORT:
				setIsPort(IS_PORT_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__OUTSIDE_ACCESS:
				getOutsideAccess().clear();
				return;
			case StructurePackage.CONNECTOR__INSIDE_ACCESS:
				getInsideAccess().clear();
				return;
			case StructurePackage.CONNECTOR__UNION:
				getUnion().clear();
				return;
			case StructurePackage.CONNECTOR__OPTION:
				setOption((ValueOption)null);
				return;
			case StructurePackage.CONNECTOR__IS_NAVIGABLE:
				setIsNavigable(IS_NAVIGABLE_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__END_OF:
				setEndOf((Association)null);
				return;
			case StructurePackage.CONNECTOR__PARTICIPATES_IN:
				setParticipatesIn((Association)null);
				return;
			case StructurePackage.CONNECTOR__IS_INPUT:
				setIsInput(IS_INPUT_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__IS_OUTPUT:
				setIsOutput(IS_OUTPUT_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__SOURCE_PATH:
				getSourcePath().clear();
				return;
			case StructurePackage.CONNECTOR__TARGET_PATH:
				getTargetPath().clear();
				return;
			case StructurePackage.CONNECTOR__IS_DIRECTED:
				setIsDirected(IS_DIRECTED_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__SOURCE_UPPER:
				setSourceUpper(SOURCE_UPPER_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__SOURCE_LOWER:
				setSourceLower(SOURCE_LOWER_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__TARGET_UPPER:
				setTargetUpper(TARGET_UPPER_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__TARGET_LOWER:
				setTargetLower(TARGET_LOWER_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__SOURCE_MULTIPLICITY:
				setSourceMultiplicity(SOURCE_MULTIPLICITY_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__TARGET_MULTIPLICITY:
				setTargetMultiplicity(TARGET_MULTIPLICITY_EDEFAULT);
				return;
			case StructurePackage.CONNECTOR__VALUE:
				setValue((RefinedAssociation)null);
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
			case StructurePackage.CONNECTOR__PACKAGE_VISIBILITY:
				return packageVisibility != PACKAGE_VISIBILITY_EDEFAULT;
			case StructurePackage.CONNECTOR__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case StructurePackage.CONNECTOR__MEMBER:
				return member != null && !member.isEmpty();
			case StructurePackage.CONNECTOR__TYPE:
				return type != null && !type.isEmpty();
			case StructurePackage.CONNECTOR__UPPER:
				return upper != UPPER_EDEFAULT;
			case StructurePackage.CONNECTOR__LOWER:
				return lower != LOWER_EDEFAULT;
			case StructurePackage.CONNECTOR__CLASS:
				return getClass_() != null;
			case StructurePackage.CONNECTOR__REDEFINED_FEATURE:
				return redefinedFeature != null && !redefinedFeature.isEmpty();
			case StructurePackage.CONNECTOR__SUBSETTED_FEATURE:
				return subsettedFeature != null && !subsettedFeature.isEmpty();
			case StructurePackage.CONNECTOR__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case StructurePackage.CONNECTOR__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case StructurePackage.CONNECTOR__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case StructurePackage.CONNECTOR__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case StructurePackage.CONNECTOR__METHOD_VISIBILITY:
				return methodVisibility != METHOD_VISIBILITY_EDEFAULT;
			case StructurePackage.CONNECTOR__CONTEXT:
				return getContext() != null;
			case StructurePackage.CONNECTOR__FEATURE_PATH:
				return featurePath != null && !featurePath.isEmpty();
			case StructurePackage.CONNECTOR__NESTING_FEATURE:
				return getNestingFeature() != null;
			case StructurePackage.CONNECTOR__NESTED_FEATURE:
				return nestedFeature != null && !nestedFeature.isEmpty();
			case StructurePackage.CONNECTOR__DEFINING_TYPE:
				return definingType != null;
			case StructurePackage.CONNECTOR__REFINING_TYPE:
				return refiningType != null;
			case StructurePackage.CONNECTOR__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case StructurePackage.CONNECTOR__FEATURING_CLASSIFIER:
				return featuringClassifier != null;
			case StructurePackage.CONNECTOR__IS_PORT:
				return isPort != IS_PORT_EDEFAULT;
			case StructurePackage.CONNECTOR__OUTSIDE_ACCESS:
				return outsideAccess != null && !outsideAccess.isEmpty();
			case StructurePackage.CONNECTOR__INSIDE_ACCESS:
				return insideAccess != null && !insideAccess.isEmpty();
			case StructurePackage.CONNECTOR__UNION:
				return union != null && !union.isEmpty();
			case StructurePackage.CONNECTOR__OPTION:
				return option != null;
			case StructurePackage.CONNECTOR__IS_NAVIGABLE:
				return isNavigable != IS_NAVIGABLE_EDEFAULT;
			case StructurePackage.CONNECTOR__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case StructurePackage.CONNECTOR__END_OF:
				return endOf != null;
			case StructurePackage.CONNECTOR__PARTICIPATES_IN:
				return participatesIn != null;
			case StructurePackage.CONNECTOR__IS_INPUT:
				return isInput != IS_INPUT_EDEFAULT;
			case StructurePackage.CONNECTOR__IS_OUTPUT:
				return isOutput != IS_OUTPUT_EDEFAULT;
			case StructurePackage.CONNECTOR__SOURCE_PATH:
				return sourcePath != null && !sourcePath.isEmpty();
			case StructurePackage.CONNECTOR__TARGET_PATH:
				return targetPath != null && !targetPath.isEmpty();
			case StructurePackage.CONNECTOR__IS_DIRECTED:
				return isDirected != IS_DIRECTED_EDEFAULT;
			case StructurePackage.CONNECTOR__SOURCE_UPPER:
				return sourceUpper != SOURCE_UPPER_EDEFAULT;
			case StructurePackage.CONNECTOR__SOURCE_LOWER:
				return sourceLower != SOURCE_LOWER_EDEFAULT;
			case StructurePackage.CONNECTOR__TARGET_UPPER:
				return targetUpper != TARGET_UPPER_EDEFAULT;
			case StructurePackage.CONNECTOR__TARGET_LOWER:
				return targetLower != TARGET_LOWER_EDEFAULT;
			case StructurePackage.CONNECTOR__SOURCE_MULTIPLICITY:
				return SOURCE_MULTIPLICITY_EDEFAULT == null ? sourceMultiplicity != null : !SOURCE_MULTIPLICITY_EDEFAULT.equals(sourceMultiplicity);
			case StructurePackage.CONNECTOR__TARGET_MULTIPLICITY:
				return TARGET_MULTIPLICITY_EDEFAULT == null ? targetMultiplicity != null : !TARGET_MULTIPLICITY_EDEFAULT.equals(targetMultiplicity);
			case StructurePackage.CONNECTOR__VALUE:
				return value != null;
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
				case StructurePackage.CONNECTOR__PACKAGE_VISIBILITY: return CorePackage.CONTAINER__PACKAGE_VISIBILITY;
				case StructurePackage.CONNECTOR__OWNED_MEMBER: return CorePackage.CONTAINER__OWNED_MEMBER;
				case StructurePackage.CONNECTOR__MEMBER: return CorePackage.CONTAINER__MEMBER;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case StructurePackage.CONNECTOR__TYPE: return StructurePackage.FEATURE__TYPE;
				case StructurePackage.CONNECTOR__UPPER: return StructurePackage.FEATURE__UPPER;
				case StructurePackage.CONNECTOR__LOWER: return StructurePackage.FEATURE__LOWER;
				case StructurePackage.CONNECTOR__CLASS: return StructurePackage.FEATURE__CLASS;
				case StructurePackage.CONNECTOR__REDEFINED_FEATURE: return StructurePackage.FEATURE__REDEFINED_FEATURE;
				case StructurePackage.CONNECTOR__SUBSETTED_FEATURE: return StructurePackage.FEATURE__SUBSETTED_FEATURE;
				case StructurePackage.CONNECTOR__IS_DERIVED: return StructurePackage.FEATURE__IS_DERIVED;
				case StructurePackage.CONNECTOR__IS_UNIQUE: return StructurePackage.FEATURE__IS_UNIQUE;
				case StructurePackage.CONNECTOR__IS_READ_ONLY: return StructurePackage.FEATURE__IS_READ_ONLY;
				case StructurePackage.CONNECTOR__IS_ORDERED: return StructurePackage.FEATURE__IS_ORDERED;
				case StructurePackage.CONNECTOR__METHOD_VISIBILITY: return StructurePackage.FEATURE__METHOD_VISIBILITY;
				case StructurePackage.CONNECTOR__CONTEXT: return StructurePackage.FEATURE__CONTEXT;
				case StructurePackage.CONNECTOR__FEATURE_PATH: return StructurePackage.FEATURE__FEATURE_PATH;
				case StructurePackage.CONNECTOR__NESTING_FEATURE: return StructurePackage.FEATURE__NESTING_FEATURE;
				case StructurePackage.CONNECTOR__NESTED_FEATURE: return StructurePackage.FEATURE__NESTED_FEATURE;
				case StructurePackage.CONNECTOR__DEFINING_TYPE: return StructurePackage.FEATURE__DEFINING_TYPE;
				case StructurePackage.CONNECTOR__REFINING_TYPE: return StructurePackage.FEATURE__REFINING_TYPE;
				case StructurePackage.CONNECTOR__OWNED_TYPE: return StructurePackage.FEATURE__OWNED_TYPE;
				case StructurePackage.CONNECTOR__FEATURING_CLASSIFIER: return StructurePackage.FEATURE__FEATURING_CLASSIFIER;
				default: return -1;
			}
		}
		if (baseClass == StructuredFeature.class) {
			switch (derivedFeatureID) {
				case StructurePackage.CONNECTOR__IS_PORT: return StructurePackage.STRUCTURED_FEATURE__IS_PORT;
				case StructurePackage.CONNECTOR__OUTSIDE_ACCESS: return StructurePackage.STRUCTURED_FEATURE__OUTSIDE_ACCESS;
				case StructurePackage.CONNECTOR__INSIDE_ACCESS: return StructurePackage.STRUCTURED_FEATURE__INSIDE_ACCESS;
				case StructurePackage.CONNECTOR__UNION: return StructurePackage.STRUCTURED_FEATURE__UNION;
				case StructurePackage.CONNECTOR__OPTION: return StructurePackage.STRUCTURED_FEATURE__OPTION;
				case StructurePackage.CONNECTOR__IS_NAVIGABLE: return StructurePackage.STRUCTURED_FEATURE__IS_NAVIGABLE;
				case StructurePackage.CONNECTOR__AGGREGATION: return StructurePackage.STRUCTURED_FEATURE__AGGREGATION;
				case StructurePackage.CONNECTOR__END_OF: return StructurePackage.STRUCTURED_FEATURE__END_OF;
				case StructurePackage.CONNECTOR__PARTICIPATES_IN: return StructurePackage.STRUCTURED_FEATURE__PARTICIPATES_IN;
				case StructurePackage.CONNECTOR__IS_INPUT: return StructurePackage.STRUCTURED_FEATURE__IS_INPUT;
				case StructurePackage.CONNECTOR__IS_OUTPUT: return StructurePackage.STRUCTURED_FEATURE__IS_OUTPUT;
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
				case CorePackage.CONTAINER__PACKAGE_VISIBILITY: return StructurePackage.CONNECTOR__PACKAGE_VISIBILITY;
				case CorePackage.CONTAINER__OWNED_MEMBER: return StructurePackage.CONNECTOR__OWNED_MEMBER;
				case CorePackage.CONTAINER__MEMBER: return StructurePackage.CONNECTOR__MEMBER;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case StructurePackage.FEATURE__TYPE: return StructurePackage.CONNECTOR__TYPE;
				case StructurePackage.FEATURE__UPPER: return StructurePackage.CONNECTOR__UPPER;
				case StructurePackage.FEATURE__LOWER: return StructurePackage.CONNECTOR__LOWER;
				case StructurePackage.FEATURE__CLASS: return StructurePackage.CONNECTOR__CLASS;
				case StructurePackage.FEATURE__REDEFINED_FEATURE: return StructurePackage.CONNECTOR__REDEFINED_FEATURE;
				case StructurePackage.FEATURE__SUBSETTED_FEATURE: return StructurePackage.CONNECTOR__SUBSETTED_FEATURE;
				case StructurePackage.FEATURE__IS_DERIVED: return StructurePackage.CONNECTOR__IS_DERIVED;
				case StructurePackage.FEATURE__IS_UNIQUE: return StructurePackage.CONNECTOR__IS_UNIQUE;
				case StructurePackage.FEATURE__IS_READ_ONLY: return StructurePackage.CONNECTOR__IS_READ_ONLY;
				case StructurePackage.FEATURE__IS_ORDERED: return StructurePackage.CONNECTOR__IS_ORDERED;
				case StructurePackage.FEATURE__METHOD_VISIBILITY: return StructurePackage.CONNECTOR__METHOD_VISIBILITY;
				case StructurePackage.FEATURE__CONTEXT: return StructurePackage.CONNECTOR__CONTEXT;
				case StructurePackage.FEATURE__FEATURE_PATH: return StructurePackage.CONNECTOR__FEATURE_PATH;
				case StructurePackage.FEATURE__NESTING_FEATURE: return StructurePackage.CONNECTOR__NESTING_FEATURE;
				case StructurePackage.FEATURE__NESTED_FEATURE: return StructurePackage.CONNECTOR__NESTED_FEATURE;
				case StructurePackage.FEATURE__DEFINING_TYPE: return StructurePackage.CONNECTOR__DEFINING_TYPE;
				case StructurePackage.FEATURE__REFINING_TYPE: return StructurePackage.CONNECTOR__REFINING_TYPE;
				case StructurePackage.FEATURE__OWNED_TYPE: return StructurePackage.CONNECTOR__OWNED_TYPE;
				case StructurePackage.FEATURE__FEATURING_CLASSIFIER: return StructurePackage.CONNECTOR__FEATURING_CLASSIFIER;
				default: return -1;
			}
		}
		if (baseClass == StructuredFeature.class) {
			switch (baseFeatureID) {
				case StructurePackage.STRUCTURED_FEATURE__IS_PORT: return StructurePackage.CONNECTOR__IS_PORT;
				case StructurePackage.STRUCTURED_FEATURE__OUTSIDE_ACCESS: return StructurePackage.CONNECTOR__OUTSIDE_ACCESS;
				case StructurePackage.STRUCTURED_FEATURE__INSIDE_ACCESS: return StructurePackage.CONNECTOR__INSIDE_ACCESS;
				case StructurePackage.STRUCTURED_FEATURE__UNION: return StructurePackage.CONNECTOR__UNION;
				case StructurePackage.STRUCTURED_FEATURE__OPTION: return StructurePackage.CONNECTOR__OPTION;
				case StructurePackage.STRUCTURED_FEATURE__IS_NAVIGABLE: return StructurePackage.CONNECTOR__IS_NAVIGABLE;
				case StructurePackage.STRUCTURED_FEATURE__AGGREGATION: return StructurePackage.CONNECTOR__AGGREGATION;
				case StructurePackage.STRUCTURED_FEATURE__END_OF: return StructurePackage.CONNECTOR__END_OF;
				case StructurePackage.STRUCTURED_FEATURE__PARTICIPATES_IN: return StructurePackage.CONNECTOR__PARTICIPATES_IN;
				case StructurePackage.STRUCTURED_FEATURE__IS_INPUT: return StructurePackage.CONNECTOR__IS_INPUT;
				case StructurePackage.STRUCTURED_FEATURE__IS_OUTPUT: return StructurePackage.CONNECTOR__IS_OUTPUT;
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
		result.append(", upper: ");
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
		result.append(", isPort: ");
		result.append(isPort);
		result.append(", outsideAccess: ");
		result.append(outsideAccess);
		result.append(", insideAccess: ");
		result.append(insideAccess);
		result.append(", isNavigable: ");
		result.append(isNavigable);
		result.append(", aggregation: ");
		result.append(aggregation);
		result.append(", isInput: ");
		result.append(isInput);
		result.append(", isOutput: ");
		result.append(isOutput);
		result.append(", isDirected: ");
		result.append(isDirected);
		result.append(", sourceUpper: ");
		result.append(sourceUpper);
		result.append(", sourceLower: ");
		result.append(sourceLower);
		result.append(", targetUpper: ");
		result.append(targetUpper);
		result.append(", targetLower: ");
		result.append(targetLower);
		result.append(", sourceMultiplicity: ");
		result.append(sourceMultiplicity);
		result.append(", targetMultiplicity: ");
		result.append(targetMultiplicity);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
