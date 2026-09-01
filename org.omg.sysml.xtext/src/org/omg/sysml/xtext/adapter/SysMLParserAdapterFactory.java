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
package org.omg.sysml.xtext.adapter;

import java.util.Optional;

import org.omg.kerml.xtext.adapter.ElementParserAdapter;
import org.omg.kerml.xtext.adapter.KerMLParserAdapterFactory.KerMLFactoryAdapterSwitch;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PortConjugation;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;

public class SysMLParserAdapterFactory {
	
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
	
	protected static ElementParserAdapter createAdapter(Element element) {
		ElementParserAdapter adapter = null;
		// PortUsage must be checked before OccurrenceUsage because its parser adapter deliberately
		// inherits directly from UsageParserAdapter and applies port-specific post-processing.
		if (element instanceof PortUsage portUsage) {
			adapter = new PortUsageParserAdapter(portUsage);
		// Some concrete OccurrenceUsage subtypes have multiple inheritance. In the generated
		// SysMLSwitch, caseFeature may then be visited before caseOccurrenceUsage and would select
		// a FeatureParserAdapter, skipping the occurrence-specific portion post-processing.
		} else if (element instanceof OccurrenceUsage occurrenceUsage) {
			adapter = new OccurrenceUsageParserAdapter(occurrenceUsage);
		// For the same reason, some other concrete Usage subtypes reach caseFeature before caseUsage.
		// Selecting UsageParserAdapter here guarantees that their common Usage post-processing runs.
		} else if (element instanceof Usage usage) {
			adapter = new UsageParserAdapter(usage);
		} else if (element != null) {
			adapter = SWITCH.doSwitch(element);
		}
		if (adapter != null) {
			element.eAdapters().add(adapter);
		}
		return adapter;
	}
	
	private SysMLParserAdapterFactory() {
	}
	
	public static final SysMLSwitch<ElementParserAdapter> SWITCH = new SysMLFactoryAdapterSwitch();
	
	public static class SysMLFactoryAdapterSwitch extends KerMLFactoryAdapterSwitch {
		
		@Override
		public ElementParserAdapter caseDefinition(Definition element) {
			return new DefinitionParserAdapter(element);
		}
		
		@Override
		public ElementParserAdapter caseOccurrenceUsage(OccurrenceUsage element) {
			return new OccurrenceUsageParserAdapter(element);
		}
		
		@Override
		public ElementParserAdapter casePortConjugation(PortConjugation element) {
			return new PortConjugationParserAdapter(element);
		}
		
		@Override
		public ElementParserAdapter casePortUsage(PortUsage element) {
			return new PortUsageParserAdapter(element);
		}
		
		@Override
		public ElementParserAdapter caseUsage(Usage element) {
			return new UsageParserAdapter(element);
		}

	}


}
