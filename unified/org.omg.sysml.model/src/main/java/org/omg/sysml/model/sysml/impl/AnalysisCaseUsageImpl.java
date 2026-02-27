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

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.AnalysisCaseDefinition;
import org.omg.sysml.model.sysml.AnalysisCaseUsage;
import org.omg.sysml.model.sysml.CaseDefinition;
import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Case Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.AnalysisCaseUsageImpl#getAnalysisCaseDefinition <em>Analysis Case Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.AnalysisCaseUsageImpl#getResultExpression <em>Result Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisCaseUsageImpl extends CaseUsageImpl implements AnalysisCaseUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisCaseUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ANALYSIS_CASE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisCaseDefinition getAnalysisCaseDefinition() {
		return (AnalysisCaseDefinition)eGet(SysMLPackage.Literals.ANALYSIS_CASE_USAGE__ANALYSIS_CASE_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnalysisCaseDefinition(AnalysisCaseDefinition newAnalysisCaseDefinition) {
		eSet(SysMLPackage.Literals.ANALYSIS_CASE_USAGE__ANALYSIS_CASE_DEFINITION, newAnalysisCaseDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getResultExpression() {
		return (Expression)eGet(SysMLPackage.Literals.ANALYSIS_CASE_USAGE__RESULT_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultExpression(Expression newResultExpression) {
		eSet(SysMLPackage.Literals.ANALYSIS_CASE_USAGE__RESULT_EXPRESSION, newResultExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseDefinition getCaseDefinition() {
		var sourceValue = this.getAnalysisCaseDefinition();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof CaseDefinition typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof CaseDefinition typedValue) {
			return typedValue;
		}
		return null;
	}

} //AnalysisCaseUsageImpl
