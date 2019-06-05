package org.omg.sysml.xpect.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.omg.sysml.xpect.tests.generator.SysMLGeneratorTest;
import org.omg.sysml.xpect.tests.linking.SysMLLinkingTest;
import org.omg.sysml.xpect.tests.parser.SysMLParserTest;
import org.omg.sysml.xpect.tests.scoping.SysMLScopingTest;
import org.omg.sysml.xpect.tests.testsuite.SysMLXtextTest;
import org.omg.sysml.xpect.tests.validation.SysMLValidationTest;

@SuiteClasses({ SysMLLinkingTest.class, //
		SysMLParserTest.class, //
		SysMLGeneratorTest.class, //
		SysMLScopingTest.class, //
		SysMLXtextTest.class, //
		SysMLValidationTest.class //
})
@RunWith(Suite.class)
public class AllSysMLXpectTests {

}
