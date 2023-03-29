/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2023 Model Driven Solutions, Inc.
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

package org.omg.sysml.expressions.functions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.expressions.util.EvaluationUtil;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.TypeUtil;

public class IndexFunction extends BaseFunction {

	@Override
	public String getOperatorName() {
		return "'#'";
	}
	
	protected boolean isArray(InvocationExpression invocation, EList<Element> seq) {
		Type orderedCollectionType = ExpressionUtil.getArrayDataType(invocation);
		return seq.size() == 1 && seq.get(0) instanceof Type && 
			   TypeUtil.conforms((Type)seq.get(0), orderedCollectionType);
	}
	
	protected EList<Element> indexArray(InvocationExpression invocation, Feature array, EList<Element> indexes, ModelLevelExpressionEvaluator evaluator) {
		List<Feature> dimensionsChain = new ArrayList<>();
		dimensionsChain.add(array);
		dimensionsChain.add(ExpressionUtil.getArrayDimensionsFeature(invocation));
		EList<Element> dimensions = evaluator.evaluateFeatureChain(dimensionsChain, array);
		int n = dimensions.size();
		if (indexes.size() != n) {
			return EvaluationUtil.singletonList(invocation);
		} else {
			int flatIndex = 1;
			if (n != 0) {
				for (int i = 0; i < n; i++) {
					Element dimension = dimensions.get(i);
					Element index = indexes.get(i);
					if (!(dimension instanceof LiteralInteger && index instanceof LiteralInteger)) {
						return EvaluationUtil.singletonList(invocation);
					} else {
						int dim = ((LiteralInteger)dimension).getValue();
						int idx = ((LiteralInteger)index).getValue();
						if (idx > dim) {
							return EvaluationUtil.singletonList(invocation);
						} else {
							flatIndex = dim * (flatIndex - 1) + idx;
						}
					}
				}
			}
			return indexCollection(invocation, array, flatIndex, evaluator);
		}
	}
	
	protected boolean isOrderedCollection(InvocationExpression invocation, EList<Element> seq) {
		Type orderedCollectionType = ExpressionUtil.getOrderedCollectionDataType(invocation);
		return seq.size() == 1 && seq.get(0) instanceof Type && 
			   TypeUtil.conforms((Type)seq.get(0), orderedCollectionType);
	}
	
	protected EList<Element> indexCollection(InvocationExpression invocation, Feature collection, int index, ModelLevelExpressionEvaluator evaluator) {
		List<Feature> elementsChain = new ArrayList<>();
		elementsChain.add(collection);
		elementsChain.add(ExpressionUtil.getCollectionElementsFeature(collection));
		EList<Element> elements = evaluator.evaluateFeatureChain(elementsChain, collection);
		return elements == null? EvaluationUtil.singletonList(invocation): 
			   indexSequence(elements, index);
	}
	
	protected EList<Element> indexSequence(EList<Element> seq, int index) {
		return index < 1 || index > seq.size()? EvaluationUtil.nullList():
			   EvaluationUtil.singletonList(seq.get(index - 1));
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ModelLevelExpressionEvaluator evaluator) {
		EList<Element> seq = evaluator.evaluateArgument(invocation, 0, target);
		EList<Element> indexes = evaluator.evaluateArgument(invocation, 1, target);
		if (seq != null && indexes != null) {
			if (isArray(invocation, seq)) {
				return indexArray(invocation, (Feature)seq.get(0), indexes, evaluator);
			} else if (indexes.size() == 1 && indexes.get(0) instanceof LiteralInteger) {
				int index = ((LiteralInteger)indexes.get(0)).getValue();
				if (isOrderedCollection(invocation, seq)) {
					return indexCollection(invocation, (Feature)seq.get(0), index, evaluator);
				} else {
					return indexSequence(seq, index);
				}
			}
		}
		return EvaluationUtil.singletonList(invocation);
	}

}
