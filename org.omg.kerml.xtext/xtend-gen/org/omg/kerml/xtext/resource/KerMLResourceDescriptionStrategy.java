/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
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
 */
package org.omg.kerml.xtext.resource;

import com.google.inject.Inject;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;

@SuppressWarnings("all")
public class KerMLResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  private static final Logger LOG = Logger.getLogger(KerMLResourceDescriptionStrategy.class);

  @Inject
  private IResourceScopeCache cache;

  private boolean resolvingGenerals = false;

  @Override
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    final IQualifiedNameProvider qualifiedNameProvider = this.getQualifiedNameProvider();
    if ((qualifiedNameProvider == null)) {
      return false;
    }
    try {
      final QualifiedName qualifiedName = qualifiedNameProvider.getFullyQualifiedName(eObject);
      if ((qualifiedName != null)) {
        acceptor.accept(EObjectDescription.create(qualifiedName, eObject));
        if (((!this.resolvingGenerals) && (!qualifiedName.isEmpty()))) {
          this.calculateAndStoreInheritedFeatures(eObject, qualifiedName, acceptor);
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception exc = (Exception)_t;
        KerMLResourceDescriptionStrategy.LOG.error(exc);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return true;
  }

  public void calculateAndStoreInheritedFeatures(final EObject specific, final QualifiedName specificQn, final IAcceptor<IEObjectDescription> acceptor) {
    if ((specific instanceof Classifier)) {
      this.resolvingGenerals = true;
      final Type type = ((Type) specific);
      final EList<Feature> inheritedFeatures = type.getInheritedFeature();
      final Consumer<Feature> _function = (Feature it) -> {
        final QualifiedName qualifiedNameOfInherited = this.getQualifiedNameProvider().getFullyQualifiedName(it);
        if (((qualifiedNameOfInherited != null) && (!qualifiedNameOfInherited.isEmpty()))) {
          List<String> _segments = specificQn.getSegments();
          String _lastSegment = qualifiedNameOfInherited.getLastSegment();
          List<String> _plus = KerMLResourceDescriptionStrategy.operator_plus(_segments, _lastSegment);
          final QualifiedName prefixedNameOfInherited = QualifiedName.create(_plus);
          acceptor.accept(EObjectDescription.create(prefixedNameOfInherited, it));
        }
      };
      inheritedFeatures.forEach(_function);
    }
    this.resolvingGenerals = false;
  }

  public static List<String> operator_plus(final List<String> a, final String b) {
    LinkedList<String> _xblockexpression = null;
    {
      final LinkedList<String> list = new LinkedList<String>(a);
      if (((b != null) && (!b.isEmpty()))) {
        list.add(b);
      }
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
}
