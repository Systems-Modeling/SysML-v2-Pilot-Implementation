/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
 * 
 * Contributors:
 *  Zoltan Ujhelyi, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.interactive.profiler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.omg.kerml.xtext.scoping.KerMLGlobalScopeProvider;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;
import org.omg.sysml.interactive.profiler.linking.ProfilingKerMLLinkingService;
import org.omg.sysml.interactive.profiler.scope.ProfilableGlobalScopeWrapper;
import org.omg.sysml.interactive.profiler.scope.ProfilableScopeWrapper;

import com.google.common.base.Stopwatch;

/**
 * This class provides a reusable application for profiling the interactive parser component of the SysML. The profiler  
 *
 */
public class SysMLInteractiveParsingProfiler {

	public static List<LinkStep> LINKING_RESULTS = new LinkedList<>();
	
	public static void main(String[] args) throws Exception {
		Stopwatch initWatch = Stopwatch.createStarted();
		SysMLInteractive instance = SysMLInteractive.getInstance();
		if (args.length <= 1) {
			System.out.println("Usage: ");
			System.out.println("SysMLInteractiveParsingProfiler <LIBRARY FOLDER> <FILENAME>");
		}
		instance.loadLibrary(args[0]);
		
		initWatch.stop();
		var libraryLoadTime = initWatch.elapsed(TimeUnit.MILLISECONDS);
		initWatch.reset();
		
		initWatch.start();
		
		instance.indexInheritedLibraryTypes();
//		instance.getLibraryResources().forEach(res -> {
//			try {
//				res.unload();
//				res.load(Collections.emptyMap());
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		});
//		//instance.indexInheritedLibraryTypes();

		
		initWatch.stop();
		
//		var descriptionsProvider = instance.getDescriptionsProvider();
//		var libraryResourceDescriptions = descriptionsProvider.getResourceDescriptions(instance.getResourceSet());
//		var libraryObjectDescriptions = libraryResourceDescriptions.getExportedObjects();	
//		KerMLGlobalScopeProvider.setLibraryDescriptions(libraryObjectDescriptions);
		
		Map<String, Long> loadTimes = new HashMap<>();
		
		for (int i = 1; i < args.length; i++) {
			System.out.println("Loading input " + args[i]);
			Stopwatch watch = Stopwatch.createStarted();
			SysMLInteractiveResult results = instance.process(Files.lines(Paths.get(args[i])).collect(Collectors.joining("\n")));
			if (results.hasErrors()) {
				System.out.println(results.formatIssues());
			} else {
				System.out.println(results.formatRootElement());
			}
			watch.stop();
			System.out.println(watch.elapsed(TimeUnit.MILLISECONDS) + " ms");
			System.out.println();
			
			loadTimes.put(args[i], watch.elapsed(TimeUnit.MILLISECONDS));
		}
		
		LINKING_RESULTS.stream().filter(res -> res.isRoot()).sorted((lr1, lr2) -> lr1.compareTo(lr2)).forEach(res -> res.print(0));
		
		System.out.println("---------------");
		System.out.println("Libraries loaded in " + libraryLoadTime + " ms");
		System.out.println();
		
		loadTimes.forEach((k, v) -> {
			System.out.println("Loading input " + k + " took " + v + " ms");
		});
		
		System.out.println("---------------");
		
		System.out.println("---------------");
		System.out.println("Total time in scope: " + ProfilableScopeWrapper.SCOPE_TIME.elapsed(TimeUnit.MILLISECONDS) + " ms (" + ProfilableScopeWrapper.SCOPE_CALL_COUNT + " calls)");
		System.out.println("Total time in global scope: " + ProfilableGlobalScopeWrapper.GLOBAL_SCOPE_TIME.elapsed(TimeUnit.MILLISECONDS) + " ms (" + ProfilableGlobalScopeWrapper.GLOBAL_SCOPE_CALL_COUNT + " calls)");
		System.out.println("Total time in linker: " + ProfilingKerMLLinkingService.LINKING_TIME.elapsed(TimeUnit.MILLISECONDS) + " ms (" + ProfilableGlobalScopeWrapper.GLOBAL_SCOPE_CALL_COUNT + " calls)");
	}

}
