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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.ActionUsage;
import org.omg.sysml.model.sysml.FeatureDirectionKind;
import org.omg.sysml.model.sysml.MetadataFeature;
import org.omg.sysml.model.sysml.ParameterMembership;
import org.omg.sysml.model.sysml.ReturnParameterMembership;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Invocation semantics tests for Feature rules.
 */
public class InvocationSemanticsFeatureTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void featureAllRedefinedFeaturesRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        var result = semantics.invokeInvocation("Feature_allRedefinedFeatures_InvocationDelegate",
                "Feature", "allRedefinedFeatures", 0, feature, null);
        assertEquals(1, ((EList<?>) result).size());
        assertTrue(((EList<?>) result).contains(feature));
        var operationResult = feature.allRedefinedFeatures();
        assertEquals(1, operationResult.size());
        assertTrue(operationResult.contains(feature));
    }

    @Test
    void featureAsCartesianProductRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertTrue(((EList<?>) semantics.invokeInvocation("Feature_asCartesianProduct_InvocationDelegate",
                "Feature", "asCartesianProduct", 0, feature, null)).isEmpty());
        assertTrue(feature.asCartesianProduct().isEmpty());
    }

    @Test
    void featureCanAccessRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        ActionUsage otherFeature = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("Feature_canAccess_InvocationDelegate",
                "Feature", "canAccess", 1, feature, semantics.args(otherFeature)));
        assertFalse(feature.canAccess(otherFeature));
    }

    @Test
    void featureDirectionForRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.invokeInvocation("Feature_directionFor_InvocationDelegate",
                "Feature", "directionFor", 1, feature, semantics.args((Object) null)));
        assertNull(feature.directionFor(null));
    }

    @Test
    void featureEffectiveNameRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        feature.setDeclaredName("featureName");
        assertEquals("featureName", semantics.invokeInvocation("Feature_effectiveName_InvocationDelegate",
                "Feature", "effectiveName", 0, feature, null));
        assertEquals("featureName", feature.effectiveName());
    }

    @Test
    void featureEffectiveShortNameRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        feature.setDeclaredShortName("f");
        assertEquals("f", semantics.invokeInvocation("Feature_effectiveShortName_InvocationDelegate",
                "Feature", "effectiveShortName", 0, feature, null));
        assertEquals("f", feature.effectiveShortName());
    }

    @Test
    void featureIsCartesianProductRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("Feature_isCartesianProduct_InvocationDelegate",
                "Feature", "isCartesianProduct", 0, feature, null));
        assertFalse(feature.isCartesianProduct());
    }

    @Test
    void featureIsCompatibleWithRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("Feature_isCompatibleWith_InvocationDelegate",
                "Feature", "isCompatibleWith", 1, feature, semantics.args((Object) null)));
        assertFalse(feature.isCompatibleWith(null));
    }

    @Test
    void featureIsFeaturedWithinRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertTrue((Boolean) semantics.invokeInvocation("Feature_isFeaturedWithin_InvocationDelegate",
                "Feature", "isFeaturedWithin", 1, feature, semantics.args((Object) null)));
        assertTrue(feature.isFeaturedWithin(null));
    }

    @Test
    void featureIsFeaturingTypeRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("Feature_isFeaturingType_InvocationDelegate",
                "Feature", "isFeaturingType", 1, feature, semantics.args(type)));
        assertFalse(feature.isFeaturingType(type));
    }

    @Test
    void featureIsFeaturingTypeForNonVariableOwningTypeRule() throws Exception {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        feature.setIsVariable(false);
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("Feature_isFeaturingType_InvocationDelegate",
                "Feature", "isFeaturingType", 1, feature, semantics.args(type)));
        assertFalse(feature.isFeaturingType(type));
    }

    @Test
    void featureIsOwnedCrossFeatureRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("Feature_isOwnedCrossFeature_InvocationDelegate",
                "Feature", "isOwnedCrossFeature", 0, feature, null));
        assertFalse(feature.isOwnedCrossFeature());
    }

    @Test
    void featureNamingFeatureRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.invokeInvocation("Feature_namingFeature_InvocationDelegate",
                "Feature", "namingFeature", 0, feature, null));
        assertNull(feature.namingFeature());
    }

    @Test
    void featureOwnedCrossFeatureRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.invokeInvocation("Feature_ownedCrossFeature_InvocationDelegate",
                "Feature", "ownedCrossFeature", 0, feature, null));
        assertNull(feature.ownedCrossFeature());
    }

    @Test
    void featureRedefinesFromLibraryRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("Feature_redefinesFromLibrary_InvocationDelegate",
                "Feature", "redefinesFromLibrary", 1, feature, semantics.args("Non::Existing::Feature")));
        assertFalse(feature.redefinesFromLibrary("Non::Existing::Feature"));
    }

    @Test
    void featureRedefinesRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        ActionUsage redefinedFeature = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("Feature_redefines_InvocationDelegate",
                "Feature", "redefines", 1, feature, semantics.args(redefinedFeature)));
        assertFalse(feature.redefines(redefinedFeature));
    }

    @Test
    void featureSubsetsChainRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        ActionUsage first = SysMLFactory.eINSTANCE.createActionUsage();
        ActionUsage second = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("Feature_subsetsChain_InvocationDelegate",
                "Feature", "subsetsChain", 2, feature, semantics.args(first, second)));
        assertFalse(feature.subsetsChain(first, second));
    }

    @Test
    void featureSupertypesRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertTrue(((EList<?>) semantics.invokeInvocation("Feature_supertypes_InvocationDelegate",
                "Feature", "supertypes", 1, feature, semantics.args(Boolean.FALSE))).isEmpty());
        assertTrue(feature.supertypes(false).isEmpty());
    }

    @Test
    void featureTypingFeaturesRule() throws Exception {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertTrue(((EList<?>) semantics.invokeInvocation("Feature_typingFeatures_InvocationDelegate",
                "Feature", "typingFeatures", 0, feature, null)).isEmpty());
        assertTrue(feature.typingFeatures().isEmpty());
    }

    @Test
    void metadataFeatureIsSyntacticRule() throws Exception {
        MetadataFeature metadataFeature = SysMLFactory.eINSTANCE.createMetadataFeature();
        assertFalse((Boolean) semantics.invokeInvocation("MetadataFeature_isSyntactic_InvocationDelegate",
                "MetadataFeature", "isSyntactic", 0, metadataFeature, null));
        assertFalse(metadataFeature.isSyntactic());
    }

    @Test
    void metadataFeatureIsSemanticRule() throws Exception {
        MetadataFeature metadataFeature = SysMLFactory.eINSTANCE.createMetadataFeature();
        assertFalse((Boolean) semantics.invokeInvocation("MetadataFeature_isSemantic_InvocationDelegate",
                "MetadataFeature", "isSemantic", 0, metadataFeature, null));
        assertFalse(metadataFeature.isSemantic());
    }

    @Test
    void parameterMembershipParameterDirectionRule() throws Exception {
        ParameterMembership parameterMembership = SysMLFactory.eINSTANCE.createParameterMembership();
        assertEquals(FeatureDirectionKind.IN, semantics.invokeInvocation(
                "ParameterMembership_parameterDirection_InvocationDelegate",
                "ParameterMembership", "parameterDirection", 0, parameterMembership, null));
        assertEquals(FeatureDirectionKind.IN, parameterMembership.parameterDirection());
    }

    @Test
    void returnParameterMembershipParameterDirectionRule() throws Exception {
        ReturnParameterMembership returnParameterMembership = SysMLFactory.eINSTANCE.createReturnParameterMembership();
        assertEquals(FeatureDirectionKind.OUT, semantics.invokeInvocation(
                "ReturnParameterMembership_parameterDirection_InvocationDelegate",
                "ReturnParameterMembership", "parameterDirection", 0, returnParameterMembership, null));
        assertEquals(FeatureDirectionKind.OUT, returnParameterMembership.parameterDirection());
    }

    @Test
    void metadataFeatureEvaluateFeatureRule() throws Exception {
        MetadataFeature metadataFeature = SysMLFactory.eINSTANCE.createMetadataFeature();
        ActionUsage baseFeature = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.invokeInvocation("MetadataFeature_evaluateFeature_InvocationDelegate",
                "MetadataFeature", "evaluateFeature", 1, metadataFeature, semantics.args(baseFeature)));
        assertNull(metadataFeature.evaluateFeature(baseFeature));
    }

    @Test
    void featureIsFeaturedWithinWithTypeArgumentRule() throws Exception {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        assertTrue((Boolean) semantics.invokeInvocation("Feature_isFeaturedWithin_InvocationDelegate",
                "Feature", "isFeaturedWithin", 1, feature, semantics.args(type)));
        assertTrue(feature.isFeaturedWithin(type));
    }

    @Test
    void metadataFeatureSyntaxElementRule() throws Exception {
        MetadataFeature metadataFeature = SysMLFactory.eINSTANCE.createMetadataFeature();
        assertNull(semantics.invokeInvocation("MetadataFeature_syntaxElement_InvocationDelegate",
                "MetadataFeature", "syntaxElement", 0, metadataFeature, null));
        assertNull(metadataFeature.syntaxElement());
    }
}
