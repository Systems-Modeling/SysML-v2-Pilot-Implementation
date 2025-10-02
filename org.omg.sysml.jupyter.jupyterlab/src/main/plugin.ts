/*
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */

import { JupyterFrontEndPlugin, JupyterFrontEnd} from '@jupyterlab/application';
import { IEditorLanguageRegistry, EditorLanguageRegistry} from "@jupyterlab/codemirror";
import { sysmlparser } from './mode';

const plugin: JupyterFrontEndPlugin<void> = {
  id: 'jupyterlab-sysml:plugin',
  description: 'A JupyterLab extension adding a syntax highlight for SysMLv2 language.',
  autoStart: true,
  requires: [IEditorLanguageRegistry],
  activate: (app: JupyterFrontEnd, languages: IEditorLanguageRegistry) => {

	languages.addLanguage({
		name: 'sysml',
		displayName: 'sysml',
		mime: 'text/x-sysml',
		extensions: ['sysml'],
		load: async () => {
			return EditorLanguageRegistry.legacy(sysmlparser)
		}
	})
  }}

export default plugin;
