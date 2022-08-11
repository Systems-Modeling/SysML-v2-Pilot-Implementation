package org.omg.kerml.xpect.tests.validation;

import org.eclipse.xpect.runner.XpectRunner;
import org.eclipse.xpect.runner.XpectTestFiles;
import org.eclipse.xpect.xtext.lib.tests.ValidationTest;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.omg.kerml.xpect.KerMLXtextTests;

@RunWith(XpectRunner.class)
@XpectTestFiles(fileExtensions = "xt")
public class KerMLValidationTest extends ValidationTest {
	
	@BeforeClass
	public static void setup() {
		KerMLXtextTests.setup();
	}

}
