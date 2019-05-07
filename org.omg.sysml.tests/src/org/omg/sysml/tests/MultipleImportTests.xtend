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
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
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
import org.omg.sysml.tests.AlfInjectorProvider
import org.omg.sysml.validation.AlfValidator
import com.google.inject.Injector
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.junit.Before

@RunWith(XtextRunner)
@InjectWith(AlfInjectorProvider)
class MultipleImportTests {

	/* 
	@Inject
	ParseHelper<Package> parseHelper

	@Inject extension ValidationTestHelper

	@Inject extension Dependency
	*/
	
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
	

	def ResourceSetImpl getDependencyMembership2() {
		val rs = getDependencyMultipleMembership
		parseHelper.parse('''
			package OuterPackage3{
				import OuterPackage2::C;
				class D specializes C{
					feature f : b;
				}
			}
		''', rs)
		return rs
	}

	@Test
	def void testImportClass() {
		val rs = getDependencyMultipleMembership
		val result = parseHelper.parse('''
			package test{
				import OuterPackage2::C;
				class D specializes C{
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
		val rs = getDependencyMultipleMembership
		Assert.assertNotNull(rs)
		EcoreUtil2.resolveAll(rs)
		val result = parseHelper.parse('''
			package test{
				import OuterPackage2::C as CC;
				class D specializes CC{
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
		val rs = getDependencyMultipleMembership
		val result = parseHelper.parse('''
			package test{
				import OuterPackage2::C::b;
				class D{
					feature try : b;
				}
			}
		''', rs)
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.membership, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.featureTyping, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.size == 2)
	}

	@Test
	def void testImportFeatureWithAlias() {
		val rs = getDependencyMultipleMembership
		val result = parseHelper.parse('''
			package test{
				import OuterPackage2::C ;
				B as bb;
				class D{
					feature try : bb;
				}
			}
		''', rs)
		
		
		/*
		//if include tester.validate(result).toString() output below:
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The feature 'relatedElement' of 'org.omg.sysml.lang.sysml.impl.MembershipImpl@7e4d2884{__synthetic2.alf#//@ownedMembership.1}' with 1 values must have at least 2 values data=[org.omg.sysml.lang.sysml.impl.MembershipImpl@7e4d2884 (identifier: null) (memberName: null, visibility: public, aliases: null), org.eclipse.emf.ecore.impl.EReferenceImpl@29fccabd (name: relatedElement) (ordered: false, unique: false, lowerBound: 2, upperBound: -1) (changeable: false, volatile: true, transient: true, defaultValueLiteral: null, unsettable: false, derived: true) (containment: false, resolveProxies: true)]
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The required feature 'memberElement' of 'org.omg.sysml.lang.sysml.impl.MembershipImpl@7e4d2884{__synthetic2.alf#//@ownedMembership.1}' must be set data=[org.omg.sysml.lang.sysml.impl.MembershipImpl@7e4d2884 (identifier: null) (memberName: null, visibility: public, aliases: null), org.eclipse.emf.ecore.impl.EReferenceImpl@74d41fcf (name: memberElement) (ordered: false, unique: true, lowerBound: 1, upperBound: 1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: false, resolveProxies: true)]
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The feature 'relatedElement' of 'org.omg.sysml.lang.sysml.impl.MembershipImpl@5aa786fc{__synthetic2.alf#//@ownedMembership.2}' with 1 values must have at least 2 values data=[org.omg.sysml.lang.sysml.impl.MembershipImpl@5aa786fc (identifier: null) (memberName: null, visibility: public, aliases: null), org.eclipse.emf.ecore.impl.EReferenceImpl@29fccabd (name: relatedElement) (ordered: false, unique: false, lowerBound: 2, upperBound: -1) (changeable: false, volatile: true, transient: true, defaultValueLiteral: null, unsettable: false, derived: true) (containment: false, resolveProxies: true)]
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The required feature 'memberElement' of 'org.omg.sysml.lang.sysml.impl.MembershipImpl@5aa786fc{__synthetic2.alf#//@ownedMembership.2}' must be set data=[org.omg.sysml.lang.sysml.impl.MembershipImpl@5aa786fc (identifier: null) (memberName: null, visibility: public, aliases: null), org.eclipse.emf.ecore.impl.EReferenceImpl@74d41fcf (name: memberElement) (ordered: false, unique: true, lowerBound: 1, upperBound: 1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: false, resolveProxies: true)]
		*/
		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		Assert.assertTrue(result.eResource.errors.size == 1)
		result.assertError(SysMLPackage.eINSTANCE.membership, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
		Assert.assertEquals("no viable alternative at input 'B'", result.eResource.errors.get(0).getMessage());

	}

	@Test
	def void testImportClassMoreTimes() {
		val rs = getDependencyMembership2
		val result = parseHelper.parse('''
			package test{
				import OuterPackage3::D;
				class EE specializes D{
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
				import OuterPackage3::D;
				class EE specializes B{
					feature try : b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertError(SysMLPackage.eINSTANCE.superclassing, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.featureTyping, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertTrue(result.eResource.errors.size == 2)
	}

	// import::* => import ::*
	@Test
	def void testImportImportImp() {
		val rs = getDependencyMultipleImport
		val result = parseHelper.parse('''
			package test{
				import OuterPackage2::*;
				class Test specializes C {
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
		val rs = getDependencyMultipleImport
		val result = parseHelper.parse('''
			package test{
				import OuterPackage2::C;
				class Test specializes C {
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
		val rs = getDependencyMultipleMembership
		val result = parseHelper.parse('''
			package test{
				import OuterPackage2::*;
				class Test specializes C {
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
	def void testUseSuperClassParameter() {
		val rs = getDependencyMultipleMembership
		val result = parseHelper.parse('''
			package test{
				import OuterPackage2::*;
				feature try : C::b;
			}
		''', rs)

		Assert.assertNotNull(result)
		EcoreUtil2.resolveAll(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

}
