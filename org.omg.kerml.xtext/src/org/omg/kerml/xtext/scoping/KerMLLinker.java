/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021, 2024 Model Driven Solutions, Inc.
 * Copyright (c) 2024 Budapest University of Technology and Economics
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
 * Contributors:
 *  Zoltan Ujhelyi, MDS
 *  Ed Seidewitz, MDS
 *  Kristóf Marussy, BME
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.scoping;

import java.util.Objects;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.util.OnChangeEvictingCache;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.ElementUtil;

import com.google.inject.Inject;

public class KerMLLinker extends LazyLinker {

	@Inject
	private OnChangeEvictingCache cache;
	
	@Override
	protected void clearReferences(EObject obj) {
		super.clearReferences(obj);
		if (obj instanceof Element) {
			ElementUtil.clean((Element)obj);
		}
	}
	
	@Override
	protected void clearReference(EObject obj, EReference ref) {
		if (
			// The Relationship#source and #target features are overridden
			// in each subtype to provide specific derived implementations that
			// are recomputed when accessed so they should not be cleared.
			Objects.equals(ref, SysMLPackage.Literals.RELATIONSHIP__SOURCE) || 
			Objects.equals(ref, SysMLPackage.Literals.RELATIONSHIP__TARGET)			
		 ) {
			return;
		}
		super.clearReference(obj, ref);
	}
	
	@Override
	protected void doLinkModel(EObject model, IDiagnosticConsumer consumer) {
		super.doLinkModel(model, consumer);
		postProcessAllCrossReferences(model);
	}
	
	protected void postProcessAllCrossReferences(EObject model) {
		cache.execWithoutCacheClear(model.eResource(), new IUnitOfWork.Void<Resource>() {
			@Override
			public void process(Resource state) throws Exception {
				TreeIterator<EObject> iterator = getAllLinkableContents(model);
				while (iterator.hasNext()) {
					EObject obj = iterator.next();
					if (obj instanceof Element) {
						ElementUtil.postProcess((Element)obj);
					}
				}
			}
		});
	}
}
