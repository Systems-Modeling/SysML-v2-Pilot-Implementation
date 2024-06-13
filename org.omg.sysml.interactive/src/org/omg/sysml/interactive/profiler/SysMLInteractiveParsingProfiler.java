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

import java.io.File;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;
import org.omg.sysml.interactive.profiler.linking.ProfilingKerMLLinkingService;
import org.omg.sysml.interactive.profiler.results.LinkStep;
import org.omg.sysml.interactive.profiler.results.LinkingResult;
import org.omg.sysml.interactive.profiler.scope.ProfilingKerMLGlobalScope;
import org.omg.sysml.interactive.profiler.scope.ProfilingKerMLScope;

import com.google.common.base.Stopwatch;

/**
 * This class provides a reusable application for profiling the interactive parser component of the SysML. The profiler  
 *
 */
public class SysMLInteractiveParsingProfiler {

	public static void main(String[] args) throws Exception {
		Stopwatch initWatch = Stopwatch.createStarted();
		SysMLInteractive instance = SysMLInteractive.getProfilingInstance();
		if (args.length <= 1) {
			System.out.println("Usage: ");
			System.out.println("SysMLInteractiveParsingProfiler <LIBRARY FOLDER> <FILENAME>");
		}
		instance.loadLibrary(args[0]);
		
		initWatch.stop();
		System.out.println("Libraries loaded in " + initWatch.elapsed(TimeUnit.MILLISECONDS) + " ms");
		System.out.println();
		
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
		}
		
		var outputfile = new File("test.txt");
		outputfile.delete();
		outputfile = null;
		
		outputfile = new File("test.txt");
		outputfile.createNewFile();
		
		var out = new PrintStream(outputfile);
		
		LinkingResult.RESULTS.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(s -> s.print(0, out));
		
		out.close();
		
		System.out.println("Total time in scope: " + ProfilingKerMLScope.SCOPE_TIME.elapsed(TimeUnit.MILLISECONDS) + " ms (" + ProfilingKerMLScope.SCOPE_CALL_COUNT + " calls)");
		System.out.println("Total time in global scope: " + ProfilingKerMLGlobalScope.GLOBAL_SCOPE_TIME.elapsed(TimeUnit.MILLISECONDS) + " ms (" + ProfilingKerMLGlobalScope.GLOBAL_SCOPE_CALL_COUNT + " calls)");
		System.out.println("Total time in linker: " + ProfilingKerMLLinkingService.LINKING_TIME.elapsed(TimeUnit.MILLISECONDS) + " ms");
	}

}
