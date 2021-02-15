package org.omg.sysml.xpect;

import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.omg.sysml.xpect.SysMLXpectGlobalScopeProvider;
import org.omg.sysml.xtext.SysMLRuntimeModule;

@SuppressWarnings("all")
public class SysMLXpectRuntimeModule extends SysMLRuntimeModule {
  @Override
  public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
    return SysMLXpectGlobalScopeProvider.class;
  }
}
