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
class MemberNameTests {
	@Inject
	ParseHelper<Package> parseHelper

	@Inject extension ValidationTestHelper

	@Test
	def void testLocalNamedMember() {
		val result = parseHelper.parse('''
			package test{
				class A {}
				A_alias is A;
				feature a: A_alias;
			}
		''')

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testUseFullQualifiedNameInTheSamePackage() {
		val result = parseHelper.parse('''
			package test{
				class A {}
				class B is test::A{}
			}
		''')

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testNamedMemberFromOtherPackage() {
		val result = parseHelper.parse('''
			package test{
				package P{
					class A {}
					A_alias is A;
				}
				P1 is P;
				feature a: P1::A_alias;
			}
		''')

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testNamedMemberFromOtherPackageBadUseage() {
		val result = parseHelper.parse('''
			package test{
				package P{
					class A {}
					A_alias is A;
				}
				feature a: P1::A_alias;
			}
		''')

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testNamedMemberFromInheritance() {
		val result = parseHelper.parse('''
			package test{
				class A{
					class a {}
					aa is a;
				}
				class B is A{
					feature b: aa;
					b_alias is b;
				}
			}
		''')

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testMultipleInheritance() {
		val result = parseHelper.parse('''
			package test{
				class A{
					class a {}
				}
				class B is A{
					class b is a {}
				}
				class C is B{
					class c is a {}
				}
			}
		''')
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testMultipleInheritance2() {
		val result = parseHelper.parse('''
			package test{
				class A{
					class a {}
				}
				class B is A{
					class b is a {}
				}
				class C is B{
					class c is a {}
				}
				class D is C::a{}
			}
		''')
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testMultipleInheritance3() {
		val result = parseHelper.parse('''
			package test{
				class A{
					class a {
						class aa{}		
					}
				}
				class B is A{
					class b is a {}
				}
				class C is B{
					class c2 is a {}
					class c2 is b {}
				}
				class D is C::a{
					class d is aa  {}
				}
			}
		''')
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testNamedMemberFromInheritance2() {
		val result = parseHelper.parse('''
			package test{
				class A{
					class a {}
					aa is a;
				}
				AA is A;
				class B is AA{
					feature b: aa;
					b_alias is b;
				}
			}
		''')

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testNamedMemberForPrivate() {
		val result = parseHelper.parse('''
			package test {
				private class something{}
				private k is something;
				class hello{
					class test is k{}
				}
			}
		''')

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testFeatureRedefinition() {
		val result = parseHelper.parse('''
			package testt {
				feature A{
					feature a{}
				}
				feature B is A;
				feature C;
				C redefines B::a;
			}
		''')

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testFeatureSubset() {
		val result = parseHelper.parse('''
			package testt {
				feature A{
					feature a{}
				}
				feature B is A;
				feature C subsets B.a;
			}
		''')

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

}
