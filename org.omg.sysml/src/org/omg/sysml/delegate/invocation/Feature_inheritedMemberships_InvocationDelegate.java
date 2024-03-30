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

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Type;

public class Feature_inheritedMemberships_InvocationDelegate extends Type_inheritedMemberships_InvocationDelegate {

	public Feature_inheritedMemberships_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	protected void addInheritedMemberships(Type self, EList<Membership> inheritedMemberships, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		super.addInheritedMemberships(self, inheritedMemberships, excludedNamespaces, excludedTypes, includeProtected);
		EList<FeatureChaining> featureChainings = ((Feature)self).getOwnedFeatureChaining();
		if (!featureChainings.isEmpty()) {
			Feature chainingFeature = featureChainings.get(featureChainings.size()-1).getChainingFeature();
			if (chainingFeature != null && !excludedTypes.contains(chainingFeature)) {
				inheritedMemberships.addAll(Type_visibleMemberships_InvocationDelegate.getNonPrivateMembershipFor(chainingFeature, excludedNamespaces, excludedTypes, includeProtected));
			}
		}
	}

}
