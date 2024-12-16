package org.omg.sysml.semantics.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.NamespaceUtil;

@RunWith(Parameterized.class)
public class SysMLSpecializationTest {
	/**
	 * Test cases for the Parameterized tests<br>
	 * Columns in order: 
	 * <ol>
	 * <li>Semantic constraint name: (for debugging purposes)</li>
	 * <li>EClass of the element: test creates the element of this type, element is tested for specializations</li>
	 * <li>Library type: expected specialized library type after the transformation</li>
	 * <li>EClass of owning namespace: type of the owning namespace for the element which is tested</li>
	 * <li>EClass of membership: controls which membership type to use when adding the element to the owning namespace</li>
	 * </ol>
	 * 
	 */
	private static final String TEST_CASES_CSV = "sysml-simple-specializations.csv";
	
	/**
	 * System property for the library path. Required for Maven build.
	 */
	private final static String SYSML_LIBRARY_PATH_KEY = "libraryPath";
	
	
	/**
	 * Library path relative to this eclipse project. Direct JUnit runs.
	 */
	private static final String PROJECT_RELATIVE_LIBRARY_PARHT = "../sysml.library";
	
	public static String getLibraryPath() {
		var sysprop = System.getProperty(SYSML_LIBRARY_PATH_KEY);
		return sysprop == null?  getAbsoluteLibraryPath() : sysprop;
	}
	
	private static String getAbsoluteLibraryPath() {
		//convert relative path to absolute path
		return new File(PROJECT_RELATIVE_LIBRARY_PARHT).getAbsolutePath();
	}
	
	//parameters for the parameterized test
	
	@Parameter(0)
	public String semanticConstraint;
	
	@Parameter(1)
	public String eClassName;
	
	@Parameter(2)
	public String libraryType;
	
	@Parameter(3)
	public String owningNamespaceType;
	
	@Parameter(4)
	public String membershipType;
	
	//reading the parameters from the .csv and binding them to Parameter fields
	
	@Parameters(name = "Semantic constraint: {0}, Owner: {3}, EClass: {1}, Expected library type: {2}")
	public static Collection<Object[]> getParameters() throws IOException{
		List<Object[]> parametersForTestCases = new LinkedList<>();
		
		InputStream csvStream = SysMLSpecializationTest.class.getResourceAsStream(TEST_CASES_CSV);
		
		try (Scanner scanner = new Scanner(csvStream)){
			scanner.forEachRemaining(line -> {
				Object[] parameters = line.split(",");
				parametersForTestCases.add(parameters);
			});
		}
		
		return parametersForTestCases;
	}
	
	//test setup
	
	private static SysMLInteractive interactive;
	private Resource resource;
	
	@BeforeClass
	public static void setupLibrary() {
		//setup infrastructure and read library
		if (interactive == null) {
			interactive = SysMLInteractive.getInstance();
			interactive.loadLibrary(getLibraryPath());
		}
	}
	
	@Before
	public void createResource() {
		//create empty Resource for each test case
		resource = interactive.createResource("test.sysml");
	}
	
	@After
	public void removeResource() throws IOException {
		//remove Resource after test case
		try {
			resource.delete(Collections.EMPTY_MAP);
		} finally {
			resource = null;	
		}
	}
	
	@Test
	public void checkSpecialization() {
		//create and add root package
		org.omg.sysml.lang.sysml.Package root = SysMLFactory.eINSTANCE.createPackage();
		resource.getContents().add(root);
		
		//check if library element exists
		Element libraryElement = SysMLLibraryUtil.getLibraryElement(root, libraryType);
		assertNotNull(libraryElement);
		
		//create owning namespace
		EClassifier ownerEClass = SysMLPackage.eINSTANCE.getEClassifier(owningNamespaceType);
		Namespace owner = (Namespace) SysMLFactory.eINSTANCE.create((EClass) ownerEClass);
		NamespaceUtil.addOwnedMemberTo(root, owner);
		
		//create element
		EClassifier eClass = SysMLPackage.eINSTANCE.getEClassifier(eClassName);
		Type element = (Type) SysMLFactory.eINSTANCE.create((EClass) eClass);
		
		//set usages to non-referential
		if (element instanceof Usage usage) {
			usage.setIsReference(false);
			usage.isComposite();
		}
		
		//use a specific membership to add the element to the owning namespace
		EClassifier memberhipEClass = SysMLPackage.eINSTANCE.getEClassifier(membershipType);
		Membership membership = (Membership) SysMLFactory.eINSTANCE.create((EClass) memberhipEClass);
		owner.getOwnedRelationship().add(membership);
		membership.setMemberElement(element);
		
		//run transformation, add implicit elements
		ElementUtil.transformAll(root, true);
		
		assertTrue("Speacializes instead: " + getSpecifics(element), specializes(element, libraryType));
	}
	
	//utility methods
	
	public static boolean specializes(Type element, String general) {
		assert element != null;
		assert general != null;
		
		return element.getOwnedSpecialization().stream()
			.map(Specialization::getGeneral)
			.map(Type::getQualifiedName)
			.anyMatch(general::equals);
	}
	
	public static String getSpecifics(Type element) {
		
		assert element != null;
		
		return element.getOwnedSpecialization().stream()
			.map(Specialization::getGeneral)
			.map(Type::getQualifiedName)
			.collect(Collectors.joining(", "));
	}
}
