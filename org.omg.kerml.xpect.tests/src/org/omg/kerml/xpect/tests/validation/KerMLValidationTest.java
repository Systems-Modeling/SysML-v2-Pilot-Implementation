package org.omg.kerml.xpect.tests.validation;

import org.eclipse.xpect.runner.XpectRunner;
import org.eclipse.xpect.runner.XpectTestFiles;
import org.eclipse.xpect.xtext.lib.tests.ValidationTest;
import org.junit.runner.RunWith;

@RunWith(XpectRunner.class)
@XpectTestFiles(fileExtensions = "xt")
public class KerMLValidationTest extends ValidationTest {

}
