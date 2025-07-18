/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019, 2020 Model Driven Solutions, Inc.
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
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/
package org.omg.sysml.xtext.util;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.validation.Issue;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.util.SysMLUtil;

public class SysMLParseResult {
	
	private Element rootElement = null;
	private List<Issue> issues = null;
	private Exception exception = null;
	
	public SysMLParseResult(Element rootElement, List<Issue> issues) {
		this.rootElement = rootElement;
		this.issues = issues;
	}
	
	public SysMLParseResult(Exception exception) {
		this.exception = exception;
	}
	
	public Element getRootElement() {
		return this.rootElement;
	}
	
	public List<Issue> getIssues() {
		return this.issues == null? Collections.emptyList(): this.issues;
	}
	
	public List<Issue> getSyntaxErrors() {
		return this.getIssues().stream().filter(Issue::isSyntaxError).collect(Collectors.toList());
	}
	
	public List<Issue> getSemanticErrors() {
		return this.getIssues().stream().
				filter(issue->!issue.isSyntaxError() && issue.getSeverity() == Severity.ERROR).
				collect(Collectors.toList());
	}
	
	public List<Issue> getWarnings() {
		return this.getIssues().stream().
				filter(issue->issue.getSeverity().equals(Severity.WARNING)).
				collect(Collectors.toList());
	}
	
	public boolean hasErrors() {
		return this.getIssues().stream().anyMatch(issue->issue.getSeverity() == Severity.ERROR);
	}
	
	public boolean hasWarnings() {
		return this.getIssues().stream().anyMatch(issue->issue.getSeverity() == Severity.WARNING);
	}
	
	public Exception getException() {
		return this.exception;
	}
	
	public String formatRootElement() {
		Element rootElement = this.getRootElement();
		return rootElement == null? "":
			!(rootElement instanceof Namespace) || rootElement.getOwner() != null? 
					SysMLUtil.formatElement(rootElement):
		    ((Namespace)rootElement).getOwnedMember().stream().
				map(SysMLUtil::formatElement).
				collect(Collectors.joining());
	}
	
	public String formatIssues() {
		return SysMLUtil.formatList(this.issues);
	}
	
	public String formatException() {
		return SysMLUtil.formatException(this.exception);
	}
	
	@Override
	public String toString() {
		if (this.exception != null) {
			return this.formatException();
		} else {
			List<Issue> syntaxErrors = this.getSyntaxErrors();
			if (!syntaxErrors.isEmpty()) {
				return SysMLUtil.formatList(syntaxErrors);
			} else {
				List<Issue> semanticErrors = this.getSemanticErrors();
				List<Issue> warnings = this.getWarnings();
				String msgs = SysMLUtil.formatList(semanticErrors) + SysMLUtil.formatList(warnings);
				return semanticErrors.isEmpty()? msgs + this.formatRootElement(): msgs;
			}
		}
	}

}
