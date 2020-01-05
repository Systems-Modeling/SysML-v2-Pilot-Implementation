package org.omg.kerml.xtext.qvt;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.qvt.QVTRunner;

public class KerML2Instances extends QVTRunner {

	@SuppressWarnings("unused")
	protected void initialize() {
		super.initialize();
		
		UMLResourcesUtil.init(this.resourceSet);
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", XMI2UMLResource.Factory.INSTANCE);
	    
	    SysMLPackage sysml = SysMLPackage.eINSTANCE;	    
	    KerMLStandaloneSetup.doSetup();
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
	
	@Override
	public void saveOutput(final Resource resource) throws Exception {
		List<EObject> output = this.getOutput();
		EObject instanceModel = output.get(0).eContents().get(0);
		((XMLResource)resource).setID(instanceModel, "InstanceModel");
		setIds((XMLResource) resource, "", instanceModel.eContents());
		super.saveOutput(resource);
	}
	
	public static void setIds(XMLResource resource, String prefix, List<EObject> contents) {
		int n = 1;
		Map<String, Integer> idMap = new HashMap<String, Integer>();
		for (EObject object: contents) {
			Object name = getName(object);
			String id;
			if (name == null) {
				id = Integer.toString(n++);
			} else {
				id = makeId(name);
				Integer count = idMap.get(id);
				if (count == null) {
					idMap.put(id, 1);
				} else {
					id = id + "." + count;
					idMap.put(id, ++count);
				}
			}
			id = prefix + id;
			resource.setID(object, id);
			setIds(resource, id + ".", object.eContents());
		}
	}
	
	public static Object getName(EObject object) {
		if (object instanceof Slot) {
			final EStructuralFeature definingFeature = object.eClass().getEStructuralFeature("definingFeature");
			object = (EObject)object.eGet(definingFeature);
		}
		final EStructuralFeature feature = object.eClass().getEStructuralFeature("name");
		return object.eGet(feature);
	}
	
	public static String makeId(Object object) {
		return object.toString().replace("'", "").replaceAll("[^_A-Za-z0-9\\-\\@]","_");
	}

	public static void main(String[] args) {
		new KerML2Instances().run(args, 4, "KerML2Instances [-l logPath] qvtPath metamodelPath inputPath outputDirectory");
	}

}
