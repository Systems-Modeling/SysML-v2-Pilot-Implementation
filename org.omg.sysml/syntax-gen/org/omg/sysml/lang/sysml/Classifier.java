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
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Classifier is a Type for model elements that classify:</p>
 * 
 * <ul>
 * 	<li>Things&nbsp;(in the universe) regardless of how Features relate them.&nbsp; These are&nbsp;sequences of exactly one&nbsp;thing (sequence of length 1).</li>
 * 	<li>How the above&nbsp;things are related by Features. These are sequences of multiple things (length &gt; 1).</li>
 * </ul>
 * 
 * <p>Classifiers that classify relationships (sequence length &gt; 1) must also classify the things at the end of those&nbsp;sequences (sequence length =1).&nbsp; Because of this, Classifiers specializing Features cannot classify anything (any sequences).</p>
 * 
 * ownedSubclassification = 
 *     ownedSpecialization->selectByKind(Superclassification)
 * multiplicity <> null implies multiplicity.featuringType->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Classifier#getOwnedSubclassification <em>Owned Subclassification</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getClassifier()
 * @model
 * @generated
 */
public interface Classifier extends Type {

	/**
	 * Returns the value of the '<em><b>Owned Subclassification</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Subclassification}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Subclassification#getOwningClassifier <em>Owning Classifier</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedSpecialization() <em>Owned Specialization</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedSpecializations</code> of this Classifier that are Subclassifications, for which this Classifier is the <code>subclassifier</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subclassification</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getClassifier_OwnedSubclassification()
	 * @see org.omg.sysml.lang.sysml.Subclassification#getOwningClassifier
	 * @model opposite="owningClassifier" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Subclassification> getOwnedSubclassification();
} // Classifier
