# Installation

## All Operating Systems

1. Install Java 8+, e.g. [OpenJDK 11](https://adoptopenjdk.net/index.html?variant=openjdk11&jvmVariant=hotspot).
    * You can check the Java version you have installed by running `java -version` in Terminal (Linux / macOS) or Command Prompt (Windows). See [How to Check if Java is Installed](https://www.baeldung.com/java-check-is-installed).
2. Install [Miniconda](https://docs.conda.io/en/latest/miniconda.html) with Python version 3.x.
    * You can check the Conda version you have installed by running `conda --version` in Terminal (Linux / macOS) or Command Prompt (Windows). See [Managing conda](https://docs.conda.io/projects/conda/en/latest/user-guide/getting-started.html#managing-conda).

## Linux

1. Run the included `install.sh` script. See [How to run .sh in Linux](https://www.computerhope.com/issues/ch001648.htm).
    * Open a Terminal window (Ctrl+Alt+T).
    * Run `cd <install-directory>`, replacing *<install-directory>* with the complete path to the installation directory.
    * Run `chmod +x ./install.sh`.
    * Run `./install.sh`.
2. Start Jupyter Notebook
    * Run `cd <notebook-directory>`, replacing *<notebook-directory>* with the complete path to the root directory for your notebooks.
    * Run `jupyter notebook`.
    * Jupyter Notebook will start in a browser window.

## macOS

1. Run the included `install.sh` script. 
    * Open a Terminal window. See [How to Open a Terminal Window in Mac](https://www.wikihow.com/Open-a-Terminal-Window-in-Mac).
    * Run `cd <install-directory>`, replacing *<install-directory>* with the complete path to the installation directory.
    * Run `chmod +x ./install.sh`. See [Make a file executable in Terminal on Mac](https://support.apple.com/guide/terminal/make-a-file-executable-apdd100908f-06b3-4e63-8a87-32e71241bab4/mac).
    * Run `./install.sh`.
2. Start Jupyter Notebook
    * Run `cd <notebook-directory>`, replacing *<notebook-directory>* with the complete path to the root directory for your notebooks.
    * Run `jupyter notebook`.
    * Jupyter Notebook will start in a browser window.

## Windows
1. Run the included `install.bat` script.
    * Double click `install.bat` from File Explorer. See [How to run a batch file on Windows 10](https://www.windowscentral.com/how-create-and-run-batch-file-windows-10#run_batch_file_windows10).
    * Alternatively use Run or Command Prompt. See [How to Run a Batch File from the Command Line on Windows](https://www.wikihow.com/Run-a-Batch-File-from-the-Command-Line-on-Windows).
2. Start Jupyter Notebook
    * Open Command Prompt.
    * Run `cd <notebook-directory>`, replacing *<notebook-directory>* with the complete path to the root directory for your notebooks.
    * Run `jupyter notebook`.
    * Jupyter Notebook will start in a browser window.
    