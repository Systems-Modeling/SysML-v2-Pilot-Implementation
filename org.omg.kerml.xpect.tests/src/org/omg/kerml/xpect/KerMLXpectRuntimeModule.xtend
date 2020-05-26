package org.omg.kerml.xpect

import org.omg.kerml.xtext.KerMLRuntimeModule

class KerMLXpectRuntimeModule extends KerMLRuntimeModule {
	
	override bindIGlobalScopeProvider() {
		KerMLXpectGlobalScopeProvider
	}	
	
	override bindIModelLLibraryProvider() {
		KerMLXpectLibraryProvider
	}
		
}