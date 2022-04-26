package org.omg.kerml.xpect;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xpect.xtext.lib.tests.XtextTests;
import org.junit.BeforeClass;
import org.omg.sysml.delegate.DerivedPropertySettingDelegateFactory;

public class KerMLXtextTests extends XtextTests {

	@BeforeClass
	public static void setup() {
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.
			put(DerivedPropertySettingDelegateFactory.SYSML_ANNOTATION, new DerivedPropertySettingDelegateFactory());
	}

}
