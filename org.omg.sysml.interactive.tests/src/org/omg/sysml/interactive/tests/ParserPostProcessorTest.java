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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.kerml.xtext.postprocessing.ElementParserPostProcessor;
import org.omg.kerml.xtext.postprocessing.ImportParserPostProcessor;
import org.omg.kerml.xtext.postprocessing.LiteralStringParserPostProcessor;
import org.omg.sysml.xtext.postprocessing.ConnectionUsageParserPostProcessor;
import org.omg.sysml.xtext.postprocessing.ItemUsageParserPostProcessor;
import org.omg.sysml.xtext.postprocessing.OccurrenceUsageParserPostProcessor;
import org.omg.sysml.xtext.postprocessing.PartUsageParserPostProcessor;
import org.omg.sysml.xtext.postprocessing.PortUsageParserPostProcessor;
import org.omg.sysml.xtext.postprocessing.SysMLParserPostProcessorFactory;
import org.omg.kerml.xtext.postprocessing.RedefinitionParserPostProcessor;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.PortionKind;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.logic.SysMLLogicStandaloneSetup;
import org.omg.sysml.util.TypeUtil;

public class ParserPostProcessorTest extends SysMLInteractiveTest {

	@BeforeClass
	public static void setUp() {
		SysMLLogicStandaloneSetup.doSetup();
		SysMLPackage.eINSTANCE.eClass();
	}

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
}
