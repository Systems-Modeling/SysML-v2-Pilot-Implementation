package org.omg.sysml.interactive.tests;

import java.util.List;

import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Namespace;

public class FeatureOutputTest extends SysMLInteractiveTest {

	public final String test =
			"port def PT {\n"
			+ "    out signal;\n"
			+ "}\n"
			+ "part context {\n"
			+ "    part producer {\n"
			+ "        port p1 : PT;\n"
			+ "    }\n"
			+ "    part consumer {\n"
			+ "        port p2 : ~PT;\n"
			+ "    }\n"
			+ "}";
	
	@Test
	public void testFeatureOutput() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		List<Element> elements = process(instance, test);
		Feature signal = (Feature)(Namespace)((Namespace)elements.get(0)).
				getOwnedMember().get(0);
		Feature p2 = (Feature)((Namespace)((Namespace)elements.get(1)).
				getOwnedMember().get(1)).
				getOwnedMember().get(0);
		System.out.println(p2.getName() + ".output contains " + signal.getName() + ": " + p2.getOutput().contains(signal));
		System.out.println(p2.getName() + ".directionOf(" + signal.getName() + "): " + p2.directionOf(signal));
	}

}
