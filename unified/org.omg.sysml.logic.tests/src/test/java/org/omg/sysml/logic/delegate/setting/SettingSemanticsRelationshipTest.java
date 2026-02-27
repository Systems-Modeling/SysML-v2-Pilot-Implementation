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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.ConstraintUsage;
import org.omg.sysml.model.sysml.FlowUsage;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.OwningMembership;
import org.omg.sysml.model.sysml.RequirementUsage;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Setting semantics tests for Relationship and Relationship-derived metaclasses.
 */
public class SettingSemanticsRelationshipTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void connectorTargetFeatureSettingRule() {
        FlowUsage connector = SysMLFactory.eINSTANCE.createFlowUsage();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Connector", "targetFeature", connector);
        assertTrue(result.isEmpty());
        assertTrue(connector.getTargetFeature().isEmpty());
    }

    @Test
    void connectorDefaultFeaturingTypeSettingRule() {
        FlowUsage connector = SysMLFactory.eINSTANCE.createFlowUsage();
        assertNull(semantics.evaluateSetting("Connector", "defaultFeaturingType", connector));
        assertNull(connector.getDefaultFeaturingType());
    }

    @Test
    void flowFlowEndSettingRule() {
        FlowUsage flow = SysMLFactory.eINSTANCE.createFlowUsage();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Flow", "flowEnd", flow);
        assertTrue(result.isEmpty());
        assertTrue(flow.getFlowEnd().isEmpty());
    }

    @Test
    void membershipMemberElementIdSettingRule() {
        Membership membership = SysMLFactory.eINSTANCE.createMembership();
        var element = SysMLFactory.eINSTANCE.createComment();
        membership.setMemberElement(element);
        assertEquals(element.getElementId(), semantics.evaluateSetting("Membership", "memberElementId", membership));
        assertEquals(element.getElementId(), membership.getMemberElementId());
    }

    @Test
    void membershipMemberElementIdWithoutMemberElementSettingRule() {
        var membership = SysMLFactory.eINSTANCE.createMembership();
        assertNull(semantics.evaluateSetting("Membership", "memberElementId", membership));
        assertNull(membership.getMemberElementId());
    }

    @Test
    void flowPayloadFeatureSettingRule() {
        FlowUsage flowUsage = SysMLFactory.eINSTANCE.createFlowUsage();
        assertNull(semantics.evaluateSetting("Flow", "payloadFeature", flowUsage));
        assertNull(flowUsage.getPayloadFeature());
    }

    @Test
    void flowPayloadTypeSettingRule() {
        var flowUsage = SysMLFactory.eINSTANCE.createFlowUsage();
        var result = (EList<?>) semantics.evaluateSetting("Flow", "payloadType", flowUsage);
        assertTrue(result.isEmpty());
        assertTrue(flowUsage.getPayloadType().isEmpty());
    }

    @Test
    void connectorRelatedFeatureSettingRule() {
        var connector = SysMLFactory.eINSTANCE.createFlowUsage();
        var result = (EList<?>) semantics.evaluateSetting("Connector", "relatedFeature", connector);
        assertTrue(result.isEmpty());
        assertTrue(connector.getRelatedFeature().isEmpty());
    }

    @Test
    void owningMembershipOwnedMemberNameSettingRule() {
        OwningMembership owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        assertNull(semantics.evaluateSetting("OwningMembership", "ownedMemberName", owningMembership));
        assertNull(owningMembership.getOwnedMemberName());
    }

    @Test
    void owningMembershipOwnedMemberShortNameSettingRule() {
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        assertNull(semantics.evaluateSetting("OwningMembership", "ownedMemberShortName", owningMembership));
        assertNull(owningMembership.getOwnedMemberShortName());
    }

    @Test
    void relationshipRelatedElementSettingRule() {
        Membership membership = SysMLFactory.eINSTANCE.createMembership();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Relationship", "relatedElement", membership);
        assertTrue(result.isEmpty());
        assertTrue(membership.getRelatedElement().isEmpty());
    }

    @Test
    void associationSourceTypeSettingRule() {
        var association = SysMLFactory.eINSTANCE.createAssociationStructure();
        assertNull(semantics.evaluateSetting("Association", "sourceType", association));
        assertNull(association.getSourceType());
    }

    @Test
    void associationTargetTypeSettingRule() {
        var association = SysMLFactory.eINSTANCE.createAssociationStructure();
        var result = (EList<?>) semantics.evaluateSetting("Association", "targetType", association);
        assertTrue(result.isEmpty());
        assertTrue(association.getTargetType().isEmpty());
    }

    @Test
    void associationRelatedTypeSettingRule() {
        var association = SysMLFactory.eINSTANCE.createAssociationStructure();
        var result = (EList<?>) semantics.evaluateSetting("Association", "relatedType", association);
        assertTrue(result.isEmpty());
        assertTrue(association.getRelatedType().isEmpty());
    }

    @Test
    void flowSourceOutputFeatureSettingRule() {
        var flow = SysMLFactory.eINSTANCE.createFlowUsage();
        assertNull(semantics.evaluateSetting("Flow", "sourceOutputFeature", flow));
        assertNull(flow.getSourceOutputFeature());
    }

    @Test
    void flowTargetInputFeatureSettingRule() {
        var flow = SysMLFactory.eINSTANCE.createFlowUsage();
        assertNull(semantics.evaluateSetting("Flow", "targetInputFeature", flow));
        assertNull(flow.getTargetInputFeature());
    }

    @Test
    void connectorSourceFeatureSettingRule() {
        var connector = SysMLFactory.eINSTANCE.createFlowUsage();
        assertNull(semantics.evaluateSetting("Connector", "sourceFeature", connector));
        assertNull(connector.getSourceFeature());
    }

    @Test
    void membershipMembershipOwningNamespaceSubsetsFallbackSettingRule() {
        var membership = SysMLFactory.eINSTANCE.createMembership();
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        membership.setOwningRelatedElement(namespace);
        assertSame(namespace, semantics.evaluateSetting("Membership", "membershipOwningNamespace", membership));
        assertSame(namespace, membership.getMembershipOwningNamespace());
    }

    @Test
    void importImportOwningNamespaceSubsetsFallbackSettingRule() {
        var namespaceImport = SysMLFactory.eINSTANCE.createNamespaceImport();
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        namespaceImport.setOwningRelatedElement(namespace);
        assertSame(namespace, semantics.evaluateSetting("Import", "importOwningNamespace", namespaceImport));
        assertSame(namespace, namespaceImport.getImportOwningNamespace());
    }

    @Test
    void requirementVerificationMembershipVerifiedRequirementSettingRule() {
        var requirementVerificationMembership = SysMLFactory.eINSTANCE.createRequirementVerificationMembership();
        RequirementUsage requirementUsage = SysMLFactory.eINSTANCE.createRequirementUsage();
        requirementVerificationMembership.setMemberElement(requirementUsage);
        assertSame(requirementUsage, semantics.evaluateSetting(
                "RequirementVerificationMembership", "verifiedRequirement", requirementVerificationMembership));
        assertSame(requirementUsage, requirementVerificationMembership.getVerifiedRequirement());
    }

    @Test
    void requirementVerificationMembershipVerifiedRequirementSettingRuleReturnsNullForNonRequirementConstraint() {
        var requirementVerificationMembership = SysMLFactory.eINSTANCE.createRequirementVerificationMembership();
        ConstraintUsage constraintUsage = SysMLFactory.eINSTANCE.createConstraintUsage();
        requirementVerificationMembership.setMemberElement(constraintUsage);
        assertNull(semantics.evaluateSetting(
                "RequirementVerificationMembership", "verifiedRequirement", requirementVerificationMembership));
        assertNull(requirementVerificationMembership.getVerifiedRequirement());
    }
}
