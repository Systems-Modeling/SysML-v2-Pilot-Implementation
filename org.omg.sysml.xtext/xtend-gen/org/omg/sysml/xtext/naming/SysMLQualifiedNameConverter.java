/**
 * SysML 2 Pilot Implementation
 *  Copyright (c) 2022 Model Driven Solutions, Inc.
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
package org.omg.sysml.xtext.naming;

import org.eclipse.xtext.naming.QualifiedName;
import org.omg.kerml.xtext.naming.KerMLQualifiedNameConverter;

@SuppressWarnings("all")
public class SysMLQualifiedNameConverter extends KerMLQualifiedNameConverter {
  @Override
  public QualifiedName toQualifiedName(final String qualifiedNameText) {
    QualifiedName _xblockexpression = null;
    {
      String unconjugatedQualifiedNameText = qualifiedNameText;
      final boolean isConjugated = ((qualifiedNameText != null) && qualifiedNameText.startsWith("~"));
      if (isConjugated) {
        unconjugatedQualifiedNameText = unconjugatedQualifiedNameText.substring(1).trim();
      }
      QualifiedName qualifiedName = super.toQualifiedName(unconjugatedQualifiedNameText);
      if (isConjugated) {
        String _lastSegment = qualifiedName.getLastSegment();
        String _plus = ("~" + _lastSegment);
        qualifiedName = qualifiedName.append(_plus);
      }
      _xblockexpression = qualifiedName;
    }
    return _xblockexpression;
  }
}
