package org.omg.sysml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.xtext.util.SysMLAccess;
import org.omg.sysml.xtext.util.SysMLParseResult;

public class SysMLAccessTest {
	
	private final static String SYSML_LIBRARY_PATH_KEY = "libraryPath";
	
	public String getLibraryPath() {
		return System.getProperty(SYSML_LIBRARY_PATH_KEY);
	}
	
	@Test
	public void testReadLibrary() throws IOException {
		SysMLAccess sysmlAccess = SysMLAccess.createFullyFeatured(getLibraryPath());
		sysmlAccess.setVerbose(false);
		sysmlAccess.loadLibrary();
		Set<Resource> libraryResources = sysmlAccess.getLibraryResources();
		assertTrue("Libray was not loaded", !libraryResources.isEmpty());
	}
	
	@Test
	public void testResolution() throws IOException {
		SysMLAccess sysmlAccess = SysMLAccess.createFullyFeatured(getLibraryPath());
		sysmlAccess.setVerbose(false);
		sysmlAccess.loadLibrary();
		
		Element element = sysmlAccess.resolve("$::Parts::parts");
		assertNotNull(element);
		assertEquals("Parts::parts", element.getQualifiedName());
	}
	
	@Test
	public void testParsing() throws IOException {
		SysMLAccess sysmlAccess = SysMLAccess.createFullyFeatured(getLibraryPath());
		sysmlAccess.setVerbose(false);
		sysmlAccess.loadLibrary();
		
		SysMLParseResult result = sysmlAccess.parse("myres.sysml", "package P { part b; }");
		assertTrue(result.getIssues().isEmpty());
	}
	
	@Test
	public void testParsingWithError() throws IOException {
		SysMLAccess sysmlAccess = SysMLAccess.createFullyFeatured(getLibraryPath());
		sysmlAccess.setVerbose(false);
		sysmlAccess.loadLibrary();
		
		SysMLParseResult result = sysmlAccess.parse("myres.sysml", "package P { part b; ");
		assertFalse(result.getSyntaxErrors().isEmpty());
	}
	
	@Test
	public void testParseFile() throws IOException, URISyntaxException {
		SysMLAccess sysmlAccess = SysMLAccess.createFullyFeatured(getLibraryPath());
		sysmlAccess.setVerbose(false);
		sysmlAccess.loadLibrary();
		
		URL testFileURL = getClass().getResource("parseTest.sysml");
		File testFile = new File(testFileURL.toURI());
		List<SysMLParseResult> results = sysmlAccess.parseFiles(testFile, true);
		
		assertTrue(results.getFirst().getSyntaxErrors().isEmpty());
	}
	
	@Test
	public void testParseFileWithError() throws IOException, URISyntaxException {
		SysMLAccess sysmlAccess = SysMLAccess.createFullyFeatured(getLibraryPath());
		sysmlAccess.setVerbose(false);
		sysmlAccess.loadLibrary();
		
		URL testFileURL = getClass().getResource("parseTestWithError.sysml");
		File testFile = new File(testFileURL.toURI());
		List<SysMLParseResult> results = sysmlAccess.parseFiles(testFile, true);
		
		assertFalse(results.getFirst().getSyntaxErrors().isEmpty());
	}
}
