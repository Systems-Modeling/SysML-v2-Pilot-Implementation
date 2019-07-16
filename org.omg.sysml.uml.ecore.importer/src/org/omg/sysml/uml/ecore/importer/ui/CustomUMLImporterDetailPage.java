/*
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UMLImporterWizard.java,v 1.4 2007/05/30 20:11:19 khussey Exp $
 */
package org.omg.sysml.uml.ecore.importer.ui;

import org.eclipse.emf.importer.ModelImporter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.uml2.uml.ecore.importer.ui.UMLImporterDetailPage;
import org.eclipse.uml2.uml.util.UMLUtil;

public class CustomUMLImporterDetailPage extends UMLImporterDetailPage {

	public CustomUMLImporterDetailPage(ModelImporter modelImporter, String pageName) {
		super(modelImporter, pageName);
	}

	@Override
	protected void addOptionControl(Composite parent, String text, String option, String[] choices,
			String initialChoice) {
		// default choices customization
		if (UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS.equals(option)) {
			super.addOptionControl(parent, text, option, choices, processChoiceLabel);
		} else if (UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES.equals(option)) {
			super.addOptionControl(parent, text, option, choices, processChoiceLabel);
		} else if (UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES.equals(option)) {
			super.addOptionControl(parent, text, option, choices, processChoiceLabel);
		} else if (UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES.equals(option)) {
			super.addOptionControl(parent, text, option, choices, processChoiceLabel);
		} else if (UMLUtil.UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS.equals(option)) {
			super.addOptionControl(parent, text, option, choices, ignoreChoiceLabel);
		} else if (UMLUtil.UML2EcoreConverter.OPTION__OPERATION_BODIES.equals(option)) {
			super.addOptionControl(parent, text, option, choices, processChoiceLabel);
		} else if (UMLUtil.UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS.equals(option)) {
			super.addOptionControl(parent, text, option, choices, processChoiceLabel);
		} else if (UMLUtil.UML2EcoreConverter.OPTION__CAMEL_CASE_NAMES.equals(option)) {
			super.addOptionControl(parent, text, option, choices, processChoiceLabel);
		} else if (UMLUtil.UML2EcoreConverter.OPTION__OPPOSITE_ROLE_NAMES.equals(option)) {
			super.addOptionControl(parent, text, option, choices, processChoiceLabel);
		} else {
			super.addOptionControl(parent, text, option, choices, initialChoice);
		}
	}

}
