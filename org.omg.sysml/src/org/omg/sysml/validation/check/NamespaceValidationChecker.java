/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
 *******************************************************************************/

package org.omg.sysml.validation.check;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.NullExpression;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class NamespaceValidationChecker extends ElementValidationChecker {

	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateNamespaceDistinguishability(element, messageAccepter);
	}
	
	public void validateNamespaceDistinguishability(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Namespace namesp) {
		// Do not check distinguishability for automatically constructed expressions and binding connectors (to improve performance).
			if (!(namesp instanceof InvocationExpression || namesp instanceof FeatureReferenceExpression || namesp instanceof LiteralExpression || 
					namesp instanceof NullExpression || namesp instanceof BindingConnector)) {
				// NOTE: Does not check distinguishibility for imported Memberships.
				var ownedMemberships = namesp.getOwnedMembership();
				var owningMemberships = ownedMemberships.stream().filter(OwningMembership.class::isInstance).toList();
				var aliasMemberships = ownedMemberships.stream().filter(m->!(m instanceof OwningMembership)).toList();
				
				var owningMembershipMap = createNameMap(owningMemberships);
				for (var mem: owningMemberships) {
					checkDistinguishibility(namesp, mem, owningMembershipMap, "validateNamespaceDistinguishablity_1", messageAccepter);		
				}
				
				var aliasMembershipMap = createNameMap(aliasMemberships);
				for (var mem: aliasMemberships) {
					checkDistinguishibility(namesp, mem, owningMembershipMap, "validateNamespaceDistinguishablity_2", messageAccepter);
					checkDistinguishibility(namesp, mem, aliasMembershipMap, "validateNamespaceDistinguishablity_3", messageAccepter);
				}
				if (namesp instanceof Type type) {
					var inheritedMemberships = type.getInheritedMembership();
					var inheritedMembershipMap = createNameMap(inheritedMemberships);
					for (var mem: ownedMemberships) {
						checkDistinguishibility(namesp, mem, inheritedMembershipMap, "validateNamespaceDistinguishablity_4", messageAccepter);
					}
					checkDistinguishibility(namesp, inheritedMembershipMap, "validateNamespaceDistinguishablity_4", messageAccepter);
				}
			}
		}
	}

	protected Map<String, Set<Membership>> createNameMap(List<Membership> memberships) {
		var nameMap = new HashMap<String, Set<Membership>>();
		for (var mem: memberships) {
			var shortName = mem.getMemberShortName();
			var name = mem.getMemberName();
			if (shortName != null) {
				var mems = nameMap.get(shortName);
				if (mems == null) {
					mems = new HashSet<>();
					nameMap.put(shortName, mems);
				}
				mems.add(mem);
			}
			if (name != null) {
				var mems = nameMap.get(name);
				if (mems == null) {
					mems = new HashSet<>();
					nameMap.put(name, mems);
				}
				mems.add(mem);
			}
		}
		return nameMap;	
	}
	
	protected void checkDistinguishibility(Namespace namesp, Membership mem, Map<String, Set<Membership>> nameMap, String msg, ValidationMessageAccepter messageAccepter) {
		var memShortName = mem.getMemberShortName();
		var memName = mem.getMemberName();
		var memElement = mem.getMemberElement();
		
		if (memShortName != null) {
			var dups = nameMap.get(memShortName);
			if (dups != null) {
				dups.removeIf(m->m.getMemberElement() == memElement);
			}			
			if (dups != null && !dups.isEmpty()) {
				var msgDups = identifyDuplicates(msg, namesp, memShortName, dups);
				if (mem instanceof OwningMembership owning) {
					messageAccepter.warning(owning.getOwnedMemberElement(), SysMLPackage.eINSTANCE.getElement_DeclaredShortName(), msg, msgDups);
				} else {
					messageAccepter.warning(mem, SysMLPackage.eINSTANCE.getMembership_MemberShortName(), msg, msgDups);
				}
			}
		}
		if (memName != null) {
			var dups = nameMap.get(memName);
			if (dups != null) {
				dups.removeIf(m->m.getMemberElement() == memElement);
			}			
			if (dups != null && !dups.isEmpty()) {
				var msgDups = identifyDuplicates(msg, namesp, memName, dups)	;		
				if (mem instanceof OwningMembership owning) {
					messageAccepter.warning(owning.getOwnedMemberElement(), SysMLPackage.eINSTANCE.getElement_DeclaredName(), msg, msgDups);
				} else {
					messageAccepter.warning(mem, SysMLPackage.eINSTANCE.getMembership_MemberName(), msg, msgDups);
				}
			}
		}
	}
	
	protected void checkDistinguishibility(Namespace namesp, Map<String, Set<Membership>> nameMap, String msg, ValidationMessageAccepter messageAccepter) {
		nameMap.forEach((name, dups)->{
			if (dups.size() > 1 && dups.stream().map(Membership::getMemberElement).collect(Collectors.toSet()).size() > 1) {
				var msgDups = identifyDuplicates(msg, namesp, name, dups);
				messageAccepter.warning(namesp, null, msg, msgDups);
			}
		});
	}
	
	protected String identifyDuplicates(String msg, Namespace memNs, String name, Set<Membership> dups) {
		var nsNames = dups.stream().
						map(Membership::getMembershipOwningNamespace).filter(ns->ns != memNs).
						map(Namespace::getName).map(n->n == null? "": n).sorted().
						map(n->ElementUtil.escapeName(n)).toList();
		return nsNames.isEmpty()? "":" '" + ElementUtil.escapeString(name) + "' from " + String.join(",", nsNames);
	}
	
}
