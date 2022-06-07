/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2020 Model Driven Solutions, Inc.
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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Type;

@SuppressWarnings("all")
public class SysMLLibraryUtil {
  public static final String DEFAULT_MODEL_LIBRARY_DIRECTORY = "/resource/sysml.library";
  
  private static String modelLibraryDirectory = SysMLLibraryUtil.DEFAULT_MODEL_LIBRARY_DIRECTORY;
  
  public static String setModelLibraryDirectory(final String path) {
    return SysMLLibraryUtil.modelLibraryDirectory = path;
  }
  
  public static boolean isModelLibrary(final Resource resource) {
    return ((resource != null) && resource.getURI().path().contains(SysMLLibraryUtil.modelLibraryDirectory));
  }
  
  public static IModelLibraryProvider getInstance(final Resource resource) {
    IModelLibraryProvider _xtrycatchfinallyexpression = null;
    try {
      URI _uRI = null;
      if (resource!=null) {
        _uRI=resource.getURI();
      }
      IResourceServiceProvider _resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(_uRI);
      IModelLibraryProvider _get = null;
      if (_resourceServiceProvider!=null) {
        _get=_resourceServiceProvider.<IModelLibraryProvider>get(IModelLibraryProvider.class);
      }
      _xtrycatchfinallyexpression = _get;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        Object _xblockexpression = null;
        {
          System.out.println(("[SysMLLibraryUtil] Cannot get library provider: " + e));
          _xblockexpression = null;
        }
        _xtrycatchfinallyexpression = ((IModelLibraryProvider)_xblockexpression);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  public static Element getLibraryElement(final Element context, final String name) {
    IModelLibraryProvider _instance = SysMLLibraryUtil.getInstance(context.eResource());
    Element _element = null;
    if (_instance!=null) {
      _element=_instance.getElement(context, name);
    }
    return _element;
  }
  
  public static Type getLibraryType(final Element context, final String... defaultNames) {
    for (final String defaultName : defaultNames) {
      {
        final Element element = SysMLLibraryUtil.getLibraryElement(context, defaultName);
        if ((element instanceof Type)) {
          return ((Type)element);
        }
      }
    }
    return null;
  }
}
