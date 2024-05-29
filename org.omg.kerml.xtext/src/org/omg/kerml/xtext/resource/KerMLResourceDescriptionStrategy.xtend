/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
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
 */
package org.omg.kerml.xtext.resource

import com.google.inject.Inject
import java.util.LinkedList
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.util.IResourceScopeCache
import org.omg.sysml.lang.sysml.Classifier
import org.omg.sysml.lang.sysml.Type

class KerMLResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	static val LOG = Logger.getLogger(KerMLResourceDescriptionStrategy)

	@Inject
	IResourceScopeCache cache
	
	boolean resolvingGenerals = false

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		val qualifiedNameProvider = getQualifiedNameProvider()

		if (qualifiedNameProvider === null) {
			return false
		}

		try {
			val qualifiedName = qualifiedNameProvider.getFullyQualifiedName(eObject)
			if (qualifiedName !== null) {
				acceptor.accept(EObjectDescription.create(qualifiedName, eObject))
				if (!resolvingGenerals && !qualifiedName.isEmpty) {
					calculateAndStoreInheritedFeatures(eObject, qualifiedName, acceptor)
				}
			}

		} catch (Exception exc) {
			LOG.error(exc)
		}

		return true
	}
	
	def void calculateAndStoreInheritedFeatures(EObject specific, QualifiedName specificQn,
		IAcceptor<IEObjectDescription> acceptor) {
		if (specific instanceof Classifier) {
			resolvingGenerals = true
			val type = specific as Type
			val inheritedFeatures = type.inheritedFeature
			inheritedFeatures.forEach [
			    val qualifiedNameOfInherited = getQualifiedNameProvider().getFullyQualifiedName(it)
			    if (qualifiedNameOfInherited !== null && !qualifiedNameOfInherited.isEmpty){
					val prefixedNameOfInherited = QualifiedName.create(specificQn.segments + qualifiedNameOfInherited.lastSegment)//cache.get(Tuples.pair(it, "fqnInh"), specific.eResource(), [ QualifiedName.create(specificQn.segments + qualifiedNameOfInherited.lastSegment) ])
					acceptor.accept(EObjectDescription.create(prefixedNameOfInherited, it))
			    }
			]
		}
		resolvingGenerals = false
	}

	def static List<String> operator_plus(List<String> a, String b) {
		val list = new LinkedList(a)
		if (b !== null && !b.isEmpty){
			list.add(b)
		}
		list
	}
}
