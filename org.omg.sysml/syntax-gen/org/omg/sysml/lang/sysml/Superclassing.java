/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Superclassing</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Superclassing is Generalization in which both the specific and general Types are Classifiers. This means all sequences&nbsp;of the specific Classifier are&nbsp;also sequences of the general Classifier.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Superclassing#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Superclassing#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Superclassing#getOwningClassifier <em>Owning Classifier</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuperclassing()
 * @model
 * @generated
 */
public interface Superclassing extends Generalization {
	/**
	 * Returns the value of the '<em><b>Superclass</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getGeneral() <em>General</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclass</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The more general Classifier in the pair linked by Superclassing.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Superclass</em>' reference.
	 * @see #setSuperclass(Classifier)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuperclassing_Superclass()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='subclassing'"
	 *        annotation="redefines"
	 * @generated
	 */
	Classifier getSuperclass();

	/**
	 * Sets the value of the
	 * '{@link org.omg.sysml.lang.sysml.Superclassing#getSuperclass
	 * <em>Superclass</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Superclass</em>' reference.
	 * @see #getSuperclass()
	 * @generated
	 */
	void setSuperclass(Classifier value);

	/**
	 * Returns the value of the '<em><b>Subclass</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getSpecific() <em>Specific</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclass</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The more specific Classifier in the pair linked by Superclassing.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subclass</em>' reference.
	 * @see #setSubclass(Classifier)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuperclassing_Subclass()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='superclassing'"
	 *        annotation="redefines"
	 * @generated
	 */
	Classifier getSubclass();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Superclassing#getSubclass <em>Subclass</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subclass</em>' reference.
	 * @see #getSubclass()
	 * @generated
	 */
	void setSubclass(Classifier value);

	/**
	 * Returns the value of the '<em><b>Owning Classifier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Classifier#getOwnedSuperclassing <em>Owned Superclassing</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The more general Classifier in the pair linked by Superclassing and that owns the relationship.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Classifier</em>' reference.
	 * @see #setOwningClassifier(Classifier)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuperclassing_OwningClassifier()
	 * @see org.omg.sysml.lang.sysml.Classifier#getOwnedSuperclassing
	 * @model opposite="ownedSuperclassing" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Classifier getOwningClassifier();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Superclassing#getOwningClassifier <em>Owning Classifier</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Classifier</em>' reference.
	 * @see #getOwningClassifier()
	 * @generated
	 */
	void setOwningClassifier(Classifier value);

} // Superclassing
