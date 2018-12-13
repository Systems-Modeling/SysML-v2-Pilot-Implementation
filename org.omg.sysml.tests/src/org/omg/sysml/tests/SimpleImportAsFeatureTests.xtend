/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
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
 * Contributors:
 *  Zoltan Kiss
 *  Balazs Grill
 * 
 *****************************************************************************/
package org.omg.sysml.tests

import com.google.inject.Inject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.SysMLPackage

@RunWith(XtextRunner)
@InjectWith(AlfInjectorProvider)
class SimpleImportAsFeatureTests {
	@Inject
	ParseHelper<Package> parseHelper

	@Inject extension ValidationTestHelper

	@Inject extension Dependency

	@Test
	def void testImportClassAlias() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				import OuterPackage.A as aliass;
				class C {
					feature c: aliass;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportClass() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				import OuterPackage.A;
				class C {
					feature c: A;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportFeatureAlias() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				import OuterPackage.B.b as aliass;
				class C {
					feature c: aliass;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportFeature() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				import OuterPackage.B.b;
				class C {
					feature c: b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	// Tests for bad cases
	@Test
	def void testBadImportFeature() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				import OuterPackage.B;
				class C {
					feature c: b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.category, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testBadImportFeature2() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				import OuterPackage;
				class C {
					feature c: b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.category, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testBadImportClass() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				import OuterPackage;
				class C {
					feature c: b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.category, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testBadImportClass2() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				import OuterPackage.B.b;
				class C {
					feature c: B;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.category, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}
}
