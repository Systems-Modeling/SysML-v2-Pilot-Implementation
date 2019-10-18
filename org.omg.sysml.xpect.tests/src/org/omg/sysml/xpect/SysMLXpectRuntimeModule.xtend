package org.omg.sysml.xpect

import org.omg.sysml.AlfRuntimeModule

class SysMLXpectRuntimeModule extends AlfRuntimeModule {
	
	override bindIGlobalScopeProvider() {
		SysMLXpectGlobalScopeProvider
	}	
	
}