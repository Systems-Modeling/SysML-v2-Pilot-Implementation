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
import org.eclipse.xtext.EcoreUtil2
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
class SimpleImportTests {

	@Inject
	ParseHelper<Package> parseHelper

	@Inject extension ValidationTestHelper
	
	@Inject extension Dependency

	@Test
	def void testDoubleImportInHierarchy() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class A{
					import test::*;
					class b{
						import A::*;
						class d specializes d{}
					}
				}
			}
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportInHierarchy() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class A{
					import test::*;
					class a{}
				}
			}
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testCircleImport() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class A{
					import B::*;
					class a{}
				}
				
				class B{
					import A::*;
					class b{}
				}
			}
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testCircleInheritanceInCircleImport() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class A{
					import test::B::*;
					class a specializes b{}
				}
				class B {
					import test::A::*;
					class b specializes a{}
				}
			}
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

	@Test
	def void testImportPackageAndInheritanceFromContainer() {
		val rs = getLibraryBasePackage
		val result = parseHelper.parse('''
			package test{
				class A {
					import test::*;
					class a specializes A{}
				}
			}
		''', rs)
		EcoreUtil2.resolveAll(result)
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}

}
