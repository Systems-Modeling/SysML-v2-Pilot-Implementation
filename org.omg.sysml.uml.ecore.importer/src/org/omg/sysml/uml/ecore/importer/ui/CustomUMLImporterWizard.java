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

import org.eclipse.emf.converter.ModelConverter;
import org.eclipse.uml2.uml.ecore.importer.ui.UMLImporterWizard;
import org.omg.sysml.uml.ecore.importer.CustomUMLImporter;

public class CustomUMLImporterWizard extends UMLImporterWizard {

	@Override
	protected ModelConverter createModelConverter() {
		return new CustomUMLImporter();
	}
}