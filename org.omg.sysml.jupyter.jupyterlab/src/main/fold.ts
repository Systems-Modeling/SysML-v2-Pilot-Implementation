/*
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2025 Mgnite Inc.
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

import { IEditorExtensionFactory } from "@jupyterlab/codemirror";
import { EditorState, Extension } from '@codemirror/state';
import { foldService, syntaxTree } from '@codemirror/language';
import { SyntaxNode } from '@lezer/common';

function isInStringOrComment(state: EditorState, pos: number): boolean {
    const tree = syntaxTree(state);
    let node: SyntaxNode | null = tree.resolveInner(pos, 1);
    
    while (node) {
        const nodeType = node.type.name;
        // Check if we're in a string, comment, or other non-code context
        if (nodeType === 'String' || 
            nodeType === 'Comment' || 
            nodeType === 'BlockComment' ||
            nodeType === 'LineComment' ||
            nodeType.toLowerCase().includes('string') ||
            nodeType.toLowerCase().includes('comment')) {
            return true;
        }
        node = node.parent;
    }
    return false;
}

function findMatchingCloseBrace(state: EditorState, openPos: number): number | null {
    const docLength = state.doc.length;
    let nest = 1;
    let pos = openPos + 1;
    
    while (pos < docLength && nest > 0) {
        const char = state.sliceDoc(pos, pos + 1);
        
        // Skip if we're in a string or comment
        if (!isInStringOrComment(state, pos)) {
            if (char === '{') {
                nest++;
            } else if (char === '}') {
                nest--;
                if (nest === 0) {
                    return pos;
                }
            }
        }
        pos++;
    }
    
    return null;
}

function computeFoldRange(state: EditorState, lineStart: number, lineEnd: number) {
    const lineText = state.sliceDoc(lineStart, lineEnd);
    
    for (let i = 0; i < lineText.length; i++) {
        const char = lineText[i];
        if (char === '{') {
            const absolutePos = lineStart + i;
            
            // Check if this brace is in a string or comment
            if (isInStringOrComment(state, absolutePos)) {
                continue;
            }
            
            // Find the matching closing brace
            const closePos = findMatchingCloseBrace(state, absolutePos);
            if (closePos === null) {
                return null;
            }
            
            // Check if the fold spans multiple lines
            const openLine = state.doc.lineAt(absolutePos);
            const closeLine = state.doc.lineAt(closePos);
            
            if (openLine.number === closeLine.number) {
                /* Do not fold the same line */
                return null;
            }
            
            return { from: absolutePos, to: closePos };
        }
    }
    
    return null;
}

export function sysmlFoldServiceSelection(options: IEditorExtensionFactory.IOptions): Extension {
    if (options.model.mimeType === 'text/x-sysml') {
        return [ foldService.of(computeFoldRange) ];
    } else {
        return [];
    }
}
