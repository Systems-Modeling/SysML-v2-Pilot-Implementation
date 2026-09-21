/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
 * Copyright (c) 2026 Obeo
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 * 
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 * 
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 * 
 * Contributors:
 *  Zoltan Ujhelyi, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.interactive.profiler;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;

import com.google.common.base.Stopwatch;

/**
 * This class provides a reusable application for profiling the interactive parser component of the SysML. The profiler  
 *
 */
public class SysMLInteractiveParsingProfiler {
	
	private final static int NB_RUN = 5;

	public static void main(String[] args) throws Exception {
		
		long totalLibraryLoadTime = 0;
		Map<String, Long> totalProcessTimeByFile = new HashMap<String, Long>();
		
		for(int run = 0; run < NB_RUN; run ++) {
			Stopwatch initWatch = Stopwatch.createStarted();
			SysMLInteractive instance = SysMLInteractive.getInstance();
			if (args.length <= 1) {
				System.out.println("Usage: ");
				System.out.println("SysMLInteractiveParsingProfiler <LIBRARY FOLDER> <FILENAME>");
			}
			instance.loadLibrary(args[0]);
			
			initWatch.stop();
			
			long loadLibTime = initWatch.elapsed(TimeUnit.MILLISECONDS);
			totalLibraryLoadTime+=loadLibTime;
			
			System.out.println("Libraries loaded in " + loadLibTime + " ms");
			System.out.println();
			
			for (int i = 1; i < args.length; i++) {
				String path = args[i];
				System.out.println("Loading input " + path);
				
				
				Stopwatch watch = Stopwatch.createStarted();
				SysMLInteractiveResult results = instance.process(Files.lines(Paths.get(args[i])).collect(Collectors.joining("\n")));
				if (results.hasErrors()) {
					System.out.println(results.formatIssues());
				} else {
					System.out.println(results.formatRootElement());
				}
				watch.stop();
				long processTime = watch.elapsed(TimeUnit.MILLISECONDS);
				
				Long storeTime = totalProcessTimeByFile.get(path);
				long time = 0;
				if(storeTime != null) {
					time = storeTime;
				}
				time+=processTime;
				totalProcessTimeByFile.put(path, time);
				
				System.out.println(processTime + " ms");
				System.out.println();
			}
		}
		
		
		long libraryLoadTime = totalLibraryLoadTime/ NB_RUN;
		
		System.out.println("Mean time for loading\t"+libraryLoadTime);
		
		long totalTime = libraryLoadTime;
		for (int i = 1; i < args.length; i++) {
			String path = args[i];

			long processTimeByFile = totalProcessTimeByFile.get(path)/ NB_RUN;
			System.out.println("Mean time for "+path+"\t "+processTimeByFile);
			totalTime+=processTimeByFile;
		}
		System.out.println("Total mean time : "+totalTime);
		
	}

}
