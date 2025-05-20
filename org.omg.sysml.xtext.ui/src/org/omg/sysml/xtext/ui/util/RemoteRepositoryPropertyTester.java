/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2025 Model Driven Solutions, Inc.
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
 *   Laszlo Gati, MDS
 *   Zoltan Ujhelyi, MDS
 */
package org.omg.sysml.xtext.ui.util;

import java.util.Objects;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;
import org.omg.sysml.xtext.ui.handlers.PullRepositoryProject;

public class RemoteRepositoryPropertyTester extends PropertyTester {

	private static final String REPOSITORY_DESCRIPTOR_TESTER = "repository_descriptor";
	
	public RemoteRepositoryPropertyTester() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (Objects.equals(REPOSITORY_DESCRIPTOR_TESTER, REPOSITORY_DESCRIPTOR_TESTER) && receiver instanceof IProject project && project.isAccessible()) {
			return project.getFile(PullRepositoryProject.REPOSITORY_CONFIGURATION_FILE).exists();
		}
		return false;
	}

}
