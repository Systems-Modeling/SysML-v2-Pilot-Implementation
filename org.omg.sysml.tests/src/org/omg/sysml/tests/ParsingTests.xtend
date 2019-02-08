/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018, 2019 California Institute of Technology/Jet Propulsion Laboratory
 * Copyright (c) 2019 Model Driven Solutions
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
 *  Zoltan Kiss, IncQuery
 *  Balazs Grill, IncQuery
 *  Miyako Wilson, JPL
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.tests

import com.google.inject.Inject
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
import org.omg.sysml.tests.AlfInjectorProvider

@RunWith(XtextRunner)
@InjectWith(AlfInjectorProvider)
class ParsingTests {
	@Inject
	ParseHelper<Package> parseHelper

	@Inject extension ValidationTestHelper

	@Inject extension Dependency

	@Test
	def void testScopeWithOnlyDot() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				class C{
					feature c : OuterPackage.B.b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testUseFullQualifiedName1() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class A {}
				class B specializes test::A{}
			}
		''', rs)

		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testScopeWithDotAndFourDot() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				class C{
					feature c : OuterPackage.B::b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.package, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
	}

	@Test
	def void testScopeWithFourDotAndDot() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				class C{
					feature c : OuterPackage::B.b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.package, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
	}

	@Test
	def void testUseFullQualifiedNameFourDot() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				class C{
					feature c : OuterPackage::B::b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testBadScopeWithOnlyTwoDotAtTheEnd() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class non{}
				class A{
					feature aa is non;
					feature a: A;
				}
				class B{
					feature b: Test3::A:a;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.package, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
	}

	@Test
	def void testBadScopeWithOnlyTwoSingleDotAtTheEnd() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class non{}
				class A{
					feature aa is non;
					feature a: A;
				}
				class B{
					feature b: test::A..a;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.package, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
	}

	@Test
	def void testBadScopeWithOnlyTwoSingleDot() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class non{}
				class A{
					feature aa is non;
					feature a: A;
				}
				class B{
					feature b: test..A::a;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 2)
		result.assertError(SysMLPackage.eINSTANCE.feature, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.featureMembership, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
	}

	@Test
	def void testBadScopeWithOnlyTwoDot() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class non{}
				class A{
					feature aa is non;
					feature a: A;
				}
				class B{
					feature b: test:A::a;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 2)
		result.assertError(SysMLPackage.eINSTANCE.feature, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.featureMembership, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
	}
}
