package org.omg.kerml.xpect.tests.indexing;

import org.eclipse.xpect.XpectImport;
import org.eclipse.xpect.expectation.ILinesExpectation;
import org.eclipse.xpect.expectation.LinesExpectation;
import org.eclipse.xpect.runner.LiveExecutionType;
import org.eclipse.xpect.runner.Xpect;
import org.eclipse.xpect.runner.XpectRunner;
import org.eclipse.xpect.runner.XpectTestFiles;
import org.eclipse.xpect.xtext.lib.setup.ThisResource;
import org.eclipse.xpect.xtext.lib.setup.XtextStandaloneSetup;
import org.eclipse.xpect.xtext.lib.setup.XtextWorkspaceSetup;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.omg.kerml.xpect.KerMLXtextTests;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;


/**
 * This class is a copied version of
 * {@link org.eclipse.xpect.xtext.lib.tests.ResourceDescriptionTest} where the
 * name output was updated to be KerML/SysML compatible.
 *
 */
@RunWith(XpectRunner.class)
@XpectTestFiles(fileExtensions = "xt")
@XpectImport({ XtextStandaloneSetup.class, XtextWorkspaceSetup.class })
public class KerMLIndexerTest {

	@BeforeClass
	public static void setup() {
		KerMLXtextTests.setup();
	}

	protected static class EObjectDescriptionToStringMapper implements Function<IEObjectDescription, String> {
		public String apply(IEObjectDescription desc) {
			return desc.getEClass().getEPackage().getNsPrefix() + "::" + desc.getEClass().getName() + ": " 
					+ desc.getName().toString("::");
		}
	}

	@Inject
	private IResourceDescription.Manager manager;
	
	@Xpect(liveExecution = LiveExecutionType.FAST)
	public void exportedObjects(@LinesExpectation ILinesExpectation expectation, @ThisResource XtextResource resource) {
		IResourceDescription resourceDescription = manager.getResourceDescription(resource);
		Iterable<IEObjectDescription> exportedObjects = resourceDescription.getExportedObjects();
		expectation.assertEquals(Iterables.transform(exportedObjects, new EObjectDescriptionToStringMapper()));
	}
}
