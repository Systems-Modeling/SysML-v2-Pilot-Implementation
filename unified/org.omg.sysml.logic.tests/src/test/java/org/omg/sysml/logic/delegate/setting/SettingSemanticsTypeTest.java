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
import org.omg.sysml.model.sysml.PortDefinition;
import org.omg.sysml.model.sysml.Specialization;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Setting semantics tests for Type and Type-derived metaclasses.
 */
public class SettingSemanticsTypeTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void typeOwnedSpecializationSettingRule() {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        Specialization specialization = SysMLFactory.eINSTANCE.createSpecialization();
        specialization.setSpecific(type);
        type.getOwnedRelationship().add(specialization);

        EList<?> result = (EList<?>) semantics.evaluateSetting("Type", "ownedSpecialization", type);
        assertTrue(result.contains(specialization));
    }

    @Test
    void portDefinitionConjugatedPortDefinitionSettingRule() {
        PortDefinition portDefinition = SysMLFactory.eINSTANCE.createPortDefinition();
        assertNull(semantics.evaluateSetting("PortDefinition", "conjugatedPortDefinition", portDefinition));
        assertNull(portDefinition.getConjugatedPortDefinition());
    }

    @Test
    void typeFeatureSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "feature", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getFeature().isEmpty());
    }

    @Test
    void typeFeatureMembershipSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "featureMembership", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getFeatureMembership().isEmpty());
    }

    @Test
    void typeOwnedFeatureSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "ownedFeature", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getOwnedFeature().isEmpty());
    }

    @Test
    void typeOwnedFeatureMembershipSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "ownedFeatureMembership", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getOwnedFeatureMembership().isEmpty());
    }

    @Test
    void typeDirectedFeatureSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "directedFeature", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getDirectedFeature().isEmpty());
    }

    @Test
    void typeEndFeatureSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "endFeature", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getEndFeature().isEmpty());
    }

    @Test
    void typeOwnedEndFeatureSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "ownedEndFeature", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getOwnedEndFeature().isEmpty());
    }

    @Test
    void typeInheritedFeatureSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "inheritedFeature", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getInheritedFeature().isEmpty());
    }

    @Test
    void typeInheritedMembershipSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "inheritedMembership", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getInheritedMembership().isEmpty());
    }

    @Test
    void typeMultiplicitySettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.evaluateSetting("Type", "multiplicity", type));
        assertNull(type.getMultiplicity());
    }

    @Test
    void typeUnioningTypeSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "unioningType", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getUnioningType().isEmpty());
    }

    @Test
    void typeIntersectingTypeSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "intersectingType", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getIntersectingType().isEmpty());
    }

    @Test
    void typeDifferencingTypeSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "differencingType", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getDifferencingType().isEmpty());
    }

    @Test
    void typeOwnedUnioningSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "ownedUnioning", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getOwnedUnioning().isEmpty());
    }

    @Test
    void typeOwnedIntersectingSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "ownedIntersecting", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getOwnedIntersecting().isEmpty());
    }

    @Test
    void typeOwnedDifferencingSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "ownedDifferencing", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getOwnedDifferencing().isEmpty());
    }

    @Test
    void typeOwnedDisjoiningSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "ownedDisjoining", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getOwnedDisjoining().isEmpty());
    }

    @Test
    void typeOwnedConjugatorSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.evaluateSetting("Type", "ownedConjugator", type));
        assertNull(type.getOwnedConjugator());
    }

    @Test
    void typeInputSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "input", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getInput().isEmpty());
    }

    @Test
    void typeOutputSettingRule() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Type", "output", type);
        assertTrue(result.isEmpty());
        assertTrue(type.getOutput().isEmpty());
    }

    @Test
    void classifierOwnedSubclassificationSettingRule() {
        var classifier = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Classifier", "ownedSubclassification", classifier);
        assertTrue(result.isEmpty());
        assertTrue(classifier.getOwnedSubclassification().isEmpty());
    }

    @Test
    void specializationOwningTypeSubsetsFallbackSettingRule() {
        var specialization = SysMLFactory.eINSTANCE.createSpecialization();
        var specific = SysMLFactory.eINSTANCE.createActionDefinition();
        specialization.setSpecific(specific);
        assertSame(specific, semantics.evaluateSetting("Specialization", "owningType", specialization));
        assertSame(specific, specialization.getOwningType());
    }
}
