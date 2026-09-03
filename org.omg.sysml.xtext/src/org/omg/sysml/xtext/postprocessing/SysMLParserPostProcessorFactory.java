/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.omg.sysml.xtext.postprocessing;

import org.omg.kerml.xtext.postprocessing.ElementParserPostProcessor;
import org.omg.kerml.xtext.postprocessing.KerMLParserPostProcessorFactory.KerMLFactoryPostProcessorSwitch;
import org.omg.sysml.lang.sysml.*;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;

public class SysMLParserPostProcessorFactory {
	
	public static ElementParserPostProcessor getPostProcessor(Element element) {
		return element == null ? null : SWITCH.doSwitch(element);
	}
	
	private SysMLParserPostProcessorFactory() {
	}
	
	private static final SysMLSwitch<ElementParserPostProcessor> SWITCH = new SysMLFactoryPostProcessorSwitch();
	
	public static class SysMLFactoryPostProcessorSwitch extends KerMLFactoryPostProcessorSwitch {

		@Override
		public ElementParserPostProcessor caseActionUsage(ActionUsage element) {
			return new ActionUsageParserPostProcessor(element);
		}
		
		@Override
		public ElementParserPostProcessor caseCalculationUsage(CalculationUsage element) {
			return new CalculationUsageParserPostProcessor(element);
		}
		
		@Override
		public ElementParserPostProcessor caseCaseUsage(CaseUsage element) {
			return new CaseUsageParserPostProcessor(element);
		}
		
		@Override
		public ElementParserPostProcessor caseConnectionUsage(ConnectionUsage element) {
			return new ConnectionUsageParserPostProcessor(element);
		}
		
		@Override
		public ElementParserPostProcessor caseDefinition(Definition element) {
			return new DefinitionParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor caseItemUsage(ItemUsage element) {
			return new ItemUsageParserPostProcessor(element);
		}
		
		@Override
		public ElementParserPostProcessor caseOccurrenceUsage(OccurrenceUsage element) {
			return new OccurrenceUsageParserPostProcessor(element);
		}

		@Override
		public ElementParserPostProcessor casePartUsage(PartUsage element) {
			return new PartUsageParserPostProcessor(element);
		}
		
		@Override
		public ElementParserPostProcessor casePortConjugation(PortConjugation element) {
			return new PortConjugationParserPostProcessor(element);
		}
		
		@Override
		public ElementParserPostProcessor casePortUsage(PortUsage element) {
			return new PortUsageParserPostProcessor(element);
		}
		
		@Override
		public ElementParserPostProcessor caseUsage(Usage element) {
			return new UsageParserPostProcessor(element);
		}

	}


}
