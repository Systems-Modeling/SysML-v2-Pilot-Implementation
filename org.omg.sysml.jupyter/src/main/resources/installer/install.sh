#!/bin/sh
set -e

echo "--- Step 1: Testing Conda installation ---"
command -v conda || (echo "Conda is not installed. Please install Conda and re-run." && return 1)
conda --version

echo "--- Step 2: Testing Java installation ---"
command -v java || (echo "Java is not installed. Please install Java and re-run." && return 1)
java -version

echo "--- Step 3: Installing dependencies into Conda environment ---"
conda install python=3.* jupyter=1.0.* -y
conda install graphviz=2.* -c conda-forge -y

echo "--- Step 4: Testing Python installation ---"
command -v python3 || (echo "Python 3 is not installed. Please manually install it." && return 1)

echo "--- Step 5: Installing SysML v2 Jupyter kernel ---"
jupyter kernelspec remove sysml -f || true
python3 install.py --sys-prefix --api-base-path=http://sysml2.intercax.com:9000 "--graphviz-path=$(command -v dot)" "$@"

echo "--- Step 6: Installing Jupyter notebook extension for codefolding ---"
conda install jupyter_contrib_nbextensions -c conda-forge -y
jupyter contrib nbextension install --sys-prefix
jupyter nbextension enable codefolding/main --sys-prefix

echo "--- Step 7: Running Jupyter environment ---"
echo "To launch Jupyter you can now run \"jupyter notebook\" from Command Prompt."
echo "Re-running this script is not necessary and will re-install the environment."
printf "\n\n"