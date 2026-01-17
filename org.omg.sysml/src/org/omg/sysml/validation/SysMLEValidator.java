/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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

package org.omg.sysml.validation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.omg.sysml.lang.sysml.Element;

/**
 * A SysMLEValidator is an EValidator that validates KerML and SysML abstract syntax elements
 * by checking the specified validation constraints for them. It creates Diagnostics for any
 * generated validation messages, which are added to the given DiagnosticChain.
 */
public class SysMLEValidator implements EValidator {
	
	protected ValidationCheckerFactory factory;
	protected ValidationMessageMap messageMap;
	
	public SysMLEValidator() {
		this(new ValidationCheckerFactory(), new BasicValidationMessageMap());
	}

	public SysMLEValidator(ValidationCheckerFactory factory, ValidationMessageMap messageMap) {
		this.factory = factory;
		this.messageMap = messageMap;
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (eObject instanceof Element element) {
			ValidationChecker checker = factory.getValidationChecker(element);
			if (checker != null) {
				DiagnosticMessageAccepter messageAccepter = new DiagnosticMessageAccepter(diagnostics, messageMap);
				checker.validate(element, messageAccepter);
				return messageAccepter.isError();
			}
		}
		return true;
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eClass.isInstance(eObject) && validate(eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}
	
	static private class DiagnosticMessageAccepter implements ValidationMessageAccepter {
		
		private DiagnosticChain diagnostics;
		private ValidationMessageMap messageMap;
		private boolean isError = false;
		
		public DiagnosticMessageAccepter(DiagnosticChain diagnostics, ValidationMessageMap messageMap) {
			this.diagnostics = diagnostics;
			this.messageMap = messageMap;
		}
		
		public boolean isError() {
			return isError;
		}
		
		@Override
		public void acceptInfo(String message, EObject source, EStructuralFeature feature, String msgCode, String... data) {
			diagnostics.add(createDiagnostic(Diagnostic.INFO, message, source, msgCode, data));	
		}

		@Override
		public void acceptWarning(String message, EObject source, EStructuralFeature feature, String msgCode, String... data) {
			diagnostics.add(createDiagnostic(Diagnostic.WARNING, message, source, msgCode, data));	
		}

		@Override
		public void acceptError(String message, EObject source, EStructuralFeature feature, String msgCode, String... data) {
			diagnostics.add(createDiagnostic(Diagnostic.ERROR, message, source, msgCode, data));	
			isError = true;
		}
		
		public Diagnostic createDiagnostic(int severity, String message, EObject source, String msgCode, String... data) {
			return new BasicDiagnostic(severity, source.toString(), getMessageMap().getDiagnosticCode(msgCode), message, data);
		}

		@Override
		public ValidationMessageMap getMessageMap() {
			return messageMap;
		}
	}

}
