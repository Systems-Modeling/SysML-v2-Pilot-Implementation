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
import com.google.inject.Injector
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics.DiagnosticPredicate
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.validation.AlfValidator

@RunWith(XtextRunner)
@InjectWith(AlfInjectorProvider)
class VisibilityTests {
	@Inject
	ParseHelper<Package> parseHelper

	@Inject
	AlfValidator validator

	@Inject
	Injector injector

	ValidatorTester<AlfValidator> tester

	@Before
	def void initialize() {
		tester = new ValidatorTester(validator, injector)
	}

	@Inject extension Dependency

	@Inject extension ValidationTestHelper

	@Test
	def void testPublicImportAsFeatureAlias() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_Public::c_public as aliass;
				import VisibilityPackage::c_Public as Aliass;
				class Try{
					feature feature4 : aliass;
					feature featurepublic : Aliass;
				}
			}
		''', rs)

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testPublicImportAsFeature() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_Public::c_public ;
				import VisibilityPackage::c_Public ;
				class Try{
					feature feature4 : c_public;
					feature featurepublic : c_Public;
				}
			}
			
		''', rs)

		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportAsFeatureInheritanceAlias() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_Public as aliass;
				class Try specializes aliass{
					feature feature4 : c_public;
				}
			}
			
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportAsFeatureInheritance() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_Public;
				class Try specializes c_Public{
					feature feature4 : c_public;
				}
			}
			
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testPublicPackImport() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Test3{
				import VisibilityPackage::c_Public::*;
				feature f : c_public;
			}
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	/*
	 * 	tests for bad cases
	 */
	@Test
	def void testPrivatePackImport() {
		val rs = getDependencyVisibilityPackage

		val result = parseHelper.parse('''
			package Test3{
				import VisibilityPackage::c_Private::*;
			}
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_IMPORT)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportInheritanceBad() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage;
				class Try specializes c_Public{
					feature feature4 : c_public;
				}
			}
			
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertError(SysMLPackage.eINSTANCE.superclassing, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.featureTyping, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length == 2)
	}

	@Test
	def void testPrivateImportAsFeatureWithoutAlias() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_Private::c_private;
				class Try{
					feature feature1 : c_private;
				}
			}
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_MEMBERSHIP),
			getErrorCode(AlfValidator.NOT_PUBLIC_FEATURE_TYPE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testPrivateImportAsFeature1() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_Private::c_private as aliass;
				class Try{
					feature feature1 : aliass;
				}
			}
		''', rs)

		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_MEMBERSHIP),
			getErrorCode(AlfValidator.NOT_PUBLIC_FEATURE_TYPE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testPrivateImportAsFeature2() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_Public::c_private as aliass;
				class Try{
					feature feature1 : aliass;
				}
			}
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_MEMBERSHIP),
			//alias is public so included in scope, but validation check failed, because of c_private
			getErrorCode(AlfValidator.NOT_PUBLIC_FEATURE_TYPE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testPrivateImportAsFeature3() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_Private::c_public as aliass;
				class Try{
					feature feature3 : aliass;
				}
				
			}
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_MEMBERSHIP),
			//alias is public so it is included in scope, but validation check failed, because c_Private(alias's parent) is private
			getErrorCode(AlfValidator.NOT_PUBLIC_FEATURE_TYPE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testPrivateImportAsFeature4() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
						import VisibilityPackage::c_Public;
						class try specializes c_Public::c_private{}
					}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertEquals("Couldn't resolve reference to Class 'c_Public::c_private'.", result.eResource.errors.get(0).getMessage())
		result.assertError(SysMLPackage.eINSTANCE.superclassing, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testImportAsFeaturePublicAndRefPrivateClass() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_Public;
				class Try{
					feature try : c_Public::c_private;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertEquals("Couldn't resolve reference to Category 'c_Public::c_private'.", result.eResource.errors.get(0).getMessage())
		result.assertError(SysMLPackage.eINSTANCE.featureTyping, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testc_ProtectImportAsFeature1() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_clazz;
				
				class try specializes c_clazz::c_Public::c_protect{}
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertEquals("Couldn't resolve reference to Class 'c_clazz::c_Public::c_protect'.", result.eResource.errors.get(0).getMessage())
		result.assertError(SysMLPackage.eINSTANCE.superclassing, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testc_ProtectImportAsFeature2() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::*;
				class try specializes c_clazz::c_Protect::c_publicc{}
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertEquals("Couldn't resolve reference to Class 'c_clazz::c_Protect::c_publicc'.", result.eResource.errors.get(0).getMessage())
		result.assertError(SysMLPackage.eINSTANCE.superclassing, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testPackageImportAsFeature1() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_clazz::c_Public::c_packagee;
				feature try : c_packagee;
			}
		''', rs)

		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_MEMBERSHIP),
			getErrorCode(AlfValidator.NOT_PUBLIC_FEATURE_TYPE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testPackageImportAsFeature2() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_clazz;
				class try specializes c_clazz::c_Package::c_publicc{}
				feature f : c_clazz::c_Package::c_publicc;
			}
		''', rs)
		result.assertError(SysMLPackage.eINSTANCE.superclassing, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.featureTyping, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertEquals("Couldn't resolve reference to Class 'c_clazz::c_Package::c_publicc'.", result.eResource.errors.get(0).getMessage())
		Assert.assertEquals("Couldn't resolve reference to Category 'c_clazz::c_Package::c_publicc'.", result.eResource.errors.get(1).getMessage())
		Assert.assertTrue(result.eResource.errors.length == 2)
	}

	@Test
	def void testPackageImportAsFeature3() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::c_Private;
				class try specializes c_Private::c_private{}
				feature f : c_Private::c_private;
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.superclassing, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.featureTyping, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertEquals("Couldn't resolve reference to Class 'c_Private::c_private'.", result.eResource.errors.get(0).getMessage())
		Assert.assertEquals("Couldn't resolve reference to Category 'c_Private::c_private'.", result.eResource.errors.get(1).getMessage())
		Assert.assertTrue(result.eResource.errors.length == 2)
	}

	@Test
	def void testImport3() {
		val rs = getDependencyVisibilityPackage

		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::*;
				class Try specializes c_Private{}
			}
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		Assert.assertEquals("Couldn't resolve reference to Class 'c_Private'.", result.eResource.errors.get(0).getMessage())
		result.assertError(SysMLPackage.eINSTANCE.superclassing, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testImport4() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::*;
				class Try specializes c_Public{
					class try specializes c_private{}
				}
			}
			
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		Assert.assertEquals("Couldn't resolve reference to Class 'c_private'.", result.eResource.errors.get(0).getMessage())
		result.assertError(SysMLPackage.eINSTANCE.superclassing, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testImport5() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::*;
				class Try specializes c_Private::c_public{}
			}
			
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		Assert.assertEquals("Couldn't resolve reference to Class 'c_Private::c_public'.", result.eResource.errors.get(0).getMessage())
		result.assertError(SysMLPackage.eINSTANCE.superclassing, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}

	@Test
	def void testImport6() {
		val rs = getDependencyVisibilityPackage

		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::*;
				feature f : c_Public::c_private;
			}
			
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.featureTyping, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertEquals("Couldn't resolve reference to Category 'c_Public::c_private'.", result.eResource.errors.get(0).getMessage())
	}
	
	/*
	 * alias_private is c_public. alias_private is the abstract syntax and the name is stored.  So it was not possible to validate using AlfValidator.
	 * The code is modified to use AlfScopeProvider to handle it.
	 */
	@Test
	def void testImportClassAndUseAlias1() {
		val rs = getDependencyVisibilityPackage

		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::*;
				feature f  : c_Public_alias::alias_private;
			}
			
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.featureTyping, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertEquals("Couldn't resolve reference to Category 'c_Public_alias::alias_private'.", result.eResource.errors.get(0).getMessage())		
	}

	@Test
	def void testImportClassAndUseAlias2() {
		val rs = getDependencyVisibilityPackage
		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::*;
				feature f : c_Public_alias::alias_public;
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportClassAndUseAlias3() {
		val rs = getDependencyVisibilityPackage

		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::*;
				feature f : c_Private_alias::alias_private;
			}
			
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.featureTyping, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertEquals("Couldn't resolve reference to Category 'c_Private_alias::alias_private'.", result.eResource.errors.get(0).getMessage())
	}

	@Test
	def void testImportClassAndUseAlias4() {
		val rs = getDependencyVisibilityPackage

		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::*;
				feature f : c_Private_alias::alias_public;
			}
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.featureTyping, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertEquals("Couldn't resolve reference to Category 'c_Private_alias::alias_public'.", result.eResource.errors.get(0).getMessage())
	}
	
	
	@Test
	def void testImportClassAndUseAlias5() {
		val rs = getDependencyVisibilityPackage

		val result = parseHelper.parse('''
			package Classes {
				import VisibilityPackage::*;
				feature f : c_Public_alias::alias_private;
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.featureTyping, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertEquals("Couldn't resolve reference to Category 'c_Public_alias::alias_private'.", result.eResource.errors.get(0).getMessage())
	}

	protected def DiagnosticPredicate getErrorCode(String issueId) {
		return AssertableDiagnostics.errorCode(issueId)
	}

}
