package org.omg.sysml.scoping

import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.impl.ImportImpl
import org.omg.sysml.lang.sysml.impl.GeneralizationImpl
import java.util.Collections
import org.omg.sysml.lang.sysml.Generalization

class PackageDescriptionStrategy extends DefaultResourceDescriptionStrategy{
	
	
    public override boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
    	var boolean hasGenOrImp=false
        if (eObject instanceof org.omg.sysml.lang.sysml.Class) { 	//.filter[w|!w.basicGetGeneral.eIsProxy]
        	val userdatas = eObject.ownedElement.filter(GeneralizationImpl).filter[w|!w.basicGetGeneral.eIsProxy].map[gen | 
        		val superclass = gen.general
	        		//if (superclass.eIsProxy) {
	        			superclass.fullName
	        		//} else {
	        		//	null
	        		//}
    		]
    		val userdata = userdatas.filterNull.join("#")
    		var QualifiedName qualifiedName = getQualifiedNameProvider.getFullyQualifiedName(eObject)
    		acceptor.accept(EObjectDescription.create(qualifiedName, eObject, Collections.singletonMap("generalization", userdata)))
    		hasGenOrImp=true
        }
        if (eObject instanceof Package){			//.filter[w|!w.basicGetImportedPackage.eIsProxy]
        	val userdatas = eObject.ownedImport.filter(ImportImpl).map[imp|
        		imp.importedPackage.fullName
        	].toSet
        	val userdata = userdatas.filterNull.join("#")
        	var QualifiedName qualifiedName = getQualifiedNameProvider.getFullyQualifiedName(eObject)
        	acceptor.accept(EObjectDescription.create(qualifiedName, eObject, Collections.singletonMap("import", userdata)))
    		hasGenOrImp=true
        }
        if(hasGenOrImp===true)
        	return true
        return super.createEObjectDescriptions(eObject, acceptor);
    }
    


//	def protected EObject superParent(Package pack){
//		var obj=pack
//		var ownMemb= obj.owningMembership
//		if(ownMemb=== null)
//			return obj
//		var parent= ownMemb.owningPackage
//		ownMemb=parent.owningMembership
//		while(ownMemb!==null){
//			obj=parent
//			parent=ownMemb.owningPackage
//			ownMemb=parent.owningMembership
//		}
//		return parent
//	}
	
	def public String getFullName(Package pack){
//		return 
//			qualifiedNameProvider.getFullyQualifiedName(superParent(pack)).append(
//				qualifiedNameProvider.getFullyQualifiedName(pack)).toString("::")
		return qualifiedNameProvider.getFullyQualifiedName(pack).toString("::")
	}


	
}