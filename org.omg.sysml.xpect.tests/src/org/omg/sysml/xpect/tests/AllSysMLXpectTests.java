package org.omg.sysml.xpect.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.omg.sysml.xpect.tests.expression.SysMLExpressionTest;
import org.omg.sysml.xpect.tests.query.SysMLQueryTest;
import org.omg.sysml.xpect.tests.simpletests.SysMLSimpleTests;
import org.omg.sysml.xpect.tests.validation.SysMLValidationTests;

@SuiteClasses({ 
		SysMLSimpleTests.class, //
		SysMLExpressionTest.class, //
		SysMLValidationTests.class, //
		SysMLQueryTest.class,
		SysMLExpressionTest.class,
})
@RunWith(Suite.class)
public class AllSysMLXpectTests {

}
