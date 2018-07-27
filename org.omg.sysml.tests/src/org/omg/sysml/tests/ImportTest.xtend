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
class ImportTest {
	@Inject
	ParseHelper<Package> parseHelper
	
	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;
	
	@Inject extension ValidationTestHelper
		
	def ResourceSetImpl getDependency(){
		val rs= resourceSetProvider.get
		parseHelper.parse('''
			package Test1{
				class A{}
				class B{
					feature b: A;
				}
			}
		''', rs)
		return rs
	}
	
	
	// P1::p1 private class in private class
	// P2::p2 private class in public class
	// P3::p3 public class in private class
	// P4::p4 public class in public class
	// publicClass is public class
	// privateClass is private class
	//
	def ResourceSetImpl getDependencyPrivate(){
		val rs= resourceSetProvider.get
		parseHelper.parse(
		'''package testt {
					private class P1{
						private class p1{}
					}
					
					public class P2{
						private class p2{}
					}
					
					public class P22{
						private class p2{}
						private pubpriv is p2;
					}
					
					private class P33{
						public class p3{}
						private privpub is p3;
					}
					
					private class P3{
						public class p3{}
					}
					
					public class P4{
						public class p4{}
		
					}
					
					public class P44{
						public class p4{}
						public pubpub1 is p4;
						private pubpub2 is p4;
					}
					
					public class clazz{
						protected class Protect{
							public class publicc{}
						}
						packaged class Package{
							public class publicc{}
						}
						
						public class Public{
							protected class protect{}
							packaged class packagee{}
						}
					}
					
					public publicClass{}
					
					private privateClass{}
					}''', rs)
			return rs
	}
	
	/*
	 * Tests starts
	 */
	 
	 
	 /*
	  * 
	  * 
	  * Tests for good cases
	  * 
	  */
	@Test
	def void testImportClassAlias() {
		val rs = dependency
		val result = parseHelper.parse('''
			package Test2{
				import Test1.A as aliass;
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
		val rs = dependency
		val result = parseHelper.parse('''
			package Test2{
				import Test1.A;
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
		val rs= dependency
		val result = parseHelper.parse('''
			package Test2{
				import Test1.B.b as aliass;
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
		val rs= dependency
		val result = parseHelper.parse('''
			package Test2{
				import Test1.B.b;
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
	
	@Test
	def void testPublicImportAlias(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
							import testt::P4::p4 as aliass;
							import testt::publicClass as Aliass;
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
	def void testPublicImport(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
							import testt::P4::p4 ;
							import testt::publicClass ;
							class Try{
								feature feature4 : p4;
								feature featurepublic : publicClass;
							}
						}

		''', rs)
		
		
		EcoreUtil2.resolveAll(result)
		
		Assert.assertNotNull(result)
		
		result.assertNoErrors
		
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	
	
	@Test
	def void testImportInheritanceAlias(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
							import testt::P4 as aliass;
							class Try is aliass{
								feature feature4 : p4;
							}
						}

		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	
	@Test
	def void testImportInheritance(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
							import testt::P4;
							class Try is P4{
								feature feature4 : p4;
							}
						}

		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	
	@Test
	def void testImort(){
		val rs = dependency
		
		val result = parseHelper.parse('''
						package Classes {
							import Test1::*;
							class Try is A{}
							feature try : B::b;
						}

		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	
	@Test
	def void testImort2(){
		val rs = dependency
		
		val result = parseHelper.parse('''
						package Classes {
							import Test1::*;
							class Try is B{
								feature try : b;
							}
						}

		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	

	
	/*
	 * 
	 * 
	 * Tests for bad cases
	 * 
	 * 
	 */
	 
	 
	@Test
	def void testBadImportFeature() {
		val rs= dependency
		val result = parseHelper.parse('''
			package Test2{
				import Test1.B;
				class C {
					feature c: b;
				}
			}
		''', rs)
		Assert.assertNotNull(result)
		
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length==1)
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}
	
		@Test
	def void testBadImportFeature2() {
		val rs= dependency
		val result = parseHelper.parse('''
			package Test2{
				import Test1;
				class C {
					feature c: b;
				}
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length==1)
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}
	
	@Test
	def void testBadImportClass() {
		val rs= dependency
		val result = parseHelper.parse('''
			package Test2{
				import Test1;
				class C {
					feature c: b;
				}
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length==1)
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}
	
	@Test
	def void testBadImportClass2() {
		val rs= dependency
		val result = parseHelper.parse('''
			package Test2{
				import Test1.B.b;
				class C {
					feature c: B;
				}
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.length==1)
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
	}
	
	
	@Test
	def void testImportInheritanceBad(){
		val rs = dependencyPrivate
		val result = parseHelper.parse('''
						package Classes {
							import testt;
							class Try is P4{
								feature feature4 : p4;
							}
						}

		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC/* ,47,2*/)
		result.assertError(SysMLPackage.eINSTANCE.feature, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC/* ,72,4*/)
		Assert.assertTrue(result.eResource.errors.length ==2)
	}
	
		
	
	//import from private class private class
	@Test
	def void testPrivateImport1(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
							import testt::P1::p1 as aliass;
							class Try{
								feature feature1 : aliass;
							}
						}
		''', rs)
		
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		
		Assert.assertTrue(result.eResource.errors.length==1)
	}
	
	//import from public class private class
	@Test
	def void testPrivateImport2(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
							import testt::P2::p2 as aliass;
							class Try{
								feature feature1 : aliass;
							}
						}
		''', rs)
		
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==1)
	}
	
	//import from private class public class
	@Test
	def void testPrivateImport3(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
							import testt::P3::p3 as aliass;
							class Try{
								feature feature3 : aliass;
							}
							
						}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==1)
	}
	
	@Test
	def void testPrivateImport4(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
									import testt::P2;
									class package_public is P2::p2{}
								}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==1)
	}
	
		@Test
	def void testImportPublicAndRefPrivateClass(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
							import testt::P2;
							class Try{
								feature feature1 : P2::p1;
							}
						}
		''', rs)
		
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==1)
	}
	
	@Test
	def void testProtectImport1(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
		package Classes {
			import testt::clazz;
			
			class public_protect is clazz::Public::protect{}
		}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==1)
	}
	
		@Test
	def void testProtectImport2(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
		package Classes {
			import testt::clazz;
			class protect_public is clazz::Protect::publicc{}
		}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==1)
	}
	
		@Test
	def void testPackageImport1(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
		package Classes {
			import testt::clazz::Public::packagee;
			feature public_package : packagee;
		}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==1)
	}
	
		@Test
	def void testPackageImport2(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
		package Classes {
			import testt::clazz;
			class package_public is clazz::Package::publicc{}
			feature vmi : clazz::Package::publicc;
		}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		

//		result.assertNoErrors
//		Assert.assertTrue(result.eResource.errors.empty)
		
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.feature, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==2)
	}
	
			@Test
	def void testPackageImport3(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
		package Classes {
			import testt::P1;
			class package_public is P1::p1{}
			feature vmi : P1::p1;
		}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)

//		result.assertNoErrors
//		Assert.assertTrue(result.eResource.errors.empty)
		
		result.assertError(SysMLPackage.eINSTANCE.class_, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.feature, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==2)
	}
	
	
	//private class
	@Test
	def void testImort3(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
							import testt::*;
							class Try is P1{}
						}

		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==1)
	}
	
	//private class in a public class
	@Test
	def void testImort4(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
							import testt::*;
							class Try is P2{
								class try is p2{}
							}
						}

		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==1)
	}
	

	@Test
	def void testImort5(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
							import testt::*;
							class Try is P3::p3{}
						}

		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertError(SysMLPackage.eINSTANCE.generalization, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==1)
	}
	

	@Test
	def void testImort6(){
		val rs = dependencyPrivate
		
		val result = parseHelper.parse('''
						package Classes {
							import testt::*;
							feature vmi : P2::p2;
						}

		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertError(SysMLPackage.eINSTANCE.feature, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.length==1)
	}
	
}