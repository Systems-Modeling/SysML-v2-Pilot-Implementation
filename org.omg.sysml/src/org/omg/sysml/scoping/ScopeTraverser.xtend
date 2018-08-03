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

import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.naming.QualifiedName
import org.omg.sysml.lang.sysml.Element

class ScopeTraverser {
	
	public static def ScopeTraverser create(){
		new ScopeTraverser(
			new InheritanceScopeTraversalFragment,
			new LocalScopeTraversalFragment,
			new ImportScopeTraversalFragment,
			new MembershipScopeTraversalFragment
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
	
	@Data
	static class TraversalEntry{
		QualifiedName qualifiedName
		Element element
		Iterable<Element> path
	}
	
	private def <E> boolean contains(Iterable<E> iterable, E element){
		return iterable.exists[equals(element)]
	}
	
	def accept(Element element, (QualifiedName, Element)=>void visitor){
		val queue = newLinkedList()
		queue += new TraversalEntry(QualifiedName.create(), element, #{element})
		
		while(!queue.isEmpty){
			val context = queue.pop
			
			traversalFragment.traverseScope(context.element, [qn, e |
				visitor.apply(context.qualifiedName.append(qn), e)
			], [qn, e |
				if (!context.path.contains(e)){
					queue += new TraversalEntry(context.qualifiedName.append(qn), e, context.path + #{e})
				}
			])
		}
	}
	
}