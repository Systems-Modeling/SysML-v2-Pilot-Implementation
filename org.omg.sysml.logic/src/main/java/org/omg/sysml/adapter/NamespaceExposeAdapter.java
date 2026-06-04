/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
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
 *  Zoltan Ujhelyi, MDS
 */

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.NamespaceExpose;

/**
 * This adapter does not introduce any specific behavior compared to the
 * {@link NamespaceImportAdapter} but it is introduced to allow unexpected behavior
 * changes when regenerating the EMF models (as sometimes the order of multiple
 * generalizations changes).
 */
public class NamespaceExposeAdapter extends NamespaceImportAdapter {

	public NamespaceExposeAdapter(NamespaceExpose element) {
		super(element);
	}
	
	@Override
	public NamespaceExpose getTarget() {
		return (NamespaceExpose)super.getTarget();
	}

}
