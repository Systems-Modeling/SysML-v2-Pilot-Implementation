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
package org.omg.sysml.logic.delegate.invocation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.CalculationUsage;
import org.omg.sysml.model.sysml.Comment;
import org.omg.sysml.model.sysml.ConstraintDefinition;
import org.omg.sysml.model.sysml.ConstructorExpression;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FeatureChainExpression;
import org.omg.sysml.model.sysml.FeatureReferenceExpression;
import org.omg.sysml.model.sysml.InvocationExpression;
import org.omg.sysml.model.sysml.LiteralBoolean;
import org.omg.sysml.model.sysml.MetadataAccessExpression;
import org.omg.sysml.model.sysml.NullExpression;
import org.omg.sysml.model.sysml.OperatorExpression;
import org.omg.sysml.model.sysml.SysMLFactory;
import org.omg.sysml.model.sysml.TriggerInvocationExpression;

/**
 * Invocation semantics tests for Expression and Expression-derived metaclasses.
 */
public class InvocationSemanticsExpressionTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void constructorExpressionModelLevelEvaluableRule() throws Exception {
        ConstructorExpression constructorExpression = SysMLFactory.eINSTANCE.createConstructorExpression();
        var visited = new BasicEList<Feature>();
        assertTrue((Boolean) semantics.invokeInvocation("ConstructorExpression_modelLevelEvaluable_InvocationDelegate",
                "ConstructorExpression", "modelLevelEvaluable", 1, constructorExpression, semantics.args(visited)));
        assertTrue(constructorExpression.modelLevelEvaluable(visited));
    }

    @Test
    void expressionCheckConditionRule() throws Exception {
        CalculationUsage expression = SysMLFactory.eINSTANCE.createCalculationUsage();
        Comment element = SysMLFactory.eINSTANCE.createComment();
        assertFalse((Boolean) semantics.invokeInvocation("Expression_checkCondition_InvocationDelegate",
                "Expression", "checkCondition", 1, expression, semantics.args(element)));
        assertFalse(expression.checkCondition(element));
    }

    @Test
    void expressionEvaluateRule() throws Exception {
        CalculationUsage expression = SysMLFactory.eINSTANCE.createCalculationUsage();
        Comment element = SysMLFactory.eINSTANCE.createComment();
        assertTrue(((EList<?>) semantics.invokeInvocation("Expression_evaluate_InvocationDelegate",
                "Expression", "evaluate", 1, expression, semantics.args(element))).isEmpty());
        assertTrue(expression.evaluate(element).isEmpty());
    }

    @Test
    void expressionModelLevelEvaluableRule() throws Exception {
        ConstructorExpression expression = SysMLFactory.eINSTANCE.createConstructorExpression();
        var visited = new BasicEList<Feature>();
        assertTrue((Boolean) semantics.invokeInvocation("Expression_modelLevelEvaluable_InvocationDelegate",
                "Expression", "modelLevelEvaluable", 1, expression, semantics.args(visited)));
        assertTrue(expression.modelLevelEvaluable(visited));
    }

    @Test
    void featureChainExpressionSourceTargetFeatureRule() throws Exception {
        FeatureChainExpression featureChainExpression = SysMLFactory.eINSTANCE.createFeatureChainExpression();
        assertNull(semantics.invokeInvocation("FeatureChainExpression_sourceTargetFeature_InvocationDelegate",
                "FeatureChainExpression", "sourceTargetFeature", 0, featureChainExpression, null));
        assertNull(featureChainExpression.sourceTargetFeature());
    }

    @Test
    void featureReferenceExpressionEvaluateRule() throws Exception {
        FeatureReferenceExpression featureReferenceExpression = SysMLFactory.eINSTANCE.createFeatureReferenceExpression();
        ConstraintDefinition typeTarget = SysMLFactory.eINSTANCE.createConstraintDefinition();
        assertTrue(((EList<?>) semantics.invokeInvocation("FeatureReferenceExpression_evaluate_InvocationDelegate",
                "FeatureReferenceExpression", "evaluate", 1, featureReferenceExpression, semantics.args(typeTarget))).isEmpty());
        assertTrue(featureReferenceExpression.evaluate(typeTarget).isEmpty());
    }

    @Test
    void featureReferenceExpressionModelLevelEvaluableRule() throws Exception {
        FeatureReferenceExpression featureReferenceExpression = SysMLFactory.eINSTANCE.createFeatureReferenceExpression();
        var visited = new BasicEList<Feature>();
        assertFalse((Boolean) semantics.invokeInvocation("FeatureReferenceExpression_modelLevelEvaluable_InvocationDelegate",
                "FeatureReferenceExpression", "modelLevelEvaluable", 1, featureReferenceExpression, semantics.args(visited)));
        assertFalse(featureReferenceExpression.modelLevelEvaluable(visited));
    }

    @Test
    void instantiationExpressionInstantiatedTypeRule() throws Exception {
        ConstructorExpression instantiationExpression = SysMLFactory.eINSTANCE.createConstructorExpression();
        assertNull(semantics.invokeInvocation("InstantiationExpression_instantiatedType_InvocationDelegate",
                "InstantiationExpression", "instantiatedType", 0, instantiationExpression, null));
        assertNull(instantiationExpression.instantiatedType());
    }

    @Test
    void invocationExpressionModelLevelEvaluableRule() throws Exception {
        InvocationExpression invocationExpression = SysMLFactory.eINSTANCE.createInvocationExpression();
        var visited = new BasicEList<Feature>();
        assertFalse((Boolean) semantics.invokeInvocation("InvocationExpression_modelLevelEvaluable_InvocationDelegate",
                "InvocationExpression", "modelLevelEvaluable", 1, invocationExpression, semantics.args(visited)));
        assertFalse(invocationExpression.modelLevelEvaluable(visited));
    }

    @Test
    void literalExpressionEvaluateRule() throws Exception {
        LiteralBoolean literal = SysMLFactory.eINSTANCE.createLiteralBoolean();
        EList<?> result = (EList<?>) semantics.invokeInvocation("LiteralExpression_evaluate_InvocationDelegate",
                "LiteralExpression", "evaluate", 1, literal, semantics.args((Object) null));
        assertTrue(result.contains(literal));
        assertTrue(literal.evaluate(null).contains(literal));
    }

    @Test
    void literalExpressionModelLevelEvaluableRule() throws Exception {
        LiteralBoolean literal = SysMLFactory.eINSTANCE.createLiteralBoolean();
        assertTrue((Boolean) semantics.invokeInvocation("LiteralExpression_modelLevelEvaluable_InvocationDelegate",
                "LiteralExpression", "modelLevelEvaluable", 1, literal, semantics.visitedArg()));
        assertTrue(literal.modelLevelEvaluable(new BasicEList<Feature>()));
    }

    @Test
    void metadataAccessExpressionEvaluateRule() throws Exception {
        MetadataAccessExpression metadataAccessExpression = SysMLFactory.eINSTANCE.createMetadataAccessExpression();
        assertTrue(((EList<?>) semantics.invokeInvocation("MetadataAccessExpression_evaluate_InvocationDelegate",
                "MetadataAccessExpression", "evaluate", 1, metadataAccessExpression, semantics.args((Object) null))).isEmpty());
        assertTrue(metadataAccessExpression.evaluate(null).isEmpty());
    }

    @Test
    void metadataAccessExpressionModelLevelEvaluableRule() throws Exception {
        MetadataAccessExpression metadataAccessExpression = SysMLFactory.eINSTANCE.createMetadataAccessExpression();
        assertTrue((Boolean) semantics.invokeInvocation("MetadataAccessExpression_modelLevelEvaluable_InvocationDelegate",
                "MetadataAccessExpression", "modelLevelEvaluable", 1, metadataAccessExpression, semantics.visitedArg()));
        assertTrue(metadataAccessExpression.modelLevelEvaluable(new BasicEList<Feature>()));
    }

    @Test
    void metadataAccessExpressionMetaclassFeatureFallbackRule() throws Exception {
        var metadataAccessExpression = SysMLFactory.eINSTANCE.createMetadataAccessExpression();
        assertNull(semantics.invokeInvocation("MetadataAccessExpression_metaclassFeature_InvocationDelegate",
                "MetadataAccessExpression", "metaclassFeature", 0, metadataAccessExpression, null));
        assertNull(metadataAccessExpression.metaclassFeature());
    }

    @Test
    void nullExpressionModelLevelEvaluableRule() throws Exception {
        NullExpression nullExpression = SysMLFactory.eINSTANCE.createNullExpression();
        assertTrue((Boolean) semantics.invokeInvocation("NullExpression_modelLevelEvaluable_InvocationDelegate",
                "NullExpression", "modelLevelEvaluable", 1, nullExpression, semantics.visitedArg()));
        assertTrue(nullExpression.modelLevelEvaluable(new BasicEList<Feature>()));
    }

    @Test
    void nullExpressionEvaluateRule() throws Exception {
        NullExpression nullExpression = SysMLFactory.eINSTANCE.createNullExpression();
        assertTrue(((EList<?>) semantics.invokeInvocation("NullExpression_evaluate_InvocationDelegate",
                "NullExpression", "evaluate", 1, nullExpression, semantics.args((Object) null))).isEmpty());
        assertTrue(nullExpression.evaluate(null).isEmpty());
    }

    @Test
    void operatorExpressionInstantiatedTypeRule() throws Exception {
        OperatorExpression operatorExpression = SysMLFactory.eINSTANCE.createOperatorExpression();
        operatorExpression.setOperator("+");
        assertNull(semantics.invokeInvocation("OperatorExpression_instantiatedType_InvocationDelegate",
                "OperatorExpression", "instantiatedType", 0, operatorExpression, null));
        assertNull(operatorExpression.instantiatedType());
    }

    @Test
    void triggerInvocationExpressionInstantiatedTypeRule() throws Exception {
        TriggerInvocationExpression triggerInvocationExpression = SysMLFactory.eINSTANCE.createTriggerInvocationExpression();
        assertNull(semantics.invokeInvocation("TriggerInvocationExpression_instantiatedType_InvocationDelegate",
                "TriggerInvocationExpression", "instantiatedType", 0, triggerInvocationExpression, null));
        assertNull(triggerInvocationExpression.instantiatedType());
    }
}
