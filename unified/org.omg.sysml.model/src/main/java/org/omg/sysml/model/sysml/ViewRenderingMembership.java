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
 * A representation of the model object '<em><b>View Rendering Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ViewRenderingMembership</code> is a <coed>FeatureMembership</code> that identifies the <code>viewRendering</code> of a <code>ViewDefinition</code> or <code>ViewUsage</code>.</p>
 * referencedRendering =
 *     let referencedFeature : Feature = 
 *         ownedRendering.referencedFeatureTarget() in
 *     if referencedFeature = null then ownedRendering
 *     else if referencedFeature.oclIsKindOf(RenderingUsage) then
 *         refrencedFeature.oclAsType(RenderingUsage)
 *     else null
 *     endif endif
 * owningType.oclIsKindOf(ViewDefinition) or
 * owningType.oclIsKindOf(ViewUsage)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.ViewRenderingMembership#getOwnedRendering <em>Owned Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.ViewRenderingMembership#getReferencedRendering <em>Referenced Rendering</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getViewRenderingMembership()
 * @model
 * @generated
 */
public interface ViewRenderingMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Owned Rendering</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owned <code>RenderingUsage</code> that is either itself the <code>referencedRendering</code> or subsets the <code>referencedRendering</code>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Rendering</em>' reference.
	 * @see #setOwnedRendering(RenderingUsage)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getViewRenderingMembership_OwnedRendering()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewRenderingMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	RenderingUsage getOwnedRendering();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.ViewRenderingMembership#getOwnedRendering <em>Owned Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Rendering</em>' reference.
	 * @see #getOwnedRendering()
	 * @generated
	 */
	void setOwnedRendering(RenderingUsage value);

	/**
	 * Returns the value of the '<em><b>Referenced Rendering</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p> The <code>RenderingUsage</code> that is referenced through this <code>ViewRenderingMembership</code>. It is the <code>referencedFeature</code> of the <code>ownedReferenceSubsetting</code> for the <code>ownedRendering</code>, if there is one, and, otherwise, the <code>ownedRendering</code> itself.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Rendering</em>' reference.
	 * @see #setReferencedRendering(RenderingUsage)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getViewRenderingMembership_ReferencedRendering()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referencingRenderingMembership'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	RenderingUsage getReferencedRendering();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.ViewRenderingMembership#getReferencedRendering <em>Referenced Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Rendering</em>' reference.
	 * @see #getReferencedRendering()
	 * @generated
	 */
	void setReferencedRendering(RenderingUsage value);

} // ViewRenderingMembership
