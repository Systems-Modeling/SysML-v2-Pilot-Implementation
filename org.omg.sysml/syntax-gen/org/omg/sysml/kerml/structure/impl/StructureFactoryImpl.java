/**
 */
package org.omg.sysml.kerml.structure.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureFactoryImpl extends EFactoryImpl implements StructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructureFactory init() {
		try {
			StructureFactory theStructureFactory = (StructureFactory)EPackage.Registry.INSTANCE.getEFactory(StructurePackage.eNS_URI);
			if (theStructureFactory != null) {
				return theStructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StructurePackage.CLASS: return createClass();
			case StructurePackage.ASSOCIATION: return createAssociation();
			case StructurePackage.FEATURE: return createFeature();
			case StructurePackage.GENERALIZATION: return createGeneralization();
			case StructurePackage.CONNECTOR: return createConnector();
			case StructurePackage.STRUCTURED_FEATURE: return createStructuredFeature();
			case StructurePackage.REFINED_ASSOCIATION: return createRefinedAssociation();
			case StructurePackage.VALUE_OPTION: return createValueOption();
			case StructurePackage.DATA_FEATURE: return createDataFeature();
			case StructurePackage.STRUCTURED_CLASS: return createStructuredClass();
			case StructurePackage.GENERALIZATION_SET: return createGeneralizationSet();
			case StructurePackage.BINDING: return createBinding();
			case StructurePackage.VALUE_RESTRICTION: return createValueRestriction();
			case StructurePackage.DATA_TYPE: return createDataType();
			case StructurePackage.FEATURE_PATH_NODE: return createFeaturePathNode();
			case StructurePackage.INDIVIDUAL: return createIndividual();
			case StructurePackage.RESTRICTS: return createRestricts();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StructurePackage.PROPERTY_ACCESS_KIND:
				return createPropertyAccessKindFromString(eDataType, initialValue);
			case StructurePackage.AGGREGATION_KIND:
				return createAggregationKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StructurePackage.PROPERTY_ACCESS_KIND:
				return convertPropertyAccessKindToString(eDataType, instanceValue);
			case StructurePackage.AGGREGATION_KIND:
				return convertAggregationKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredFeature createStructuredFeature() {
		StructuredFeatureImpl structuredFeature = new StructuredFeatureImpl();
		return structuredFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedAssociation createRefinedAssociation() {
		RefinedAssociationImpl refinedAssociation = new RefinedAssociationImpl();
		return refinedAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueOption createValueOption() {
		ValueOptionImpl valueOption = new ValueOptionImpl();
		return valueOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFeature createDataFeature() {
		DataFeatureImpl dataFeature = new DataFeatureImpl();
		return dataFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClass createStructuredClass() {
		StructuredClassImpl structuredClass = new StructuredClassImpl();
		return structuredClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet createGeneralizationSet() {
		GeneralizationSetImpl generalizationSet = new GeneralizationSetImpl();
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRestriction createValueRestriction() {
		ValueRestrictionImpl valueRestriction = new ValueRestrictionImpl();
		return valueRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePathNode createFeaturePathNode() {
		FeaturePathNodeImpl featurePathNode = new FeaturePathNodeImpl();
		return featurePathNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual createIndividual() {
		IndividualImpl individual = new IndividualImpl();
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restricts createRestricts() {
		RestrictsImpl restricts = new RestrictsImpl();
		return restricts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAccessKind createPropertyAccessKindFromString(EDataType eDataType, String initialValue) {
		PropertyAccessKind result = PropertyAccessKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyAccessKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind createAggregationKindFromString(EDataType eDataType, String initialValue) {
		AggregationKind result = AggregationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructurePackage getStructurePackage() {
		return (StructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructurePackage getPackage() {
		return StructurePackage.eINSTANCE;
	}

} //StructureFactoryImpl
