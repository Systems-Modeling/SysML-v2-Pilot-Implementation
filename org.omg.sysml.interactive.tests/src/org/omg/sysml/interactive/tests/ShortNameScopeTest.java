/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2026 tkanov
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License, version 2, as published by
 * the Eclipse Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 */
package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;

/**
 * Tests for resolving qualified names whose first segment is the short name of a
 * Package, both within a single resource and across resources (see issue #778).
 */
public class ShortNameScopeTest extends SysMLInteractiveTest {

	private void assertNoIssues(SysMLInteractive instance, String input) {
		SysMLInteractiveResult result = instance.process(input);
		assertTrue("'" + input + "':\n" + result.formatIssues(), result.getIssues().isEmpty());
	}

	@Test
	public void testShortNameQualificationSameResource() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		assertNoIssues(instance, "package <P> Alpha { part def Foo; } package Beta { part x : P::Foo; }");
	}

	@Test
	public void testDeclaredNameQualificationAcrossResources() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		assertNoIssues(instance, "package <P> Alpha { part def Foo; }");
		assertNoIssues(instance, "package Beta { part x : Alpha::Foo; }");
	}

	@Test
	public void testShortNameQualificationAcrossResources() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		assertNoIssues(instance, "package <P> Alpha { part def Foo; }");
		assertNoIssues(instance, "package Beta { part x : P::Foo; }");
	}

	@Test
	public void testShortNameImportAcrossResources() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		assertNoIssues(instance, "package <P> Alpha { part def Foo; }");
		assertNoIssues(instance, "package Beta { private import P::*; part x : Foo; }");
	}
	@Test
	public void testLibraryPackageIsNotShadowedByShortName() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		// 'ScalarValues' is the declaredName of a standard library package, and here also the
		// short name of a user package. References to the library package must still resolve.
		assertNoIssues(instance, "package <ScalarValues> MyPackage { part def Foo; }");
		assertNoIssues(instance, "package Beta { attribute a : ScalarValues::Real; }");
	}

	@Test
	public void testDeclaredNameTakesPrecedenceOverShortName() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		assertNoIssues(instance, "package <P> Alpha { part def Foo; }");
		assertNoIssues(instance, "package P { part def Bar; }");
		assertNoIssues(instance, "package Beta { part x : P::Bar; }");
	}

	@Test
	public void testDeclaredNameTakesPrecedenceOverShortNameWhenDeclaredFirst() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		assertNoIssues(instance, "package P { part def Bar; }");
		assertNoIssues(instance, "package <P> Alpha { part def Foo; }");
		assertNoIssues(instance, "package Beta { part x : P::Bar; }");
	}
}
