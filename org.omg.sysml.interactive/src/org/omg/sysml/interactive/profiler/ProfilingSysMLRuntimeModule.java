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
 *  Laszlo Gati, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.interactive.profiler;

import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.service.SingletonBinding;
import org.eclipse.xtext.validation.IResourceValidator;
import org.omg.sysml.interactive.profiler.linking.ProfilingKerMLLinkingService;
import org.omg.sysml.interactive.profiler.scope.ProfilingSysMLGlobalScopeProvider;
import org.omg.sysml.interactive.profiler.scope.ProfilingSysMLScopeProvider;
import org.omg.sysml.interactive.profiler.validation.ProfilingResourceValidator;
import org.omg.sysml.interactive.profiler.validation.ProfilingSysMLValidator;
import org.omg.sysml.xtext.SysMLRuntimeModule;
import org.omg.sysml.xtext.validation.SysMLValidator;

public class ProfilingSysMLRuntimeModule extends SysMLRuntimeModule {
	
	@Override
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return ProfilingSysMLGlobalScopeProvider.class;
	}
	
	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return ProfilingSysMLScopeProvider.class;
	}
	
	@Override
	public Class<? extends ILinkingService> bindILinkingService() {
		return ProfilingKerMLLinkingService.class;
	}
	
	public Class<? extends Profiler> bindTimeProfiler(){
		return Profiler.class;
	}
	
	@Override
	public Class<? extends IResourceValidator> bindIResourceValidator() {
		return ProfilingResourceValidator.class;
	}

	@Override
	@SingletonBinding(eager=true)
	public Class<? extends SysMLValidator> bindSysMLValidator() {
		return ProfilingSysMLValidator.class;
	}
	
	
}