package org.omg.kerml.xpect.tests.linking;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.omg.kerml.xpect.KerMLXtextTests;
import org.eclipse.xpect.runner.XpectRunner;
import org.eclipse.xpect.runner.XpectTestFiles;
import org.eclipse.xpect.xtext.lib.tests.LinkingTest;

@RunWith(XpectRunner.class)
@XpectTestFiles(fileExtensions = "xt")
public class KerMLLinkingTest extends LinkingTest {

	@BeforeClass
	public static void setup() {
		KerMLXtextTests.setup();
	}

}
