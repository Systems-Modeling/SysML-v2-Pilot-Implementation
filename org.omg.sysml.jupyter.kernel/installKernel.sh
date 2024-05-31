#!/bin/sh

echo "--- Step 1: Testing Python installation ---"
if command -v python; then
     PYTHON="python"
else
    if command -v python3; then
        PYTHON="python3"
    else
        echo "Python is not installed. Please install Python and re-run."    
        exit 1
    fi
fi

command PYTHON --version

echo "--- Step 2: Testing Java installation ---"

if ! command -v java; then
    echo "Java is not installed. Please install Java and re-run."
    exit 1
fi

echo "--- Step 3: Building kernel ---"

./../mvnw.cmd prepare-package resources:copy-resources@create-kernel -pl "org.omg.sysml:jupyter-sysml-kernel" -am

echo "--- Step 4: Installing kernel ---"

PYTHON ./target/kernel/install.py