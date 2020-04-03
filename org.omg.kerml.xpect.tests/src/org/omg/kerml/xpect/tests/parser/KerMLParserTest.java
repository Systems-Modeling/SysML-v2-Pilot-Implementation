package org.omg.kerml.xpect.tests.parser;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xpect.expectation.IStringExpectation;
import org.eclipse.xpect.expectation.StringExpectation;
import org.eclipse.xpect.runner.Xpect;
import org.eclipse.xpect.runner.XpectRunner;
import org.eclipse.xpect.runner.XpectTestFiles;
import org.eclipse.xpect.setup.XpectSetup;
import org.eclipse.xpect.xtext.lib.setup.ThisModel;
import org.eclipse.xpect.xtext.lib.setup.XtextStandaloneSetup;
import org.eclipse.xpect.xtext.lib.setup.XtextWorkspaceSetup;
import org.eclipse.xpect.xtext.lib.util.EObjectFormatter;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.junit.runner.RunWith;

@RunWith(XpectRunner.class)
@XpectSetup({ XtextStandaloneSetup.class, XtextWorkspaceSetup.class })
@XpectTestFiles(fileExtensions = "xt")
@SuppressWarnings("all")
public class KerMLParserTest {
	@Xpect
	public void ast(@StringExpectation final IStringExpectation expectation, @ThisModel final EObject model) {
		final String actual = new EObjectFormatter().resolveCrossReferences().format(model);
		expectation.assertEquals(actual);
	}
}
