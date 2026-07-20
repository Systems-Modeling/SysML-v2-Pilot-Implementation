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
 * SysML Customizations:
 * Copyright (c) 2019-2026 Obeo
 * Copyright (c) 2019-2023 Model Driven Solutions, Inc.
 * 
 * Contributors :
 *   William Piers, Obeo
 *   Ed Seidewitz, MDS
 *   Axel Richard, Obeo
 */
package org.omg.sysml.uml.ecore.importer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.ConverterPlugin;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
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

	private static final String SYSML_URI = "https://www.omg.org/spec/SysML/20250201";
	private static final String BASE_PACKAGE = "org.omg.sysml.lang";
	private static final String MODEL_PLUGIN_ID = "org.omg.sysml.model";
	private static final String TYPES_URI = "https://www.omg.org/spec/UML/20161101/PrimitiveTypes";
	private static final String TYPES_LEGACY_URI = "http://www.eclipse.org/uml2/5.0.0/Types";
	private static final String SETTING_DELEGATES_KEY = "settingDelegates";
	private static final String INVOCATION_DELEGATES_KEY = "invocationDelegates";

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

			replacePrimitiveTypes(ePackages);
			sortEcoreContents(ePackages);
			removePrimitivePackage(ePackages);
			
			for (EPackage ePackage: ePackages) {
				EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
				annotation.setSource(EcorePackage.eNS_URI);
				annotation.getDetails().put(SETTING_DELEGATES_KEY, CustomUML2EcoreConverter.ANNOTATION_SYSML);
				annotation.getDetails().put(INVOCATION_DELEGATES_KEY, CustomUML2EcoreConverter.ANNOTATION_SYSML);
				ePackage.getEAnnotations().add(annotation);
			}

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
		if (TYPES_LEGACY_URI.equals(ePackage.getNsURI())) {
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

		current.setModelPluginID(MODEL_PLUGIN_ID);
		current.setModelDirectory("/" + MODEL_PLUGIN_ID + "/src/main/java");
		current.setUpdateClasspath(false);

		for (GenPackage genPackage : current.getGenPackages()) {
			if (SYSML_URI.equals(genPackage.getEcorePackage().getNsURI())) {
				genPackage.setBasePackage(BASE_PACKAGE);
				genPackage.setPrefix("SysML");
			}
		}
	}

	/**
	 * Rewrites all references to the imported UML primitive-types package so the
	 * generated SysML Ecore uses built-in Ecore datatypes instead of a separate
	 * {@code types.ecore} package.
	 *
	 * <p>
	 * The importer still starts from {@code SysML.uml}. This normalization happens
	 * after UML-to-Ecore conversion, before the imported packages are registered and
	 * before the GenModel is derived.
	 * </p>
	 *
	 * @param ePackages the imported EPackages produced by the UML-to-Ecore
	 *                  conversion
	 */
	private void replacePrimitiveTypes(Collection<EPackage> ePackages) {
		EPackage primitivePackage = findPrimitivePackage(ePackages);
		if (primitivePackage == null) {
			return;
		}

		Map<EClassifier, EClassifier> primitiveMappings = new HashMap<EClassifier, EClassifier>();
		addPrimitiveMapping(primitivePackage, primitiveMappings, "Boolean", EcorePackage.Literals.EBOOLEAN);
		addPrimitiveMapping(primitivePackage, primitiveMappings, "String", EcorePackage.Literals.ESTRING);
		addPrimitiveMapping(primitivePackage, primitiveMappings, "Real", EcorePackage.Literals.EDOUBLE);
		addPrimitiveMapping(primitivePackage, primitiveMappings, "Integer", EcorePackage.Literals.EINT);
		addPrimitiveMapping(primitivePackage, primitiveMappings, "UnlimitedNatural", EcorePackage.Literals.EINT);

		for (EPackage ePackage : ePackages) {
			for (Iterator<EObject> iterator = EcoreUtil.getAllContents(ePackage, true); iterator.hasNext();) {
				EObject eObject = iterator.next();
				if (eObject instanceof ETypedElement) {
					replacePrimitiveType((ETypedElement) eObject, primitiveMappings);
				}
			}
		}
	}

	/**
	 * Replaces the datatype of a typed element when it still points to a classifier
	 * from the imported UML primitive-types package.
	 *
	 * @param typedElement      the typed element to normalize
	 * @param primitiveMappings mapping from imported primitive classifiers to Ecore
	 *                          built-in datatypes
	 */
	private void replacePrimitiveType(ETypedElement typedElement, Map<EClassifier, EClassifier> primitiveMappings) {
		EClassifier mappedType = primitiveMappings.get(typedElement.getEType());
		if (mappedType != null) {
			typedElement.setEType(mappedType);
		}
	}

	/**
	 * Adds one primitive-type mapping when the source classifier exists in the
	 * imported primitive package.
	 *
	 * @param primitivePackage  the imported UML primitive-types package
	 * @param primitiveMappings mapping being populated
	 * @param primitiveName     name of the imported primitive datatype
	 * @param ecoreType         target Ecore built-in datatype
	 */
	private void addPrimitiveMapping(EPackage primitivePackage, Map<EClassifier, EClassifier> primitiveMappings,
			String primitiveName, EClassifier ecoreType) {
		EClassifier primitiveType = primitivePackage.getEClassifier(primitiveName);
		if (primitiveType != null) {
			primitiveMappings.put(primitiveType, ecoreType);
		}
	}

	/**
	 * Sorts imported Ecore contents so the saved metamodel has a stable alphabetical
	 * order for classifiers, structural features, and operations.
	 *
	 * @param ePackages the imported EPackages produced by the UML-to-Ecore
	 *                  conversion
	 */
	private void sortEcoreContents(Collection<EPackage> ePackages) {
		for (EPackage ePackage : ePackages) {
			ECollections.sort(ePackage.getEClassifiers(), namedElementComparator());
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					ECollections.sort(eClass.getEStructuralFeatures(), namedElementComparator());
					ECollections.sort(eClass.getEOperations(), namedElementComparator());
				}
			}
		}
	}

	/**
	 * Returns a comparator that orders named Ecore elements alphabetically and keeps
	 * unnamed elements stable at the end.
	 *
	 * @return comparator for named model elements
	 */
	private <T extends EObject> Comparator<T> namedElementComparator() {
		return Comparator.comparing(this::elementName, Comparator.nullsLast(String::compareTo));
	}

	/**
	 * Returns the logical name of an Ecore element for sorting purposes.
	 *
	 * @param eObject the model element to inspect
	 * @return the element name, or {@code null} if it has no name
	 */
	private String elementName(EObject eObject) {
		if (eObject instanceof EClassifier) {
			return ((EClassifier) eObject).getName();
		}
		if (eObject instanceof org.eclipse.emf.ecore.ENamedElement) {
			return ((org.eclipse.emf.ecore.ENamedElement) eObject).getName();
		}
		return null;
	}

	/**
	 * Removes the imported UML primitive-types package once all references to its
	 * classifiers have been rewritten to Ecore built-in datatypes.
	 *
	 * @param ePackages the imported EPackages produced by the UML-to-Ecore
	 *                  conversion
	 */
	private void removePrimitivePackage(Collection<EPackage> ePackages) {
		EPackage primitivePackage = findPrimitivePackage(ePackages);
		if (primitivePackage != null) {
			ePackages.remove(primitivePackage);
		}
	}

	/**
	 * Finds the imported UML primitive-types package in the converted EPackage set.
	 *
	 * <p>
	 * During import, the package may still have the legacy UML2 namespace URI or
	 * the normalized primitive-types URI, depending on when this method is called.
	 * </p>
	 *
	 * @param ePackages the imported EPackages produced by the UML-to-Ecore
	 *                  conversion
	 * @return the imported primitive package, or {@code null} if it is not present
	 */
	private EPackage findPrimitivePackage(Collection<EPackage> ePackages) {
		for (EPackage ePackage : ePackages) {
			if (TYPES_LEGACY_URI.equals(ePackage.getNsURI()) || TYPES_URI.equals(ePackage.getNsURI())
					|| "Types".equals(ePackage.getName())) {
				return ePackage;
			}
		}
		return null;
	}

}
