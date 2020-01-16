/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
 * Copyright (c) 2019 California Institute of Technology/Jet Propulsion Laboratory
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
 *  Ed Seidewitz, MDS
 *  Miyako Wilson, Georgia Tech
 */
package org.omg.sysml.xtext.scoping;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.xtext.scoping.SysMLScope;
import org.omg.sysml.xtext.scoping.SysMLScopeProvider;

@SuppressWarnings("all")
public class SysMLGlobalScope extends AbstractScope {
  protected IScope outer;
  
  protected Resource resource;
  
  protected Predicate<IEObjectDescription> filter;
  
  protected Predicate<IEObjectDescription> rootFilter;
  
  protected EClass referenceType;
  
  protected SysMLScopeProvider scopeProvider;
  
  protected Element element;
  
  public static SysMLGlobalScope createScope(final IScope outer, final Resource resource, final Predicate<IEObjectDescription> filter, final Predicate<IEObjectDescription> rootFilter, final EClass type, final SysMLScopeProvider scopeProvider) {
    return new SysMLGlobalScope(outer, resource, filter, rootFilter, type, scopeProvider);
  }
  
  public SysMLGlobalScope(final IScope outer, final Resource resource, final Predicate<IEObjectDescription> filter, final Predicate<IEObjectDescription> rootFilter, final EClass type, final SysMLScopeProvider scopeProvider) {
    super(IScope.NULLSCOPE, false);
    this.outer = outer;
    this.resource = resource;
    this.filter = filter;
    this.rootFilter = rootFilter;
    this.referenceType = type;
    this.scopeProvider = scopeProvider;
  }
  
  public IScope alfScope(final org.omg.sysml.lang.sysml.Package pack) {
    return new SysMLScope(IScope.NULLSCOPE, pack, this.referenceType, this.scopeProvider, false, null);
  }
  
  public IEObjectDescription addQualification(final IEObjectDescription description, final String name) {
    IEObjectDescription _xifexpression = null;
    if ((description == null)) {
      _xifexpression = null;
    } else {
      _xifexpression = EObjectDescription.create(QualifiedName.create(name).append(description.getName()), description.getEObjectOrProxy());
    }
    return _xifexpression;
  }
  
  public IEObjectDescription filter(final IEObjectDescription description) {
    IEObjectDescription _xifexpression = null;
    if ((((description != null) && (this.filter != null)) && (!this.filter.apply(description)))) {
      _xifexpression = null;
    } else {
      _xifexpression = description;
    }
    return _xifexpression;
  }
  
  @Override
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    IEObjectDescription result = null;
    int _segmentCount = name.getSegmentCount();
    boolean _greaterThan = (_segmentCount > 0);
    if (_greaterThan) {
      final QualifiedName rootName = QualifiedName.create(name.getFirstSegment());
      final IEObjectDescription root = this.outer.getSingleElement(rootName);
      if ((root != null)) {
        int _segmentCount_1 = name.getSegmentCount();
        boolean _equals = (_segmentCount_1 == 1);
        if (_equals) {
          boolean _isInstance = this.referenceType.isInstance(root.getEObjectOrProxy());
          if (_isInstance) {
            result = root;
          }
        } else {
          EObject _eObjectOrProxy = root.getEObjectOrProxy();
          if ((_eObjectOrProxy instanceof org.omg.sysml.lang.sysml.Package)) {
            EObject _resolve = EcoreUtil.resolve(root.getEObjectOrProxy(), this.resource);
            result = this.addQualification(this.alfScope(((org.omg.sysml.lang.sysml.Package) _resolve)).getSingleElement(name.skipFirst(1)), name.getFirstSegment());
          }
        }
      }
    }
    return this.filter(result);
  }
  
  @Override
  public Iterable<IEObjectDescription> getAllLocalElements() {
    final Iterable<IEObjectDescription> rootElements = Iterables.<IEObjectDescription>filter(this.outer.getAllElements(), this.rootFilter);
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      return Boolean.valueOf(this.referenceType.isInstance(it.getEObjectOrProxy()));
    };
    Iterable<IEObjectDescription> allElements = IterableExtensions.<IEObjectDescription>filter(rootElements, _function);
    for (final IEObjectDescription root : rootElements) {
      {
        final EObject element = root.getEObjectOrProxy();
        if ((element instanceof org.omg.sysml.lang.sysml.Package)) {
          final Function1<IEObjectDescription, IEObjectDescription> _function_1 = (IEObjectDescription it) -> {
            return this.addQualification(it, root.getName().getFirstSegment());
          };
          allElements = Iterables.<IEObjectDescription>concat(allElements, 
            IterableExtensions.<IEObjectDescription, IEObjectDescription>map(this.alfScope(((org.omg.sysml.lang.sysml.Package) element)).getAllElements(), _function_1));
        }
      }
    }
    Iterable<IEObjectDescription> _xifexpression = null;
    if ((this.filter == null)) {
      _xifexpression = allElements;
    } else {
      _xifexpression = Iterables.<IEObjectDescription>filter(allElements, this.filter);
    }
    return _xifexpression;
  }
}
