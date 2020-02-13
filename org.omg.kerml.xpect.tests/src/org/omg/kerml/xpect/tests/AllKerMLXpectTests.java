package org.omg.kerml.xpect.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.omg.kerml.xpect.tests.generator.KerMLGeneratorTest;
import org.omg.kerml.xpect.tests.imports.global.KerMLImportGlobalTest;
import org.omg.kerml.xpect.tests.imports.local.KerMLImportLocalTest;
import org.omg.kerml.xpect.tests.linking.KerMLLinkingTest;
import org.omg.kerml.xpect.tests.parser.KerMLParserTest;
import org.omg.kerml.xpect.tests.query.KerMLQueryTest;
import org.omg.kerml.xpect.tests.scoping.KerMLScopingTest;
import org.omg.kerml.xpect.tests.testsuite.KerMLXtextTest;
import org.omg.kerml.xpect.tests.validation.KerMLValidationTest;
import org.omg.kerml.xpect.tests.visibility.KerMLVisibilityTest;

@SuiteClasses({ 
		KerMLGeneratorTest.class, //
		KerMLImportGlobalTest.class, //
		KerMLImportLocalTest.class, //
		KerMLLinkingTest.class,//
		KerMLParserTest.class, //
		KerMLQueryTest.class, //
		KerMLScopingTest.class, //
		KerMLXtextTest.class, //
		KerMLValidationTest.class, //
		KerMLVisibilityTest.class
})
@RunWith(Suite.class)
public class AllKerMLXpectTests {

}
