/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2022 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Ed Seidewitz
 *  Zoltan Ujhelyi
 * 
 *****************************************************************************/

package org.omg.sysml.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IResourceDescription.Manager;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.omg.sysml.expressions.util.EvaluationUtil;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralInfinity;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralRational;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

import com.google.common.base.Predicates;


/**
 * This is a utility base class for reading SysML v2 files into an EMF resource set.
 * Files can be read either as "input resources" or "library resources", if that distinction
 * is important for subsequent processing. Files can be read individually, or all files
 * (as limited to a certain set of extensions) can be read by traversing a directory
 * hierarchy recursively from a given root directory.
 * 
 * @author Ed Seidewitz
 *
 */
public abstract class SysMLUtil {

	private final ResourceSet resourceSet;
	private final List<Resource> inputResources = new LinkedList<>();
	private final Set<String> extensions = new HashSet<>();
	private final ResourceDescriptionsData index;
	
	private boolean isVerbose = true;
	
	protected SysMLUtil() {
		this(new ResourceDescriptionsData(new ArrayList<>()));
	}
	
	protected SysMLUtil(ResourceDescriptionsData resourceDescriptionData) {
		SysMLPackage.eINSTANCE.getName();
		this.resourceSet = new ResourceSetImpl();
		this.resourceSet.getLoadOptions().put(XtextResource.OPTION_ENCODING, "UTF-8");
		this.index = resourceDescriptionData;
		ResourceDescriptionsData.ResourceSetAdapter.installResourceDescriptionsData(this.resourceSet, this.index);
	}
	
	/**
	 * Add an extension to the list of allowed file extensions. The extension string must start with a dot.
	 * 
	 * @param 	extension		the extension to be added (including the initial dot)
	 */
	protected void addExtension(String extension) {
		this.extensions.add(extension);
	}
	
	/**
	 * Print the given line only if verbose mode is on.
	 * 
	 * @param 	line			the line to be printed
	 */
	protected void println(String line) {
		if (isVerbose) {
			System.out.println(line);
		}
	}

	/**
	 * Get the managed resource set.
	 * 
	 * @return the resource set
	 */
    public ResourceSet getResourceSet() {
        return resourceSet;
    }
    
	/**
	 * Add a resource to the Xtext index.
	 * 
	 * @param 	resource		the resource to be added
	 */
	public void addResourceToIndex(Resource resource) {
		URI uri = resource.getURI();
		IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(uri);
		Manager manager = resourceServiceProvider.getResourceDescriptionManager();
		this.index.addDescription(uri, manager.getResourceDescription(resource));
	}
	
	/**
	 * Return whether verbose mode is on or off.
	 * 
	 * @return	whether verbose mode is on or off
	 */
	public boolean isVerbose() {
		return this.isVerbose;
	}
	
	/**
	 * Set verbose mode on or off.
	 * 
	 * @param	isverbose	whether verbose mode is on or off
	 */
	public void setVerbose(boolean isVerbose) {
		this.isVerbose = isVerbose;
	}
	
	/**
	 * Check whether the given resource is considered an input resource or a library resource.
	 * 
	 * @param 	resource		the resource to check.
	 * @return	true if the resource is an input resource and false otherwise (including if
	 * 			the given resource has not been read
	 */
	public boolean isInputResource(Resource resource) {
		return inputResources.contains(resource);
	}
	
	/**
	 * If the given resource is in the resource set, then add it to the set of input resources.
	 * 
	 * @param 	resource		the resource to be considered an input resource
	 */
	public void addInputResource(Resource resource) {
		if (resource.getResourceSet() == this.resourceSet) {
			this.inputResources.add(resource);
		}
	}
	
	/**
	 * Return all the input resources.
	 * 
	 * @return the input resources.
	 */
	public List<Resource> getInputResources() {
		return this.inputResources;
	}
	
	/**
	 * Return all the library resources, that is, resources that are not input resources.
	 * 
	 * @return the library resources
	 */
	public Set<Resource> getLibraryResources() {
		return this.getResourceSet().getResources().stream().
				filter(Predicates.not(this::isInputResource)).
				collect(Collectors.toSet());
	}
	
	/**
	 * Create a resource using the given path and add it to the resource set. Throws a runtime
	 * exception if the resource cannot be created.
	 * 
	 * @param 	path			the path to be used for the new resource.
	 * @return	the newly created resource
	 */
	public Resource createResource(final String path) {
		final Resource resource = this.resourceSet.createResource(URI.createFileURI(path));
		if (resource == null) {
			throw new RuntimeException("Error creating resource: " + path);
		} else {
			return resource;
		}
	}
	
	/**
	 * Get an existing resource in the resource set with the given path or, if there is no
	 * such resource in the resource set, attempt to load it. Throws a runtime exception if
	 * the resource cannot be opened.
	 * 
	 * @param 	path			the path of the resource
	 * @return	the opened resource
	 */
	public Resource getResource(final String path) {
	    URI uri = URI.createFileURI(path);
		final Resource resource = this.resourceSet.getResource(uri, true);
		if (resource == null) {
			throw new RuntimeException("Error opening resource: " + path);
		} else {
			this.addResourceToIndex(resource);
			return resource;
		}
	}
	
	/**
	 * Read the existing resource at the given path while logging this to the console.
	 * 
	 * @param 	path			the path of the resource
	 * @return	the opened resource
	 */
	public Resource readResource(final String path) {
		println("Reading " + path + "...");
		return this.getResource(path);
	}
	
	/**
	 * If the given file has an allowable extension, then read it. Or, if the file is a directory, then
	 * recursively read all the allowable files in it, directly or indirectly.
	 * 
	 * @param 	file			the file from which the resources are be read
	 * @param 	isInput			whether the resources read are to be considered input resources
	 * @param	extensions		the allowed file extensions
	 * @return 
	 * @throws IOException 
	 */
	public List<Resource> readAll(final File file, final boolean isInput, Set<String> extensions) throws IOException {
		List<Resource> resources = new LinkedList<>();
		Files.walk(file.toPath()).forEach(path -> resources.add(read(path, isInput, extensions)));
		return resources;
	}
	
	/**
	 * If the given file has an allowable extension, then read it. Or, if the file is a directory, then
	 * recursively read all the allowable files in it, directly or indirectly.
	 * 
	 * @param 	file			the file from which the resources are be read
	 * @param 	isInput			whether the resources read are to be considered input resources
	 * @return 
	 * @throws IOException 
	 */
	public List<Resource> readAll(final File file, final boolean isInput) throws IOException {
		return readAll(file, isInput, extensions);
	}
	
	public Resource read(final Path path, boolean isInput, Set<String> extensions) {
		final Resource resource;
		if (extensions.stream().anyMatch(path.toString()::endsWith)) {
			 resource = this.readResource(path.toString());
			if (isInput) {
				this.addInputResource(resource);
			}
		} else {
			resource = null;
		}
		return resource;
	}
	
	/**
	 * If the given path identifies a file with an allowable extension, then read it. 
	 * If the given path is for a directory, then recursively read all the allowable files in it, 
	 * directly or indirectly.
	 * 
	 * @param 	path			the path from which resources are to be read
	 * @param 	isInput			whether the resources read are to be considered input resources
	 * @return 
	 * @throws IOException 
	 */
	public List<Resource> readAll(final String path, boolean isInput) throws IOException {
		return this.readAll(new File(path), isInput, this.extensions);
	}
	
	/**
	 * If the given path identifies an file with the given extension, then read it. 
	 * If the given path is for a directory, then recursively read all the allowable files in it, 
	 * directly or indirectly.
	 * 
	 * @param 	path			the path from which resources are to be read
	 * @param 	isInput			whether the resources read are to be considered input resources
	 * @param 	extension		the allowed file extension
	 * @return 
	 * @throws IOException 
	 */
	public List<Resource> readAll(final String path, boolean isInput, String extension) throws IOException {
		return this.readAll(new File(path), isInput, Set.of(extension));
	}
	
	/**
	 * Read files recursively from the directories given by each of the paths. All the resources read
	 * from the first path are considered to be input resources. All the resources read from the
	 * other paths are considered to be library resources.
	 * 
	 * @param 	paths			the paths from which resources are to be read
	 * @throws IOException 
	 */
	public void read(final String... paths) throws IOException {
		if (paths.length > 0) {
			for (int i = 1; i < paths.length; i++) {
				this.readAll(paths[i], false);
			}
			this.readAll(paths[0], true);
		}
	}
	
	/**
	 * Transform elements in all resources. If isAddImplicitElements is true, then also generate
	 * implicit elements in input resources.
	 * 
	 * @param	isAddImplicitElements	whether to add implicit elements to input resources
	 */
	public void transformAll(boolean isAddImplicitElements) {
		for (Resource resource: this.resourceSet.getResources()) {
			ElementUtil.transformAll(resource, 
					isAddImplicitElements && this.isInputResource(resource));
		}
	}
	
	/**
	 * Resolve proxies in all input resources.
	 */
	public void resolveAllInputResources() {
		for (Resource resource: this.inputResources) {
			EcoreUtil.resolveAll(resource);
		}
	}
	
	//Utility for printing out parts of the model in a human readable format
	
	public static final String INDENT = "  ";
	
	private static String formatRelationship(EClass kind, String shortName, String memberName) {
		return "[" + kind.getName() + 
				     (shortName == null? "": " <" + shortName + ">") + 
				     (memberName == null? "": " " + memberName) +
			   "] ";
	}
	
	private static String formatRelationship(Relationship relationship) {
		return relationship == null? "":
			   relationship instanceof Membership && !(relationship instanceof OwningMembership)?
					   formatRelationship(relationship.eClass(), 
							   ((Membership)relationship).getMemberShortName(), 
							   ((Membership)relationship).getMemberName()):
			   formatRelationship(relationship.eClass(), null, null);
	}
	
	private static void formatElement(StringBuilder buffer, String indentation, Element element, String relationshipTag) {
		buffer.append(indentation + relationshipTag + element.eClass().getName());		
		if (EvaluationUtil.isMetaclassFeature(element)) {
			formatElement(buffer, " ", ((MetadataFeature)element).getAnnotatedElement().get(0), "");
		} else {		
			String shortName = element.getDeclaredShortName();
			String name = nameOf(element);
			buffer.append(
					(shortName == null? "": " <" + shortName + ">") +
					(name == null? "": " " + name) + 
					" (" + element.getElementId() + ")\n");
		}
	}
	
	public static String nameOf(Element element) {
		if (element == null) {
			return "";
		} else if (element instanceof Feature && !((Feature)element).getOwnedFeatureChaining().isEmpty()) {
			String name = "";
			for (Feature chainingFeature: ((Feature)element).getChainingFeature()) {
				String nextName = chainingFeature.getName();
				if (nextName == null) {
					nextName = "";
				}
				if (name == "") {
					name = nextName;
				} else {
					name += "." + nextName;
				}
			}
			return name;
		} else {
			return element instanceof LiteralBoolean? Boolean.valueOf(((LiteralBoolean)element).isValue()).toString():
				   element instanceof LiteralString? ((LiteralString)element).getValue().toString():
				   element instanceof LiteralInteger? Integer.valueOf(((LiteralInteger)element).getValue()).toString():
				   element instanceof LiteralRational? Double.valueOf(((LiteralRational)element).getValue()).toString():
				   element instanceof LiteralInfinity? "*":
				   element instanceof FeatureReferenceExpression? nameOf(((FeatureReferenceExpression)element).getReferent()):
				   element instanceof OperatorExpression? ((OperatorExpression)element).getOperator():
				   element instanceof InvocationExpression? nameOf(((InvocationExpression)element).getFunction()):
				   element.getName();
		}
	}

	private static void formatExplicitElement(StringBuilder buffer, String indentation, Element element, Relationship relationship) {
		formatElement(buffer, indentation, element, formatRelationship(relationship));
	}
	
	private static void formatImplicitElement(StringBuilder buffer, String indentation, Element element, EClass kind) {
		formatElement(buffer, indentation, element, formatRelationship(kind, null, "(implicit)"));
	}
	
	private static void formatTree(StringBuilder buffer, String indentation, Element element, Relationship relationship) {
		formatExplicitElement(buffer, indentation, element, relationship);
		if (element instanceof Expression && !(element instanceof CalculationUsage)) {
			for (Element output: ((Expression)element).getOutput()) {
				if (output.getOwner() == element) {
					formatExplicitElement(buffer, indentation + SysMLUtil.INDENT, output, output.getOwningMembership());
				}
			}
		} else {
			if (element instanceof Type) {
				TypeUtil.forEachImplicitGeneralTypeOf((Type)element, (kind, supertype)->
					formatImplicitElement(buffer, indentation + SysMLUtil.INDENT, supertype, kind)
				);
			}
			
			for (Relationship subrelationship: element.getOwnedRelationship()) {
				for (Element relatedElement: subrelationship.getRelatedElement()) {
					if (relatedElement != element) {
						if (relatedElement.getOwningRelationship() == subrelationship) {
							formatTree(buffer, indentation + SysMLUtil.INDENT, relatedElement, subrelationship);
						} else {
							formatExplicitElement(buffer, indentation + SysMLUtil.INDENT, relatedElement, subrelationship);
						}
					}
				}
			}
		}
	}

	public static String formatElement(Element element) {
		StringBuilder buffer = new StringBuilder();
		formatExplicitElement(buffer, "", element, null);
		return buffer.toString();
	}

	public static String formatTree(Element element) {
		StringBuilder buffer = new StringBuilder();
		formatTree(buffer, "", element, null);
		return buffer.toString();
	}

	public static <T extends Object> String formatList(List<T> list) {
		StringBuilder buffer = new StringBuilder();
		list.stream().map(x->x.toString() + "\n").forEachOrdered(buffer::append);
		return buffer.toString();
	}
	
	public static String formatException(Exception exception) {
		StringWriter writer = new StringWriter();
		exception.printStackTrace(new PrintWriter(writer));
		return writer.toString();
	}
	
	public static String formatMembershipList(List<Membership> membership) {
		return membership.stream().
			map(Membership::getMemberElement).
			sorted(SysMLUtil::compare).
			map(SysMLUtil::formatElement).
			collect(Collectors.joining());
	}
	
	public static int compare(Element element1, Element element2) {
		String humanId1 = element1.getDeclaredShortName();
		String humanId2 = element2.getDeclaredShortName();
		String name1 = element1.getName();
		String name2 = element2.getName();
		return name1 != null && name2 != null? name1.compareToIgnoreCase(name2):
			   name1 == null && name2 != null? -1:
			   name1 != null && name2 == null? 1:
			   humanId1 != null && humanId2 != null? humanId1.compareToIgnoreCase(humanId2):
			   humanId1 == null && humanId2 != null? -1:
			   humanId1 != null && humanId2 == null? 1:
			   0;
	}
	
}
