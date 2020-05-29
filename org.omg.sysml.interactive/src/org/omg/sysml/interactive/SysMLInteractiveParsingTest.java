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
package org.omg.sysml.interactive;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import com.google.common.base.Stopwatch;

public class SysMLInteractiveParsingTest {

	public static void main(String[] args) throws Exception {
		SysMLInteractive instance = SysMLInteractive.getInstance();
		if (args.length > 0) {
			instance.loadLibrary(args[0]);
		}
		Stopwatch watch = Stopwatch.createStarted();
		SysMLInteractiveResult results = instance.eval(Files.lines(Paths.get(args[1])).collect(Collectors.joining("\n")));
		if (results.hasErrors()) {
			System.out.println(results.formatIssues());
		} else {
			System.out.println(results.formatRootElement());
		}
		System.out.println(watch.elapsed(TimeUnit.MILLISECONDS));
	}

}
