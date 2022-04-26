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
import java.util.stream.Stream;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ElementFilterMembership;
import org.omg.sysml.lang.sysml.Expose;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.ViewDefinition;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.ViewpointUsage;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewUsageImpl#getExposedNamespace <em>Exposed Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewUsageImpl#getViewRendering <em>View Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewUsageImpl#getViewCondition <em>View Condition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewUsageImpl#getViewedElement <em>Viewed Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewUsageImpl extends PartUsageImpl implements ViewUsage {
	
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
	 * @generated
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
	public EList<Namespace> getExposedNamespace() {
		EList<Namespace> exposedNamespace = new NonNotifyingEObjectEList<>(Namespace.class, this, SysMLPackage.VIEW_USAGE__EXPOSED_NAMESPACE);
		getExposeImports().map(Import::getImportedNamespace).forEachOrdered(exposedNamespace::add);
		return exposedNamespace;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenderingUsage getViewRendering() {
		RenderingUsage viewRendering = basicGetViewRendering();
		return viewRendering != null && viewRendering.eIsProxy() ? (RenderingUsage)eResolveProxy((InternalEObject)viewRendering) : viewRendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RenderingUsage basicGetViewRendering() {
		EList<RenderingUsage> renderings = getNestedRendering();
		return renderings.isEmpty()? UsageUtil.getViewRenderingOf(this): renderings.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setViewRendering(RenderingUsage newViewRendering) {
		throw new UnsupportedOperationException();
	}

	public Stream<Expose> getExposeImports() {
		return getOwnedImport().stream().
				filter(Expose.class::isInstance).
				map(Expose.class::cast);
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getViewCondition() {
		EList<Expression> viewConditions = new NonNotifyingEObjectEList<>(Expression.class, this, SysMLPackage.VIEW_DEFINITION__VIEW_CONDITION);
		NamespaceUtil.getOwnedMembersByMembershipIn(this, ElementFilterMembership.class, Expression.class).forEachOrdered(viewConditions::add);
		return viewConditions;
	}
	
	public EList<Expression> getAllViewConditions() {
		EList<Expression> viewConditions = getViewCondition();
		TypeUtil.getInheritedMembersByMembershipIn(this, ElementFilterMembership.class, Expression.class).forEachOrdered(viewConditions::add);
		return viewConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getViewedElement() {
		EList<Element> viewedElements = new NonNotifyingEObjectEList<>(Element.class, this, SysMLPackage.VIEW_USAGE__VIEWED_ELEMENT);
		getExposeImports().
			flatMap(imp->imp.importedMembership(new BasicEList<>()).stream()).
			map(Membership::getMemberElement).
			forEachOrdered(viewedElements::add);
		EList<Expression> viewConditions = getAllViewConditions();
		viewedElements.removeIf(element->!ExpressionUtil.checkConditionsOn(element, viewConditions));
		return viewedElements;
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
			case SysMLPackage.VIEW_USAGE__EXPOSED_NAMESPACE:
				return getExposedNamespace();
			case SysMLPackage.VIEW_USAGE__VIEW_RENDERING:
				if (resolve) return getViewRendering();
				return basicGetViewRendering();
			case SysMLPackage.VIEW_USAGE__VIEW_CONDITION:
				return getViewCondition();
			case SysMLPackage.VIEW_USAGE__VIEWED_ELEMENT:
				return getViewedElement();
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
			case SysMLPackage.VIEW_USAGE__EXPOSED_NAMESPACE:
				getExposedNamespace().clear();
				getExposedNamespace().addAll((Collection<? extends Namespace>)newValue);
				return;
			case SysMLPackage.VIEW_USAGE__VIEW_RENDERING:
				setViewRendering((RenderingUsage)newValue);
				return;
			case SysMLPackage.VIEW_USAGE__VIEW_CONDITION:
				getViewCondition().clear();
				getViewCondition().addAll((Collection<? extends Expression>)newValue);
				return;
			case SysMLPackage.VIEW_USAGE__VIEWED_ELEMENT:
				getViewedElement().clear();
				getViewedElement().addAll((Collection<? extends Element>)newValue);
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
			case SysMLPackage.VIEW_USAGE__EXPOSED_NAMESPACE:
				getExposedNamespace().clear();
				return;
			case SysMLPackage.VIEW_USAGE__VIEW_RENDERING:
				setViewRendering((RenderingUsage)null);
				return;
			case SysMLPackage.VIEW_USAGE__VIEW_CONDITION:
				getViewCondition().clear();
				return;
			case SysMLPackage.VIEW_USAGE__VIEWED_ELEMENT:
				getViewedElement().clear();
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
			case SysMLPackage.VIEW_USAGE__EXPOSED_NAMESPACE:
				return !getExposedNamespace().isEmpty();
			case SysMLPackage.VIEW_USAGE__VIEW_RENDERING:
				return basicGetViewRendering() != null;
			case SysMLPackage.VIEW_USAGE__VIEW_CONDITION:
				return !getViewCondition().isEmpty();
			case SysMLPackage.VIEW_USAGE__VIEWED_ELEMENT:
				return !getViewedElement().isEmpty();
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
