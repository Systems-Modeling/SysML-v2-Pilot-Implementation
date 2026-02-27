/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */
package org.omg.sysml.model.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminate Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>TerminateActionUsage</code> is an <code>ActionUsage</code> that directly or indirectly specializes the <code>ActionDefinition</code> <em><code>TerminateAction</code></em> from the Systems Model Library, which causes a given <em><code>terminatedOccurrence</code></em> to end during its performance. By default, the <code>terminatedOccurrence</code> is the featuring instance (<em><code>that</code></em>) of the performance of the <code>TerminateActionUsage</code>, generally the performance of its immediately containing <code>ActionDefinition</code> or <code>ActionUsage</code>.</p>
 * specializesFromLibrary('Actions::terminateActions')
 * terminatedOccurrenceArgument = argument(1)
 * isSubactionUsage() implies
 *     specializesFromLibrary('Actions::Action::terminateSubactions')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.TerminateActionUsage#getTerminatedOccurrenceArgument <em>Terminated Occurrence Argument</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getTerminateActionUsage()
 * @model
 * @generated
 */
public interface TerminateActionUsage extends ActionUsage {
	/**
	 * Returns the value of the '<em><b>Terminated Occurrence Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Expression</code> that is the <code>featureValue</code> of the <em><code>terminateOccurrence</code></em> <code>parameter</code> of this <code>TerminateActionUsage</code>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Terminated Occurrence Argument</em>' reference.
	 * @see #setTerminatedOccurrenceArgument(Expression)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getTerminateActionUsage_TerminatedOccurrenceArgument()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='terminateActionUsage'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getTerminatedOccurrenceArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.TerminateActionUsage#getTerminatedOccurrenceArgument <em>Terminated Occurrence Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminated Occurrence Argument</em>' reference.
	 * @see #getTerminatedOccurrenceArgument()
	 * @generated
	 */
	void setTerminatedOccurrenceArgument(Expression value);

} // TerminateActionUsage
