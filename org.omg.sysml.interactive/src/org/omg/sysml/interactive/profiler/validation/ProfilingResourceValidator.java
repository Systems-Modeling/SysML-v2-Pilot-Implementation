package org.omg.sysml.interactive.profiler.validation;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.ResourceValidatorImpl;
import org.omg.kerml.xtext.linking.KerMLLazyLinkingResource;
import org.omg.sysml.interactive.profiler.Profiler;
import org.omg.sysml.util.ElementUtil;

import com.google.inject.Inject;

	public class ProfilingResourceValidator extends ResourceValidatorImpl {

	private static final String VALIDATOR_PROXY_RESOLUTION = "ResourceValidator#resolveProxies";
	private static final String VALIDATOR_TRANSFORMALL = "ResourceValidator#transformAll";
	
	@Inject
	Profiler profiler;
	
	@Override
	protected void resolveProxies(Resource resource, CancelIndicator monitor) {
		profiler.operationStarted(this, VALIDATOR_PROXY_RESOLUTION, "resource = " + resource.getURI().toString());
		
		
		profiler.operationStarted(this, VALIDATOR_TRANSFORMALL, "resource = " + resource.getURI().toString());
		ElementUtil.transformAll(resource, false);
		profiler.operationFinished(this, VALIDATOR_TRANSFORMALL, "DONE");
		
		getOperationCanceledManager().checkCanceled(monitor);
		
		if (resource instanceof KerMLLazyLinkingResource) {
			((KerMLLazyLinkingResource)resource).clearUnresolvableURIFragments();
		}
		
		super.resolveProxies(resource, monitor);
		profiler.operationFinished(this, VALIDATOR_PROXY_RESOLUTION, "DONE");
	}


}
