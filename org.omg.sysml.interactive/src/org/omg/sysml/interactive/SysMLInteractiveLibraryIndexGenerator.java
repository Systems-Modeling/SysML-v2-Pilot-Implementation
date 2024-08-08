/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */
package org.omg.sysml.interactive;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.omg.kerml.xtext.library.LibraryIndex;
import org.omg.sysml.util.ElementUtil;

import com.google.gson.GsonBuilder;

public class SysMLInteractiveLibraryIndexGenerator {

	public static void main(String[] args) throws IOException {
		
		if (args.length < 1) {
			System.out.println("Missing argument. Please supply path to library folder.");
		}
		
		System.out.println("Library index generation started...");
		
		//disable EMF reference clearing to prevent InterruptedException on early JVM shutdown
		System.setProperty("org.eclipse.emf.common.util.ReferenceClearingQueue", "false");
		
		SysMLInteractive instance = SysMLInteractive.getInstance();
		instance.getLibraryIndexCache().setIndexDisabled(true);
		
		instance.loadLibrary(args[0]);

		ResourceSet rs = instance.getResourceSet();

		System.out.println("Resolving references");
		rs.getResources().forEach(r -> EcoreUtil2.resolveLazyCrossReferences(r, null));

		System.out.println("Transforming");
		ElementUtil.transformAll(rs, false);

		LibraryIndex libraryIndex = new LibraryIndex();

		System.out.println("Creating index");
		libraryIndex.updateIndex(rs.getResources());

		String json = libraryIndex.toJson(new GsonBuilder().disableHtmlEscaping().setPrettyPrinting());
		File indexFile = new File(args[0] + "/" + LibraryIndex.FILE_NAME);

		System.out.println("Writing index");
		try (FileOutputStream fileStream = new FileOutputStream(indexFile, false)) {
			fileStream.write(json.getBytes());
		}
		
		rs.eSetDeliver(false);
		rs.eAdapters().clear();
		rs.getResources().forEach(r -> {
			r.eSetDeliver(false);
			r.eAdapters().clear();
		});
		
		System.out.println("Done.");
	}
}
