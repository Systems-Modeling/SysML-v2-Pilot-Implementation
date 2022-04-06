package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.Usage;

public class DerivedPropertyTest extends SysMLInteractiveTest {

	@Test
	public void testOwnedUsage() throws Exception {
		List<Element> members = eval("part def P { attribute x; item y; part def Q; }");
		assertFalse("No members", members.isEmpty());
		Element member = members.get(0);
		assertTrue("No definition", member instanceof Definition);
		List<Usage> usages = ((Definition)member).getOwnedUsage();
		assertEquals(2, usages.size());
		assertTrue("Not AttributeUsage", usages.get(0) instanceof AttributeUsage);
		assertTrue("Not ItemUsage", usages.get(1) instanceof ItemUsage);
	}
}
