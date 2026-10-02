/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-2.0/.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.omg.sysml.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;

/**
 * Verifies that public derived queries reflect edits after their caches have been populated.
 */
public class DerivedFeatureMutationTest {

    /** Installs the standalone runtime before creating model elements. */
    @Before
    public void setUp() {
        SysMLLogicStandaloneSetup.doSetup();
    }

    /** Verifies objective addition and removal after an initial derived-property read. */
    @Test
    public void objectiveReflectsMembershipMutations() {
        var factory = SysMLFactory.eINSTANCE;
        var definition = factory.createCaseDefinition();
        assertNull(definition.getObjectiveRequirement());
        var objective = factory.createRequirementUsage();
        var membership = factory.createObjectiveMembership();
        this.addMember(definition, membership, objective);
        assertSame(objective, definition.getObjectiveRequirement());
        definition.getOwnedRelationship().remove(membership);
        assertNull(definition.getObjectiveRequirement());
    }

    /** Verifies that subject and actor queries both see additions and removals for cases. */
    @Test
    public void subjectAndActorsReflectMembershipMutations_Case() {
        var factory = SysMLFactory.eINSTANCE;
        var usage = factory.createCaseUsage();
        assertNull(usage.getSubjectParameter());
        assertTrue(usage.getActorParameter().isEmpty());
        var subject = factory.createReferenceUsage();
        var subjectMembership = factory.createSubjectMembership();
        this.addMember(usage, subjectMembership, subject);
        assertSame(subject, usage.getSubjectParameter());
        var actor = factory.createPartUsage();
        var actorMembership = factory.createActorMembership();
        this.addMember(usage, actorMembership, actor);
        assertEquals(List.of(actor), usage.getActorParameter());
        usage.getOwnedRelationship().remove(subjectMembership);
        assertNull(usage.getSubjectParameter());
        usage.getOwnedRelationship().remove(actorMembership);
        assertTrue(usage.getActorParameter().isEmpty());
    }

    /** Verifies that subject and actor queries both see additions and removals for requirements. */
    @Test
    public void subjectAndActorsReflectMembershipMutations_Requirements() {
        var factory = SysMLFactory.eINSTANCE;
        var usage = factory.createRequirementUsage();
        assertNull(usage.getSubjectParameter());
        assertTrue(usage.getActorParameter().isEmpty());
        var subject = factory.createReferenceUsage();
        var subjectMembership = factory.createSubjectMembership();
        this.addMember(usage, subjectMembership, subject);
        assertSame(subject, usage.getSubjectParameter());
        var actor = factory.createPartUsage();
        var actorMembership = factory.createActorMembership();
        this.addMember(usage, actorMembership, actor);
        assertEquals(List.of(actor), usage.getActorParameter());
        usage.getOwnedRelationship().remove(subjectMembership);
        assertNull(usage.getSubjectParameter());
        usage.getOwnedRelationship().remove(actorMembership);
        assertTrue(usage.getActorParameter().isEmpty());
    }

    /** Verifies the sibling stakeholder query after its cache has been populated. */
    @Test
    public void stakeholdersReflectMembershipMutations() {
        var factory = SysMLFactory.eINSTANCE;
        var requirement = factory.createRequirementDefinition();
        assertTrue(requirement.getStakeholderParameter().isEmpty());
        var stakeholder = factory.createPartUsage();
        var membership = factory.createStakeholderMembership();
        this.addMember(requirement, membership, stakeholder);
        assertEquals(List.of(stakeholder), requirement.getStakeholderParameter());
        requirement.getOwnedRelationship().remove(membership);
        assertTrue(requirement.getStakeholderParameter().isEmpty());
    }

    /** Verifies that edits to a superclass are visible through an inherited objective query. */
    @Test
    public void inheritedObjectiveReflectsSuperclassMutations() {
        var factory = SysMLFactory.eINSTANCE;
        var base = factory.createCaseDefinition();
        var derived = factory.createCaseDefinition();
        var specialization = factory.createSubclassification();
        specialization.setSuperclassifier(base);
        specialization.setSubclassifier(derived);
        derived.getOwnedRelationship().add(specialization);
        assertNull(derived.getObjectiveRequirement());
        var objective = factory.createRequirementUsage();
        var membership = factory.createObjectiveMembership();
        this.addMember(base, membership, objective);
        assertSame(objective, derived.getObjectiveRequirement());
        base.getOwnedRelationship().remove(membership);
        assertNull(derived.getObjectiveRequirement());
    }

    /** Verifies source and target queries after replacing a connection's or flow's ends. */
    @Test
    public void relatedFeaturesReflectReplacedEnds() {
        var factory = SysMLFactory.eINSTANCE;
        for (Connector connector : List.of(factory.createConnectionUsage(), factory.createFlowUsage())) {
            var source = factory.createPartUsage();
            var target = factory.createPartUsage();
            this.addEnd(connector, source);
            this.addEnd(connector, target);
            assertSame(source, connector.getSourceFeature());
            assertEquals(List.of(target), connector.getTargetFeature());
            connector.getOwnedRelationship().clear();
            this.addEnd(connector, target);
            this.addEnd(connector, source);
            assertSame(target, connector.getSourceFeature());
            assertEquals(List.of(source), connector.getTargetFeature());
        }
    }

    /** Verifies that endpoint queries also refresh connection typing after a direct edit. */
    @Test
    public void relatedFeatureQueryRefreshesEditedConnectionType() {
        var factory = SysMLFactory.eINSTANCE;
        var connector = factory.createConnectionUsage();
        var initialType = factory.createConnectionDefinition();
        var newType = factory.createConnectionDefinition();
        var typing = factory.createFeatureTyping();
        typing.setType(initialType);
        typing.setTypedFeature(connector);
        connector.getOwnedRelationship().add(typing);
        connector.getRelatedFeature();
        assertTrue(connector.getType().contains(initialType));
        typing.setType(newType);
        connector.getRelatedFeature();
        assertEquals(List.of(newType), connector.getType());
    }

    /**
     * Attaches a feature using the supplied membership.
     * @param owner the containing type
     * @param membership the owning membership
     * @param member the member feature
     */
    private void addMember(Type owner, FeatureMembership membership, Feature member) {
        membership.getOwnedRelatedElement().add(member);
        owner.getOwnedRelationship().add(membership);
    }

    /**
     * Adds an end referencing a feature.
     * @param connector the connector to update
     * @param target the feature referenced by the end
     */
    private void addEnd(Connector connector, Feature target) {
        var factory = SysMLFactory.eINSTANCE;
        var end = factory.createReferenceUsage();
        end.setIsEnd(true);
        var reference = factory.createReferenceSubsetting();
        reference.setReferencedFeature(target);
        end.getOwnedRelationship().add(reference);
        this.addMember(connector, factory.createEndFeatureMembership(), end);
    }
}
