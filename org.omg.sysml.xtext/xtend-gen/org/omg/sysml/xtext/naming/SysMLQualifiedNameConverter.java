/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
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
 *  Zoltan Kiss, IncQuery
 *  Balazs Grill, IncQuery
 *  Ed Seidewitz, MDS
 */
package org.omg.sysml.xtext.naming;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.omg.sysml.lang.sysml.impl.ElementImpl;

@SuppressWarnings("all")
public class SysMLQualifiedNameConverter implements IQualifiedNameConverter {
  @Override
  public QualifiedName toQualifiedName(final String qualifiedNameAsText) {
    QualifiedName _xblockexpression = null;
    {
      Preconditions.checkArgument((qualifiedNameAsText != null), "Qualified name cannot be null");
      boolean _isEmpty = qualifiedNameAsText.isEmpty();
      boolean _not = (!_isEmpty);
      Preconditions.checkArgument(_not, "Qualified name cannot be empty");
      final ArrayList<String> segments = CollectionLiterals.<String>newArrayList();
      int i = 0;
      int j = 0;
      int n = qualifiedNameAsText.length();
      boolean isDelimitable = true;
      while ((j < n)) {
        {
          final char c = qualifiedNameAsText.charAt(j);
          final int delim = "\'\\.:".indexOf(c);
          if ((isDelimitable && (delim > 1))) {
            segments.add(ElementImpl.unescapeString(qualifiedNameAsText.substring(i, j)));
            i = ((j + delim) - 1);
            j = (i - 1);
          } else {
            if ((delim == 0)) {
              isDelimitable = (!isDelimitable);
            } else {
              if ((delim == 1)) {
                j++;
              }
            }
          }
          j++;
        }
      }
      if (((i < n) && (j <= n))) {
        segments.add(ElementImpl.unescapeString(qualifiedNameAsText.substring(i, j)));
      }
      _xblockexpression = QualifiedName.create(segments);
    }
    return _xblockexpression;
  }
  
  @Override
  public String toString(final QualifiedName name) {
    if ((name == null)) {
      throw new IllegalArgumentException("Qualified name cannot be null");
    }
    final int segmentCount = name.getSegmentCount();
    switch (segmentCount) {
      case 0:
        return "";
      case 1:
        return this.escapeName(name.getFirstSegment());
      default:
        {
          final StringBuilder builder = new StringBuilder();
          builder.append(this.escapeName(name.getFirstSegment()));
          for (int i = 1; (i < segmentCount); i++) {
            {
              builder.append("::");
              builder.append(this.escapeName(name.getSegment(i)));
            }
          }
          return builder.toString();
        }
    }
  }
  
  public String escapeName(final String name) {
    String _xifexpression = null;
    if ((((name == null) || name.isEmpty()) || this.isIdentifier(name))) {
      _xifexpression = name;
    } else {
      String _escapeString = ElementImpl.escapeString(name);
      String _plus = ("\'" + _escapeString);
      _xifexpression = (_plus + "\'");
    }
    return _xifexpression;
  }
  
  public boolean isIdentifier(final String name) {
    return name.matches("[a-zA-Z_] \\w*");
  }
}
