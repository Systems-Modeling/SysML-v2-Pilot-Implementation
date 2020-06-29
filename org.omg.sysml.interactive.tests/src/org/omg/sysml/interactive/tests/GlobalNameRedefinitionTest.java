package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;

public class GlobalNameRedefinitionTest {

	private final static String SYSML_LIBRARY_PATH_KEY = "libraryPath";
	
	@Test
	public void testRedefinitionShadowing() throws Exception {
		SysMLInteractive instance = SysMLInteractive.createInstance();
		instance.loadLibrary(System.getProperty(SYSML_LIBRARY_PATH_KEY));
		
		SysMLInteractiveResult result1 = instance.eval("y = 1;");
		System.out.println(result1);
		String id1 = result1.getRootElement().getOwnedElement().get(0).getIdentifier();
		
		SysMLInteractiveResult result2 = instance.eval("y = 2;");
		System.out.println(result2);
		String id2 = result2.getRootElement().getOwnedElement().get(0).getIdentifier();
		
		System.out.println(instance.show("y"));
		String resolvedIdentifier = instance.resolve("y").getIdentifier();
		
		assertNotEquals(id1, id2);
		assertEquals(id2, resolvedIdentifier);
	}
}
