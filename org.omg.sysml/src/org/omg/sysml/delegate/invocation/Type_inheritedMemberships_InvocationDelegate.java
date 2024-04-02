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
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class Type_inheritedMemberships_InvocationDelegate extends BasicInvocationDelegate {

	public Type_inheritedMemberships_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		Type self = (Type) target;
		@SuppressWarnings("unchecked")
		EList<Type> excluded = (EList<Type>) arguments.get(0);
				
		return getInheritedMembership(self, new HashSet<Namespace>(), new HashSet<>(excluded), true);
	}

	protected EList<Membership> getInheritedMembership(Type self, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		EList<Membership> inheritedMemberships = new BasicInternalEList<Membership>(Membership.class);
		addInheritedMemberships(self, inheritedMemberships, excludedNamespaces, excludedTypes, includeProtected);
		removeRedefinedFeatures(inheritedMemberships, self);
		return inheritedMemberships;
	}
	
	protected void addInheritedMemberships(Type self, EList<Membership> inheritedMemberships, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		excludedTypes.add(self);
		Conjugation conjugator = self.getOwnedConjugator();
		if (conjugator != null) {
			Type originalType = conjugator.getOriginalType();
			if (originalType != null && !excludedTypes.contains(originalType)) {
				inheritedMemberships.addAll(getMembership(originalType, excludedNamespaces, excludedTypes, includeProtected));
			}
		}
		for (Type general: TypeUtil.getGeneralTypesOf(self)) {
			if (general != null && !excludedTypes.contains(general)) {
				inheritedMemberships.addAll(Type_visibleMemberships_InvocationDelegate.getNonPrivateMembershipFor(general, excludedNamespaces, excludedTypes, includeProtected));
			}
		}
	}
	
	protected EList<Membership> getMembership(Type self, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		EList<Membership> membership = new BasicInternalEList<>(Membership.class);
		membership.addAll(self.getOwnedMembership());
		membership.addAll(getInheritedMembership(self, excludedNamespaces, excludedTypes, includeProtected));
		membership.addAll(Namespace_importedMemberships_InvocationDelegate.getImportedMembershipFor(self, excludedNamespaces, excludedTypes, false));
		return membership;
	}	
	
	protected void removeRedefinedFeatures(Collection<Membership> memberships, Type type) {
		Collection<Feature> redefinedFeatures = getFeaturesRedefinedByType(type);
		memberships.removeIf(membership->{
			Element memberElement = membership.getMemberElement();
			return memberElement instanceof Feature &&
				   FeatureUtil.getAllRedefinedFeaturesOf((Feature)memberElement).stream().
				   		anyMatch(redefinedFeatures::contains);
		});		
	}

	// Overridden in Expression_inheritedMemberships_InvocationDelegate
	protected Collection<Feature> getFeaturesRedefinedByType(Type type) {
		return type.getOwnedFeature().stream().
				flatMap(feature->FeatureUtil.getAllRedefinedFeaturesOf(feature).stream()).
				collect(Collectors.toSet());
	}
	
	public static EList<Membership> getInheritedMembershipFor(Type type, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		Type_inheritedMemberships_InvocationDelegate inheritedMembershipsDelegate = (Type_inheritedMemberships_InvocationDelegate) 
				OperationInvocationDelegateFactory.getInvocationDelegate(type.eClass(), SysMLPackage.eINSTANCE.getType__InheritedMemberships__EList());
		return inheritedMembershipsDelegate.getInheritedMembership(type, excludedNamespaces, excludedTypes, includeProtected);
	}

}
