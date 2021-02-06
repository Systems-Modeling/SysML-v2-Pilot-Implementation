package org.omg.kerml.xpect;

import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.omg.kerml.xtext.KerMLRuntimeModule;

public class KerMLXpectRuntimeModule extends KerMLRuntimeModule {
	
  @Override
  public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
    return KerMLXpectGlobalScopeProvider.class;
  }
}
