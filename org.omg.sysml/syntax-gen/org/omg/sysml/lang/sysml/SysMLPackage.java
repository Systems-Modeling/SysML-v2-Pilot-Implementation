/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.omg.sysml.lang.sysml.SysMLFactory
 * @model kind="package"
 * @generated
 */
public interface SysMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sysml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/SysML/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sysml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SysMLPackage eINSTANCE = org.omg.sysml.lang.sysml.impl.SysMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.ElementImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNING_MEMBERSHIP = 0;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNING_NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNER = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 5;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.PackageImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNING_MEMBERSHIP = ELEMENT__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNING_NAMESPACE = ELEMENT__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IDENTIFIER = ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MEMBERSHIP = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_IMPORT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MEMBER = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_MEMBER = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IMPORTED_MEMBERSHIP = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_MEMBERSHIP = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___NAME_OF__ELEMENT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___EXCLUDE_COLLISIONS__ELIST = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.CategoryImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 10;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OWNING_MEMBERSHIP = PACKAGE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OWNING_NAMESPACE = PACKAGE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OWNED_ELEMENT = PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OWNER = PACKAGE__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IDENTIFIER = PACKAGE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__MEMBERSHIP = PACKAGE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OWNED_IMPORT = PACKAGE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__MEMBER = PACKAGE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OWNED_MEMBER = PACKAGE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IMPORTED_MEMBERSHIP = PACKAGE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OWNED_MEMBERSHIP = PACKAGE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OWNED_GENERALIZATION = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OWNED_FEATURE_MEMBERSHIP = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OWNED_FEATURE = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__FEATURE = PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__INPUT = PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OUTPUT = PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IS_ABSTRACT = PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___NAME_OF__ELEMENT = PACKAGE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___EXCLUDE_COLLISIONS__ELIST = PACKAGE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.ClassImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 9;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNING_MEMBERSHIP = CATEGORY__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNING_NAMESPACE = CATEGORY__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ELEMENT = CATEGORY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNER = CATEGORY__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IDENTIFIER = CATEGORY__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MEMBERSHIP = CATEGORY__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_IMPORT = CATEGORY__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MEMBER = CATEGORY__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_MEMBER = CATEGORY__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPORTED_MEMBERSHIP = CATEGORY__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_MEMBERSHIP = CATEGORY__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_GENERALIZATION = CATEGORY__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_FEATURE_MEMBERSHIP = CATEGORY__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_FEATURE = CATEGORY__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FEATURE = CATEGORY__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INPUT = CATEGORY__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OUTPUT = CATEGORY__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = CATEGORY__IS_ABSTRACT;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___NAME_OF__ELEMENT = CATEGORY___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___EXCLUDE_COLLISIONS__ELIST = CATEGORY___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.AssociationImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNING_MEMBERSHIP = CLASS__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNING_NAMESPACE = CLASS__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_ELEMENT = CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNER = CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IDENTIFIER = CLASS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MEMBERSHIP = CLASS__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_IMPORT = CLASS__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MEMBER = CLASS__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_MEMBER = CLASS__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IMPORTED_MEMBERSHIP = CLASS__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_MEMBERSHIP = CLASS__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_GENERALIZATION = CLASS__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_FEATURE_MEMBERSHIP = CLASS__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_FEATURE = CLASS__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FEATURE = CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__INPUT = CLASS__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OUTPUT = CLASS__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_ABSTRACT = CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__RELATED = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Related Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__RELATED_TYPE = CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned End Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP = CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owning Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNING_CONNECTOR = CLASS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CLASS_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___NAME_OF__ELEMENT = CLASS___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___EXCLUDE_COLLISIONS__ELIST = CLASS___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.RelationshipImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNING_MEMBERSHIP = ELEMENT__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNING_NAMESPACE = ELEMENT__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__IDENTIFIER = ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATED = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.MembershipImpl <em>Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.MembershipImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getMembership()
	 * @generated
	 */
	int MEMBERSHIP = 3;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNING_MEMBERSHIP = RELATIONSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNING_NAMESPACE = RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__IDENTIFIER = RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__RELATED = RELATIONSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__MEMBER_NAME = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__VISIBILITY = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ALIASES = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Member Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__MEMBER_ELEMENT = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Membership Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE = RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Member Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNED_MEMBER_ELEMENT = RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.ImportImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 5;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNING_MEMBERSHIP = RELATIONSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNING_NAMESPACE = RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IDENTIFIER = RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__RELATED = RELATIONSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Imported Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_PACKAGE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selecter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__SELECTER = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__VISIBILITY = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Import Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_OWNING_PACKAGE = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Imported Membership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___IMPORTED_MEMBERSHIP = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.BehaviorImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 8;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNING_MEMBERSHIP = CLASS__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNING_NAMESPACE = CLASS__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_ELEMENT = CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNER = CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IDENTIFIER = CLASS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__MEMBERSHIP = CLASS__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_IMPORT = CLASS__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__MEMBER = CLASS__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_MEMBER = CLASS__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IMPORTED_MEMBERSHIP = CLASS__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_MEMBERSHIP = CLASS__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_GENERALIZATION = CLASS__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_FEATURE_MEMBERSHIP = CLASS__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_FEATURE = CLASS__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__FEATURE = CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__INPUT = CLASS__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OUTPUT = CLASS__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IS_ABSTRACT = CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__TAKES_STEP = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__INVOLVES_FEATURE = CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = CLASS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___NAME_OF__ELEMENT = CLASS___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___EXCLUDE_COLLISIONS__ELIST = CLASS___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.FunctionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNING_MEMBERSHIP = BEHAVIOR__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNING_NAMESPACE = BEHAVIOR__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_ELEMENT = BEHAVIOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNER = BEHAVIOR__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IDENTIFIER = BEHAVIOR__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MEMBERSHIP = BEHAVIOR__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_IMPORT = BEHAVIOR__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MEMBER = BEHAVIOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_MEMBER = BEHAVIOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IMPORTED_MEMBERSHIP = BEHAVIOR__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_MEMBERSHIP = BEHAVIOR__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_GENERALIZATION = BEHAVIOR__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_FEATURE_MEMBERSHIP = BEHAVIOR__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_FEATURE = BEHAVIOR__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FEATURE = BEHAVIOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INPUT = BEHAVIOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OUTPUT = BEHAVIOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_ABSTRACT = BEHAVIOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TAKES_STEP = BEHAVIOR__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INVOLVES_FEATURE = BEHAVIOR__INVOLVES_FEATURE;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION___NAME_OF__ELEMENT = BEHAVIOR___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION___EXCLUDE_COLLISIONS__ELIST = BEHAVIOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.PredicateImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 6;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNING_MEMBERSHIP = FUNCTION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNING_NAMESPACE = FUNCTION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_ELEMENT = FUNCTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNER = FUNCTION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__IDENTIFIER = FUNCTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__MEMBERSHIP = FUNCTION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_IMPORT = FUNCTION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__MEMBER = FUNCTION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_MEMBER = FUNCTION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__IMPORTED_MEMBERSHIP = FUNCTION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_MEMBERSHIP = FUNCTION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_GENERALIZATION = FUNCTION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_FEATURE_MEMBERSHIP = FUNCTION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_FEATURE = FUNCTION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__FEATURE = FUNCTION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__INPUT = FUNCTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OUTPUT = FUNCTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__IS_ABSTRACT = FUNCTION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__TAKES_STEP = FUNCTION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__INVOLVES_FEATURE = FUNCTION__INVOLVES_FEATURE;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE___NAME_OF__ELEMENT = FUNCTION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE___EXCLUDE_COLLISIONS__ELIST = FUNCTION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.GeneralizationImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 11;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNING_MEMBERSHIP = RELATIONSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNING_NAMESPACE = RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__IDENTIFIER = RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__RELATED = RELATIONSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERAL = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SPECIFIC = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNING_CATEGORY = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl <em>Feature Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureMembership()
	 * @generated
	 */
	int FEATURE_MEMBERSHIP = 12;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNING_MEMBERSHIP = MEMBERSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNING_NAMESPACE = MEMBERSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNED_ELEMENT = MEMBERSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNER = MEMBERSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__IDENTIFIER = MEMBERSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__NAME = MEMBERSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__RELATED = MEMBERSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__TARGET = MEMBERSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__SOURCE = MEMBERSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__MEMBER_NAME = MEMBERSHIP__MEMBER_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__VISIBILITY = MEMBERSHIP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__ALIASES = MEMBERSHIP__ALIASES;

	/**
	 * The feature id for the '<em><b>Member Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__MEMBER_ELEMENT = MEMBERSHIP__MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE = MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Member Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNED_MEMBER_ELEMENT = MEMBERSHIP__OWNED_MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__IS_DERIVED = MEMBERSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__IS_READ_ONLY = MEMBERSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__MEMBER_FEATURE = MEMBERSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Feature Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT = MEMBERSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__IS_PART = MEMBERSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__IS_PORT = MEMBERSHIP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__DIRECTION = MEMBERSHIP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNING_CATEGORY = MEMBERSHIP_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Feature Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP_FEATURE_COUNT = MEMBERSHIP_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP = MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP;

	/**
	 * The number of operations of the '<em>Feature Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP_OPERATION_COUNT = MEMBERSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.FeatureImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 13;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNING_MEMBERSHIP = CATEGORY__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNING_NAMESPACE = CATEGORY__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_ELEMENT = CATEGORY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNER = CATEGORY__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IDENTIFIER = CATEGORY__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MEMBERSHIP = CATEGORY__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_IMPORT = CATEGORY__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MEMBER = CATEGORY__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_MEMBER = CATEGORY__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IMPORTED_MEMBERSHIP = CATEGORY__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_MEMBERSHIP = CATEGORY__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_GENERALIZATION = CATEGORY__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_FEATURE_MEMBERSHIP = CATEGORY__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_FEATURE = CATEGORY__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE = CATEGORY__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__INPUT = CATEGORY__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OUTPUT = CATEGORY__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_ABSTRACT = CATEGORY__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REFERENCED_TYPE = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNING_CATEGORY = CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LOWER = CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__UPPER = CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_UNIQUE = CATEGORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_ORDERED = CATEGORY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE = CATEGORY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_TYPE = CATEGORY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_REDEFINITION = CATEGORY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Subset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_SUBSET = CATEGORY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VALUE = CATEGORY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNING_FEATURE_MEMBERSHIP = CATEGORY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_COMPOSITE = CATEGORY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MULTIPLICITY = CATEGORY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_NONUNIQUE = CATEGORY_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___NAME_OF__ELEMENT = CATEGORY___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___EXCLUDE_COLLISIONS__ELIST = CATEGORY___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.ExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNING_MEMBERSHIP = FUNCTION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNING_NAMESPACE = FUNCTION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_ELEMENT = FUNCTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNER = FUNCTION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IDENTIFIER = FUNCTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__MEMBERSHIP = FUNCTION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_IMPORT = FUNCTION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__MEMBER = FUNCTION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_MEMBER = FUNCTION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IMPORTED_MEMBERSHIP = FUNCTION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_MEMBERSHIP = FUNCTION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_GENERALIZATION = FUNCTION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_FEATURE_MEMBERSHIP = FUNCTION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_FEATURE = FUNCTION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__FEATURE = FUNCTION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__INPUT = FUNCTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OUTPUT = FUNCTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_ABSTRACT = FUNCTION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TAKES_STEP = FUNCTION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__INVOLVES_FEATURE = FUNCTION__INVOLVES_FEATURE;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___NAME_OF__ELEMENT = FUNCTION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___EXCLUDE_COLLISIONS__ELIST = FUNCTION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.SubsetImpl <em>Subset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.SubsetImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSubset()
	 * @generated
	 */
	int SUBSET = 16;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__OWNING_MEMBERSHIP = GENERALIZATION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__OWNING_NAMESPACE = GENERALIZATION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__OWNED_ELEMENT = GENERALIZATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__OWNER = GENERALIZATION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__IDENTIFIER = GENERALIZATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__NAME = GENERALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__RELATED = GENERALIZATION__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__TARGET = GENERALIZATION__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__SOURCE = GENERALIZATION__SOURCE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__GENERAL = GENERALIZATION__GENERAL;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__SPECIFIC = GENERALIZATION__SPECIFIC;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__OWNING_CATEGORY = GENERALIZATION__OWNING_CATEGORY;

	/**
	 * The feature id for the '<em><b>Subsetted Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__SUBSETTED_FEATURE = GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subsetting Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__SUBSETTING_FEATURE = GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET__OWNING_FEATURE = GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_FEATURE_COUNT = GENERALIZATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Subset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSET_OPERATION_COUNT = GENERALIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.RedefinitionImpl <em>Redefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.RedefinitionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getRedefinition()
	 * @generated
	 */
	int REDEFINITION = 15;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNING_MEMBERSHIP = SUBSET__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNING_NAMESPACE = SUBSET__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNED_ELEMENT = SUBSET__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNER = SUBSET__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__IDENTIFIER = SUBSET__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__NAME = SUBSET__NAME;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__RELATED = SUBSET__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__TARGET = SUBSET__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__SOURCE = SUBSET__SOURCE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__GENERAL = SUBSET__GENERAL;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__SPECIFIC = SUBSET__SPECIFIC;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNING_CATEGORY = SUBSET__OWNING_CATEGORY;

	/**
	 * The feature id for the '<em><b>Subsetted Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__SUBSETTED_FEATURE = SUBSET__SUBSETTED_FEATURE;

	/**
	 * The feature id for the '<em><b>Subsetting Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__SUBSETTING_FEATURE = SUBSET__SUBSETTING_FEATURE;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNING_FEATURE = SUBSET__OWNING_FEATURE;

	/**
	 * The feature id for the '<em><b>Redefining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__REDEFINING_FEATURE = SUBSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redefined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__REDEFINED_FEATURE = SUBSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Redefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION_FEATURE_COUNT = SUBSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Redefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINITION_OPERATION_COUNT = SUBSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.StepImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 17;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNING_MEMBERSHIP = FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNING_NAMESPACE = FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IDENTIFIER = FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MEMBERSHIP = FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_IMPORT = FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IMPORTED_MEMBERSHIP = FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_MEMBERSHIP = FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_GENERALIZATION = FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_FEATURE_MEMBERSHIP = FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_FEATURE = FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__FEATURE = FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INPUT = FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUTPUT = FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IS_ABSTRACT = FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__REFERENCED_TYPE = FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNING_CATEGORY = FEATURE__OWNING_CATEGORY;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LOWER = FEATURE__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__UPPER = FEATURE__UPPER;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_REDEFINITION = FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_SUBSET = FEATURE__OWNED_SUBSET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__VALUE = FEATURE__VALUE;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OWNING_FEATURE_MEMBERSHIP = FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IS_COMPOSITE = FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MULTIPLICITY = FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IS_NONUNIQUE = FEATURE__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__BEHAVIOR = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP___NAME_OF__ELEMENT = FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP___EXCLUDE_COLLISIONS__ELIST = FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.EndFeatureMembershipImpl <em>End Feature Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.EndFeatureMembershipImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getEndFeatureMembership()
	 * @generated
	 */
	int END_FEATURE_MEMBERSHIP = 18;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNING_MEMBERSHIP = FEATURE_MEMBERSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNING_NAMESPACE = FEATURE_MEMBERSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNED_ELEMENT = FEATURE_MEMBERSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNER = FEATURE_MEMBERSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__IDENTIFIER = FEATURE_MEMBERSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__NAME = FEATURE_MEMBERSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__RELATED = FEATURE_MEMBERSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__TARGET = FEATURE_MEMBERSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__SOURCE = FEATURE_MEMBERSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__MEMBER_NAME = FEATURE_MEMBERSHIP__MEMBER_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__VISIBILITY = FEATURE_MEMBERSHIP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__ALIASES = FEATURE_MEMBERSHIP__ALIASES;

	/**
	 * The feature id for the '<em><b>Member Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__MEMBER_ELEMENT = FEATURE_MEMBERSHIP__MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE = FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Member Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNED_MEMBER_ELEMENT = FEATURE_MEMBERSHIP__OWNED_MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__IS_DERIVED = FEATURE_MEMBERSHIP__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__IS_READ_ONLY = FEATURE_MEMBERSHIP__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Member Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__MEMBER_FEATURE = FEATURE_MEMBERSHIP__MEMBER_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned Feature Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT = FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__IS_PART = FEATURE_MEMBERSHIP__IS_PART;

	/**
	 * The feature id for the '<em><b>Is Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__IS_PORT = FEATURE_MEMBERSHIP__IS_PORT;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__DIRECTION = FEATURE_MEMBERSHIP__DIRECTION;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNING_CATEGORY = FEATURE_MEMBERSHIP__OWNING_CATEGORY;

	/**
	 * The feature id for the '<em><b>Owning Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION = FEATURE_MEMBERSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Feature Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP_FEATURE_COUNT = FEATURE_MEMBERSHIP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP = FEATURE_MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP;

	/**
	 * The number of operations of the '<em>End Feature Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP_OPERATION_COUNT = FEATURE_MEMBERSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.ConnectorImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 19;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNING_MEMBERSHIP = FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNING_NAMESPACE = FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IDENTIFIER = FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MEMBERSHIP = FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_IMPORT = FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IMPORTED_MEMBERSHIP = FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_MEMBERSHIP = FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_GENERALIZATION = FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_FEATURE_MEMBERSHIP = FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_FEATURE = FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__FEATURE = FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__INPUT = FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OUTPUT = FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_ABSTRACT = FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__REFERENCED_TYPE = FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNING_CATEGORY = FEATURE__OWNING_CATEGORY;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__LOWER = FEATURE__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__UPPER = FEATURE__UPPER;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_REDEFINITION = FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_SUBSET = FEATURE__OWNED_SUBSET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__VALUE = FEATURE__VALUE;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNING_FEATURE_MEMBERSHIP = FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_COMPOSITE = FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MULTIPLICITY = FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_NONUNIQUE = FEATURE__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__RELATED = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Related Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__RELATED_FEATURES = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ASSOCIATION = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_DIRECTED = FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connector End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTOR_END = FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Association Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_ASSOCIATION_TYPE = FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___NAME_OF__ELEMENT = FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___EXCLUDE_COLLISIONS__ELIST = FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl <em>Connector End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.ConnectorEndImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getConnectorEnd()
	 * @generated
	 */
	int CONNECTOR_END = 20;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__OWNING_MEMBERSHIP = RELATIONSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__OWNING_NAMESPACE = RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__IDENTIFIER = RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__RELATED = RELATIONSHIP__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__LOWER = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__UPPER = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__FEATURE = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__END = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__PATH = RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__CONNECTOR = RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.CommentImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 21;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNING_MEMBERSHIP = ELEMENT__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNING_NAMESPACE = ELEMENT__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__IDENTIFIER = ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commented Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENTED_ELEMENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.ElementReferenceExpressionImpl <em>Element Reference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.ElementReferenceExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getElementReferenceExpression()
	 * @generated
	 */
	int ELEMENT_REFERENCE_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__TAKES_STEP = EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__INVOLVES_FEATURE = EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION__REFERENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Element Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.FeatureAccessExpressionImpl <em>Feature Access Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.FeatureAccessExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureAccessExpression()
	 * @generated
	 */
	int FEATURE_ACCESS_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__TAKES_STEP = EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__INVOLVES_FEATURE = EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accessed Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION__ACCESSED_FEATURE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Feature Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.InstanceCreationExpressionImpl <em>Instance Creation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.InstanceCreationExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getInstanceCreationExpression()
	 * @generated
	 */
	int INSTANCE_CREATION_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__TAKES_STEP = EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__INVOLVES_FEATURE = EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__CLASS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__ARGUMENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Creation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Instance Creation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl <em>Item Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.ItemFlowImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getItemFlow()
	 * @generated
	 */
	int ITEM_FLOW = 25;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNING_MEMBERSHIP = CONNECTOR__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNING_NAMESPACE = CONNECTOR__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_ELEMENT = CONNECTOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNER = CONNECTOR__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IDENTIFIER = CONNECTOR__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__MEMBERSHIP = CONNECTOR__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_IMPORT = CONNECTOR__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__MEMBER = CONNECTOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_MEMBER = CONNECTOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IMPORTED_MEMBERSHIP = CONNECTOR__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_MEMBERSHIP = CONNECTOR__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_GENERALIZATION = CONNECTOR__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_FEATURE_MEMBERSHIP = CONNECTOR__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_FEATURE = CONNECTOR__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__FEATURE = CONNECTOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__INPUT = CONNECTOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OUTPUT = CONNECTOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_ABSTRACT = CONNECTOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__REFERENCED_TYPE = CONNECTOR__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNING_CATEGORY = CONNECTOR__OWNING_CATEGORY;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__LOWER = CONNECTOR__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__UPPER = CONNECTOR__UPPER;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_UNIQUE = CONNECTOR__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_ORDERED = CONNECTOR__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__TYPE = CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_TYPE = CONNECTOR__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_REDEFINITION = CONNECTOR__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_SUBSET = CONNECTOR__OWNED_SUBSET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__VALUE = CONNECTOR__VALUE;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNING_FEATURE_MEMBERSHIP = CONNECTOR__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_COMPOSITE = CONNECTOR__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__MULTIPLICITY = CONNECTOR__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_NONUNIQUE = CONNECTOR__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__RELATED = CONNECTOR__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__TARGET = CONNECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__SOURCE = CONNECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Related Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__RELATED_FEATURES = CONNECTOR__RELATED_FEATURES;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__ASSOCIATION = CONNECTOR__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Is Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_DIRECTED = CONNECTOR__IS_DIRECTED;

	/**
	 * The feature id for the '<em><b>Connector End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__CONNECTOR_END = CONNECTOR__CONNECTOR_END;

	/**
	 * The feature id for the '<em><b>Owned Association Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_ASSOCIATION_TYPE = CONNECTOR__OWNED_ASSOCIATION_TYPE;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__BEHAVIOR = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__ITEM_TYPE = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Input Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__TARGET_INPUT_FEATURE = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Output Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__SOURCE_OUTPUT_FEATURE = CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Item Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW___NAME_OF__ELEMENT = CONNECTOR___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW___EXCLUDE_COLLISIONS__ELIST = CONNECTOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Item Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.LiteralExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralExpression()
	 * @generated
	 */
	int LITERAL_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__TAKES_STEP = EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__INVOLVES_FEATURE = EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The number of structural features of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.LiteralBooleanImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralBoolean()
	 * @generated
	 */
	int LITERAL_BOOLEAN = 26;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNING_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNING_NAMESPACE = LITERAL_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_ELEMENT = LITERAL_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNER = LITERAL_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__IDENTIFIER = LITERAL_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__NAME = LITERAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__MEMBERSHIP = LITERAL_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_IMPORT = LITERAL_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__MEMBER = LITERAL_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_MEMBER = LITERAL_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__IMPORTED_MEMBERSHIP = LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_GENERALIZATION = LITERAL_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_FEATURE = LITERAL_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__FEATURE = LITERAL_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__INPUT = LITERAL_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OUTPUT = LITERAL_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__IS_ABSTRACT = LITERAL_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__TAKES_STEP = LITERAL_EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__INVOLVES_FEATURE = LITERAL_EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___NAME_OF__ELEMENT = LITERAL_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___EXCLUDE_COLLISIONS__ELIST = LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.LiteralIntegerImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralInteger()
	 * @generated
	 */
	int LITERAL_INTEGER = 28;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNING_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNING_NAMESPACE = LITERAL_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_ELEMENT = LITERAL_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNER = LITERAL_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__IDENTIFIER = LITERAL_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__NAME = LITERAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__MEMBERSHIP = LITERAL_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_IMPORT = LITERAL_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__MEMBER = LITERAL_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_MEMBER = LITERAL_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__IMPORTED_MEMBERSHIP = LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_GENERALIZATION = LITERAL_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_FEATURE = LITERAL_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__FEATURE = LITERAL_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__INPUT = LITERAL_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OUTPUT = LITERAL_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__IS_ABSTRACT = LITERAL_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__TAKES_STEP = LITERAL_EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__INVOLVES_FEATURE = LITERAL_EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___NAME_OF__ELEMENT = LITERAL_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___EXCLUDE_COLLISIONS__ELIST = LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.LiteralNullImpl <em>Literal Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.LiteralNullImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralNull()
	 * @generated
	 */
	int LITERAL_NULL = 29;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNING_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNING_NAMESPACE = LITERAL_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNED_ELEMENT = LITERAL_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNER = LITERAL_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__IDENTIFIER = LITERAL_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__NAME = LITERAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__MEMBERSHIP = LITERAL_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNED_IMPORT = LITERAL_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__MEMBER = LITERAL_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNED_MEMBER = LITERAL_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__IMPORTED_MEMBERSHIP = LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNED_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNED_GENERALIZATION = LITERAL_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNED_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNED_FEATURE = LITERAL_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__FEATURE = LITERAL_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__INPUT = LITERAL_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OUTPUT = LITERAL_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__IS_ABSTRACT = LITERAL_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__TAKES_STEP = LITERAL_EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__INVOLVES_FEATURE = LITERAL_EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The number of structural features of the '<em>Literal Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___NAME_OF__ELEMENT = LITERAL_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___EXCLUDE_COLLISIONS__ELIST = LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Literal Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.LiteralRealImpl <em>Literal Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.LiteralRealImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralReal()
	 * @generated
	 */
	int LITERAL_REAL = 30;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNING_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNING_NAMESPACE = LITERAL_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_ELEMENT = LITERAL_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNER = LITERAL_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__IDENTIFIER = LITERAL_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__NAME = LITERAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__MEMBERSHIP = LITERAL_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_IMPORT = LITERAL_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__MEMBER = LITERAL_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_MEMBER = LITERAL_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__IMPORTED_MEMBERSHIP = LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_GENERALIZATION = LITERAL_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_FEATURE = LITERAL_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__FEATURE = LITERAL_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__INPUT = LITERAL_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OUTPUT = LITERAL_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__IS_ABSTRACT = LITERAL_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__TAKES_STEP = LITERAL_EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__INVOLVES_FEATURE = LITERAL_EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___NAME_OF__ELEMENT = LITERAL_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___EXCLUDE_COLLISIONS__ELIST = LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Literal Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.LiteralStringImpl <em>Literal String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.LiteralStringImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralString()
	 * @generated
	 */
	int LITERAL_STRING = 31;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNING_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNING_NAMESPACE = LITERAL_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_ELEMENT = LITERAL_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNER = LITERAL_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__IDENTIFIER = LITERAL_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__NAME = LITERAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__MEMBERSHIP = LITERAL_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_IMPORT = LITERAL_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__MEMBER = LITERAL_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_MEMBER = LITERAL_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__IMPORTED_MEMBERSHIP = LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_GENERALIZATION = LITERAL_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_FEATURE = LITERAL_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__FEATURE = LITERAL_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__INPUT = LITERAL_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OUTPUT = LITERAL_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__IS_ABSTRACT = LITERAL_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__TAKES_STEP = LITERAL_EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__INVOLVES_FEATURE = LITERAL_EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___NAME_OF__ELEMENT = LITERAL_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___EXCLUDE_COLLISIONS__ELIST = LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.LiteralUnboundedImpl <em>Literal Unbounded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.LiteralUnboundedImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralUnbounded()
	 * @generated
	 */
	int LITERAL_UNBOUNDED = 32;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNING_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNING_NAMESPACE = LITERAL_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_ELEMENT = LITERAL_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNER = LITERAL_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__IDENTIFIER = LITERAL_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__NAME = LITERAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__MEMBERSHIP = LITERAL_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_IMPORT = LITERAL_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__MEMBER = LITERAL_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_MEMBER = LITERAL_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__IMPORTED_MEMBERSHIP = LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_GENERALIZATION = LITERAL_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_FEATURE = LITERAL_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__FEATURE = LITERAL_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__INPUT = LITERAL_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OUTPUT = LITERAL_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__IS_ABSTRACT = LITERAL_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__TAKES_STEP = LITERAL_EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__INVOLVES_FEATURE = LITERAL_EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The number of structural features of the '<em>Literal Unbounded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED___NAME_OF__ELEMENT = LITERAL_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED___EXCLUDE_COLLISIONS__ELIST = LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Literal Unbounded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.OfSuccessionImpl <em>Of Succession</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.OfSuccessionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOfSuccession()
	 * @generated
	 */
	int OF_SUCCESSION = 33;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OF_SUCCESSION__TO = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OF_SUCCESSION__FROM = 1;

	/**
	 * The number of structural features of the '<em>Of Succession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OF_SUCCESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Of Succession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OF_SUCCESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.StructuredFeatureImpl <em>Structured Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.StructuredFeatureImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getStructuredFeature()
	 * @generated
	 */
	int STRUCTURED_FEATURE = 35;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNING_MEMBERSHIP = FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNING_NAMESPACE = FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IDENTIFIER = FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__MEMBERSHIP = FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_IMPORT = FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IMPORTED_MEMBERSHIP = FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_MEMBERSHIP = FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_GENERALIZATION = FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_FEATURE_MEMBERSHIP = FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_FEATURE = FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__FEATURE = FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__INPUT = FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OUTPUT = FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_ABSTRACT = FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__REFERENCED_TYPE = FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNING_CATEGORY = FEATURE__OWNING_CATEGORY;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__LOWER = FEATURE__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__UPPER = FEATURE__UPPER;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_REDEFINITION = FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_SUBSET = FEATURE__OWNED_SUBSET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__VALUE = FEATURE__VALUE;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNING_FEATURE_MEMBERSHIP = FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_COMPOSITE = FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__MULTIPLICITY = FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_NONUNIQUE = FEATURE__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Structured Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE___NAME_OF__ELEMENT = FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE___EXCLUDE_COLLISIONS__ELIST = FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Structured Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.OrderedFeatureImpl <em>Ordered Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.OrderedFeatureImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOrderedFeature()
	 * @generated
	 */
	int ORDERED_FEATURE = 34;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNING_MEMBERSHIP = STRUCTURED_FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNING_NAMESPACE = STRUCTURED_FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_ELEMENT = STRUCTURED_FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNER = STRUCTURED_FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IDENTIFIER = STRUCTURED_FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__NAME = STRUCTURED_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__MEMBERSHIP = STRUCTURED_FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_IMPORT = STRUCTURED_FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__MEMBER = STRUCTURED_FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_MEMBER = STRUCTURED_FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IMPORTED_MEMBERSHIP = STRUCTURED_FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_MEMBERSHIP = STRUCTURED_FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_GENERALIZATION = STRUCTURED_FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_FEATURE_MEMBERSHIP = STRUCTURED_FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_FEATURE = STRUCTURED_FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__FEATURE = STRUCTURED_FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__INPUT = STRUCTURED_FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OUTPUT = STRUCTURED_FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IS_ABSTRACT = STRUCTURED_FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__REFERENCED_TYPE = STRUCTURED_FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNING_CATEGORY = STRUCTURED_FEATURE__OWNING_CATEGORY;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__LOWER = STRUCTURED_FEATURE__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__UPPER = STRUCTURED_FEATURE__UPPER;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IS_UNIQUE = STRUCTURED_FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IS_ORDERED = STRUCTURED_FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__TYPE = STRUCTURED_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_TYPE = STRUCTURED_FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_REDEFINITION = STRUCTURED_FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_SUBSET = STRUCTURED_FEATURE__OWNED_SUBSET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__VALUE = STRUCTURED_FEATURE__VALUE;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNING_FEATURE_MEMBERSHIP = STRUCTURED_FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IS_COMPOSITE = STRUCTURED_FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__MULTIPLICITY = STRUCTURED_FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IS_NONUNIQUE = STRUCTURED_FEATURE__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Ordered Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE_FEATURE_COUNT = STRUCTURED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE___NAME_OF__ELEMENT = STRUCTURED_FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE___EXCLUDE_COLLISIONS__ELIST = STRUCTURED_FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Ordered Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE_OPERATION_COUNT = STRUCTURED_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.OperatorExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOperatorExpression()
	 * @generated
	 */
	int OPERATOR_EXPRESSION = 36;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__TAKES_STEP = EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__INVOLVES_FEATURE = EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.SequenceAccessExpressionImpl <em>Sequence Access Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.SequenceAccessExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSequenceAccessExpression()
	 * @generated
	 */
	int SEQUENCE_ACCESS_EXPRESSION = 37;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__TAKES_STEP = EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__INVOLVES_FEATURE = EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__PRIMARY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION__INDEX = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Sequence Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ACCESS_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.SequenceConstructionExpressionImpl <em>Sequence Construction Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.SequenceConstructionExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSequenceConstructionExpression()
	 * @generated
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION = 38;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Takes Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__TAKES_STEP = EXPRESSION__TAKES_STEP;

	/**
	 * The feature id for the '<em><b>Involves Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__INVOLVES_FEATURE = EXPRESSION__INVOLVES_FEATURE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Construction Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Sequence Construction Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.SuccessionImpl <em>Succession</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.SuccessionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSuccession()
	 * @generated
	 */
	int SUCCESSION = 39;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNING_MEMBERSHIP = CONNECTOR__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNING_NAMESPACE = CONNECTOR__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_ELEMENT = CONNECTOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNER = CONNECTOR__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IDENTIFIER = CONNECTOR__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__MEMBERSHIP = CONNECTOR__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_IMPORT = CONNECTOR__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__MEMBER = CONNECTOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_MEMBER = CONNECTOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IMPORTED_MEMBERSHIP = CONNECTOR__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_MEMBERSHIP = CONNECTOR__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_GENERALIZATION = CONNECTOR__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_FEATURE_MEMBERSHIP = CONNECTOR__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_FEATURE = CONNECTOR__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__FEATURE = CONNECTOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__INPUT = CONNECTOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OUTPUT = CONNECTOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_ABSTRACT = CONNECTOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__REFERENCED_TYPE = CONNECTOR__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNING_CATEGORY = CONNECTOR__OWNING_CATEGORY;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__LOWER = CONNECTOR__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__UPPER = CONNECTOR__UPPER;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_UNIQUE = CONNECTOR__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_ORDERED = CONNECTOR__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__TYPE = CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_TYPE = CONNECTOR__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_REDEFINITION = CONNECTOR__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_SUBSET = CONNECTOR__OWNED_SUBSET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__VALUE = CONNECTOR__VALUE;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNING_FEATURE_MEMBERSHIP = CONNECTOR__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_COMPOSITE = CONNECTOR__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__MULTIPLICITY = CONNECTOR__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_NONUNIQUE = CONNECTOR__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__RELATED = CONNECTOR__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__TARGET = CONNECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__SOURCE = CONNECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Related Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__RELATED_FEATURES = CONNECTOR__RELATED_FEATURES;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__ASSOCIATION = CONNECTOR__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Is Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_DIRECTED = CONNECTOR__IS_DIRECTED;

	/**
	 * The feature id for the '<em><b>Connector End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__CONNECTOR_END = CONNECTOR__CONNECTOR_END;

	/**
	 * The feature id for the '<em><b>Owned Association Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_ASSOCIATION_TYPE = CONNECTOR__OWNED_ASSOCIATION_TYPE;

	/**
	 * The number of structural features of the '<em>Succession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION___NAME_OF__ELEMENT = CONNECTOR___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION___EXCLUDE_COLLISIONS__ELIST = CONNECTOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Succession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.SuccessionItemFlowImpl <em>Succession Item Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.impl.SuccessionItemFlowImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSuccessionItemFlow()
	 * @generated
	 */
	int SUCCESSION_ITEM_FLOW = 40;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNING_MEMBERSHIP = ITEM_FLOW__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNING_NAMESPACE = ITEM_FLOW__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_ELEMENT = ITEM_FLOW__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNER = ITEM_FLOW__OWNER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IDENTIFIER = ITEM_FLOW__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__NAME = ITEM_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__MEMBERSHIP = ITEM_FLOW__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_IMPORT = ITEM_FLOW__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__MEMBER = ITEM_FLOW__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_MEMBER = ITEM_FLOW__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IMPORTED_MEMBERSHIP = ITEM_FLOW__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_MEMBERSHIP = ITEM_FLOW__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_GENERALIZATION = ITEM_FLOW__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_FEATURE_MEMBERSHIP = ITEM_FLOW__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_FEATURE = ITEM_FLOW__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__FEATURE = ITEM_FLOW__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__INPUT = ITEM_FLOW__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OUTPUT = ITEM_FLOW__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_ABSTRACT = ITEM_FLOW__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__REFERENCED_TYPE = ITEM_FLOW__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNING_CATEGORY = ITEM_FLOW__OWNING_CATEGORY;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__LOWER = ITEM_FLOW__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__UPPER = ITEM_FLOW__UPPER;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_UNIQUE = ITEM_FLOW__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_ORDERED = ITEM_FLOW__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__TYPE = ITEM_FLOW__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_TYPE = ITEM_FLOW__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_REDEFINITION = ITEM_FLOW__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_SUBSET = ITEM_FLOW__OWNED_SUBSET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__VALUE = ITEM_FLOW__VALUE;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNING_FEATURE_MEMBERSHIP = ITEM_FLOW__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_COMPOSITE = ITEM_FLOW__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__MULTIPLICITY = ITEM_FLOW__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_NONUNIQUE = ITEM_FLOW__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__RELATED = ITEM_FLOW__RELATED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__TARGET = ITEM_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__SOURCE = ITEM_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Related Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__RELATED_FEATURES = ITEM_FLOW__RELATED_FEATURES;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__ASSOCIATION = ITEM_FLOW__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Is Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_DIRECTED = ITEM_FLOW__IS_DIRECTED;

	/**
	 * The feature id for the '<em><b>Connector End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__CONNECTOR_END = ITEM_FLOW__CONNECTOR_END;

	/**
	 * The feature id for the '<em><b>Owned Association Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_ASSOCIATION_TYPE = ITEM_FLOW__OWNED_ASSOCIATION_TYPE;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__BEHAVIOR = ITEM_FLOW__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__ITEM_TYPE = ITEM_FLOW__ITEM_TYPE;

	/**
	 * The feature id for the '<em><b>Target Input Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__TARGET_INPUT_FEATURE = ITEM_FLOW__TARGET_INPUT_FEATURE;

	/**
	 * The feature id for the '<em><b>Source Output Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__SOURCE_OUTPUT_FEATURE = ITEM_FLOW__SOURCE_OUTPUT_FEATURE;

	/**
	 * The number of structural features of the '<em>Succession Item Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW_FEATURE_COUNT = ITEM_FLOW_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW___NAME_OF__ELEMENT = ITEM_FLOW___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW___EXCLUDE_COLLISIONS__ELIST = ITEM_FLOW___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The number of operations of the '<em>Succession Item Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW_OPERATION_COUNT = ITEM_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.VisibilityKind <em>Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 41;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.FeatureDirectionKind <em>Feature Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.sysml.FeatureDirectionKind
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureDirectionKind()
	 * @generated
	 */
	int FEATURE_DIRECTION_KIND = 42;


	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.omg.sysml.lang.sysml.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Association#getRelatedType <em>Related Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Association#getRelatedType()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_RelatedType();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Association#getOwnedEndFeatureMembership <em>Owned End Feature Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned End Feature Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Association#getOwnedEndFeatureMembership()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_OwnedEndFeatureMembership();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Association#getOwningConnector <em>Owning Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Connector</em>'.
	 * @see org.omg.sysml.lang.sysml.Association#getOwningConnector()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_OwningConnector();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.omg.sysml.lang.sysml.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Relationship#getRelated <em>Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related</em>'.
	 * @see org.omg.sysml.lang.sysml.Relationship#getRelated()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Related();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.omg.sysml.lang.sysml.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see org.omg.sysml.lang.sysml.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.lang.sysml.Element#getOwningMembership <em>Owning Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getOwningMembership()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwningMembership();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace <em>Owning Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Namespace</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getOwningNamespace()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwningNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.lang.sysml.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getOwnedElement()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwnedElement();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.lang.sysml.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getOwner()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Element#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getIdentifier()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Membership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership
	 * @generated
	 */
	EClass getMembership();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Membership#getMemberName <em>Member Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Name</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership#getMemberName()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_MemberName();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Membership#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership#getVisibility()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_Visibility();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.sysml.lang.sysml.Membership#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aliases</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership#getAliases()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_Aliases();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Membership#getMemberElement <em>Member Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership#getMemberElement()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_MemberElement();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningPackage <em>Membership Owning Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Membership Owning Package</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership#getMembershipOwningPackage()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_MembershipOwningPackage();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement <em>Owned Member Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Member Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_OwnedMemberElement();

	/**
	 * Returns the meta object for the '{@link org.omg.sysml.lang.sysml.Membership#isDistinguishableFrom(org.omg.sysml.lang.sysml.Membership) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Distinguishable From</em>' operation.
	 * @see org.omg.sysml.lang.sysml.Membership#isDistinguishableFrom(org.omg.sysml.lang.sysml.Membership)
	 * @generated
	 */
	EOperation getMembership__IsDistinguishableFrom__Membership();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.omg.sysml.lang.sysml.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Package#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getMembership()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Membership();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.lang.sysml.Package#getOwnedImport <em>Owned Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Import</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedImport()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedImport();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Package#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getMember()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Member();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Package#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Member</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedMember()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedMember();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Package#getImportedMembership <em>Imported Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getImportedMembership()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ImportedMembership();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.lang.sysml.Package#getOwnedMembership <em>Owned Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedMembership()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedMembership();

	/**
	 * Returns the meta object for the '{@link org.omg.sysml.lang.sysml.Package#nameOf(org.omg.sysml.lang.sysml.Element) <em>Name Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Of</em>' operation.
	 * @see org.omg.sysml.lang.sysml.Package#nameOf(org.omg.sysml.lang.sysml.Element)
	 * @generated
	 */
	EOperation getPackage__NameOf__Element();

	/**
	 * Returns the meta object for the '{@link org.omg.sysml.lang.sysml.Package#excludeCollisions(org.eclipse.emf.common.util.EList) <em>Exclude Collisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exclude Collisions</em>' operation.
	 * @see org.omg.sysml.lang.sysml.Package#excludeCollisions(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getPackage__ExcludeCollisions__EList();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.omg.sysml.lang.sysml.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Import#getImportedPackage <em>Imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Package</em>'.
	 * @see org.omg.sysml.lang.sysml.Import#getImportedPackage()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ImportedPackage();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Import#getSelecter <em>Selecter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selecter</em>'.
	 * @see org.omg.sysml.lang.sysml.Import#getSelecter()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Selecter();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Import#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.omg.sysml.lang.sysml.Import#getVisibility()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Visibility();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.lang.sysml.Import#getImportOwningPackage <em>Import Owning Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Import Owning Package</em>'.
	 * @see org.omg.sysml.lang.sysml.Import#getImportOwningPackage()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ImportOwningPackage();

	/**
	 * Returns the meta object for the '{@link org.omg.sysml.lang.sysml.Import#importedMembership() <em>Imported Membership</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Imported Membership</em>' operation.
	 * @see org.omg.sysml.lang.sysml.Import#importedMembership()
	 * @generated
	 */
	EOperation getImport__ImportedMembership();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see org.omg.sysml.lang.sysml.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.omg.sysml.lang.sysml.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.omg.sysml.lang.sysml.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Behavior#getTakesStep <em>Takes Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Takes Step</em>'.
	 * @see org.omg.sysml.lang.sysml.Behavior#getTakesStep()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_TakesStep();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Behavior#getInvolvesFeature <em>Involves Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involves Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Behavior#getInvolvesFeature()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_InvolvesFeature();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.omg.sysml.lang.sysml.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.omg.sysml.lang.sysml.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Category#getOwnedGeneralization <em>Owned Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Generalization</em>'.
	 * @see org.omg.sysml.lang.sysml.Category#getOwnedGeneralization()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_OwnedGeneralization();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Category#getOwnedFeatureMembership <em>Owned Feature Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Feature Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Category#getOwnedFeatureMembership()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_OwnedFeatureMembership();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Category#getOwnedFeature <em>Owned Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Category#getOwnedFeature()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_OwnedFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Category#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Category#getFeature()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Feature();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Category#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see org.omg.sysml.lang.sysml.Category#getInput()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Input();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Category#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see org.omg.sysml.lang.sysml.Category#getOutput()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Output();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Category#isAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.omg.sysml.lang.sysml.Category#isAbstract()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_IsAbstract();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see org.omg.sysml.lang.sysml.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see org.omg.sysml.lang.sysml.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_General();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specific</em>'.
	 * @see org.omg.sysml.lang.sysml.Generalization#getSpecific()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Specific();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Generalization#getOwningCategory <em>Owning Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Category</em>'.
	 * @see org.omg.sysml.lang.sysml.Generalization#getOwningCategory()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_OwningCategory();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.FeatureMembership <em>Feature Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership
	 * @generated
	 */
	EClass getFeatureMembership();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.FeatureMembership#isDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#isDerived()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EAttribute getFeatureMembership_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.FeatureMembership#isReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#isReadOnly()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EAttribute getFeatureMembership_IsReadOnly();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature <em>Member Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EReference getFeatureMembership_MemberFeature();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedFeatureElement <em>Owned Feature Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Feature Element</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getOwnedFeatureElement()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EReference getFeatureMembership_OwnedFeatureElement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.FeatureMembership#isPart <em>Is Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Part</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#isPart()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EAttribute getFeatureMembership_IsPart();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.FeatureMembership#isPort <em>Is Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Port</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#isPort()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EAttribute getFeatureMembership_IsPort();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.FeatureMembership#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getDirection()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EAttribute getFeatureMembership_Direction();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwningCategory <em>Owning Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Category</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getOwningCategory()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EReference getFeatureMembership_OwningCategory();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Feature#getReferencedType <em>Referenced Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getReferencedType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_ReferencedType();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Feature#getOwningCategory <em>Owning Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Category</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getOwningCategory()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwningCategory();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.lang.sysml.Feature#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getLower()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Lower();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.lang.sysml.Feature#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getUpper()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Upper();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Feature#isUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#isUnique()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Feature#isOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#isOrdered()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsOrdered();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Feature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Feature#getOwnedType <em>Owned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwnedType();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Feature#getOwnedRedefinition <em>Owned Redefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Redefinition</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedRedefinition()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwnedRedefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubset <em>Owned Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Subset</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedSubset()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwnedSubset();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.lang.sysml.Feature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getValue()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Value();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership <em>Owning Feature Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Feature Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwningFeatureMembership();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Feature#isComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#isComposite()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsComposite();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Feature#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getMultiplicity()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Feature#isNonunique <em>Is Nonunique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nonunique</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#isNonunique()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsNonunique();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Redefinition <em>Redefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefinition</em>'.
	 * @see org.omg.sysml.lang.sysml.Redefinition
	 * @generated
	 */
	EClass getRedefinition();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Redefinition#getRedefiningFeature <em>Redefining Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Redefining Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Redefinition#getRedefiningFeature()
	 * @see #getRedefinition()
	 * @generated
	 */
	EReference getRedefinition_RedefiningFeature();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Redefinition#getRedefinedFeature <em>Redefined Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Redefined Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Redefinition#getRedefinedFeature()
	 * @see #getRedefinition()
	 * @generated
	 */
	EReference getRedefinition_RedefinedFeature();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Subset <em>Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subset</em>'.
	 * @see org.omg.sysml.lang.sysml.Subset
	 * @generated
	 */
	EClass getSubset();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Subset#getSubsettedFeature <em>Subsetted Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subsetted Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Subset#getSubsettedFeature()
	 * @see #getSubset()
	 * @generated
	 */
	EReference getSubset_SubsettedFeature();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Subset#getSubsettingFeature <em>Subsetting Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subsetting Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Subset#getSubsettingFeature()
	 * @see #getSubset()
	 * @generated
	 */
	EReference getSubset_SubsettingFeature();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Subset#getOwningFeature <em>Owning Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Subset#getOwningFeature()
	 * @see #getSubset()
	 * @generated
	 */
	EReference getSubset_OwningFeature();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.omg.sysml.lang.sysml.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Step#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behavior</em>'.
	 * @see org.omg.sysml.lang.sysml.Step#getBehavior()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Behavior();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.EndFeatureMembership <em>End Feature Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Feature Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.EndFeatureMembership
	 * @generated
	 */
	EClass getEndFeatureMembership();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.EndFeatureMembership#getOwningAssociation <em>Owning Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Association</em>'.
	 * @see org.omg.sysml.lang.sysml.EndFeatureMembership#getOwningAssociation()
	 * @see #getEndFeatureMembership()
	 * @generated
	 */
	EReference getEndFeatureMembership_OwningAssociation();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.omg.sysml.lang.sysml.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.Connector#getRelatedFeatures <em>Related Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Features</em>'.
	 * @see org.omg.sysml.lang.sysml.Connector#getRelatedFeatures()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_RelatedFeatures();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Connector#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see org.omg.sysml.lang.sysml.Connector#getAssociation()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Association();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Connector#isDirected <em>Is Directed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Directed</em>'.
	 * @see org.omg.sysml.lang.sysml.Connector#isDirected()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsDirected();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.lang.sysml.Connector#getConnectorEnd <em>Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector End</em>'.
	 * @see org.omg.sysml.lang.sysml.Connector#getConnectorEnd()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ConnectorEnd();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType <em>Owned Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Association Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_OwnedAssociationType();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.ConnectorEnd <em>Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector End</em>'.
	 * @see org.omg.sysml.lang.sysml.ConnectorEnd
	 * @generated
	 */
	EClass getConnectorEnd();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.lang.sysml.ConnectorEnd#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower</em>'.
	 * @see org.omg.sysml.lang.sysml.ConnectorEnd#getLower()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_Lower();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.lang.sysml.ConnectorEnd#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper</em>'.
	 * @see org.omg.sysml.lang.sysml.ConnectorEnd#getUpper()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_Upper();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.ConnectorEnd#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.ConnectorEnd#getFeature()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_Feature();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.ConnectorEnd#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.omg.sysml.lang.sysml.ConnectorEnd#getEnd()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_End();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.ConnectorEnd#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.omg.sysml.lang.sysml.ConnectorEnd#getPath()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_Path();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.sysml.lang.sysml.ConnectorEnd#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connector</em>'.
	 * @see org.omg.sysml.lang.sysml.ConnectorEnd#getConnector()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_Connector();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.omg.sysml.lang.sysml.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.omg.sysml.lang.sysml.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.Comment#getCommentedElement <em>Commented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commented Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Comment#getCommentedElement()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_CommentedElement();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.ElementReferenceExpression <em>Element Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Reference Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.ElementReferenceExpression
	 * @generated
	 */
	EClass getElementReferenceExpression();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.ElementReferenceExpression#getReferent <em>Referent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referent</em>'.
	 * @see org.omg.sysml.lang.sysml.ElementReferenceExpression#getReferent()
	 * @see #getElementReferenceExpression()
	 * @generated
	 */
	EReference getElementReferenceExpression_Referent();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.FeatureAccessExpression <em>Feature Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Access Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureAccessExpression
	 * @generated
	 */
	EClass getFeatureAccessExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.lang.sysml.FeatureAccessExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureAccessExpression#getExpression()
	 * @see #getFeatureAccessExpression()
	 * @generated
	 */
	EReference getFeatureAccessExpression_Expression();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.FeatureAccessExpression#getAccessedFeature <em>Accessed Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accessed Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureAccessExpression#getAccessedFeature()
	 * @see #getFeatureAccessExpression()
	 * @generated
	 */
	EReference getFeatureAccessExpression_AccessedFeature();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.InstanceCreationExpression <em>Instance Creation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Creation Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.InstanceCreationExpression
	 * @generated
	 */
	EClass getInstanceCreationExpression();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.InstanceCreationExpression#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.omg.sysml.lang.sysml.InstanceCreationExpression#getClass_()
	 * @see #getInstanceCreationExpression()
	 * @generated
	 */
	EReference getInstanceCreationExpression_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.lang.sysml.InstanceCreationExpression#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see org.omg.sysml.lang.sysml.InstanceCreationExpression#getArgument()
	 * @see #getInstanceCreationExpression()
	 * @generated
	 */
	EReference getInstanceCreationExpression_Argument();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.ItemFlow <em>Item Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Flow</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlow
	 * @generated
	 */
	EClass getItemFlow();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.ItemFlow#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item Type</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlow#getItemType()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_ItemType();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.ItemFlow#getTargetInputFeature <em>Target Input Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Input Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlow#getTargetInputFeature()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_TargetInputFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.omg.sysml.lang.sysml.ItemFlow#getSourceOutputFeature <em>Source Output Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Output Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlow#getSourceOutputFeature()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_SourceOutputFeature();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Boolean</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralBoolean
	 * @generated
	 */
	EClass getLiteralBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.LiteralBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralBoolean#isValue()
	 * @see #getLiteralBoolean()
	 * @generated
	 */
	EAttribute getLiteralBoolean_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralExpression
	 * @generated
	 */
	EClass getLiteralExpression();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Integer</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralInteger
	 * @generated
	 */
	EClass getLiteralInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.LiteralInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralInteger#getValue()
	 * @see #getLiteralInteger()
	 * @generated
	 */
	EAttribute getLiteralInteger_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.LiteralNull <em>Literal Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Null</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralNull
	 * @generated
	 */
	EClass getLiteralNull();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.LiteralReal <em>Literal Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Real</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralReal
	 * @generated
	 */
	EClass getLiteralReal();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.LiteralReal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralReal#getValue()
	 * @see #getLiteralReal()
	 * @generated
	 */
	EAttribute getLiteralReal_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal String</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralString
	 * @generated
	 */
	EClass getLiteralString();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.LiteralString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralString#getValue()
	 * @see #getLiteralString()
	 * @generated
	 */
	EAttribute getLiteralString_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.LiteralUnbounded <em>Literal Unbounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Unbounded</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralUnbounded
	 * @generated
	 */
	EClass getLiteralUnbounded();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.OfSuccession <em>Of Succession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Of Succession</em>'.
	 * @see org.omg.sysml.lang.sysml.OfSuccession
	 * @generated
	 */
	EClass getOfSuccession();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.OfSuccession#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.omg.sysml.lang.sysml.OfSuccession#getTo()
	 * @see #getOfSuccession()
	 * @generated
	 */
	EReference getOfSuccession_To();

	/**
	 * Returns the meta object for the reference '{@link org.omg.sysml.lang.sysml.OfSuccession#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.omg.sysml.lang.sysml.OfSuccession#getFrom()
	 * @see #getOfSuccession()
	 * @generated
	 */
	EReference getOfSuccession_From();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.OrderedFeature <em>Ordered Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.OrderedFeature
	 * @generated
	 */
	EClass getOrderedFeature();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.StructuredFeature <em>Structured Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.StructuredFeature
	 * @generated
	 */
	EClass getStructuredFeature();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.OperatorExpression <em>Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.OperatorExpression
	 * @generated
	 */
	EClass getOperatorExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.lang.sysml.OperatorExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see org.omg.sysml.lang.sysml.OperatorExpression#getOperand()
	 * @see #getOperatorExpression()
	 * @generated
	 */
	EReference getOperatorExpression_Operand();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.sysml.lang.sysml.OperatorExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.omg.sysml.lang.sysml.OperatorExpression#getOperator()
	 * @see #getOperatorExpression()
	 * @generated
	 */
	EAttribute getOperatorExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.SequenceAccessExpression <em>Sequence Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Access Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.SequenceAccessExpression
	 * @generated
	 */
	EClass getSequenceAccessExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.lang.sysml.SequenceAccessExpression#getPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary</em>'.
	 * @see org.omg.sysml.lang.sysml.SequenceAccessExpression#getPrimary()
	 * @see #getSequenceAccessExpression()
	 * @generated
	 */
	EReference getSequenceAccessExpression_Primary();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.sysml.lang.sysml.SequenceAccessExpression#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see org.omg.sysml.lang.sysml.SequenceAccessExpression#getIndex()
	 * @see #getSequenceAccessExpression()
	 * @generated
	 */
	EReference getSequenceAccessExpression_Index();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.SequenceConstructionExpression <em>Sequence Construction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Construction Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.SequenceConstructionExpression
	 * @generated
	 */
	EClass getSequenceConstructionExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.sysml.lang.sysml.SequenceConstructionExpression#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.omg.sysml.lang.sysml.SequenceConstructionExpression#getElement()
	 * @see #getSequenceConstructionExpression()
	 * @generated
	 */
	EReference getSequenceConstructionExpression_Element();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Succession <em>Succession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Succession</em>'.
	 * @see org.omg.sysml.lang.sysml.Succession
	 * @generated
	 */
	EClass getSuccession();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.SuccessionItemFlow <em>Succession Item Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Succession Item Flow</em>'.
	 * @see org.omg.sysml.lang.sysml.SuccessionItemFlow
	 * @generated
	 */
	EClass getSuccessionItemFlow();

	/**
	 * Returns the meta object for enum '{@link org.omg.sysml.lang.sysml.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the meta object for enum '{@link org.omg.sysml.lang.sysml.FeatureDirectionKind <em>Feature Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Direction Kind</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureDirectionKind
	 * @generated
	 */
	EEnum getFeatureDirectionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SysMLFactory getSysMLFactory();

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
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.AssociationImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Related Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__RELATED_TYPE = eINSTANCE.getAssociation_RelatedType();

		/**
		 * The meta object literal for the '<em><b>Owned End Feature Membership</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP = eINSTANCE.getAssociation_OwnedEndFeatureMembership();

		/**
		 * The meta object literal for the '<em><b>Owning Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__OWNING_CONNECTOR = eINSTANCE.getAssociation_OwningConnector();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.RelationshipImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Related</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATED = eINSTANCE.getRelationship_Related();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.ElementImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Owning Membership</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNING_MEMBERSHIP = eINSTANCE.getElement_OwningMembership();

		/**
		 * The meta object literal for the '<em><b>Owning Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNING_NAMESPACE = eINSTANCE.getElement_OwningNamespace();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNED_ELEMENT = eINSTANCE.getElement_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNER = eINSTANCE.getElement_Owner();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IDENTIFIER = eINSTANCE.getElement_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.MembershipImpl <em>Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.MembershipImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getMembership()
		 * @generated
		 */
		EClass MEMBERSHIP = eINSTANCE.getMembership();

		/**
		 * The meta object literal for the '<em><b>Member Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__MEMBER_NAME = eINSTANCE.getMembership_MemberName();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__VISIBILITY = eINSTANCE.getMembership_Visibility();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__ALIASES = eINSTANCE.getMembership_Aliases();

		/**
		 * The meta object literal for the '<em><b>Member Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__MEMBER_ELEMENT = eINSTANCE.getMembership_MemberElement();

		/**
		 * The meta object literal for the '<em><b>Membership Owning Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE = eINSTANCE.getMembership_MembershipOwningPackage();

		/**
		 * The meta object literal for the '<em><b>Owned Member Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__OWNED_MEMBER_ELEMENT = eINSTANCE.getMembership_OwnedMemberElement();

		/**
		 * The meta object literal for the '<em><b>Is Distinguishable From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP = eINSTANCE.getMembership__IsDistinguishableFrom__Membership();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.PackageImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Membership</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__MEMBERSHIP = eINSTANCE.getPackage_Membership();

		/**
		 * The meta object literal for the '<em><b>Owned Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OWNED_IMPORT = eINSTANCE.getPackage_OwnedImport();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__MEMBER = eINSTANCE.getPackage_Member();

		/**
		 * The meta object literal for the '<em><b>Owned Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OWNED_MEMBER = eINSTANCE.getPackage_OwnedMember();

		/**
		 * The meta object literal for the '<em><b>Imported Membership</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__IMPORTED_MEMBERSHIP = eINSTANCE.getPackage_ImportedMembership();

		/**
		 * The meta object literal for the '<em><b>Owned Membership</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OWNED_MEMBERSHIP = eINSTANCE.getPackage_OwnedMembership();

		/**
		 * The meta object literal for the '<em><b>Name Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___NAME_OF__ELEMENT = eINSTANCE.getPackage__NameOf__Element();

		/**
		 * The meta object literal for the '<em><b>Exclude Collisions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___EXCLUDE_COLLISIONS__ELIST = eINSTANCE.getPackage__ExcludeCollisions__EList();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.ImportImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__IMPORTED_PACKAGE = eINSTANCE.getImport_ImportedPackage();

		/**
		 * The meta object literal for the '<em><b>Selecter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__SELECTER = eINSTANCE.getImport_Selecter();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__VISIBILITY = eINSTANCE.getImport_Visibility();

		/**
		 * The meta object literal for the '<em><b>Import Owning Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__IMPORT_OWNING_PACKAGE = eINSTANCE.getImport_ImportOwningPackage();

		/**
		 * The meta object literal for the '<em><b>Imported Membership</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPORT___IMPORTED_MEMBERSHIP = eINSTANCE.getImport__ImportedMembership();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.PredicateImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.FunctionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.BehaviorImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Takes Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__TAKES_STEP = eINSTANCE.getBehavior_TakesStep();

		/**
		 * The meta object literal for the '<em><b>Involves Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__INVOLVES_FEATURE = eINSTANCE.getBehavior_InvolvesFeature();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.ClassImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.CategoryImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Owned Generalization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__OWNED_GENERALIZATION = eINSTANCE.getCategory_OwnedGeneralization();

		/**
		 * The meta object literal for the '<em><b>Owned Feature Membership</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__OWNED_FEATURE_MEMBERSHIP = eINSTANCE.getCategory_OwnedFeatureMembership();

		/**
		 * The meta object literal for the '<em><b>Owned Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__OWNED_FEATURE = eINSTANCE.getCategory_OwnedFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__FEATURE = eINSTANCE.getCategory_Feature();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__INPUT = eINSTANCE.getCategory_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__OUTPUT = eINSTANCE.getCategory_Output();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__IS_ABSTRACT = eINSTANCE.getCategory_IsAbstract();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.GeneralizationImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getGeneralization()
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
		 * The meta object literal for the '<em><b>Specific</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

		/**
		 * The meta object literal for the '<em><b>Owning Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__OWNING_CATEGORY = eINSTANCE.getGeneralization_OwningCategory();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl <em>Feature Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureMembership()
		 * @generated
		 */
		EClass FEATURE_MEMBERSHIP = eINSTANCE.getFeatureMembership();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MEMBERSHIP__IS_DERIVED = eINSTANCE.getFeatureMembership_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MEMBERSHIP__IS_READ_ONLY = eINSTANCE.getFeatureMembership_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Member Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MEMBERSHIP__MEMBER_FEATURE = eINSTANCE.getFeatureMembership_MemberFeature();

		/**
		 * The meta object literal for the '<em><b>Owned Feature Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MEMBERSHIP__OWNED_FEATURE_ELEMENT = eINSTANCE.getFeatureMembership_OwnedFeatureElement();

		/**
		 * The meta object literal for the '<em><b>Is Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MEMBERSHIP__IS_PART = eINSTANCE.getFeatureMembership_IsPart();

		/**
		 * The meta object literal for the '<em><b>Is Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MEMBERSHIP__IS_PORT = eINSTANCE.getFeatureMembership_IsPort();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MEMBERSHIP__DIRECTION = eINSTANCE.getFeatureMembership_Direction();

		/**
		 * The meta object literal for the '<em><b>Owning Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MEMBERSHIP__OWNING_CATEGORY = eINSTANCE.getFeatureMembership_OwningCategory();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.FeatureImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Referenced Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REFERENCED_TYPE = eINSTANCE.getFeature_ReferencedType();

		/**
		 * The meta object literal for the '<em><b>Owning Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OWNING_CATEGORY = eINSTANCE.getFeature_OwningCategory();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__LOWER = eINSTANCE.getFeature_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__UPPER = eINSTANCE.getFeature_Upper();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_UNIQUE = eINSTANCE.getFeature_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_ORDERED = eINSTANCE.getFeature_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

		/**
		 * The meta object literal for the '<em><b>Owned Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OWNED_TYPE = eINSTANCE.getFeature_OwnedType();

		/**
		 * The meta object literal for the '<em><b>Owned Redefinition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OWNED_REDEFINITION = eINSTANCE.getFeature_OwnedRedefinition();

		/**
		 * The meta object literal for the '<em><b>Owned Subset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OWNED_SUBSET = eINSTANCE.getFeature_OwnedSubset();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__VALUE = eINSTANCE.getFeature_Value();

		/**
		 * The meta object literal for the '<em><b>Owning Feature Membership</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OWNING_FEATURE_MEMBERSHIP = eINSTANCE.getFeature_OwningFeatureMembership();

		/**
		 * The meta object literal for the '<em><b>Is Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_COMPOSITE = eINSTANCE.getFeature_IsComposite();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__MULTIPLICITY = eINSTANCE.getFeature_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Is Nonunique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_NONUNIQUE = eINSTANCE.getFeature_IsNonunique();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.ExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.RedefinitionImpl <em>Redefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.RedefinitionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getRedefinition()
		 * @generated
		 */
		EClass REDEFINITION = eINSTANCE.getRedefinition();

		/**
		 * The meta object literal for the '<em><b>Redefining Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINITION__REDEFINING_FEATURE = eINSTANCE.getRedefinition_RedefiningFeature();

		/**
		 * The meta object literal for the '<em><b>Redefined Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINITION__REDEFINED_FEATURE = eINSTANCE.getRedefinition_RedefinedFeature();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.SubsetImpl <em>Subset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.SubsetImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSubset()
		 * @generated
		 */
		EClass SUBSET = eINSTANCE.getSubset();

		/**
		 * The meta object literal for the '<em><b>Subsetted Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSET__SUBSETTED_FEATURE = eINSTANCE.getSubset_SubsettedFeature();

		/**
		 * The meta object literal for the '<em><b>Subsetting Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSET__SUBSETTING_FEATURE = eINSTANCE.getSubset_SubsettingFeature();

		/**
		 * The meta object literal for the '<em><b>Owning Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSET__OWNING_FEATURE = eINSTANCE.getSubset_OwningFeature();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.StepImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__BEHAVIOR = eINSTANCE.getStep_Behavior();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.EndFeatureMembershipImpl <em>End Feature Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.EndFeatureMembershipImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getEndFeatureMembership()
		 * @generated
		 */
		EClass END_FEATURE_MEMBERSHIP = eINSTANCE.getEndFeatureMembership();

		/**
		 * The meta object literal for the '<em><b>Owning Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION = eINSTANCE.getEndFeatureMembership_OwningAssociation();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.ConnectorImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Related Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__RELATED_FEATURES = eINSTANCE.getConnector_RelatedFeatures();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__ASSOCIATION = eINSTANCE.getConnector_Association();

		/**
		 * The meta object literal for the '<em><b>Is Directed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__IS_DIRECTED = eINSTANCE.getConnector_IsDirected();

		/**
		 * The meta object literal for the '<em><b>Connector End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__CONNECTOR_END = eINSTANCE.getConnector_ConnectorEnd();

		/**
		 * The meta object literal for the '<em><b>Owned Association Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__OWNED_ASSOCIATION_TYPE = eINSTANCE.getConnector_OwnedAssociationType();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl <em>Connector End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.ConnectorEndImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getConnectorEnd()
		 * @generated
		 */
		EClass CONNECTOR_END = eINSTANCE.getConnectorEnd();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__LOWER = eINSTANCE.getConnectorEnd_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__UPPER = eINSTANCE.getConnectorEnd_Upper();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__FEATURE = eINSTANCE.getConnectorEnd_Feature();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__END = eINSTANCE.getConnectorEnd_End();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__PATH = eINSTANCE.getConnectorEnd_Path();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__CONNECTOR = eINSTANCE.getConnectorEnd_Connector();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.CommentImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '<em><b>Commented Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__COMMENTED_ELEMENT = eINSTANCE.getComment_CommentedElement();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.ElementReferenceExpressionImpl <em>Element Reference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.ElementReferenceExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getElementReferenceExpression()
		 * @generated
		 */
		EClass ELEMENT_REFERENCE_EXPRESSION = eINSTANCE.getElementReferenceExpression();

		/**
		 * The meta object literal for the '<em><b>Referent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_REFERENCE_EXPRESSION__REFERENT = eINSTANCE.getElementReferenceExpression_Referent();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.FeatureAccessExpressionImpl <em>Feature Access Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.FeatureAccessExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureAccessExpression()
		 * @generated
		 */
		EClass FEATURE_ACCESS_EXPRESSION = eINSTANCE.getFeatureAccessExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ACCESS_EXPRESSION__EXPRESSION = eINSTANCE.getFeatureAccessExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Accessed Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ACCESS_EXPRESSION__ACCESSED_FEATURE = eINSTANCE.getFeatureAccessExpression_AccessedFeature();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.InstanceCreationExpressionImpl <em>Instance Creation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.InstanceCreationExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getInstanceCreationExpression()
		 * @generated
		 */
		EClass INSTANCE_CREATION_EXPRESSION = eINSTANCE.getInstanceCreationExpression();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CREATION_EXPRESSION__CLASS = eINSTANCE.getInstanceCreationExpression_Class();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CREATION_EXPRESSION__ARGUMENT = eINSTANCE.getInstanceCreationExpression_Argument();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl <em>Item Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.ItemFlowImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getItemFlow()
		 * @generated
		 */
		EClass ITEM_FLOW = eINSTANCE.getItemFlow();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_FLOW__ITEM_TYPE = eINSTANCE.getItemFlow_ItemType();

		/**
		 * The meta object literal for the '<em><b>Target Input Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_FLOW__TARGET_INPUT_FEATURE = eINSTANCE.getItemFlow_TargetInputFeature();

		/**
		 * The meta object literal for the '<em><b>Source Output Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_FLOW__SOURCE_OUTPUT_FEATURE = eINSTANCE.getItemFlow_SourceOutputFeature();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.LiteralBooleanImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralBoolean()
		 * @generated
		 */
		EClass LITERAL_BOOLEAN = eINSTANCE.getLiteralBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_BOOLEAN__VALUE = eINSTANCE.getLiteralBoolean_Value();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.LiteralExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralExpression()
		 * @generated
		 */
		EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.LiteralIntegerImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralInteger()
		 * @generated
		 */
		EClass LITERAL_INTEGER = eINSTANCE.getLiteralInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_INTEGER__VALUE = eINSTANCE.getLiteralInteger_Value();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.LiteralNullImpl <em>Literal Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.LiteralNullImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralNull()
		 * @generated
		 */
		EClass LITERAL_NULL = eINSTANCE.getLiteralNull();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.LiteralRealImpl <em>Literal Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.LiteralRealImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralReal()
		 * @generated
		 */
		EClass LITERAL_REAL = eINSTANCE.getLiteralReal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_REAL__VALUE = eINSTANCE.getLiteralReal_Value();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.LiteralStringImpl <em>Literal String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.LiteralStringImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralString()
		 * @generated
		 */
		EClass LITERAL_STRING = eINSTANCE.getLiteralString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_STRING__VALUE = eINSTANCE.getLiteralString_Value();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.LiteralUnboundedImpl <em>Literal Unbounded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.LiteralUnboundedImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralUnbounded()
		 * @generated
		 */
		EClass LITERAL_UNBOUNDED = eINSTANCE.getLiteralUnbounded();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.OfSuccessionImpl <em>Of Succession</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.OfSuccessionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOfSuccession()
		 * @generated
		 */
		EClass OF_SUCCESSION = eINSTANCE.getOfSuccession();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OF_SUCCESSION__TO = eINSTANCE.getOfSuccession_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OF_SUCCESSION__FROM = eINSTANCE.getOfSuccession_From();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.OrderedFeatureImpl <em>Ordered Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.OrderedFeatureImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOrderedFeature()
		 * @generated
		 */
		EClass ORDERED_FEATURE = eINSTANCE.getOrderedFeature();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.StructuredFeatureImpl <em>Structured Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.StructuredFeatureImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getStructuredFeature()
		 * @generated
		 */
		EClass STRUCTURED_FEATURE = eINSTANCE.getStructuredFeature();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.OperatorExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOperatorExpression()
		 * @generated
		 */
		EClass OPERATOR_EXPRESSION = eINSTANCE.getOperatorExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_EXPRESSION__OPERAND = eINSTANCE.getOperatorExpression_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR_EXPRESSION__OPERATOR = eINSTANCE.getOperatorExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.SequenceAccessExpressionImpl <em>Sequence Access Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.SequenceAccessExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSequenceAccessExpression()
		 * @generated
		 */
		EClass SEQUENCE_ACCESS_EXPRESSION = eINSTANCE.getSequenceAccessExpression();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_ACCESS_EXPRESSION__PRIMARY = eINSTANCE.getSequenceAccessExpression_Primary();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_ACCESS_EXPRESSION__INDEX = eINSTANCE.getSequenceAccessExpression_Index();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.SequenceConstructionExpressionImpl <em>Sequence Construction Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.SequenceConstructionExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSequenceConstructionExpression()
		 * @generated
		 */
		EClass SEQUENCE_CONSTRUCTION_EXPRESSION = eINSTANCE.getSequenceConstructionExpression();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT = eINSTANCE.getSequenceConstructionExpression_Element();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.SuccessionImpl <em>Succession</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.SuccessionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSuccession()
		 * @generated
		 */
		EClass SUCCESSION = eINSTANCE.getSuccession();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.impl.SuccessionItemFlowImpl <em>Succession Item Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.impl.SuccessionItemFlowImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSuccessionItemFlow()
		 * @generated
		 */
		EClass SUCCESSION_ITEM_FLOW = eINSTANCE.getSuccessionItemFlow();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.VisibilityKind <em>Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.VisibilityKind
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getVisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

		/**
		 * The meta object literal for the '{@link org.omg.sysml.lang.sysml.FeatureDirectionKind <em>Feature Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.sysml.lang.sysml.FeatureDirectionKind
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureDirectionKind()
		 * @generated
		 */
		EEnum FEATURE_DIRECTION_KIND = eINSTANCE.getFeatureDirectionKind();

	}

} //SysMLPackage
