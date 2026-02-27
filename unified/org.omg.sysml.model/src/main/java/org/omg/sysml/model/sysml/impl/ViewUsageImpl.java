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
package org.omg.sysml.model.sysml.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.model.sysml.PartDefinition;
import org.omg.sysml.model.sysml.RenderingUsage;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.ViewDefinition;
import org.omg.sysml.model.sysml.ViewUsage;
import org.omg.sysml.model.sysml.ViewpointUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ViewUsageImpl#getExposedElement <em>Exposed Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ViewUsageImpl#getSatisfiedViewpoint <em>Satisfied Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ViewUsageImpl#getViewCondition <em>View Condition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ViewUsageImpl#getViewDefinition <em>View Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ViewUsageImpl#getViewRendering <em>View Rendering</em>}</li>
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getExposedElement() {
		return (EList<Element>)eGet(SysMLPackage.Literals.VIEW_USAGE__EXPOSED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ViewpointUsage> getSatisfiedViewpoint() {
		return (EList<ViewpointUsage>)eGet(SysMLPackage.Literals.VIEW_USAGE__SATISFIED_VIEWPOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Expression> getViewCondition() {
		return (EList<Expression>)eGet(SysMLPackage.Literals.VIEW_USAGE__VIEW_CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewDefinition getViewDefinition() {
		return (ViewDefinition)eGet(SysMLPackage.Literals.VIEW_USAGE__VIEW_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewDefinition(ViewDefinition newViewDefinition) {
		eSet(SysMLPackage.Literals.VIEW_USAGE__VIEW_DEFINITION, newViewDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenderingUsage getViewRendering() {
		return (RenderingUsage)eGet(SysMLPackage.Literals.VIEW_USAGE__VIEW_RENDERING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewRendering(RenderingUsage newViewRendering) {
		eSet(SysMLPackage.Literals.VIEW_USAGE__VIEW_RENDERING, newViewRendering);
	}

	/**
	 * The cached invocation delegate for the '{@link #includeAsExposed(org.omg.sysml.model.sysml.Element) <em>Include As Exposed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includeAsExposed(org.omg.sysml.model.sysml.Element)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INCLUDE_AS_EXPOSED_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.VIEW_USAGE___INCLUDE_AS_EXPOSED__ELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean includeAsExposed(Element element) {
		try {
			return (Boolean)INCLUDE_AS_EXPOSED_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{element}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.VIEW_USAGE___INCLUDE_AS_EXPOSED__ELEMENT:
				return includeAsExposed((Element)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PartDefinition> getPartDefinition() {
		var sourceValue = this.getViewDefinition();
		Object source = sourceValue;
		var result = new BasicEList<PartDefinition>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof PartDefinition typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof PartDefinition typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}

} //ViewUsageImpl
