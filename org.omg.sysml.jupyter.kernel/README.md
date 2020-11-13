# ISysML

A [Jupyter](http://jupyter.org/) kernel for executing SysML v2 models. The kernel executes models via the new SysML textual language. Some of the additional commands should be supported as needed via a syntax similar to the IPython magics.

Built on top of [jupyter-jvm-basekernel](https://github.com/SpencerPark/jupyter-jvm-basekernel).

### Requirements

1.  [Java >= 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html). Java 11 is the latest LTS release and should be considered if selecting a version, but if a Java 8, 9, 10, or 12 build is installed everything _should_ still be working fine.

2.  Some Jupyter-like environment to use the kernel in.

    A non-exhaustive list of options:

    *   [Jupyter](http://jupyter.org/install)
    *   [JupyterLab](http://jupyterlab.readthedocs.io/en/stable/getting_started/installation.html)
    *   [nteract](https://nteract.io/desktop)
        
### Installing

After meeting the [requirements](#requirements), the kernel can be installed locally. Any time you wish to remove a kernel you may use `jupyter kernelspec remove sysml`. If you have installed the kernel to multiple directories, this command may need to be run multiple times as it might only remove 1 installation at a time.


#### (Coming Soon) Install pre-built binary

Get the latest _release_ of the software with no compilation needed. See [Install from source](#install-from-source) for building the latest commit.

**Note:** if you have an old installation or a debug one from running `gradlew installKernel` it is suggested that it is first removed via `jupyter kernelspec remove sysml`.

1.  Download the release from the [releases tab](.). A prepackaged distribution will be in an artifact named `isysml-$version.zip`.

2.  Unzip it into a temporary location. It should have at least the `install.py` and `sysml` folder extracted in there.

3.  Run the installer with the same python command used to install jupyter. The installer is a python script and has the same options as `jupyter kernelspec install` but additionally supports configuring some of the kernel properties mentioned further below in the README.

    ```bash
    # Pass the -h option to see the help page
    > python3 install.py -h

    # Otherwise a common install command is
    > python3 install.py --sys-prefix
    ```

4.  Check that it installed with `jupyter kernelspec list` which should contain `sysml`.

#### Install from source

Get the latest version of the kernel but possibly run into some issues with installing. This is also the route to take if you wish to contribute to the kernel.

On *nix `chmod u+x gradlew && ./gradlew installKernel`
    
On Windows `gradlew installKernel`

See all available options for configuring the install path with `gradlew -q help --task installKernel`. Pass the `--default`, `--user`, `--sys-prefix`, `--prefix`, `--path`, or `--legacy` options to change the install location. Also use the `--param` flag (repeatedly) to set (or add) parameter values with the parameter names (not environment variable) specified in the configuration section below. For example `--param classpath:/my/classpath/root` to append to the classpath list.

### Configuring

Configuring the kernel can be done via environment variables. These can be set on the system or inside the `kernel.json`. The configuration can be done at install time, which may be repeated as often as desired. The parameters are listed with `python3 install.py -h` as well as below in the list of options. Configuration done via the installer (or `gradlew installKernel --param ...:...`) should use the names in the _Parameter name_ column.

#### List of options

| Environment variable | Parameter name | Default | Description |
|----------------------|----------------|---------|-------------|
| `ISYSML_LIBRARY_PATH` | `library-path` | `""` | A file path separator delimited list of library path entries that should be available to the user code. **Important:** no matter what OS, this should use forward slash "/" as the file separator.
| `ISYSML_API_BASE_PATH` | `api-base-path` | `""` | The base path for the API that the model is published to using the %publish magic command.
| `ISYSML_GRAPHVIZ_PATH` | `graphviz-path` | `""` | The path to the Graphviz dot executable that is used for the %viz magic command.

#### Changing VM options

The kernel VM parameters must currently be assigned in the `kernel.json` by adding/editing a JSON dictionary at the `env` key and changing the `argv` list. To find where the kernel is installed run

```bash
> jupyter kernelspec list
Available kernels:
  sysml          .../kernels/sysml
  python3        .../kernels/python3
```

and the `kernel.json` file will be in the given directory.

For example to set the heap size to `128m`:

```diff
{
- "argv": [ "java", "-jar", "{connection_file}"],
+ "argv": [ "java", "-Xmx128m", "-jar", "{connection_file}"],
  "display_name": "SysML",
  "language": "sysml",
  "interrupt_mode": "message",
  "env": {
  }
}
```

### Run

This is where the documentation diverges as each environment has its own way of selecting a kernel. To test from command line with Jupyter's console application run:

```bash
jupyter console --kernel=sysml
```

Then at the prompt try:
```
In [1]: package test{}
```
