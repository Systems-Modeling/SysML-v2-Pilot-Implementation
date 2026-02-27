/*******************************************************************************
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
 *
 *******************************************************************************/
package org.omg.sysml.logic.delegate.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.common.util.BasicEList;
import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;
import org.omg.sysml.model.sysml.ConstructorExpression;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FeatureValue;
import org.omg.sysml.model.sysml.InvocationExpression;

/**
 * Generated setting delegate for {@code InstantiationExpression.argument}.
 */
public class InstantiationExpression_argument_SettingDelegate extends AbstractSettingDelegate {

    public InstantiationExpression_argument_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "InstantiationExpression.argument";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * OCL2.0 deriveInvocationExpressionArgument
         * instantiatedType.input->collect(inp |
         *     ownedFeatures->select(redefines(inp)).valuation->
         *     select(v | v <> null).value
         * )
         * OCL2.0 deriveConstructorExpressionArgument
         * instantiatedType.feature->collect(f |
         *     result.ownedFeatures->select(redefines(f)).valuation->
         *     select(v | v <> null).value
         * )
         */
        Object result = null;
        if (owner instanceof InvocationExpression self) {
            var values = new BasicEList<Expression>();
            var instantiatedType = self.getInstantiatedType();
            if (instantiatedType != null) {
                for (var input : instantiatedType.getInput()) {
                    for (var ownedFeature : self.getOwnedFeature()) {
                        if (ownedFeature.redefines(input)) {
                            addFeatureValues(values, ownedFeature);
                        }
                    }
                }
            }
            result = values;
        } else if (owner instanceof ConstructorExpression self) {
            var values = new BasicEList<Expression>();
            var instantiatedType = self.getInstantiatedType();
            var constructorResult = self.getResult();
            if (instantiatedType != null && constructorResult != null) {
                for (var featureValue : instantiatedType.getFeature()) {
                    for (var ownedFeature : constructorResult.getOwnedFeature()) {
                        if (ownedFeature.redefines(featureValue)) {
                            addFeatureValues(values, ownedFeature);
                        }
                    }
                }
            }
            result = values;
        } else {
            result = super.get(owner, resolve, coreType);
        }
        return result;
    }


/**
     * Collects non-null value expressions from {@link FeatureValue} memberships of a feature.
     */
    private void addFeatureValues(BasicEList<Expression> values, Feature feature) {
        for (var membership : feature.getOwnedMembership()) {
            if (membership instanceof FeatureValue featureValue) {
                var value = featureValue.getValue();
                if (value != null) {
                    values.add(value);
                }
            }
        }
    }
}
