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
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.builder.standalone.StandaloneBuilder
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.clustering.DisabledClusteringPolicy
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.omg.sysml.AlfStandaloneSetup
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.scoping.AlfScopeProvider
import org.omg.sysml.lang.sysml.Generalization

@RunWith(XtextRunner)
@InjectWith(AlfInjectorProvider)
class UserDataTest {
	
	val vmi = new StandaloneBuilder
		/**  Map key is a file extension provided by Language FileExtensionProvider   */
//	@Accessors String baseDir
//	@Accessors Iterable<String> sourceDirs
//	@Accessors Iterable<String> javaSourceDirs = newArrayList
//	@Accessors Iterable<String> classPathEntries
//	@Accessors File tempDir = Files.createTempDir
//	@Accessors String encoding
//	@Accessors String classPathLookUpFilter
	
	@Inject
	HelperFillIndex hfi
		
	@Inject
	ParseHelper<Package> parseHelper

	@Inject extension ValidationTestHelper
	@Inject
	private IResourceDescription.Manager resourceDescriptionManager

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;
	
	

	
	@Inject	
	private AlfScopeProvider alfSP

	def fillIndex(URI uri, Resource resource, ResourceDescriptionsData index) {
		val description = resourceDescriptionManager.getResourceDescription(resource)
		index.addDescription(uri, description)
	}
	
	def protected installIndex(XtextResourceSet resourceSet, ResourceDescriptionsData index) {
		ResourceDescriptionsData.ResourceSetAdapter.installResourceDescriptionsData(resourceSet, index)
	}

	@Test
	def void testTryToWrtieUserData() {

		val injector = new AlfStandaloneSetup().createInjector
		//val vmi = new AlfStandaloneSetup().
		//injector.
		val result = parseHelper.parse('''
			package Classes {
				class A{
					class a{}
				}
				class B is A{
					class b{}
				}
				class C specializes B{
					class c{}
				}
				feature D : A;
				feature EE : D{
					class ee{}
				}
			}
		''')
		//val scope=alfSP.getScope(result,SysMLPackage.eINSTANCE.generalization_General)
		//val scope=alfSP.getScope(i,SysMLPackage.eINSTANCE.package_Membership)
			// Fill index
		hfi.IndexInit(result)
	
		EcoreUtil2.resolveAll(result)
		
		val things=result.eAllContents.filter(Generalization).toSet
		things.forEach[i|
			val scope=alfSP.getScope(i,SysMLPackage.eINSTANCE.generalization_General)
			
			scope.allElements.forEach[e|
				println("! "+e.qualifiedName)
				e.userDataKeys.forEach[k|
					println(" +"+e.getUserData(k) + " - "+ k)
				]
			]
		]
		Assert.assertNotNull(result)
		result.assertNoErrors
		Assert.assertTrue(result.eResource.errors.empty)
	}
	
	
//		@Test
//	def void testBadScopeWithOnlyTwoSingleDotAtTheEnd() {
//
//		val result = parseHelper.parse('''
//			package Classes {
//				class A{
//					class a{}
//				}
//				class B is A{
//					class b{}
//				}
//				class C specializes B{
//					class c{}
//				}
//				feature D is A;
//				feature EE : D{
//					class ee{}
//				}
//			}
//		''')
//		EcoreUtil2.resolveAll(result)
//		//val scope=alfSP.getScope(result,SysMLPackage.eINSTANCE.generalization_General)
//		//val scope=alfSP.getScope(i,SysMLPackage.eINSTANCE.package_Membership)
//		
//		val things=result.eAllContents.filter(Class).toSet
//		things.forEach[i|
//			val scope=alfSP.getScope(i,SysMLPackage.eINSTANCE.class_OwnedGeneralization)
//			
//			scope.allElements.forEach[e|
//				e.userDataKeys.forEach[k|
//					println(e.getUserData(k))
//				]
//		]
//		]
//		Assert.assertNotNull(result)
//		result.assertNoErrors
//		Assert.assertTrue(result.eResource.errors.empty)
//	}
	
	
//	// Fill index
//		var ResourceDescriptionsData index = new ResourceDescriptionsData(newArrayList());
//		var allResourceIterator = allResourcesURIs.iterator
//		while (allResourceIterator.hasNext) {
//			var List<Resource> resources = newArrayList()
//			var int clusterIndex = 0
//			var continue = true
//			while (allResourceIterator.hasNext && continue) {
//				val uri = allResourceIterator.next
//				val resource = resourceSet.getResource(uri, true)
//				resources.add(resource)
//				fillIndex(uri, resource, index)
//				clusterIndex++
//				if (!strategy.continueProcessing(resourceSet, null, clusterIndex)) {
//					continue = false
//				}
//			}
//			if (!continue)
//				resourceSet.clearResourceSet
//		}
//		installIndex(resourceSet, index)
//	
	
	
}