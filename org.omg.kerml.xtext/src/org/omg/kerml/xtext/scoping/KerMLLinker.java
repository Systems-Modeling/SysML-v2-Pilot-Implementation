/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
 *  Zoltan Ujhelyi, MDS
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.scoping;

import java.util.Objects;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.xtext.diagnostics.IDiagnosticProducer;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.nodemodel.INode;
import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Differencing;
import org.omg.sysml.lang.sysml.Disjoining;
import org.omg.sysml.lang.sysml.Documentation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureInverting;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Intersecting;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.NamespaceImport;
import org.omg.sysml.lang.sysml.PortConjugation;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Subclassification;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.lang.sysml.Unioning;
import org.omg.sysml.util.ElementUtil;

import com.google.common.collect.Multimap;

public class KerMLLinker extends LazyLinker {

	@Override
	protected void clearReferences(EObject obj) {
		super.clearReferences(obj);
		if (obj instanceof Element) {
			ElementUtil.clean((Element)obj);
		}
	}
	
	@Override
	protected void clearReference(EObject obj, EReference ref) {
		if (
			// The Relationship#source and #target features are overridden
			// in each subtype to provide specific derived implementations that
			// are regenerated each time they are accessed so there is no need to
			// delete them; and as of May 2020, generic references are not supported
			// in concrete syntax, making it a safe to not clear them during linking.
			Objects.equals(ref, SysMLPackage.Literals.RELATIONSHIP__SOURCE) || 
			Objects.equals(ref, SysMLPackage.Literals.RELATIONSHIP__TARGET) ||
			
			// The Relationship#relatedElement feature is a derived union in the
			// abstract syntax model, but it is implemented as a manual derivation,
			// which is overridden as necessary in subtypes, so there is no need to
			// delete it.
			Objects.equals(ref, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT) ||
			
			// The Annotation#annotatingElement feature, which is not composite, is
			// redefined by Documentation#documentingComment, which is composite. 
			// Clearing annotedElement spuriously clears the documentedElement, which
			// then does not get a proxy because it is composite (containment).
			// Annotation#annotatingElement has the opposite feature 
			// AnnotatingElement#Annotation, which also should not be cleared.
			obj instanceof Documentation && Objects.equals(ref, SysMLPackage.Literals.ANNOTATION__ANNOTATING_ELEMENT) ||
			obj instanceof Comment && obj.eContainer() instanceof Documentation && 
				Objects.equals(ref, SysMLPackage.Literals.ANNOTATING_ELEMENT__ANNOTATION)
		 ) {
			return;
		}
		super.clearReference(obj, ref);
	}
	
	@Override
	protected void installProxies(EObject obj, IDiagnosticProducer producer, Multimap<Setting, INode> settingsToLink) {
		super.installProxies(obj, producer, settingsToLink);
		postProcessCrossReferences(obj);
	}
	
	protected void postProcessCrossReferences(EObject obj) {
		if (obj instanceof Annotation) {
			postProcessCrossReferences((Annotation) obj);
		}
		if (obj instanceof Conjugation) {
			postProcessCrossReferences((Conjugation) obj);
		}
		if (obj instanceof Differencing) {
			postProcessCrossReferences((Differencing) obj);
		}
		if (obj instanceof Disjoining) {
			postProcessCrossReferences((Disjoining) obj);
		}
		if (obj instanceof FeatureInverting) {
			postProcessCrossReferences((FeatureInverting) obj);
		}
		if (obj instanceof FeatureTyping) {
			postProcessCrossReferences((FeatureTyping) obj);
		}
		if (obj instanceof Intersecting) {
			postProcessCrossReferences((Intersecting) obj);
		}
		if (obj instanceof NamespaceImport) {
			postProcessCrossReferences((NamespaceImport) obj);
		}
		if (obj instanceof PortConjugation) {
			postProcessCrossReferences((PortConjugation) obj);
		}
		if (obj instanceof Redefinition) {
			postProcessCrossReferences((Redefinition) obj);
		}
		if (obj instanceof Specialization) {
			postProcessCrossReferences((Specialization) obj);
		}
		if (obj instanceof Subclassification) {
			postProcessCrossReferences((Subclassification) obj);
		}
		if (obj instanceof Subsetting) {
			postProcessCrossReferences((Subsetting) obj);
		}
		if (obj instanceof TypeFeaturing) {
			postProcessCrossReferences((TypeFeaturing) obj);
		}
		if (obj instanceof Unioning) {
			postProcessCrossReferences((Unioning) obj);
		}
	}
	
	protected void postProcessCrossReferences(Annotation obj) {
		// If the Annotation is not owned by an AnnotatingElement, then the annotatedElement is the owningRelatedElement.
		Object annotatedElement = obj.eGet(SysMLPackage.Literals.ANNOTATION__ANNOTATED_ELEMENT, false);
		if (annotatedElement == null) {
			Element owningRelatedElement = obj.getOwningRelatedElement();
			if (!(owningRelatedElement instanceof AnnotatingElement)) {
				obj.setAnnotatedElement(owningRelatedElement);
			}
		}
		
		// If there is no annotatingElement set, then set the AnnotatingElement to the owningRelatedElement,
		// if it is an AnnotatingElement, otherwise set it to the first ownedRelatedElement that is an
		// AnnotatingElement (if any).
		Object annotatingElement = obj.eGet(SysMLPackage.Literals.ANNOTATION__ANNOTATING_ELEMENT, false);
		if (annotatingElement == null) {
			Element owner = obj.getOwningRelatedElement();
			obj.setAnnotatingElement((AnnotatingElement)
					(owner instanceof AnnotatingElement? owner: 
						obj.getOwnedRelatedElement().stream().
							filter(AnnotatingElement.class::isInstance).
							findFirst().orElse(null)));
		}
	}
	
	protected void postProcessCrossReferences(Conjugation obj) {
		// If the conjugatedType is not set, then set it to the owningRelatedElement, if this is a Type,
		// otherwise set it to the first ownedRelatedElement.
		Object conjugatedType = obj.eGet(SysMLPackage.Literals.CONJUGATION__CONJUGATED_TYPE, false);
		if (conjugatedType == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Type) {
				obj.setConjugatedType((Type)owner);
			} else {
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setConjugatedType((Type)ownedRelatedElements.get(0));
				}
			}
		}
		
		// If the originalType is not set, set it to the last ownedRelatedElement.
		Object originalType = obj.eGet(SysMLPackage.Literals.CONJUGATION__ORIGINAL_TYPE, false);
		if (originalType == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setOriginalType((Type)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
	protected void postProcessCrossReferences(Differencing obj) {
		// If a Differencing is parsed targeting a Feature chain, then the differencingType will be empty,
		// but the Differencing will own the differencingType. So, in this case, the differencingType should
		// be set to the (last) ownedRelatedelement.
		Object differencingType = obj.eGet(SysMLPackage.Literals.DIFFERENCING__DIFFERENCING_TYPE, false);
		if (differencingType == null) {
			// Handle a differencingType that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setDifferencingType((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
	protected void postProcessCrossReferences(Disjoining obj) {
		// If a Disjoining is parsed targeting a Feature chain, then the disjoiningType will be empty,
		// but the Disjoining will own the disjoiningType. So, in this case, the disjoiningType should
		// be set to the (last) ownedRelatedelement.
		Object disjoiningType = obj.eGet(SysMLPackage.Literals.DISJOINING__DISJOINING_TYPE, false);
		if (disjoiningType == null) {
			// Handle a disjoiningType that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setDisjoiningType((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
		
		// If the typedDisjoined (source) is empty, set it to the owningRelatedElement, if it is a Type.
		// Otherwise, set it to the first ownedRelatedElement, to the first ownedRelatedElement,
		// which will be a Feature chain.
		Object typeDisjoined = obj.eGet(SysMLPackage.Literals.DISJOINING__TYPE_DISJOINED, false);
		if (typeDisjoined == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Type) {
				// Handle a Disjoining owned by the typeDisjoined.
				obj.setTypeDisjoined((Type)owner);
			} else {
				// Handle a typeDisjoined that is a Feature chain.
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setTypeDisjoined((Feature)ownedRelatedElements.get(0));
				}
			}
		}
	}
	
	protected void postProcessCrossReferences(FeatureInverting obj) {
		// If the featureInverted is empty, then set it to the owningRelatedElement of the FeatureInverting,
		// if that is a Feature, otherwise set it to the first ownedRelatedElement (which will be a
		// Feature chain).
		Object featureInverted = obj.eGet(SysMLPackage.Literals.FEATURE_INVERTING__FEATURE_INVERTED, false);
		if (featureInverted == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Feature) {
				// Handle FeatureInverting owned by the featureInverted.
				obj.setFeatureInverted((Feature)owner);
			} else {
				// Handle featureInverted that is a Feature chain.
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setFeatureInverted((Feature)ownedRelatedElements.get(0));
				}
			}
		}
		
		// If the invertingFeature is empty, then set it to the last ownedRelatedElement
		// (which will be a Feature chain).
		Object invertingFeature = obj.eGet(SysMLPackage.Literals.FEATURE_INVERTING__INVERTING_FEATURE, false);
		if (invertingFeature == null) {
			// Handle invertingFeature that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setInvertingFeature((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
	protected void postProcessCrossReferences(FeatureTyping obj) {
		// If the type is empty, then set it to the first owned related element
		// (which will be a Feature chain).
		Object type = obj.eGet(SysMLPackage.Literals.FEATURE_TYPING__TYPE, false);
		if (type == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setType((Feature)ownedRelatedElements.get(0));
			}
		}
		
		// If the typedFeature is empty, then set it to the owningRelatedElement (if that is a Feature).
		Object typedFeature = obj.eGet(SysMLPackage.Literals.FEATURE_TYPING__TYPED_FEATURE, false);
		if (typedFeature == null) {
			Element owningRelatedElement = obj.getOwningRelatedElement();
			if (owningRelatedElement instanceof Feature) {
				obj.setTypedFeature((Feature) owningRelatedElement);
			}
		}
	}
	
	protected void postProcessCrossReferences(Intersecting obj) {
		// If a Intersecting is parsed targeting a Feature chain, then the intersectingType will be empty,
		// but the Intersecting will own the intersectingType. So, in this case, the intersectingType should
		// be set to the (last) ownedRelatedelement.
		Object intersectingType = obj.eGet(SysMLPackage.Literals.INTERSECTING__INTERSECTING_TYPE, false);
		if (intersectingType == null) {
			// Handle a intersectingType that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setIntersectingType((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
	protected void postProcessCrossReferences(NamespaceImport obj) {
		// If importedNamespace is empty, then set it to the first ownedRelatedElement, if this is a namespace
		// (filling in the implicit import for a filter package). Otherwise, set it to the importOwningNamspace.
		Object importedNamespace = obj.eGet(SysMLPackage.Literals.NAMESPACE_IMPORT__IMPORTED_NAMESPACE, false);
		if (importedNamespace == null) {
			EList<Element> ownedRelatedElement = obj.getOwnedRelatedElement();
			if (!ownedRelatedElement.isEmpty() && ownedRelatedElement.get(0) instanceof Namespace) {
				// Fill in the implicit import for a filter package.
				obj.setImportedNamespace((Namespace)ownedRelatedElement.get(0));
			} else {
				obj.setImportedNamespace(obj.getImportOwningNamespace());
			}
		}
	}
	
	protected void postProcessCrossReferences(PortConjugation obj) {
		// If the originalPortDefinition is empty, then set it to the owner of the conjugatedPortDefinition
		// (if that is a PortDefinition).
		Object originalPortDefinition = obj.eGet(SysMLPackage.Literals.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION, false);
		if (originalPortDefinition == null) {
			ConjugatedPortDefinition conjugatedPortDefinition = obj.getConjugatedPortDefinition();
			if (conjugatedPortDefinition != null) {
				Element conjugatedPortDefinitionOwner = conjugatedPortDefinition.getOwner();
				if (conjugatedPortDefinitionOwner instanceof PortDefinition) {
					obj.setOriginalPortDefinition((PortDefinition)conjugatedPortDefinitionOwner);
				}
			}
		}
	}
	
	protected void postProcessCrossReferences(Redefinition obj) {
		// If the redefiningFeature is empty, then set it to the owningRelatedElement, if that is a Feature.
		// Otherwise, set it to the first ownedRelatedElement (which will be a Feature chain).
		Object redefiningFeature = obj.eGet(SysMLPackage.Literals.REDEFINITION__REDEFINING_FEATURE, false);
		if (redefiningFeature == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Feature) {
				obj.setRedefiningFeature((Feature) owner);
			} else {
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setRedefiningFeature((Feature)ownedRelatedElements.get(0));
				}
			}
		}
		
		Object redefinedFeature = obj.eGet(SysMLPackage.Literals.REDEFINITION__REDEFINED_FEATURE, false);
		if (redefinedFeature == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setRedefinedFeature((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
	protected void postProcessCrossReferences(Specialization obj) {
		// If general is empty, then set it to the last ownedRelatedElement (which will be a Feature chain).
		Object general = obj.eGet(SysMLPackage.Literals.SPECIALIZATION__GENERAL, false);
		if (general == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setGeneral((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
		
		// If specific is empty, then set it to the owningRelatedElement, if that is a Type.
		// Otherwise set it to the first ownedRelatedElement (which will be a FeatureChain).
		Object specific = obj.eGet(SysMLPackage.Literals.SPECIALIZATION__SPECIFIC, false);
		if (specific == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Type) {
				obj.setSpecific((Type)owner);
			} else {
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setSpecific((Feature)ownedRelatedElements.get(0));
				}
			}
		}
	}
	
	protected void postProcessCrossReferences(Subclassification obj) {
		// If the subclassifier is empty, then set it to the owningRelatedElement,
		// if this is a Classifier.
		Object subclassifier = obj.eGet(SysMLPackage.Literals.SUBCLASSIFICATION__SUBCLASSIFIER, false);
		if (subclassifier == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Classifier) {
				obj.setSubclassifier((Classifier) owner);
			}
		}
	}
	
	protected void postProcessCrossReferences(Subsetting obj) {
		// If the subsettedFeature is empty, then set it to the last ownedRelatedElement
		// (which will be a Feature chain).
		Object subsettedFeature = obj.eGet(SysMLPackage.Literals.SUBSETTING__SUBSETTED_FEATURE, false);
		if (subsettedFeature == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setSubsettedFeature((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
		
		// If the subsettingFeature is empty, then set it to the owningRelatedFeature, if this is a Feature.
		// Otherwise set it to the first ownedRelatedElement (which will be a Feature chain).
		Object subsettingFeature = obj.eGet(SysMLPackage.Literals.SUBSETTING__SUBSETTING_FEATURE, false);
		if (subsettingFeature == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Feature) {
				obj.setSubsettingFeature((Feature) owner);
			} else {
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setSubsettingFeature((Feature)ownedRelatedElements.get(0));
				}
			}
		}
	}
	
	protected void postProcessCrossReferences(TypeFeaturing obj) {
		// If the featureOfType is empty, then set it to the owningRelatedElement (if this is a Feature).
		Object featureOfType = obj.eGet(SysMLPackage.Literals.TYPE_FEATURING__FEATURE_OF_TYPE, false);
		if (featureOfType == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Feature) {
				obj.setFeatureOfType((Feature)owner);
			}
		}
	}
	
	protected void postProcessCrossReferences(Unioning obj) {
		// If a Unioning is parsed targeting a Feature chain, then the unioningType will be empty,
		// but the Unioning will own the unioningType. So, in this case, the unioningType should
		// be set to the (last) ownedRelatedelement.
		Object unioningType = obj.eGet(SysMLPackage.Literals.UNIONING__UNIONING_TYPE, false);
		if (unioningType == null) {
			// Handle a intersectingType that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setUnioningType((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
}
