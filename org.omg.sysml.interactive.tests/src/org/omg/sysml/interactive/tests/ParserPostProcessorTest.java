/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 * Copyright (c) 2026 ModelDrivenSolutions, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.junit.Test;
import org.omg.kerml.xtext.postprocessing.ElementParserPostProcessor;
import org.omg.kerml.xtext.postprocessing.ImportParserPostProcessor;
import org.omg.kerml.xtext.postprocessing.LiteralStringParserPostProcessor;
import org.omg.kerml.xtext.postprocessing.RedefinitionParserPostProcessor;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.PortionKind;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.xtext.postprocessing.ConnectionUsageParserPostProcessor;
import org.omg.sysml.xtext.postprocessing.ItemUsageParserPostProcessor;
import org.omg.sysml.xtext.postprocessing.OccurrenceUsageParserPostProcessor;
import org.omg.sysml.xtext.postprocessing.PartUsageParserPostProcessor;
import org.omg.sysml.xtext.postprocessing.PortUsageParserPostProcessor;
import org.omg.sysml.xtext.postprocessing.SysMLParserPostProcessorFactory;

public class ParserPostProcessorTest extends SysMLInteractiveTest {

	@Test
	public void factorySelectsTheMostSpecificParserPostProcessorWithoutAttachingIt() {
		PortUsage port = SysMLFactory.eINSTANCE.createPortUsage();
		int adapterCount = port.eAdapters().size();
		ElementParserPostProcessor portPostProcessor = SysMLParserPostProcessorFactory.getPostProcessor(port);
		assertTrue(portPostProcessor instanceof PortUsageParserPostProcessor);
		assertNotSame(portPostProcessor, SysMLParserPostProcessorFactory.getPostProcessor(port));
		assertEquals(adapterCount, port.eAdapters().size());

		OccurrenceUsage occurrence = SysMLFactory.eINSTANCE.createOccurrenceUsage();
		assertTrue(SysMLParserPostProcessorFactory.getPostProcessor(occurrence) instanceof OccurrenceUsageParserPostProcessor);
		assertTrue(SysMLParserPostProcessorFactory.getPostProcessor(SysMLFactory.eINSTANCE.createConnectionUsage())
				instanceof ConnectionUsageParserPostProcessor);
		assertTrue(SysMLParserPostProcessorFactory.getPostProcessor(SysMLFactory.eINSTANCE.createAllocationUsage())
				instanceof ConnectionUsageParserPostProcessor);
		assertTrue(SysMLParserPostProcessorFactory.getPostProcessor(SysMLFactory.eINSTANCE.createInterfaceUsage())
				instanceof ConnectionUsageParserPostProcessor);
		assertTrue(SysMLParserPostProcessorFactory.getPostProcessor(SysMLFactory.eINSTANCE.createPartUsage())
				instanceof PartUsageParserPostProcessor);
		assertTrue(SysMLParserPostProcessorFactory.getPostProcessor(SysMLFactory.eINSTANCE.createItemUsage())
				instanceof ItemUsageParserPostProcessor);

		LiteralString literal = SysMLFactory.eINSTANCE.createLiteralString();
		assertTrue(SysMLParserPostProcessorFactory.getPostProcessor(literal) instanceof LiteralStringParserPostProcessor);

		assertTrue(SysMLParserPostProcessorFactory.getPostProcessor(SysMLFactory.eINSTANCE.createRedefinition())
				instanceof RedefinitionParserPostProcessor);
		assertTrue(SysMLParserPostProcessorFactory.getPostProcessor(SysMLFactory.eINSTANCE.createMembershipImport())
				instanceof ImportParserPostProcessor);

	}

	@Test
	public void parserPostProcessorHierarchyPreservesSpecialCaseBehavior() {
		Feature feature = SysMLFactory.eINSTANCE.createFeature();
		feature.setDeclaredName("'a name'");
		feature.setIsConstant(true);
		postProcess(feature);
		assertEquals("a name", feature.getDeclaredName());
		assertTrue(feature.isVariable());

		Usage usage = SysMLFactory.eINSTANCE.createAttributeUsage();
		usage.setIsConstant(true);
		postProcess(usage);
		assertFalse(usage.isVariable());

		OccurrenceUsage occurrence = SysMLFactory.eINSTANCE.createOccurrenceUsage();
		occurrence.setPortionKind(PortionKind.SNAPSHOT);
		postProcess(occurrence);
		assertTrue(occurrence.isPortion());

		PortUsage port = SysMLFactory.eINSTANCE.createPortUsage();
		port.setPortionKind(PortionKind.SNAPSHOT);
		postProcess(port);
		assertTrue(port.isPortion());

		ConnectionUsage connection = SysMLFactory.eINSTANCE.createConnectionUsage();
		connection.setPortionKind(PortionKind.SNAPSHOT);
		postProcess(connection);
		assertTrue(connection.isPortion());

		LiteralString literal = SysMLFactory.eINSTANCE.createLiteralString();
		literal.setValue("\"hello\\nworld\"");
		postProcess(literal);
		assertEquals("hello\nworld", literal.getValue());
	}

	protected static void postProcess(Element... elements) {
		for (Element element : elements) {
			int adapterCount = element.eAdapters().size();
			SysMLParserPostProcessorFactory.getPostProcessor(element).postProcess();
			assertEquals(adapterCount, element.eAdapters().size());
		}
	}

	protected static PartUsage createPartUsage() {
		return SysMLFactory.eINSTANCE.createPartUsage();
	}

	protected static PartUsage createPartUsageOwnedByFeatureMembership() {
		PartUsage owner = createPartUsage();
		PartUsage usage = createPartUsage();
		usage.setIsComposite(true);
		TypeUtil.addOwnedFeatureTo(owner, usage);
		return usage;
	}

	@Test
	public void postProcessPreservesCompositeUsageOwnedByFeatureMembership() {
		PartUsage usage = createPartUsageOwnedByFeatureMembership();

		postProcess(usage);

		assertTrue(usage.isComposite());
	}

	@Test
	public void postProcessMakesDirectedUsageNonComposite() {
		PartUsage usage = createPartUsageOwnedByFeatureMembership();
		usage.setDirection(FeatureDirectionKind.IN);

		postProcess(usage);

		assertFalse(usage.isComposite());
	}

	@Test
	public void postProcessMakesEndUsageNonComposite() {
		PartUsage usage = createPartUsageOwnedByFeatureMembership();
		usage.setIsEnd(true);

		postProcess(usage);

		assertFalse(usage.isComposite());
	}

	@Test
	public void postProcessMakesUsageOutsideFeatureMembershipNonComposite() {
		PartUsage usage = createPartUsage();
		OwningMembership membership = SysMLFactory.eINSTANCE.createOwningMembership();
		membership.setOwnedMemberElement(usage);

		postProcess(usage);

		assertFalse(usage.isComposite());
	}

    @Test
    public void standardFactoryUsesTheEcoreCompositeDefault() {
        assertFalse(SysMLFactory.eINSTANCE.createUsage().isComposite());
        for (EClass eClass : nonCompositeUsageTypes()) {
            Usage usage = (Usage)SysMLFactory.eINSTANCE.create(eClass);
            assertFalse(eClass.getName(), usage.isComposite());
            assertTrue(eClass.getName(), usage.isReference());
        }
    }

    @Test
    public void parserAdapterRestoresImplicitConstructorDefaults() {
        PartUsage partUsage = (PartUsage)createUsageOwnedByFeatureMembership(SysMLPackage.Literals.PART_USAGE);
        postProcess(partUsage);
        assertTrue(partUsage.isComposite());

        for (EClass eClass : nonCompositeUsageTypes()) {
            Usage usage = createUsageOwnedByFeatureMembership(eClass);
            postProcess(usage);
            assertFalse(eClass.getName(), usage.isComposite());
            assertTrue(eClass.getName(), usage.isReference());
        }
    }

    @Test
    public void postProcessMakesContextuallyReferentialUsagesNonComposite() {
        PartUsage directedUsage = (PartUsage)createUsageOwnedByFeatureMembership(SysMLPackage.Literals.PART_USAGE);
        directedUsage.setDirection(FeatureDirectionKind.IN);
        postProcess(directedUsage);
        assertFalse(directedUsage.isComposite());

        PartUsage endUsage = (PartUsage)createUsageOwnedByFeatureMembership(SysMLPackage.Literals.PART_USAGE);
        endUsage.setIsEnd(true);
        postProcess(endUsage);
        assertFalse(endUsage.isComposite());

        PartUsage unfeaturedUsage = SysMLFactory.eINSTANCE.createPartUsage();
        OwningMembership membership = SysMLFactory.eINSTANCE.createOwningMembership();
        membership.setOwnedMemberElement(unfeaturedUsage);
        postProcess(unfeaturedUsage);
        assertFalse(unfeaturedUsage.isComposite());
    }

    @Test
    public void portUsageIsCompositeOnlyInAPortContext() {
        PortUsage portUsage = SysMLFactory.eINSTANCE.createPortUsage();
        FeatureMembership membership = SysMLFactory.eINSTANCE.createFeatureMembership();
        membership.setOwnedMemberFeature(portUsage);
        PortDefinition owner = SysMLFactory.eINSTANCE.createPortDefinition();
        owner.getOwnedRelationship().add(membership);
        postProcess(portUsage);
        assertTrue(portUsage.isComposite());

        PortUsage partPortUsage = (PortUsage)createUsageOwnedByFeatureMembership(SysMLPackage.Literals.PORT_USAGE);
        postProcess(partPortUsage);
        assertFalse(partPortUsage.isComposite());
    }

    private static List<EClass> nonCompositeUsageTypes() {
        return List.of(
                SysMLPackage.Literals.ATTRIBUTE_USAGE,
                SysMLPackage.Literals.BINDING_CONNECTOR_AS_USAGE,
                SysMLPackage.Literals.EVENT_OCCURRENCE_USAGE,
                SysMLPackage.Literals.EXHIBIT_STATE_USAGE,
                SysMLPackage.Literals.INCLUDE_USE_CASE_USAGE,
                SysMLPackage.Literals.PERFORM_ACTION_USAGE,
                SysMLPackage.Literals.REFERENCE_USAGE,
                SysMLPackage.Literals.SUCCESSION_AS_USAGE);
    }

    private static Usage createUsageOwnedByFeatureMembership(EClass eClass) {
        Usage usage = (Usage)SysMLFactory.eINSTANCE.create(eClass);
        FeatureMembership membership = SysMLFactory.eINSTANCE.createFeatureMembership();
        membership.setOwnedMemberFeature(usage);
        PartDefinition owner = SysMLFactory.eINSTANCE.createPartDefinition();
        owner.getOwnedRelationship().add(membership);
        return usage;
    }
}
