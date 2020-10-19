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
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Expose;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.ViewDefinition;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.ViewpointUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewUsageImpl#getViewDefinition <em>View Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewUsageImpl#getSatisfiedViewpoint <em>Satisfied Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewUsageImpl#getExposedPackage <em>Exposed Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewUsageImpl#getRendering <em>Rendering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewUsageImpl extends PartUsageImpl implements ViewUsage {
	
	public static final String VIEW_SUBSETTING_BASE_DEFAULT = "Views::views";
	public static final String VIEW_SUBSETTING_SUBVIEW_DEFAULT = "Views::View::subviews";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.VIEW_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewDefinition getViewDefinition() {
		ViewDefinition viewDefinition = basicGetViewDefinition();
		return viewDefinition != null && viewDefinition.eIsProxy() ? (ViewDefinition)eResolveProxy((InternalEObject)viewDefinition) : viewDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ViewDefinition basicGetViewDefinition() {
		return (ViewDefinition) super.getPartDefinition().stream().
				filter(ViewDefinition.class::isInstance).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setViewDefinition(ViewDefinition newViewDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetViewDefinition() {
		return basicGetViewDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ViewpointUsage> getSatisfiedViewpoint() {
		return new DerivedEObjectEList<>(ViewpointUsage.class, this, SysMLPackage.VIEW_USAGE__SATISFIED_VIEWPOINT, new int[] {SysMLPackage.USAGE__NESTED_USAGE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<org.omg.sysml.lang.sysml.Package> getExposedPackage() {
		EList<org.omg.sysml.lang.sysml.Package> exposedPackages = new EObjectEList<>(org.omg.sysml.lang.sysml.Package.class, this, SysMLPackage.VIEW_USAGE__EXPOSED_PACKAGE);
		getOwnedImport().stream().filter(Expose.class::isInstance).map(Import::getImportedPackage).forEachOrdered(exposedPackages::add);
		return exposedPackages;
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
		return (RenderingUsage)getFeature().stream().
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

	@Override
	protected String getDefaultSupertype() {
		return isSubview()? 
					VIEW_SUBSETTING_SUBVIEW_DEFAULT:
					VIEW_SUBSETTING_BASE_DEFAULT;
	}
	
	public boolean isSubview() {
		Type owningType = getOwningType();
		return owningType instanceof ViewDefinition | owningType instanceof ViewUsage;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.VIEW_USAGE__VIEW_DEFINITION:
				if (resolve) return getViewDefinition();
				return basicGetViewDefinition();
			case SysMLPackage.VIEW_USAGE__SATISFIED_VIEWPOINT:
				return getSatisfiedViewpoint();
			case SysMLPackage.VIEW_USAGE__EXPOSED_PACKAGE:
				return getExposedPackage();
			case SysMLPackage.VIEW_USAGE__RENDERING:
				if (resolve) return getRendering();
				return basicGetRendering();
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
			case SysMLPackage.VIEW_USAGE__VIEW_DEFINITION:
				setViewDefinition((ViewDefinition)newValue);
				return;
			case SysMLPackage.VIEW_USAGE__SATISFIED_VIEWPOINT:
				getSatisfiedViewpoint().clear();
				getSatisfiedViewpoint().addAll((Collection<? extends ViewpointUsage>)newValue);
				return;
			case SysMLPackage.VIEW_USAGE__EXPOSED_PACKAGE:
				getExposedPackage().clear();
				getExposedPackage().addAll((Collection<? extends org.omg.sysml.lang.sysml.Package>)newValue);
				return;
			case SysMLPackage.VIEW_USAGE__RENDERING:
				setRendering((RenderingUsage)newValue);
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
			case SysMLPackage.VIEW_USAGE__VIEW_DEFINITION:
				setViewDefinition((ViewDefinition)null);
				return;
			case SysMLPackage.VIEW_USAGE__SATISFIED_VIEWPOINT:
				getSatisfiedViewpoint().clear();
				return;
			case SysMLPackage.VIEW_USAGE__EXPOSED_PACKAGE:
				getExposedPackage().clear();
				return;
			case SysMLPackage.VIEW_USAGE__RENDERING:
				setRendering((RenderingUsage)null);
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
			case SysMLPackage.VIEW_USAGE__PART_DEFINITION:
				return isSetPartDefinition();
			case SysMLPackage.VIEW_USAGE__VIEW_DEFINITION:
				return isSetViewDefinition();
			case SysMLPackage.VIEW_USAGE__SATISFIED_VIEWPOINT:
				return !getSatisfiedViewpoint().isEmpty();
			case SysMLPackage.VIEW_USAGE__EXPOSED_PACKAGE:
				return !getExposedPackage().isEmpty();
			case SysMLPackage.VIEW_USAGE__RENDERING:
				return basicGetRendering() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PartDefinition> getPartDefinition() {
		EList<PartDefinition> partDefinition = new UniqueEList<PartDefinition>();
		ViewDefinition viewDefinition = getViewDefinition();
		if (viewDefinition != null) {
			partDefinition.add(viewDefinition);
		}
		return new UnionEObjectEList<PartDefinition>(this, SysMLPackage.Literals.PART_USAGE__PART_DEFINITION, partDefinition.size(), partDefinition.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPartDefinition() {
  		return false;
	}

} //ViewUsageImpl
