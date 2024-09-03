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
			
			profiler.operationStarted(ProfilingKerMLValidator.this, KERML_VALIDATOR, "resource = " + resource.getURI().toString());
			super.invoke(state);
			profiler.operationFinished(ProfilingKerMLValidator.this, KERML_VALIDATOR, "DONE");
			
		}
		
	}
	
	@Override
	protected MethodWrapper createMethodWrapper(AbstractDeclarativeValidator instanceToUse, Method method) {
		return new ProfilingMethodWrapper(instanceToUse, method);
	}
	

}
