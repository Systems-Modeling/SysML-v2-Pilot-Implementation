/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018, 2019 Model Driven Solutions, Inc.
 * Copyright (c) 2018, 2019 California Institute of Technology/Jet Propulsion Laboratory
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
 *  Zoltan Kiss, IncQuery
 *  Balazs Grill, IncQuery
 *  Ed Seidewitz, MDS
 *  Miyako Wilson, JPL
 */
package org.omg.sysml.xtext.scoping;

import com.google.common.base.Objects;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.xtext.scoping.SysMLScopeProvider;

@SuppressWarnings("all")
public class SysMLScope extends AbstractScope {
  protected org.omg.sysml.lang.sysml.Package pack;
  
  protected EClass referenceType;
  
  protected SysMLScopeProvider scopeProvider;
  
  protected boolean isInsideScope;
  
  protected QualifiedName targetqn;
  
  protected Map<Element, Set<QualifiedName>> elements;
  
  protected Set<QualifiedName> visitedqns;
  
  protected boolean findFirst = false;
  
  protected boolean isShadowing = false;
  
  protected Type scopingType;
  
  public SysMLScope(final IScope parent, final org.omg.sysml.lang.sysml.Package pack, final EClass referenceType, final SysMLScopeProvider scopeProvider, final Element element) {
    this(parent, pack, referenceType, scopeProvider, true, element);
  }
  
  public SysMLScope(final IScope parent, final org.omg.sysml.lang.sysml.Package pack, final EClass referenceType, final SysMLScopeProvider scopeProvider, final boolean isInsideScope, final Element element) {
    super(parent, false);
    this.pack = pack;
    this.referenceType = referenceType;
    this.scopeProvider = scopeProvider;
    this.isInsideScope = isInsideScope;
    Type _xifexpression = null;
    Element _owner = null;
    if (element!=null) {
      _owner=element.getOwner();
    }
    if ((_owner instanceof Type)) {
      Element _owner_1 = element.getOwner();
      _xifexpression = ((Type) _owner_1);
    } else {
      _xifexpression = null;
    }
    this.scopingType = _xifexpression;
  }
  
  /**
   * A qualified name is shadowed if its first segment name is shadowed.
   */
  @Override
  protected boolean isShadowed(final IEObjectDescription input) {
    boolean _isEmpty = IterableExtensions.isEmpty(this.resolveInScope(QualifiedName.create(input.getName().getFirstSegment()), true));
    return (!_isEmpty);
  }
  
  @Override
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    IEObjectDescription _xblockexpression = null;
    {
      final Iterable<IEObjectDescription> result = this.resolveInScope(name, true);
      IEObjectDescription _xifexpression = null;
      boolean _isEmpty = IterableExtensions.isEmpty(result);
      boolean _not = (!_isEmpty);
      if (_not) {
        _xifexpression = ((IEObjectDescription[])Conversions.unwrapArray(result, IEObjectDescription.class))[0];
      } else {
        IEObjectDescription _xifexpression_1 = null;
        if (((this.getParent() != null) && (!this.isShadowing))) {
          _xifexpression_1 = this.getParent().getSingleElement(name);
        } else {
          _xifexpression_1 = null;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Override
  public Iterable<IEObjectDescription> getLocalElementsByName(final QualifiedName name) {
    return this.resolveInScope(name, false);
  }
  
  @Override
  public Iterable<IEObjectDescription> getAllLocalElements() {
    return this.resolveInScope(null, false);
  }
  
  /**
   * If targetqn is not null, resolve it in this local scope. If findFirst is true,
   * return the first matching element, if any. Otherwise return all matching elements.
   * 
   * If targetqn is null, return all elements in this local scope with all possible
   * qualified names by which they can be resolved (except that circularities are
   * truncated). - called when "XPECT scope" is used.
   */
  public Iterable<IEObjectDescription> resolveInScope(final QualifiedName targetqn, final boolean findFirst) {
    Iterable<IEObjectDescription> _xblockexpression = null;
    {
      this.targetqn = targetqn;
      this.findFirst = findFirst;
      this.elements = CollectionLiterals.<Element, Set<QualifiedName>>newHashMap();
      this.visitedqns = CollectionLiterals.<QualifiedName>newHashSet();
      this.resolve();
      final Function1<Element, Iterable<IEObjectDescription>> _function = (Element key) -> {
        final Function1<QualifiedName, IEObjectDescription> _function_1 = (QualifiedName qn) -> {
          return EObjectDescription.create(qn, key);
        };
        return IterableExtensions.<QualifiedName, IEObjectDescription>map(this.elements.get(key), _function_1);
      };
      _xblockexpression = IterableExtensions.<Element, IEObjectDescription>flatMap(this.elements.keySet(), _function);
    }
    return _xblockexpression;
  }
  
  protected void resolve() {
    this.resolve(this.pack, QualifiedName.create(), false, this.isInsideScope, CollectionLiterals.<org.omg.sysml.lang.sysml.Package>newHashSet());
  }
  
  protected boolean resolve(final org.omg.sysml.lang.sysml.Package pack, final QualifiedName qn, final boolean checkIfAdded, final boolean isInsideScope, final Set<org.omg.sysml.lang.sysml.Package> visited) {
    return ((this.owned(pack, qn, checkIfAdded, isInsideScope, CollectionLiterals.<org.omg.sysml.lang.sysml.Package>newHashSet(), visited) || 
      this.gen(pack, qn, visited)) || 
      this.imp(pack, qn, isInsideScope, visited));
  }
  
  protected void addName(final Map<Element, Set<QualifiedName>> elements, final QualifiedName qn, final Element el) {
    boolean _isInstance = this.referenceType.isInstance(el);
    if (_isInstance) {
      Set<QualifiedName> qns = elements.get(el);
      if ((qns == null)) {
        elements.put(el, CollectionLiterals.<QualifiedName>newHashSet(qn));
      } else {
        qns.add(qn);
      }
    }
  }
  
  protected boolean owned(final org.omg.sysml.lang.sysml.Package pack, final QualifiedName qn, final boolean checkIfAdded, final boolean isInsideScope, final Set<org.omg.sysml.lang.sysml.Package> ownedvisited, final Set<org.omg.sysml.lang.sysml.Package> visited) {
    boolean _contains = ownedvisited.contains(pack);
    boolean _not = (!_contains);
    if (_not) {
      if ((this.targetqn == null)) {
        ownedvisited.add(pack);
      }
      EList<Membership> _ownedMembership = pack.getOwnedMembership();
      for (final Membership m : _ownedMembership) {
        boolean _contains_1 = this.scopeProvider.getVisited().contains(m);
        boolean _not_1 = (!_contains_1);
        if (_not_1) {
          String elementName = null;
          Element memberElement = null;
          this.scopeProvider.addVisited(m);
          try {
            memberElement = m.getMemberElement();
            elementName = m.getMemberName();
          } finally {
            this.scopeProvider.removeVisited(m);
          }
          if (((elementName != null) && ((isInsideScope || 
            Objects.equal(m.getVisibility(), VisibilityKind.PUBLIC)) || 
            ((Objects.equal(m.getVisibility(), VisibilityKind.PROTECTED) && 
              (this.scopingType != null)) && 
              this.isInheritedProtected(this.scopingType, m.getMembershipOwningPackage()))))) {
            System.out.println(("elementName: " + elementName));
            final QualifiedName elementqn = qn.append(elementName);
            if (((this.targetqn == null) || this.targetqn.startsWith(elementqn))) {
              if (((!checkIfAdded) || (!this.visitedqns.contains(elementqn)))) {
                this.visitedqns.add(elementqn);
                if (((this.targetqn == null) || Objects.equal(this.targetqn, elementqn))) {
                  this.addName(this.elements, elementqn, memberElement);
                  if ((this.findFirst && Objects.equal(this.targetqn, elementqn))) {
                    return true;
                  }
                }
                boolean _notEquals = (!Objects.equal(this.targetqn, elementqn));
                if (_notEquals) {
                  if ((memberElement instanceof org.omg.sysml.lang.sysml.Package)) {
                    this.isShadowing = true;
                    boolean _owned = this.owned(((org.omg.sysml.lang.sysml.Package)memberElement), elementqn, false, false, ownedvisited, visited);
                    if (_owned) {
                      return true;
                    }
                    boolean _gen = this.gen(((org.omg.sysml.lang.sysml.Package)memberElement), elementqn, visited);
                    if (_gen) {
                      return true;
                    }
                    boolean _imp = this.imp(((org.omg.sysml.lang.sysml.Package)memberElement), elementqn, false, visited);
                    if (_imp) {
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
      }
      ownedvisited.remove(pack);
    }
    return false;
  }
  
  protected boolean isInheritedProtected(final Type general, final Element protectedOwningPackage) {
    EList<Generalization> gs = general.getOwnedGeneralization();
    for (final Generalization g : gs) {
      if ((Objects.equal(g.getGeneral(), protectedOwningPackage) || 
        this.isInheritedProtected(g.getGeneral(), protectedOwningPackage))) {
        return true;
      }
    }
    return false;
  }
  
  protected boolean gen(final org.omg.sysml.lang.sysml.Package pack, final QualifiedName qn, final Set<org.omg.sysml.lang.sysml.Package> visited) {
    if ((pack instanceof Type)) {
      Conjugation conjugator = ((Type)pack).getConjugator();
      if (((conjugator != null) && (!this.scopeProvider.getVisited().contains(conjugator)))) {
        this.scopeProvider.addVisited(conjugator);
        boolean found = this.resolveIfUnvisited(conjugator.getOriginalType(), qn, false, false, visited);
        this.scopeProvider.removeVisited(conjugator);
        if (found) {
          return true;
        }
      }
      EList<Generalization> _ownedGeneralization = ((Type)pack).getOwnedGeneralization();
      for (final Generalization e : _ownedGeneralization) {
        boolean _contains = this.scopeProvider.getVisited().contains(e);
        boolean _not = (!_contains);
        if (_not) {
          this.scopeProvider.addVisited(e);
          boolean found_1 = this.resolveIfUnvisited(e.getGeneral(), qn, false, false, visited);
          this.scopeProvider.removeVisited(e);
          if (found_1) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  protected boolean imp(final org.omg.sysml.lang.sysml.Package pack, final QualifiedName qn, final boolean isInsideScope, final Set<org.omg.sysml.lang.sysml.Package> visited) {
    EList<Import> _ownedImport = pack.getOwnedImport();
    for (final Import e : _ownedImport) {
      boolean _contains = this.scopeProvider.getVisited().contains(e);
      boolean _not = (!_contains);
      if (_not) {
        this.scopeProvider.addVisited(e);
        boolean found = ((isInsideScope || Objects.equal(e.getVisibility(), VisibilityKind.PUBLIC)) && 
          this.resolveIfUnvisited(e.getImportedPackage(), qn, true, false, visited));
        this.scopeProvider.removeVisited(e);
        if (found) {
          return true;
        }
      }
    }
    return false;
  }
  
  protected boolean resolveIfUnvisited(final org.omg.sysml.lang.sysml.Package pack, final QualifiedName qn, final boolean checkIfAdded, final boolean isInsideScope, final Set<org.omg.sysml.lang.sysml.Package> visited) {
    boolean _xblockexpression = false;
    {
      boolean found = false;
      if ((((pack != null) && (!pack.eIsProxy())) && (!visited.contains(pack)))) {
        visited.add(pack);
        found = this.resolve(pack, qn, checkIfAdded, isInsideScope, visited);
        visited.remove(pack);
      }
      _xblockexpression = found;
    }
    return _xblockexpression;
  }
}
