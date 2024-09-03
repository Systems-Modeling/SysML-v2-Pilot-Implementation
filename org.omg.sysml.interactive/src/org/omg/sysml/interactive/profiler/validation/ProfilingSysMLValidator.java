package org.omg.sysml.interactive.profiler.validation;

import java.lang.reflect.Method;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.omg.kerml.xtext.validation.KerMLValidator;
import org.omg.sysml.interactive.profiler.Profiler;
import org.omg.sysml.xtext.validation.SysMLValidator;

import com.google.inject.Inject;

public class ProfilingSysMLValidator extends SysMLValidator {

	private static final String SYSML_VALIDATOR = "SysMLValidator#validate";
	
	@Inject
	Profiler profiler;

	protected class ProfilingMethodWrapper extends MethodWrapper {

		protected ProfilingMethodWrapper(AbstractDeclarativeValidator instance, Method m) {
			super(instance, m);
		}

		@Override
		public void invoke(State state) {
			Resource resource = state.currentObject.eResource();
			
			profiler.operationStarted(ProfilingSysMLValidator.this, SYSML_VALIDATOR, "resource = " + resource.getURI().toString());
			super.invoke(state);
			profiler.operationFinished(ProfilingSysMLValidator.this, SYSML_VALIDATOR, "DONE");
			
		}
		
	}
	
	@Override
	protected MethodWrapper createMethodWrapper(AbstractDeclarativeValidator instanceToUse, Method method) {
		return new ProfilingMethodWrapper(instanceToUse, method);
	}
	

}
