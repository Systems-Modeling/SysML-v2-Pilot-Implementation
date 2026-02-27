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

import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Mutation-focused setting semantics tests for translated delegates.
 *
 * <p>These tests verify that delegate results evolve correctly when source links are updated.
 */
public class SettingSemanticsMutationTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    public void membershipOwningNamespaceFollowsOwningRelatedElementMutation() {
        var membership = SysMLFactory.eINSTANCE.createMembership();
        var namespaceA = SysMLFactory.eINSTANCE.createPackage();
        var namespaceB = SysMLFactory.eINSTANCE.createPackage();

        membership.setOwningRelatedElement(namespaceA);
        assertSame(namespaceA, semantics.evaluateSetting("Membership", "membershipOwningNamespace", membership));
        assertSame(namespaceA, membership.getMembershipOwningNamespace());

        membership.setOwningRelatedElement(namespaceB);
        assertSame(namespaceB, semantics.evaluateSetting("Membership", "membershipOwningNamespace", membership));
        assertSame(namespaceB, membership.getMembershipOwningNamespace());
    }

    @Test
    public void featureTypingOwningFeatureFollowsTypedFeatureMutation() {
        var featureTyping = SysMLFactory.eINSTANCE.createFeatureTyping();
        var featureA = SysMLFactory.eINSTANCE.createActionUsage();
        var featureB = SysMLFactory.eINSTANCE.createPartUsage();

        featureTyping.setTypedFeature(featureA);
        assertSame(featureA, semantics.evaluateSetting("FeatureTyping", "owningFeature", featureTyping));
        assertSame(featureA, featureTyping.getOwningFeature());

        featureTyping.setTypedFeature(featureB);
        assertSame(featureB, semantics.evaluateSetting("FeatureTyping", "owningFeature", featureTyping));
        assertSame(featureB, featureTyping.getOwningFeature());
    }

    @Test
    public void specializationOwningTypeFollowsSpecificMutation() {
        var specialization = SysMLFactory.eINSTANCE.createSpecialization();
        var specificA = SysMLFactory.eINSTANCE.createActionDefinition();
        var specificB = SysMLFactory.eINSTANCE.createPartDefinition();

        specialization.setSpecific(specificA);
        assertSame(specificA, semantics.evaluateSetting("Specialization", "owningType", specialization));
        assertSame(specificA, specialization.getOwningType());

        specialization.setSpecific(specificB);
        assertSame(specificB, semantics.evaluateSetting("Specialization", "owningType", specialization));
        assertSame(specificB, specialization.getOwningType());
    }

    @Test
    public void annotationOwningAnnotatedElementFollowsAnnotatedElementMutation() {
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        var annotatedA = SysMLFactory.eINSTANCE.createComment();
        var annotatedB = SysMLFactory.eINSTANCE.createDocumentation();

        annotation.setAnnotatedElement(annotatedA);
        assertSame(annotatedA, semantics.evaluateSetting("Annotation", "owningAnnotatedElement", annotation));
        assertSame(annotatedA, annotation.getOwningAnnotatedElement());

        annotation.setAnnotatedElement(annotatedB);
        assertSame(annotatedB, semantics.evaluateSetting("Annotation", "owningAnnotatedElement", annotation));
        assertSame(annotatedB, annotation.getOwningAnnotatedElement());
    }

    @Test
    public void membershipOwningNamespaceTracksGuardTransitionsAcrossMultipleMutations() {
        var membership = SysMLFactory.eINSTANCE.createMembership();
        var namespaceA = SysMLFactory.eINSTANCE.createPackage();
        var namespaceB = SysMLFactory.eINSTANCE.createLibraryPackage();
        var nonNamespace = SysMLFactory.eINSTANCE.createComment();

        assertNull(semantics.evaluateSetting("Membership", "membershipOwningNamespace", membership));
        assertNull(membership.getMembershipOwningNamespace());

        membership.setOwningRelatedElement(namespaceA);
        assertSame(namespaceA, semantics.evaluateSetting("Membership", "membershipOwningNamespace", membership));
        assertSame(namespaceA, membership.getMembershipOwningNamespace());

        membership.setOwningRelatedElement(nonNamespace);
        assertNull(semantics.evaluateSetting("Membership", "membershipOwningNamespace", membership));
        assertNull(membership.getMembershipOwningNamespace());

        membership.setOwningRelatedElement(namespaceB);
        assertSame(namespaceB, semantics.evaluateSetting("Membership", "membershipOwningNamespace", membership));
        assertSame(namespaceB, membership.getMembershipOwningNamespace());
    }

    @Test
    public void importOwningNamespaceTracksGuardTransitionsAcrossMultipleMutations() {
        var namespaceImport = SysMLFactory.eINSTANCE.createNamespaceImport();
        var namespaceA = SysMLFactory.eINSTANCE.createPackage();
        var namespaceB = SysMLFactory.eINSTANCE.createLibraryPackage();
        var nonNamespace = SysMLFactory.eINSTANCE.createComment();

        assertNull(semantics.evaluateSetting("Import", "importOwningNamespace", namespaceImport));
        assertNull(namespaceImport.getImportOwningNamespace());

        namespaceImport.setOwningRelatedElement(namespaceA);
        assertSame(namespaceA, semantics.evaluateSetting("Import", "importOwningNamespace", namespaceImport));
        assertSame(namespaceA, namespaceImport.getImportOwningNamespace());

        namespaceImport.setOwningRelatedElement(nonNamespace);
        assertNull(semantics.evaluateSetting("Import", "importOwningNamespace", namespaceImport));
        assertNull(namespaceImport.getImportOwningNamespace());

        namespaceImport.setOwningRelatedElement(namespaceB);
        assertSame(namespaceB, semantics.evaluateSetting("Import", "importOwningNamespace", namespaceImport));
        assertSame(namespaceB, namespaceImport.getImportOwningNamespace());
    }

    @Test
    public void specializationOwningTypeSwitchesBetweenFallbackAndPreferredSourcesAcrossMutations() {
        var specialization = SysMLFactory.eINSTANCE.createSpecialization();
        var specificA = SysMLFactory.eINSTANCE.createActionDefinition();
        var specificB = SysMLFactory.eINSTANCE.createPartDefinition();
        var owningA = SysMLFactory.eINSTANCE.createUsage();
        var owningB = SysMLFactory.eINSTANCE.createActionUsage();

        specialization.setSpecific(specificA);
        assertSame(specificA, semantics.evaluateSetting("Specialization", "owningType", specialization));
        assertSame(specificA, specialization.getOwningType());

        specialization.setOwningRelatedElement(owningA);
        assertSame(owningA, semantics.evaluateSetting("Specialization", "owningType", specialization));
        assertSame(owningA, specialization.getOwningType());

        specialization.setOwningRelatedElement(SysMLFactory.eINSTANCE.createComment());
        assertSame(specificA, semantics.evaluateSetting("Specialization", "owningType", specialization));
        assertSame(specificA, specialization.getOwningType());

        specialization.setSpecific(specificB);
        assertSame(specificB, semantics.evaluateSetting("Specialization", "owningType", specialization));
        assertSame(specificB, specialization.getOwningType());

        specialization.setOwningRelatedElement(owningB);
        assertSame(owningB, semantics.evaluateSetting("Specialization", "owningType", specialization));
        assertSame(owningB, specialization.getOwningType());
    }

    @Test
    public void annotationOwningAnnotatedElementPrefersAnnotatedThenFallsBackToOwningRelatedElement() {
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        var annotatedA = SysMLFactory.eINSTANCE.createComment();
        var annotatedB = SysMLFactory.eINSTANCE.createDocumentation();
        var fallbackElement = SysMLFactory.eINSTANCE.createPackage();

        annotation.setOwningRelatedElement(fallbackElement);
        assertSame(fallbackElement, semantics.evaluateSetting("Annotation", "owningAnnotatedElement", annotation));
        assertSame(fallbackElement, annotation.getOwningAnnotatedElement());

        annotation.setAnnotatedElement(annotatedA);
        assertSame(annotatedA, semantics.evaluateSetting("Annotation", "owningAnnotatedElement", annotation));
        assertSame(annotatedA, annotation.getOwningAnnotatedElement());

        annotation.setAnnotatedElement(annotatedB);
        assertSame(annotatedB, semantics.evaluateSetting("Annotation", "owningAnnotatedElement", annotation));
        assertSame(annotatedB, annotation.getOwningAnnotatedElement());

        annotation.setAnnotatedElement(null);
        assertSame(fallbackElement, semantics.evaluateSetting("Annotation", "owningAnnotatedElement", annotation));
        assertSame(fallbackElement, annotation.getOwningAnnotatedElement());
    }
}
