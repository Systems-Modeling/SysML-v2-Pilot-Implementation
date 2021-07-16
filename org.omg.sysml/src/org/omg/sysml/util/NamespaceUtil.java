/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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

import java.util.function.Supplier;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.omg.sysml.adapter.NamespaceAdapter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.PathStepExpression;
import org.omg.sysml.lang.sysml.SysMLFactory;

public class NamespaceUtil {
	
	private NamespaceUtil() {
	}

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
	
	public static Namespace getParentNamespaceOf(Element element) {
		return element == null? null:
			EcoreUtil2.getContainerOfType(element.eContainer(), Namespace.class);
	}
	
	public static Namespace getNonExpressionNamespaceFor(Element element) {
		if (element == null) {
			return null;
		} else {
			Namespace namespace = getParentNamespaceOf(element);
			while (namespace instanceof InvocationExpression || 
				   namespace instanceof FeatureReferenceExpression
			) {
				namespace = getParentNamespaceOf(namespace);
			}
			return namespace;
		}
	}
	
	private static Namespace getFeatureRefNamespaceFor(PathStepExpression pathStep) {
		EList<Expression> ops = pathStep.getOperand();
		if (ops.size() >= 2) {
			Expression op2 = ops.get(1);
			if (op2 instanceof FeatureReferenceExpression) {
				return ((FeatureReferenceExpression)op2).getReferent();
			}
		}
		return null;
	}

	public static Namespace getRelativeNamespaceFor(Namespace ns) {
		Namespace rel = null;
		if (ns instanceof FeatureReferenceExpression) {
			Element oe = ns.getOwner();
			if (oe instanceof PathStepExpression) {
				EList<Expression> ops = ((PathStepExpression)oe).getOperand();
				if (ops.size() >= 2) {
					Expression op1 = ops.get(0);
					if (op1 != ns) {
						if (op1 instanceof PathStepExpression) {
							rel = getFeatureRefNamespaceFor((PathStepExpression)op1);
						} else {
							ElementUtil.transform(op1);
							rel = op1.getResult();
						}
					}
				}
			}
		}
		return rel;
	}
	
}
