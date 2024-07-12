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

import com.google.gson.GsonBuilder
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.util.EcoreUtil
import org.omg.sysml.lang.sysml.Namespace
import org.omg.kerml.xtext.library.LibraryIndex

class LibraryNamesExporter {
    
    static def void main(String[] args){
        LibraryIndex.disable
        val SysMLInteractive instance = SysMLInteractive.getProfilingInstance()
        instance.loadLibrary(args.get(0))
        
        val Map<String, Set<String>> shortNames = newHashMap
        
        instance.libraryResources.forEach [
            EcoreUtil.resolveAll(it)
            it.allContents.forEach [ el |
                if (el instanceof Namespace) {
                    val nsQn = el.qualifiedName
                    if (nsQn !== null && !nsQn.empty) {
                        for (mem : el.membership) {
                            val memberName = mem.memberName
                            val memberShortName = mem.memberShortName
                            val memberElementDeclaredName = mem.memberElement?.declaredName
                            val memberElementDeclaredShortName = mem.memberElement?.declaredShortName
                            
                            shortNames.addIfNotNull(nsQn, memberName)
                            shortNames.addIfNotNull(nsQn, memberShortName)
                            shortNames.addIfNotNull(nsQn, memberElementDeclaredName)
                            shortNames.addIfNotNull(nsQn, memberElementDeclaredShortName)
                        }
                    }
                }
            ]            
        ]
        
        //prettyPrinting makes the .json readable, but results in a larger file size: ~25% larger in this case.
        val gson = new GsonBuilder()
            .disableHtmlEscaping
            //.setPrettyPrinting
            .create
            
        val json = gson.toJson(shortNames);
       
       Files.write(Paths.get("../org.omg.kerml.xtext/src-gen/org/omg/kerml/xtext/library/LibraryIndex.json"), json.bytes)
    }
    
    static def addIfNotNull(Map<String, Set<String>> names, String ns, String name){
        if (name !== null) {
            names.computeIfAbsent(ns, [newHashSet]).add(name)
        }
    }
}