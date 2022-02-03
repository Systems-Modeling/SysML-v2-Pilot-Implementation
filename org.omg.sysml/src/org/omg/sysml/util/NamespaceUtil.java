/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022 Model Driven Solutions, Inc.
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
import org.omg.sysml.adapter.NamespaceAdapter;
import org.omg.sysml.lang.sysml.AssignmentActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.PathStepExpression;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.util.SysMLScopeUtil;

public class NamespaceUtil {
	
	private NamespaceUtil() {
	}
	
	// Membership

	public static <M extends Membership, T> Stream<T> getOwnedMembersByMembershipIn(Namespace namespace, Class<M> kind, Class<T> type) {
		return namespace.getOwnedMembership().stream().
				filter(kind::isInstance).
				map(Membership::getOwnedMemberElement).
				filter(type::isInstance).
				map(type::cast);
	}

	public static Membership addOwnedMemberTo(Namespace namespace, Element element) {
		Membership membership = SysMLFactory.eINSTANCE.createMembership();
		membership.setOwnedMemberElement(element);
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

	public static EList<Membership> cacheImportedMembershipOf(Namespace namespace, Supplier<EList<Membership>> supplier) {	
		NamespaceAdapter adapter = (NamespaceAdapter)ElementUtil.getElementAdapter(namespace);
		EList<Membership> membership = adapter.getImportedMembership();
		return membership == null? adapter.setImportedMembership(supplier.get()): membership;
	}
	
	public static Collection<Membership> getNamedMembershipsFor(Import import_) {
		return SysMLScopeUtil.getMembershipsFor(import_, SysMLPackage.eINSTANCE.getImport_ImportOwningNamespace(), 
				import_.getImportedMemberName(), import_.isImportAll());
	}
	
	// Related Namespaces
	
	public static Namespace getParentNamespaceOf(Element element) {
		return element == null? null:
			EcoreUtil2.getContainerOfType(element.eContainer(), Namespace.class);
	}
	
	public static Namespace getNonExpressionNamespaceFor(Element element) {
		if (element == null) {
			return null;
		} else {
			Namespace namespace = getParentNamespaceOf(element);
			while (element instanceof FeatureValue || 
				   namespace instanceof InvocationExpression || 
				   namespace instanceof FeatureReferenceExpression
			) {
				element = namespace.getOwningMembership();
				namespace = getParentNamespaceOf(element);
			}
			return namespace;
		}
	}
	
	private static Namespace getResultNamespaceFor(Expression expression) {
		if (expression instanceof PathStepExpression) {
			EList<Expression> ops = ((PathStepExpression)expression).getOperand();
			if (ops.size() >= 2) {
				Expression op2 = ops.get(1);
				if (op2 instanceof FeatureReferenceExpression) {
					return ((FeatureReferenceExpression)op2).getReferent();
				}
			}
			return null;
		} else {
			ElementUtil.transform(expression);
			return expression.getResult();
		}
	}

	public static Namespace getRelativeNamespaceFor(Namespace ns) {
		if (ns instanceof AssignmentActionUsage) {
			Expression target = ((AssignmentActionUsage) ns).getTargetArgument();
			if (target != null) {
				return getResultNamespaceFor(target);		
			}
		} else if (ns instanceof FeatureReferenceExpression) {
			Element oe = ns.getOwner();
			if (oe instanceof PathStepExpression) {
				EList<Expression> ops = ((PathStepExpression)oe).getOperand();
				if (ops.size() >= 2) {
					Expression op1 = ops.get(0);
					if (op1 != ns) {
						return getResultNamespaceFor(op1);
					}
				}
			}
		}
		return null;
	}
	
}
