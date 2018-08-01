package org.omg.sysml.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.omg.sysml.lang.sysml.Package

@RunWith(XtextRunner)
@InjectWith(AlfInjectorProvider)
class MultipleImportTest {
	@Inject
	ParseHelper<Package> parseHelper
	
	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;
	
	@Inject extension ValidationTestHelper
		
//	def ResourceSetImpl getDependencyMembership(){
//		val rs= resourceSetProvider.get
//		parseHelper.parse('''
//			package Test1{
//				class A{}
//				class B{
//					feature b: A;
//				}
//			}
//		''', rs)
//		parseHelper.parse('''
//			package Test2{
//				import Test1::B;
//				class C is B{
//					feature c : b;
//				}
//			}
//		''', rs)
//		return rs
//	}
	
	def ResourceSetImpl getDependencyMembership(){
		val rs= resourceSetProvider.get
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
	
//	def ResourceSetImpl getDependencyMembership3(){
//		val rs= resourceSetProvider.get
//		parseHelper.parse('''
//			package Test3{
//				import Test2::C;
//				class D is C{
//					feature f : b;
//				}
//			}
//		''', rs)
//		return rs
//	}
	
	
	
	
	@Test
	def void testImportClass() {
		val rs = dependencyMembership
		val result = parseHelper.parse('''
			package test{
				import Test2::C;
				class D is C{
					feature try is b;
				}
			}
		''', rs)
		
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}
}