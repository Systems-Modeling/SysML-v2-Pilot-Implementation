/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.logic;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.SysMLLibraryUtil;

public class NamespaceResolutionDelegateTest {

	private final SysMLFactory factory = SysMLFactory.eINSTANCE;

	/**
	 * Verifies that lexical resolution stops at the innermost namespace when both
	 * the current scope and an outer scope provide a membership with the same
	 * name.
	 */
	@Test
	public void resolveLocalPrefersTheCurrentNamespace() {
		initializeStandalone();

		Namespace root = createNamespace("Root");
		Namespace outer = createNamespace("Outer");
		addOwnedElement(root, outer);
		Type inner = createType("Inner");
		addOwnedElement(outer, inner);

		Membership outerMember = addNamedMembership(outer, createType("shared"), "shared");
		Membership innerMember = addNamedMembership(inner, createType("shared"), "shared");

		assertSame(innerMember, inner.resolveLocal("shared"));
		assertSame(outerMember, outer.resolveLocal("shared"));
	}

	/**
	 * Verifies that lexical resolution continues with the owning namespace when
	 * the current namespace does not define the requested membership.
	 */
	@Test
	public void resolveLocalFallsBackToContainingNamespace() {
		initializeStandalone();

		Namespace root = createNamespace("Root");
		Namespace outer = createNamespace("Outer");
		addOwnedElement(root, outer);
		Type inner = createType("Inner");
		addOwnedElement(outer, inner);

		Membership outerMember = addNamedMembership(outer, createType("outerOnly"), "outerOnly");

		assertSame(outerMember, inner.resolveLocal("outerOnly"));
	}

	/**
	 * Verifies the spec rule for root namespaces: simple-name resolution from a
	 * root namespace defers directly to global lookup rather than searching local
	 * memberships first.
	 */
	@Test
	public void resolveUsesGlobalLookupFromARootNamespace() {
		initializeStandalone();

		Namespace library = createNamespace("Library");
		Type anything = createType("Anything");
		OwningMembership anythingMembership = addOwnedElement(library, anything);
		Namespace root = createNamespace("Root");

		SysMLLibraryUtil.setProviderLookup(resource -> (context, name) -> "Anything".equals(name) ? anything : null);

		assertSame(anythingMembership, root.resolveLocal("Anything"));
		assertSame(anythingMembership, root.resolve("Anything"));
	}

	/**
	 * Verifies that {@code resolve(simpleName)} follows the same lexical search
	 * path as {@code resolveLocal(simpleName)} for a non-root namespace.
	 */
	@Test
	public void resolveSimpleNameMatchesResolveLocal() {
		initializeStandalone();

		Namespace root = createNamespace("Root");
		Namespace outer = createNamespace("Outer");
		addOwnedElement(root, outer);
		Type inner = createType("Inner");
		addOwnedElement(outer, inner);
		Membership outerMember = addNamedMembership(outer, createType("outerOnly"), "outerOnly");

		assertSame(outerMember, inner.resolve("outerOnly"));
		assertSame(inner.resolveLocal("outerOnly"), inner.resolve("outerOnly"));
	}

	/**
	 * Verifies that qualified-name resolution first resolves the qualifier to a
	 * namespace membership, then resolves the final segment against that
	 * namespace's visible memberships.
	 */
	@Test
	public void resolveQualifiedNameUsesResolvedNamespaceVisibility() {
		initializeStandalone();

		Namespace root = createNamespace("Root");
		Namespace outer = createNamespace("Outer");
		addOwnedElement(root, outer);
		Type inner = createType("Inner");
		addOwnedElement(outer, inner);
		addNamedMembership(outer, inner, "Inner");
		Membership leafMembership = addNamedMembership(inner, createType("leaf"), "leaf");

		assertSame(leafMembership, outer.resolve("Inner::leaf"));
	}

	/**
	 * Verifies that qualified-name resolution returns {@code null} when an
	 * intermediate qualifier resolves to a membership whose member element is not
	 * a namespace.
	 */
	@Test
	public void resolveReturnsNullForNonNamespaceQualifier() {
		initializeStandalone();

		Namespace root = createNamespace("Root");
		Namespace outer = createNamespace("Outer");
		addOwnedElement(root, outer);
		Comment comment = factory.createComment();
		Membership commentMembership = addAliasedMember(outer, comment, "NotNs");

		assertSame(commentMembership, outer.resolve("NotNs"));
		assertNull(outer.resolve("NotNs::leaf"));
	}

	/**
	 * Verifies that a missing library lookup produces {@code null} rather than an
	 * exception when {@code resolveGlobal} cannot resolve a requested name.
	 */
	@Test
	public void resolveGlobalReturnsNullOnMiss() {
		initializeStandalone();

		Namespace root = createNamespace("Root");
		SysMLLibraryUtil.setProviderLookup(resource -> (context, name) -> null);

		assertNull(root.resolveGlobal("Missing"));
		assertNull(root.resolveLocal("Missing"));
	}

	/**
	 * Verifies that both simple-name and qualified-name resolution handle names
	 * that require KerML escaping in concrete syntax, such as names containing
	 * spaces.
	 */
	@Test
	public void resolveHandlesNamesThatRequireEscaping() {
		initializeStandalone();

		Namespace root = createNamespace("Root");
		Namespace outer = createNamespace("Outer");
		addOwnedElement(root, outer);
		Type inner = createType("Inner");
		addOwnedElement(outer, inner);
		addNamedMembership(outer, inner, "Inner");
		Membership spacedMembership = addNamedMembership(inner, createType("name with space"), "name with space");

		assertSame(spacedMembership, inner.resolveLocal("name with space"));
		assertSame(spacedMembership, outer.resolve("Inner::'name with space'"));
	}

	/**
	 * Installs the standalone delegate and library-resolution bootstrap used by
	 * these direct EMF tests, while resetting any provider lookup state left by a
	 * previous test.
	 */
	private void initializeStandalone() {
		SysMLLibraryUtil.setProviderLookup(null);
		SysMLLogicStandaloneSetup.doSetup();
		SysMLPackage.eINSTANCE.eClass();
	}

	/**
	 * Creates a namespace with the given declared name.
	 *
	 * @param name the declared namespace name used in the test fixture
	 * @return a new namespace instance
	 */
	private Namespace createNamespace(String name) {
		Namespace namespace = factory.createNamespace();
		namespace.setDeclaredName(name);
		return namespace;
	}

	/**
	 * Creates a type with the given declared name.
	 *
	 * @param name the declared type name used in the test fixture
	 * @return a new type instance
	 */
	private Type createType(String name) {
		Type type = factory.createType();
		type.setDeclaredName(name);
		return type;
	}

	/**
	 * Adds an owning membership so that the given element is contained by the
	 * owner namespace and participates in the owning-namespace chain used by
	 * lexical resolution.
	 *
	 * @param owner the namespace that should own the element
	 * @param element the contained element
	 * @return the created owning membership
	 */
	private OwningMembership addOwnedElement(Namespace owner, org.omg.sysml.lang.sysml.Element element) {
		OwningMembership membership = factory.createOwningMembership();
		membership.setOwnedMemberElement(element);
		owner.getOwnedRelationship().add(membership);
		return membership;
	}

	/**
	 * Adds a named membership alias in the given namespace without changing the
	 * containment of the member element.
	 *
	 * @param owner the namespace in which the alias is visible
	 * @param element the referenced member element
	 * @param name the membership name used for lookup
	 * @return the created membership alias
	 */
	private Membership addNamedMembership(Namespace owner, org.omg.sysml.lang.sysml.Element element, String name) {
		Membership membership = factory.createMembership();
		membership.setMemberElement(element);
		membership.setMemberName(name);
		owner.getOwnedRelationship().add(membership);
		return membership;
	}

	/**
	 * Adds a non-owning named membership alias used when the concrete member type
	 * under test is not itself a namespace.
	 *
	 * @param owner the namespace in which the alias is visible
	 * @param element the referenced member element
	 * @param name the membership name used for lookup
	 * @return the created alias membership
	 */
	private Membership addAliasedMember(Namespace owner, org.omg.sysml.lang.sysml.Element element, String name) {
		return addNamedMembership(owner, element, name);
	}
}
