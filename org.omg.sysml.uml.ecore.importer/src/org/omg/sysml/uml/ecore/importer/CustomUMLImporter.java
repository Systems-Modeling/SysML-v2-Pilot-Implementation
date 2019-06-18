/*
 * Copyright (c) 2006, 2018 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 156879, 220552, 226102
 *   Kenn Hussey (CEA) - 327039, 351774, 364419, 366289
 *   Kenn Hussey - 535301
 *
 */
package org.omg.sysml.uml.ecore.importer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.ConverterPlugin;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.importer.ModelImporter;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ecore.importer.UMLImporter;
import org.eclipse.uml2.uml.ecore.importer.UMLImporterPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;

public class CustomUMLImporter extends UMLImporter {

	private static final String SYSML_URI = "http://www.omg.org/spec/SysML/2.0";
	private static final String BASE_PACKAGE = "org.omg.sysml.lang";
	private static final String TYPES_URI = "https://www.omg.org/spec/UML/20161101/PrimitiveTypes";

	/*
	 * MOSTLY FORKED FROM org.eclipse.uml2.uml.ecore.importer.UMLImporter except for
	 * the UML2Ecore transformation
	 * (org.omg.sysml.uml.ecore.importer.CustomUMLImporter.doComputeEPackages().new
	 * UML2EcoreConverter() {...}.() switched with ours)
	 */
	@Override
	protected Diagnostic doComputeEPackages(Monitor monitor) throws Exception {
		Diagnostic diagnostic = Diagnostic.OK_INSTANCE;
		List<URI> locationURIs = getModelLocationURIs();

		if (locationURIs.isEmpty()) {
			diagnostic = new BasicDiagnostic(Diagnostic.ERROR, ConverterPlugin.ID, ConverterUtil.ACTION_DEFAULT,
					UMLImporterPlugin.INSTANCE.getString("_UI_SpecifyAValidUMLModel_message"), null); //$NON-NLS-1$
		} else {
			monitor.beginTask(UML2Util.EMPTY_STRING, 2);
			monitor.subTask(UMLImporterPlugin.INSTANCE.getString("_UI_Loading_message", new Object[] { locationURIs })); //$NON-NLS-1$

			Collection<org.eclipse.uml2.uml.Package> packages = new ArrayList<org.eclipse.uml2.uml.Package>();

			ResourceSet umlResourceSet = createResourceSet();

			for (URI locationURI : locationURIs) {
				packages.addAll(EcoreUtil.<org.eclipse.uml2.uml.Package>getObjectsByType(
						umlResourceSet.getResource(locationURI, true).getContents(), UMLPackage.Literals.PACKAGE));
			}

			EcoreUtil.resolveAll(umlResourceSet);

			monitor.worked(1);

			BasicDiagnostic diagnostics = new BasicDiagnostic(ConverterPlugin.ID, ConverterUtil.ACTION_DEFAULT,
					UMLImporterPlugin.INSTANCE.getString("_UI_ProblemsEncounteredProcessing_message"), //$NON-NLS-1$
					null);

			Map<Object, Object> context = new HashMap<Object, Object>();
			context.put(org.eclipse.uml2.common.util.UML2Util.QualifiedTextProvider.class,
					UMLUtil.QualifiedTextProvider.DEFAULT);

			@SuppressWarnings("unchecked")
			Collection<EPackage> ePackages = (Collection<EPackage>) new CustomUML2EcoreConverter() {

				@Override
				protected void processEcoreTaggedValues(EPackage ePackage, Element element, Map<String, String> options,
						DiagnosticChain diagnostics, Map<Object, Object> context) {

					super.processEcoreTaggedValues(ePackage, element, options, diagnostics, context);

					Stereotype ePackageStereotype = getAppliedEcoreStereotype(element, UMLUtil.STEREOTYPE__E_PACKAGE);

					if (null != ePackageStereotype) {
						ModelImporter.EPackageImportInfo ePackageInfo = getEPackageImportInfo(ePackage);

						if (element.hasValue(ePackageStereotype, UMLUtil.TAG_DEFINITION__BASE_PACKAGE)) {

							StringBuffer basePackage = new StringBuffer();

							for (StringTokenizer stringTokenizer = new StringTokenizer(
									(String) element.getValue(ePackageStereotype, UMLUtil.TAG_DEFINITION__BASE_PACKAGE),
									"."); stringTokenizer //$NON-NLS-1$
											.hasMoreTokens();) {

								basePackage.append(CodeGenUtil.safeName(stringTokenizer.nextToken()));

								if (stringTokenizer.hasMoreTokens()) {
									basePackage.append('.');
								}
							}

							ePackageInfo.setBasePackage(basePackage.toString());
						}

						if (element.hasValue(ePackageStereotype, UMLUtil.TAG_DEFINITION__PREFIX)) {

							ePackageInfo.setPrefix(
									(String) element.getValue(ePackageStereotype, UMLUtil.TAG_DEFINITION__PREFIX));
						}
					}
				}
			}.convert(packages, options, diagnostics, context);

			getEPackages().addAll(ePackages);

			monitor.done();

			if (Diagnostic.INFO < diagnostics.getSeverity()) {
				diagnostic = diagnostics;
			}

			if (Diagnostic.ERROR > diagnostics.getSeverity()) {
				adjustEPackages(monitor);
			}
		}

		return diagnostic;
	}

	@Override
	public void adjustEPackage(Monitor monitor, EPackage ePackage) {
		super.adjustEPackage(monitor, ePackage);
		if ("http://www.eclipse.org/uml2/5.0.0/Types".equals(ePackage.getNsURI())) {
			ePackage.setNsURI(TYPES_URI);
			ePackage.setNsPrefix("primitives");
		}
		ModelImporter.EPackageImportInfo ePackageInfo = getEPackageImportInfo(ePackage);
		if ("sysml.ecore".equals(ePackageInfo.getEcoreFileName())) {
			ePackageInfo.setEcoreFileName("SysML.ecore");
		}
	}

	@Override
	protected void adjustGenModel(Monitor monitor) {
		super.adjustGenModel(monitor);
		GenModel current = getGenModel();

		current.setComplianceLevel(GenJDKLevel.JDK50_LITERAL);
		current.setDynamicTemplates(true);
		current.setTemplateDirectory("/" + getModelPluginID() + "/templates");
		current.setModelDirectory("/" + getModelPluginID() + "/syntax-gen");

		for (GenPackage genPackage : current.getGenPackages()) {
			if (TYPES_URI.equals(genPackage.getEcorePackage().getNsURI())) {
				genPackage.setBasePackage(BASE_PACKAGE);
			} else if (SYSML_URI.equals(genPackage.getEcorePackage().getNsURI())) {
				genPackage.setBasePackage(BASE_PACKAGE);
				genPackage.setPrefix("SysML");
			}
		}
	}

}