/*
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
 * Copyright (C) 2025  Model Driven Solutions, Inc.
 * Copyright (C) 2025  Mgnite Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 */

import { JupyterFrontEndPlugin, JupyterFrontEnd} from '@jupyterlab/application';
import { IEditorLanguageRegistry, EditorLanguageRegistry,
         IEditorExtensionRegistry, EditorExtensionRegistry,
         IEditorExtensionFactory } from "@jupyterlab/codemirror";

import { sysmlparser } from './mode';
import { sysmlFoldServiceSelection } from './fold';

const plugin: JupyterFrontEndPlugin<void> = {
  id: 'jupyterlab-sysml:plugin',
  description: 'A JupyterLab extension adding a syntax highlight for SysMLv2 language.',
  autoStart: true,
  requires: [IEditorLanguageRegistry, IEditorExtensionRegistry],
  activate: (app: JupyterFrontEnd, languages: IEditorLanguageRegistry, ext: IEditorExtensionRegistry) => {

	languages.addLanguage({
		name: 'sysml',
		displayName: 'sysml',
		mime: 'text/x-sysml',
		extensions: ['sysml'],
		load: async () => {
			return EditorLanguageRegistry.legacy(sysmlparser)
		}
	})

    const sysmlFoldExtension = Object.freeze({
        name: 'sysml-fold-extension',
        default: true,
        factory: (options: IEditorExtensionFactory.IOptions) =>
        EditorExtensionRegistry.createConditionalExtension(sysmlFoldServiceSelection(options))

    });
    ext.addExtension(sysmlFoldExtension);
  }}

export default plugin;
