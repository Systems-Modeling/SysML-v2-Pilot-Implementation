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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Ed Seidewitz, MDS
 */
package org.omg.sysml.xtext.scoping;

import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.xtext.scoping.SysMLScope;
import org.omg.sysml.xtext.scoping.SysMLScopeProvider;

@SuppressWarnings("all")
public class SysMLRootScope extends SysMLScope {
  public SysMLRootScope(final IScope parent, final org.omg.sysml.lang.sysml.Package pack, final EClass referenceType, final SysMLScopeProvider scopeProvider, final Element element) {
    super(parent, pack, referenceType, scopeProvider, element);
  }
  
  @Override
  protected void resolve() {
    final QualifiedName packqn = QualifiedName.create(this.pack.getName());
    if ((this.targetqn == null)) {
      super.resolve();
      this.elements = this.addQualification(this.elements, packqn);
      this.addName(this.elements, packqn, this.pack);
    } else {
      boolean _equals = Objects.equal(this.targetqn, packqn);
      if (_equals) {
        this.addName(this.elements, packqn, this.pack);
      } else {
        boolean _startsWith = this.targetqn.startsWith(packqn);
        if (_startsWith) {
          this.targetqn = QualifiedName.create(this.targetqn.getSegments().subList(1, this.targetqn.getSegmentCount()));
          super.resolve();
          this.elements = this.addQualification(this.elements, packqn);
        }
      }
    }
  }
  
  protected HashMap<Element, Set<QualifiedName>> addQualification(final Map<Element, Set<QualifiedName>> elements, final QualifiedName packqn) {
    HashMap<Element, Set<QualifiedName>> _xblockexpression = null;
    {
      final HashMap<Element, Set<QualifiedName>> newElements = CollectionLiterals.<Element, Set<QualifiedName>>newHashMap();
      final Consumer<Map.Entry<Element, Set<QualifiedName>>> _function = (Map.Entry<Element, Set<QualifiedName>> entry) -> {
        final Consumer<QualifiedName> _function_1 = (QualifiedName qn) -> {
          this.addName(newElements, packqn.append(qn), entry.getKey());
        };
        entry.getValue().forEach(_function_1);
      };
      elements.entrySet().forEach(_function);
      _xblockexpression = newElements;
    }
    return _xblockexpression;
  }
}
