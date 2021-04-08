# KerML and SysML language definitions for non-Eclipse IDEs

This project contains language definition files to enable syntax highlighting in IDEs other than Eclipse.

The language definition files for other IDES are auto-generated. Currently the following IDEs are supported:
- *Visual Studio Code*
- *JetBrains* IDEs, e.g. *PyCharm*
 
## Installation for Visual Studio Code (VS Code)

In order to use the KerML and SysML grammars for syntax highlighting with *VS Code* perform the following steps:

1. Install the latest **VS Code** from https://code.visualstudio.com/
2. Open the `extensions` installation folder
   - On Windows: `%localappdata%\Programs\Microsoft VS Code\resources\app\extensions`
   - On MacOS: `/Applications/Visual Studio Code.app/Contents/Resources/app/extensions`
3. Copy the folders `kerml` and `sysml` from the `vscode` folder into the `extensions` installation folder
4. Start **VS Code**

If you want similar colors as in the SysML training examples, add the following settings to **VS CODE**:
- Select menu *File > Preferences > Settings*
- Select the tab *User* for global settings or *Workspace* for settings limited to the current project
- In the *Search Bar* at the top enter `Token Color`
- In the search results click `Edit in settings.json` under *Token Color Customizations*

Once the `settings.json` file is open, insert the following snippet:
```json
  "editor.tokenColorCustomizations": {
    "comments": "#20a060",
    "variables": "#0000ff",
    "strings": "#c00000",
    "textMateRules": [
      {
        "scope": "keyword",
        "settings": {
          "foreground": "#7b0050",
          "fontStyle": "bold"
        }
      },
      {
        "scope": "keyword.operator",
        "settings": {
          "foreground": "#7b0050",
          "fontStyle": "bold"
        }
      },
      {
        "scope": "keyword.control",
        "settings": {
          "foreground": "#7b0050",
          "fontStyle": "bold"
        }
      }
    ]
  },
```
... and save the file.

Open a `.kerml` source file and a `.sysml` source file to verify that syntax coloring works.

## Installation for JetBrains IDEs

In order to use the KerML and SysML grammars for syntax highlighting with a *JetBrains IDE* perform the following steps:

1. Close any running *JetBrains IDE*.
2. Open the `filetypes` settings folder:
   - On Windows: `%APPDATA%\JetBrains\<product><version>\settingsRepository\repository\filetypes`
   - On MacOS: `~/Library/Application Support/JetBrains/<product><version>/settingsRepository/repository/filetypes`
   - E.g. for *PyCharm version 2020.1* `<product><version>` is `PyCharm2020.1`.
3. Open `MY_GIT_FOLDER/SysML-v2-Pilot-Implementation/tool-support/syntax-highlighting/jetbrains`.
4. Copy the files `KerML.xml` and `SysML.xml` from above `jetbrains` folder into the `filetypes` folder.
5. Start your *JetBrains IDE*.

If needed, you can experiment with the language settings through menu *File > Settings ... > Editor > File Types*. 
Look for the *OMG Kernel Modeling Language* or *OMG Systems Modeling Language* settings.

## Update TextMate and JetBrains Language Definition Files

To update the language definition files from the `KerML.xtext` and `SysML.xtext` source grammars 
in their respective repository folders, run the Python (v3) script `xtext_grammar_converter.py` as follows:

    $ cd MY_GIT_FOLDER/SysML-v2-Pilot-Implementation/tool-support/syntax-highlighting
    $ python xtext_grammar_converter.py

This updates the following language definition files:
- `MY_GIT_FOLDER/SysML-v2-Pilot-Implementation/tool-support/syntax-highlighting/vscode/kerml/syntaxes/kerml.tmLanguage.json`
- `MY_GIT_FOLDER/SysML-v2-Pilot-Implementation/tool-support/syntax-highlighting/vscode/sysml/syntaxes/sysml.tmLanguage.json`
- `MY_GIT_FOLDER/SysML-v2-Pilot-Implementation/tool-support/syntax-highlighting/jetbrains/KerML.xml`
- `MY_GIT_FOLDER/SysML-v2-Pilot-Implementation/tool-support/syntax-highlighting/jetbrains/SysML.xml`

## Known Issues

None.

## Release Notes

### Release 2021-03

2021-04-08: Updated for release 2021-03 of the KerML and SysML `xtext` language definitions.
2020-10-15: Updated for release 2020-09 of the KerML and SysML `xtext` language definitions.
2020-06-22: First release, based on the 2020-06 release of the KerML and SysML `xtext` language definitions.
