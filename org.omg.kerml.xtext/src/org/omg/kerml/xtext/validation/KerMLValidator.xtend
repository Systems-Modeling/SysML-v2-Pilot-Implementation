/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 * 
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 * 
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 * 
 * Contributors:
 *  Zoltan Kiss, IncQuery
 *  Balazs Grill, IncQuery
 *  Ed Seidewitz, MDS
 *  Miyako Wilson, JPL
 *  Axel Richard, Obeo
 * 
 *****************************************************************************/
 
package org.omg.kerml.xtext.validation

import org.eclipse.xtext.validation.Check
import org.omg.kerml.validation.KerMLValidationCheckerFactory
import org.omg.kerml.validation.ValidationCheckerFactory
import org.omg.sysml.lang.sysml.Element
import org.omg.kerml.validation.ValidationMessageAccepter
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.omg.kerml.validation.ValidationMessageMap
import org.omg.kerml.validation.KerMLValidationMessageMap
import java.io.FileNotFoundException
import java.io.IOException
import org.eclipse.xtext.validation.ValidationMessageAcceptor

class KerMLValidator extends AbstractKerMLValidator implements ValidationMessageAccepter {
	
	protected ValidationCheckerFactory factory;
	protected ValidationMessageMap messageMap;
	
	new () throws FileNotFoundException, IOException {
		this(new KerMLValidationCheckerFactory(), new KerMLValidationMessageMap());
	}
	
	new (ValidationCheckerFactory factory, ValidationMessageMap messageMap) {
		this.factory = factory;
		this.messageMap = messageMap;
	}
	
	@Check
	def checkElement(Element element) {
		factory.getValidationChecker(element).validate(element, this);
	}
	
	override acceptError(String message, EObject source, EStructuralFeature feature, String messageCode, String... data) {
		super.acceptError(message, source, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, messageCode, data)
	}
	
	override acceptWarning(String message, EObject source, EStructuralFeature feature, String messageCode, String... data) {
		super.acceptWarning(message, source, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, messageCode, data)
	}
	
	override acceptInfo(String message, EObject source, EStructuralFeature feature, String messageCode, String... data) {
		super.acceptInfo(message, source, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, messageCode, data)
	}
	
	override getMessageMap() {
		return messageMap;
	}
	
}
