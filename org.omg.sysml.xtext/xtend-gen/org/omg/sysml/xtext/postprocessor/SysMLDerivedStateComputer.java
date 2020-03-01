/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  Model Driven Solutions, Inc.
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
package org.omg.sysml.xtext.postprocessor;

import com.google.common.collect.Iterators;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.impl.TypeImpl;

@SuppressWarnings("all")
public class SysMLDerivedStateComputer implements IDerivedStateComputer {
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    if (preLinkingPhase) {
      return;
    }
    final Procedure1<TypeImpl> _function = (TypeImpl it) -> {
      it.<Generalization>calculateOwnedGeneralization();
    };
    IteratorExtensions.<TypeImpl>forEach(Iterators.<TypeImpl>filter(resource.getAllContents(), TypeImpl.class), _function);
  }
  
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
  }
}
