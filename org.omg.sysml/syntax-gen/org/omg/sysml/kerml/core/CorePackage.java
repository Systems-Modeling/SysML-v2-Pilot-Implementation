/**
 */
package org.omg.sysml.kerml.core;

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
 * @see org.omg.sysml.kerml.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openmbee.org/kerml/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.omg.sysml.kerml.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl <em>Element Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.core.impl.ElementRecordImpl
	 * @see org.omg.sysml.kerml.core.impl.CorePackageImpl#getElementRecord()
	 * @generated
	 */
	int ELEMENT_RECORD = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD__NAME = 3;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD__RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD__NAMESPACE = 5;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD__MEMBER_OF_NAMESPACE = 6;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD__SOURCE_RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD__TARGET_RELATIONSHIP = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD__OWNED_COMMENT = 9;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD__OWNED_ELEMENT = 10;

	/**
	 * The number of structural features of the '<em>Element Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Element Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.core.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.core.impl.CommentImpl
	 * @see org.omg.sysml.kerml.core.impl.CorePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__DOCUMENTATION = ELEMENT_RECORD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNER = ELEMENT_RECORD__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TITLE = ELEMENT_RECORD__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = ELEMENT_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__RELATIONSHIP = ELEMENT_RECORD__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAMESPACE = ELEMENT_RECORD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__MEMBER_OF_NAMESPACE = ELEMENT_RECORD__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SOURCE_RELATIONSHIP = ELEMENT_RECORD__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TARGET_RELATIONSHIP = ELEMENT_RECORD__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNED_COMMENT = ELEMENT_RECORD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNED_ELEMENT = ELEMENT_RECORD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ANNOTATED_ELEMENT = ELEMENT_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT = ELEMENT_RECORD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = ELEMENT_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = ELEMENT_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.core.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.core.impl.ContainerImpl
	 * @see org.omg.sysml.kerml.core.impl.CorePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOCUMENTATION = ELEMENT_RECORD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OWNER = ELEMENT_RECORD__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TITLE = ELEMENT_RECORD__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = ELEMENT_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RELATIONSHIP = ELEMENT_RECORD__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAMESPACE = ELEMENT_RECORD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEMBER_OF_NAMESPACE = ELEMENT_RECORD__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SOURCE_RELATIONSHIP = ELEMENT_RECORD__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TARGET_RELATIONSHIP = ELEMENT_RECORD__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OWNED_COMMENT = ELEMENT_RECORD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OWNED_ELEMENT = ELEMENT_RECORD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PACKAGE_VISIBILITY = ELEMENT_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OWNED_MEMBER = ELEMENT_RECORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEMBER = ELEMENT_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = ELEMENT_RECORD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = ELEMENT_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.core.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.core.impl.ModelImpl
	 * @see org.omg.sysml.kerml.core.impl.CorePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DOCUMENTATION = CONTAINER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNER = CONTAINER__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TITLE = CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RELATIONSHIP = CONTAINER__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAMESPACE = CONTAINER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MEMBER_OF_NAMESPACE = CONTAINER__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SOURCE_RELATIONSHIP = CONTAINER__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TARGET_RELATIONSHIP = CONTAINER__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_COMMENT = CONTAINER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_ELEMENT = CONTAINER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Package Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGE_VISIBILITY = CONTAINER__PACKAGE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_MEMBER = CONTAINER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MEMBER = CONTAINER__MEMBER;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.core.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.core.impl.RelationshipImpl
	 * @see org.omg.sysml.kerml.core.impl.CorePackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DOCUMENTATION = ELEMENT_RECORD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNER = ELEMENT_RECORD__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TITLE = ELEMENT_RECORD__TITLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ELEMENT_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATIONSHIP = ELEMENT_RECORD__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAMESPACE = ELEMENT_RECORD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member Of Namespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__MEMBER_OF_NAMESPACE = ELEMENT_RECORD__MEMBER_OF_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE_RELATIONSHIP = ELEMENT_RECORD__SOURCE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET_RELATIONSHIP = ELEMENT_RECORD__TARGET_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_COMMENT = ELEMENT_RECORD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_ELEMENT = ELEMENT_RECORD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = ELEMENT_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATED = ELEMENT_RECORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = ELEMENT_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ELEMENT_RECORD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ELEMENT_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.kerml.core.visibilityKind <em>visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.kerml.core.visibilityKind
	 * @see org.omg.sysml.kerml.core.impl.CorePackageImpl#getvisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 5;


	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.core.ElementRecord <em>Element Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Record</em>'.
	 * @see org.omg.sysml.kerml.core.ElementRecord
	 * @generated
	 */
	EClass getElementRecord();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.core.ElementRecord#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.omg.sysml.kerml.core.ElementRecord#getDocumentation()
	 * @see #getElementRecord()
	 * @generated
	 */
	EAttribute getElementRecord_Documentation();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.kerml.core.ElementRecord#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.omg.sysml.kerml.core.ElementRecord#getOwner()
	 * @see #getElementRecord()
	 * @generated
	 */
	EReference getElementRecord_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.core.ElementRecord#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.omg.sysml.kerml.core.ElementRecord#getTitle()
	 * @see #getElementRecord()
	 * @generated
	 */
	EAttribute getElementRecord_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.core.ElementRecord#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.sysml.kerml.core.ElementRecord#getName()
	 * @see #getElementRecord()
	 * @generated
	 */
	EAttribute getElementRecord_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.core.ElementRecord#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationship</em>'.
	 * @see org.omg.sysml.kerml.core.ElementRecord#getRelationship()
	 * @see #getElementRecord()
	 * @generated
	 */
	EReference getElementRecord_Relationship();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.kerml.core.ElementRecord#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Namespace</em>'.
	 * @see org.omg.sysml.kerml.core.ElementRecord#getNamespace()
	 * @see #getElementRecord()
	 * @generated
	 */
	EReference getElementRecord_Namespace();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.core.ElementRecord#getMemberOfNamespace <em>Member Of Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member Of Namespace</em>'.
	 * @see org.omg.sysml.kerml.core.ElementRecord#getMemberOfNamespace()
	 * @see #getElementRecord()
	 * @generated
	 */
	EReference getElementRecord_MemberOfNamespace();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.core.ElementRecord#getSourceRelationship <em>Source Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Relationship</em>'.
	 * @see org.omg.sysml.kerml.core.ElementRecord#getSourceRelationship()
	 * @see #getElementRecord()
	 * @generated
	 */
	EReference getElementRecord_SourceRelationship();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.core.ElementRecord#getTargetRelationship <em>Target Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Relationship</em>'.
	 * @see org.omg.sysml.kerml.core.ElementRecord#getTargetRelationship()
	 * @see #getElementRecord()
	 * @generated
	 */
	EReference getElementRecord_TargetRelationship();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.core.ElementRecord#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Comment</em>'.
	 * @see org.omg.sysml.kerml.core.ElementRecord#getOwnedComment()
	 * @see #getElementRecord()
	 * @generated
	 */
	EReference getElementRecord_OwnedComment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.core.ElementRecord#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see org.omg.sysml.kerml.core.ElementRecord#getOwnedElement()
	 * @see #getElementRecord()
	 * @generated
	 */
	EReference getElementRecord_OwnedElement();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.core.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.omg.sysml.kerml.core.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.core.Comment#getAnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotated Element</em>'.
	 * @see org.omg.sysml.kerml.core.Comment#getAnnotatedElement()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_AnnotatedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.core.Comment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.omg.sysml.kerml.core.Comment#getComment()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Comment();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.core.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.omg.sysml.kerml.core.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.core.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.omg.sysml.kerml.core.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.kerml.core.Container#getPackageVisibility <em>Package Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Visibility</em>'.
	 * @see org.omg.sysml.kerml.core.Container#getPackageVisibility()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_PackageVisibility();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.kerml.core.Container#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Member</em>'.
	 * @see org.omg.sysml.kerml.core.Container#getOwnedMember()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_OwnedMember();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.core.Container#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see org.omg.sysml.kerml.core.Container#getMember()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Member();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.kerml.core.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.omg.sysml.kerml.core.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.core.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.omg.sysml.kerml.core.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.kerml.core.Relationship#getRelated <em>Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related</em>'.
	 * @see org.omg.sysml.kerml.core.Relationship#getRelated()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Related();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.kerml.core.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.omg.sysml.kerml.core.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for enum '{@link org.omg.sysml.kerml.core.visibilityKind <em>visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>visibility Kind</em>'.
	 * @see org.omg.sysml.kerml.core.visibilityKind
	 * @generated
	 */
	EEnum getvisibilityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl <em>Element Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.core.impl.ElementRecordImpl
		 * @see org.omg.sysml.kerml.core.impl.CorePackageImpl#getElementRecord()
		 * @generated
		 */
		EClass ELEMENT_RECORD = eINSTANCE.getElementRecord();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_RECORD__DOCUMENTATION = eINSTANCE.getElementRecord_Documentation();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_RECORD__OWNER = eINSTANCE.getElementRecord_Owner();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_RECORD__TITLE = eINSTANCE.getElementRecord_Title();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_RECORD__NAME = eINSTANCE.getElementRecord_Name();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_RECORD__RELATIONSHIP = eINSTANCE.getElementRecord_Relationship();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_RECORD__NAMESPACE = eINSTANCE.getElementRecord_Namespace();

		/**
		 * The meta object literal for the '<em><b>Member Of Namespace</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_RECORD__MEMBER_OF_NAMESPACE = eINSTANCE.getElementRecord_MemberOfNamespace();

		/**
		 * The meta object literal for the '<em><b>Source Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_RECORD__SOURCE_RELATIONSHIP = eINSTANCE.getElementRecord_SourceRelationship();

		/**
		 * The meta object literal for the '<em><b>Target Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_RECORD__TARGET_RELATIONSHIP = eINSTANCE.getElementRecord_TargetRelationship();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_RECORD__OWNED_COMMENT = eINSTANCE.getElementRecord_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_RECORD__OWNED_ELEMENT = eINSTANCE.getElementRecord_OwnedElement();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.core.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.core.impl.CommentImpl
		 * @see org.omg.sysml.kerml.core.impl.CorePackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Annotated Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__ANNOTATED_ELEMENT = eINSTANCE.getComment_AnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.core.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.core.impl.ModelImpl
		 * @see org.omg.sysml.kerml.core.impl.CorePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.core.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.core.impl.ContainerImpl
		 * @see org.omg.sysml.kerml.core.impl.CorePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Package Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PACKAGE_VISIBILITY = eINSTANCE.getContainer_PackageVisibility();

		/**
		 * The meta object literal for the '<em><b>Owned Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__OWNED_MEMBER = eINSTANCE.getContainer_OwnedMember();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__MEMBER = eINSTANCE.getContainer_Member();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.core.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.core.impl.RelationshipImpl
		 * @see org.omg.sysml.kerml.core.impl.CorePackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Related</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATED = eINSTANCE.getRelationship_Related();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.kerml.core.visibilityKind <em>visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.kerml.core.visibilityKind
		 * @see org.omg.sysml.kerml.core.impl.CorePackageImpl#getvisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getvisibilityKind();

	}

} //CorePackage
