package org.omg.sysml.uml.ecore.importer.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.junit.Before;
import org.junit.Test;
import org.omg.sysml.uml.ecore.importer.CustomUMLImporter;

/**
 * A test allowing to check the additions made for ST6RI-61 to support composite
 * properties.
 * 
 * @author wpiers
 *
 */
public class UML2EcoreTest {

	private static final String INPUT = "data/input/SysML.uml";
	private static final String EXPECTED = "data/expected/SysML_from_tests_after_ST6RI-61.ecore";
	private static final String OUTPUT = "data/output/SysML.ecore";

	private ResourceSet resourceSet;

	@SuppressWarnings("restriction")
	@Before
	public void init() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uml", new UMLResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet = new ResourceSetImpl();
	}

	@Test
	public void convertUML2Ecore() throws Exception {

		// init importer
		CustomUMLImporter importer = new CustomUMLImporter();
		importer.setModelLocation(new File(INPUT).toString());

		// set options
		importer.getOptions().put(UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS, UMLUtil.OPTION__PROCESS);
		importer.getOptions().put(UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES, UMLUtil.OPTION__PROCESS);
		importer.getOptions().put(UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES, UMLUtil.OPTION__PROCESS);
		importer.getOptions().put(UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES, UMLUtil.OPTION__PROCESS);
		importer.getOptions().put(UMLUtil.UML2EcoreConverter.OPTION__OPERATION_BODIES, UMLUtil.OPTION__PROCESS);
		importer.getOptions().put(UMLUtil.UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS,
				UMLUtil.OPTION__PROCESS);
		importer.getOptions().put(UMLUtil.UML2EcoreConverter.OPTION__CAMEL_CASE_NAMES, UMLUtil.OPTION__PROCESS);
		importer.getOptions().put(UMLUtil.UML2EcoreConverter.OPTION__OPPOSITE_ROLE_NAMES, UMLUtil.OPTION__PROCESS);
		importer.getOptions().put(UMLUtil.UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS, UMLUtil.OPTION__IGNORE);

		// convert
		importer.computeEPackages(new BasicMonitor());

		// save result
		Resource ecoreResource = resourceSet.createResource(URI.createFileURI(OUTPUT));
		ecoreResource.getContents().addAll(importer.getEPackages());
		Map<String, String> options = new HashMap<String, String>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		ecoreResource.save(options);

		formatOutput();
		
		// compare with expected
		assertEquals(FileUtils.readFileToString(new File(EXPECTED), "utf-8"),
				FileUtils.readFileToString(new File(OUTPUT), "utf-8"));
	}

	private void formatOutput() throws IOException {
		Path path = Paths.get(OUTPUT);
        Stream <String> lines = Files.lines(path);
        List <String> replaced = lines.map(line -> line.replaceAll(OUTPUT, "")).collect(Collectors.toList());
        Files.write(path, replaced);
        lines.close();
	}

}
