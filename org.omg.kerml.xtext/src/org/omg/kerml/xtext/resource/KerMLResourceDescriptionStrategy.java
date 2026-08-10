/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2026 tkanov
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License, version 2, as published by
 * the Eclipse Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 */

package org.omg.kerml.xtext.resource;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.util.ElementUtil;

import com.google.inject.Inject;

/**
 * A resource description strategy that exports the <code>declaredShortName</code> of a root
 * Element, in addition to the <code>declaredName</code>-based qualified name exported by
 * {@link org.omg.kerml.xtext.naming.KerMLQualifiedNameProvider}.
 *
 * <p>Local (same-resource) name resolution matches both the <code>memberName</code> and the
 * <code>memberShortName</code> of a Membership. Without the additional exported names, the first
 * segment of a cross-resource qualified name could only be resolved by <code>declaredName</code>,
 * so a reference such as <code>P::Foo</code>, where <code>P</code> is the short name of a root
 * Package in another resource, would not resolve.
 *
 * <p>Short names are exported under the qualifier {@link #SHORT_NAME_QUALIFIER}, which keeps them
 * in a separate key space from <code>declaredName</code>-based qualified names. This matters for
 * two reasons. First, a short name can then never displace the <code>declaredName</code> of
 * another root Element in the global index — which would otherwise depend on the order in which
 * resources happen to be indexed, and would break references to, for example, a standard library
 * package whose name a user had chosen as a short name. Second, the qualified names exported for
 * short names have two segments, so they are excluded from the single-segment global scope used for
 * enumeration, and do not appear as duplicate proposals. A short name is resolved explicitly by
 * {@link org.omg.kerml.xtext.scoping.KerMLGlobalScope}, only after a <code>declaredName</code>
 * lookup has failed.
 *
 * <p>Only root Elements are exported this way, because those are the only ones used to resolve the
 * first segment of a cross-resource qualified name. Short names of nested Elements continue to be
 * handled by {@link org.omg.kerml.xtext.scoping.KerMLScope}. Note that this includes root Elements
 * that are not Packages, and root Elements that have a <code>declaredShortName</code> but no
 * <code>declaredName</code>.
 */
public class KerMLResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	/**
	 * The first segment of the qualified name under which the <code>declaredShortName</code> of a
	 * root Element is exported. It is not a legal identifier, so it cannot collide with the first
	 * segment of a qualified name resolved from a model.
	 */
	public static final String SHORT_NAME_QUALIFIER = "<short-name>";

	private static final Logger LOGGER = Logger.getLogger(KerMLResourceDescriptionStrategy.class);

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Override
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		boolean result = super.createEObjectDescriptions(eObject, acceptor);
		try {
			QualifiedName shortQualifiedName = getShortQualifiedName(eObject);
			if (shortQualifiedName != null) {
				acceptor.accept(EObjectDescription.create(shortQualifiedName, eObject));
				result = true;
			}
		} catch (Exception exception) {
			// As in the superclass, a failure for one Element must not fail the whole resource.
			LOGGER.error(exception.getMessage(), exception);
		}
		return result;
	}

	/**
	 * Return the qualified name under which to export the <code>declaredShortName</code> of the
	 * given object, or null if it does not have one, or if it is not a root Element.
	 */
	protected QualifiedName getShortQualifiedName(EObject eObject) {
		if (!(eObject instanceof Element)) {
			return null;
		}
		String shortName = ((Element)eObject).getDeclaredShortName();
		if (shortName == null || shortName.isEmpty()) {
			return null;
		}
		// A root Element is owned by the root Namespace of its resource, which is not, itself,
		// owned by another Namespace.
		Namespace owningNamespace = ((Element)eObject).getOwningNamespace();
		if (owningNamespace == null || owningNamespace.getOwningNamespace() != null) {
			return null;
		}
		QualifiedName shortQualifiedName =
				qualifiedNameConverter.toQualifiedName("'" + ElementUtil.escapeString(shortName) + "'");
		return QualifiedName.create(SHORT_NAME_QUALIFIER).append(shortQualifiedName);
	}

}
