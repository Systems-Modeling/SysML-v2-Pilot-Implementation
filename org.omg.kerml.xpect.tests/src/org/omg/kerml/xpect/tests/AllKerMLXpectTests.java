package org.omg.kerml.xpect.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.omg.kerml.xpect.tests.imports.global.KerMLImportGlobalTest;
import org.omg.kerml.xpect.tests.imports.local.KerMLImportLocalTest;
import org.omg.kerml.xpect.tests.imports.recursive.KerMLImportRecursiveTest;
import org.omg.kerml.xpect.tests.indexing.KerMLIndexerTest;
import org.omg.kerml.xpect.tests.linking.KerMLLinkingTest;
import org.omg.kerml.xpect.tests.parsing.KerMLParsingTest;
import org.omg.kerml.xpect.tests.scoping.KerMLScopingTest;
import org.omg.kerml.xpect.tests.testsuite.KerMLXtextTest;
import org.omg.kerml.xpect.tests.validation.KerMLValidationTest;
import org.omg.kerml.xpect.tests.visibility.KerMLVisibilityTest;

@SuiteClasses({ 
		KerMLImportGlobalTest.class, //
		KerMLImportLocalTest.class, //
		KerMLImportRecursiveTest.class, //
		KerMLLinkingTest.class,//
		KerMLParsingTest.class, //
		KerMLScopingTest.class, //
		KerMLXtextTest.class, //
		KerMLValidationTest.class, //
		KerMLVisibilityTest.class,
		KerMLIndexerTest.class
})
@RunWith(Suite.class)
public class AllKerMLXpectTests {

}
