/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.kerml.xtext.postprocessing;

import org.omg.sysml.lang.sysml.*;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;

public final class KerMLParserPostProcessorFactory {

	public static ElementParserPostProcessor getPostProcessor(Element element) {
		return element == null ? null : SWITCH.doSwitch(element);
	}

	private KerMLParserPostProcessorFactory() {
	}

	private static final SysMLSwitch<ElementParserPostProcessor> SWITCH = new KerMLFactoryPostProcessorSwitch();
	
	
	
	public static class KerMLFactoryPostProcessorSwitch extends SysMLSwitch<ElementParserPostProcessor> {
		
		@Override
		public ElementParserPostProcessor caseAnnotation(Annotation element) {
			return new AnnotationParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseComment(Comment element) {
			return new CommentParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseConjugation(Conjugation element) {
			return new ConjugationParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseDependency(Dependency element) {
			return new DependencyParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseDifferencing(Differencing element) {
			return new DifferencingParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseDisjoining(Disjoining element) {
			return new DisjoiningParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseElement(Element element) {
			return new ElementParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseEndFeatureMembership(EndFeatureMembership element) {
			return new EndFeatureMembershipParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseFeature(Feature element) {
			return new FeatureParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseFeatureInverting(FeatureInverting element) {
			return new FeatureInvertingParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseFeatureTyping(FeatureTyping element) {
			return new FeatureTypingParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseImport(Import element) {
			return new ImportParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseIntersecting(Intersecting element) {
			return new IntersectingParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseLiteralString(LiteralString element) {
			return new LiteralStringParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseMembership(Membership element) {
			return new MembershipParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseNamespaceImport(NamespaceImport element) {
			return new NamespaceImportParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseParameterMembership(ParameterMembership element) {
			return new ParameterMembershipParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseRedefinition(Redefinition element) {
			return new RedefinitionParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseReferenceSubsetting(ReferenceSubsetting element) {
			return new ReferenceSubsettingParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseSpecialization(Specialization element) {
			return new SpecializationParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseSubclassification(Subclassification element) {
			return new SubclassificationParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseSubsetting(Subsetting element) {
			return new SubsettingParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseTextualRepresentation(TextualRepresentation element) {
			return new TextualRepresentationParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseTypeFeaturing(TypeFeaturing element) {
			return new TypeFeaturingParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseUnioning(Unioning element) {
			return new UnioningParserPostProcessor(element);
		}

	};
}
