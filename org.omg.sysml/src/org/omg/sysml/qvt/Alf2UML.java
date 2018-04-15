package org.omg.sysml.qvt;

import java.nio.file.Paths;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.omg.sysml.AlfStandaloneSetup;
import org.omg.sysml.behaviors.BehaviorsPackage;
import org.omg.sysml.classification.ClassificationPackage;
import org.omg.sysml.core.CorePackage;
import org.omg.sysml.groups.GroupsPackage;
import org.omg.sysml.sysml.SysmlPackage;

public class Alf2UML extends QVTRunner {

	@SuppressWarnings("unused")
	protected void initialize() {
		super.initialize();
		
		UMLResourcesUtil.init(this.resourceSet);
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", XMI2UMLResource.Factory.INSTANCE);
	    
	    CorePackage core = CorePackage.eINSTANCE;
	    GroupsPackage group = GroupsPackage.eINSTANCE;
	    ClassificationPackage classification = ClassificationPackage.eINSTANCE;
	    BehaviorsPackage behavior = BehaviorsPackage.eINSTANCE;
	    SysmlPackage sysml = SysmlPackage.eINSTANCE;
	    
	    AlfStandaloneSetup.doSetup();
	}
	
	@Override
	protected String constructOutputPath(final String... resourcePaths) {
		int n = resourcePaths.length;
		
		// Second to last resource path is presumed to be the input file path.
		String fileName = Paths.get(resourcePaths[n - 2]).getFileName().toString();
		int i = fileName.indexOf('.');
		if (i >= 0) {
			fileName = fileName.substring(0, i);
		}
		
		// Last resource path is presumed to be the output directory path,
		// to which the input file name is appended.
		return resourcePaths[n - 1] + "/" + fileName + "." + UMLResource.FILE_EXTENSION;
	}
	
	public static void main(String[] args) {
		new Alf2UML().run(args, 3, "QVTRunner [-l logPath] qvtPath inputPaths outputPath");
	}

}
