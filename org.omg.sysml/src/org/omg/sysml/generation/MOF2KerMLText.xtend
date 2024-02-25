/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022, 2024 Model Driven Solutions, Inc.
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
 *******************************************************************************/

package org.omg.sysml.generation

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil
import org.eclipse.emf.common.util.URI
import org.eclipse.uml2.uml.MultiplicityElement
import java.util.List
import org.eclipse.uml2.uml.NamedElement
import java.util.Comparator
import java.util.Collections
import org.eclipse.uml2.uml.Enumeration
import org.eclipse.uml2.uml.EnumerationLiteral
import java.nio.file.Files
import java.nio.file.Path
import org.eclipse.uml2.uml.Type

class MOF2KerMLText {
	
	final ResourceSet resourceSet;
	
	new() {
		resourceSet = new ResourceSetImpl()
		UMLResourcesUtil.init(this.resourceSet)
	}
	
	protected static class ElementNameComparator implements Comparator<NamedElement> {
		
		override compare(NamedElement o1, NamedElement o2) {
			return o1.name.compareTo(o2.name)
		}
		
	}
	
	static def getPackage(org.eclipse.uml2.uml.Package package_, String memberName) {
		package_.packagedElements.findFirst[it instanceof org.eclipse.uml2.uml.Package && name == memberName] as org.eclipse.uml2.uml.Package
	}
	
	def generate(String inputPath, String outputPath) {
		write(outputPath, generate(inputPath))
	}
	
	def generate(String inputPath) {
		System.out.println("Reading " + inputPath + "...")
		val mofResource = resourceSet.getResource(URI.createFileURI(inputPath), true)
		var model = mofResource.contents.get(0) as org.eclipse.uml2.uml.Package
		generate(model)
	}
	
	def generate(org.eclipse.uml2.uml.Package model) {
		'''
		import ScalarValues::*;
		«model.toPackage»
		'''
	}
	
	def String toPackage(org.eclipse.uml2.uml.Package package_) {
		'''
		package «nameOf(package_)» {			
			«package_.toPackageBody»
		}
		'''
	}
	
	def toPackageBody(org.eclipse.uml2.uml.Package package_) {
		var List<NamedElement> members = <NamedElement>newArrayList(package_.ownedMembers.filter[!name.empty].toList);
		Collections.sort(members, new ElementNameComparator)
		'''
		«FOR import_: package_.elementImports»
			import «import_.importedElement.qualifiedName»;
		«ENDFOR»
		«FOR import_: package_.packageImports»
			import «import_.importedPackage.qualifiedName»::*;
		«ENDFOR»
		«IF !package_.elementImports.empty || !package_.packageImports.empty»
		
		«ENDIF»
		«FOR member: members»
			«IF member instanceof Enumeration»
				«member.toEnumeration»
				
			«ELSEIF member instanceof org.eclipse.uml2.uml.Class»
				«member.toMetaclass»
				
			«ELSEIF member instanceof org.eclipse.uml2.uml.Package»
				«member.toPackage»
				
			«ENDIF»
		«ENDFOR»				
		'''		
	}
	
	def toEnumeration(Enumeration enumeration) {
		'''
		datatype «nameOf(enumeration)» {
			«FOR literal: enumeration.ownedLiterals»
				member feature «nameOf(literal)» : «nameOf(enumeration)»[1];
			«ENDFOR»
		}
		'''
	}
	
	def toMetaclass(org.eclipse.uml2.uml.Class class_) {
		toMetaclass(class_, "metaclass")
	}
		
	def toMetaclass(org.eclipse.uml2.uml.Class class_, String keyword) {
		var attributes = class_.attributes.filter[association === null]
		var associationEnds = class_.attributes.filter[association !== null]
		'''
		«IF class_.abstract»abstract «ENDIF»«keyword» «nameOf(class_)»«class_.toSubclassification»«IF class_.attributes.empty»;		
		«ELSE» {
			«attributes.toFeatures»
			«IF !attributes.empty && !associationEnds.empty»
			
			«ENDIF»
			«associationEnds.toFeatures»
		}		
		«ENDIF»		
		'''
	}
	
	def toFeatures(Iterable<org.eclipse.uml2.uml.Property> properties) {
		'''
		«FOR property: properties.filter[!isDerived]»
			«property.toFeature»
		«ENDFOR»
		«FOR property: properties.filter[isDerived]»
			«property.toFeature»
		«ENDFOR»
		'''		
	}
	
	def toSubclassification(org.eclipse.uml2.uml.Class class_) {
		var superclasses = class_.superClasses.toNameList
		'''«IF !superclasses.empty» specializes «superclasses»«ENDIF»'''
	}
	
	def toFeature(org.eclipse.uml2.uml.Property property) {
		toFeature(property, property.isComposite, "feature")
	}
	
	def toFeature(org.eclipse.uml2.uml.Property property, boolean isComposite, String keyword) {
		'''
		«IF property.derivedUnion»abstract «ENDIF»«IF isComposite»composite «ENDIF»«IF property.readOnly»readonly «ENDIF»«IF property.derived»derived «ENDIF»«keyword» «nameOf(property)» : «property.type.toTypeName»«property.toMultiplicity»«property.toSubsets»«property.toRedefines»;
		'''
	}
	
	def toMultiplicity(MultiplicityElement multiplicity) {
		'''[«multiplicity.lower»..«multiplicity.upper==-1?"*":multiplicity.upper»]'''
	}
	
	def toSubsets(org.eclipse.uml2.uml.Property property) {
		val subsettedProperties = property.subsettedProperties.toPropertyList
		'''«IF !subsettedProperties.empty» subsets «subsettedProperties»«ENDIF»'''
	}
	
	def toRedefines(org.eclipse.uml2.uml.Property property) {
		toRedefines(property.redefinedProperties.toPropertyList);
	}
	
	def toRedefines(String redefinedProperties) {
		'''«IF !redefinedProperties.empty» redefines «redefinedProperties»«ENDIF»'''
	}
	
	def toPropertyList(List<? extends org.eclipse.uml2.uml.Property> properties) {
		properties.filter[isNavigable].toList.toNameList
	}
	
	def String toNameList(List<? extends NamedElement> elements) {
		'''«FOR element: elements SEPARATOR ", "»«element.toName»«ENDFOR»'''
	}
	
	def String getReservedWords() {
		// Note: Every word must be preceded and followed by a space.
	   " about abstract alias all and as assign assoc behavior binding bool by chains 
		 class classifier comment composite conjugate conjugates conjugation connector 
		 datatype default derived differences disjoining disjoint doc element else end 
		 expr false feature featured featuring filter first flow for from function 
		 hastype if intersects implies import in inout interaction inv inverse 
		 inverting istype language locale member metaclass metadata multiplicity namespace 
		 nonunique not null of or ordered out package portion predicate private 
		 protected public readonly references redefines redefinition relationship rep 
		 return specialization specializes step struct subclassifier subset subsets 
		 subtype succession then to true type typed typing unions xor "
	}
	
	def toTypeName(Type type) {
		val name = type.name
		if (name == "Real") "Rational"
		else if (name == "UnlimitedNatural") "Natural"
		else name
	}
	
	def toName(NamedElement element) {
		if (element instanceof EnumerationLiteral) element.enumeration.name + "::" + nameOf(element)
		else nameOf(element)
	}
	
	def nameOf(NamedElement element) {
		var name = element.name;
		name =
			if (name === null || name.isEmpty) ""
			else if (reservedWords.indexOf(" " + name + " ") < 0) name
			else "'" + name + "'"
	}
	
	def static write(String outputPath, CharSequence text) {
		System.out.println("Writing " + outputPath + "...")
		Files.newBufferedWriter(Path.of(outputPath)).append(text).close()
	}
	
	static def void main(String[] args) {
		if (args.length >= 2) {
			new MOF2KerMLText().generate(args.get(0), args.get(1))
		}
	}
	
}