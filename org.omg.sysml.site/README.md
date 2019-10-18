# Eclipse Installation

Requirements: Eclipse 2019-06 (4.12) or later, with Java Development Kit

## Installing the plugins

1. Open an Eclipse workspace.

2. Select `Help > Install New Software`.

3. Select `Add...` and then, in the add dialog, select `Local...` .

4. Navigate to the `org.omg.sysml.site` directory and select it. (You can give it a name if you wish.)

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

## Creating model files

1. Create Kernel Modeling Language (KerML) files in the `kerml/src` directory. The extension for a KerML file is `.kerml`.

2. Create Systems Modeling Language (SysML) files in the `sysml/src` directory. The extension for a SysML fiile is `.sysml`.

3. You can view the model library files in the `sysml.library` project, but *do not change them*.

3. After installation is complete, you can turn `Build Automatically` back on if you wish. However, if you ever experience excessive build times in either the KerML or SysML projects, do the following:

   * Cancel any ongoing build.
   * Turn `Build Automatically` off.
   * Click on the `sysml.library` project and select `Project > Build Project`.
   * Similarly rebuild the `kerml` and/or `sysml` projects as necessary.
   
**Release Note:** In the current implementation, there are cases in which the processing of a file with several name resolution errors can take a very long time, particularly if the `Quantities and Units` library is being used. This will be fixed in a future release.