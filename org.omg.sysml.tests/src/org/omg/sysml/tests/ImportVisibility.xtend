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
import com.google.inject.Injector
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.eclipse.xtext.resource.XtextResourceSet
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
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics.DiagnosticPredicate
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics

@RunWith(XtextRunner)
@InjectWith(AlfInjectorProvider)
class ImportVisibility {
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

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;

	@Inject extension ValidationTestHelper

	def ResourceSetImpl getDependencyPrivate() {
		val rs = resourceSetProvider.get
		parseHelper.parse('''
		package testt {
			private class c_Private{
				private class c_private{}
				public class c_public{}
			}
			
			public class c_Public{
				private class c_private{}
				public class c_public{}
			}
			
			public class c_Public_alias{
				public class c_public{}
				private alias_private is c_public;
				public alias_public is c_public;
			}
			
			private class c_Private_alias{
				public class c_public{}
				private alias_private is c_public;
				public alias_public is c_public;
			}
			
			public class c_clazz{
				protected class c_Protect{
					public class c_publicc{}
				}
				packaged class c_Package{
					public class c_publicc{}
				}
				
				public class c_Public{
					protected class c_protect{}
					packaged class c_packagee{}
				}
			}
		}''', rs)
		return rs
	}

	@Test
	def void testPublicImportAlias() {
		val rs = dependencyPrivate

		val result = parseHelper.parse('''
			package Classes {
				import testt::c_Public::c_public as aliass;
				import testt::c_Public as Aliass;
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
	def void testPublicImport() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_Public::c_public ;
				import testt::c_Public ;
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
	def void testImportInheritanceAlias() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_Public as aliass;
				class Try is aliass{
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
	def void testImportInheritance() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_Public;
				class Try is c_Public{
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
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Test3{
				import testt::c_Public::*;
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
		val rs = dependencyPrivate

		val result = parseHelper.parse('''
			package Test3{
				import testt::c_Private::*;
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
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt;
				class Try is c_Public{
					feature feature4 : c_public;
				}
			}
			
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.feature, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length == 2)
	}

	@Test
	def void testPrivateImportWithoutAlias() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_Private::c_private;
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
	def void testPrivateImport1() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_Private::c_private as aliass;
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
	def void testPrivateImport2() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_Public::c_private as aliass;
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
	def void testPrivateImport3() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_Private::c_public as aliass;
				class Try{
					feature feature3 : aliass;
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
	def void testPrivateImport4() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
						import testt::c_Public;
						class try is c_Public::c_private{}
					}
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_INHERITANCE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportPublicAndRefPrivateClass() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_Public;
				class Try{
					feature try : c_Public::c_private;
				}
			}
		''', rs)
		
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_FEATURE_TYPE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testc_ProtectImport1() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_clazz;
				
				class try is c_clazz::c_Public::c_protect{}
			}
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_INHERITANCE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testc_ProtectImport2() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_clazz;
				class try is c_clazz::c_Protect::c_publicc{}
			}
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_INHERITANCE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testPackageImport1() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_clazz::c_Public::c_packagee;
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
	def void testPackageImport2() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_clazz;
				class try is c_clazz::c_Package::c_publicc{}
				feature f : c_clazz::c_Package::c_publicc;
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_INHERITANCE),
			getErrorCode(AlfValidator.NOT_PUBLIC_FEATURE_TYPE)
		)

		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testPackageImport3() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::c_Private;
				class try is c_Private::c_private{}
				feature f : c_Private::c_private;
			}
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_MEMBERSHIP),
			getErrorCode(AlfValidator.NOT_PUBLIC_INHERITANCE),
			getErrorCode(AlfValidator.NOT_PUBLIC_FEATURE_TYPE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImort3() {
		val rs = dependencyPrivate

		val result = parseHelper.parse('''
			package Classes {
				import testt::*;
				class Try is c_Private{}
			}
			
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_INHERITANCE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImort4() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::*;
				class Try is c_Public{
					class try is c_private{}
				}
			}
			
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_INHERITANCE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImort5() {
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
			package Classes {
				import testt::*;
				class Try is c_Private::c_public{}
			}
			
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_INHERITANCE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImort6() {
		val rs = dependencyPrivate

		val result = parseHelper.parse('''
			package Classes {
				import testt::*;
				feature f : c_Public::c_private;
			}
			
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_FEATURE_TYPE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	@Test
	def void testImportClassAndUseAlias1() {
		val rs = dependencyPrivate

		val result = parseHelper.parse('''
			package Classes {
				import testt::*;
				feature f : c_Public_alias::alias_private;
			}
			
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_FEATURE_TYPE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	
	@Test
	def void testImportClassAndUseAlias2() {
		val rs = dependencyPrivate

		val result = parseHelper.parse('''
			package Classes {
				import testt::*;
				feature f : c_Public_alias::alias_public;
			}
			
		''', rs)
		
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	@Test
	def void testImportClassAndUseAlias3() {
		val rs = dependencyPrivate

		val result = parseHelper.parse('''
			package Classes {
				import testt::*;
				feature f : c_Private_alias::alias_private;
			}
			
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_FEATURE_TYPE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
		@Test
	def void testImportClassAndUseAlias4() {
		val rs = dependencyPrivate

		val result = parseHelper.parse('''
			package Classes {
				import testt::*;
				feature f : c_Private_alias::alias_public;
			}
			
		''', rs)
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.NOT_PUBLIC_FEATURE_TYPE)
		)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	protected def DiagnosticPredicate getErrorCode(String issueId) {
		return AssertableDiagnostics.errorCode(issueId)
	}
	


	

}
