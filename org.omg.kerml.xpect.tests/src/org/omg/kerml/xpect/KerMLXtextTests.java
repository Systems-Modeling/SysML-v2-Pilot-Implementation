package org.omg.kerml.xpect;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xpect.xtext.lib.tests.XtextTests;
import org.junit.BeforeClass;
import org.omg.sysml.delegate.setting.DerivedPropertySettingDelegateFactory;
import org.omg.sysml.delegate.invocation.OperationInvocationDelegateFactory;

public class KerMLXtextTests extends XtextTests {

	@BeforeClass
	public static void setup() {
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.
			put(DerivedPropertySettingDelegateFactory.SYSML_ANNOTATION, new DerivedPropertySettingDelegateFactory());
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.
			put(OperationInvocationDelegateFactory.SYSML_ANNOTATION, new OperationInvocationDelegateFactory());	
	}

}
