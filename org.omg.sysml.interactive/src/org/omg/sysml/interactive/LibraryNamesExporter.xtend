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
package org.omg.sysml.interactive

import java.util.Set
import org.omg.kerml.xtext.naming.KerMLQualifiedNameConverter
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Membership
import java.nio.file.Files
import java.io.File
import java.nio.file.Paths
import org.omg.sysml.lang.sysml.Namespace
import org.omg.sysml.lang.sysml.OwningMembership

class LibraryNamesExporter {
    
    static def main(String[] args){
        val SysMLInteractive instance = SysMLInteractive.getProfilingInstance()
        if (args.length <= 1) {
            System.out.println("Usage: ");
            System.out.println("SysMLInteractiveParsingProfiler <LIBRARY FOLDER> <FILENAME>")
        }
        instance.loadLibrary(args.get(0))
        
        
        val Set<String> shortNames = newHashSet
        
        instance.libraryResources.forEach[
            it.allContents.forEach[ el |
                if (el instanceof Namespace){
                   val nsQn = instance.getQualifiedNameProvider.getFullyQualifiedName(el)
                   if (nsQn !== null && !nsQn.empty){
                       shortNames.add(nsQn.lastSegment)
                       if (el.shortName !== null){
                           shortNames.add(el.shortName)
                       } 
                   }
                   for (mem: el.ownedMembership){
                      var memberName = 
                            if (mem instanceof OwningMembership) 
                                mem.memberElement?.declaredName // Note: Don't use effective name.
                            else mem.memberName
                       shortNames.add(memberName)
                       
                      var memberShortName = 
                            if (mem instanceof OwningMembership) 
                                mem.memberElement?.declaredShortName // Note: Don't use effective shortName.
                            else mem.memberShortName
                       shortNames.add(memberShortName)
                   }
                }
            ]            
            
//            val resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(it.URI)
//            val resourceDescription = resourceServiceProvider.getResourceDescriptionManager().getResourceDescription(it)
//            resourceDescription.exportedObjects.forEach[ sn |
//                shortNames.add(sn.qualifiedName.lastSegment)
//            ]
        ]
        
        System.out.println(getLibraryShortNamesClass(shortNames))
    }
    
    static def getLibraryShortNamesClass(Set<String> shortNames){
     '''
        import java.util.Set;
        
        public class LibraryShortNames {
            public static final Set<String> LIBRARY_SHORT_NAMES = Set.of(
                        «FOR name: shortNames SEPARATOR ', '»
                            "«name»"
                        «ENDFOR»
                    );
        }
     '''
    }
}