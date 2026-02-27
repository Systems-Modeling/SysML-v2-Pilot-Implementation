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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FeatureReferenceExpression;
import org.omg.sysml.model.sysml.FeatureValue;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.Metaclass;
import org.omg.sysml.model.sysml.MetadataFeature;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureReferenceExpressionImpl#getReferent <em>Referent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureReferenceExpressionImpl extends ExpressionImpl implements FeatureReferenceExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureReferenceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_REFERENCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getReferent() {
		return (Feature)eGet(SysMLPackage.Literals.FEATURE_REFERENCE_EXPRESSION__REFERENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferent(Feature newReferent) {
		eSet(SysMLPackage.Literals.FEATURE_REFERENCE_EXPRESSION__REFERENT, newReferent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean modelLevelEvaluable(EList<Feature> visited) {
		var safeVisited = visited == null ? new BasicEList<Feature>() : visited;
		var referent = this.getReferent();
		if (referent == null) {
			return false;
		}
		var anythingSelfMembership = this.resolveGlobal("Anything::self");
		var isAnythingSelf = anythingSelfMembership != null && anythingSelfMembership.getMemberElement() == referent;
		if (isAnythingSelf) {
			return true;
		}
		if (safeVisited.contains(referent)) {
			return false;
		}
		if (referent instanceof Expression expression) {
			var nextVisited = new BasicEList<Feature>();
			nextVisited.addAll(safeVisited);
			nextVisited.add(referent);
			if (expression.modelLevelEvaluable(nextVisited)) {
				return true;
			}
		}
		var owningType = referent.getOwningType();
		if (owningType instanceof Metaclass || owningType instanceof MetadataFeature) {
			return true;
		}
		if (!referent.getFeaturingType().isEmpty()) {
			return false;
		}
		Expression valuation = null;
		for (Membership membership : referent.getOwnedMembership()) {
			if (membership instanceof FeatureValue featureValue) {
				valuation = featureValue.getValue();
				break;
			}
		}
		if (valuation == null) {
			return true;
		}
		var nextVisited = new BasicEList<Feature>();
		nextVisited.addAll(safeVisited);
		nextVisited.add(referent);
		return valuation.modelLevelEvaluable(nextVisited);
	}

} //FeatureReferenceExpressionImpl
