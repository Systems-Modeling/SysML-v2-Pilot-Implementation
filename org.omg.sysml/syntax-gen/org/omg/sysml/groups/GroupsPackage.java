/**
 */
package org.omg.sysml.groups;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.omg.sysml.core.CorePackage;

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
 * @see org.omg.sysml.groups.GroupsFactory
 * @model kind="package"
 * @generated
 */
public interface GroupsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "groups";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/SysML/2.0/Groups";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groups";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroupsPackage eINSTANCE = org.omg.sysml.groups.impl.GroupsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.sysml.groups.impl.ElementGroupImpl <em>Element Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.groups.impl.ElementGroupImpl
	 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getElementGroup()
	 * @generated
	 */
	int ELEMENT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__OWNED_ELEMENT = CorePackage.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__OWNER = CorePackage.ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__IDENTIFIER = CorePackage.ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owning Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__OWNING_GROUP = CorePackage.ELEMENT__OWNING_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__NAME = CorePackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__OWNING_NAMESPACE = CorePackage.ELEMENT__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__MEMBER = CorePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__GROUP_IMPORT = CorePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__IMPORTED_MEMBER = CorePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__OWNED_MEMBER = CorePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__GROUP_MEMBER = CorePackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_FEATURE_COUNT = CorePackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_OPERATION_COUNT = CorePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.groups.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.groups.impl.NamespaceImpl
	 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_ELEMENT = ELEMENT_GROUP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNER = ELEMENT_GROUP__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__IDENTIFIER = ELEMENT_GROUP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owning Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNING_GROUP = ELEMENT_GROUP__OWNING_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = ELEMENT_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNING_NAMESPACE = ELEMENT_GROUP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__MEMBER = ELEMENT_GROUP__MEMBER;

	/**
	 * The feature id for the '<em><b>Group Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__GROUP_IMPORT = ELEMENT_GROUP__GROUP_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__IMPORTED_MEMBER = ELEMENT_GROUP__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_MEMBER = ELEMENT_GROUP__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Group Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__GROUP_MEMBER = ELEMENT_GROUP__GROUP_MEMBER;

	/**
	 * The feature id for the '<em><b>Namespace Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAMESPACE_MEMBER = ELEMENT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAMESPACE_IMPORT = ELEMENT_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = ELEMENT_GROUP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___NAME_OF__ELEMENT = ELEMENT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = ELEMENT_GROUP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.sysml.groups.impl.GroupImportImpl <em>Group Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.groups.impl.GroupImportImpl
	 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getGroupImport()
	 * @generated
	 */
	int GROUP_IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT__OWNED_ELEMENT = CorePackage.RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT__OWNER = CorePackage.RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT__IDENTIFIER = CorePackage.RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owning Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT__OWNING_GROUP = CorePackage.RELATIONSHIP__OWNING_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT__NAME = CorePackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT__OWNING_NAMESPACE = CorePackage.RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT__RELATED = CorePackage.RELATIONSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT__TARGET = CorePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT__SOURCE = CorePackage.RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Imported Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT__IMPORTED_GROUP = CorePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Importing Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT__IMPORTING_GROUP = CorePackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selecter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT__SELECTER = CorePackage.RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Group Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT_FEATURE_COUNT = CorePackage.RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT___IMPORTED_MEMBERS = CorePackage.RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_IMPORT_OPERATION_COUNT = CorePackage.RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.sysml.groups.impl.NamespaceImportImpl <em>Namespace Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.groups.impl.NamespaceImportImpl
	 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getNamespaceImport()
	 * @generated
	 */
	int NAMESPACE_IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__OWNED_ELEMENT = GROUP_IMPORT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__OWNER = GROUP_IMPORT__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__IDENTIFIER = GROUP_IMPORT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owning Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__OWNING_GROUP = GROUP_IMPORT__OWNING_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__NAME = GROUP_IMPORT__NAME;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__OWNING_NAMESPACE = GROUP_IMPORT__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__RELATED = GROUP_IMPORT__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__TARGET = GROUP_IMPORT__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__SOURCE = GROUP_IMPORT__SOURCE;

	/**
	 * The feature id for the '<em><b>Imported Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__IMPORTED_GROUP = GROUP_IMPORT__IMPORTED_GROUP;

	/**
	 * The feature id for the '<em><b>Importing Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__IMPORTING_GROUP = GROUP_IMPORT__IMPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>Selecter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__SELECTER = GROUP_IMPORT__SELECTER;

	/**
	 * The feature id for the '<em><b>Importing Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__IMPORTING_NAMESPACE = GROUP_IMPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__IMPORTED_NAMESPACE = GROUP_IMPORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__VISIBILITY = GROUP_IMPORT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Namespace Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT_FEATURE_COUNT = GROUP_IMPORT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT___IMPORTED_MEMBERS = GROUP_IMPORT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Namespace Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT_OPERATION_COUNT = GROUP_IMPORT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.sysml.groups.impl.GroupMembershipImpl <em>Group Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.groups.impl.GroupMembershipImpl
	 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getGroupMembership()
	 * @generated
	 */
	int GROUP_MEMBERSHIP = 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__OWNED_ELEMENT = CorePackage.RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__OWNER = CorePackage.RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__IDENTIFIER = CorePackage.RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owning Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__OWNING_GROUP = CorePackage.RELATIONSHIP__OWNING_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__NAME = CorePackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__OWNING_NAMESPACE = CorePackage.RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__RELATED = CorePackage.RELATIONSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__TARGET = CorePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__SOURCE = CorePackage.RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__GROUP = CorePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__MEMBER_ELEMENT = CorePackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Member Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__OWNED_MEMBER_ELEMENT = CorePackage.RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Group Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP_FEATURE_COUNT = CorePackage.RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Group Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP_OPERATION_COUNT = CorePackage.RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.groups.impl.NamespaceMembershipImpl <em>Namespace Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.groups.impl.NamespaceMembershipImpl
	 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getNamespaceMembership()
	 * @generated
	 */
	int NAMESPACE_MEMBERSHIP = 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__OWNED_ELEMENT = GROUP_MEMBERSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__OWNER = GROUP_MEMBERSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__IDENTIFIER = GROUP_MEMBERSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Owning Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__OWNING_GROUP = GROUP_MEMBERSHIP__OWNING_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__NAME = GROUP_MEMBERSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__OWNING_NAMESPACE = GROUP_MEMBERSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__RELATED = GROUP_MEMBERSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__TARGET = GROUP_MEMBERSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__SOURCE = GROUP_MEMBERSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__GROUP = GROUP_MEMBERSHIP__GROUP;

	/**
	 * The feature id for the '<em><b>Member Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__MEMBER_ELEMENT = GROUP_MEMBERSHIP__MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Member Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__OWNED_MEMBER_ELEMENT = GROUP_MEMBERSHIP__OWNED_MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__MEMBER_NAME = GROUP_MEMBERSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__NAMESPACE = GROUP_MEMBERSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__VISIBILITY = GROUP_MEMBERSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP__ALIASES = GROUP_MEMBERSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Namespace Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP_FEATURE_COUNT = GROUP_MEMBERSHIP_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP___IS_DISTINGUISHABLE_FROM__NAMESPACEMEMBERSHIP = GROUP_MEMBERSHIP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Namespace Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_MEMBERSHIP_OPERATION_COUNT = GROUP_MEMBERSHIP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.sysml.groups.VisibilityKind <em>Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.groups.VisibilityKind
	 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 6;


	/**
	 * Returns the meta object for class '{@link org.omg.sysml.groups.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see org.omg.sysml.groups.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.groups.Namespace#getNamespaceMember <em>Namespace Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Namespace Member</em>'.
	 * @see org.omg.sysml.groups.Namespace#getNamespaceMember()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_NamespaceMember();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.groups.Namespace#getNamespaceImport <em>Namespace Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Namespace Import</em>'.
	 * @see org.omg.sysml.groups.Namespace#getNamespaceImport()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_NamespaceImport();

	/**
	 * Returns the meta object for the '{@link org.omg.sysml.groups.Namespace#nameOf(org.omg.sysml.core.Element) <em>Name Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Of</em>' operation.
	 * @see org.omg.sysml.groups.Namespace#nameOf(org.omg.sysml.core.Element)
	 * @generated
	 */
	EOperation getNamespace__NameOf__Element();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.groups.NamespaceImport <em>Namespace Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Import</em>'.
	 * @see org.omg.sysml.groups.NamespaceImport
	 * @generated
	 */
	EClass getNamespaceImport();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.groups.NamespaceImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Importing Namespace</em>'.
	 * @see org.omg.sysml.groups.NamespaceImport#getImportingNamespace()
	 * @see #getNamespaceImport()
	 * @generated
	 */
	EReference getNamespaceImport_ImportingNamespace();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.groups.NamespaceImport#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Namespace</em>'.
	 * @see org.omg.sysml.groups.NamespaceImport#getImportedNamespace()
	 * @see #getNamespaceImport()
	 * @generated
	 */
	EReference getNamespaceImport_ImportedNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.groups.NamespaceImport#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.omg.sysml.groups.NamespaceImport#getVisibility()
	 * @see #getNamespaceImport()
	 * @generated
	 */
	EAttribute getNamespaceImport_Visibility();

	/**
	 * Returns the meta object for the '{@link org.omg.sysml.groups.NamespaceImport#importedMembers() <em>Imported Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Imported Members</em>' operation.
	 * @see org.omg.sysml.groups.NamespaceImport#importedMembers()
	 * @generated
	 */
	EOperation getNamespaceImport__ImportedMembers();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.groups.ElementGroup <em>Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Group</em>'.
	 * @see org.omg.sysml.groups.ElementGroup
	 * @generated
	 */
	EClass getElementGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.groups.ElementGroup#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see org.omg.sysml.groups.ElementGroup#getMember()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_Member();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.groups.ElementGroup#getGroupImport <em>Group Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group Import</em>'.
	 * @see org.omg.sysml.groups.ElementGroup#getGroupImport()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_GroupImport();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.groups.ElementGroup#getImportedMember <em>Imported Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Member</em>'.
	 * @see org.omg.sysml.groups.ElementGroup#getImportedMember()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_ImportedMember();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.groups.ElementGroup#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Member</em>'.
	 * @see org.omg.sysml.groups.ElementGroup#getOwnedMember()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_OwnedMember();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.groups.ElementGroup#getGroupMember <em>Group Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group Member</em>'.
	 * @see org.omg.sysml.groups.ElementGroup#getGroupMember()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_GroupMember();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.groups.GroupImport <em>Group Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Import</em>'.
	 * @see org.omg.sysml.groups.GroupImport
	 * @generated
	 */
	EClass getGroupImport();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.groups.GroupImport#getImportedGroup <em>Imported Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Group</em>'.
	 * @see org.omg.sysml.groups.GroupImport#getImportedGroup()
	 * @see #getGroupImport()
	 * @generated
	 */
	EReference getGroupImport_ImportedGroup();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.groups.GroupImport#getImportingGroup <em>Importing Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Importing Group</em>'.
	 * @see org.omg.sysml.groups.GroupImport#getImportingGroup()
	 * @see #getGroupImport()
	 * @generated
	 */
	EReference getGroupImport_ImportingGroup();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.groups.GroupImport#getSelecter <em>Selecter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selecter</em>'.
	 * @see org.omg.sysml.groups.GroupImport#getSelecter()
	 * @see #getGroupImport()
	 * @generated
	 */
	EReference getGroupImport_Selecter();

	/**
	 * Returns the meta object for the '{@link org.omg.sysml.groups.GroupImport#importedMembers() <em>Imported Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Imported Members</em>' operation.
	 * @see org.omg.sysml.groups.GroupImport#importedMembers()
	 * @generated
	 */
	EOperation getGroupImport__ImportedMembers();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.groups.NamespaceMembership <em>Namespace Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Membership</em>'.
	 * @see org.omg.sysml.groups.NamespaceMembership
	 * @generated
	 */
	EClass getNamespaceMembership();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.groups.NamespaceMembership#getMemberName <em>Member Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Name</em>'.
	 * @see org.omg.sysml.groups.NamespaceMembership#getMemberName()
	 * @see #getNamespaceMembership()
	 * @generated
	 */
	EAttribute getNamespaceMembership_MemberName();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.groups.NamespaceMembership#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see org.omg.sysml.groups.NamespaceMembership#getNamespace()
	 * @see #getNamespaceMembership()
	 * @generated
	 */
	EReference getNamespaceMembership_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.groups.NamespaceMembership#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.omg.sysml.groups.NamespaceMembership#getVisibility()
	 * @see #getNamespaceMembership()
	 * @generated
	 */
	EAttribute getNamespaceMembership_Visibility();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.sysml.groups.NamespaceMembership#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aliases</em>'.
	 * @see org.omg.sysml.groups.NamespaceMembership#getAliases()
	 * @see #getNamespaceMembership()
	 * @generated
	 */
	EAttribute getNamespaceMembership_Aliases();

	/**
	 * Returns the meta object for the '{@link org.omg.sysml.groups.NamespaceMembership#isDistinguishableFrom(org.omg.sysml.groups.NamespaceMembership) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Distinguishable From</em>' operation.
	 * @see org.omg.sysml.groups.NamespaceMembership#isDistinguishableFrom(org.omg.sysml.groups.NamespaceMembership)
	 * @generated
	 */
	EOperation getNamespaceMembership__IsDistinguishableFrom__NamespaceMembership();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.groups.GroupMembership <em>Group Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Membership</em>'.
	 * @see org.omg.sysml.groups.GroupMembership
	 * @generated
	 */
	EClass getGroupMembership();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.groups.GroupMembership#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see org.omg.sysml.groups.GroupMembership#getGroup()
	 * @see #getGroupMembership()
	 * @generated
	 */
	EReference getGroupMembership_Group();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.groups.GroupMembership#getMemberElement <em>Member Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Element</em>'.
	 * @see org.omg.sysml.groups.GroupMembership#getMemberElement()
	 * @see #getGroupMembership()
	 * @generated
	 */
	EReference getGroupMembership_MemberElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.groups.GroupMembership#getOwnedMemberElement <em>Owned Member Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Member Element</em>'.
	 * @see org.omg.sysml.groups.GroupMembership#getOwnedMemberElement()
	 * @see #getGroupMembership()
	 * @generated
	 */
	EReference getGroupMembership_OwnedMemberElement();

	/**
	 * Returns the meta object for enum '{@link org.omg.sysml.groups.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see org.omg.sysml.groups.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GroupsFactory getGroupsFactory();

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
		 * The meta object literal for the '{@link org.omg.sysml.groups.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.groups.impl.NamespaceImpl
		 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Namespace Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__NAMESPACE_MEMBER = eINSTANCE.getNamespace_NamespaceMember();

		/**
		 * The meta object literal for the '<em><b>Namespace Import</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__NAMESPACE_IMPORT = eINSTANCE.getNamespace_NamespaceImport();

		/**
		 * The meta object literal for the '<em><b>Name Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMESPACE___NAME_OF__ELEMENT = eINSTANCE.getNamespace__NameOf__Element();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.groups.impl.NamespaceImportImpl <em>Namespace Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.groups.impl.NamespaceImportImpl
		 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getNamespaceImport()
		 * @generated
		 */
		EClass NAMESPACE_IMPORT = eINSTANCE.getNamespaceImport();

		/**
		 * The meta object literal for the '<em><b>Importing Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE_IMPORT__IMPORTING_NAMESPACE = eINSTANCE.getNamespaceImport_ImportingNamespace();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getNamespaceImport_ImportedNamespace();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_IMPORT__VISIBILITY = eINSTANCE.getNamespaceImport_Visibility();

		/**
		 * The meta object literal for the '<em><b>Imported Members</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMESPACE_IMPORT___IMPORTED_MEMBERS = eINSTANCE.getNamespaceImport__ImportedMembers();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.groups.impl.ElementGroupImpl <em>Element Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.groups.impl.ElementGroupImpl
		 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getElementGroup()
		 * @generated
		 */
		EClass ELEMENT_GROUP = eINSTANCE.getElementGroup();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__MEMBER = eINSTANCE.getElementGroup_Member();

		/**
		 * The meta object literal for the '<em><b>Group Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__GROUP_IMPORT = eINSTANCE.getElementGroup_GroupImport();

		/**
		 * The meta object literal for the '<em><b>Imported Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__IMPORTED_MEMBER = eINSTANCE.getElementGroup_ImportedMember();

		/**
		 * The meta object literal for the '<em><b>Owned Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__OWNED_MEMBER = eINSTANCE.getElementGroup_OwnedMember();

		/**
		 * The meta object literal for the '<em><b>Group Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__GROUP_MEMBER = eINSTANCE.getElementGroup_GroupMember();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.groups.impl.GroupImportImpl <em>Group Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.groups.impl.GroupImportImpl
		 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getGroupImport()
		 * @generated
		 */
		EClass GROUP_IMPORT = eINSTANCE.getGroupImport();

		/**
		 * The meta object literal for the '<em><b>Imported Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_IMPORT__IMPORTED_GROUP = eINSTANCE.getGroupImport_ImportedGroup();

		/**
		 * The meta object literal for the '<em><b>Importing Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_IMPORT__IMPORTING_GROUP = eINSTANCE.getGroupImport_ImportingGroup();

		/**
		 * The meta object literal for the '<em><b>Selecter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_IMPORT__SELECTER = eINSTANCE.getGroupImport_Selecter();

		/**
		 * The meta object literal for the '<em><b>Imported Members</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GROUP_IMPORT___IMPORTED_MEMBERS = eINSTANCE.getGroupImport__ImportedMembers();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.groups.impl.NamespaceMembershipImpl <em>Namespace Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.groups.impl.NamespaceMembershipImpl
		 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getNamespaceMembership()
		 * @generated
		 */
		EClass NAMESPACE_MEMBERSHIP = eINSTANCE.getNamespaceMembership();

		/**
		 * The meta object literal for the '<em><b>Member Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_MEMBERSHIP__MEMBER_NAME = eINSTANCE.getNamespaceMembership_MemberName();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE_MEMBERSHIP__NAMESPACE = eINSTANCE.getNamespaceMembership_Namespace();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_MEMBERSHIP__VISIBILITY = eINSTANCE.getNamespaceMembership_Visibility();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_MEMBERSHIP__ALIASES = eINSTANCE.getNamespaceMembership_Aliases();

		/**
		 * The meta object literal for the '<em><b>Is Distinguishable From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMESPACE_MEMBERSHIP___IS_DISTINGUISHABLE_FROM__NAMESPACEMEMBERSHIP = eINSTANCE.getNamespaceMembership__IsDistinguishableFrom__NamespaceMembership();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.groups.impl.GroupMembershipImpl <em>Group Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.groups.impl.GroupMembershipImpl
		 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getGroupMembership()
		 * @generated
		 */
		EClass GROUP_MEMBERSHIP = eINSTANCE.getGroupMembership();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_MEMBERSHIP__GROUP = eINSTANCE.getGroupMembership_Group();

		/**
		 * The meta object literal for the '<em><b>Member Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_MEMBERSHIP__MEMBER_ELEMENT = eINSTANCE.getGroupMembership_MemberElement();

		/**
		 * The meta object literal for the '<em><b>Owned Member Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_MEMBERSHIP__OWNED_MEMBER_ELEMENT = eINSTANCE.getGroupMembership_OwnedMemberElement();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.groups.VisibilityKind <em>Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.groups.VisibilityKind
		 * @see org.omg.sysml.groups.impl.GroupsPackageImpl#getVisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

	}

} //GroupsPackage
