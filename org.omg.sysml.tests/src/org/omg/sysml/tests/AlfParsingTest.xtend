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
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.resource.XtextResourceSet
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
import com.google.inject.Provider

@RunWith(XtextRunner)
@InjectWith(AlfInjectorProvider)
class AlfParsingTest {
	@Inject
	ParseHelper<Package> parseHelper

	@Inject extension ValidationTestHelper

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;

	private def ResourceSetImpl getDependency() {
		val rs = resourceSetProvider.get
		parseHelper.parse(
		'''package Test1{
				class A{}
				class B{
					feature b: A;
				}
			}''', rs)
		return rs
	}

	@Test
	def void testScopeWithOnlyDot() {

		val rs = dependency

		val result = parseHelper.parse('''
			package Test2{
				class C{
					feature c : Test1.B.b;
				}
			}
		''', rs)
		Assert.assertNotNull(result)

		result.assertNoErrors

		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testScopeWithDotAndFourDot() {

		val rs = dependency

		val result = parseHelper.parse('''
			package Test2{
				class C{
					feature c : Test1.B::b;
				}
			}
		''', rs)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.package, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
	}

	@Test
	def void testScopeWithFourDotAndDot() {

		val rs = dependency

		val result = parseHelper.parse('''
			package Test2{
				class C{
					feature c : Test1::B.b;
				}
			}
		''', rs)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.package, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
	}

	@Test
	def void testScopeWithOnlyFourDot() {

		val rs = dependency

		val result = parseHelper.parse('''
			package Test2{
				class C{
					feature c : Test1::B::b;
				}
			}
		''', rs)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testBadScopeWithOnlyTwoDotAtTheEnd() {

		val result = parseHelper.parse('''
			package Test3{
				class non{}
				class A{
					feature aa is non;
					feature a: A;
				}
			
				class B{
				feature b: Test3::A:a;
				}
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.package, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
	}

	@Test
	def void testBadScopeWithOnlyTwoSingleDotAtTheEnd() {

		val result = parseHelper.parse('''
			package Test3{
				class non{}
				class A{
					feature aa is non;
					feature a: A;
				}

				class B{
					feature b: Test3::A..a;
				}
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.package, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
	}

	@Test
	def void testBadScopeWithOnlyTwoSingleDot() {

		val result = parseHelper.parse('''
			package Test3{
				class non{}
				class A{
					feature aa is non;
					feature a: A;
				}

				class B{
					feature b: Test3..A::a;
				}
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 2)

		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC, 110, -1)
		result.assertError(SysMLPackage.eINSTANCE.membership, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC, 117, -1)
	}

	@Test
	def void testBadScopeWithOnlyTwoDot() {

		val result = parseHelper.parse('''
			package Test3{
				class non{}
				class A{
					feature aa is non;
					feature a: A;
				}

				class B{
					feature b: Test3:A::a;
				}
			}
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 2)

		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC, 110, -1)
		result.assertError(SysMLPackage.eINSTANCE.membership, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC, 116, -1)
	}

}
