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

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.ActionUsage;
import org.omg.sysml.model.sysml.ConjugatedPortTyping;
import org.omg.sysml.model.sysml.MultiplicityRange;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Setting semantics tests for Feature and Feature-derived metaclasses.
 */
public class SettingSemanticsFeatureTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void conjugatedPortTypingPortDefinitionSettingRule() {
        ConjugatedPortTyping conjugatedPortTyping = SysMLFactory.eINSTANCE.createConjugatedPortTyping();
        assertNull(semantics.evaluateSetting("ConjugatedPortTyping", "portDefinition", conjugatedPortTyping));
        assertNull(conjugatedPortTyping.getPortDefinition());
    }

    @Test
    void featureOwnedRedefinitionSettingRule() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Feature", "ownedRedefinition", feature);
        assertTrue(result.isEmpty());
        assertTrue(feature.getOwnedRedefinition().isEmpty());
    }

    @Test
    void featureEndOwningTypeSettingRuleReturnsNullWhenNotAnEnd() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        var owningType = SysMLFactory.eINSTANCE.createPartDefinition();
        var featureMembership = SysMLFactory.eINSTANCE.createFeatureMembership();
        featureMembership.setOwningRelatedElement(owningType);
        featureMembership.setMemberElement(feature);

        assertNull(semantics.evaluateSetting("Feature", "endOwningType", feature));
        assertNull(feature.getEndOwningType());
    }

    @Test
    void featureTypeSettingRule() {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Feature", "type", feature);
        assertTrue(result.isEmpty());
        assertTrue(feature.getType().isEmpty());
    }

    @Test
    void featureFeatureTargetSettingRule() {
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertSame(feature, semantics.evaluateSetting("Feature", "featureTarget", feature));
        assertSame(feature, feature.getFeatureTarget());
    }

    @Test
    void featureOwnedReferenceSubsettingSettingRule() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.evaluateSetting("Feature", "ownedReferenceSubsetting", feature));
        assertNull(feature.getOwnedReferenceSubsetting());
    }

    @Test
    void featureFeaturingTypeSettingRule() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Feature", "featuringType", feature);
        assertTrue(result.isEmpty());
        assertTrue(feature.getFeaturingType().isEmpty());
    }

    @Test
    void featureOwnedFeatureChainingSettingRule() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Feature", "ownedFeatureChaining", feature);
        assertTrue(result.isEmpty());
        assertTrue(feature.getOwnedFeatureChaining().isEmpty());
    }

    @Test
    void featureOwnedCrossSubsettingSettingRule() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.evaluateSetting("Feature", "ownedCrossSubsetting", feature));
        assertNull(feature.getOwnedCrossSubsetting());
    }

    @Test
    void multiplicityRangeUpperBoundSettingRule() {
        MultiplicityRange multiplicityRange = SysMLFactory.eINSTANCE.createMultiplicityRange();
        assertNull(semantics.evaluateSetting("MultiplicityRange", "upperBound", multiplicityRange));
        assertNull(multiplicityRange.getUpperBound());
    }

    @Test
    void featureOwnedFeatureInvertingSettingRule() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Feature", "ownedFeatureInverting", feature);
        assertTrue(result.isEmpty());
        assertTrue(feature.getOwnedFeatureInverting().isEmpty());
    }

    @Test
    void multiplicityRangeBoundSettingRule() {
        var multiplicityRange = SysMLFactory.eINSTANCE.createMultiplicityRange();
        var result = (EList<?>) semantics.evaluateSetting("MultiplicityRange", "bound", multiplicityRange);
        assertTrue(result.isEmpty());
        assertTrue(multiplicityRange.getBound().isEmpty());
    }

    @Test
    void featureOwnedTypingSettingRule() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Feature", "ownedTyping", feature);
        assertTrue(result.isEmpty());
        assertTrue(feature.getOwnedTyping().isEmpty());
    }

    @Test
    void multiplicityRangeLowerBoundSettingRule() {
        var multiplicityRange = SysMLFactory.eINSTANCE.createMultiplicityRange();
        assertNull(semantics.evaluateSetting("MultiplicityRange", "lowerBound", multiplicityRange));
        assertNull(multiplicityRange.getLowerBound());
    }

    @Test
    void featureOwnedSubsettingSettingRule() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Feature", "ownedSubsetting", feature);
        assertTrue(result.isEmpty());
        assertTrue(feature.getOwnedSubsetting().isEmpty());
    }

    @Test
    void featureOwnedTypeFeaturingSettingRule() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Feature", "ownedTypeFeaturing", feature);
        assertTrue(result.isEmpty());
        assertTrue(feature.getOwnedTypeFeaturing().isEmpty());
    }

    @Test
    void featureCrossFeatureSettingRule() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.evaluateSetting("Feature", "crossFeature", feature));
        assertNull(feature.getCrossFeature());
    }

    @Test
    void featureChainingFeatureSettingRule() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Feature", "chainingFeature", feature);
        assertTrue(result.isEmpty());
        assertTrue(feature.getChainingFeature().isEmpty());
    }

    @Test
    void featureTypingOwningFeatureSubsetsFallbackSettingRule() {
        var featureTyping = SysMLFactory.eINSTANCE.createFeatureTyping();
        var ownerFeature = SysMLFactory.eINSTANCE.createActionUsage();
        featureTyping.setTypedFeature(ownerFeature);
        assertSame(ownerFeature, semantics.evaluateSetting("FeatureTyping", "owningFeature", featureTyping));
        assertSame(ownerFeature, featureTyping.getOwningFeature());
    }

    @Test
    void subsettingOwningFeatureSubsetsFallbackSettingRule() {
        var subsetting = SysMLFactory.eINSTANCE.createSubsetting();
        var ownerFeature = SysMLFactory.eINSTANCE.createActionUsage();
        subsetting.setSubsettingFeature(ownerFeature);
        assertSame(ownerFeature, semantics.evaluateSetting("Subsetting", "owningFeature", subsetting));
        assertSame(ownerFeature, subsetting.getOwningFeature());
    }

    @Test
    void featureInvertingOwningFeatureSubsetsFallbackSettingRule() {
        var featureInverting = SysMLFactory.eINSTANCE.createFeatureInverting();
        var ownerFeature = SysMLFactory.eINSTANCE.createActionUsage();
        featureInverting.setFeatureInverted(ownerFeature);
        assertSame(ownerFeature, semantics.evaluateSetting("FeatureInverting", "owningFeature", featureInverting));
        assertSame(ownerFeature, featureInverting.getOwningFeature());
    }

    @Test
    void crossSubsettingCrossingFeatureRedefinesFallbackSettingRule() {
        var crossSubsetting = SysMLFactory.eINSTANCE.createCrossSubsetting();
        var crossingFeature = SysMLFactory.eINSTANCE.createActionUsage();
        crossSubsetting.setSubsettingFeature(crossingFeature);
        assertSame(crossingFeature, semantics.evaluateSetting("CrossSubsetting", "crossingFeature", crossSubsetting));
        assertSame(crossingFeature, crossSubsetting.getCrossingFeature());
    }

    @Test
    void referenceSubsettingReferencingFeatureRedefinesFallbackSettingRule() {
        var referenceSubsetting = SysMLFactory.eINSTANCE.createReferenceSubsetting();
        var referencingFeature = SysMLFactory.eINSTANCE.createActionUsage();
        referenceSubsetting.setSubsettingFeature(referencingFeature);
        assertSame(referencingFeature,
                semantics.evaluateSetting("ReferenceSubsetting", "referencingFeature", referenceSubsetting));
        assertSame(referencingFeature, referenceSubsetting.getReferencingFeature());
    }

}
