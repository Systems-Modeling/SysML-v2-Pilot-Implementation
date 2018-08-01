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
//	def ResourceSetImpl getDependencyPrivate(){
//		val rs= resourceSetProvider.get
//		parseHelper.parse(
//		'''package testt {
//					private class P1{
//						private class p1{}
//					}
//					
//					public class P2{
//						private class p2{}
//					}
//					
//					public class P22{
//						private class p2{}
//						private pubpriv is p2;
//					}
//					
//					private class P33{
//						public class p3{}
//						private privpub is p3;
//					}
//					
//					private class P3{
//						public class p3{}
//					}
//					
//					public class P4{
//						public class p4{}
//		
//					}
//					
//					public class P44{
//						public class p4{}
//						public pubpub1 is p4;
//						private pubpub2 is p4;
//					}
//					
//					public class clazz{
//						protected class Protect{
//							public class publicc{}
//						}
//						packaged class Package{
//							public class publicc{}
//						}
//						
//						public class Public{
//							protected class protect{}
//							packaged class packagee{}
//						}
//					}
//					
//					public publicClass{}
//					
//					private privateClass{}
//					}''', rs)
//			return rs
//	}
	
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
	
	//test that the visibility is ok in a package without import
	@Test
	def void testWorkingWithPackage(){
		val rs = dependency
		val result = parseHelper.parse('''
						package Classes {
							
							feature f: A {
								
							}
							public class A {
								feature b: B;
								protected feature c: C::y; 
							}
							abstract class B{
								packaged x: C;
								package P { }
							}
							
							private class C specializes B {
								private y: B;
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
	
	
	
	
//	package Classes {
//			import testt::clazz::Public::packagee;
//			feature public_package : packagee;
//		}
	
}