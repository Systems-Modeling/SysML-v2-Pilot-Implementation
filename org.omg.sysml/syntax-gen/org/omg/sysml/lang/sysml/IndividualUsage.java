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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An IndividualUsage is a ItemUsage exactly one of whose types is an IndividualDefinition, specifying the usage of the represented individual, or a portion of it, in a certain context.</p>
 * isTimeSlice = (timeSliceFeature <> null)
 * isSnapshot = (snapshotFeature <> Null)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.IndividualUsage#getIndividualDefinition <em>Individual Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.IndividualUsage#isTimeSlice <em>Is Time Slice</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.IndividualUsage#isSnapshot <em>Is Snapshot</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.IndividualUsage#getTimeSliceFeature <em>Time Slice Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.IndividualUsage#getSnapshotFeature <em>Snapshot Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIndividualUsage()
 * @model
 * @generated
 */
public interface IndividualUsage extends ItemUsage {
	/**
	 * Returns the value of the '<em><b>Individual Definition</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ItemUsage#getItemDefinition() <em>Item Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p.>The one type of the IndividualUsage that is the IndividualDefinition defining the individual thing being represented. (Note that the IndividualUsage may have other types in addition to this that are not IndividualDefinitions.)</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Individual Definition</em>' reference.
	 * @see #setIndividualDefinition(IndividualDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIndividualUsage_IndividualDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='individualUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	IndividualDefinition getIndividualDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.IndividualUsage#getIndividualDefinition <em>Individual Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Definition</em>' reference.
	 * @see #getIndividualDefinition()
	 * @generated
	 */
	void setIndividualDefinition(IndividualDefinition value);

	/**
	 * Returns the value of the '<em><b>Is Time Slice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Time Slice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this IndividualUsage represents a temporal portion of the entire spacial extent of an individual over some duration of time, as indicated by whether or not it has a <t>timeSliceFeature</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Time Slice</em>' attribute.
	 * @see #setIsTimeSlice(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIndividualUsage_IsTimeSlice()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isTimeSlice();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.IndividualUsage#isTimeSlice <em>Is Time Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Time Slice</em>' attribute.
	 * @see #isTimeSlice()
	 * @generated
	 */
	void setIsTimeSlice(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Snapshot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Snapshot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this IndividualUsage represents a temporal portion of the entire spacial extent of an individual at one instance of time, as indicated by whether or not it has a <t>snapshotFeature</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Snapshot</em>' attribute.
	 * @see #setIsSnapshot(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIndividualUsage_IsSnapshot()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isSnapshot();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.IndividualUsage#isSnapshot <em>Is Snapshot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Snapshot</em>' attribute.
	 * @see #isSnapshot()
	 * @generated
	 */
	void setIsSnapshot(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Slice Feature</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Slice Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An <code>ownedFeature</code> of this IndividualUsage that is a redefinition of the Feature <code>Occurrence::timeSliceOf</code> and is typed by the <code>individualDefinition</code>. An IndividualUsage with such a feature is restricted to represent a time slice of the represented individual.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Slice Feature</em>' reference.
	 * @see #setTimeSliceFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIndividualUsage_TimeSliceFeature()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='timeSliceUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	Feature getTimeSliceFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.IndividualUsage#getTimeSliceFeature <em>Time Slice Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Slice Feature</em>' reference.
	 * @see #getTimeSliceFeature()
	 * @generated
	 */
	void setTimeSliceFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Snapshot Feature</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snapshot Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An <code>ownedFeature</code> of this IndividualUsage that is a redefinition of the Feature <code>Occurrence::snapshotOf</code> and is typed by the <code>individualDefinition</code>. An IndividualUsage with such a feature is restricted to represent a snapshot of the represented individual.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Snapshot Feature</em>' reference.
	 * @see #setSnapshotFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIndividualUsage_SnapshotFeature()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='snapshotUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	Feature getSnapshotFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.IndividualUsage#getSnapshotFeature <em>Snapshot Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snapshot Feature</em>' reference.
	 * @see #getSnapshotFeature()
	 * @generated
	 */
	void setSnapshotFeature(Feature value);

} // IndividualUsage
