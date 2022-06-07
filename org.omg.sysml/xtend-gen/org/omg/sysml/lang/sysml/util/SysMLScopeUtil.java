/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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
 *  Ed Seidewitz, MDS
 */
package org.omg.sysml.lang.sysml.util;

import java.util.Collection;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.omg.sysml.lang.sysml.Membership;

@SuppressWarnings("all")
public class SysMLScopeUtil {
  public static IScopeProvider getScopeProvider(final Resource resource) {
    IScopeProvider _xtrycatchfinallyexpression = null;
    try {
      URI _uRI = null;
      if (resource!=null) {
        _uRI=resource.getURI();
      }
      IResourceServiceProvider _resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(_uRI);
      IScopeProvider _get = null;
      if (_resourceServiceProvider!=null) {
        _get=_resourceServiceProvider.<IScopeProvider>get(IScopeProvider.class);
      }
      _xtrycatchfinallyexpression = _get;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        Object _xblockexpression = null;
        {
          System.out.println(("[SysMLScopeUtil] Cannot get scope provider: " + e));
          _xblockexpression = null;
        }
        _xtrycatchfinallyexpression = ((IScopeProvider)_xblockexpression);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  public static ISysMLScope getScopeFor(final Resource resource, final EObject context, final EReference reference) {
    IScope _scope = SysMLScopeUtil.getScopeProvider(resource).getScope(context, reference);
    return ((ISysMLScope) _scope);
  }
  
  public static Collection<Membership> getMembershipsFor(final EObject context, final EReference reference, final String name, final boolean includeAll) {
    return SysMLScopeUtil.getScopeFor(context.eResource(), context, reference).getMemberships(name, includeAll);
  }
}
