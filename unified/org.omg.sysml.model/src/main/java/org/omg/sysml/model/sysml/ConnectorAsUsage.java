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
 * A representation of the model object '<em><b>Connector As Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ConnectorAsUsage</code> is both a <code>Connector</code> and a <code>Usage</code>. <code>ConnectorAsUsage</code> cannot itself be instantiated in a SysML model, but it is a base class for the concrete classes <code>BindingConnectorAsUsage</code>, <code>SuccessionAsUsage</code>, <code>ConnectionUsage</code> and <code>FlowConnectionUsage</code>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getConnectorAsUsage()
 * @model abstract="true"
 * @generated
 */
public interface ConnectorAsUsage extends Usage, Connector {
} // ConnectorAsUsage
