package org.omg.sysml.xpect.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.omg.sysml.xpect.tests.simpletests.SysMLSimpleTests;

@SuiteClasses({ 
		SysMLSimpleTests.class, //
})
@RunWith(Suite.class)
public class AllSysMLXpectTests {

}
