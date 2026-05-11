/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2025 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.util;

import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.omg.sysml.adapter.ImportAdapter;
import org.omg.sysml.adapter.NamespaceAdapter;
import org.omg.sysml.lang.sysml.AssignmentActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.InstantiationExpression;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.lang.sysml.util.SysMLScopeUtil;

public class NamespaceUtil {
	
	private NamespaceUtil() {
	}
	
	public static NamespaceAdapter getNamespaceAdapter(Namespace namespace) {
		return (NamespaceAdapter)ElementUtil.getElementAdapter(namespace);
	}
	
	// Membership
	
	public static void addAdditionalMembersTo(Namespace namespace) {
		getNamespaceAdapter(namespace).addAdditionalMembers();
	}
	
	public static Stream<Element> getOwnedMembersOf(Namespace namespace) {
		return namespace.getOwnedMembership().stream().
			filter(OwningMembership.class::isInstance).
			map(Membership::getMemberElement).
			filter(m->m != null);
	}

	public static <M extends OwningMembership, T> Stream<T> getOwnedMembersByMembershipIn(Namespace namespace, Class<M> kind, Class<T> type) {
		return namespace.getOwnedMembership().stream().
				filter(kind::isInstance).
				map(Membership::getMemberElement).
				filter(type::isInstance).
				map(type::cast);
	}

	public static OwningMembership addOwnedMemberTo(Namespace namespace, Element element) {
		OwningMembership membership = SysMLFactory.eINSTANCE.createOwningMembership();
		membership.setOwnedMemberElement(element);
		namespace.getOwnedRelationship().add(membership);
		return membership;
	}

	public static Membership addMemberTo(Namespace namespace, Element element) {
		Membership membership = SysMLFactory.eINSTANCE.createMembership();
		membership.setMemberElement(element);
		namespace.getOwnedRelationship().add(membership);
		return membership;
	}

	public static <M extends Membership, T> Stream<T> getMembersByMembershipIn(Namespace namespace, Class<M> kind, Class<T> type) {
		return namespace.getMembership().stream().
				filter(kind::isInstance).
				map(Membership::getMemberElement).
				filter(type::isInstance).
				map(type::cast);
	}

	public static Membership getNamedMembershipFor(Namespace namespace, String name) {
		return (Membership)SysMLScopeUtil.getElementFor(namespace, SysMLPackage.eINSTANCE.getNamespace_Membership(), name);
	}
	
	public static EList<Membership> cacheImportedMembershipOf(Namespace namespace, Supplier<EList<Membership>> supplier) {	
		NamespaceAdapter adapter = (NamespaceAdapter)ElementUtil.getElementAdapter(namespace);
		EList<Membership> membership = adapter.getImportedMembership();
		return membership == null? adapter.setImportedMembership(supplier.get()): membership;
	}
	
	public static EList<Membership> getMembershipsOfVisibilityFor(Namespace namespace, VisibilityKind visibility, Set<Namespace> excluded) {
		return getNamespaceAdapter(namespace).getMembershipsOfVisibility(visibility, excluded);
	}
	
	public static EList<Membership> getImportedMembershipFor(Namespace namespace, Set<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, boolean includeAll) {
		return getNamespaceAdapter(namespace).getImportedMembership(excludedNamespaces, includeAll);
	}

	public static EList<Membership> getVisibleMembershipsFor(Namespace namespace, Set<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, boolean isRecursive, boolean includeAll) {
		return getNamespaceAdapter(namespace).getVisibleMemberships(excludedNamespaces, isRecursive, includeAll);
	}
	
	// Import

	public static void importMembershipsFor(Import _import, EList<Membership> importedMembership, Set<Namespace> excludedNamespaces) {
		((ImportAdapter)ElementUtil.getElementAdapter(_import)).importMemberships(importedMembership, excludedNamespaces);
	}

	// Related Namespaces
	
	public static Namespace getParentNamespaceOf(Element element) {
		return element == null? null:
			EcoreUtil2.getContainerOfType(element.eContainer(), Namespace.class);
	}
	
	public static Namespace getExpressionNamespaceOf(Element element) {
		Namespace namespace = getParentNamespaceOf(element);
		Namespace owningNamespace = namespace.getOwningNamespace();
		if (!(element instanceof Relationship)) {
			element = element.getOwningMembership();
		}
		return element instanceof FeatureValue && owningNamespace instanceof InstantiationExpression?
			owningNamespace: namespace;		
	}
	
	public static Namespace getNonExpressionNamespaceFor(Element element) {
		if (element == null) {
			return null;
		} else {
			Namespace namespace = getExpressionNamespaceOf(element);
			while (element instanceof FeatureValue || 
				   namespace instanceof InstantiationExpression || 
				   namespace instanceof FeatureReferenceExpression
			) {
				element = namespace.getOwningMembership();
				namespace = getExpressionNamespaceOf(element);
			}
			return namespace;
		}
	}
	
	private static Namespace getResultNamespaceFor(Expression expression) {
//		if (expression instanceof FeatureChainExpression) {
//			return ((FeatureChainExpression)expression).getTargetFeature();
//		} else {
			ElementUtil.transform(expression);
			return expression.getResult();
//		}
	}

	public static Namespace getRelativeNamespaceFor(Namespace ns) {
		if (ns instanceof AssignmentActionUsage) {
			Expression target = ((AssignmentActionUsage) ns).getTargetArgument();
			if (target != null) {
				return getResultNamespaceFor(target);		
			}
		} else if (ns instanceof FeatureChainExpression) {
			EList<Expression> ops = ((FeatureChainExpression)ns).getArgument();
			if (!ops.isEmpty()) {
				return getResultNamespaceFor(ops.get(0));
			}
		}
		return null;
	}
	
}
