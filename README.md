# SySML v2 Pilot Implementation Protoyping

## Installation Instructions

### Development Environment

1. Install Eclipse 4.7 (Oxygen) and Xtext.
   * If you are installing Eclipse fresh, the easiest approach is to just install the “Eclipse IDE for Java and DSL Development” package, which includes Xtext.
      * http://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/oxygen2
      
   * Alternatively, you can install the “Eclipse Modeling Tools” package (which includes other modeling capabilities, like UML, that you don’t need now but will likely be useful in the future), and install Xtext into that (per below).
      * http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/oxygen2
      
   * To install Xtext into an existing Eclipse 4.7 instance, select Help > Install New Software, use the update site URLgiven below, and install “Xtext Complete SDK” (under General Purpose Tools).
      * http://download.eclipse.org/releases/oxygen

2. Clone our GitHub repository from the URL below.
   * https://github.com/ModelDriven/SySML-v2-Pilot-Implementation.git

3. Import all projects from the repository into your Eclipse workspace. The should included the projects org.omg.sysml and org.omg.sysml.xtext,
with associated ide, tests, ui and ui.tests projects for each.

### Prototype Alf Implementation

1. Find the file org.omg.sysml/src/org.omg.sysml/GenerateAlf.mwe2, right click on it, and select Run As > MWE2 Workflow, to execute the Xtext generator.
   * NOTE: Even if the generation completes successfully, there may still be error annotations on the files Alf.xtext and KerML.ecore. You can ignore these for now, they should not affect the running of the generated editor.

2. Once the generation is complete, right click on project org.omg.sysml, and select Run As > Eclipse Application. This should launch a new runtime Eclipse instance.

3. Create a project in the runtime Eclipse workspace and Import the sample Alf file into it, using Import > File System and browsing to the samples subdirectory of the org.omg.sysml project under your Git working directory. 
(Or you can create your own file, with the extension “.alf”.)

4. Double clicking on the sample Alf file should open it in the generated Xtext Alf editor.
 
