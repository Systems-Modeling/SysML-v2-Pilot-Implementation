/*****************************************************************************
 * Copyright (c) 2018 Model Driven Solutions, Inc.
 *    
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/

package org.omg.sysml.xtext.qvt;

import java.nio.file.Paths;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.omg.sysml.qvt.QVTRunner;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

public class SysML2UML extends QVTRunner {
	
	protected void initialize() {
		super.initialize();
		
		UMLResourcesUtil.init(this.resourceSet);
		SysMLStandaloneSetup.doSetup();
	}
	
	@Override
	protected ModelExtent[] createExtents(List<EList<EObject>> inputContents) {
		return new ModelExtent[] {
			new BasicModelExtent(inputContents.get(inputContents.size() - 1)),
			new BasicModelExtent()
		};
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
		return resourcePaths[n - 1] + "/" + fileName + ".uml";
	}
	
	public static void main(String[] args) {
		new SysML2UML().run(args, 3, "SysML2UML [-l logPath] qvtPath inputPaths outputPath");
	}

}
