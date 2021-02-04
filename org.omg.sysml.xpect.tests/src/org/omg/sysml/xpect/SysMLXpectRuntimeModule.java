package org.omg.sysml.xpect;

import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.omg.sysml.xtext.SysMLRuntimeModule;

public class SysMLXpectRuntimeModule extends SysMLRuntimeModule {
  @Override
  public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
    return SysMLXpectGlobalScopeProvider.class;
  }
}
