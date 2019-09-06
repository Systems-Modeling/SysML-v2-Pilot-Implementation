package org.omg.sysml.interactive;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class InverseOrderedResourceSetImpl extends ResourceSetImpl {
	
	private class InverseOrderedResourcesEList<E extends Object & Resource> extends ResourcesEList<E> {

		private static final long serialVersionUID = 1L;

		@Override
		public boolean add(E object) {
			if (this.contains(object)) {
				return false;
			} else {
				this.add(0, object);
				return true;
			}
		}

	}

	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new InverseOrderedResourcesEList<Resource>();
		}
		return resources;
	}

}
