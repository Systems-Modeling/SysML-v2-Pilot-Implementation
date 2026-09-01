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

package org.omg.kerml.xtext.adapter;

import java.util.Optional;

import org.omg.sysml.lang.sysml.*;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;

public final class KerMLParserAdapterFactory {

	public static ElementParserAdapter getAdapter(Element element) {
		return getExistingAdapter(element).orElseGet(() -> createAdapter(element));
	}

	public static void removeAdapter(Element element) {
		getExistingAdapter(element).ifPresent(element.eAdapters()::remove);
	}

	protected static Optional<ElementParserAdapter> getExistingAdapter(Element element) {
		return element == null ? Optional.empty() :
				element.eAdapters().stream()
					.filter(ElementParserAdapter.class::isInstance)
					.map(ElementParserAdapter.class::cast)
					.findFirst();
	}

	public static ElementParserAdapter createAdapter(Element element) {
		ElementParserAdapter adapter = null;
		if (element != null) {
			adapter = SWITCH.doSwitch(element);
		}
		if (adapter != null) {
			element.eAdapters().add(adapter);
		}
		return adapter;
	}

	private KerMLParserAdapterFactory() {
	}

	private static final SysMLSwitch<ElementParserAdapter> SWITCH = new KerMLFactoryAdapterSwitch();
	
	
	
	public static class KerMLFactoryAdapterSwitch extends SysMLSwitch<ElementParserAdapter> {
		
		@Override
		public ElementParserAdapter caseAnnotation(Annotation element) {
			return new AnnotationParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseComment(Comment element) {
			return new CommentParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseConjugation(Conjugation element) {
			return new ConjugationParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseDependency(Dependency element) {
			return new DependencyParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseDifferencing(Differencing element) {
			return new DifferencingParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseDisjoining(Disjoining element) {
			return new DisjoiningParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseElement(Element element) {
			return new ElementParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseEndFeatureMembership(EndFeatureMembership element) {
			return new EndFeatureMembershipParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseFeature(Feature element) {
			return new FeatureParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseFeatureInverting(FeatureInverting element) {
			return new FeatureInvertingParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseFeatureTyping(FeatureTyping element) {
			return new FeatureTypingParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseImport(Import element) {
			return new ImportParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseIntersecting(Intersecting element) {
			return new IntersectingParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseLiteralString(LiteralString element) {
			return new LiteralStringParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseMembership(Membership element) {
			return new MembershipParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseNamespaceImport(NamespaceImport element) {
			return new NamespaceImportParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseParameterMembership(ParameterMembership element) {
			return new ParameterMembershipParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseRedefinition(Redefinition element) {
			return new RedefinitionParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseReferenceSubsetting(ReferenceSubsetting element) {
			return new ReferenceSubsettingParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseSpecialization(Specialization element) {
			return new SpecializationParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseSubclassification(Subclassification element) {
			return new SubclassificationParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseSubsetting(Subsetting element) {
			return new SubsettingParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseTextualRepresentation(TextualRepresentation element) {
			return new TextualRepresentationParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseTypeFeaturing(TypeFeaturing element) {
			return new TypeFeaturingParserAdapter(element);
		}

		@Override
		public ElementParserAdapter caseUnioning(Unioning element) {
			return new UnioningParserAdapter(element);
		}

	};
}
