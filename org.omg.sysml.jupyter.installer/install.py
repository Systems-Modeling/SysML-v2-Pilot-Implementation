import json
import os
import shutil
import sys
from jupyterlab.labapp import get_app_dir

if __name__ == '__main__':
    search = 'sysml.library'
    d = os.path.dirname(os.path.realpath(__file__))

    while d != '/' and search not in os.listdir(d):
        d = os.path.abspath(os.path.join(d, '..'))

    match = os.path.join(d, search)
    if not os.path.isdir(match):
        sys.exit(f'Could not find {search} directory.')

    kernel_name = 'jupyter-sysml-kernel'
    kernel_dir = os.path.join(os.path.dirname(os.path.realpath(__file__)), kernel_name)
    if not os.path.isdir(kernel_dir):
        sys.exit(f'{kernel_name} directory not found.')

    curr_dir = os.getcwd()
    lib_copy = os.path.join(kernel_dir, 'sysml', search)
    shutil.copytree(match, lib_copy)
    try:
        os.chdir(kernel_dir)
        exec(open(os.path.join(kernel_dir, 'install.py')).read())
    finally:
        os.chdir(curr_dir)
        shutil.rmtree(lib_copy)

    # Enable line numbers and code folding by default
    override_file = os.path.join(get_app_dir(), 'settings', 'overrides.json')
    settings = {
        '@jupyterlab/notebook-extension:tracker': {
            'codeCellConfig': {
                'lineNumbers': True,
                'codeFolding': True
            }
        }
    }
    os.makedirs(os.path.dirname(override_file), exist_ok=True)
    with open(override_file, 'w+') as f:
        f.write(json.dumps(settings))
