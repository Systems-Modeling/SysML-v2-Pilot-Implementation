package org.omg.sysml.lang.sysml.util

import com.google.inject.Inject
import org.omg.sysml.scoping.AlfScopeProvider
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.omg.sysml.AlfStandaloneSetup
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.omg.sysml.lang.sysml.Element

class SysMLLibraryUtil {
	
	@Inject
	private AlfScopeProvider scopeProvider
	
	@Inject
	private IQualifiedNameConverter nameConverter
	
	protected def EObject filePackage(Element element) {
		var pack = element
		while (pack.owner !== null) {
			pack = pack.owner
		}
		return pack
	}

	def EObject getElement(Element context, EReference reference, String name) {
		var element = scopeProvider.getScope(context.filePackage, reference).getSingleElement(nameConverter.toQualifiedName(name))
		return if (element === null) null else element.getEObjectOrProxy		
	}
	
	private static SysMLLibraryUtil INSTANCE = new AlfStandaloneSetup().createInjector().getInstance(SysMLLibraryUtil)
	
	def static EObject getLibraryElement(Element context, EReference reference, String name) {
		return INSTANCE.getElement(context, reference, name)
	}
	
}