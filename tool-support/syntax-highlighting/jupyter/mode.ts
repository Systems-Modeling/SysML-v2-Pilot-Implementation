/*
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
 * Copyright (C) 2020-2021  Model Driven Solutions, Inc.
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
 *
 * ATTENTION: This file is auto-generated from the Xtext grammar definitions by script:
 *   $GIT_REPO_DIR/tool-support/syntax-highlighting/xtext_grammar_converter.py
 * Source code modifications should be applied to template file:
 *   $GIT_REPO_DIR/tool-support/syntax-highlighting/jupyter/mode_template.ts
 */

// tslint:disable-next-line
import 'codemirror/addon/mode/simple';

import * as CodeMirror from 'codemirror';

const SI_MODE = 'sysml';
const P_MIME = 'text/x-sysml'

const f_wordify = (h: any, s: string) => ({...h, [s]: true});

export function defineSysMLv2Mode(): void {
    CodeMirror.defineMode(SI_MODE, (gc_mode, gc_parser) => {
        return CodeMirror.getMode(gc_mode, {
            name: 'clike',
            keywords: [
                "about", "abstract", "accept", "action", "actor", "alias", "all", "allocate", "allocation", "analysis",
                "and", "as", "assert", "assoc", "assume", "attribute", "bind", "block", "by", "calc", "case", "comment",
                "concern", "connect", "connection", "constraint", "decide", "def", "default", "defined", "dependency",
                "do", "doc", "else", "end", "entry", "enum", "event", "exhibit", "exit", "expose", "feature", "filter",
                "first", "flow", "for", "fork", "frame", "from", "hastype", "id", "if", "implies", "import", "in",
                "include", "individual", "inout", "interface", "istype", "item", "join", "language", "merge", "message",
                "metadata", "nonunique", "not", "objective", "occurrence", "of", "or", "ordered", "out", "package",
                "parallel", "part", "perform", "port", "private", "protected", "public", "redefines", "ref", "render",
                "rendering", "rep", "require", "requirement", "return", "satisfy", "send", "snapshot", "specializes",
                "stakeholder", "state", "stream", "subject", "subsets", "succession", "then", "timeslice", "to",
                "transition", "use", "variant", "variation", "verification", "verify", "via", "view", "viewpoint", "xor"
            ].reduce(f_wordify, {}),
            defKeywords: [
                "action", "activity", "allocation", "analysis", "attribute", "block", "calc", "case", "comment",
                "concern", "connection", "constraint", "def", "doc", "enum", "id", "interface", "item", "link",
                "metadata", "objective", "occurrence", "package", "part", "port", "ref", "rendering", "rep",
                "requirement", "snapshot", "state", "subject", "timeslice", "transition", "type", "use", "value",
                "verification", "view", "viewpoint"
            ].reduce(f_wordify, {}),
            typeFirstDefinitions: true,
            atoms: ['true', 'false', 'null'].reduce(f_wordify),
            number: /^(?:0x[a-f\d_]+|0b[01_]+|(?:[\d_]+\.?\d*|\.\d+)(?:e[-+]?[\d_]+)?)(u|ll?|l|f)?/i,
            modeProps: {
                fold: ['brace'],
            },
            hooks: {
                "'": function(stream: CodeMirror.StringStream) {
                    let b_escaped = false;
                    let s_next;
                    while(s_next = stream.next()) {
                        if(s_next === "'" && !b_escaped) break;
                        b_escaped = !b_escaped && s_next === '\\';
                    }
                    return 'variable';
                },
                '/': function(stream: CodeMirror.StringStream) {
                    if(stream.match('/*', false)) stream.next();
                    return false;
                },
            },
        });
    });

    CodeMirror.defineMIME(P_MIME, SI_MODE);

    (CodeMirror as any).modeInfo.push({
        ext: ['sysml'],
        mime: P_MIME,
        mode: SI_MODE,
        name: 'sysml',
    });
}
