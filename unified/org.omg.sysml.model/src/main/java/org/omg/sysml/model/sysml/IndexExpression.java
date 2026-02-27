/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
package org.omg.sysml.model.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>IndexExpression</code> is an <code>OperatorExpression</code> whose operator is <code>"#"</code>, which resolves to the <code>Function</code> <em><code>BasicFunctions::'#'</code></em> from the Kernel Functions Library.</p>
 * arguments->notEmpty() and 
 * not arguments->first().result.specializesFromLibrary('Collections::Array') implies
 *     result.specializes(arguments->first().result)
 * operator = '#'
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getIndexExpression()
 * @model
 * @generated
 */
public interface IndexExpression extends OperatorExpression {
} // IndexExpression
