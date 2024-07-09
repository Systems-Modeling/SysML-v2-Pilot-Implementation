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
package org.omg.sysml.interactive;

import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OwningMembership;

@SuppressWarnings("all")
public class LibraryNamesExporter {
  public static void main(final String[] args) {
    final SysMLInteractive instance = SysMLInteractive.getProfilingInstance();
    int _length = args.length;
    boolean _lessEqualsThan = (_length <= 1);
    if (_lessEqualsThan) {
      System.out.println("Usage: ");
      System.out.println("SysMLInteractiveParsingProfiler <LIBRARY FOLDER> <FILENAME>");
    }
    instance.loadLibrary(args[0]);
    final Set<String> shortNames = CollectionLiterals.<String>newHashSet();
    final Consumer<Resource> _function = (Resource it) -> {
      final Procedure1<EObject> _function_1 = (EObject el) -> {
        if ((el instanceof Namespace)) {
          final QualifiedName nsQn = instance.getQualifiedNameProvider().getFullyQualifiedName(el);
          if (((nsQn != null) && (!nsQn.isEmpty()))) {
            shortNames.add(nsQn.getLastSegment());
            String _shortName = ((Namespace)el).getShortName();
            boolean _tripleNotEquals = (_shortName != null);
            if (_tripleNotEquals) {
              shortNames.add(((Namespace)el).getShortName());
            }
          }
          EList<Membership> _ownedMembership = ((Namespace)el).getOwnedMembership();
          for (final Membership mem : _ownedMembership) {
            {
              String _xifexpression = null;
              if ((mem instanceof OwningMembership)) {
                Element _memberElement = ((OwningMembership)mem).getMemberElement();
                String _declaredName = null;
                if (_memberElement!=null) {
                  _declaredName=_memberElement.getDeclaredName();
                }
                _xifexpression = _declaredName;
              } else {
                _xifexpression = mem.getMemberName();
              }
              String memberName = _xifexpression;
              shortNames.add(memberName);
              String _xifexpression_1 = null;
              if ((mem instanceof OwningMembership)) {
                Element _memberElement_1 = ((OwningMembership)mem).getMemberElement();
                String _declaredShortName = null;
                if (_memberElement_1!=null) {
                  _declaredShortName=_memberElement_1.getDeclaredShortName();
                }
                _xifexpression_1 = _declaredShortName;
              } else {
                _xifexpression_1 = mem.getMemberShortName();
              }
              String memberShortName = _xifexpression_1;
              shortNames.add(memberShortName);
            }
          }
        }
      };
      IteratorExtensions.<EObject>forEach(it.getAllContents(), _function_1);
    };
    instance.getLibraryResources().forEach(_function);
    System.out.println(LibraryNamesExporter.getLibraryShortNamesClass(shortNames));
  }

  public static CharSequence getLibraryShortNamesClass(final Set<String> shortNames) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.Set;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class LibraryShortNames {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final Set<String> LIBRARY_SHORT_NAMES = Set.of(");
    _builder.newLine();
    {
      boolean _hasElements = false;
      for(final String name : shortNames) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "                ");
        }
        _builder.append("                ");
        _builder.append("\"");
        _builder.append(name, "                ");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    _builder.append(");");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
