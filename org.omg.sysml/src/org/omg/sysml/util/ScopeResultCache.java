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

package org.omg.sysml.util;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.util.Tuples;
import org.omg.sysml.adapter.ElementAdapterFactory;
import org.omg.sysml.adapter.NamespaceAdapter;
import org.omg.sysml.lang.sysml.Namespace;


/**
 * A cache implementation responsible for caching already computed elements for a given namespace.
 */
public class ScopeResultCache {
	
	public static final CachedScopeResult EMPTY_RESULT = new CachedScopeResult(null);
	private final Map<Object, CachedScopeResult> scopeResultsCache;
	private final Namespace namespace;
	
	public ScopeResultCache(Namespace namespace)
	{
		this.namespace = namespace;
		this.scopeResultsCache = new HashMap<>(); 
	}

	/**
	 * Checks the namespace for a given {qualified name, reference type} pair and
	 * returns a specific EObject description or <tt>null</tt> if no such element is
	 * contained in the namespace.
	 * </p>
	 * The <tt>descriptionProvider</tt> function, responsible for calculating the
	 * relevant result, is only called when no previously calculated value is found
	 * in the cache: the <tt>canStoreCondition</tt> predicate can be used to
	 * prohibit caching values in certain cases (e.g. to avoid storing incomplete
	 * information).
	 * 
	 */
	public IEObjectDescription computeEObjectDescription(QualifiedName qn, EClass refType, Supplier<IEObjectDescription> descriptionProvider, Predicate<IEObjectDescription> canStoreCondition)
	{
		final var cacheKey = createKey(qn, refType);
		
		if (scopeResultsCache.containsKey(cacheKey)) {
			return scopeResultsCache.get(cacheKey).getDescription();
		} else {
			IEObjectDescription result = descriptionProvider.get();
			if (canStoreCondition.test(result)) {
				scopeResultsCache.put(cacheKey, createCacheResult(result));
			}
			return result;
		}
	}
	
	private CachedScopeResult createCacheResult(IEObjectDescription description)
	{
		if (description == null) {
			return EMPTY_RESULT;
		}
		
		return new CachedScopeResult(description);
	}
	
	private Object createKey(QualifiedName qn, EClass refType)
	{
		return Tuples.create(qn, refType);
	}
	
	public static ScopeResultCache getInstance(Namespace namespace)
	{
		 final var adapter = (NamespaceAdapter) ElementAdapterFactory.getAdapter(namespace);
		 return adapter.getScopeResultsCache();
	}
	
	public Namespace getNamespace() {
		return namespace;
	}
	
	/**
	 * This is a wrapper class for the stored EObject Descriptions. This was
	 * introduced to (1) ensure Map instances do not have to store null values, as
	 * not all implementations support them, and (2) to allow future extensions as
	 * necessary.
	 */
	private static class CachedScopeResult {
	    
		private final IEObjectDescription description;
		
		public CachedScopeResult(IEObjectDescription description) {
			this.description = description;
		}
		
		public IEObjectDescription getDescription(){
			return description;
		}
	}
}
