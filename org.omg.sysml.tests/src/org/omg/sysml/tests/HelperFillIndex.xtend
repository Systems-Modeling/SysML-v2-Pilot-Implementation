package org.omg.sysml.tests

import com.google.inject.Inject
import com.google.inject.Provider
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.clustering.DisabledClusteringPolicy
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData
import org.omg.sysml.lang.sysml.Package

class HelperFillIndex {
	
	@Inject
	HelperFillIndex hfi
	
	@Inject
	private IResourceDescription.Manager resourceDescriptionManager
	
	def fillIndex(URI uri, Resource resource, ResourceDescriptionsData index) {
		val description = resourceDescriptionManager.getResourceDescription(resource)
		index.addDescription(uri, description)
	}
	
	def protected installIndex(XtextResourceSet resourceSet, ResourceDescriptionsData index) {
		ResourceDescriptionsData.ResourceSetAdapter.installResourceDescriptionsData(resourceSet, index)
	}
	
	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;
	
	def void IndexInit(Package result){
		var ResourceDescriptionsData index = new ResourceDescriptionsData(newArrayList());
		var allResourceIterator = result.eResource.resourceSet.resources.iterator
		val resourceSet = resourceSetProvider.get
		val strategy = new DisabledClusteringPolicy
		while (allResourceIterator.hasNext) {
			var List<Resource> resources = newArrayList()
			var int clusterIndex = 0
			var continue = true
			while (allResourceIterator.hasNext && continue) {
				val resource = allResourceIterator.next
				val uri = resource.URI
				resources.add(resource)
				fillIndex(uri, resource, index)
				clusterIndex++
				
				if (!strategy.continueProcessing(resourceSet, null, clusterIndex)) {
					continue = false
				}
			}
//			if (!continue)
//				resourceSet.clearResourceSet
		}
		installIndex(resourceSet, index)
	
	}
}