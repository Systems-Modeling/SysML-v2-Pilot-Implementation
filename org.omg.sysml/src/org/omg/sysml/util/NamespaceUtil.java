/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.util;

import java.util.stream.Stream;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.impl.NamespaceImpl;

public class NamespaceUtil {
	
	private NamespaceUtil() {
	}

	public static <M extends Membership, T> Stream<T> getOwnedMembersByMembershipIn(Namespace namespace, Class<M> kind, Class<T> type) {
		return namespace.getOwnedMembership().stream().
				filter(kind::isInstance).
				map(Membership::getOwnedMemberElement).
				filter(type::isInstance).
				map(type::cast);
	}

	public static Membership addOwnedMemberTo(Namespace namespace, Element element) {
		Membership membership = SysMLFactory.eINSTANCE.createMembership();
		membership.setOwnedMemberElement_comp(element);
		namespace.getOwnedMembership_comp().add(membership);
		return membership;
	}

	public static <M extends Membership, T> Stream<T> getMembersByMembershipIn(Namespace namespace, Class<M> kind, Class<T> type) {
		return namespace.getMembership().stream().
				filter(kind::isInstance).
				map(Membership::getMemberElement).
				filter(type::isInstance).
				map(type::cast);
	}

	public static void clearCachesOf(Namespace namespace) {
		((NamespaceImpl)namespace).clearCaches();
	}

}
