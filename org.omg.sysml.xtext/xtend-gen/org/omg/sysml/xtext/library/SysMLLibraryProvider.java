/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
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
package org.omg.sysml.xtext.library;

import com.google.common.base.Predicate;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.util.IModelLibraryProvider;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.xtext.scoping.SysMLGlobalScopeProvider;
import org.omg.sysml.xtext.scoping.SysMLScopeProvider;

@Singleton
@SuppressWarnings("all")
public class SysMLLibraryProvider implements IModelLibraryProvider {
  @Inject
  private SysMLGlobalScopeProvider globalScope;
  
  @Inject
  private SysMLScopeProvider scopeProvider;
  
  @Inject
  private IQualifiedNameConverter nameConverter;
  
  protected boolean isModelLibrary(final Resource resource) {
    return SysMLLibraryUtil.isModelLibrary(resource);
  }
  
  protected String fileName(final URI uri) {
    return uri.trimFileExtension().lastSegment();
  }
  
  @Override
  public Element getElement(final Element context, final EReference reference, final String name) {
    if ((context == null)) {
      return null;
    } else {
      final QualifiedName qname = this.nameConverter.toQualifiedName(name);
      final Resource resource = context.eResource();
      IScope _xifexpression = null;
      boolean _isModelLibrary = this.isModelLibrary(resource);
      if (_isModelLibrary) {
        _xifexpression = this.scopeProvider.getScope(EcoreUtil2.getRootContainer(context), reference);
      } else {
        final Predicate<IEObjectDescription> _function = (IEObjectDescription it) -> {
          return this.fileName(it.getEObjectURI()).equals(qname.getFirstSegment());
        };
        _xifexpression = this.globalScope.getScope(resource, reference, _function);
      }
      final IScope scope = _xifexpression;
      final IEObjectDescription description = scope.getSingleElement(qname);
      Element _xifexpression_1 = null;
      if ((description == null)) {
        _xifexpression_1 = null;
      } else {
        EObject _resolve = EcoreUtil.resolve(description.getEObjectOrProxy(), context);
        _xifexpression_1 = ((Element) _resolve);
      }
      return _xifexpression_1;
    }
  }
}
