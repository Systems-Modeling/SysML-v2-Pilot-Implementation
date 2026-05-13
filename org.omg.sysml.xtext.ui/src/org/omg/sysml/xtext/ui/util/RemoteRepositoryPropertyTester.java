/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2025 Model Driven Solutions, Inc.
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
