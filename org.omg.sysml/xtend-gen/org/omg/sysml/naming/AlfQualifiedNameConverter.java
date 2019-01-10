/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
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
 *  Zoltan Kiss
 *  Balazs Grill
 */
package org.omg.sysml.naming;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class AlfQualifiedNameConverter implements IQualifiedNameConverter {
  @Override
  public QualifiedName toQualifiedName(final String qualifiedNameAsText) {
    QualifiedName _xblockexpression = null;
    {
      Preconditions.checkArgument((qualifiedNameAsText != null), "Qualified name cannot be null");
      boolean _isEmpty = qualifiedNameAsText.isEmpty();
      boolean _not = (!_isEmpty);
      Preconditions.checkArgument(_not, "Qualified name cannot be empty");
      final String delimeter = this.toString();
      boolean _isEmpty_1 = delimeter.isEmpty();
      if (_isEmpty_1) {
        return QualifiedName.create(qualifiedNameAsText);
      }
      final char c = '.';
      final List<String> PartsAfterDotSplit = Strings.split(qualifiedNameAsText, c);
      final ArrayList<String> ret = CollectionLiterals.<String>newArrayList();
      final Consumer<String> _function = (String e) -> {
        ret.addAll(Strings.split(e, "::"));
      };
      PartsAfterDotSplit.forEach(_function);
      _xblockexpression = QualifiedName.create(ret);
    }
    return _xblockexpression;
  }
  
  @Override
  public String toString(final QualifiedName name) {
    if ((name == null)) {
      throw new IllegalArgumentException("Qualified name cannot be null");
    }
    return name.toString("::");
  }
}
