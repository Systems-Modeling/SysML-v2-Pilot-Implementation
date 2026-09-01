/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.sysml.semantics.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.kerml.xtext.adapter.ElementParserAdapter;
import org.omg.kerml.xtext.adapter.ImportParserAdapter;
import org.omg.kerml.xtext.adapter.LiteralStringParserAdapter;
import org.omg.sysml.xtext.adapter.OccurrenceUsageParserAdapter;
import org.omg.sysml.xtext.adapter.SysMLParserAdapterFactory;
import org.omg.sysml.xtext.adapter.PortUsageParserAdapter;
import org.omg.kerml.xtext.adapter.RedefinitionParserAdapter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.Package;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.PortionKind;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;
import org.omg.sysml.logic.SysMLLogicStandaloneSetup;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.util.TypeUtil;

public class ParserAdapterTest {

	@BeforeClass
	public static void setUp() {
		SysMLLogicStandaloneSetup.doSetup();
		SysMLPackage.eINSTANCE.eClass();
	}

	@Test
	public void factorySelectsTheMostSpecificParserAdapterAndAvoidsDuplicates() {
		PortUsage port = SysMLFactory.eINSTANCE.createPortUsage();
		ElementParserAdapter portAdapter = SysMLParserAdapterFactory.getAdapter(port);
		assertTrue(portAdapter instanceof PortUsageParserAdapter);
		assertEquals(portAdapter, SysMLParserAdapterFactory.getAdapter(port));
		assertEquals(1L, port.eAdapters().stream().filter(ElementParserAdapter.class::isInstance).count());

		OccurrenceUsage occurrence = SysMLFactory.eINSTANCE.createOccurrenceUsage();
		assertTrue(SysMLParserAdapterFactory.getAdapter(occurrence) instanceof OccurrenceUsageParserAdapter);
		assertTrue(SysMLParserAdapterFactory.getAdapter(SysMLFactory.eINSTANCE.createConnectionUsage())
				instanceof OccurrenceUsageParserAdapter);
		assertTrue(SysMLParserAdapterFactory.getAdapter(SysMLFactory.eINSTANCE.createAllocationUsage())
				instanceof OccurrenceUsageParserAdapter);

		LiteralString literal = SysMLFactory.eINSTANCE.createLiteralString();
		assertTrue(SysMLParserAdapterFactory.getAdapter(literal) instanceof LiteralStringParserAdapter);

		assertTrue(SysMLParserAdapterFactory.getAdapter(SysMLFactory.eINSTANCE.createRedefinition())
				instanceof RedefinitionParserAdapter);
		assertTrue(SysMLParserAdapterFactory.getAdapter(SysMLFactory.eINSTANCE.createMembershipImport())
				instanceof ImportParserAdapter);

		SysMLParserAdapterFactory.removeAdapter(port);
		assertFalse(port.eAdapters().stream().anyMatch(ElementParserAdapter.class::isInstance));
	}

	@Test
	public void parserAdapterHierarchyPreservesSpecialCaseBehavior() {
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
		assertFalse(port.isPortion());

		LiteralString literal = SysMLFactory.eINSTANCE.createLiteralString();
		literal.setValue("\"hello\\nworld\"");
		postProcess(literal);
		assertEquals("hello\nworld", literal.getValue());
	}

	@Test
	public void settingCompositeToFalse() throws InvocationTargetException {
		Package test = (Package)createElement(SysMLPackage.Literals.PACKAGE, "test", null);
		Usage p = (Usage)createElement(SysMLPackage.Literals.PART_USAGE, "p", test);
		Usage a = (Usage)createElement(SysMLPackage.Literals.ATTRIBUTE_USAGE, "a", p);
		Usage x = (Usage)createElement(SysMLPackage.Literals.PART_USAGE, "x", p);
		Usage y = (Usage)createElement(SysMLPackage.Literals.PART_USAGE, "y", p);
		y.setDirection(FeatureDirectionKind.IN);
		Usage z = (Usage)createElement(SysMLPackage.Literals.PART_USAGE, "z", p);
		z.setIsVariation(true);
		Usage u = (Usage)createElement(SysMLPackage.Literals.PART_USAGE, "u", z);
		u.setIsVariation(true);
		Usage v = (Usage)createElement(SysMLPackage.Literals.PART_USAGE, "v", u);
		Usage w = (Usage)createElement(SysMLPackage.Literals.PORT_USAGE, "w", u);
		Usage q = (Usage)createElement(SysMLPackage.Literals.PART_USAGE, "q", test);
		q.setIsVariation(true);
		Usage r = (Usage)createElement(SysMLPackage.Literals.PART_USAGE, "r", q);

		postProcess(p, a, x, y, z, u, v, w, q, r);

		assertTrue(p.isReference());
		assertTrue(a.isReference());
		assertFalse(x.isReference());
		assertTrue(y.isReference());
		assertFalse(z.isReference());
		assertFalse(u.isReference());
		assertFalse(v.isReference());
		assertTrue(w.isReference());
		assertTrue(q.isReference());
		assertTrue(r.isReference());
	}

	protected static Element createElement(org.eclipse.emf.ecore.EClass eClass, String name, Namespace parent) {
		Element element = (Element)SysMLFactory.eINSTANCE.create(eClass);
		element.setDeclaredName(name);
		if (element instanceof Usage usage && parent instanceof Usage parentUsage) {
			if (parentUsage.isVariation()) {
				VariantMembership membership = SysMLFactory.eINSTANCE.createVariantMembership();
				membership.setOwnedVariantUsage(usage);
				parentUsage.getOwnedRelationship().add(membership);
			} else {
				TypeUtil.addOwnedFeatureTo(parentUsage, usage);
			}
		} else if (parent != null) {
			NamespaceUtil.addOwnedMemberTo(parent, element);
		}
		return element;
	}

	protected static void postProcess(Element... elements) {
		for (Element element : elements) {
			SysMLParserAdapterFactory.getAdapter(element).postProcess();
			SysMLParserAdapterFactory.removeAdapter(element);
			assertFalse(element.eAdapters().stream().anyMatch(ElementParserAdapter.class::isInstance));
		}
	}

	protected static PartUsage createPartUsage() {
		return SysMLFactory.eINSTANCE.createPartUsage();
	}

	protected static PartUsage createPartUsageOwnedByFeatureMembership() {
		PartUsage owner = createPartUsage();
		PartUsage usage = createPartUsage();
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
