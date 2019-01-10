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
				class A_alias is A;
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
				class B specializes test::A{}
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
					class A_alias is A;
				}
				package P1 is P;
				feature a: P1::A_alias;
			}
		''')

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}
@Test
	def void testNamedMemberFromOtherPackage2() {
		val result = parseHelper.parse('''
			package test{
				package P{
					class A {
						class AA{
							class AAA{}
						}
					}
					class A_alias is A;
				}
				package P1 is P;
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
					class A_alias is A;
				}
				feature a: P1::A_alias;
			}
		''')

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.category, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testNamedMemberFromInheritance() {
		val result = parseHelper.parse('''
			package test{
				class A{
					class a {}
					class aa is a;
				}
				class B specializes A{
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
	def void testNamedMemberFromInheritance_2() {
		val result = parseHelper.parse('''
			package test{
				class EE {}
				class A{
					class a {}
					class aa is a;
				}
				class B specializes A{
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
				class B specializes A{
					class b specializes a {}
				}
				class C specializes B{
					class c specializes a {}
				}
				class D specializes A::a{} 
				class EE {}
			}
		''')
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}
	@Test
	def void testMultipleInheritance_2() {
		val result = parseHelper.parse('''
			package test{
				class A{
					class a {
						class aa{}
					}
				}
				class B specializes A{
					class b specializes a {}
				}
				class C specializes B{
					class c specializes a {}
				}
				class D specializes A::a{} 
				class EE {}
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
				class B specializes A{
					class b specializes a {}
				}
				class C specializes B{
					class c specializes a {}
				}
				class D specializes C::a{}
			}
		''')
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}
		@Test
	def void testMultipleInheritance2_2() {
		val result = parseHelper.parse('''
			package test{
				class A{
					class a {
						class aa{}
					}
				}
				class B specializes A{
					class b specializes a {}
				}
				class C specializes B{
					class c specializes a {}
				}
				class D specializes C::a{}
			}
		''')
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	def void testMultipleInheritance2x() {
		val result = parseHelper.parse('''
			package test{
				
				class C specializes B{

					class c specializes a {}
				}
				class B specializes A{
					class b specializes a {}
				}
				class A{
					class a {}
				}
				class EE{}
				class D specializes C::a{}
				
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
				class B specializes A{
					class b specializes a {}
				}
				class C specializes B{
					class c2 specializes a {}
					class c2 specializes b {}
				}
				class D specializes C::a{
					class d specializes aa  {}
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
					class aa is a;
				}
				AA is A;
				class B specializes AA{
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
				private class k is something;
				class hello{
					class test specializes k{}
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
				feature C redefines B::a;
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
