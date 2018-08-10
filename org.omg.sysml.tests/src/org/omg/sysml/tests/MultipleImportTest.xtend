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
class MultipleImportTest {

	@Inject
	ParseHelper<Package> parseHelper

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;

	@Inject extension ValidationTestHelper

	def ResourceSetImpl getDependencyImport() {
		val rs = resourceSetProvider.get
		parseHelper.parse('''
			package Test1{
				class A{}
				class B{
					feature b: A;
				}
			}
		''', rs)
		parseHelper.parse('''
			package Test2{
				import Test1::*;
				class C is B{
					feature c;
				}
			}
		''', rs)
		return rs
	}

	def ResourceSetImpl getDependencyMembership() {
		val rs = resourceSetProvider.get
		parseHelper.parse('''
			package Test1{
				class A{}
				class B{
					feature b: A;
				}
			}
		''', rs)
		parseHelper.parse('''
			package Test2{
				import Test1::B;
				class C is B{
					feature c;
				}
			}
		''', rs)
		return rs
	}

	def ResourceSetImpl getDependencyMembership2() {
		val rs = dependencyMembership
		parseHelper.parse('''
			package Test3{
				import Test2::C;
				class D is C{
					feature f : b;
				}
			}
		''', rs)
		return rs
	}

	@Test
	def void testImportClass() {
		val rs = dependencyMembership
		val result = parseHelper.parse('''
			package test{
				import Test2::C;
				class D is C{
					feature try : b;
				}
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportClassWithAlias() {
		val rs = dependencyMembership
		Assert.assertNotNull(rs)
		EcoreUtil2.resolveAll(rs)
		val result = parseHelper.parse('''
			package test{
				import Test2::C as CC;
				class D is CC{
					feature try : b;
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
		val rs = dependencyMembership
		val result = parseHelper.parse('''
			package test{
				import Test2::C::b;
				class D{
					feature try : b;
				}
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.element, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.size == 2)
	}

	@Test
	def void testImportFeatureWithAlias() {
		val rs = dependencyMembership
		val result = parseHelper.parse('''
			package test{
				import Test2::C ;
				B as bb;
				class D{
					feature try : bb;
				}
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.size == 1)
		result.assertError(SysMLPackage.eINSTANCE.membership, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)

	}

	@Test
	def void testImportClassMoreTimes() {
		val rs = getDependencyMembership2
		val result = parseHelper.parse('''
			package test{
				import Test3::D;
				class EE is D{
					feature try : b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportFeatureMoreTimes() {
		val rs = getDependencyMembership2
		val result = parseHelper.parse('''
			package test{
				import Test3::D;
				class EE is B{
					feature try : b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.feature, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.size == 2)
	}

	// import::* => import ::*
	@Test
	def void testImportImportImp() {
		val rs = getDependencyImport
		val result = parseHelper.parse('''
			package test{
				import Test2::*;
				class Test is C {
					feature try : b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	// import::* => import ::C;
	@Test
	def void testImportMembershipImp() {
		val rs = getDependencyImport
		val result = parseHelper.parse('''
			package test{
				import Test2::C;
				class Test is C {
					feature try : b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	// import::B => import ::*;
	@Test
	def void testMembershipImportImp() {
		val rs = dependencyMembership
		val result = parseHelper.parse('''
			package test{
				import Test2::*;
				class Test is C {
					feature try : b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

}
