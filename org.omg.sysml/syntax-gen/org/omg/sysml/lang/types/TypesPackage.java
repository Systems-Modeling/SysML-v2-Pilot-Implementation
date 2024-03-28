/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.types;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.omg.sysml.lang.types.TypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='primitiveTypes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.omg.org/spec/SysML' invocationDelegates='http://www.omg.org/spec/SysML'"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.omg.org/spec/UML/20161101/PrimitiveTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "primitives";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = org.omg.sysml.lang.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.types.impl.TypesPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 0;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.types.impl.TypesPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 1;

	/**
	 * The meta object id for the '<em>Real</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.sysml.lang.types.impl.TypesPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 2;

	/**
	 * The meta object id for the '<em>Unlimited Natural</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.types.impl.TypesPackageImpl#getUnlimitedNatural()
	 * @generated
	 */
	int UNLIMITED_NATURAL = 3;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.omg.sysml.lang.types.impl.TypesPackageImpl#getString()
	 * @generated
	 */
	int STRING = 4;

	/**
	 * Returns the meta object for data type '<em>Boolean</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc --> <!-- begin-model-doc --> Boolean is used for
	 * logical expressions, consisting of the predefined values true and false. <!--
	 * end-model-doc -->
	 * 
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '<em>Integer</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc --> <!-- begin-model-doc --> Integer is a primitive
	 * type representing integer values. <!-- end-model-doc -->
	 * 
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '<em>Real</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc --> <!-- begin-model-doc --> Real is a primitive type
	 * representing the mathematical concept of real. <!-- end-model-doc -->
	 * 
	 * @return the meta object for data type '<em>Real</em>'.
	 * @model instanceClass="double"
	 * @generated
	 */
	EDataType getReal();

	/**
	 * Returns the meta object for data type '<em>Unlimited Natural</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * UnlimitedNatural is a primitive type representing unlimited natural values.
	 * <!-- end-model-doc -->
	 * 
	 * @return the meta object for data type '<em>Unlimited Natural</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getUnlimitedNatural();

	/**
	 * Returns the meta object for data type '{@link java.lang.String
	 * <em>String</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> String is a sequence of characters in some suitable
	 * character set used to display information about the model. Character sets may
	 * include non-Roman alphabets and characters. <!-- end-model-doc -->
	 * 
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '<em>Boolean</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.types.impl.TypesPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.types.impl.TypesPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Real</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.types.impl.TypesPackageImpl#getReal()
		 * @generated
		 */
		EDataType REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '<em>Unlimited Natural</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.types.impl.TypesPackageImpl#getUnlimitedNatural()
		 * @generated
		 */
		EDataType UNLIMITED_NATURAL = eINSTANCE.getUnlimitedNatural();

		/**
		 * The meta object literal for the '<em>String</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see org.omg.sysml.lang.types.impl.TypesPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} // TypesPackage
