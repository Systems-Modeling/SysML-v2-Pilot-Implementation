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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.ConstructorExpression;
import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FeatureChainExpression;
import org.omg.sysml.model.sysml.Function;
import org.omg.sysml.model.sysml.InvocationExpression;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Setting semantics tests for Expression and Expression-derived metaclasses.
 */
public class SettingSemanticsExpressionTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void instantiationExpressionInstantiatedTypeSettingRule() {
        ConstructorExpression constructorExpression = SysMLFactory.eINSTANCE.createConstructorExpression();
        assertNull(semantics.evaluateSetting("InstantiationExpression", "instantiatedType", constructorExpression));
        assertNull(constructorExpression.getInstantiatedType());
    }

    @Test
    void featureReferenceExpressionReferentSettingRule() {
        var featureReferenceExpression = SysMLFactory.eINSTANCE.createFeatureReferenceExpression();
        assertNull(semantics.evaluateSetting(
                "FeatureReferenceExpression", "referent", featureReferenceExpression));
        assertNull(featureReferenceExpression.getReferent());
    }

    @Test
    void expressionResultSettingRule() {
        Expression expression = SysMLFactory.eINSTANCE.createFeatureReferenceExpression();
        assertNull(semantics.evaluateSetting("Expression", "result", expression));
        assertNull(expression.getResult());
    }

    @Test
    void functionResultSettingRule() {
        Function function = SysMLFactory.eINSTANCE.createFunction();
        assertNull(semantics.evaluateSetting("Function", "result", function));
        assertNull(function.getResult());
    }

    @Test
    void functionIsModelLevelEvaluableSettingRule() {
        Function function = SysMLFactory.eINSTANCE.createFunction();
        assertFalse((Boolean) semantics.evaluateSetting("Function", "isModelLevelEvaluable", function));
        assertFalse(function.isIsModelLevelEvaluable());
    }

    @Test
    void expressionIsModelLevelEvaluableSettingRule() {
        var expression = SysMLFactory.eINSTANCE.createFeatureReferenceExpression();
        assertEquals(
                expression.modelLevelEvaluable(new BasicEList<Feature>()),
                semantics.evaluateSetting("Expression", "isModelLevelEvaluable", expression));
        assertEquals(
                expression.modelLevelEvaluable(new BasicEList<Feature>()), expression.isIsModelLevelEvaluable());
    }

    @Test
    void instantiationExpressionArgumentSettingInvocationRule() {
        InvocationExpression invocationExpression = SysMLFactory.eINSTANCE.createInvocationExpression();
        var result = semantics.evaluateSetting("InstantiationExpression", "argument", invocationExpression);
        assertTrue(result instanceof EList<?>);
        assertTrue(((EList<?>) result).isEmpty());
    }

    @Test
    void instantiationExpressionArgumentSettingConstructorRule() {
        ConstructorExpression constructorExpression = SysMLFactory.eINSTANCE.createConstructorExpression();
        var result = semantics.evaluateSetting("InstantiationExpression", "argument", constructorExpression);
        assertTrue(result instanceof EList<?>);
        assertTrue(((EList<?>) result).isEmpty());
    }

    @Test
    void featureChainExpressionTargetFeatureSettingRule() {
        FeatureChainExpression featureChainExpression = SysMLFactory.eINSTANCE.createFeatureChainExpression();
        assertNull(semantics.evaluateSetting(
                "FeatureChainExpression", "targetFeature", featureChainExpression));
        assertNull(featureChainExpression.getTargetFeature());
    }

}
