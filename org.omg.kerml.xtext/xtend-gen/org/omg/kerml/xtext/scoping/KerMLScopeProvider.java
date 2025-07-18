/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018-2022, 2024 Model Driven Solutions, Inc.
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
 *  Laszlo Gati, MDS
 */
package org.omg.kerml.xtext.scoping;

import com.google.common.base.Predicates;
import com.google.inject.Inject;
import java.util.Objects;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.omg.kerml.xtext.library.LibraryNamespaces;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.NamespaceUtil;

@SuppressWarnings("all")
public class KerMLScopeProvider extends AbstractKerMLScopeProvider {
  @Inject
  private IGlobalScopeProvider globalScope;

  @Inject
  private LibraryNamespaces libraryNamespaces;

  public LibraryNamespaces getLibraryNamespaces() {
    return this.libraryNamespaces;
  }

  private Set<Element> visited = CollectionLiterals.<Element>newHashSet();

  public Set<Element> getVisited() {
    return this.visited;
  }

  public Set<Element> setVisited(final Set<Element> visited) {
    return this.visited = visited;
  }

  public boolean addVisited(final Element element) {
    return this.visited.add(element);
  }

  public boolean removeVisited(final Element element) {
    return this.visited.remove(element);
  }

  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xifexpression = null;
    if ((context instanceof Conjugation)) {
      EObject _eContainer = ((Conjugation)context).eContainer();
      _xifexpression = this.scope_owningNamespace(((Element) _eContainer), context, reference);
    } else {
      IScope _xifexpression_1 = null;
      if ((context instanceof ReferenceSubsetting)) {
        IScope _xblockexpression = null;
        {
          Feature referencingFeature = ((ReferenceSubsetting)context).getReferencingFeature();
          Type _owningType = null;
          if (referencingFeature!=null) {
            _owningType=referencingFeature.getOwningType();
          }
          Type owningType = _owningType;
          IScope _xifexpression_2 = null;
          if ((referencingFeature.isEnd() && (owningType instanceof Connector))) {
            _xifexpression_2 = this.scope_owningNamespace(owningType, context, reference);
          } else {
            EObject _eContainer_1 = ((ReferenceSubsetting)context).eContainer();
            _xifexpression_2 = this.scope_owningNamespace(((Element) _eContainer_1), context, reference);
          }
          _xblockexpression = _xifexpression_2;
        }
        _xifexpression_1 = _xblockexpression;
      } else {
        IScope _xifexpression_2 = null;
        if ((context instanceof FeatureTyping)) {
          EObject _eContainer_1 = ((FeatureTyping)context).eContainer();
          _xifexpression_2 = this.scope_nonExpressionNamespace(((Element) _eContainer_1), context, reference);
        } else {
          IScope _xifexpression_3 = null;
          if ((context instanceof Specialization)) {
            EObject _eContainer_2 = ((Specialization)context).eContainer();
            _xifexpression_3 = this.scope_owningNamespace(((Element) _eContainer_2), context, reference);
          } else {
            IScope _xifexpression_4 = null;
            if ((context instanceof FeatureChaining)) {
              _xifexpression_4 = this.scope_featureChaining(((FeatureChaining)context), reference);
            } else {
              IScope _xifexpression_5 = null;
              if ((context instanceof Membership)) {
                _xifexpression_5 = this.scope_relativeNamespace(((Element)context), ((Membership)context).getMembershipOwningNamespace(), context, reference);
              } else {
                IScope _xifexpression_6 = null;
                if ((context instanceof Import)) {
                  _xifexpression_6 = this.scope_Namespace(((Element)context), ((Import)context).getImportOwningNamespace(), context, reference, true);
                } else {
                  IScope _xifexpression_7 = null;
                  if ((context instanceof Namespace)) {
                    _xifexpression_7 = this.scopeFor(((Namespace)context), reference, null, true, true, false, null);
                  } else {
                    IScope _xifexpression_8 = null;
                    if ((context instanceof Element)) {
                      _xifexpression_8 = this.scope_owningNamespace(((Element)context), context, reference);
                    } else {
                      _xifexpression_8 = super.getScope(context, reference);
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  public IScope scope_featureChaining(final FeatureChaining ch, final EReference reference) {
    IScope _xblockexpression = null;
    {
      Feature featureChained = ch.getFeatureChained();
      final EList<FeatureChaining> ownedFeatureChainings = featureChained.getOwnedFeatureChaining();
      final int i = ownedFeatureChainings.indexOf(ch);
      IScope _xifexpression = null;
      if ((i <= 0)) {
        IScope _xblockexpression_1 = null;
        {
          final Relationship owningRelationship = featureChained.getOwningRelationship();
          Namespace _owningNamespace = null;
          if (featureChained!=null) {
            _owningNamespace=featureChained.getOwningNamespace();
          }
          Namespace owningNamespace = _owningNamespace;
          if ((owningRelationship instanceof Subsetting)) {
            featureChained = ((Subsetting)owningRelationship).getSubsettingFeature();
            Namespace _owningNamespace_1 = null;
            if (featureChained!=null) {
              _owningNamespace_1=featureChained.getOwningNamespace();
            }
            owningNamespace = _owningNamespace_1;
            if (((owningNamespace instanceof Connector) && (owningRelationship instanceof ReferenceSubsetting))) {
              featureChained = ((Connector) owningNamespace);
            }
          }
          _xblockexpression_1 = this.scope_relativeNamespace(featureChained, owningNamespace, ch, reference);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = this.scope_Namespace(ch, ownedFeatureChainings.get((i - 1)).getChainingFeature(), ch, reference, false);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public IScope scope_owningNamespace(final Element element, final EObject context, final EReference reference) {
    return this.scope_Namespace(element, NamespaceUtil.getParentNamespaceOf(element), context, reference, true);
  }

  public IScope scope_nonExpressionNamespace(final Element element, final EObject context, final EReference reference) {
    return this.scope_Namespace(element, NamespaceUtil.getNonExpressionNamespaceFor(element), context, reference, true);
  }

  public IScope scope_Namespace(final Element element, final Namespace namespace, final EObject context, final EReference reference, final boolean isInsideScope) {
    IScope _xifexpression = null;
    if ((namespace == null)) {
      _xifexpression = super.getScope(element, reference);
    } else {
      EReference _redefinition_RedefinedFeature = SysMLPackage.eINSTANCE.getRedefinition_RedefinedFeature();
      boolean _equals = Objects.equals(reference, _redefinition_RedefinedFeature);
      Element _xifexpression_1 = null;
      if ((context instanceof Element)) {
        _xifexpression_1 = ((Element)context);
      } else {
        _xifexpression_1 = null;
      }
      _xifexpression = this.scopeFor(namespace, reference, element, isInsideScope, true, _equals, _xifexpression_1);
    }
    return _xifexpression;
  }

  public IScope scope_relativeNamespace(final Element element, final Namespace ns, final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      final Namespace rel = NamespaceUtil.getRelativeNamespaceFor(ns);
      IScope _xifexpression = null;
      if ((rel == null)) {
        _xifexpression = this.scope_nonExpressionNamespace(element, context, reference);
      } else {
        _xifexpression = this.scope_Namespace(element, rel, context, reference, false);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public IScope scopeFor(final Namespace pack, final EReference reference, final Element element, final boolean isInsideScope, final boolean isFirstScope, final boolean isRedefinition, final Element skip) {
    KerMLScope _xblockexpression = null;
    {
      IScope outerscope = IScope.NULLSCOPE;
      if (isInsideScope) {
        final Namespace parent = NamespaceUtil.getParentNamespaceOf(pack);
        IScope _xifexpression = null;
        if ((parent == null)) {
          _xifexpression = this.globalScope.getScope(pack.eResource(), reference, Predicates.<IEObjectDescription>alwaysTrue());
        } else {
          _xifexpression = this.scopeFor(parent, reference, element, true, false, false, skip);
        }
        outerscope = _xifexpression;
      }
      EClass _eReferenceType = reference.getEReferenceType();
      _xblockexpression = new KerMLScope(outerscope, pack, _eReferenceType, this, isInsideScope, isFirstScope, isRedefinition, element, skip);
    }
    return _xblockexpression;
  }
}
