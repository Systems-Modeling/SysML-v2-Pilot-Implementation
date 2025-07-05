/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024, 2025 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.IndexExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TypeUtil;

public class IndexExpressionAdapter extends OperatorExpressionAdapter {

	public static final String COLLECTIONS_TYPE = "Collections::Collection";

	public IndexExpressionAdapter(IndexExpression element) {
		super(element);
	}
	
	@Override
	public IndexExpression getTarget() {
		return (IndexExpression)super.getTarget();
	}
	
	/**
	 * @satisfies checkIndexExpressionResultSpecialization
	 */
	@Override
	protected void addResultTyping() {
		IndexExpression target = getTarget();
		EList<Expression> arguments = target.getArgument();
		if (!arguments.isEmpty()) {
			Expression seqArgument = arguments.get(0);
			ElementUtil.transform(seqArgument);
			Feature seqResult = seqArgument.getResult();
			Type collectionType = getLibraryType(COLLECTIONS_TYPE);
			/*
			 * TODO: Update checkIndexExpressionResultSpecialization
			 * 
			 * OCL currently only checks for Array type, not any Collection type.
			 * See KERML11-69
 			 */
			if (!TypeUtil.specializes(seqResult, collectionType)) {
				Feature resultFeature = target.getResult();
				if (resultFeature != null && seqResult != null) {
					TypeUtil.addImplicitGeneralTypeTo(resultFeature, SysMLPackage.eINSTANCE.getSubsetting(), seqResult);
				}
			}
		}
	}
	
}
