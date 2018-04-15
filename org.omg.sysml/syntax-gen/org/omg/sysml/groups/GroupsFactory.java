/**
 */
package org.omg.sysml.groups;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.sysml.groups.GroupsPackage
 * @generated
 */
public interface GroupsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroupsFactory eINSTANCE = org.omg.sysml.groups.impl.GroupsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace</em>'.
	 * @generated
	 */
	Namespace createNamespace();

	/**
	 * Returns a new object of class '<em>Namespace Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace Import</em>'.
	 * @generated
	 */
	NamespaceImport createNamespaceImport();

	/**
	 * Returns a new object of class '<em>Element Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Group</em>'.
	 * @generated
	 */
	ElementGroup createElementGroup();

	/**
	 * Returns a new object of class '<em>Group Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Import</em>'.
	 * @generated
	 */
	GroupImport createGroupImport();

	/**
	 * Returns a new object of class '<em>Member Naming</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Naming</em>'.
	 * @generated
	 */
	MemberNaming createMemberNaming();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GroupsPackage getGroupsPackage();

} //GroupsFactory
