# Deployment

The following are the steps for a reference deployment of the SysML v2 Jupyter tooling in a multi-tenant JupyterHub environment.

## Prerequisites

* Server running a Linux distribution, e.g. Ubuntu 20.04
* [The Littlest JupyterHub](https://tljh.jupyter.org/en/latest/)
* Java 11

## Steps

1. Build Jupyter assets on local machine.

```shell
cd /path/to/SysML-v2-Pilot-Implementation/
git checkout master && git fetch && git pull
# verify Java 11
# java --version
./mvnw clean package
```

2. Upload Jupyter assets to server via SCP.

```shell
export KEY_PATH=/path/to/private-key.pem
```
```shell
scp -i $KEY_PATH org.omg.sysml.jupyter.kernel/target/jupyter-sysml-kernel-*.zip ubuntu@jupyter.hostname.com:~
scp -i $KEY_PATH org.omg.sysml.jupyter.jupyterlab/target/jupyterlab-sysml-*.tgz  ubuntu@jupyter.hostname.com:~
```

3. Connect to server via SSH and extract Jupyter assets.

```shell
ssh -i $KEY_PATH ubuntu@jupyter.hostname.com
```
```shell
export SYSML_VERSION=x.y.z
```
```shell
mkdir "jupyter-sysml-kernel-$SYSML_VERSION"
cd "jupyter-sysml-kernel-$SYSML_VERSION/"
unzip "../jupyter-sysml-kernel-$SYSML_VERSION.zip"
```

4. Install Jupyter kernel and JupyterLab extension ([ref](https://tljh.jupyter.org/en/latest/howto/env/user-environment.html)) on server.

```shell
sudo -i
```
```shell
export SYSML_VERSION=x.y.z
export API_BASE_PATH=http://sysml-v2-api.hostname.com:9000
export PATH=/opt/tljh/user/bin:${PATH}
```
```shell
cd "/home/ubuntu/jupyter-sysml-kernel-$SYSML_VERSION/"
jupyter kernelspec remove sysml -f; python install.py --sys-prefix "--api-base-path=$API_BASE_PATH" "--graphviz-path=$(command -v dot)"
jupyter labextension uninstall jupyterlab-sysml; jupyter labextension install "/home/ubuntu/jupyterlab-sysml-$SYSML_VERSION.tgz"
```
