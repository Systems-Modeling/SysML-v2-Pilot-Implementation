/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.omg.sysml.logic;

import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.TextualRepresentation;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;
import org.omg.sysml.util.ElementUtil;

/**
 * Normalizes lexical values produced by parsing SysML text.
 */
public class LexicalNormalizationService extends SysMLSwitch<Boolean> {

	private static final Boolean STOP_SUPERTYPE_PROCESSING = Boolean.TRUE;

	/**
	 * Normalizes the lexical values of one element.
	 *
	 * @param element
	 *            the element to normalize
	 */
	public void normalize(Element element) {
		if (element != null) {
			doSwitch(element);
		}
	}

	@Override
	public Boolean caseElement(Element object) {
		// Source: org.omg.sysml.adapter.ElementAdapter#postProcess().
		// Normalize the names common to every element reached through the adapter hierarchy.
		object.setDeclaredName(ElementUtil.unescapeString(object.getDeclaredName()));
		object.setDeclaredShortName(ElementUtil.unescapeString(object.getDeclaredShortName()));
		// ElementAdapter is the root of the post-processing hierarchy.
		return STOP_SUPERTYPE_PROCESSING;
	}

	@Override
	public Boolean caseMembership(Membership object) {
		// Source: org.omg.sysml.adapter.MembershipAdapter#postProcess().
		// Owning memberships derive their member names and therefore have no lexical names to normalize.
		if (!(object instanceof OwningMembership)) {
			object.setMemberName(ElementUtil.unescapeString(object.getMemberName()));
			object.setMemberShortName(ElementUtil.unescapeString(object.getMemberShortName()));
		}
		// MembershipAdapter calls ElementAdapter.postProcess().
		return null;
	}

	@Override
	public Boolean caseComment(Comment object) {
		// Source: org.omg.sysml.adapter.CommentAdapter#postProcess().
		// Normalize the optional locale and remove the concrete comment delimiters and indentation.
		object.setLocale(ElementUtil.unescapeString(object.getLocale()));
		object.setBody(ElementUtil.processCommentBody(object.getBody()));
		// CommentAdapter calls its super adapter, which ultimately calls ElementAdapter.
		return null;
	}

	@Override
	public Boolean caseTextualRepresentation(TextualRepresentation object) {
		// Source: org.omg.sysml.adapter.TextualRepresentationAdapter#postProcess().
		// Normalize the language and process the textual body like a comment body.
		object.setLanguage(ElementUtil.unescapeString(object.getLanguage()));
		object.setBody(ElementUtil.processCommentBody(object.getBody()));
		// TextualRepresentationAdapter calls its super adapter, which ultimately calls ElementAdapter.
		return null;
	}

	@Override
	public Boolean caseLiteralString(LiteralString object) {
		// Source: org.omg.sysml.adapter.LiteralStringAdapter#postProcess().
		// Convert the parsed string literal to its unescaped semantic value.
		object.setValue(ElementUtil.unescapeString(object.getValue()));
		// LiteralStringAdapter calls its super adapter, which ultimately calls ElementAdapter.
		return null;
	}
}
