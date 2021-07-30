package org.omg.kerml.xtext.linking;

import org.eclipse.xtext.linking.lazy.LazyLinkingResource;

public class KerMLLazyLinkingResource extends LazyLinkingResource {
	
	public void clearUnresolvableURIFragments() {
		getUnresolvableURIFragments().clear();
	}
	
}
