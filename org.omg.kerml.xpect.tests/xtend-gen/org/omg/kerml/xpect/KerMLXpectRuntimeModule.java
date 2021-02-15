package org.omg.kerml.xpect;

import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.omg.kerml.xpect.KerMLXpectGlobalScopeProvider;
import org.omg.kerml.xtext.KerMLRuntimeModule;

@SuppressWarnings("all")
public class KerMLXpectRuntimeModule extends KerMLRuntimeModule {
  @Override
  public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
    return KerMLXpectGlobalScopeProvider.class;
  }
}
