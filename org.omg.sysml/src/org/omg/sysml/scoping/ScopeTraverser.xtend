/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
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
 *  Zoltan Kiss
 *  Balazs Grill
 * 
 *****************************************************************************/
package org.omg.sysml.scoping

import org.eclipse.xtext.naming.QualifiedName
import org.omg.sysml.lang.sysml.Element

class ScopeTraverser {
	
	public static def ScopeTraverser create(){
		new ScopeTraverser(
			new InheritanceScopeTraversalFragment,
			new LocalScopeTraversalFragment,
			new ImportScopeTraversalFragment
			
		)
	}
	
	public static def ScopeTraverser create2(){
		new ScopeTraverser(
			new LocalScopeTraversalFragment,
			//new InheritanceScopeTraversalFragment
			new ImportScopeTraversalFragment
			//new InheritanceScopeTraversalFragment
		)
	}
	
	private static class CompositeTraversalFragment implements IScopeTraversalFragment{
		val IScopeTraversalFragment[] fragments;
		
		new (IScopeTraversalFragment... traversalFragments){
			fragments = traversalFragments;
		}
		
		override traverseScope(Element context, (QualifiedName, Element)=>void visitor, (QualifiedName, Element)=>void follow) {
			fragments.forEach[
				it.traverseScope(context, visitor, follow)
			]
		}
		
	}
	
	private val IScopeTraversalFragment traversalFragment;
	
	private new(IScopeTraversalFragment traversalFragment){
		this.traversalFragment = traversalFragment
	}
	
	new(IScopeTraversalFragment... traversalFragments){
		this.traversalFragment = new CompositeTraversalFragment(traversalFragments)
	}
	
	def accept(Element element, (QualifiedName, Element)=>void visitor){
		val queue = newLinkedList()
		queue += (QualifiedName.create() -> element)
		val visited = newHashSet()
		
		while(!queue.isEmpty){
			val context = queue.pop
			visited.add(context)
			
			traversalFragment.traverseScope(context.value, [qn, e |
				visitor.apply(context.key.append(qn), e)
			], [qn, e |
				if (!visited.contains(e)){
					queue += (context.key.append(qn) -> e)
				}
			])
		}
	}
	
}