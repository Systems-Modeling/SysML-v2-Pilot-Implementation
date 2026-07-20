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
package org.omg.sysml.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.Package;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TextualRepresentation;
import org.omg.sysml.util.ElementUtil;

public class LexicalNormalizationServiceTest {

	private static final SysMLFactory FACTORY = SysMLFactory.eINSTANCE;

	private final LexicalNormalizationService service = new LexicalNormalizationService();

	@BeforeClass
	public static void setUp() {
		SysMLLogicStandaloneSetup.doSetup();
		SysMLPackage.eINSTANCE.eClass();
	}

	@Test
	public void normalizesElementNames() {
		Package element = FACTORY.createPackage();
		element.setDeclaredName("'declared name'");
		element.setDeclaredShortName("'short name'");

		this.service.normalize(element);

		assertEquals("declared name", element.getDeclaredName());
		assertEquals("short name", element.getDeclaredShortName());
	}

	@Test
	public void normalizesNonOwningMembershipNames() {
		Membership membership = FACTORY.createMembership();
		membership.setDeclaredName("'membership'");
		membership.setMemberName("'member name'");
		membership.setMemberShortName("'member short name'");

		this.service.normalize(membership);

		assertEquals("membership", membership.getDeclaredName());
		assertEquals("member name", membership.getMemberName());
		assertEquals("member short name", membership.getMemberShortName());
	}

	@Test
	public void preservesOwningMembershipNames() {
		OwningMembership membership = FACTORY.createOwningMembership();
		Package ownedMember = FACTORY.createPackage();
		ownedMember.setDeclaredName("'member name'");
		ownedMember.setDeclaredShortName("'member short name'");
		membership.getOwnedRelatedElement().add(ownedMember);

		this.service.normalize(membership);

		assertEquals("'member name'", membership.getMemberName());
		assertEquals("'member short name'", membership.getMemberShortName());
	}

	@Test
	public void normalizesComment() {
		Comment comment = FACTORY.createComment();
		comment.setLocale("'en-US'");
		comment.setBody("/*first\n*second*/");

		this.service.normalize(comment);

		assertEquals("en-US", comment.getLocale());
		assertEquals("first\nsecond", comment.getBody());
	}

	@Test
	public void normalizesTextualRepresentation() {
		TextualRepresentation representation = FACTORY.createTextualRepresentation();
		representation.setLanguage("'KerML'");
		representation.setBody("/*body*/");

		this.service.normalize(representation);

		assertEquals("KerML", representation.getLanguage());
		assertEquals("body", representation.getBody());
	}

	@Test
	public void normalizesLiteralString() {
		LiteralString literal = FACTORY.createLiteralString();
		literal.setValue("\"first\\nsecond\"");

		this.service.normalize(literal);

		assertEquals("first\nsecond", literal.getValue());
	}

	@Test
	public void acceptsNullValuesAndElement() {
		Package element = FACTORY.createPackage();

		this.service.normalize(null);
		this.service.normalize(element);

		assertNull(element.getDeclaredName());
		assertNull(element.getDeclaredShortName());
	}

	@Test
	public void adaptersDelegateToTheirSpecificNormalizationCases() {
		Package element = FACTORY.createPackage();
		element.setDeclaredName("'element'");
		ElementUtil.postProcess(element);
		assertEquals("element", element.getDeclaredName());

		Membership membership = FACTORY.createMembership();
		membership.setDeclaredName("'membership'");
		membership.setMemberName("'member'");
		ElementUtil.postProcess(membership);
		assertEquals("membership", membership.getDeclaredName());
		assertEquals("member", membership.getMemberName());

		Comment comment = FACTORY.createComment();
		comment.setDeclaredName("'comment'");
		comment.setLocale("'fr'");
		comment.setBody("/*body*/");
		ElementUtil.postProcess(comment);
		assertEquals("comment", comment.getDeclaredName());
		assertEquals("fr", comment.getLocale());
		assertEquals("body", comment.getBody());

		TextualRepresentation representation = FACTORY.createTextualRepresentation();
		representation.setDeclaredName("'representation'");
		representation.setLanguage("'SysML'");
		representation.setBody("/*text*/");
		ElementUtil.postProcess(representation);
		assertEquals("representation", representation.getDeclaredName());
		assertEquals("SysML", representation.getLanguage());
		assertEquals("text", representation.getBody());

		LiteralString literal = FACTORY.createLiteralString();
		literal.setDeclaredName("'literal'");
		literal.setValue("\"value\"");
		ElementUtil.postProcess(literal);
		assertEquals("literal", literal.getDeclaredName());
		assertEquals("value", literal.getValue());
	}
}
