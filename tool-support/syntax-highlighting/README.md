# KerML and SysML language definitions for non-Eclipse editors

This project contains language definition files to enable syntax highlighting in other editors than Eclipse.

The language definition files for other editors are auto-generated from the `xtext` source. Currently, the generator
supports the following environments:

- *Visual Studio Code*
- *JetBrains* IDEs, e.g. *PyCharm*
- *JupyterLab* and *Jupyter Notebook* web apps

## Installation for Visual Studio Code (VS Code)

In order to use the KerML and SysML grammars for syntax highlighting with *VS Code* perform the following steps:

1. Install the latest **VS Code** from https://code.visualstudio.com/
2. Open the `extensions` installation folder
    - On Windows: `%localappdata%\Programs\Microsoft VS Code\resources\app\extensions`
    - On macOS: `/Applications/Visual Studio Code.app/Contents/Resources/app/extensions`
3. Copy the folders `kerml` and `sysml` from the `vscode` folder into the `extensions` installation folder
4. Start **VS Code**

If you want similar colors as in the SysML training examples, add the following settings to **VS CODE**:

- Select menu *File > Preferences > Settings*
- Select the tab *User* for global settings or *Workspace* for settings limited to the current project
- In the *Search Bar* at the top enter `Token Color`
- In the search results click `Edit in settings.json` under *Token Color Customizations*

Once the `settings.json` file is open, insert the following snippet (please, exclude the outer curly brackets, and
insert a comma where needed):

```json
{
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
  }
}
```

... and save the file.

Open a `.kerml` source file and a `.sysml` source file to verify that syntax coloring works.

## Installation for JetBrains IDEs

In order to use the KerML and SysML grammars for syntax highlighting with a *JetBrains IDE* perform the following steps:

1. Close any running *JetBrains IDE*.
2. Open the `filetypes` settings folder:
    - On Windows: `%APPDATA%\JetBrains\<product><version>\settingsRepository\repository\filetypes`
    - On macOS: `~/Library/Application Support/JetBrains/<product><version>/settingsRepository/repository/filetypes`
    - E.g. for *PyCharm version 2020.1* `<product><version>` is `PyCharm2020.1`.
3. Open `$GIT_REPO_DIR/tool-support/syntax-highlighting/jetbrains`.
4. Copy the files `KerML.xml` and `SysML.xml` from above `jetbrains` folder into the `filetypes` folder.
5. Start your *JetBrains IDE*.

If needed, you can experiment with the language settings through menu *File > Settings ... > Editor > File Types*. Look
for the *OMG Kernel Modeling Language* or *OMG Systems Modeling Language* settings.

## Installation for JupyterLab and Jupyter Notebook (inside this git repo)

In order to prepare for a release of the JupyterLab and Jupyter Notebook modules, just run the generator script, as
indicated below:

    $ cd $GIT_REPO_DIR/tool-support/syntax-highlighting
    $ python xtext_grammar_converter.py

The files `mode.ts` and `kernel.js` are auto-generated from their respective template files:

- `./jupyter/mode_template.ts`
- `./jupyter/kernel_template.js`

For both templates the `$KEYWORDS` and `$DEF_KEYWORDS` placeholders get replaced with the lists of (def) keywords
extracted from the `xtext` grammars. The additional data file `./jupyter/additional_def_keywords.txt` is used to manually
define a collection of definition keywords that should be included in the replacement of `$DEF_KEYWORDS`. See the
comments inside that data file for instructions.

After generation is completed, the resulting files are copied to their target locations:

- `mode.ts` to `$GIT_REPO_DIR/org.omg.sysml.jupyter.jupyterlab/src/main`
- `kernel.js` to `$GIT_REPO_DIR/org.omg.sysml.jupyter.kernel/src/main/resources/kernel`

Adaptations to the source code should be made in the respective template files.

## Generate up-to-date Language Definition Files from `xtext` source grammars

To update the language definition files from the `xtext` source grammars in their respective repository folders, run the
Python (v3) script `xtext_grammar_converter.py` as follows:

    $ cd $GIT_REPO_DIR/tool-support/syntax-highlighting
    $ python xtext_grammar_converter.py

This updates the following language definition files in sub-folders of
`$GIT_REPO_DIR/tool-support/syntax-highlighting`:

- `./vscode/kerml/syntaxes/kerml.tmLanguage.json`
- `./vscode/sysml/syntaxes/sysml.tmLanguage.json`
- `./jetbrains/KerML.xml`
- `./jetbrains/SysML.xml`
- `./jupyter/mode.ts`
- `./jupyter/kernel.js`

## Known Issues

None.

## Release Notes

### Release 2021-05

2021-06-07: ST6RI-365 Added syntax highlighting generation for semi-automated builds / preparation for release.

2021-05-14: ST6RI-286 Added support for JupyterLab and Jupyter Notebook and updated for release 2021-04

2021-04-08: Updated for release 2021-03 of the KerML and SysML `xtext` language definitions.

2020-10-15: Updated for release 2020-09 of the KerML and SysML `xtext` language definitions.

2020-06-22: First release, based on the 2020-06 release of the KerML and SysML `xtext` language definitions.
