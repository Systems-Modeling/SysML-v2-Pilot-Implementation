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
import org.omg.sysml.lang.sysml.Class
import org.omg.sysml.lang.sysml.Generalization
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.tests.AlfInjectorProvider

@RunWith(XtextRunner)
@InjectWith(AlfInjectorProvider)
class ShadowingTest {

	@Inject
	ParseHelper<Package> parseHelper

	@Inject extension Dependency

	@Inject extension ValidationTestHelper

	/*
	 * 	Tests for same names in same file
	 */
	@Test
	def void testSameNamesInnerClassAndOuterClass() {
		val result = parseHelper.parse('''
			package test{
				class A{
					class A{
						class B specializes A{}
					}
				}
			}
		''')
		val outerA = result.ownedMembership.head.ownedMemberElement as Class
		val innerA = outerA.ownedMembership.head.ownedMemberElement as Class
		val B = innerA.ownedMembership.head.ownedMemberElement as Class
		val gen = B.ownedElement.head as Generalization

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertEquals(gen.general, innerA)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	// first will be used
	@Test
	def void testSameNamesGoodCase() {
		val result = parseHelper.parse('''
			package test{
				class A{
					class a1{}
				}
				class A{
					class a2{}
				}
				class B specializes A{
					class b specializes a1{}
				}
			}
		''')

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}
	@Test
	def void testSameNamesGoodCase2() {
		val result = parseHelper.parse('''
			package test{
				class A{
					class a1{ class a11{}}
					class a3{}
				}
				class A{
					class a2{}
				}
				class C specializes test::B::a2 {
				}
				class B specializes A{
					class b specializes a1::a11{}
				}
			}
		''')

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testSameNamesBadCase() {

		val result = parseHelper.parse('''
			package test{
				class A{
					class a1{}
				}
				class A{
					class a2{}
				}
				class B specializes A{
					class b specializes a2{}
				}
			}
		''')
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	/*
	 * 	Tests for same names in same file with alias
	 */
	@Test
	def void testSameNamesInnerClassAndOuterClassWithAlias() {
		val result = parseHelper.parse('''
			package test{
				class A is A1;
				class A1{
					class A{
						class B specializes A{}
					}
				}
			}
		''')
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)

		val classA1 = result.ownedMembership.get(1).ownedMemberElement as Class
		val classA = classA1.ownedMembership.head.ownedMemberElement as Class
		val B = classA.ownedMembership.head.ownedMemberElement as Class
		val gen = B.ownedElement.head as Generalization
		Assert.assertEquals(gen.general, classA)

		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	// first will be used
	@Test
	def void testSameNamesGoodCaseWithAlias() {
		val result = parseHelper.parse('''
			package test{
				class A1 is A;
				class A{
					class a1{}
				}
				class A{
					class a2{}
				}
				class B specializes A{
					class b specializes a1{}
				}
			}
		''')
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)

		val class_a1 = (result.ownedMembership.get(1).ownedMemberElement as Class).ownedMembership.head.
			ownedMemberElement as Class
		val class_b = (result.ownedMembership.get(3).ownedMemberElement as Class).ownedMembership.head.
			ownedMemberElement as Class
		val gen = class_b.ownedElement.head as Generalization
		Assert.assertEquals(gen.general, class_a1)

		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testSameNamesBadCaseWithAlias() {
		val result = parseHelper.parse('''
			package test{
				class A{
					class a1{}
				}
				class A{
					class a2{}
				}
				class B specializes A{
					class b specializes a2{}
				}
			}
		''')
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	/*
	 * 	Tests for import if there are more possibility for import package,
	 */
	@Test
	def void testSameNamesImport() {
		val rs = dependencySameNamesImport

		val result = parseHelper.parse('''
			package test{
				import SamePackage::container::*;
				class something1 specializes A{}
				class something2 specializes B{}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		// only one of the packages is imported
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testSameNamesImportAsFeature() {
		val rs = dependencySameNamesImport
		val result = parseHelper.parse('''
			package test{
				import SamePackage::container;
				class something1 specializes container::A{}
				class something2 specializes container::B{}
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		// only one of the packages is imported
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		System.out.println(result.eResource.errors.get(0).getMessage())//Couldn't resolve reference to Category 'container::B'.
	}

	@Test
	def void testImportAndInnerClassesNamesAreTheSameBadCase1() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				import OuterPackage::*;
				class A{
					class a2{}
				}
				class B specializes A::a1 {}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		System.out.println(result.eResource.errors.get(0).getMessage())
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testImportAndInnerClassesNamesAreTheSameGoodCase1() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				import OuterPackage::*;
				class A{
					class a2{}
				}
				class B specializes A::a2 {}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportAndInnerClassesNamesAreTheSameBadCase2() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				import OuterPackage::*;
				class A{
					class a2{}
				}
				class B specializes A {
					class b specializes a1{}
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testImportAndInnerClassesNamesAreTheSameGoodCase2() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				import OuterPackage::*;
				class A{
					class a2{}
				}
				class B specializes A {
					class b specializes a2 {}
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportAndInnerClassesNamesAreTheSameBadCase3() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				
				class A{
					class a2{}
				}
				class inner{
					import OuterPackage::*;
					class B specializes A {
						class b specializes a1{}
					}
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportAndInnerClassesNamesAreTheSameGoodCase3() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				class A{
					class a2{}
				}
				class inner{
					import OuterPackage::*;
					class B specializes A {
						class b specializes a2{}
					}
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	// TODO: catch the exception
	// (expected = org.eclipse.xtext.linking.lazy.LazyLinkingResource$CyclicLinkingException)
	@Test
	def void CircleInheritance() {
		val rs = getDependencyOuterPackage

		val result = parseHelper.parse('''
			package Test1{
				class A specializes A.B{
					class B specializes A{}
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.size == 1)
	}

	// TODO: catch the exception
	// (expected = org.eclipse.xtext.linking.lazy.LazyLinkingResource$CyclicLinkingException)
	@Test
	def void CircleProblem2() {
		val rs = getDependencyOuterPackage

		val result = parseHelper.parse('''
			package Test1{
				class A {
					import B::*;
					class B specializes A{}
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.size == 1)
	}

	@Test
	def void CircleProblem3() {
		val rs = getDependencyOuterPackage

		val result = parseHelper.parse('''
			package Test1{
				class A {
					import B::*;
					class B {
						import A::*;
					}
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void CircleProblem4() {
		val rs = getDependencyOuterPackage

		val result = parseHelper.parse('''
			package Test1{
				class A specializes A.B {
					class B {
						import A::*;
					}
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	// TODO: catch the exception
	// (expected = org.eclipse.xtext.linking.lazy.LazyLinkingResource$CyclicLinkingException)
	@Test
	def void CircleProblem5() {
		val rs = getDependencyOuterPackage

		val result = parseHelper.parse('''
			package Test1{
				class A specializes D{
					class B specializes C{}
				}
				class C specializes A{}
				class D specializes A.B{}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.size == 1)
	}

	@Test
	def void testAliasImportInMembership() {
		val rs = getDependencyAlias

		val result = parseHelper.parse('''
			package Test1{
				import PackageAlias1::A_alias;
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.membership, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.size == 1)
	}

	@Test
	def void testImportAlias() {
		val rs = getDependencyAlias

		val result = parseHelper.parse('''
			package Test1{
				import PackageAlias1::A_alias::*;
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.import, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.size == 1)
	}

	@Test
	def void testImportPackageAlias1() {
		val rs = getDependencyAlias
		val result = parseHelper.parse('''
			package test{
				import PackageAlias1::*;
				class A{}
				class test_A specializes A{}
				class test_alias specializes A_alias{}
			}
		''', rs)

		val class_A = result.ownedMembership.get(0).ownedMemberElement as Class
		val class_test_A = result.ownedMembership.get(1).ownedMemberElement as Class
		val class_test_alias = result.ownedMembership.get(2).ownedMemberElement as Class
		val gen_test_A = class_test_A.ownedElement.head as Generalization
		val gen_test_alias = class_test_alias.ownedElement.head as Generalization
		val imported_A = (result.ownedImport.get(0).importedPackage as Package).ownedMembership.get(1).
			ownedMemberElement as Class

		Assert.assertEquals(gen_test_A.general, class_A)
		Assert.assertNotEquals(gen_test_A, gen_test_alias)
		Assert.assertEquals(imported_A, gen_test_alias.general)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportPackageAlias2() {
		val rs = getDependencyAlias
		val result = parseHelper.parse('''
			package test{
				import PackageAlias1::*;
				class A{}
				class A_alias is A;
				class test_A specializes A_alias{}
			}
		''', rs)

		val class_A = result.ownedMembership.get(0).ownedMemberElement as Class
		val class_test_A = result.ownedMembership.get(2).ownedMemberElement as Class
		val A_alias = result.ownedMembership.get(1).memberElement as Class
		val gen_test_A = class_test_A.ownedElement.head as Generalization
		val imported_A = (result.ownedImport.get(0).importedPackage as Package).ownedMembership.get(1).
			ownedMemberElement as Class

		Assert.assertEquals(gen_test_A.general, class_A)
		Assert.assertNotEquals(A_alias, imported_A)
		Assert.assertEquals(A_alias, class_A)
		Assert.assertEquals(class_A, gen_test_A.general)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

}
