package org.omg.sysml.xpect.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({ 
		org.omg.sysml.xpect.tests.expression.SysMLTests.class,
		org.omg.sysml.xpect.tests.query.SysMLTests.class,
		org.omg.sysml.xpect.tests.simpletests.SysMLTests.class,
		org.omg.sysml.xpect.tests.validation.invalid.SysMLTests.class,
		org.omg.sysml.xpect.tests.validation.valid.SysMLTests.class,
		org.omg.sysml.xpect.tests.imports.SysMLTests.class,
})
@RunWith(Suite.class)
public class AllSysMLXpectTests {

}
