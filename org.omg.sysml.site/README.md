# SysML v2 Release 2020-03 Eclipse Installation

**Requirements:** Eclipse 2019-12 (4.14) or later, with Java Development Kit

## Installing the plugins

1. Open an Eclipse workspace.

2. Select `Help > Install New Software`.

3. Select `Add...` and then, in the add dialog, select `Archive...` .

4. Navigate to the `org.omg.sysml.site-0.3.0.zip` archive and select it. (You can give it a name if you wish.)

5. In the Install window, select the `KerML and SysML Editors` category and click `Next`.

6. Continue with the installation, and, when it is complete, restart Eclipse.

## Installing the model library and modeling projects

1. Select `File > Import`.

2. Under `General`, choose `Existing Projects into Workspace`.

3. Browse to the `sysml.library` directory and select it.

4. Under `Projects`, select `sysml.library`, under `Options` select `Copy projects into workspace`, then click `Finish`.

5. Turn off `Project > Build Automatically`, then select `Project > Clean...` and build *only* `sysml.library`.

6. Repeat the above steps for the `kerml` and `sysml` projects.

**Important Note:** Import the `kerml` and `sysml` projects *only* after importing and building the `sysml.library` project.

After installation is complete, if you wish to turn `Build Automatically` back on, first go to `Preferences > General > Workspace > Build`
and make sure that `sysml.library` is before `kerml` and `sysml` in the build order.

## Creating model files

1. Create Kernel Modeling Language (KerML) files in the `kerml/src` directory. The extension for a KerML file is `.kerml`.

2. Create Systems Modeling Language (SysML) files in the `sysml/src` directory. The extension for a SysML fiile is `.sysml`.

3. You can view the model library files in the `sysml.library` project, but *do not change them*.
   
**Release Note:** In the current implementation, there are cases in which the processing of a file with several name resolution errors can take a very long time, 
particularly if the `Quantities and Units` library is being used. This will be fixed in a future release.

## Graphical visualization

This release includes a prototype graphical visualization capability with diagrams rendered using the open source [PlantUML](https://plantuml.com) tooling.

1. PlantUML visualization requires that [GraphViz](https://www.graphviz.org) be installed. Visit [ https://www.graphviz.org/download/](https://www.graphviz.org/download/) 
and download the appropriate package for your environment.

2. If Eclipse cannot automatically find the path to the GraphViz executable, you can set it by going to `Preferences > PlantUML`. 
For details, visit [ https://plantuml.com/en/eclipse](https://plantuml.com/en/eclipse).

3. To show SysML diagrams, in `Window > Show View > Other...` select the PlantUML view. The diagram rendered in the view is relative to the text selected 
in the active SysML editor view. Basic block definition (class) and state machine diagrams are currently supported.

