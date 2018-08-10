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
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
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

@RunWith(XtextRunner)
@InjectWith(AlfInjectorProvider)
class AlfMemberNameTest {

	@Inject
	ParseHelper<Package> parseHelper

	@Inject extension ValidationTestHelper

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;

	def ResourceSetImpl getDependency() {
		val rs = resourceSetProvider.get
		parseHelper.parse('''
			package Test1{
				class A{}
				class B{
					class b {}
					b1 is b;
				}
				A1 is A;
				B1 is B;
			}
		''', rs)
		return rs
	}

	@Test
	def void testLocalNamedMember() {
		val rs = resourceSetProvider.get
		val result = parseHelper.parse('''
			package Test{
				class A {}
				A1 is A;
				feature a: A1;
			}
		''', rs)

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testNamedMemberFromOtherPackage() {
		val rs = resourceSetProvider.get
		val result = parseHelper.parse('''
			package Test{
				package P{
					class A {}
					A1 is A;
				}
				P1 is P;
				feature a: P1::A1;
			}
		''', rs)

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testNamedMemberFromOtherPackageBadUseage() {
		val rs = resourceSetProvider.get
		val result = parseHelper.parse('''
			package Test{
				package P{
					class A {}
					A1 is A;
				}
				
				feature a: P1::A1;
			}
		''', rs)

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testNamedMemberFromInheritance() {
		val result = parseHelper.parse('''
			package Test1{
				class A{
					class a {}
					aa is a;
				}
				class B is A{
					feature b: aa;
					b1 is b;
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
			package Test1{
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
	def void testNamedMemberFromInheritance2() {
		val result = parseHelper.parse('''
			package Test1{
				class A{
					class a {}
					aa is a;
				}
				AA is A;
				class B is AA{
					feature b: aa;
					b1 is b;
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
			package Testt {
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

}
