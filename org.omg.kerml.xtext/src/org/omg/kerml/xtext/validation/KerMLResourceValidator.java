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
 *  Ed Seidewitz
 * 
 *****************************************************************************/

package org.omg.kerml.xtext.validation;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.ResourceValidatorImpl;
import org.omg.kerml.xtext.linking.KerMLLazyLinkingResource;
import org.omg.sysml.util.ElementUtil;

public class KerMLResourceValidator extends ResourceValidatorImpl {

	@Override
	protected void resolveProxies(Resource resource, CancelIndicator monitor) {
		ElementUtil.transformAll(resource, false);
		getOperationCanceledManager().checkCanceled(monitor);
		if (resource instanceof KerMLLazyLinkingResource) {
			((KerMLLazyLinkingResource)resource).clearUnresolvableURIFragments();
		}
		super.resolveProxies(resource, monitor);
	}

}
