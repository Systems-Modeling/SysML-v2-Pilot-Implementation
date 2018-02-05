/**
 */
package org.omg.sysml.kerml.structure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.omg.sysml.kerml.structure.StructureFactory
 * @model kind="package"
 * @generated
 */
public interface StructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openmbee.org/kerml/str";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "str";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructurePackage eINSTANCE = org.omg.sysml.kerml.structure.impl.StructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.ClassImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DOCUMENTATION = org.omg.sysml.kerml.core.CorePackage.CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNER = org.omg.sysml.kerml.core.CorePackage.CONTAINER__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TITLE = org.omg.sysml.kerml.core.CorePackage.CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = org.omg.sysml.kerml.core.CorePackage.CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.CONTAINER__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAMESPACE = org.omg.sysml.kerml.core.CorePackage.CONTAINER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MEMBER_OF_NAMESPACE = org.omg.sysml.kerml.core.CorePackage.CONTAINER__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SOURCE_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.CONTAINER__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TARGET_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.CONTAINER__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_COMMENT = org.omg.sysml.kerml.core.CorePackage.CONTAINER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ELEMENT = org.omg.sysml.kerml.core.CorePackage.CONTAINER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGE_VISIBILITY = org.omg.sysml.kerml.core.CorePackage.CONTAINER__PACKAGE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_MEMBER = org.omg.sysml.kerml.core.CorePackage.CONTAINER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MEMBER = org.omg.sysml.kerml.core.CorePackage.CONTAINER__MEMBER;

	/**
	 * The feature id for the '<em><b>Specific Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SPECIFIC_CLASSIFIER = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERAL_CLASSIFIER = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_FEATURE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inherited Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INHERITED_FEATURE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Types Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TYPES_FEATURE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FEATURE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INSTANCE_OF = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERALIZATION = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Nested Feature Of Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NESTED_FEATURE_OF_CLASS = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = org.omg.sysml.kerml.core.CorePackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.AssociationImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DOCUMENTATION = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TITLE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAMESPACE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MEMBER_OF_NAMESPACE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_COMMENT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_ELEMENT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__RELATED = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PACKAGE_VISIBILITY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_MEMBER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MEMBER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specific Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SPECIFIC_CLASSIFIER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>General Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__GENERAL_CLASSIFIER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_ABSTRACT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inherited Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__INHERITED_FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Types Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TYPES_FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__INSTANCE_OF = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__GENERALIZATION = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Nested Feature Of Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NESTED_FEATURE_OF_CLASS = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OUTPUT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__INPUT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Required Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__REQUIRED_PROPERTY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Provided Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PROVIDED_PROPERTY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_ENCAPSULATED = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Conjugate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CONJUGATE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_CONNECTOR = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Owned Structured Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_STRUCTURED_FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Types Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TYPES_PROPERTY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Blind Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__BLIND_PROPERTY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Port Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PORT_PROPERTY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Proxy Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PROXY_PORT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Self Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SELF_PORT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Full Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FULL_PORT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Interaction Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__INTERACTION_PARTICIPANT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Target End Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_END_PROPERTY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Target Participant Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_PARTICIPANT_PROPERTY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Source End Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_END_PROPERTY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Source Participant Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_PARTICIPANT_PROPERTY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Participant Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PARTICIPANT_PROPERTY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>End Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__END_PROPERTY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Types Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TYPES_CONNECTOR = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 34;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 35;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.FeatureImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DOCUMENTATION = org.omg.sysml.kerml.core.CorePackage.CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNER = org.omg.sysml.kerml.core.CorePackage.CONTAINER__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TITLE = org.omg.sysml.kerml.core.CorePackage.CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = org.omg.sysml.kerml.core.CorePackage.CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.CONTAINER__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAMESPACE = org.omg.sysml.kerml.core.CorePackage.CONTAINER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MEMBER_OF_NAMESPACE = org.omg.sysml.kerml.core.CorePackage.CONTAINER__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SOURCE_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.CONTAINER__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TARGET_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.CONTAINER__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_COMMENT = org.omg.sysml.kerml.core.CorePackage.CONTAINER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_ELEMENT = org.omg.sysml.kerml.core.CorePackage.CONTAINER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PACKAGE_VISIBILITY = org.omg.sysml.kerml.core.CorePackage.CONTAINER__PACKAGE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_MEMBER = org.omg.sysml.kerml.core.CorePackage.CONTAINER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MEMBER = org.omg.sysml.kerml.core.CorePackage.CONTAINER__MEMBER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__UPPER = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LOWER = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CLASS = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Redefined Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REDEFINED_FEATURE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subsetted Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUBSETTED_FEATURE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_DERIVED = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_UNIQUE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_READ_ONLY = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_ORDERED = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Method Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__METHOD_VISIBILITY = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONTEXT = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_PATH = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Nesting Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NESTING_FEATURE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Nested Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NESTED_FEATURE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Defining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DEFINING_TYPE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Refining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REFINING_TYPE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_TYPE = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURING_CLASSIFIER = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = org.omg.sysml.kerml.core.CorePackage.CONTAINER_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = org.omg.sysml.kerml.core.CorePackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.GeneralizationImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__DOCUMENTATION = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TITLE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAMESPACE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__MEMBER_OF_NAMESPACE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNED_COMMENT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNED_ELEMENT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__RELATED = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERAL = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SPECIFIC = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.ConnectorImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DOCUMENTATION = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TITLE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAMESPACE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MEMBER_OF_NAMESPACE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_COMMENT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_ELEMENT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__RELATED = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PACKAGE_VISIBILITY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_MEMBER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MEMBER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__UPPER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__LOWER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CLASS = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Redefined Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__REDEFINED_FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subsetted Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SUBSETTED_FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_DERIVED = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_UNIQUE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_READ_ONLY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_ORDERED = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Method Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__METHOD_VISIBILITY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONTEXT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__FEATURE_PATH = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Nesting Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NESTING_FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Nested Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NESTED_FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Defining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEFINING_TYPE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Refining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__REFINING_TYPE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_TYPE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__FEATURING_CLASSIFIER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Is Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_PORT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Outside Access</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OUTSIDE_ACCESS = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Inside Access</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__INSIDE_ACCESS = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Union</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__UNION = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OPTION = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_NAVIGABLE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__AGGREGATION = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>End Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__END_OF = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Participates In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PARTICIPATES_IN = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Is Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_INPUT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Is Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_OUTPUT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Source Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_PATH = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Target Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET_PATH = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Is Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_DIRECTED = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Source Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_UPPER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Source Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_LOWER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Target Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET_UPPER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Target Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET_LOWER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Source Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_MULTIPLICITY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Target Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET_MULTIPLICITY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__VALUE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 42;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 43;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl <em>Structured Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getStructuredFeature()
	 * @generated
	 */
	int STRUCTURED_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__DOCUMENTATION = FEATURE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__TITLE = FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__RELATIONSHIP = FEATURE__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__NAMESPACE = FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__MEMBER_OF_NAMESPACE = FEATURE__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__SOURCE_RELATIONSHIP = FEATURE__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__TARGET_RELATIONSHIP = FEATURE__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_COMMENT = FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__PACKAGE_VISIBILITY = FEATURE__PACKAGE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__UPPER = FEATURE__UPPER;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__LOWER = FEATURE__LOWER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__CLASS = FEATURE__CLASS;

	/**
	 * The feature id for the '<em><b>Redefined Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__REDEFINED_FEATURE = FEATURE__REDEFINED_FEATURE;

	/**
	 * The feature id for the '<em><b>Subsetted Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__SUBSETTED_FEATURE = FEATURE__SUBSETTED_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_DERIVED = FEATURE__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_READ_ONLY = FEATURE__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Method Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__METHOD_VISIBILITY = FEATURE__METHOD_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__CONTEXT = FEATURE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__FEATURE_PATH = FEATURE__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Nesting Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__NESTING_FEATURE = FEATURE__NESTING_FEATURE;

	/**
	 * The feature id for the '<em><b>Nested Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__NESTED_FEATURE = FEATURE__NESTED_FEATURE;

	/**
	 * The feature id for the '<em><b>Defining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__DEFINING_TYPE = FEATURE__DEFINING_TYPE;

	/**
	 * The feature id for the '<em><b>Refining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__REFINING_TYPE = FEATURE__REFINING_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__FEATURING_CLASSIFIER = FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_PORT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outside Access</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OUTSIDE_ACCESS = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inside Access</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__INSIDE_ACCESS = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Union</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__UNION = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OPTION = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_NAVIGABLE = FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__AGGREGATION = FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>End Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__END_OF = FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Participates In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__PARTICIPATES_IN = FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_INPUT = FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_OUTPUT = FEATURE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Structured Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Structured Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.RefinedAssociationImpl <em>Refined Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.RefinedAssociationImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getRefinedAssociation()
	 * @generated
	 */
	int REFINED_ASSOCIATION = 6;

	/**
	 * The feature id for the '<em><b>Defining Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ASSOCIATION__DEFINING_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ASSOCIATION__INSTANCE_OF = 1;

	/**
	 * The number of structural features of the '<em>Refined Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ASSOCIATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Refined Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINED_ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl <em>Value Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.ValueOptionImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getValueOption()
	 * @generated
	 */
	int VALUE_OPTION = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__DOCUMENTATION = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__OWNER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__TITLE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__NAME = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__NAMESPACE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__MEMBER_OF_NAMESPACE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__SOURCE_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__TARGET_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__OWNED_COMMENT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__OWNED_ELEMENT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__SOURCE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__RELATED = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__TARGET = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__PACKAGE_VISIBILITY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__OWNED_MEMBER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__MEMBER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specific Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__SPECIFIC_CLASSIFIER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>General Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__GENERAL_CLASSIFIER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__OWNED_FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__IS_ABSTRACT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inherited Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__INHERITED_FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Types Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__TYPES_FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__FEATURE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__INSTANCE_OF = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__GENERALIZATION = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Nested Feature Of Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__NESTED_FEATURE_OF_CLASS = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__OPTION = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Option Of Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION__OPTION_OF_PROPERTY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Value Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION_FEATURE_COUNT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Value Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION_OPERATION_COUNT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.DataFeatureImpl <em>Data Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.DataFeatureImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getDataFeature()
	 * @generated
	 */
	int DATA_FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__DOCUMENTATION = FEATURE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__TITLE = FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__RELATIONSHIP = FEATURE__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__NAMESPACE = FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__MEMBER_OF_NAMESPACE = FEATURE__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__SOURCE_RELATIONSHIP = FEATURE__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__TARGET_RELATIONSHIP = FEATURE__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__OWNED_COMMENT = FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__PACKAGE_VISIBILITY = FEATURE__PACKAGE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__UPPER = FEATURE__UPPER;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__LOWER = FEATURE__LOWER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__CLASS = FEATURE__CLASS;

	/**
	 * The feature id for the '<em><b>Redefined Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__REDEFINED_FEATURE = FEATURE__REDEFINED_FEATURE;

	/**
	 * The feature id for the '<em><b>Subsetted Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__SUBSETTED_FEATURE = FEATURE__SUBSETTED_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__IS_DERIVED = FEATURE__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__IS_READ_ONLY = FEATURE__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Method Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__METHOD_VISIBILITY = FEATURE__METHOD_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__CONTEXT = FEATURE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__FEATURE_PATH = FEATURE__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Nesting Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__NESTING_FEATURE = FEATURE__NESTING_FEATURE;

	/**
	 * The feature id for the '<em><b>Nested Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__NESTED_FEATURE = FEATURE__NESTED_FEATURE;

	/**
	 * The feature id for the '<em><b>Defining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__DEFINING_TYPE = FEATURE__DEFINING_TYPE;

	/**
	 * The feature id for the '<em><b>Refining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__REFINING_TYPE = FEATURE__REFINING_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__FEATURING_CLASSIFIER = FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__DATA_TYPE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__DEFAULT_VALUE = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl <em>Structured Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.StructuredClassImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getStructuredClass()
	 * @generated
	 */
	int STRUCTURED_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__DOCUMENTATION = CLASS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__OWNER = CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__TITLE = CLASS__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__RELATIONSHIP = CLASS__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__NAMESPACE = CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__MEMBER_OF_NAMESPACE = CLASS__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__SOURCE_RELATIONSHIP = CLASS__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__TARGET_RELATIONSHIP = CLASS__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__OWNED_COMMENT = CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__OWNED_ELEMENT = CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__PACKAGE_VISIBILITY = CLASS__PACKAGE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__OWNED_MEMBER = CLASS__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__MEMBER = CLASS__MEMBER;

	/**
	 * The feature id for the '<em><b>Specific Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__SPECIFIC_CLASSIFIER = CLASS__SPECIFIC_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>General Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__GENERAL_CLASSIFIER = CLASS__GENERAL_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__OWNED_FEATURE = CLASS__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__IS_ABSTRACT = CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__INHERITED_FEATURE = CLASS__INHERITED_FEATURE;

	/**
	 * The feature id for the '<em><b>Types Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__TYPES_FEATURE = CLASS__TYPES_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__FEATURE = CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__INSTANCE_OF = CLASS__INSTANCE_OF;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__GENERALIZATION = CLASS__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Nested Feature Of Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__NESTED_FEATURE_OF_CLASS = CLASS__NESTED_FEATURE_OF_CLASS;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__OUTPUT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__INPUT = CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__REQUIRED_PROPERTY = CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provided Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__PROVIDED_PROPERTY = CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__IS_ENCAPSULATED = CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Conjugate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__CONJUGATE = CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__OWNED_CONNECTOR = CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Structured Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__OWNED_STRUCTURED_FEATURE = CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Types Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__TYPES_PROPERTY = CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Blind Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__BLIND_PROPERTY = CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Port Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__PORT_PROPERTY = CLASS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Proxy Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__PROXY_PORT = CLASS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Self Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__SELF_PORT = CLASS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Full Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__FULL_PORT = CLASS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Interaction Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS__INTERACTION_PARTICIPANT = CLASS_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Structured Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Structured Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_CLASS_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.GeneralizationSetImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getGeneralizationSet()
	 * @generated
	 */
	int GENERALIZATION_SET = 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__DOCUMENTATION = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__OWNER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__TITLE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__NAME = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__NAMESPACE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__MEMBER_OF_NAMESPACE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__SOURCE_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__TARGET_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__OWNED_COMMENT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__OWNED_ELEMENT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__SOURCE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__RELATED = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__TARGET = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__COMPLETE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_FEATURE_COUNT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_OPERATION_COUNT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.BindingImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 11;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__DOCUMENTATION = CONNECTOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OWNER = CONNECTOR__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TITLE = CONNECTOR__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__RELATIONSHIP = CONNECTOR__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NAMESPACE = CONNECTOR__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__MEMBER_OF_NAMESPACE = CONNECTOR__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SOURCE_RELATIONSHIP = CONNECTOR__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TARGET_RELATIONSHIP = CONNECTOR__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OWNED_COMMENT = CONNECTOR__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OWNED_ELEMENT = CONNECTOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SOURCE = CONNECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__RELATED = CONNECTOR__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TARGET = CONNECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PACKAGE_VISIBILITY = CONNECTOR__PACKAGE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OWNED_MEMBER = CONNECTOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__MEMBER = CONNECTOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TYPE = CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__UPPER = CONNECTOR__UPPER;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__LOWER = CONNECTOR__LOWER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__CLASS = CONNECTOR__CLASS;

	/**
	 * The feature id for the '<em><b>Redefined Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__REDEFINED_FEATURE = CONNECTOR__REDEFINED_FEATURE;

	/**
	 * The feature id for the '<em><b>Subsetted Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SUBSETTED_FEATURE = CONNECTOR__SUBSETTED_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__IS_DERIVED = CONNECTOR__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__IS_UNIQUE = CONNECTOR__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__IS_READ_ONLY = CONNECTOR__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__IS_ORDERED = CONNECTOR__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Method Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__METHOD_VISIBILITY = CONNECTOR__METHOD_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__CONTEXT = CONNECTOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Feature Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__FEATURE_PATH = CONNECTOR__FEATURE_PATH;

	/**
	 * The feature id for the '<em><b>Nesting Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NESTING_FEATURE = CONNECTOR__NESTING_FEATURE;

	/**
	 * The feature id for the '<em><b>Nested Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NESTED_FEATURE = CONNECTOR__NESTED_FEATURE;

	/**
	 * The feature id for the '<em><b>Defining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__DEFINING_TYPE = CONNECTOR__DEFINING_TYPE;

	/**
	 * The feature id for the '<em><b>Refining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__REFINING_TYPE = CONNECTOR__REFINING_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OWNED_TYPE = CONNECTOR__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__FEATURING_CLASSIFIER = CONNECTOR__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__IS_PORT = CONNECTOR__IS_PORT;

	/**
	 * The feature id for the '<em><b>Outside Access</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OUTSIDE_ACCESS = CONNECTOR__OUTSIDE_ACCESS;

	/**
	 * The feature id for the '<em><b>Inside Access</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__INSIDE_ACCESS = CONNECTOR__INSIDE_ACCESS;

	/**
	 * The feature id for the '<em><b>Union</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__UNION = CONNECTOR__UNION;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OPTION = CONNECTOR__OPTION;

	/**
	 * The feature id for the '<em><b>Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__IS_NAVIGABLE = CONNECTOR__IS_NAVIGABLE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__AGGREGATION = CONNECTOR__AGGREGATION;

	/**
	 * The feature id for the '<em><b>End Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__END_OF = CONNECTOR__END_OF;

	/**
	 * The feature id for the '<em><b>Participates In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PARTICIPATES_IN = CONNECTOR__PARTICIPATES_IN;

	/**
	 * The feature id for the '<em><b>Is Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__IS_INPUT = CONNECTOR__IS_INPUT;

	/**
	 * The feature id for the '<em><b>Is Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__IS_OUTPUT = CONNECTOR__IS_OUTPUT;

	/**
	 * The feature id for the '<em><b>Source Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SOURCE_PATH = CONNECTOR__SOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Target Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TARGET_PATH = CONNECTOR__TARGET_PATH;

	/**
	 * The feature id for the '<em><b>Is Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__IS_DIRECTED = CONNECTOR__IS_DIRECTED;

	/**
	 * The feature id for the '<em><b>Source Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SOURCE_UPPER = CONNECTOR__SOURCE_UPPER;

	/**
	 * The feature id for the '<em><b>Source Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SOURCE_LOWER = CONNECTOR__SOURCE_LOWER;

	/**
	 * The feature id for the '<em><b>Target Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TARGET_UPPER = CONNECTOR__TARGET_UPPER;

	/**
	 * The feature id for the '<em><b>Target Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TARGET_LOWER = CONNECTOR__TARGET_LOWER;

	/**
	 * The feature id for the '<em><b>Source Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SOURCE_MULTIPLICITY = CONNECTOR__SOURCE_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Target Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TARGET_MULTIPLICITY = CONNECTOR__TARGET_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__VALUE = CONNECTOR__VALUE;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.ValueRestrictionImpl <em>Value Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.ValueRestrictionImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getValueRestriction()
	 * @generated
	 */
	int VALUE_RESTRICTION = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__DOCUMENTATION = CLASS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__OWNER = CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__TITLE = CLASS__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__RELATIONSHIP = CLASS__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__NAMESPACE = CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__MEMBER_OF_NAMESPACE = CLASS__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__SOURCE_RELATIONSHIP = CLASS__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__TARGET_RELATIONSHIP = CLASS__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__OWNED_COMMENT = CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__OWNED_ELEMENT = CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__PACKAGE_VISIBILITY = CLASS__PACKAGE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__OWNED_MEMBER = CLASS__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__MEMBER = CLASS__MEMBER;

	/**
	 * The feature id for the '<em><b>Specific Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__SPECIFIC_CLASSIFIER = CLASS__SPECIFIC_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>General Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__GENERAL_CLASSIFIER = CLASS__GENERAL_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__OWNED_FEATURE = CLASS__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__IS_ABSTRACT = CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__INHERITED_FEATURE = CLASS__INHERITED_FEATURE;

	/**
	 * The feature id for the '<em><b>Types Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__TYPES_FEATURE = CLASS__TYPES_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__FEATURE = CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__INSTANCE_OF = CLASS__INSTANCE_OF;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__GENERALIZATION = CLASS__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Nested Feature Of Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION__NESTED_FEATURE_OF_CLASS = CLASS__NESTED_FEATURE_OF_CLASS;

	/**
	 * The number of structural features of the '<em>Value Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESTRICTION_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.DataTypeImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DOCUMENTATION = CLASS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNER = CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TITLE = CLASS__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__RELATIONSHIP = CLASS__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAMESPACE = CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MEMBER_OF_NAMESPACE = CLASS__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SOURCE_RELATIONSHIP = CLASS__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TARGET_RELATIONSHIP = CLASS__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_COMMENT = CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_ELEMENT = CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PACKAGE_VISIBILITY = CLASS__PACKAGE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_MEMBER = CLASS__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MEMBER = CLASS__MEMBER;

	/**
	 * The feature id for the '<em><b>Specific Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SPECIFIC_CLASSIFIER = CLASS__SPECIFIC_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>General Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__GENERAL_CLASSIFIER = CLASS__GENERAL_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_FEATURE = CLASS__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_ABSTRACT = CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INHERITED_FEATURE = CLASS__INHERITED_FEATURE;

	/**
	 * The feature id for the '<em><b>Types Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TYPES_FEATURE = CLASS__TYPES_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FEATURE = CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INSTANCE_OF = CLASS__INSTANCE_OF;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__GENERALIZATION = CLASS__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Nested Feature Of Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NESTED_FEATURE_OF_CLASS = CLASS__NESTED_FEATURE_OF_CLASS;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.FeaturePathNodeImpl <em>Feature Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.FeaturePathNodeImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getFeaturePathNode()
	 * @generated
	 */
	int FEATURE_PATH_NODE = 14;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_NODE__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Feature Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATH_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.IndividualImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 15;

	/**
	 * The feature id for the '<em><b>Defining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__DEFINING_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__CHILD = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__CONTEXT = 3;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.impl.RestrictsImpl <em>Restricts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.impl.RestrictsImpl
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getRestricts()
	 * @generated
	 */
	int RESTRICTS = 16;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__DOCUMENTATION = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__OWNER = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__TITLE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__NAME = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__NAMESPACE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__MEMBER_OF_NAMESPACE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__SOURCE_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__TARGET_RELATIONSHIP = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__OWNED_COMMENT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__OWNED_ELEMENT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__SOURCE = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__RELATED = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__TARGET = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__GENERAL = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__SPECIFIC = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__RESTRICTED = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Restricted By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS__RESTRICTED_BY = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Restricts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS_FEATURE_COUNT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Restricts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTS_OPERATION_COUNT = org.omg.sysml.kerml.core.CorePackage.RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.PropertyAccessKind <em>Property Access Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.PropertyAccessKind
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getPropertyAccessKind()
	 * @generated
	 */
	int PROPERTY_ACCESS_KIND = 17;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.structure.AggregationKind <em>Aggregation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.structure.AggregationKind
	 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getAggregationKind()
	 * @generated
	 */
	int AGGREGATION_KIND = 18;


	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.omg.sysml.kerml.structure.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Class#getSpecificClassifier <em>Specific Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specific Classifier</em>'.
	 * @see org.omg.sysml.kerml.structure.Class#getSpecificClassifier()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SpecificClassifier();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Class#getGeneralClassifier <em>General Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General Classifier</em>'.
	 * @see org.omg.sysml.kerml.structure.Class#getGeneralClassifier()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_GeneralClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.Class#getOwnedFeature <em>Owned Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.Class#getOwnedFeature()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Class#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.omg.sysml.kerml.structure.Class#isIsAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsAbstract();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Class#getInheritedFeature <em>Inherited Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.Class#getInheritedFeature()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_InheritedFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Class#getTypesFeature <em>Types Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.Class#getTypesFeature()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_TypesFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Class#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.Class#getFeature()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Feature();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Class#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see org.omg.sysml.kerml.structure.Class#getInstanceOf()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_InstanceOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.Class#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalization</em>'.
	 * @see org.omg.sysml.kerml.structure.Class#getGeneralization()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Generalization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.Class#getNestedFeatureOfClass <em>Nested Feature Of Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Feature Of Class</em>'.
	 * @see org.omg.sysml.kerml.structure.Class#getNestedFeatureOfClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_NestedFeatureOfClass();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.omg.sysml.kerml.structure.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Association#getTargetEndProperty <em>Target End Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target End Property</em>'.
	 * @see org.omg.sysml.kerml.structure.Association#getTargetEndProperty()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_TargetEndProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.kerml.structure.Association#getTargetParticipantProperty <em>Target Participant Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Participant Property</em>'.
	 * @see org.omg.sysml.kerml.structure.Association#getTargetParticipantProperty()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_TargetParticipantProperty();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Association#getSourceEndProperty <em>Source End Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source End Property</em>'.
	 * @see org.omg.sysml.kerml.structure.Association#getSourceEndProperty()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_SourceEndProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.kerml.structure.Association#getSourceParticipantProperty <em>Source Participant Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Participant Property</em>'.
	 * @see org.omg.sysml.kerml.structure.Association#getSourceParticipantProperty()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_SourceParticipantProperty();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Association#getParticipantProperty <em>Participant Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Property</em>'.
	 * @see org.omg.sysml.kerml.structure.Association#getParticipantProperty()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_ParticipantProperty();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Association#getEndProperty <em>End Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Property</em>'.
	 * @see org.omg.sysml.kerml.structure.Association#getEndProperty()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_EndProperty();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Association#getTypesConnector <em>Types Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types Connector</em>'.
	 * @see org.omg.sysml.kerml.structure.Association#getTypesConnector()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_TypesConnector();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Feature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Feature#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getUpper()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Upper();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Feature#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getLower()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Lower();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.kerml.structure.Feature#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Class</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getClass_()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Class();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Feature#getRedefinedFeature <em>Redefined Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getRedefinedFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RedefinedFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Feature#getSubsettedFeature <em>Subsetted Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsetted Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getSubsettedFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SubsettedFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Feature#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#isIsDerived()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Feature#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#isIsUnique()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Feature#isIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#isIsReadOnly()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Feature#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#isIsOrdered()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Feature#getMethodVisibility <em>Method Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Visibility</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getMethodVisibility()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_MethodVisibility();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.kerml.structure.Feature#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getContext()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.Feature#getFeaturePath <em>Feature Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Path</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getFeaturePath()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeaturePath();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.kerml.structure.Feature#getNestingFeature <em>Nesting Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Nesting Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getNestingFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_NestingFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.Feature#getNestedFeature <em>Nested Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getNestedFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_NestedFeature();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Feature#getDefiningType <em>Defining Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defining Type</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getDefiningType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_DefiningType();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Feature#getRefiningType <em>Refining Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refining Type</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getRefiningType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RefiningType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.Feature#getOwnedType <em>Owned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Type</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getOwnedType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwnedType();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Featuring Classifier</em>'.
	 * @see org.omg.sysml.kerml.structure.Feature#getFeaturingClassifier()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeaturingClassifier();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see org.omg.sysml.kerml.structure.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see org.omg.sysml.kerml.structure.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_General();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.kerml.structure.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specific</em>'.
	 * @see org.omg.sysml.kerml.structure.Generalization#getSpecific()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Specific();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.omg.sysml.kerml.structure.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Connector#getSourcePath <em>Source Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Path</em>'.
	 * @see org.omg.sysml.kerml.structure.Connector#getSourcePath()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_SourcePath();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Connector#getTargetPath <em>Target Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Path</em>'.
	 * @see org.omg.sysml.kerml.structure.Connector#getTargetPath()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_TargetPath();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Connector#isIsDirected <em>Is Directed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Directed</em>'.
	 * @see org.omg.sysml.kerml.structure.Connector#isIsDirected()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsDirected();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Connector#getSourceUpper <em>Source Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Upper</em>'.
	 * @see org.omg.sysml.kerml.structure.Connector#getSourceUpper()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceUpper();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Connector#getSourceLower <em>Source Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Lower</em>'.
	 * @see org.omg.sysml.kerml.structure.Connector#getSourceLower()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceLower();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Connector#getTargetUpper <em>Target Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Upper</em>'.
	 * @see org.omg.sysml.kerml.structure.Connector#getTargetUpper()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_TargetUpper();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Connector#getTargetLower <em>Target Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Lower</em>'.
	 * @see org.omg.sysml.kerml.structure.Connector#getTargetLower()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_TargetLower();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Connector#getSourceMultiplicity <em>Source Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Multiplicity</em>'.
	 * @see org.omg.sysml.kerml.structure.Connector#getSourceMultiplicity()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SourceMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.Connector#getTargetMultiplicity <em>Target Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Multiplicity</em>'.
	 * @see org.omg.sysml.kerml.structure.Connector#getTargetMultiplicity()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_TargetMultiplicity();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Connector#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.omg.sysml.kerml.structure.Connector#getValue()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.StructuredFeature <em>Structured Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredFeature
	 * @generated
	 */
	EClass getStructuredFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.StructuredFeature#isIsPort <em>Is Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Port</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#isIsPort()
	 * @see #getStructuredFeature()
	 * @generated
	 */
	EAttribute getStructuredFeature_IsPort();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.sysml.kerml.structure.StructuredFeature#getOutsideAccess <em>Outside Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Outside Access</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#getOutsideAccess()
	 * @see #getStructuredFeature()
	 * @generated
	 */
	EAttribute getStructuredFeature_OutsideAccess();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.sysml.kerml.structure.StructuredFeature#getInsideAccess <em>Inside Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inside Access</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#getInsideAccess()
	 * @see #getStructuredFeature()
	 * @generated
	 */
	EAttribute getStructuredFeature_InsideAccess();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.StructuredFeature#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Union</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#getUnion()
	 * @see #getStructuredFeature()
	 * @generated
	 */
	EReference getStructuredFeature_Union();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.kerml.structure.StructuredFeature#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#getOption()
	 * @see #getStructuredFeature()
	 * @generated
	 */
	EReference getStructuredFeature_Option();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.StructuredFeature#isIsNavigable <em>Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Navigable</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#isIsNavigable()
	 * @see #getStructuredFeature()
	 * @generated
	 */
	EAttribute getStructuredFeature_IsNavigable();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.StructuredFeature#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#getAggregation()
	 * @see #getStructuredFeature()
	 * @generated
	 */
	EAttribute getStructuredFeature_Aggregation();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.StructuredFeature#getEndOf <em>End Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Of</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#getEndOf()
	 * @see #getStructuredFeature()
	 * @generated
	 */
	EReference getStructuredFeature_EndOf();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.StructuredFeature#getParticipatesIn <em>Participates In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participates In</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#getParticipatesIn()
	 * @see #getStructuredFeature()
	 * @generated
	 */
	EReference getStructuredFeature_ParticipatesIn();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.StructuredFeature#isIsInput <em>Is Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Input</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#isIsInput()
	 * @see #getStructuredFeature()
	 * @generated
	 */
	EAttribute getStructuredFeature_IsInput();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.StructuredFeature#isIsOutput <em>Is Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Output</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#isIsOutput()
	 * @see #getStructuredFeature()
	 * @generated
	 */
	EAttribute getStructuredFeature_IsOutput();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.RefinedAssociation <em>Refined Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refined Association</em>'.
	 * @see org.omg.sysml.kerml.structure.RefinedAssociation
	 * @generated
	 */
	EClass getRefinedAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.RefinedAssociation#getDefiningConnector <em>Defining Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defining Connector</em>'.
	 * @see org.omg.sysml.kerml.structure.RefinedAssociation#getDefiningConnector()
	 * @see #getRefinedAssociation()
	 * @generated
	 */
	EReference getRefinedAssociation_DefiningConnector();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.RefinedAssociation#getInstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of</em>'.
	 * @see org.omg.sysml.kerml.structure.RefinedAssociation#getInstanceOf()
	 * @see #getRefinedAssociation()
	 * @generated
	 */
	EReference getRefinedAssociation_InstanceOf();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.ValueOption <em>Value Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Option</em>'.
	 * @see org.omg.sysml.kerml.structure.ValueOption
	 * @generated
	 */
	EClass getValueOption();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.ValueOption#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Option</em>'.
	 * @see org.omg.sysml.kerml.structure.ValueOption#getOption()
	 * @see #getValueOption()
	 * @generated
	 */
	EReference getValueOption_Option();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.kerml.structure.ValueOption#getOptionOfProperty <em>Option Of Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Option Of Property</em>'.
	 * @see org.omg.sysml.kerml.structure.ValueOption#getOptionOfProperty()
	 * @see #getValueOption()
	 * @generated
	 */
	EReference getValueOption_OptionOfProperty();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.DataFeature <em>Data Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.DataFeature
	 * @generated
	 */
	EClass getDataFeature();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.DataFeature#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.omg.sysml.kerml.structure.DataFeature#getDataType()
	 * @see #getDataFeature()
	 * @generated
	 */
	EReference getDataFeature_DataType();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.DataFeature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see org.omg.sysml.kerml.structure.DataFeature#getValue()
	 * @see #getDataFeature()
	 * @generated
	 */
	EReference getDataFeature_Value();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.DataFeature#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Value</em>'.
	 * @see org.omg.sysml.kerml.structure.DataFeature#getDefaultValue()
	 * @see #getDataFeature()
	 * @generated
	 */
	EReference getDataFeature_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.StructuredClass <em>Structured Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Class</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass
	 * @generated
	 */
	EClass getStructuredClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getOutput()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getInput()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_Input();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getRequiredProperty <em>Required Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Property</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getRequiredProperty()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_RequiredProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getProvidedProperty <em>Provided Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Property</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getProvidedProperty()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_ProvidedProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.structure.StructuredClass#isIsEncapsulated <em>Is Encapsulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Encapsulated</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#isIsEncapsulated()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EAttribute getStructuredClass_IsEncapsulated();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.StructuredClass#getConjugate <em>Conjugate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conjugate</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getConjugate()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_Conjugate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getOwnedConnector <em>Owned Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Connector</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getOwnedConnector()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_OwnedConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getOwnedStructuredFeature <em>Owned Structured Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Structured Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getOwnedStructuredFeature()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_OwnedStructuredFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getTypesProperty <em>Types Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types Property</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getTypesProperty()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_TypesProperty();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getBlindProperty <em>Blind Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blind Property</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getBlindProperty()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_BlindProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getPortProperty <em>Port Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Property</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getPortProperty()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_PortProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getProxyPort <em>Proxy Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proxy Port</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getProxyPort()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_ProxyPort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getSelfPort <em>Self Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Self Port</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getSelfPort()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_SelfPort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getFullPort <em>Full Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Full Port</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getFullPort()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_FullPort();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.StructuredClass#getInteractionParticipant <em>Interaction Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Participant</em>'.
	 * @see org.omg.sysml.kerml.structure.StructuredClass#getInteractionParticipant()
	 * @see #getStructuredClass()
	 * @generated
	 */
	EReference getStructuredClass_InteractionParticipant();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Set</em>'.
	 * @see org.omg.sysml.kerml.structure.GeneralizationSet
	 * @generated
	 */
	EClass getGeneralizationSet();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.GeneralizationSet#getComplete <em>Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complete</em>'.
	 * @see org.omg.sysml.kerml.structure.GeneralizationSet#getComplete()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_Complete();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see org.omg.sysml.kerml.structure.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.ValueRestriction <em>Value Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Restriction</em>'.
	 * @see org.omg.sysml.kerml.structure.ValueRestriction
	 * @generated
	 */
	EClass getValueRestriction();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.omg.sysml.kerml.structure.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.FeaturePathNode <em>Feature Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Path Node</em>'.
	 * @see org.omg.sysml.kerml.structure.FeaturePathNode
	 * @generated
	 */
	EClass getFeaturePathNode();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.FeaturePathNode#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.FeaturePathNode#getFeature()
	 * @see #getFeaturePathNode()
	 * @generated
	 */
	EReference getFeaturePathNode_Feature();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see org.omg.sysml.kerml.structure.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Individual#getDefiningFeature <em>Defining Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defining Feature</em>'.
	 * @see org.omg.sysml.kerml.structure.Individual#getDefiningFeature()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_DefiningFeature();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Individual#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.omg.sysml.kerml.structure.Individual#getParent()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_Parent();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.structure.Individual#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see org.omg.sysml.kerml.structure.Individual#getChild()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_Child();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Individual#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.omg.sysml.kerml.structure.Individual#getContext()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_Context();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.structure.Restricts <em>Restricts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restricts</em>'.
	 * @see org.omg.sysml.kerml.structure.Restricts
	 * @generated
	 */
	EClass getRestricts();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Restricts#getRestricted <em>Restricted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Restricted</em>'.
	 * @see org.omg.sysml.kerml.structure.Restricts#getRestricted()
	 * @see #getRestricts()
	 * @generated
	 */
	EReference getRestricts_Restricted();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.structure.Restricts#getRestrictedBy <em>Restricted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Restricted By</em>'.
	 * @see org.omg.sysml.kerml.structure.Restricts#getRestrictedBy()
	 * @see #getRestricts()
	 * @generated
	 */
	EReference getRestricts_RestrictedBy();

	/**
	 * Returns the meta object for enum '{@link org.omg.sysml.kerml.structure.PropertyAccessKind <em>Property Access Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Access Kind</em>'.
	 * @see org.omg.sysml.kerml.structure.PropertyAccessKind
	 * @generated
	 */
	EEnum getPropertyAccessKind();

	/**
	 * Returns the meta object for enum '{@link org.omg.sysml.kerml.structure.AggregationKind <em>Aggregation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Kind</em>'.
	 * @see org.omg.sysml.kerml.structure.AggregationKind
	 * @generated
	 */
	EEnum getAggregationKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructureFactory getStructureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.ClassImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Specific Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SPECIFIC_CLASSIFIER = eINSTANCE.getClass_SpecificClassifier();

		/**
		 * The meta object literal for the '<em><b>General Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__GENERAL_CLASSIFIER = eINSTANCE.getClass_GeneralClassifier();

		/**
		 * The meta object literal for the '<em><b>Owned Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_FEATURE = eINSTANCE.getClass_OwnedFeature();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_ABSTRACT = eINSTANCE.getClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Inherited Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INHERITED_FEATURE = eINSTANCE.getClass_InheritedFeature();

		/**
		 * The meta object literal for the '<em><b>Types Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__TYPES_FEATURE = eINSTANCE.getClass_TypesFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__FEATURE = eINSTANCE.getClass_Feature();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INSTANCE_OF = eINSTANCE.getClass_InstanceOf();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__GENERALIZATION = eINSTANCE.getClass_Generalization();

		/**
		 * The meta object literal for the '<em><b>Nested Feature Of Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__NESTED_FEATURE_OF_CLASS = eINSTANCE.getClass_NestedFeatureOfClass();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.AssociationImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Target End Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET_END_PROPERTY = eINSTANCE.getAssociation_TargetEndProperty();

		/**
		 * The meta object literal for the '<em><b>Target Participant Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET_PARTICIPANT_PROPERTY = eINSTANCE.getAssociation_TargetParticipantProperty();

		/**
		 * The meta object literal for the '<em><b>Source End Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE_END_PROPERTY = eINSTANCE.getAssociation_SourceEndProperty();

		/**
		 * The meta object literal for the '<em><b>Source Participant Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE_PARTICIPANT_PROPERTY = eINSTANCE.getAssociation_SourceParticipantProperty();

		/**
		 * The meta object literal for the '<em><b>Participant Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__PARTICIPANT_PROPERTY = eINSTANCE.getAssociation_ParticipantProperty();

		/**
		 * The meta object literal for the '<em><b>End Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__END_PROPERTY = eINSTANCE.getAssociation_EndProperty();

		/**
		 * The meta object literal for the '<em><b>Types Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TYPES_CONNECTOR = eINSTANCE.getAssociation_TypesConnector();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.FeatureImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__UPPER = eINSTANCE.getFeature_Upper();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__LOWER = eINSTANCE.getFeature_Lower();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CLASS = eINSTANCE.getFeature_Class();

		/**
		 * The meta object literal for the '<em><b>Redefined Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REDEFINED_FEATURE = eINSTANCE.getFeature_RedefinedFeature();

		/**
		 * The meta object literal for the '<em><b>Subsetted Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SUBSETTED_FEATURE = eINSTANCE.getFeature_SubsettedFeature();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_DERIVED = eINSTANCE.getFeature_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_UNIQUE = eINSTANCE.getFeature_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_READ_ONLY = eINSTANCE.getFeature_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_ORDERED = eINSTANCE.getFeature_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Method Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__METHOD_VISIBILITY = eINSTANCE.getFeature_MethodVisibility();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CONTEXT = eINSTANCE.getFeature_Context();

		/**
		 * The meta object literal for the '<em><b>Feature Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURE_PATH = eINSTANCE.getFeature_FeaturePath();

		/**
		 * The meta object literal for the '<em><b>Nesting Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__NESTING_FEATURE = eINSTANCE.getFeature_NestingFeature();

		/**
		 * The meta object literal for the '<em><b>Nested Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__NESTED_FEATURE = eINSTANCE.getFeature_NestedFeature();

		/**
		 * The meta object literal for the '<em><b>Defining Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__DEFINING_TYPE = eINSTANCE.getFeature_DefiningType();

		/**
		 * The meta object literal for the '<em><b>Refining Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REFINING_TYPE = eINSTANCE.getFeature_RefiningType();

		/**
		 * The meta object literal for the '<em><b>Owned Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OWNED_TYPE = eINSTANCE.getFeature_OwnedType();

		/**
		 * The meta object literal for the '<em><b>Featuring Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURING_CLASSIFIER = eINSTANCE.getFeature_FeaturingClassifier();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.GeneralizationImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

		/**
		 * The meta object literal for the '<em><b>Specific</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.ConnectorImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Source Path</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE_PATH = eINSTANCE.getConnector_SourcePath();

		/**
		 * The meta object literal for the '<em><b>Target Path</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET_PATH = eINSTANCE.getConnector_TargetPath();

		/**
		 * The meta object literal for the '<em><b>Is Directed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__IS_DIRECTED = eINSTANCE.getConnector_IsDirected();

		/**
		 * The meta object literal for the '<em><b>Source Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_UPPER = eINSTANCE.getConnector_SourceUpper();

		/**
		 * The meta object literal for the '<em><b>Source Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_LOWER = eINSTANCE.getConnector_SourceLower();

		/**
		 * The meta object literal for the '<em><b>Target Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TARGET_UPPER = eINSTANCE.getConnector_TargetUpper();

		/**
		 * The meta object literal for the '<em><b>Target Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TARGET_LOWER = eINSTANCE.getConnector_TargetLower();

		/**
		 * The meta object literal for the '<em><b>Source Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SOURCE_MULTIPLICITY = eINSTANCE.getConnector_SourceMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Target Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TARGET_MULTIPLICITY = eINSTANCE.getConnector_TargetMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__VALUE = eINSTANCE.getConnector_Value();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl <em>Structured Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getStructuredFeature()
		 * @generated
		 */
		EClass STRUCTURED_FEATURE = eINSTANCE.getStructuredFeature();

		/**
		 * The meta object literal for the '<em><b>Is Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_FEATURE__IS_PORT = eINSTANCE.getStructuredFeature_IsPort();

		/**
		 * The meta object literal for the '<em><b>Outside Access</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_FEATURE__OUTSIDE_ACCESS = eINSTANCE.getStructuredFeature_OutsideAccess();

		/**
		 * The meta object literal for the '<em><b>Inside Access</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_FEATURE__INSIDE_ACCESS = eINSTANCE.getStructuredFeature_InsideAccess();

		/**
		 * The meta object literal for the '<em><b>Union</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_FEATURE__UNION = eINSTANCE.getStructuredFeature_Union();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_FEATURE__OPTION = eINSTANCE.getStructuredFeature_Option();

		/**
		 * The meta object literal for the '<em><b>Is Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_FEATURE__IS_NAVIGABLE = eINSTANCE.getStructuredFeature_IsNavigable();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_FEATURE__AGGREGATION = eINSTANCE.getStructuredFeature_Aggregation();

		/**
		 * The meta object literal for the '<em><b>End Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_FEATURE__END_OF = eINSTANCE.getStructuredFeature_EndOf();

		/**
		 * The meta object literal for the '<em><b>Participates In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_FEATURE__PARTICIPATES_IN = eINSTANCE.getStructuredFeature_ParticipatesIn();

		/**
		 * The meta object literal for the '<em><b>Is Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_FEATURE__IS_INPUT = eINSTANCE.getStructuredFeature_IsInput();

		/**
		 * The meta object literal for the '<em><b>Is Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_FEATURE__IS_OUTPUT = eINSTANCE.getStructuredFeature_IsOutput();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.RefinedAssociationImpl <em>Refined Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.RefinedAssociationImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getRefinedAssociation()
		 * @generated
		 */
		EClass REFINED_ASSOCIATION = eINSTANCE.getRefinedAssociation();

		/**
		 * The meta object literal for the '<em><b>Defining Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINED_ASSOCIATION__DEFINING_CONNECTOR = eINSTANCE.getRefinedAssociation_DefiningConnector();

		/**
		 * The meta object literal for the '<em><b>Instance Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINED_ASSOCIATION__INSTANCE_OF = eINSTANCE.getRefinedAssociation_InstanceOf();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.ValueOptionImpl <em>Value Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.ValueOptionImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getValueOption()
		 * @generated
		 */
		EClass VALUE_OPTION = eINSTANCE.getValueOption();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OPTION__OPTION = eINSTANCE.getValueOption_Option();

		/**
		 * The meta object literal for the '<em><b>Option Of Property</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OPTION__OPTION_OF_PROPERTY = eINSTANCE.getValueOption_OptionOfProperty();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.DataFeatureImpl <em>Data Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.DataFeatureImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getDataFeature()
		 * @generated
		 */
		EClass DATA_FEATURE = eINSTANCE.getDataFeature();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FEATURE__DATA_TYPE = eINSTANCE.getDataFeature_DataType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FEATURE__VALUE = eINSTANCE.getDataFeature_Value();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FEATURE__DEFAULT_VALUE = eINSTANCE.getDataFeature_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl <em>Structured Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.StructuredClassImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getStructuredClass()
		 * @generated
		 */
		EClass STRUCTURED_CLASS = eINSTANCE.getStructuredClass();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__OUTPUT = eINSTANCE.getStructuredClass_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__INPUT = eINSTANCE.getStructuredClass_Input();

		/**
		 * The meta object literal for the '<em><b>Required Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__REQUIRED_PROPERTY = eINSTANCE.getStructuredClass_RequiredProperty();

		/**
		 * The meta object literal for the '<em><b>Provided Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__PROVIDED_PROPERTY = eINSTANCE.getStructuredClass_ProvidedProperty();

		/**
		 * The meta object literal for the '<em><b>Is Encapsulated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_CLASS__IS_ENCAPSULATED = eINSTANCE.getStructuredClass_IsEncapsulated();

		/**
		 * The meta object literal for the '<em><b>Conjugate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__CONJUGATE = eINSTANCE.getStructuredClass_Conjugate();

		/**
		 * The meta object literal for the '<em><b>Owned Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__OWNED_CONNECTOR = eINSTANCE.getStructuredClass_OwnedConnector();

		/**
		 * The meta object literal for the '<em><b>Owned Structured Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__OWNED_STRUCTURED_FEATURE = eINSTANCE.getStructuredClass_OwnedStructuredFeature();

		/**
		 * The meta object literal for the '<em><b>Types Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__TYPES_PROPERTY = eINSTANCE.getStructuredClass_TypesProperty();

		/**
		 * The meta object literal for the '<em><b>Blind Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__BLIND_PROPERTY = eINSTANCE.getStructuredClass_BlindProperty();

		/**
		 * The meta object literal for the '<em><b>Port Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__PORT_PROPERTY = eINSTANCE.getStructuredClass_PortProperty();

		/**
		 * The meta object literal for the '<em><b>Proxy Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__PROXY_PORT = eINSTANCE.getStructuredClass_ProxyPort();

		/**
		 * The meta object literal for the '<em><b>Self Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__SELF_PORT = eINSTANCE.getStructuredClass_SelfPort();

		/**
		 * The meta object literal for the '<em><b>Full Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__FULL_PORT = eINSTANCE.getStructuredClass_FullPort();

		/**
		 * The meta object literal for the '<em><b>Interaction Participant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_CLASS__INTERACTION_PARTICIPANT = eINSTANCE.getStructuredClass_InteractionParticipant();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.GeneralizationSetImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getGeneralizationSet()
		 * @generated
		 */
		EClass GENERALIZATION_SET = eINSTANCE.getGeneralizationSet();

		/**
		 * The meta object literal for the '<em><b>Complete</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__COMPLETE = eINSTANCE.getGeneralizationSet_Complete();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.BindingImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.ValueRestrictionImpl <em>Value Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.ValueRestrictionImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getValueRestriction()
		 * @generated
		 */
		EClass VALUE_RESTRICTION = eINSTANCE.getValueRestriction();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.DataTypeImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.FeaturePathNodeImpl <em>Feature Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.FeaturePathNodeImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getFeaturePathNode()
		 * @generated
		 */
		EClass FEATURE_PATH_NODE = eINSTANCE.getFeaturePathNode();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PATH_NODE__FEATURE = eINSTANCE.getFeaturePathNode_Feature();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.IndividualImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '<em><b>Defining Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__DEFINING_FEATURE = eINSTANCE.getIndividual_DefiningFeature();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__PARENT = eINSTANCE.getIndividual_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__CHILD = eINSTANCE.getIndividual_Child();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__CONTEXT = eINSTANCE.getIndividual_Context();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.impl.RestrictsImpl <em>Restricts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.impl.RestrictsImpl
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getRestricts()
		 * @generated
		 */
		EClass RESTRICTS = eINSTANCE.getRestricts();

		/**
		 * The meta object literal for the '<em><b>Restricted</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTS__RESTRICTED = eINSTANCE.getRestricts_Restricted();

		/**
		 * The meta object literal for the '<em><b>Restricted By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTS__RESTRICTED_BY = eINSTANCE.getRestricts_RestrictedBy();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.PropertyAccessKind <em>Property Access Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.PropertyAccessKind
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getPropertyAccessKind()
		 * @generated
		 */
		EEnum PROPERTY_ACCESS_KIND = eINSTANCE.getPropertyAccessKind();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.structure.AggregationKind <em>Aggregation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.structure.AggregationKind
		 * @see org.omg.sysml.kerml.structure.impl.StructurePackageImpl#getAggregationKind()
		 * @generated
		 */
		EEnum AGGREGATION_KIND = eINSTANCE.getAggregationKind();

	}

} //StructurePackage
