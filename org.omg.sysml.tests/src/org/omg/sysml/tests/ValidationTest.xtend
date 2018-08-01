package org.omg.sysml.tests

import com.google.inject.Inject
import com.google.inject.Injector
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics.DiagnosticPredicate
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.validation.AlfValidator

@RunWith(XtextRunner)
@InjectWith(typeof(AlfInjectorProvider))
class ValidationTest {
	
	@Inject
	ParseHelper<Package> parseHelper
	
	@Inject
	AlfValidator validator
	
	@Inject
    Injector injector
	
	ValidatorTester<AlfValidator> tester 
	
	@Before
	def void initialize(){
		tester = new ValidatorTester(validator, injector)
	}
	
	@Test
	def void testInheritanceClasses() {
		
		val result = parseHelper.parse('''
			package test{
				class A is B {}
				class B is A {}
			}
		''')
		
		tester.validate(result).assertAll(getErrorCode(AlfValidator.CIRCLE_INHERITANCE),getErrorCode(AlfValidator.CIRCLE_INHERITANCE))
		
		
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	@Test
	def void testInheritanceClass() {
		
		val result = parseHelper.parse('''
			package test{
				class A is A {}
			}
		''')
		
		tester.validate(result).assertAll(getErrorCode(AlfValidator.CIRCLE_INHERITANCE))
		
		
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	@Test
	def void testInheritanceMoreClasses() {
		
		val result = parseHelper.parse('''
			package test{
				class A is B {}
				class B is C {}
				class C is D {}
				class D is A {}
			}
		''')
		
		//4 times for circle error
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.CIRCLE_INHERITANCE),
			getErrorCode(AlfValidator.CIRCLE_INHERITANCE),
			getErrorCode(AlfValidator.CIRCLE_INHERITANCE),
			getErrorCode(AlfValidator.CIRCLE_INHERITANCE)
		)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	@Test
	def void testFeatureDual() {
		
		val result = parseHelper.parse('''
			package test{
				feature A is B {}
				feature B is A {}
			}
		''')
		
		//4 times for circle error
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.CIRCLE_REFERENCE),
			getErrorCode(AlfValidator.CIRCLE_REFERENCE)
		)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	@Test
	def void testFeatureSimple() {
		
		val result = parseHelper.parse('''
			package test{
				feature A is A {}
			}
		''')
		
		//4 times for circle error
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.CIRCLE_REFERENCE)
		)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}
    
	@Test
	def void testFeatureQuad() {
		
		val result = parseHelper.parse('''
			package test{
				feature A is B{}
				feature B is C{}
				feature C is D {}
				feature D is A {}
			}
		''')
		
		//4 times for circle error
		tester.validate(result).assertAll(
			getErrorCode(AlfValidator.CIRCLE_REFERENCE),
			getErrorCode(AlfValidator.CIRCLE_REFERENCE),
			getErrorCode(AlfValidator.CIRCLE_REFERENCE),
			getErrorCode(AlfValidator.CIRCLE_REFERENCE)
		)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.empty)
	}

	protected def DiagnosticPredicate getErrorCode(String issueId) {
        return AssertableDiagnostics.errorCode(issueId)
    }
    

	
}