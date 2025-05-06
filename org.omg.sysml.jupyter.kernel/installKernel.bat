@echo off

echo --- Step 1: Testing Python installation ---
where python
if errorlevel 1 (
    goto :python3
)
set PYTHON = "python"
goto :python-ok

:python3
where python3
if errorlevel 1 (
    echo Python is not installed. Please install Python and re-run.
    goto :error
)
set PYTHON = "python3"

:python-ok

call PYTHON --version || goto :error

echo --- Step 2: Testing Java installation ---
where java
if errorlevel 1 (
    echo Java is not installed. Please install Java and re-run.
    goto :error
)

call java -version || goto :error

echo --- Step 3: Building kernel ---
call ..\mvnw.cmd prepare-package resources:copy-resources@create-kernel -pl "org.omg.sysml:jupyter-sysml-kernel" -am

echo --- Step 4: Installing kernel ---
call PYTHON .\target\kernel\install.py

:error
pause