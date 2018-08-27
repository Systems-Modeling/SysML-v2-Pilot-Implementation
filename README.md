# SysML v2 Pilot Implementation Protoyping

## Installation Instructions

### Development Environment

#### Install using oomph

The project provides a configuration file for the [Eclipse Installer](https://wiki.eclipse.org/Eclipse_Installer) which eases the creation of reproducible development environments. 

1. Clone our GitHub repository from the URL below.
   * https://github.com/ModelDriven/SySML-v2-Pilot-Implementation.git
   
2. Open Eclipse Installer and switch to Advanced mode:
![switch to advanced mode](http://www.vogella.com/tutorials/Oomph/img/xoomph-installer.png.pagespeed.ic.nXWhT84AWo.webp)

3. In the product list, select "Eclipse Modeling Tools" with Oxygen version

4. Add the Sysml2 project as user project by selecting the setup file from the local git repository
   * e.g. `file:/C:/git/sysml/SysML-v2-Pilot-Implementation/org.omg.sysml.installer/SysML2.setup`

5. Make sure it's selected:
![oomph projects](oomph-projects.png)

6. On the next page, set the location of the local git repository, then press finish

#### Manual installation

1. Install Eclipse 4.7 (Oxygen) and Xtext.
   * If you are installing Eclipse fresh, the easiest approach is to just install the “Eclipse IDE for Java and DSL Development” package, which includes Xtext.
      * http://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/oxygen2
      
   * Alternatively, you can install the “Eclipse Modeling Tools” package (which includes other modeling capabilities, like UML, that you don’t need now but will likely be useful in the future), and install Xtext into that (per below).
      * http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/oxygen2
      
   * To install Xtext into an existing Eclipse 4.7 instance, select Help > Install New Software, use the update site URLgiven below, and install “Xtext Complete SDK” (under General Purpose Tools).
      * http://download.eclipse.org/releases/oxygen

2. Clone our GitHub repository from the URL below.
   * https://github.com/ModelDriven/SySML-v2-Pilot-Implementation.git

3. Import all projects from the repository into your Eclipse workspace. The should included the projects `org.omg.sysml`, `org.sysml.owl` 
and `org.omg.sysml.usage`, with associated `ide`, `tests`, `ui` and `ui.tests` projects for each.

### Prototype Alf Implementation

1. Find the file `org.omg.sysml/src/org.omg.sysml/GenerateAlf.mwe2`, right click on it, and select Run As > MWE2 Workflow, to execute the Xtext generator.

2. Once the generation is complete, right click on project `org.omg.sysml`, and select Run As > Eclipse Application. This should launch a new runtime Eclipse instance.

3. Add the SysML-v2-Pilot-Implementation Git repository (already cloned previously) to the runtime Eclipse instance.

4. Import the project `sysml` into the runtime Eclipse workspace.

5. Double clicking on any `.alf` file in the sysml project should open it in the generated Xtext Alf editor.
 
## Copyright License Header

#### For new code
Set up a Jave code template as follows:
1. Window > Preferences (Mac-OS: Eclipse > Preferences)
2. Java > Code Style > Code Templates
3. Code > New Java files > Edit
4. **Prepend** (insert above the existing content) the following and modify the second line:
    ```
    /**
     * SysML 2 Pilot Implementation
     * Copyright (C) 2018  California Institute of Technology ("Caltech")
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
    ```
5. Apply > OK

#### For existing code
* When modifying existing code created by someone in a different organization, add a new copyright line, without changing anything else in the header.

#### Sources
* [GNU GPL v3.0 - How to Apply These Terms to Your New Programs](https://www.gnu.org/licenses/gpl-3.0.en.html)
* [Using the SPDX License List for Tagging and Linking](https://hakre.wordpress.com/2012/07/25/using-the-spdx-license-list-for-tagging-and-linking/)
