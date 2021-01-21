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
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.ViewDefinition;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.ViewpointUsage;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewDefinitionImpl#getView <em>View</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewDefinitionImpl#getSatisfiedViewpoint <em>Satisfied Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewDefinitionImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewDefinitionImpl#getViewCondition <em>View Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewDefinitionImpl extends PartDefinitionImpl implements ViewDefinition {

	public static final String VIEW_DEFINITION_SUPERCLASS_DEFAULT = "Views::View";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.VIEW_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ViewUsage> getView() {
		return new DerivedEObjectEList<>(ViewUsage.class, this, SysMLPackage.VIEW_DEFINITION__VIEW, new int[] {SysMLPackage.DEFINITION__USAGE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ViewpointUsage> getSatisfiedViewpoint() {
		return new DerivedEObjectEList<>(ViewpointUsage.class, this, SysMLPackage.VIEW_DEFINITION__SATISFIED_VIEWPOINT, new int[] {SysMLPackage.DEFINITION__OWNED_USAGE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenderingUsage getRendering() {
		RenderingUsage rendering = basicGetRendering();
		return rendering != null && rendering.eIsProxy() ? (RenderingUsage)eResolveProxy((InternalEObject)rendering) : rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RenderingUsage basicGetRendering() {
		return (RenderingUsage)getOwnedUsage().stream().
				filter(RenderingUsage.class::isInstance).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setRendering(RenderingUsage newRendering) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getViewCondition() {
		EList<Expression> viewConditions = new NonNotifyingEObjectEList<>(Expression.class, this, SysMLPackage.VIEW_DEFINITION__VIEW_CONDITION);
		getElementFilters().forEachOrdered(viewConditions::add);
		return viewConditions;
	}

	@Override
	protected String getDefaultSupertype() {
		return VIEW_DEFINITION_SUPERCLASS_DEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.VIEW_DEFINITION__VIEW:
				return getView();
			case SysMLPackage.VIEW_DEFINITION__SATISFIED_VIEWPOINT:
				return getSatisfiedViewpoint();
			case SysMLPackage.VIEW_DEFINITION__RENDERING:
				if (resolve) return getRendering();
				return basicGetRendering();
			case SysMLPackage.VIEW_DEFINITION__VIEW_CONDITION:
				return getViewCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.VIEW_DEFINITION__VIEW:
				getView().clear();
				getView().addAll((Collection<? extends ViewUsage>)newValue);
				return;
			case SysMLPackage.VIEW_DEFINITION__SATISFIED_VIEWPOINT:
				getSatisfiedViewpoint().clear();
				getSatisfiedViewpoint().addAll((Collection<? extends ViewpointUsage>)newValue);
				return;
			case SysMLPackage.VIEW_DEFINITION__RENDERING:
				setRendering((RenderingUsage)newValue);
				return;
			case SysMLPackage.VIEW_DEFINITION__VIEW_CONDITION:
				getViewCondition().clear();
				getViewCondition().addAll((Collection<? extends Expression>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.VIEW_DEFINITION__VIEW:
				getView().clear();
				return;
			case SysMLPackage.VIEW_DEFINITION__SATISFIED_VIEWPOINT:
				getSatisfiedViewpoint().clear();
				return;
			case SysMLPackage.VIEW_DEFINITION__RENDERING:
				setRendering((RenderingUsage)null);
				return;
			case SysMLPackage.VIEW_DEFINITION__VIEW_CONDITION:
				getViewCondition().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.VIEW_DEFINITION__VIEW:
				return !getView().isEmpty();
			case SysMLPackage.VIEW_DEFINITION__SATISFIED_VIEWPOINT:
				return !getSatisfiedViewpoint().isEmpty();
			case SysMLPackage.VIEW_DEFINITION__RENDERING:
				return basicGetRendering() != null;
			case SysMLPackage.VIEW_DEFINITION__VIEW_CONDITION:
				return !getViewCondition().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewDefinitionImpl
