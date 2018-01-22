/**
 */
package org.omg.sysml.kerml.structure.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.omg.sysml.kerml.core.CorePackage;

import org.omg.sysml.kerml.core.impl.CorePackageImpl;

import org.omg.sysml.kerml.structure.AggregationKind;
import org.omg.sysml.kerml.structure.Association;
import org.omg.sysml.kerml.structure.Binding;
import org.omg.sysml.kerml.structure.Connector;
import org.omg.sysml.kerml.structure.DataFeature;
import org.omg.sysml.kerml.structure.DataType;
import org.omg.sysml.kerml.structure.Feature;
import org.omg.sysml.kerml.structure.FeaturePathNode;
import org.omg.sysml.kerml.structure.Generalization;
import org.omg.sysml.kerml.structure.GeneralizationSet;
import org.omg.sysml.kerml.structure.Individual;
import org.omg.sysml.kerml.structure.PropertyAccessKind;
import org.omg.sysml.kerml.structure.RefinedAssociation;
import org.omg.sysml.kerml.structure.Restricts;
import org.omg.sysml.kerml.structure.StructureFactory;
import org.omg.sysml.kerml.structure.StructurePackage;
import org.omg.sysml.kerml.structure.StructuredClass;
import org.omg.sysml.kerml.structure.StructuredFeature;
import org.omg.sysml.kerml.structure.ValueOption;
import org.omg.sysml.kerml.structure.ValueRestriction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructurePackageImpl extends EPackageImpl implements StructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinedAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featurePathNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyAccessKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.omg.sysml.kerml.structure.StructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructurePackageImpl() {
		super(eNS_URI, StructureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructurePackage init() {
		if (isInited) return (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);

		// Obtain or create and register package
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theStructurePackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theStructurePackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructurePackage.eNS_URI, theStructurePackage);
		return theStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SpecificClassifier() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_GeneralClassifier() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedFeature() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsAbstract() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_InheritedFeature() {
		return (EReference)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_TypesFeature() {
		return (EReference)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Feature() {
		return (EReference)classEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_InstanceOf() {
		return (EReference)classEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Generalization() {
		return (EReference)classEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_NestedFeatureOfClass() {
		return (EReference)classEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_TargetEndProperty() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_TargetParticipantProperty() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_SourceEndProperty() {
		return (EReference)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_SourceParticipantProperty() {
		return (EReference)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_ParticipantProperty() {
		return (EReference)associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_EndProperty() {
		return (EReference)associationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_TypesConnector() {
		return (EReference)associationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Type() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Upper() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Lower() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Class() {
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_RedefinedFeature() {
		return (EReference)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_SubsettedFeature() {
		return (EReference)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsDerived() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsUnique() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsReadOnly() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsOrdered() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_MethodVisibility() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Context() {
		return (EReference)featureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_FeaturePath() {
		return (EReference)featureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_NestingFeature() {
		return (EReference)featureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_NestedFeature() {
		return (EReference)featureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_DefiningType() {
		return (EReference)featureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_RefiningType() {
		return (EReference)featureEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_OwnedType() {
		return (EReference)featureEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_FeaturingClassifier() {
		return (EReference)featureEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_General() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Specific() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_SourcePath() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_TargetPath() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_IsDirected() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceUpper() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceLower() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_TargetUpper() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_TargetLower() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_SourceMultiplicity() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_TargetMultiplicity() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Value() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredFeature() {
		return structuredFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredFeature_IsPort() {
		return (EAttribute)structuredFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredFeature_OutsideAccess() {
		return (EAttribute)structuredFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredFeature_InsideAccess() {
		return (EAttribute)structuredFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredFeature_Union() {
		return (EReference)structuredFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredFeature_Option() {
		return (EReference)structuredFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredFeature_IsNavigable() {
		return (EAttribute)structuredFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredFeature_Aggregation() {
		return (EAttribute)structuredFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredFeature_EndOf() {
		return (EReference)structuredFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredFeature_ParticipatesIn() {
		return (EReference)structuredFeatureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredFeature_IsInput() {
		return (EAttribute)structuredFeatureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredFeature_IsOutput() {
		return (EAttribute)structuredFeatureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinedAssociation() {
		return refinedAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinedAssociation_DefiningConnector() {
		return (EReference)refinedAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinedAssociation_InstanceOf() {
		return (EReference)refinedAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueOption() {
		return valueOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueOption_Option() {
		return (EReference)valueOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueOption_OptionOfProperty() {
		return (EReference)valueOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFeature() {
		return dataFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFeature_DataType() {
		return (EReference)dataFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFeature_Value() {
		return (EReference)dataFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFeature_DefaultValue() {
		return (EReference)dataFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredClass() {
		return structuredClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_Output() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_Input() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_RequiredProperty() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_ProvidedProperty() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredClass_IsEncapsulated() {
		return (EAttribute)structuredClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_Conjugate() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_OwnedConnector() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_OwnedStructuredFeature() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_TypesProperty() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_BlindProperty() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_PortProperty() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_ProxyPort() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_SelfPort() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_FullPort() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClass_InteractionParticipant() {
		return (EReference)structuredClassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSet() {
		return generalizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Complete() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRestriction() {
		return valueRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturePathNode() {
		return featurePathNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeaturePathNode_Feature() {
		return (EReference)featurePathNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_DefiningFeature() {
		return (EReference)individualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_Parent() {
		return (EReference)individualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_Child() {
		return (EReference)individualEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_Context() {
		return (EReference)individualEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestricts() {
		return restrictsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestricts_Restricted() {
		return (EReference)restrictsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestricts_RestrictedBy() {
		return (EReference)restrictsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyAccessKind() {
		return propertyAccessKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationKind() {
		return aggregationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureFactory getStructureFactory() {
		return (StructureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__SPECIFIC_CLASSIFIER);
		createEReference(classEClass, CLASS__GENERAL_CLASSIFIER);
		createEReference(classEClass, CLASS__OWNED_FEATURE);
		createEAttribute(classEClass, CLASS__IS_ABSTRACT);
		createEReference(classEClass, CLASS__INHERITED_FEATURE);
		createEReference(classEClass, CLASS__TYPES_FEATURE);
		createEReference(classEClass, CLASS__FEATURE);
		createEReference(classEClass, CLASS__INSTANCE_OF);
		createEReference(classEClass, CLASS__GENERALIZATION);
		createEReference(classEClass, CLASS__NESTED_FEATURE_OF_CLASS);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__TARGET_END_PROPERTY);
		createEReference(associationEClass, ASSOCIATION__TARGET_PARTICIPANT_PROPERTY);
		createEReference(associationEClass, ASSOCIATION__SOURCE_END_PROPERTY);
		createEReference(associationEClass, ASSOCIATION__SOURCE_PARTICIPANT_PROPERTY);
		createEReference(associationEClass, ASSOCIATION__PARTICIPANT_PROPERTY);
		createEReference(associationEClass, ASSOCIATION__END_PROPERTY);
		createEReference(associationEClass, ASSOCIATION__TYPES_CONNECTOR);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__TYPE);
		createEAttribute(featureEClass, FEATURE__UPPER);
		createEAttribute(featureEClass, FEATURE__LOWER);
		createEReference(featureEClass, FEATURE__CLASS);
		createEReference(featureEClass, FEATURE__REDEFINED_FEATURE);
		createEReference(featureEClass, FEATURE__SUBSETTED_FEATURE);
		createEAttribute(featureEClass, FEATURE__IS_DERIVED);
		createEAttribute(featureEClass, FEATURE__IS_UNIQUE);
		createEAttribute(featureEClass, FEATURE__IS_READ_ONLY);
		createEAttribute(featureEClass, FEATURE__IS_ORDERED);
		createEAttribute(featureEClass, FEATURE__METHOD_VISIBILITY);
		createEReference(featureEClass, FEATURE__CONTEXT);
		createEReference(featureEClass, FEATURE__FEATURE_PATH);
		createEReference(featureEClass, FEATURE__NESTING_FEATURE);
		createEReference(featureEClass, FEATURE__NESTED_FEATURE);
		createEReference(featureEClass, FEATURE__DEFINING_TYPE);
		createEReference(featureEClass, FEATURE__REFINING_TYPE);
		createEReference(featureEClass, FEATURE__OWNED_TYPE);
		createEReference(featureEClass, FEATURE__FEATURING_CLASSIFIER);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__GENERAL);
		createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__SOURCE_PATH);
		createEReference(connectorEClass, CONNECTOR__TARGET_PATH);
		createEAttribute(connectorEClass, CONNECTOR__IS_DIRECTED);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_UPPER);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_LOWER);
		createEAttribute(connectorEClass, CONNECTOR__TARGET_UPPER);
		createEAttribute(connectorEClass, CONNECTOR__TARGET_LOWER);
		createEAttribute(connectorEClass, CONNECTOR__SOURCE_MULTIPLICITY);
		createEAttribute(connectorEClass, CONNECTOR__TARGET_MULTIPLICITY);
		createEReference(connectorEClass, CONNECTOR__VALUE);

		structuredFeatureEClass = createEClass(STRUCTURED_FEATURE);
		createEAttribute(structuredFeatureEClass, STRUCTURED_FEATURE__IS_PORT);
		createEAttribute(structuredFeatureEClass, STRUCTURED_FEATURE__OUTSIDE_ACCESS);
		createEAttribute(structuredFeatureEClass, STRUCTURED_FEATURE__INSIDE_ACCESS);
		createEReference(structuredFeatureEClass, STRUCTURED_FEATURE__UNION);
		createEReference(structuredFeatureEClass, STRUCTURED_FEATURE__OPTION);
		createEAttribute(structuredFeatureEClass, STRUCTURED_FEATURE__IS_NAVIGABLE);
		createEAttribute(structuredFeatureEClass, STRUCTURED_FEATURE__AGGREGATION);
		createEReference(structuredFeatureEClass, STRUCTURED_FEATURE__END_OF);
		createEReference(structuredFeatureEClass, STRUCTURED_FEATURE__PARTICIPATES_IN);
		createEAttribute(structuredFeatureEClass, STRUCTURED_FEATURE__IS_INPUT);
		createEAttribute(structuredFeatureEClass, STRUCTURED_FEATURE__IS_OUTPUT);

		refinedAssociationEClass = createEClass(REFINED_ASSOCIATION);
		createEReference(refinedAssociationEClass, REFINED_ASSOCIATION__DEFINING_CONNECTOR);
		createEReference(refinedAssociationEClass, REFINED_ASSOCIATION__INSTANCE_OF);

		valueOptionEClass = createEClass(VALUE_OPTION);
		createEReference(valueOptionEClass, VALUE_OPTION__OPTION);
		createEReference(valueOptionEClass, VALUE_OPTION__OPTION_OF_PROPERTY);

		dataFeatureEClass = createEClass(DATA_FEATURE);
		createEReference(dataFeatureEClass, DATA_FEATURE__DATA_TYPE);
		createEReference(dataFeatureEClass, DATA_FEATURE__VALUE);
		createEReference(dataFeatureEClass, DATA_FEATURE__DEFAULT_VALUE);

		structuredClassEClass = createEClass(STRUCTURED_CLASS);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__OUTPUT);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__INPUT);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__REQUIRED_PROPERTY);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__PROVIDED_PROPERTY);
		createEAttribute(structuredClassEClass, STRUCTURED_CLASS__IS_ENCAPSULATED);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__CONJUGATE);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__OWNED_CONNECTOR);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__OWNED_STRUCTURED_FEATURE);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__TYPES_PROPERTY);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__BLIND_PROPERTY);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__PORT_PROPERTY);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__PROXY_PORT);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__SELF_PORT);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__FULL_PORT);
		createEReference(structuredClassEClass, STRUCTURED_CLASS__INTERACTION_PARTICIPANT);

		generalizationSetEClass = createEClass(GENERALIZATION_SET);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__COMPLETE);

		bindingEClass = createEClass(BINDING);

		valueRestrictionEClass = createEClass(VALUE_RESTRICTION);

		dataTypeEClass = createEClass(DATA_TYPE);

		featurePathNodeEClass = createEClass(FEATURE_PATH_NODE);
		createEReference(featurePathNodeEClass, FEATURE_PATH_NODE__FEATURE);

		individualEClass = createEClass(INDIVIDUAL);
		createEReference(individualEClass, INDIVIDUAL__DEFINING_FEATURE);
		createEReference(individualEClass, INDIVIDUAL__PARENT);
		createEReference(individualEClass, INDIVIDUAL__CHILD);
		createEReference(individualEClass, INDIVIDUAL__CONTEXT);

		restrictsEClass = createEClass(RESTRICTS);
		createEReference(restrictsEClass, RESTRICTS__RESTRICTED);
		createEReference(restrictsEClass, RESTRICTS__RESTRICTED_BY);

		// Create enums
		propertyAccessKindEEnum = createEEnum(PROPERTY_ACCESS_KIND);
		aggregationKindEEnum = createEEnum(AGGREGATION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classEClass.getESuperTypes().add(theCorePackage.getContainer());
		associationEClass.getESuperTypes().add(theCorePackage.getRelationship());
		associationEClass.getESuperTypes().add(this.getStructuredClass());
		featureEClass.getESuperTypes().add(theCorePackage.getContainer());
		generalizationEClass.getESuperTypes().add(theCorePackage.getRelationship());
		connectorEClass.getESuperTypes().add(theCorePackage.getRelationship());
		connectorEClass.getESuperTypes().add(this.getStructuredFeature());
		structuredFeatureEClass.getESuperTypes().add(this.getFeature());
		valueOptionEClass.getESuperTypes().add(theCorePackage.getRelationship());
		valueOptionEClass.getESuperTypes().add(this.getClass_());
		dataFeatureEClass.getESuperTypes().add(this.getFeature());
		structuredClassEClass.getESuperTypes().add(this.getClass_());
		generalizationSetEClass.getESuperTypes().add(theCorePackage.getRelationship());
		bindingEClass.getESuperTypes().add(this.getConnector());
		valueRestrictionEClass.getESuperTypes().add(this.getClass_());
		dataTypeEClass.getESuperTypes().add(this.getClass_());
		restrictsEClass.getESuperTypes().add(theCorePackage.getRelationship());
		restrictsEClass.getESuperTypes().add(this.getGeneralization());

		// Initialize classes, features, and operations; add parameters
		initEClass(classEClass, org.omg.sysml.kerml.structure.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_SpecificClassifier(), this.getClass_(), null, "specificClassifier", null, 0, -1, org.omg.sysml.kerml.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_GeneralClassifier(), this.getClass_(), null, "generalClassifier", null, 0, -1, org.omg.sysml.kerml.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_OwnedFeature(), this.getFeature(), this.getFeature_Class(), "ownedFeature", null, 0, -1, org.omg.sysml.kerml.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClass_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 1, 1, org.omg.sysml.kerml.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_InheritedFeature(), this.getFeature(), null, "inheritedFeature", null, 0, -1, org.omg.sysml.kerml.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_TypesFeature(), this.getFeature(), null, "typesFeature", null, 0, -1, org.omg.sysml.kerml.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_Feature(), this.getFeature(), this.getFeature_FeaturingClassifier(), "feature", null, 0, -1, org.omg.sysml.kerml.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_InstanceOf(), this.getClass_(), null, "instanceOf", null, 0, 1, org.omg.sysml.kerml.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_Generalization(), this.getGeneralization(), this.getGeneralization_Specific(), "generalization", null, 0, -1, org.omg.sysml.kerml.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_NestedFeatureOfClass(), this.getFeature(), this.getFeature_Context(), "nestedFeatureOfClass", null, 0, -1, org.omg.sysml.kerml.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_TargetEndProperty(), this.getStructuredFeature(), null, "targetEndProperty", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_TargetParticipantProperty(), this.getStructuredFeature(), null, "targetParticipantProperty", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_SourceEndProperty(), this.getStructuredFeature(), null, "sourceEndProperty", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_SourceParticipantProperty(), this.getStructuredFeature(), null, "sourceParticipantProperty", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_ParticipantProperty(), this.getStructuredFeature(), this.getStructuredFeature_ParticipatesIn(), "participantProperty", null, 2, 2, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_EndProperty(), this.getStructuredFeature(), this.getStructuredFeature_EndOf(), "endProperty", null, 2, 2, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_TypesConnector(), this.getConnector(), null, "typesConnector", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_Type(), this.getClass_(), null, "type", null, 1, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_Upper(), ecorePackage.getEInt(), "upper", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_Lower(), ecorePackage.getEInt(), "lower", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_Class(), this.getClass_(), this.getClass_OwnedFeature(), "class", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_RedefinedFeature(), this.getFeature(), null, "redefinedFeature", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_SubsettedFeature(), this.getFeature(), null, "subsettedFeature", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsDerived(), ecorePackage.getEBoolean(), "isDerived", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsReadOnly(), ecorePackage.getEBoolean(), "isReadOnly", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsOrdered(), ecorePackage.getEBoolean(), "isOrdered", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_MethodVisibility(), theCorePackage.getvisibilityKind(), "methodVisibility", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_Context(), this.getClass_(), this.getClass_NestedFeatureOfClass(), "context", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_FeaturePath(), this.getFeaturePathNode(), null, "featurePath", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_NestingFeature(), this.getFeature(), this.getFeature_NestedFeature(), "nestingFeature", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_NestedFeature(), this.getFeature(), this.getFeature_NestingFeature(), "nestedFeature", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_DefiningType(), this.getClass_(), null, "definingType", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_RefiningType(), this.getClass_(), null, "refiningType", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwnedType(), this.getClass_(), null, "ownedType", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_FeaturingClassifier(), this.getClass_(), this.getClass_Feature(), "featuringClassifier", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_General(), this.getClass_(), null, "general", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_Specific(), this.getClass_(), this.getClass_Generalization(), "specific", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_SourcePath(), this.getStructuredFeature(), null, "sourcePath", null, 1, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_TargetPath(), this.getStructuredFeature(), null, "targetPath", null, 1, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_IsDirected(), ecorePackage.getEBoolean(), "isDirected", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnector_SourceUpper(), ecorePackage.getEInt(), "sourceUpper", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnector_SourceLower(), ecorePackage.getEInt(), "sourceLower", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnector_TargetUpper(), ecorePackage.getEInt(), "targetUpper", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnector_TargetLower(), ecorePackage.getEInt(), "targetLower", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnector_SourceMultiplicity(), ecorePackage.getEString(), "sourceMultiplicity", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnector_TargetMultiplicity(), ecorePackage.getEString(), "targetMultiplicity", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_Value(), this.getRefinedAssociation(), this.getRefinedAssociation_DefiningConnector(), "value", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(structuredFeatureEClass, StructuredFeature.class, "StructuredFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuredFeature_IsPort(), ecorePackage.getEBoolean(), "isPort", null, 1, 1, StructuredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructuredFeature_OutsideAccess(), this.getPropertyAccessKind(), "outsideAccess", null, 0, 2, StructuredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructuredFeature_InsideAccess(), this.getPropertyAccessKind(), "insideAccess", null, 0, 2, StructuredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredFeature_Union(), this.getStructuredFeature(), null, "union", null, 0, -1, StructuredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredFeature_Option(), this.getValueOption(), this.getValueOption_OptionOfProperty(), "option", null, 1, 1, StructuredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructuredFeature_IsNavigable(), ecorePackage.getEBoolean(), "isNavigable", null, 0, 1, StructuredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructuredFeature_Aggregation(), this.getAggregationKind(), "aggregation", null, 0, 1, StructuredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredFeature_EndOf(), this.getAssociation(), this.getAssociation_EndProperty(), "endOf", null, 0, 1, StructuredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredFeature_ParticipatesIn(), this.getAssociation(), this.getAssociation_ParticipantProperty(), "participatesIn", null, 0, 1, StructuredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructuredFeature_IsInput(), ecorePackage.getEBoolean(), "isInput", null, 0, 1, StructuredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructuredFeature_IsOutput(), ecorePackage.getEBoolean(), "isOutput", null, 0, 1, StructuredFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(refinedAssociationEClass, RefinedAssociation.class, "RefinedAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinedAssociation_DefiningConnector(), this.getConnector(), this.getConnector_Value(), "definingConnector", null, 1, 1, RefinedAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRefinedAssociation_InstanceOf(), this.getAssociation(), null, "instanceOf", null, 0, 1, RefinedAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueOptionEClass, ValueOption.class, "ValueOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueOption_Option(), this.getClass_(), null, "option", null, 2, -1, ValueOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueOption_OptionOfProperty(), this.getStructuredFeature(), this.getStructuredFeature_Option(), "optionOfProperty", null, 1, 1, ValueOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataFeatureEClass, DataFeature.class, "DataFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFeature_DataType(), this.getDataType(), null, "dataType", null, 1, 1, DataFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataFeature_Value(), this.getValueRestriction(), null, "value", null, 0, -1, DataFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataFeature_DefaultValue(), this.getValueRestriction(), null, "defaultValue", null, 1, 1, DataFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(structuredClassEClass, StructuredClass.class, "StructuredClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredClass_Output(), this.getStructuredFeature(), null, "output", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_Input(), this.getStructuredFeature(), null, "input", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_RequiredProperty(), this.getStructuredFeature(), null, "requiredProperty", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_ProvidedProperty(), this.getStructuredFeature(), null, "providedProperty", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructuredClass_IsEncapsulated(), ecorePackage.getEBoolean(), "isEncapsulated", null, 1, 1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_Conjugate(), this.getStructuredClass(), null, "conjugate", null, 1, 1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_OwnedConnector(), this.getConnector(), null, "ownedConnector", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_OwnedStructuredFeature(), this.getStructuredFeature(), null, "ownedStructuredFeature", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_TypesProperty(), this.getStructuredFeature(), null, "typesProperty", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_BlindProperty(), this.getStructuredFeature(), null, "blindProperty", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_PortProperty(), this.getStructuredFeature(), null, "portProperty", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_ProxyPort(), this.getStructuredFeature(), null, "proxyPort", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_SelfPort(), this.getStructuredFeature(), null, "selfPort", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_FullPort(), this.getStructuredFeature(), null, "fullPort", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClass_InteractionParticipant(), this.getStructuredFeature(), null, "interactionParticipant", null, 0, -1, StructuredClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralizationSet_Complete(), this.getGeneralization(), null, "complete", null, 1, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueRestrictionEClass, ValueRestriction.class, "ValueRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featurePathNodeEClass, FeaturePathNode.class, "FeaturePathNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeaturePathNode_Feature(), this.getFeature(), null, "feature", null, 1, 1, FeaturePathNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(individualEClass, Individual.class, "Individual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividual_DefiningFeature(), this.getFeature(), null, "definingFeature", null, 1, 1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIndividual_Parent(), this.getIndividual(), this.getIndividual_Child(), "parent", null, 0, 1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIndividual_Child(), this.getIndividual(), this.getIndividual_Parent(), "child", null, 0, -1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIndividual_Context(), this.getClass_(), null, "context", null, 1, 1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(restrictsEClass, Restricts.class, "Restricts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestricts_Restricted(), this.getDataType(), null, "restricted", null, 1, 1, Restricts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRestricts_RestrictedBy(), this.getValueRestriction(), null, "restrictedBy", null, 1, 1, Restricts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(propertyAccessKindEEnum, PropertyAccessKind.class, "PropertyAccessKind");
		addEEnumLiteral(propertyAccessKindEEnum, PropertyAccessKind.READ);
		addEEnumLiteral(propertyAccessKindEEnum, PropertyAccessKind.WRITE);
		addEEnumLiteral(propertyAccessKindEEnum, PropertyAccessKind.ONLY);

		initEEnum(aggregationKindEEnum, AggregationKind.class, "AggregationKind");
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.COMPOSITE);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.SHARED);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //StructurePackageImpl
