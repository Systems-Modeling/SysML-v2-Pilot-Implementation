/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewUsageImpl#getExposedElement <em>Exposed Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewUsageImpl#getViewRendering <em>View Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewUsageImpl#getViewCondition <em>View Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewUsageImpl extends PartUsageImpl implements ViewUsage {
	
	/**
	 * The cached setting delegate for the '{@link #getViewDefinition() <em>View Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VIEW_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.VIEW_USAGE__VIEW_DEFINITION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSatisfiedViewpoint() <em>Satisfied Viewpoint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiedViewpoint()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SATISFIED_VIEWPOINT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.VIEW_USAGE__SATISFIED_VIEWPOINT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getExposedElement() <em>Exposed Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposedElement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EXPOSED_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.VIEW_USAGE__EXPOSED_ELEMENT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getViewRendering() <em>View Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRendering()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VIEW_RENDERING__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.VIEW_USAGE__VIEW_RENDERING).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getViewCondition() <em>View Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewCondition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VIEW_CONDITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.VIEW_USAGE__VIEW_CONDITION).getSettingDelegate();

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
		return (ViewDefinition)VIEW_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewDefinition basicGetViewDefinition() {
		return (ViewDefinition)VIEW_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewDefinition(ViewDefinition newViewDefinition) {
		VIEW_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newViewDefinition);
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<ViewpointUsage> getSatisfiedViewpoint() {
		return (EList<ViewpointUsage>)SATISFIED_VIEWPOINT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getExposedElement() {
		return (EList<Element>)EXPOSED_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenderingUsage getViewRendering() {
		return (RenderingUsage)VIEW_RENDERING__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingUsage basicGetViewRendering() {
		return (RenderingUsage)VIEW_RENDERING__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewRendering(RenderingUsage newViewRendering) {
		VIEW_RENDERING__ESETTING_DELEGATE.dynamicSet(this, null, 0, newViewRendering);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Expression> getViewCondition() {
		return (EList<Expression>)VIEW_CONDITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * The cached invocation delegate for the '{@link #includeAsExposed(org.omg.sysml.lang.sysml.Element) <em>Include As Exposed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includeAsExposed(org.omg.sysml.lang.sysml.Element)
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
	
	// Operations
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includeAsExposed(Element element) {
		try {
			return (Boolean)INCLUDE_AS_EXPOSED_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{element}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	//

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
			case SysMLPackage.VIEW_USAGE__EXPOSED_ELEMENT:
				return getExposedElement();
			case SysMLPackage.VIEW_USAGE__VIEW_RENDERING:
				if (resolve) return getViewRendering();
				return basicGetViewRendering();
			case SysMLPackage.VIEW_USAGE__VIEW_CONDITION:
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
			case SysMLPackage.VIEW_USAGE__VIEW_DEFINITION:
				setViewDefinition((ViewDefinition)newValue);
				return;
			case SysMLPackage.VIEW_USAGE__SATISFIED_VIEWPOINT:
				getSatisfiedViewpoint().clear();
				getSatisfiedViewpoint().addAll((Collection<? extends ViewpointUsage>)newValue);
				return;
			case SysMLPackage.VIEW_USAGE__EXPOSED_ELEMENT:
				getExposedElement().clear();
				getExposedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.VIEW_USAGE__VIEW_RENDERING:
				setViewRendering((RenderingUsage)newValue);
				return;
			case SysMLPackage.VIEW_USAGE__VIEW_CONDITION:
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
			case SysMLPackage.VIEW_USAGE__VIEW_DEFINITION:
				setViewDefinition((ViewDefinition)null);
				return;
			case SysMLPackage.VIEW_USAGE__SATISFIED_VIEWPOINT:
				getSatisfiedViewpoint().clear();
				return;
			case SysMLPackage.VIEW_USAGE__EXPOSED_ELEMENT:
				getExposedElement().clear();
				return;
			case SysMLPackage.VIEW_USAGE__VIEW_RENDERING:
				setViewRendering((RenderingUsage)null);
				return;
			case SysMLPackage.VIEW_USAGE__VIEW_CONDITION:
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
			case SysMLPackage.VIEW_USAGE__PART_DEFINITION:
				return isSetPartDefinition();
			case SysMLPackage.VIEW_USAGE__VIEW_DEFINITION:
				return isSetViewDefinition();
			case SysMLPackage.VIEW_USAGE__SATISFIED_VIEWPOINT:
				return SATISFIED_VIEWPOINT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.VIEW_USAGE__EXPOSED_ELEMENT:
				return EXPOSED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.VIEW_USAGE__VIEW_RENDERING:
				return VIEW_RENDERING__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.VIEW_USAGE__VIEW_CONDITION:
				return VIEW_CONDITION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
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

} //ViewUsageImpl
