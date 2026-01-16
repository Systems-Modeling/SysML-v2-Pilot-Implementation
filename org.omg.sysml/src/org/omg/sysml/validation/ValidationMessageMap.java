/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
 *******************************************************************************/

package org.omg.sysml.validation;

/**
 * Interface for mapping validation message codes and diagnostic codes to full messages,
 * and mapping message cods to diagnostic codes.
 */
public interface ValidationMessageMap {
	
	String getMessage(String messageCode);
	String getMessage(int diagnosticCode);
	int getDiagnosticCode(String messageCode);
	
	/**
	 * Get the message with the indicated message code, and then substitute data
	 * values for template parameters in the message of the form "$n", sequentially
	 * from n starting at 0.
	 */
	default String getMessage(String messageCode, String... data) {
		String msg = getMessage(messageCode);
		if (msg != null) {
			for (int i = 0; i < data.length; i++) {
				msg.replace("$" + i, data[i]);
			}
		}
		return msg;
	}
	
}
