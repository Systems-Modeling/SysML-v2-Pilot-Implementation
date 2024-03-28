/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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

package org.omg.sysml.delegate.invocation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;

public class Feature_typingFeatures_InvocationDelegate extends BasicInvocationDelegate {

	public Feature_typingFeatures_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		Feature self = (Feature) target;

		EList<Feature> typingFeatures = new BasicEList<>();
		if (!self.isConjugated()) {
			// NOTE: Only considers owned Subsettings.
			FeatureUtil.getSubsettedFeaturesOf(self).stream().
				forEachOrdered(typingFeatures::add);
			EList<Feature> chainingFeatures = self.getChainingFeature();
			if (!chainingFeatures.isEmpty()) {
				Feature lastChainingFeature = chainingFeatures.get(chainingFeatures.size() - 1);
				if (!typingFeatures.contains(lastChainingFeature)) {
					typingFeatures.add(lastChainingFeature);
				}
			}
		} else {
			// NOTE: Only considers owned Conjugation.
			Conjugation conjugator = self.getOwnedConjugator();
			if (conjugator != null) {
				Type originalType = conjugator.getOriginalType();
				if (originalType instanceof Feature) {
					typingFeatures.add((Feature)originalType);
				}
			}
		}
		return typingFeatures;
	}

}
