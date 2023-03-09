/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2023 Model Driven Solutions, Inc.
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
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.ui;

import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

class KerMLAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	protected override calculateId(String tokenName, int tokenType) {
		if("RULE_STRING_VALUE".equals(tokenName))
			HighlightingStyles.STRING_ID
		else if ("RULE_DECIMAL_VALUE".equals(tokenName) || "RULE_EXP_VALUE".equals(tokenName))
			HighlightingStyles.NUMBER_ID
		else if("RULE_ML_NOTE".equals(tokenName) || "RULE_SL_NOTE".equals(tokenName))
			HighlightingStyles.COMMENT_ID
		else
			super.calculateId(tokenName, tokenType);
	}

}
