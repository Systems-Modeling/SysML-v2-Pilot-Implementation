package org.omg.sysml.xpect

import org.omg.kerml.xtext.KerMLRuntimeModule

class SysMLXpectRuntimeModule extends KerMLRuntimeModule {
	
	override bindIGlobalScopeProvider() {
		SysMLXpectGlobalScopeProvider
	}	
	
	override bindIModelLLibraryProvider() {
		SysMLXpectLibraryProvider
	}
		
}