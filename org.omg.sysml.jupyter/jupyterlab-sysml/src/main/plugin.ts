import {
	JupyterLab,
	JupyterFrontEndPlugin,
} from '@jupyterlab/application';

import {
	defineSysMLv2Mode,
} from './mode';

function activate(app: JupyterLab) {
	defineSysMLv2Mode();
}

/**
 * Initialization data for extension
 */
const extension: JupyterFrontEndPlugin<void> = {
	activate,
	autoStart: true,
	id: 'jupyterlab-sysml:plugin',
};

export default extension;
