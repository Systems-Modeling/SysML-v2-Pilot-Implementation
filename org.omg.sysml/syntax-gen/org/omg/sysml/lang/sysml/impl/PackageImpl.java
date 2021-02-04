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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.expressions.OCLExpression;
import org.omg.sysml.lang.sysml.AnnotatingFeature;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getFilterCondition <em>Filter Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements org.omg.sysml.lang.sysml.Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getFilterCondition() {
		EList<Expression> filterConditions = new NonNotifyingEObjectEList<>(Expression.class, this, SysMLPackage.PACKAGE__FILTER_CONDITION);
		getElementFilters().forEachOrdered(filterConditions::add);
		return filterConditions;
	}

	public EList<Membership> importedMemberships() {
		EList<Membership> importedMemberships = super.importedMemberships();
		importedMemberships.removeIf(membership->!includeAsMember(membership.getMemberElement()));
		return importedMemberships;
	}

	/**
	 * The cached OCL expression body for the '{@link #includeAsMember(org.omg.sysml.lang.sysml.Element) <em>Include As Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includeAsMember(org.omg.sysml.lang.sysml.Element)
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_AS_MEMBER__ELEMENT__EOCL_EXP = "let metadataAnnotations: Sequence(Element) = "+
"    element.ownedAnnotation.annotatingElement->"+
"        select(oclIsKindOf(AnnotatingFeature) in"+
"    self.filterCondition->exists(cond | "+
"        metadataAnnotations->forAll(elem | "+
"            self.checkCondition(elem, cond))";
	/**
	 * The cached OCL query for the '{@link #includeAsMember(org.omg.sysml.lang.sysml.Element) <em>Include As Member</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includeAsMember(org.omg.sysml.lang.sysml.Element)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> INCLUDE_AS_MEMBER__ELEMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean includeAsMember(Element element) {
		if (element == null) {
			return false;
		} else {
			List<AnnotatingFeature> annotatingFeatures = ((ElementImpl)element).getAllAnnotatingFeatures();
			return getFilterCondition().stream().allMatch(cond->
				annotatingFeatures.isEmpty()? checkCondition(null, cond):
				annotatingFeatures.stream().anyMatch(elem->checkCondition(elem, cond)));
		}
	}
	
	/**
	 * The cached OCL expression body for the '{@link #checkCondition(org.omg.sysml.lang.sysml.Element, org.omg.sysml.lang.sysml.Expression) <em>Check Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #checkCondition(org.omg.sysml.lang.sysml.Element, org.omg.sysml.lang.sysml.Expression)
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_CONDITION__ELEMENT_EXPRESSION__EOCL_EXP = "let result: Element = condition.evaluate(element) in"+
"    result.oclIsKindOf(LiteralBoolean) and "+
"    result.oclAsType(LiteralBoolean).value";
	/**
	 * The cached OCL query for the '{@link #checkCondition(org.omg.sysml.lang.sysml.Element, org.omg.sysml.lang.sysml.Expression) <em>Check Condition</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #checkCondition(org.omg.sysml.lang.sysml.Element, org.omg.sysml.lang.sysml.Expression)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> CHECK_CONDITION__ELEMENT_EXPRESSION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkCondition(Element element, Expression condition) {
		if (condition == null) {
			return true;
		} else {
			EList<Element> result = condition.evaluate(element);
			// If condition is ill-formed, ignore it.
			return result == null || result.size() != 1 || !(result.get(0) instanceof LiteralBoolean) || 
				   ((LiteralBoolean)result.get(0)).isValue();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PACKAGE__FILTER_CONDITION:
				return getFilterCondition();
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
			case SysMLPackage.PACKAGE__FILTER_CONDITION:
				getFilterCondition().clear();
				getFilterCondition().addAll((Collection<? extends Expression>)newValue);
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
			case SysMLPackage.PACKAGE__FILTER_CONDITION:
				getFilterCondition().clear();
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
			case SysMLPackage.PACKAGE__FILTER_CONDITION:
				return !getFilterCondition().isEmpty();
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
			case SysMLPackage.PACKAGE___INCLUDE_AS_MEMBER__ELEMENT:
				return includeAsMember((Element)arguments.get(0));
			case SysMLPackage.PACKAGE___CHECK_CONDITION__ELEMENT_EXPRESSION:
				return checkCondition((Element)arguments.get(0), (Expression)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PackageImpl
