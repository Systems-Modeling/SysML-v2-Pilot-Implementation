/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018, 2019 California Institute of Technology/Jet Propulsion Laboratory
 * Copyright (c) 2019 Model Driven Solutions
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
 *  Zoltan Kiss, IncQuery
 *  Balazs Grill, IncQuery
 *  Miyako Wilson, JPL
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.testing.util.ParseHelper
import org.omg.sysml.lang.sysml.Package
import org.eclipse.emf.common.util.URI

class Dependency {
	
	public static final String LIBRARY_BASE_PATH = "library/Base.alf";

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;

	@Inject
	ParseHelper<Package> parseHelper
	
	// Loads Base library file, which has elements that are needed for default specializations
	public def ResourceSetImpl getLibraryBasePackage() {
		val rs = resourceSetProvider.get
		rs.getResource(URI.createFileURI(LIBRARY_BASE_PATH), true)
		rs
	}

	// Basic import file most of the tests use this
	public def ResourceSetImpl getDependencyOuterPackage() {
		val rs = getLibraryBasePackage
		parseHelper.parse(
		'''package OuterPackage{
				class A{
					class a1{}
				}
				class B{
					feature b: A;
				}
			}''', rs)
		return rs
	}
	
	// Basic import file most of the tests use this
	public def ResourceSetImpl getDependencyOuterPackage2() {
		val rs = getLibraryBasePackage
		parseHelper.parse(
		'''package OuterPackage{
				class A{
					class a1{
						class aa1{}
					}
				}
				class B{
					feature b: A;
				}
			}''', rs)
		return rs
	}

	// It's for the multiple import tests
	public def ResourceSetImpl getDependencyMultipleImport() {
		val rs = getDependencyOuterPackage
		parseHelper.parse('''
			package OuterPackage2{
				import OuterPackage::*;
				class C specializes B{
					feature c;
				}
			}
		''', rs)
		return rs
	}

	// It's for the multiple import tests as membeship import
	def ResourceSetImpl getDependencyMultipleMembership() {
		val rs = getDependencyOuterPackage

		parseHelper.parse('''
			package OuterPackage2{
				import OuterPackage::B;
				class C specializes B{
					feature c;
				}
			}
		''', rs)
		return rs
	}

	// It's for the multiple import (3x) tests as membeship import
	def ResourceSetImpl getDependencyMultipleMembership2() {
		val rs = getDependencyMultipleMembership
		parseHelper.parse('''
			package OuterPackage3{
				import OuterPackage2::C;
				class D specializes C{
					feature f : b;
				}
			}
		''', rs)
		return rs
	}

	// It's for the shadowing tests 
	def ResourceSetImpl getDependencyAlias() {
		val rs = getLibraryBasePackage
		parseHelper.parse('''
			package PackageAlias1{
				A_alias is A;
				class A{
					class a{}
					a_alias is a;
				}
				AA_alias is AA;
				class AA{
					class aa{}
					aa_alias is aa;
				}
			}
		''', rs)
		parseHelper.parse('''
			package PackageAlias2{
				import PackageAlias1::*;
				class B specializes A_alias{
					class b is a_alias{}
				}
			}
		''', rs)
		return rs
	}

	// It's for the shadowing tests 
	def ResourceSetImpl getDependencySameNamesImport() {
		val rs = getLibraryBasePackage
		parseHelper.parse('''
			package SamePackage{
				class container{
					class A{}
				}
			}
		''', rs)
		parseHelper.parse('''
			package SamePackage{
				class container{
					class B{}
				}
			}
		''', rs)
		return rs
	}

	// The Visibility tests use this source
	def ResourceSetImpl getDependencyVisibilityPackage() {
		val rs = getLibraryBasePackage
		parseHelper.parse('''
		package VisibilityPackage {
			private class c_Private{
				private class c_private{}
				public class c_public{}
			}
			
			public class c_Public{
				private class c_private{}
				public class c_public{}
			}
			
			public class c_Public_alias{
				public class c_public{}
				private class alias_private is c_public;
				public class alias_public is c_public;
			}
			
			private class c_Private_alias{
				public class c_public{}
				private class alias_private is c_public;
				public class alias_public is c_public;
			}
			
			public class c_clazz{
				protected class c_Protect{
					public class c_publicc{}
				}
				packaged class c_Package{
					public class c_publicc{}
				}
				
				public class c_Public{
					protected class c_protect{}
					packaged class c_packagee{}
				}
			}
		}''', rs)
		return rs
	}
}
