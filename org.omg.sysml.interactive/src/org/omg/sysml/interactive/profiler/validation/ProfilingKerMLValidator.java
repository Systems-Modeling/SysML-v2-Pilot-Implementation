/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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
 *  Zoltan Ujhelyi, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.interactive.profiler.validation;

import java.lang.reflect.Method;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.omg.kerml.xtext.validation.KerMLValidator;
import org.omg.sysml.interactive.profiler.Profiler;

import com.google.inject.Inject;

public class ProfilingKerMLValidator extends KerMLValidator {

	private static final String KERML_VALIDATOR = "KerMLValidator#validate";
	
	@Inject
	Profiler profiler;

	protected class ProfilingMethodWrapper extends MethodWrapper {

		protected ProfilingMethodWrapper(AbstractDeclarativeValidator instance, Method m) {
			super(instance, m);
		}

		@Override
		public void invoke(State state) {
			Resource resource = state.currentObject.eResource();
			
			profiler.operationStarted(ProfilingKerMLValidator.this, KERML_VALIDATOR, "resource = " + resource.getURI().toString(), "method = " + getMethod().toGenericString());
			profiler.operationStarted(ProfilingKerMLValidator.this, KERML_VALIDATOR + "_" + getMethod().toGenericString(), "resource = " + resource.getURI().toString());
			super.invoke(state);
			profiler.operationFinished(ProfilingKerMLValidator.this, KERML_VALIDATOR + "_" + getMethod().toGenericString(), "DONE");
			profiler.operationFinished(ProfilingKerMLValidator.this, KERML_VALIDATOR, "DONE");
			
		}
		
	}
	
	@Override
	protected MethodWrapper createMethodWrapper(AbstractDeclarativeValidator instanceToUse, Method method) {
		return new ProfilingMethodWrapper(instanceToUse, method);
	}
	

}
