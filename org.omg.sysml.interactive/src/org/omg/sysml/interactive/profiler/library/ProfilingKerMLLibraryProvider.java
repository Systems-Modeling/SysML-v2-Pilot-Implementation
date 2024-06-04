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
package org.omg.sysml.interactive.profiler.library;

import org.omg.kerml.xtext.library.KerMLLibraryProvider;
import org.omg.sysml.lang.sysml.Element;

import com.google.common.base.Stopwatch;

public class ProfilingKerMLLibraryProvider extends KerMLLibraryProvider {
	
	public static long callCount = 0;
	public static final Stopwatch LIBRARY_PROVIDER_WATCH = Stopwatch.createUnstarted();
	
	@Override
	public Element getElement(Element context, String name)
	{
		callCount++;
		if (!LIBRARY_PROVIDER_WATCH.isRunning()) LIBRARY_PROVIDER_WATCH.start();
		
		var result = super.getElement(context, name);
		
		if (!LIBRARY_PROVIDER_WATCH.isRunning()) LIBRARY_PROVIDER_WATCH.start();
		
		LIBRARY_PROVIDER_WATCH.stop();
		
		return result;
	}
}
