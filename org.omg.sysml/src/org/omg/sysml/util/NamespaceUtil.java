/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2024 Model Driven Solutions, Inc.
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

package org.omg.sysml.util;

import java.util.Collection;
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
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
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
	
	public static EList<Membership> getImportedMembershipFor(Namespace namespace, Collection<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeAll) {
		return getNamespaceAdapter(namespace).getImportedMembership(excludedNamespaces, excludedTypes, includeAll);
	}

	public static EList<Membership> getVisibleMembershipsFor(Namespace namespace, Collection<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeAll) {
		return getNamespaceAdapter(namespace).getVisibleMemberships(excludedNamespaces, excludedTypes, includeAll);
	}
	
	// Import

	public static EList<Membership> importMembershipsFor(Import _import, EList<Membership> importedMembership,
			Collection<Membership> nonpublicMembership, Collection<Namespace> excludedNamespaces,
			Collection<Type> excludedTypes) {
		return ((ImportAdapter)ElementUtil.getElementAdapter(_import)).importMemberships(importedMembership, nonpublicMembership, excludedNamespaces, excludedTypes);
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
		return element instanceof FeatureValue && owningNamespace instanceof InvocationExpression?
			owningNamespace: namespace;		
	}
	
	public static Namespace getNonExpressionNamespaceFor(Element element) {
		if (element == null) {
			return null;
		} else {
			Namespace namespace = getExpressionNamespaceOf(element);
			while (element instanceof FeatureValue || 
				   namespace instanceof InvocationExpression || 
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
			EList<Expression> ops = ((FeatureChainExpression)ns).getOperand();
			if (!ops.isEmpty()) {
				return getResultNamespaceFor(ops.get(0));
			}
		}
		return null;
	}
	
}
