package org.omg.sysml.xpect

import org.omg.kerml.xtext.KerMLRuntimeModule

class KerMLXpectRuntimeModule extends KerMLRuntimeModule {
	
	override bindIGlobalScopeProvider() {
		KerMLXpectGlobalScopeProvider
	}	
	
}