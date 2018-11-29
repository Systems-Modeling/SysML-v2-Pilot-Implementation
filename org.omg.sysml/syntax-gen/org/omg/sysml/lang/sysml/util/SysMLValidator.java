/**
 */
package org.omg.sysml.lang.sysml.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConnectorEnd;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ElementReferenceExpression;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureAccessExpression;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.InstanceCreationExpression;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralNull;
import org.omg.sysml.lang.sysml.LiteralReal;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.LiteralUnbounded;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.OfSuccession;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.OrderedFeature;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SequenceAccessExpression;
import org.omg.sysml.lang.sysml.SequenceConstructionExpression;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.StructuredFeature;
import org.omg.sysml.lang.sysml.Subset;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SuccessionItemFlow;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.omg.sysml.lang.sysml.SysMLPackage
 * @generated
 */
public class SysMLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SysMLValidator INSTANCE = new SysMLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.omg.sysml.lang.sysml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysMLValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SysMLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SysMLPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case SysMLPackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case SysMLPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case SysMLPackage.MEMBERSHIP:
				return validateMembership((Membership)value, diagnostics, context);
			case SysMLPackage.PACKAGE:
				return validatePackage((org.omg.sysml.lang.sysml.Package)value, diagnostics, context);
			case SysMLPackage.IMPORT:
				return validateImport((Import)value, diagnostics, context);
			case SysMLPackage.PREDICATE:
				return validatePredicate((Predicate)value, diagnostics, context);
			case SysMLPackage.FUNCTION:
				return validateFunction((Function)value, diagnostics, context);
			case SysMLPackage.BEHAVIOR:
				return validateBehavior((Behavior)value, diagnostics, context);
			case SysMLPackage.CLASS:
				return validateClass((org.omg.sysml.lang.sysml.Class)value, diagnostics, context);
			case SysMLPackage.CATEGORY:
				return validateCategory((Category)value, diagnostics, context);
			case SysMLPackage.GENERALIZATION:
				return validateGeneralization((Generalization)value, diagnostics, context);
			case SysMLPackage.FEATURE_MEMBERSHIP:
				return validateFeatureMembership((FeatureMembership)value, diagnostics, context);
			case SysMLPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case SysMLPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case SysMLPackage.REDEFINITION:
				return validateRedefinition((Redefinition)value, diagnostics, context);
			case SysMLPackage.SUBSET:
				return validateSubset((Subset)value, diagnostics, context);
			case SysMLPackage.STEP:
				return validateStep((Step)value, diagnostics, context);
			case SysMLPackage.END_FEATURE_MEMBERSHIP:
				return validateEndFeatureMembership((EndFeatureMembership)value, diagnostics, context);
			case SysMLPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case SysMLPackage.CONNECTOR_END:
				return validateConnectorEnd((ConnectorEnd)value, diagnostics, context);
			case SysMLPackage.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION:
				return validateElementReferenceExpression((ElementReferenceExpression)value, diagnostics, context);
			case SysMLPackage.FEATURE_ACCESS_EXPRESSION:
				return validateFeatureAccessExpression((FeatureAccessExpression)value, diagnostics, context);
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION:
				return validateInstanceCreationExpression((InstanceCreationExpression)value, diagnostics, context);
			case SysMLPackage.ITEM_FLOW:
				return validateItemFlow((ItemFlow)value, diagnostics, context);
			case SysMLPackage.LITERAL_BOOLEAN:
				return validateLiteralBoolean((LiteralBoolean)value, diagnostics, context);
			case SysMLPackage.LITERAL_EXPRESSION:
				return validateLiteralExpression((LiteralExpression)value, diagnostics, context);
			case SysMLPackage.LITERAL_INTEGER:
				return validateLiteralInteger((LiteralInteger)value, diagnostics, context);
			case SysMLPackage.LITERAL_NULL:
				return validateLiteralNull((LiteralNull)value, diagnostics, context);
			case SysMLPackage.LITERAL_REAL:
				return validateLiteralReal((LiteralReal)value, diagnostics, context);
			case SysMLPackage.LITERAL_STRING:
				return validateLiteralString((LiteralString)value, diagnostics, context);
			case SysMLPackage.LITERAL_UNBOUNDED:
				return validateLiteralUnbounded((LiteralUnbounded)value, diagnostics, context);
			case SysMLPackage.OF_SUCCESSION:
				return validateOfSuccession((OfSuccession)value, diagnostics, context);
			case SysMLPackage.ORDERED_FEATURE:
				return validateOrderedFeature((OrderedFeature)value, diagnostics, context);
			case SysMLPackage.STRUCTURED_FEATURE:
				return validateStructuredFeature((StructuredFeature)value, diagnostics, context);
			case SysMLPackage.OPERATOR_EXPRESSION:
				return validateOperatorExpression((OperatorExpression)value, diagnostics, context);
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION:
				return validateSequenceAccessExpression((SequenceAccessExpression)value, diagnostics, context);
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION:
				return validateSequenceConstructionExpression((SequenceConstructionExpression)value, diagnostics, context);
			case SysMLPackage.SUCCESSION:
				return validateSuccession((Succession)value, diagnostics, context);
			case SysMLPackage.SUCCESSION_ITEM_FLOW:
				return validateSuccessionItemFlow((SuccessionItemFlow)value, diagnostics, context);
			case SysMLPackage.VISIBILITY_KIND:
				return validateVisibilityKind((VisibilityKind)value, diagnostics, context);
			case SysMLPackage.FEATURE_DIRECTION_KIND:
				return validateFeatureDirectionKind((FeatureDirectionKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(association, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(association, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(association, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(association, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(association, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(association, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(association, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(relationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(element, diagnostics, context);
		return result;
	}

	/**
	 * Validates the elementName constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_elementName(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "elementName", getObjectLabel(element, context) },
						 new Object[] { element },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembership(Membership membership, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(membership, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(membership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(membership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(membership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(membership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(membership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(membership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(membership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(membership, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(membership, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(org.omg.sysml.lang.sysml.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(package_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(package_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the packageNameUniqueness constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage_packageNameUniqueness(org.omg.sysml.lang.sysml.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "packageNameUniqueness", getObjectLabel(package_, context) },
						 new Object[] { package_ },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the packageDistinguishibility constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage_packageDistinguishibility(org.omg.sysml.lang.sysml.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "packageDistinguishibility", getObjectLabel(package_, context) },
						 new Object[] { package_ },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the packageMembers constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage_packageMembers(org.omg.sysml.lang.sysml.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "packageMembers", getObjectLabel(package_, context) },
						 new Object[] { package_ },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the packageOwnedMembers constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage_packageOwnedMembers(org.omg.sysml.lang.sysml.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "packageOwnedMembers", getObjectLabel(package_, context) },
						 new Object[] { package_ },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the packageImportedMembership constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage_packageImportedMembership(org.omg.sysml.lang.sysml.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "packageImportedMembership", getObjectLabel(package_, context) },
						 new Object[] { package_ },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImport(Import import_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(import_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(import_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(import_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(import_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(import_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(import_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(import_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(import_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(import_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(import_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredicate(Predicate predicate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(predicate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(predicate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(predicate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(function, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(function, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(function, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(function, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(function, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(function, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(function, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(behavior, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(org.omg.sysml.lang.sysml.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(class_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(category, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(category, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(category, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(category, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(category, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(category, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(category, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralization(Generalization generalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(generalization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureMembership(FeatureMembership featureMembership, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(featureMembership, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(featureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(featureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(featureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(featureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(featureMembership, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(feature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(feature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(expression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(expression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinition(Redefinition redefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(redefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(redefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(redefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(redefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(redefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(redefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(redefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(redefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(redefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(redefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubset(Subset subset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subset, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subset, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subset, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(subset, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(step, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(step, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(step, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(step, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(step, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(step, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(step, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndFeatureMembership(EndFeatureMembership endFeatureMembership, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endFeatureMembership, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(endFeatureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(endFeatureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(endFeatureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(endFeatureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(endFeatureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(endFeatureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(endFeatureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(endFeatureMembership, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(endFeatureMembership, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(connector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd(ConnectorEnd connectorEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectorEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(connectorEnd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(comment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementReferenceExpression(ElementReferenceExpression elementReferenceExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elementReferenceExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(elementReferenceExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(elementReferenceExpression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureAccessExpression(FeatureAccessExpression featureAccessExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(featureAccessExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(featureAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(featureAccessExpression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceCreationExpression(InstanceCreationExpression instanceCreationExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceCreationExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(instanceCreationExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(instanceCreationExpression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemFlow(ItemFlow itemFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(itemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(itemFlow, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralBoolean(LiteralBoolean literalBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalBoolean, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(literalBoolean, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralExpression(LiteralExpression literalExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(literalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(literalExpression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralInteger(LiteralInteger literalInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalInteger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(literalInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralNull(LiteralNull literalNull, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalNull, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(literalNull, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralReal(LiteralReal literalReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalReal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(literalReal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralString(LiteralString literalString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalString, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(literalString, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralUnbounded(LiteralUnbounded literalUnbounded, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalUnbounded, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(literalUnbounded, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(literalUnbounded, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfSuccession(OfSuccession ofSuccession, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ofSuccession, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderedFeature(OrderedFeature orderedFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(orderedFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(orderedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(orderedFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredFeature(StructuredFeature structuredFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuredFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(structuredFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(structuredFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperatorExpression(OperatorExpression operatorExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operatorExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(operatorExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(operatorExpression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceAccessExpression(SequenceAccessExpression sequenceAccessExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sequenceAccessExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(sequenceAccessExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(sequenceAccessExpression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceConstructionExpression(SequenceConstructionExpression sequenceConstructionExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sequenceConstructionExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(sequenceConstructionExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(sequenceConstructionExpression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuccession(Succession succession, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(succession, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(succession, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(succession, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuccessionItemFlow(SuccessionItemFlow successionItemFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(successionItemFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_elementName(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageNameUniqueness(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageDistinguishibility(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageMembers(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageOwnedMembers(successionItemFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_packageImportedMembership(successionItemFlow, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityKind(VisibilityKind visibilityKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureDirectionKind(FeatureDirectionKind featureDirectionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SysMLValidator
