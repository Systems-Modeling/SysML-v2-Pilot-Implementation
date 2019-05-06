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
import org.omg.sysml.tests.AlfInjectorProvider
import org.omg.sysml.validation.AlfValidator
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.eclipse.xtext.EcoreUtil2

@RunWith(XtextRunner)
@InjectWith(AlfInjectorProvider)
class ParsingTests {
	@Inject
	ParseHelper<Package> parseHelper

	@Inject extension ValidationTestHelper
	/* @Inject
	AlfValidator validator

	@Inject
	Injector injector

	@Before
	def void initialize() {
		tester = new ValidatorTester(validator, injector)
	}
	*/ 
	ValidatorTester<AlfValidator> tester

	@Inject extension Dependency

	@Test
	def void testScopeWithOnlyDot() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				class C{
					feature c : OuterPackage.B.b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testUseFullQualifiedName1() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class A {}
				class B specializes test::A{}
			}
		''', rs)

		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testScopeWithDotAndFourDot() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				class C{
					feature c : OuterPackage.B::b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.package, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
	}

	@Test
	def void testScopeWithFourDotAndDot() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				class C{
					feature c : OuterPackage::B.b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.package, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
	}

	@Test
	def void testUseFullQualifiedNameFourDot() {
		val rs = getDependencyOuterPackage
		val result = parseHelper.parse('''
			package test{
				class C{
					feature c : OuterPackage::B::b;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testBadScopeWithOnlyTwoDotAtTheEnd() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class non{}
				class A{
					feature aa is non;
					feature a: A;
				}
				class B{
					feature b: Test3::A:a;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.package, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
		Assert.assertEquals("no viable alternative at input ':'", result.eResource.errors.get(0).getMessage())
		
	}

	@Test
	def void testBadScopeWithOnlyTwoSingleDotAtTheEnd() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class non{}
				class A{
					feature aa is non;
					feature a: A;
				}
				class B{
					feature b: test::A..a;
				}
			}
		''', rs)

		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.length == 1)
		result.assertError(SysMLPackage.eINSTANCE.package, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
		Assert.assertEquals("no viable alternative at input '..'", result.eResource.errors.get(0).getMessage())
	}

	@Test
	def void testBadScopeWithOnlyTwoSingleDot() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class non{}
				class A{
					feature aa is non;
					feature a: A;
				}
				class B{
					feature b: test..A::a;
				}
			}
		''', rs)
		/*
		System.out.println(tester.validate(result).toString());
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The feature 'relatedElement' of 'org.omg.sysml.lang.sysml.impl.FeatureTypingImpl@54ea832e{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature/@ownedRelationship.0}' with 1 values must have at least 2 values data=[org.omg.sysml.lang.sysml.impl.FeatureTypingImpl@54ea832e (identifier: null), org.eclipse.emf.ecore.impl.EReferenceImpl@7c654cfc (name: relatedElement) (ordered: false, unique: false, lowerBound: 2, upperBound: -1) (changeable: false, volatile: true, transient: true, defaultValueLiteral: null, unsettable: false, derived: true) (containment: false, resolveProxies: true)]
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The required feature 'general' of 'org.omg.sysml.lang.sysml.impl.FeatureTypingImpl@54ea832e{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature/@ownedRelationship.0}' must be set data=[org.omg.sysml.lang.sysml.impl.FeatureTypingImpl@54ea832e (identifier: null), org.eclipse.emf.ecore.impl.EReferenceImpl@7a77ff45 (name: general) (ordered: false, unique: true, lowerBound: 1, upperBound: 1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: false, resolveProxies: true)]
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The required feature 'type' of 'org.omg.sysml.lang.sysml.impl.FeatureTypingImpl@54ea832e{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.0/@ownedMemberFeature/@ownedRelationship.0}' must be set data=[org.omg.sysml.lang.sysml.impl.FeatureTypingImpl@54ea832e (identifier: null), org.eclipse.emf.ecore.impl.EReferenceImpl@657c93da (name: type) (ordered: false, unique: true, lowerBound: 1, upperBound: 1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: false, resolveProxies: true)]
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The feature 'relatedElement' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@551be7b1{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.1}' with 1 values must have at least 2 values data=[org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@551be7b1 (identifier: null) (memberName: null, visibility: public, aliases: null) (isDerived: false, isReadOnly: false, isPart: false, isPort: false, direction: null), org.eclipse.emf.ecore.impl.EReferenceImpl@7c654cfc (name: relatedElement) (ordered: false, unique: false, lowerBound: 2, upperBound: -1) (changeable: false, volatile: true, transient: true, defaultValueLiteral: null, unsettable: false, derived: true) (containment: false, resolveProxies: true)]
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The required feature 'memberElement' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@551be7b1{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.1}' must be set data=[org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@551be7b1 (identifier: null) (memberName: null, visibility: public, aliases: null) (isDerived: false, isReadOnly: false, isPart: false, isPort: false, direction: null), org.eclipse.emf.ecore.impl.EReferenceImpl@7a1bcfb1 (name: memberElement) (ordered: false, unique: true, lowerBound: 1, upperBound: 1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: false, resolveProxies: true)]
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The required feature 'memberFeature' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@551be7b1{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.1}' must be set data=[org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@551be7b1 (identifier: null) (memberName: null, visibility: public, aliases: null) (isDerived: false, isReadOnly: false, isPart: false, isPort: false, direction: null), org.eclipse.emf.ecore.impl.EReferenceImpl@46050be4 (name: memberFeature) (ordered: false, unique: true, lowerBound: 1, upperBound: 1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: false, resolveProxies: true)]
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The feature 'relatedElement' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@553f3655{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.2}' with 1 values must have at least 2 values data=[org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@553f3655 (identifier: null) (memberName: null, visibility: public, aliases: null) (isDerived: false, isReadOnly: false, isPart: false, isPort: false, direction: null), org.eclipse.emf.ecore.impl.EReferenceImpl@7c654cfc (name: relatedElement) (ordered: false, unique: false, lowerBound: 2, upperBound: -1) (changeable: false, volatile: true, transient: true, defaultValueLiteral: null, unsettable: false, derived: true) (containment: false, resolveProxies: true)]
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The required feature 'memberElement' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@553f3655{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.2}' must be set data=[org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@553f3655 (identifier: null) (memberName: null, visibility: public, aliases: null) (isDerived: false, isReadOnly: false, isPart: false, isPort: false, direction: null), org.eclipse.emf.ecore.impl.EReferenceImpl@7a1bcfb1 (name: memberElement) (ordered: false, unique: true, lowerBound: 1, upperBound: 1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: false, resolveProxies: true)]
		Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The required feature 'memberFeature' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@553f3655{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.2}' must be set data=[org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@553f3655 (identifier: null) (memberName: null, visibility: public, aliases: null) (isDerived: false, isReadOnly: false, isPart: false, isPort: false, direction: null), org.eclipse.emf.ecore.impl.EReferenceImpl@46050be4 (name: memberFeature) (ordered: false, unique: true, lowerBound: 1, upperBound: 1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: false, resolveProxies: true)]
		*/
		
		Assert.assertNotNull(result)
		//if not put EcoreUtil2.resolveAll(result), there are 2 errors.
		//if include EcoreUtil2.resolveAll(result), there are 3 errors.
		EcoreUtil2.resolveAll(result);
		Assert.assertTrue(result.eResource.errors.length == 3)
		result.assertError(SysMLPackage.eINSTANCE.feature, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.featureMembership, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.featureMembership, XtextSyntaxDiagnostic.LINKING_DIAGNOSTIC)
		Assert.assertEquals("no viable alternative at input 'test'", result.eResource.errors.get(0).getMessage())
		Assert.assertEquals("no viable alternative at input 'A'", result.eResource.errors.get(1).getMessage())
		Assert.assertEquals("Couldn't resolve reference to Feature 'non'.", result.eResource.errors.get(2).getMessage())
		
		
	}

	@Test
	def void testBadScopeWithOnlyTwoDot() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class non{}
				class A{
					feature aa is non;
					feature a: A;
				}
				class B{
					feature b: test:A::a;
				}
			}
		''', rs)

		//if printout above will give AssertionError in Assert.assertTrue(result.eResource.errors.length == 2) line
		/*var ds = tester.validate(result).allDiagnostics;
		for (d: ds){
			System.out.println(d.message);
		}*/
		/* 
		The feature 'relatedElement' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@19f31c85{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.1}' with 1 values must have at least 2 values
		The required feature 'memberElement' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@19f31c85{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.1}' must be set
		The required feature 'memberFeature' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@19f31c85{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.1}' must be set
		The feature 'relatedElement' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@551be7b1{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.2}' with 1 values must have at least 2 values
		The required feature 'memberElement' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@551be7b1{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.2}' must be set
		The required feature 'memberFeature' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@551be7b1{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.2}' must be set
		*/
		//System.out.println(tester.validate(result).toString());
		//Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The feature 'relatedElement' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@7722c8e6{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.1}' with 1 values must have at least 2 values data=[org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@7722c8e6 (identifier: null) (memberName: null, visibility: public, aliases: null) (isDerived: false, isReadOnly: false, isPart: false, isPort: false, direction: null), org.eclipse.emf.ecore.impl.EReferenceImpl@7ba92958 (name: relatedElement) (ordered: false, unique: false, lowerBound: 2, upperBound: -1) (changeable: false, volatile: true, transient: true, defaultValueLiteral: null, unsettable: false, derived: true) (containment: false, resolveProxies: true)]
		//Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The required feature 'memberElement' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@7722c8e6{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.1}' must be set data=[org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@7722c8e6 (identifier: null) (memberName: null, visibility: public, aliases: null) (isDerived: false, isReadOnly: false, isPart: false, isPort: false, direction: null), org.eclipse.emf.ecore.impl.EReferenceImpl@62c732d2 (name: memberElement) (ordered: false, unique: true, lowerBound: 1, upperBound: 1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: false, resolveProxies: true)]
		//Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The required feature 'memberFeature' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@7722c8e6{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.1}' must be set data=[org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@7722c8e6 (identifier: null) (memberName: null, visibility: public, aliases: null) (isDerived: false, isReadOnly: false, isPart: false, isPort: false, direction: null), org.eclipse.emf.ecore.impl.EReferenceImpl@7740d2c (name: memberFeature) (ordered: false, unique: true, lowerBound: 1, upperBound: 1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: false, resolveProxies: true)]
		//Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The feature 'relatedElement' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@5b83c5c9{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.2}' with 1 values must have at least 2 values data=[org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@5b83c5c9 (identifier: null) (memberName: null, visibility: public, aliases: null) (isDerived: false, isReadOnly: false, isPart: false, isPort: false, direction: null), org.eclipse.emf.ecore.impl.EReferenceImpl@7ba92958 (name: relatedElement) (ordered: false, unique: false, lowerBound: 2, upperBound: -1) (changeable: false, volatile: true, transient: true, defaultValueLiteral: null, unsettable: false, derived: true) (containment: false, resolveProxies: true)]
		//Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The required feature 'memberElement' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@5b83c5c9{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.2}' must be set data=[org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@5b83c5c9 (identifier: null) (memberName: null, visibility: public, aliases: null) (isDerived: false, isReadOnly: false, isPart: false, isPort: false, direction: null), org.eclipse.emf.ecore.impl.EReferenceImpl@62c732d2 (name: memberElement) (ordered: false, unique: true, lowerBound: 1, upperBound: 1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: false, resolveProxies: true)]
		//Diagnostic ERROR source=org.eclipse.emf.ecore code=1 The required feature 'memberFeature' of 'org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@5b83c5c9{__synthetic0.alf#//@ownedMembership.2/@ownedMemberElement/@ownedMembership.2}' must be set data=[org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl@5b83c5c9 (identifier: null) (memberName: null, visibility: public, aliases: null) (isDerived: false, isReadOnly: false, isPart: false, isPort: false, direction: null), org.eclipse.emf.ecore.impl.EReferenceImpl@7740d2c (name: memberFeature) (ordered: false, unique: true, lowerBound: 1, upperBound: 1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: false, resolveProxies: true)]
		Assert.assertNotNull(result) 
		EcoreUtil2.resolveAll(result);
		Assert.assertTrue(result.eResource.errors.length == 4)
		result.assertError(SysMLPackage.eINSTANCE.feature, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
		result.assertError(SysMLPackage.eINSTANCE.featureMembership, XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC)
		Assert.assertEquals("no viable alternative at input ':'", result.eResource.errors.get(0).getMessage())
		Assert.assertEquals("no viable alternative at input 'A'", result.eResource.errors.get(1).getMessage())
		Assert.assertEquals("Couldn't resolve reference to Feature 'non'.", result.eResource.errors.get(2).getMessage())
		Assert.assertEquals("Couldn't resolve reference to Category 'test'.",result.eResource.errors.get(3).getMessage())
	}
}
